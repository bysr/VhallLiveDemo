package com.vhall.sdklib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.vhall.uilibs.R;

public class EmptyView extends RelativeLayout {
    private OnEmptyViewListener mOnEmptyViewListener;
    private TextView mEmptyTv;

    public EmptyView(Context context) {
        super(context);
    }

    public EmptyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mEmptyTv = (TextView) findViewById(R.id.empty_textview);
        mEmptyTv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mOnEmptyViewListener != null) {
                    mOnEmptyViewListener.onEmptyViewClick();
                }
            }
        });
    }

    public void setOnEmptyViewListener(OnEmptyViewListener listener) {
        this.mOnEmptyViewListener = listener;
    }


    public interface OnEmptyViewListener {
        void onEmptyViewClick();

    }


}
