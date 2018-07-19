package com.sdklibs.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdklibs.R;
import com.sdklibs.bean.VideoBean;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<VideoBean> list;


    public VideoAdapter(Context mContext, List<VideoBean> list) {
        this.mContext = mContext;
        this.list = list;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VideoHolder(mLayoutInflater.inflate(R.layout.item_video, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class VideoHolder extends RecyclerView.ViewHolder {


        public VideoHolder(View itemView) {
            super(itemView);

        }
    }


}
