package com.goldplusgold.widget.resizelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;


public class ResizeRelativeLayout extends RelativeLayout {

    private OnResizeListener mListener;

    public ResizeRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOnResizeListener(OnResizeListener listener) {
        mListener = listener;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mListener != null) {
            mListener.OnResize(w, h, oldw, oldh);
        }
    }

    public interface OnResizeListener {
        void OnResize(int w, int h, int oldw, int oldh);
    }
}
