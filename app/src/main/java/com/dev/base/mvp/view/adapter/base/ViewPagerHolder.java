package com.dev.base.mvp.view.adapter.base;

/**
 * Created by huanggx on 2018/5/27.
 */

import android.content.Context;
import android.view.View;



public interface ViewPagerHolder<T> {
    /**
     *  创建View
     * @param context
     * @return
     */
    View createView(Context context);

    /**
     * 绑定数据
     * @param context
     * @param position
     * @param data
     */
    void onBind(Context context,int position,T data);
}

