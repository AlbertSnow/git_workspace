package com.wandoujia.phoenix2.videoplayer;

import android.widget.SeekBar.OnSeekBarChangeListener;
import com.wandoujia.mvc.BaseView;

public abstract interface x extends BaseView
{
  public abstract boolean b();

  public abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract void setBufferPercent(int paramInt);

  public abstract void setCanDragSeekBar(boolean paramBoolean);

  public abstract void setCanPlay(boolean paramBoolean);

  public abstract void setCurrentPlayPercent(int paramInt);

  public abstract void setCurrentTime(int paramInt);

  public abstract void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener);

  public abstract void setPlayerExitListener(m paramm);

  public abstract void setTotalTime(int paramInt);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.x
 * JD-Core Version:    0.6.0
 */