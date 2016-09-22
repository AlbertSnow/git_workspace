package com.sina.weibo.sdk.component.view;

import android.content.Context;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.sina.weibo.sdk.a.g;

public class CommentComponentView extends FrameLayout
{
  private LinearLayout a;

  public CommentComponentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public CommentComponentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    this.a = new LinearLayout(paramContext);
    this.a.setOrientation(0);
    this.a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setImageDrawable(g.a(paramContext, "sdk_weibo_logo.png"));
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(g.a(getContext(), 20), g.a(getContext(), 20));
    localLayoutParams1.gravity = 16;
    localImageView.setLayoutParams(localLayoutParams1);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(g.a("Comment", "微博热评", "微博熱評"));
    localTextView.setTextColor(-32256);
    localTextView.setTextSize(2, 15.0F);
    localTextView.setIncludeFontPadding(false);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.gravity = 16;
    localLayoutParams2.leftMargin = g.a(getContext(), 4);
    localTextView.setLayoutParams(localLayoutParams2);
    this.a.addView(localImageView);
    this.a.addView(localTextView);
    addView(this.a);
    localTextView.setOnClickListener(new e(this));
  }

  public void setCommentParam$45b49d2f(b paramb)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.CommentComponentView
 * JD-Core Version:    0.6.0
 */