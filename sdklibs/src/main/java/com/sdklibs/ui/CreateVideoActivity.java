package com.sdklibs.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sdklibs.R;
import com.sdklibs.app.BaseActivity;

public class CreateVideoActivity extends BaseActivity {

    private LinearLayout llAddImg;
    private EditText tv_title, tv_content;
    private RadioGroup rg_screen, rg_camera;
    private RelativeLayout btn_start;
    private TextView tv_protocol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_video);
        initView();
        initEvent();
    }

    private void initView() {
        llAddImg = F(R.id.llAddImg);
        tv_title = F(R.id.tv_title);
        tv_content = F(R.id.tv_content);
        rg_camera = F(R.id.rg_camera);
        rg_screen = F(R.id.rg_screen);
        btn_start = F(R.id.re_start);
        tv_protocol = F(R.id.tv_protocol);


    }

    private void initEvent() {
        C(tv_protocol);
        C(llAddImg);
        C(btn_start);

    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_create_video;
    }

    @Override
    protected void processClick(View view) {

        if (view.getId() == R.id.llAddImg) {

        }

        if (view.getId() == R.id.re_start) {

        }

        if (view.getId() == R.id.tv_protocol) {

        }


    }
}
