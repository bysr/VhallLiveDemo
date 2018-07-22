package com.vhall.sdklib.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.githang.statusbar.StatusBarCompat;
import com.vhall.uilibs.R;


public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    protected Context mContext;
    //标题
    protected TextView nav_title;
    //返回
    protected RelativeLayout toolbar_left;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        /**标题栏颜色统一*/
        StatusBarCompat.setStatusBarColor(this, getResources().getColor(R.color.blueTitle));
        init();
    }

    protected void init() {


        toolbar_left = F(R.id.toolbar_left);
        toolbar_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    /**
     * 设置抽象布局。用于子类重写
     *
     * @return
     */
    protected abstract int getLayoutId();

    @Override
    public void onClick(View view) {
        processClick(view);
    }

    protected <E extends View> E F(@IdRes int viewId) {
        return (E) super.findViewById(viewId);
    }


    protected <E extends View> void C(@NonNull E view) {
        view.setOnClickListener(this);
    }

    /**
     * 点击事件处理
     *
     * @param view
     */
    protected abstract void processClick(View view);

    /**
     * 设置标题
     *
     * @param str
     */
    public void showTitle(String str) {
        nav_title = F(R.id.tv_toolbar_title);
        if (null == nav_title) {
            Toast.makeText(this, "当前界面找不到标题组件，请检查布局中是否存在此部件！",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        nav_title.setVisibility(View.VISIBLE);
        nav_title.setText("" + str);
    }


}
