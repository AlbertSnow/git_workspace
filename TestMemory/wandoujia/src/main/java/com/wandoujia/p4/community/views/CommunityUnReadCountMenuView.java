package com.wandoujia.p4.community.views;

import android.content.Context;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;

public class CommunityUnReadCountMenuView extends FrameLayout
{
  private TextView a;

  public CommunityUnReadCountMenuView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public CommunityUnReadCountMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CommunityUnReadCountMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static CommunityUnReadCountMenuView a(ViewGroup paramViewGroup)
  {
    return (CommunityUnReadCountMenuView)c.a(paramViewGroup, 2130903206);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131493498));
    b.a(new p(this), new Void[0]);
    setOnClickListener(new o(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityUnReadCountMenuView
 * JD-Core Version:    0.6.0
 */