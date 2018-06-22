package com.dev.base.mvp.view.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dev.base.R;
import com.dev.base.mvp.view.activity.base.BaseActivity;
import com.dev.base.mvp.view.widget.loadlayout.LoadLayout;
import com.dev.base.mvp.view.widget.loadlayout.State;

import butterknife.BindView;


public class WebViewActivity extends BaseActivity {

    @BindView(R.id.ll_wv)
    LinearLayout layout;

    WebView webView;

    @BindView(R.id.ll_base)
    LoadLayout mLoadLayout;//加载布局，可以显示各种状态的布局, 如加载中，加载成功, 加载失败, 无数据

    @Override
    protected int getContentLayout() {
        return R.layout.activity_webview;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mLoadLayout.setLoadingViewId(R.layout.layout_intro_loading_view);
        mLoadLayout.setLayoutState(State.LOADING);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        webView = new WebView(getApplicationContext());
        webView.setLayoutParams(params);
        layout.addView(webView);
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if (progress == 100) {
                    mLoadLayout.setLayoutState(State.SUCCESS);
                }
            }
        });
        webView.loadUrl("http://www.jintai5588.com");//连接
        webView.getSettings().setJavaScriptEnabled(true);//设置webView属性，运行JS脚本
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAppCacheMaxSize(1024 * 1024 * 8);
        String appCachePath = getApplicationContext().getCacheDir().getAbsolutePath();
        webView.getSettings().setAppCachePath(appCachePath);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAppCacheEnabled(true);


    }


    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void initEvent() {

    }

    private static long ExitTime = 0;


    /*
     * 我们需要重写回退按钮的事件，当用户点击回退按钮判断
     * 1、webView.canGoBack()判断网页是否能后退，可以则goback（）
     * 2、如果不可以，点击两次退出APP，弹出提示Toast
     */
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            if (System.currentTimeMillis() - ExitTime > 2000) {
                Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                ExitTime = System.currentTimeMillis();
            } else {
                //System.exit(0);
                super.onBackPressed();
            }
        }
    }

    @Override
    protected void onDestroy() {
        if (webView != null) {
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            webView.clearHistory();

            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.destroy();
            webView = null;
        }
        super.onDestroy();
    }
}



