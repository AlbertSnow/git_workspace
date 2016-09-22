package com.wandoujia.game_launcher.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.wandoujia.game_launcher.lib.R.color;

public class LoadingView extends ImageView
{
  private l a;

  public LoadingView(Context paramContext)
  {
    super(paramContext);
    c();
  }

  public LoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }

  public LoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }

  @TargetApi(21)
  public LoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    c();
  }

  private void c()
  {
    this.a = new l(getContext(), this);
    this.a.a(getResources().getColor(R.color.transparent));
    this.a.a();
    setImageDrawable(this.a);
    this.a.setAlpha(255);
  }

  public final void a()
  {
    if (!this.a.isRunning())
      this.a.start();
  }

  public final void b()
  {
    this.a.stop();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.LoadingView
 * JD-Core Version:    0.6.0
 */