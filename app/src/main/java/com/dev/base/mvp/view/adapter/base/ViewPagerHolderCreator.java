package com.dev.base.mvp.view.adapter.base;

/**
 * Created by huanggx on 2018/5/27.
 */

public interface ViewPagerHolderCreator<VH extends ViewPagerHolder> {
    /**
     * 创建ViewHolder
     * @return
     */
    public VH createViewHolder();
}
