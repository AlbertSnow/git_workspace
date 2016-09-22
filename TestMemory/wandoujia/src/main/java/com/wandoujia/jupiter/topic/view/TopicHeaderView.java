package com.wandoujia.jupiter.topic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TopicHeaderView extends RelativeLayout
{
  public TextView a;
  public TextView b;
  public View c;
  public View d;
  public View e;
  public FrameLayout f;

  public TopicHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public TopicHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TopicHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131492998));
    this.b = ((TextView)findViewById(2131493413));
    this.c = findViewById(2131493527);
    this.d = findViewById(2131492889);
    this.e = findViewById(2131493758);
    findViewById(2131493174);
    this.f = ((FrameLayout)findViewById(2131493759));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.view.TopicHeaderView
 * JD-Core Version:    0.6.0
 */