package com.wandoujia.launcher_base.view.stateful.view;

import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public abstract interface StatefulView
{
  public abstract void a(String paramString1, String paramString2);

  public abstract StatefulView.State getState();

  public abstract void setClickListener(View.OnClickListener paramOnClickListener);

  public abstract void setLongClickListener(View.OnLongClickListener paramOnLongClickListener);

  public abstract void setProgress(int paramInt);

  public abstract void setState(StatefulView.State paramState);

  public abstract void setTitle(String paramString);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.view.StatefulView
 * JD-Core Version:    0.6.0
 */