package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;

public class FetchMoreFooterView extends FrameLayout
{
  private View a;
  private ImageView b;
  private TextView c;
  private Drawable d;

  public FetchMoreFooterView(Context paramContext)
  {
    super(paramContext);
  }

  public FetchMoreFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FetchMoreFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static FetchMoreFooterView a(ViewGroup paramViewGroup)
  {
    return (FetchMoreFooterView)c.a(paramViewGroup, 2130903498);
  }

  public final void a()
  {
    this.a.setVisibility(0);
    this.b.setVisibility(8);
    this.b.setImageDrawable(null);
    this.c.setVisibility(8);
  }

  public final void b()
  {
    this.a.setVisibility(8);
    this.b.setVisibility(0);
    this.b.setBackgroundDrawable(this.d);
    this.c.setVisibility(8);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(2131493564);
    this.b = ((ImageView)findViewById(2131493934));
    this.c = ((TextView)findViewById(2131493935));
    this.d = getResources().getDrawable(2130838392);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.FetchMoreFooterView
 * JD-Core Version:    0.6.0
 */