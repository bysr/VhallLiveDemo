package com.vhall.sdklib.app;

import android.app.Application;

import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.interceptor.HttpLogInterceptor;

public class MyApplication extends Application {
    /**
     * 实现单例，任何一个页面都能拿到这个类的数据和对象
     */
    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initNet();
    }


    private void initNet() {

        ViseHttp.init(this);
        ViseHttp.CONFIG()
                //配置请求主机地址
                /*.baseUrl("")*/
                .setCookie(true)
                //配置日志拦截器
                .interceptor(new HttpLogInterceptor()
                        .setLevel(HttpLogInterceptor.Level.BODY));


    }

}
