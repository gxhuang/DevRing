package com.dev.base.mvp.view.adapter.base;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.dev.base.R;

import java.util.List;

import me.relex.circleindicator.CircleIndicator;

/**
 * Created by huanggx on 2018/5/27.
 */

public class CommonViewPager<T> extends RelativeLayout {
    private ViewPager mViewPager;
    private CommonViewPagerAdapter mAdapter;

    public CommonViewPager(@NonNull Context context) {
        super(context);
        init();
    }

    public CommonViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CommonViewPager(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CommonViewPager(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_base_view_page, this, true);
        mViewPager = view.findViewById(R.id.common_view_pager);



        //mCircleIndicatorView =  view.findViewById(R.id.common_view_pager_indicator_view);
    }

    /**
     * 设置数据
     *
     * @param data
     * @param creator
     */
    public void setPages(List<T> data, ViewPagerHolderCreator creator) {
        mAdapter = new CommonViewPagerAdapter(data, creator);
        mViewPager.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_base_view_page, this, true);
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        indicator.setViewPager(mViewPager);
        mViewPager.setPageTransformer(false, new ScaleTransformer());
    }

    public void setCurrentItem(int currentItem) {
        mViewPager.setCurrentItem(currentItem);
    }

    public int getCurrentItem() {
        return mViewPager.getCurrentItem();
    }

    public void setOffscreenPageLimit(int limit) {
        mViewPager.setOffscreenPageLimit(limit);
    }

    /**
     * 设置切换动画，see {@link ViewPager#setPageTransformer(boolean, ViewPager.PageTransformer)}
     *
     * @param reverseDrawingOrder
     * @param transformer
     */
    public void setPageTransformer(boolean reverseDrawingOrder, ViewPager.PageTransformer transformer) {
        mViewPager.setPageTransformer(reverseDrawingOrder, transformer);
    }

    /**
     * see {@link ViewPager#setPageTransformer(boolean, ViewPager.PageTransformer)}
     *
     * @param reverseDrawingOrder
     * @param transformer
     * @param pageLayerType
     */
    public void setPageTransformer(boolean reverseDrawingOrder, ViewPager.PageTransformer transformer,
                                   int pageLayerType) {
        mViewPager.setPageTransformer(reverseDrawingOrder, transformer, pageLayerType);
    }

    /**
     * see {@link ViewPager#addOnPageChangeListener(ViewPager.OnPageChangeListener)}
     *
     * @param listener
     */
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        mViewPager.addOnPageChangeListener(listener);
    }


    public ViewPager getViewPager() {
        return mViewPager;
    }
}

