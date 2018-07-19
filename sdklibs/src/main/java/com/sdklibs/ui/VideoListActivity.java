package com.sdklibs.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sdklibs.R;
import com.sdklibs.adapter.VideoAdapter;
import com.sdklibs.app.BaseActivity;
import com.sdklibs.bean.VideoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 视频列表页面
 */
public class VideoListActivity extends BaseActivity {
    private SmartRefreshLayout refreshLayout;
    private RecyclerView recyclerView;
    private ImageView fabImg;
    private VideoAdapter adapter;
    private List<VideoBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        iniEvent();
        initData();

    }

    public void initView() {
        recyclerView = F(R.id.recyclerView);
        refreshLayout = F(R.id.refreshLayout);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        refreshLayout.setPrimaryColorsId(R.color.colorPrimary, R.color.colorPrimaryDark);
        refreshLayout.setRefreshHeader(new MaterialHeader(this));
        fabImg = F(R.id.fabImg);
        list = new ArrayList<>();
        adapter = new VideoAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }


    private void initData() {

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {

                refreshLayout.finishRefresh(2000, false);

                for (int i = 0; i < 10; i++) {

                    VideoBean bean = new VideoBean();
                    list.add(bean);
                }
                adapter.notifyDataSetChanged();


            }
        });

        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

                refreshLayout.finishLoadMore(2000, true, true);
            }
        });


    }

    private void iniEvent() {
        C(fabImg);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_video_list;
    }

    @Override
    protected void processClick(View view) {


    }
}
