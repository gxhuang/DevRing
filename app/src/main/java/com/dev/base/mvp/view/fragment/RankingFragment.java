package com.dev.base.mvp.view.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dev.base.R;
import com.dev.base.di.component.fragment.DaggerMovieFragmentComponent;
import com.dev.base.di.module.fragment.MovieFragmentModule;
import com.dev.base.mvp.model.entity.res.MovieRes;
import com.dev.base.mvp.model.entity.res.Ranking;
import com.dev.base.mvp.presenter.MoviePresenter;
import com.dev.base.mvp.presenter.RankingPresenter;
import com.dev.base.mvp.view.adapter.MovieAdapter;
import com.dev.base.mvp.view.adapter.base.LoadMoreBaseAdapter;
import com.dev.base.mvp.view.adapter.base.OnLoadMoreScrollListener;
import com.dev.base.mvp.view.fragment.base.BaseFragment;
import com.dev.base.mvp.view.iview.IRankingView;
import com.dev.base.mvp.view.widget.MaterialDialog;
import com.dev.base.mvp.view.widget.loadlayout.LoadLayout;
import com.dev.base.mvp.view.widget.loadlayout.OnLoadListener;
import com.dev.base.mvp.view.widget.loadlayout.State;
import com.ljy.devring.util.CollectionUtil;
import com.ljy.devring.util.RingToast;

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

public class RankingFragment extends BaseFragment<RankingPresenter> implements IRankingView {

    @Override
    public void getRankingSuccess(List<Ranking> list) {

    }

    @Override
    public void getRankingFail(int status, String desc) {

    }

    @Override
    protected boolean isLazyLoad() {
        return false;
    }

    @Override
    protected int getContentLayout() {
        return R.layout.fragment_ranking;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}
