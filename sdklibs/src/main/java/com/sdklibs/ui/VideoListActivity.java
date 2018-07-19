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
import com.sdklibs.config.api.RetrofitService;
import com.sdklibs.net.mode.ApiResult;
import com.vise.log.ViseLog;
import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.callback.ACallback;
import com.vise.xsnow.http.core.ApiTransformer;
import com.vise.xsnow.http.subscriber.ApiCallbackSubscriber;

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
        showTitle("蓝信直播");
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

        ViseHttp.RETROFIT()
                .create(RetrofitService.class)
                .getVideolist(1, 1, list.size(), 10, 1)
                .compose(ApiTransformer.<ApiResult>norTransformer())
                .subscribe(new ApiCallbackSubscriber<>(new ACallback<ApiResult>() {
                    @Override
                    public void onSuccess(ApiResult data) {
                        //json解析数据
                        ViseLog.d(data.toString());


                    }

                    @Override
                    public void onFail(int errCode, String errMsg) {
                        ViseLog.d(errMsg);

                    }
                }));
    }

    private void iniEvent() {
        C(fabImg);
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


                adapter.showFoot();

                refreshLayout.finishLoadMore(2000, true, true);
            }
        });

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_video_list;
    }

    @Override
    protected void processClick(View view) {


    }
}
