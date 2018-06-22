package com.dev.base.mvp.model.entity.res;

import java.util.List;

/**
 * author:  ljy
 * date:    2017/9/27
 * description: 根据豆瓣返回的电影实体数据结构而定的实体
 */

public class Ranking {
  private String phone;
  private String caiName;
  private String mark;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCaiName() {
        return caiName;
    }

    public void setCaiName(String caiName) {
        this.caiName = caiName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
