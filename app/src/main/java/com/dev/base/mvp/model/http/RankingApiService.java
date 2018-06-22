package com.dev.base.mvp.model.http;

import com.dev.base.app.constant.UrlConstants;
import com.dev.base.mvp.model.entity.res.HttpResult;
import com.dev.base.mvp.model.entity.res.MovieRes;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * author:  ljy
 * date:    2017/9/14
 * description: retrofit的请求接口定义，用于豆瓣电影请求
 * <a>https://www.jianshu.com/p/092452f287db</a>
 */

public interface RankingApiService {

    @GET(UrlConstants.GET_PLAYING_MOVIE)
    Observable<HttpResult<List<MovieRes>>> getPlayingMovie(@Query("start") int start, @Query("count") int count);



}
