package com.dev.base.mvp.view.activity;

/**
 * Created by huanggx on 2018/5/27.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.base.R;
import com.dev.base.mvp.model.entity.res.DataEntry;
import com.dev.base.mvp.view.adapter.base.ViewPagerHolder;
import com.ljy.devring.DevRing;
import com.ljy.devring.image.support.LoadOption;

/**
 * 提供ViewPager展示的ViewHolder
 * <P>用于提供布局和绑定数据</P>
 */
public  class ViewImageHolder implements ViewPagerHolder <DataEntry>{
    private ImageView mImageView;
    private TextView mTextView;
    @Override
    public View createView(Context context) {
        // 返回ViewPager 页面展示的布局
        View view = LayoutInflater.from(context).inflate(R.layout.view_page_item,null);
        mImageView = (ImageView) view.findViewById(R.id.viewPager_item_image);
        mTextView = (TextView) view.findViewById(R.id.item_desc);
        return view;
    }

    @Override
    public void onBind(Context context, int position, DataEntry data) {
        // 数据绑定
        // 自己绑定数据，灵活度很大

       LoadOption loadOption=new LoadOption();
       loadOption.setRoundRadius(20);
        DevRing.imageManager().loadNet(data.getImageResId(), mImageView,loadOption);
        mTextView.setText(data.getDesc());
    }
}
