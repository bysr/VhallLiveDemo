package com.sdklibs.ui;

import android.os.Bundle;
import android.view.View;

import com.sdklibs.R;
import com.sdklibs.app.BaseActivity;

public class CreateVideoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_video);
        initView();
        initEvent();
    }

    private void initEvent() {

    }

    private void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_create_video;
    }

    @Override
    protected void processClick(View view) {

    }
}
