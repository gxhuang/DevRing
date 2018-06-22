package com.dev.base.mvp.presenter;

import com.dev.base.mvp.model.entity.res.HttpResult;
import com.dev.base.mvp.model.entity.res.MovieRes;
import com.dev.base.mvp.model.entity.res.Ranking;
import com.dev.base.mvp.model.entity.table.MovieCollect;
import com.dev.base.mvp.model.imodel.IMovieMoel;
import com.dev.base.mvp.model.imodel.IRankingModel;
import com.dev.base.mvp.presenter.base.BasePresenter;
import com.dev.base.mvp.view.iview.IMovieView;
import com.dev.base.mvp.view.iview.IRankingView;
import com.ljy.devring.DevRing;
import com.ljy.devring.http.support.observer.CommonObserver;
import com.ljy.devring.http.support.throwable.HttpThrowable;
import com.ljy.devring.other.RingLog;
import com.ljy.devring.util.RxLifecycleUtil;
import com.trello.rxlifecycle2.android.FragmentEvent;

import java.util.List;

/**
 * author:  ljy
 * date:    2017/9/27
 * description: 豆瓣电影页面的Presenter层
 */

public class RankingPresenter extends BasePresenter<IRankingView, IRankingModel> {
    public RankingPresenter(IRankingView iView, IRankingModel iModel) {
        super(iView, iModel);
    }

    public void getTopRanking() {
        DevRing.httpManager().commonRequest(mIModel.getTopRanking(), new CommonObserver<List<Ranking>>() {
            @Override
            public void onResult(List<Ranking> result) {
                RingLog.d("获取" + result.size() + "成功");
                if (mIView != null) {
                    mIView.getRankingSuccess(result);
                }
            }

            @Override
            public void onError(HttpThrowable throwable) {
                if (mIView != null) {
                    mIView.getRankingFail(throwable.errorType, throwable.message);
                }
            }
        }, RxLifecycleUtil.bindUntilEvent(mIView, FragmentEvent.DESTROY));
    }



}
