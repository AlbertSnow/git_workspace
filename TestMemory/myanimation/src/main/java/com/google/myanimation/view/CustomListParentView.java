package com.google.myanimation.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/11/3.
 */
public class CustomListParentView extends FrameLayout {
    private boolean mListBeyondBorder;
    private int listChildBottom;

    public CustomListParentView(Context context) {
        super(context);
        init();
    }

    public CustomListParentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomListParentView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        layoutChildren(left, top, right, bottom, false /* no force left gravity */);

        View hoverView = getHoverView();
        if (null == hoverView) {
            return;
        }

        if (mListBeyondBorder) {
            hoverView.layout(hoverView.getLeft(), getMeasuredHeight() - hoverView.getMeasuredHeight(), hoverView.getMeasuredWidth(), getMeasuredHeight());
        } else {
            hoverView.layout(hoverView.getLeft(), listChildBottom, hoverView.getMeasuredWidth(), listChildBottom + hoverView.getMeasuredHeight());
        }
    }

    void layoutChildren(int left, int top, int right, int bottom, boolean forceLeftGravity) {
        final int count = getChildCount();

        final int parentLeft = getPaddingLeft();
        final int parentRight = right - left - getPaddingRight();

        final int parentTop = getPaddingTop();
        final int parentBottom = bottom - top - getPaddingBottom();

        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            if (child.getVisibility() != GONE) {
                final LayoutParams lp = (LayoutParams) child.getLayoutParams();

                final int width = child.getMeasuredWidth();
                final int height = child.getMeasuredHeight();

                int childLeft;
                int childTop;

                int gravity = lp.gravity;
                if (gravity == -1) {
                    gravity = Gravity.TOP | Gravity.START;
                }

                final int layoutDirection = getLayoutDirection();
                final int absoluteGravity = Gravity.getAbsoluteGravity(gravity, layoutDirection);
                final int verticalGravity = gravity & Gravity.VERTICAL_GRAVITY_MASK;

                switch (absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
                    case Gravity.CENTER_HORIZONTAL:
                        childLeft = parentLeft + (parentRight - parentLeft - width) / 2 +
                                lp.leftMargin - lp.rightMargin;
                        break;
                    case Gravity.RIGHT:
                        if (!forceLeftGravity) {
                            childLeft = parentRight - width - lp.rightMargin;
                            break;
                        }
                    case Gravity.LEFT:
                    default:
                        childLeft = parentLeft + lp.leftMargin;
                }

                switch (verticalGravity) {
                    case Gravity.TOP:
                        childTop = parentTop + lp.topMargin;
                        break;
                    case Gravity.CENTER_VERTICAL:
                        childTop = parentTop + (parentBottom - parentTop - height) / 2 +
                                lp.topMargin - lp.bottomMargin;
                        break;
                    case Gravity.BOTTOM:
                        childTop = parentBottom - height - lp.bottomMargin;
                        break;
                    default:
                        childTop = parentTop + lp.topMargin;
                }

                int childBottom = childTop + height;
                if (child instanceof  RecyclerView) {
                    if (height + getHoverView().getMeasuredHeight() > getMeasuredHeight()) {
                        childBottom = getMeasuredHeight() - getHoverView().getMeasuredHeight();
                        mListBeyondBorder = true;
                    } else {
                        mListBeyondBorder = false;
                    }
                    listChildBottom = childBottom;
                }

                child.layout(childLeft, childTop, childLeft + width, childBottom);
            }
        }
    }

    public View getHoverView() {
        return getChildAt(1);
    }
}
