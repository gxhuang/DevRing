package com.dev.base.mvp.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.dev.base.mvp.model.entity.res.Ranking;

import java.util.List;

/**
 * author:  ljy
 * date:    2017/9/28
 * description: 正在上映/即将上映列表的适配器
 */

public class RankingAdapter extends ArrayAdapter<Ranking> {
    public RankingAdapter(@NonNull Context context, int resource, @NonNull List<Ranking> objects) {
        super(context, resource, objects);



    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


return null;

    }
}
