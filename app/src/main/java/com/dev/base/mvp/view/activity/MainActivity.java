package com.dev.base.mvp.view.activity;

import android.os.Bundle;

import com.dev.base.R;
import com.dev.base.mvp.model.entity.res.DataEntry;
import com.dev.base.mvp.view.activity.base.BaseActivity;
import com.dev.base.mvp.view.adapter.base.CommonViewPager;
import com.dev.base.mvp.view.adapter.base.ViewPagerHolderCreator;
import com.dev.base.mvp.view.fragment.BannerFragment;
import com.dev.base.mvp.view.fragment.HotListFragment;
import com.dev.base.mvp.view.fragment.MovieFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;

/**
 * author:  ljy
 * date:    2017/9/27
 * descrition: 电影浏览页面（正在上映与即将上映）
 */

public class MainActivity extends BaseActivity {
    BannerFragment bannerFragment=new BannerFragment();
    HotListFragment hotListFragment=new HotListFragment();

    @Override
    protected int getContentLayout() {
        return R.layout.activity_main;
    }


    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void initEvent() {

    }


    protected void initView(Bundle savedInstanceState) {

        if (!bannerFragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_banner, bannerFragment, "banner").commit();

        }
        if(!hotListFragment.isAdded()){

            getSupportFragmentManager().beginTransaction().add(R.id.fl_hot, hotListFragment, "hot").commit();
        }


    }




}



