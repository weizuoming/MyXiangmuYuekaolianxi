package com.example.hello.myxiangmuyuekaolianxi.presenter.inter;


import com.example.hello.myxiangmuyuekaolianxi.model.bean.FenLeiBean;
import com.example.hello.myxiangmuyuekaolianxi.model.bean.HomeBean;

/**
 * Created by 韦作铭 on 2018/3/29.
 */
public interface FragmentHomePInter {
    //首页的数据
    void onSuccess(HomeBean homeBean);
    //分类
    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}
