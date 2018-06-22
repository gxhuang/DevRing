package com.dev.base.mvp.view.iview;

import com.dev.base.mvp.model.entity.res.MovieRes;
import com.dev.base.mvp.model.entity.res.Ranking;
import com.dev.base.mvp.view.iview.base.IBaseView;

import java.util.List;

/**
 * author:  ljy
 * date:    2017/9/27
 * description:
 */

public interface IRankingView extends IBaseView {
    void getRankingSuccess(List<Ranking> list);

    void getRankingFail(int status, String desc);

}
