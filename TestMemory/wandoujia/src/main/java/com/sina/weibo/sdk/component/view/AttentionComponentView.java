package com.sina.weibo.sdk.component.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AttentionComponentView extends FrameLayout
{
  private static final String a = AttentionComponentView.class.getName();
  private volatile boolean b = false;
  private FrameLayout c;
  private TextView d;
  private ProgressBar e;

  public AttentionComponentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public AttentionComponentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    StateListDrawable localStateListDrawable = com.sina.weibo.sdk.a.g.a(paramContext, "common_button_white.9.png", "common_button_white_highlighted.9.png");
    this.c = new FrameLayout(paramContext);
    this.c.setBackgroundDrawable(localStateListDrawable);
    int i = com.sina.weibo.sdk.a.g.a(getContext(), 6);
    int j = com.sina.weibo.sdk.a.g.a(getContext(), 2);
    int k = com.sina.weibo.sdk.a.g.a(getContext(), 6);
    this.c.setPadding(0, i, j, k);
    this.c.setLayoutParams(new FrameLayout.LayoutParams(com.sina.weibo.sdk.a.g.a(getContext(), 66), -2));
    addView(this.c);
    this.d = new TextView(getContext());
    this.d.setIncludeFontPadding(false);
    this.d.setSingleLine(true);
    this.d.setTextSize(2, 13.0F);
    FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams1.gravity = 17;
    this.d.setLayoutParams(localLayoutParams1);
    this.c.addView(this.d);
    this.e = new ProgressBar(getContext(), null, 16842873);
    this.e.setVisibility(8);
    FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams2.gravity = 17;
    this.e.setLayoutParams(localLayoutParams2);
    this.c.addView(this.e);
    this.c.setOnClickListener(new a(this));
    a(false);
  }

  private void a(boolean paramBoolean)
  {
    this.c.setEnabled(true);
    this.d.setVisibility(0);
    this.e.setVisibility(8);
    if (paramBoolean)
    {
      TextView localTextView2 = this.d;
      getContext();
      localTextView2.setText(com.sina.weibo.sdk.a.g.a("Following", "已关注", "已關注"));
      this.d.setTextColor(-13421773);
      Drawable localDrawable2 = com.sina.weibo.sdk.a.g.a(getContext(), "timeline_relationship_icon_attention.png");
      this.d.setCompoundDrawablesWithIntrinsicBounds(localDrawable2, null, null, null);
      this.c.setEnabled(false);
      return;
    }
    TextView localTextView1 = this.d;
    getContext();
    localTextView1.setText(com.sina.weibo.sdk.a.g.a("Follow", "关注", "關注"));
    this.d.setTextColor(-32256);
    Drawable localDrawable1 = com.sina.weibo.sdk.a.g.a(getContext(), "timeline_relationship_icon_addattention.png");
    this.d.setCompoundDrawablesWithIntrinsicBounds(localDrawable1, null, null, null);
    this.c.setEnabled(true);
  }

  public void setAttentionParam$37a7b272(b paramb)
  {
    if (!TextUtils.isEmpty(null));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (!this.b))
      {
        this.b = true;
        this.c.setEnabled(false);
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        com.sina.weibo.sdk.net.g localg = new com.sina.weibo.sdk.net.g(null);
        localg.a("access_token", null);
        localg.a("target_id", null);
        localg.a("target_screen_name", null);
        Context localContext = getContext();
        b localb = new b(this);
        new com.sina.weibo.sdk.net.a(localContext.getApplicationContext()).a("https://api.weibo.com/2/friendships/show.json", localg, "GET", localb);
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.AttentionComponentView
 * JD-Core Version:    0.6.0
 */