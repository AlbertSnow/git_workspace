package com.wandoujia.ripple_framework.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.wandoujia.ripple_framework.R.color;

public class LoadingView extends ImageView
{
  private j a;

  public LoadingView(Context paramContext)
  {
    super(paramContext);
    f();
  }

  public LoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    f();
  }

  public LoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f();
  }

  @TargetApi(21)
  public LoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    f();
  }

  private void f()
  {
    this.a = new j(getContext(), this);
    this.a.a(getResources().getColor(R.color.transparent));
    this.a.a();
    setImageDrawable(this.a);
    this.a.setAlpha(255);
  }

  public final void a()
  {
    setVisibility(0);
    c();
  }

  public final void b()
  {
    setVisibility(8);
    this.a.stop();
  }

  public final void c()
  {
    if (!this.a.isRunning())
      this.a.start();
  }

  public final void d()
  {
    this.a.stop();
  }

  public final void e()
  {
    this.a.a(new int[] { -1 });
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.LoadingView
 * JD-Core Version:    0.6.0
 */