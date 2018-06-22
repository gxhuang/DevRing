package com.dev.base.mvp.view.fragment;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.base.R;
import com.dev.base.mvp.model.entity.res.DataEntry;
import com.dev.base.mvp.view.activity.ViewImageHolder;
import com.dev.base.mvp.view.adapter.base.CommonViewPager;
import com.dev.base.mvp.view.adapter.base.ViewPagerHolderCreator;
import com.dev.base.mvp.view.fragment.base.BaseFragment;
import com.ljy.devring.DevRing;
import com.ljy.devring.image.support.LoadOption;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * author:  ljy
 * date:    2017/9/27
 * description:
 */

public class HotListFragment extends BaseFragment{
    @BindView(R.id.icon_cai)
    ImageView imageView;
    @BindView(R.id.icon_cai2)
    ImageView imageView2;
    @BindView(R.id.icon_cai3)
    ImageView imageView3;
    @BindView(R.id.icon_cai4)
    ImageView imageView4;
    @BindView(R.id.icon_cai5)
    ImageView imageView5;
    @BindView(R.id.icon_cai6)
    ImageView imageView6;
    @BindView(R.id.icon_cai7)
    ImageView imageView7;
    @BindView(R.id.icon_cai8)
    ImageView imageView8;


    @BindView(R.id.icon_yuan)
    TextView yuan;

    @Override
    protected boolean isLazyLoad() {
        return false;
    }

    @Override
    protected int getContentLayout() {
        return R.layout.fragment_hot_list;
    }

    @Override
    protected void initView() {

        LoadOption loadOption=new LoadOption();
        loadOption.setIsCircle(true);
        DevRing.imageManager().loadNet("http://img.anzow.com/Software/files_images/2014109/2014100975059721.jpg", imageView,loadOption);

        DevRing.imageManager().loadNet("http://pic1.win4000.com/wallpaper/2/579ee3493bc06.jpg", imageView2,loadOption);
        DevRing.imageManager().loadNet("http://img.anzow.com/Software/files_images/2014109/2014100975059721.jpg", imageView3,loadOption);

        DevRing.imageManager().loadNet("http://pic1.win4000.com/wallpaper/2/579ee3493bc06.jpg", imageView4,loadOption);
        DevRing.imageManager().loadNet("http://img.anzow.com/Software/files_images/2014109/2014100975059721.jpg", imageView5,loadOption);

        DevRing.imageManager().loadNet("http://pic1.win4000.com/wallpaper/2/579ee3493bc06.jpg", imageView6,loadOption);
        DevRing.imageManager().loadNet("http://img.anzow.com/Software/files_images/2014109/2014100975059721.jpg", imageView7,loadOption);

        DevRing.imageManager().loadNet("http://pic1.win4000.com/wallpaper/2/579ee3493bc06.jpg", imageView8,loadOption);

        Typeface iconfont = Typeface.createFromAsset(this.getActivity().getAssets(),
                "fonts/iconfont.ttf");
        yuan.setTypeface(iconfont);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }




}
