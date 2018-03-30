package com.example.hello.myxiangmuyuekaolianxi.view.Iview;


import com.example.hello.myxiangmuyuekaolianxi.model.bean.FenLeiBean;
import com.example.hello.myxiangmuyuekaolianxi.model.bean.HomeBean;

/**
 * Created by 韦作铭 on 2018/3/29.
 */
public interface InterFragmentHome {
    void onSuccess(HomeBean homeBean);

    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}
