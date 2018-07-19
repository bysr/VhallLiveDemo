package com.sdklibs.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sdklibs.R;
import com.sdklibs.bean.VideoBean;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<VideoBean> list;
    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    //默认不显示底部foot
    private boolean foot = false;


    public void showFoot() {
        this.foot = true;
        notifyItemChanged(list.size());
    }

    public void HideFoot() {
        this.foot = false;
    }


    public VideoAdapter(Context mContext, List<VideoBean> list) {
        this.mContext = mContext;
        this.list = list;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        if (viewType == TYPE_ITEM) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_video, parent,
                    false);
            return new VideoHolder(view);
        } else if (viewType == TYPE_FOOTER) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_foot, parent,
                    false);
            return new FootViewHolder(view);
        }

        return new VideoHolder(mLayoutInflater.inflate(R.layout.item_video, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof VideoHolder) {
            VideoBean bean = list.get(position);
            Glide.with(mContext).load(bean.getHeadImg()).placeholder(R.drawable.audio_close).error(R.drawable.icon_default_avatar).into(((VideoHolder) holder).ivHead);
        }


        if (holder instanceof FootViewHolder) {
            if (foot)
                ((FootViewHolder) holder).itemView.setVisibility(View.VISIBLE);
            else ((FootViewHolder) holder).itemView.setVisibility(View.GONE);
        }

    }


    @Override
    public int getItemViewType(int position) {
        if (position < list.size()) {
            return TYPE_ITEM;
        } else {
            return TYPE_FOOTER;
        }
    }


    @Override
    public int getItemCount() {
        return list.size() == 0 ? 0 : list.size() + 1;
    }

    class VideoHolder extends RecyclerView.ViewHolder {

        private ImageView ivHead;
        private TextView tvName;
        private TextView tvJob;
        private TextView tvTime;
        private TextView tvSeat;
        private TextView tvContent;
        private RelativeLayout rlVideoImg;
        private RelativeLayout rlLive;
        private TextView tvLive;
        private TextView tvWatchNum;
        private TextView tvVideoTime;


        public VideoHolder(View itemView) {
            super(itemView);

            ivHead = itemView.findViewById(R.id.ivHead);
            tvName = itemView.findViewById(R.id.tvName);
            tvJob = itemView.findViewById(R.id.tvJob);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvSeat = itemView.findViewById(R.id.tvSeat);
            tvContent = itemView.findViewById(R.id.tvContent);
            rlVideoImg = itemView.findViewById(R.id.rlVideoImg);
            rlLive = itemView.findViewById(R.id.rlLive);
            tvLive = itemView.findViewById(R.id.tvLive);
            tvWatchNum = itemView.findViewById(R.id.tvWatchNum);
            tvVideoTime = itemView.findViewById(R.id.tvVideoTime);

        }
    }

    public class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);


        }
    }


}
