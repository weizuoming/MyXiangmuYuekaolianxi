package com.example.hello.myxiangmuyuekaolianxi.presenter.inter;

import okhttp3.ResponseBody;

/**
 * Created by 韦作铭 on 2018/3/19.
 */

public interface PresenterPort {
    void getReView(ResponseBody responseBody);
    void getError(Throwable throwable);
}
