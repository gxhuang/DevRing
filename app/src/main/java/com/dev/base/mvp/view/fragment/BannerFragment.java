package com.dev.base.mvp.view.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dev.base.R;
import com.dev.base.di.component.fragment.DaggerMovieFragmentComponent;
import com.dev.base.di.module.fragment.MovieFragmentModule;
import com.dev.base.mvp.model.entity.res.DataEntry;
import com.dev.base.mvp.model.entity.res.MovieRes;
import com.dev.base.mvp.presenter.MoviePresenter;
import com.dev.base.mvp.view.activity.ViewImageHolder;
import com.dev.base.mvp.view.adapter.MovieAdapter;
import com.dev.base.mvp.view.adapter.base.CommonViewPager;
import com.dev.base.mvp.view.adapter.base.LoadMoreBaseAdapter;
import com.dev.base.mvp.view.adapter.base.OnLoadMoreScrollListener;
import com.dev.base.mvp.view.adapter.base.ViewPagerHolderCreator;
import com.dev.base.mvp.view.fragment.base.BaseFragment;
import com.dev.base.mvp.view.iview.IMovieView;
import com.dev.base.mvp.view.widget.MaterialDialog;
import com.dev.base.mvp.view.widget.loadlayout.LoadLayout;
import com.dev.base.mvp.view.widget.loadlayout.OnLoadListener;
import com.dev.base.mvp.view.widget.loadlayout.State;
import com.ljy.devring.util.CollectionUtil;
import com.ljy.devring.util.RingToast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindColor;
import butterknife.BindView;
import dagger.Lazy;

/**
 * author:  ljy
 * date:    2017/9/27
 * description:
 */

public class BannerFragment extends BaseFragment{
    @BindView(R.id.activity_common_view_pager)
    CommonViewPager mCommonViewPager;

    @Override
    protected boolean isLazyLoad() {
        return false;
    }

    @Override
    protected int getContentLayout() {
        return R.layout.fragment_banner;
    }

    @Override
    protected void initView() {
        // 设置数据
        mCommonViewPager.setPages(mockData(), new ViewPagerHolderCreator<ViewImageHolder>() {
            @Override
            public ViewImageHolder createViewHolder() {
                // 返回ViewPagerHolder
                return new ViewImageHolder();
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    private List<DataEntry> mockData() {
        List<DataEntry> list = new ArrayList<DataEntry>();
        DataEntry dataEntry = new DataEntry();
        dataEntry.setImageResId("http://a4.topitme.com/o/201101/29/12962866459127.jpg");
        dataEntry.setDesc("1111");
        list.add(dataEntry);

        DataEntry dataEntry2 = new DataEntry();
        dataEntry2.setImageResId("http://mpic.tiankong.com/317/845/3178452cc2110abe2a04ff7d7858bc33/640.jpg@!670w");
        dataEntry2.setDesc("2222");
        list.add(dataEntry2);

        return list;

    }


}
