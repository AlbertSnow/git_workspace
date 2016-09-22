package com.wandoujia.jupiter.imageviewer.views;

import android.view.MotionEvent;
import com.wandoujia.base.config.GlobalConfig;

public class f
{
  protected MotionEvent a;

  protected f(MotionEvent paramMotionEvent)
  {
    this.a = paramMotionEvent;
  }

  public static f a(MotionEvent paramMotionEvent)
  {
    try
    {
      a locala = new a(paramMotionEvent);
      return locala;
    }
    catch (VerifyError localVerifyError)
    {
    }
    return new f(paramMotionEvent);
  }

  private static void c(int paramInt)
  {
    if ((paramInt > 0) && (GlobalConfig.isDebug()))
      throw new IllegalArgumentException("Invalid pointer index for Donut/Cupcake");
  }

  public float a(int paramInt)
  {
    c(paramInt);
    return this.a.getX();
  }

  public final int a()
  {
    return this.a.getAction();
  }

  public final float b()
  {
    return this.a.getX();
  }

  public float b(int paramInt)
  {
    c(paramInt);
    return this.a.getY();
  }

  public final float c()
  {
    return this.a.getY();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.f
 * JD-Core Version:    0.6.0
 */