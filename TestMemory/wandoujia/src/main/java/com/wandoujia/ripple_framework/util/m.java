package com.wandoujia.ripple_framework.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Method;

public final class m
{
  private static String a;
  private final p b;
  private boolean c;
  private boolean d;
  private boolean e;
  private int f = 0;
  private View g;
  private View h;

  static
  {
    if (Build.VERSION.SDK_INT >= 19);
    try
    {
      Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      localMethod.setAccessible(true);
      a = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
      return;
    }
    catch (Throwable localThrowable)
    {
      a = null;
    }
  }

  @TargetApi(19)
  public m(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    ViewGroup localViewGroup = (ViewGroup)localWindow.getDecorView();
    TypedArray localTypedArray;
    if (Build.VERSION.SDK_INT >= 19)
      localTypedArray = paramActivity.obtainStyledAttributes(new int[] { 16843759, 16843760 });
    while (true)
    {
      try
      {
        this.c = localTypedArray.getBoolean(0, false);
        this.d = localTypedArray.getBoolean(1, false);
        localTypedArray.recycle();
        WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
        if ((0x4000000 & localLayoutParams.flags) == 0)
          continue;
        this.c = true;
        if ((0x8000000 & localLayoutParams.flags) == 0)
          continue;
        this.d = true;
        this.b = new p(paramActivity, 0);
        if (this.b.c())
          continue;
        this.d = false;
        if (!this.c)
          continue;
        this.g = new View(paramActivity);
        FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-1, this.b.b());
        localLayoutParams2.gravity = 48;
        if ((!this.d) || (this.b.a()))
          continue;
        localLayoutParams2.rightMargin = this.b.e();
        this.g.setLayoutParams(localLayoutParams2);
        this.g.setBackgroundColor(-1728053248);
        this.g.setVisibility(8);
        localViewGroup.addView(this.g);
        if (!this.d)
          continue;
        this.h = new View(paramActivity);
        if (this.b.a())
        {
          localLayoutParams1 = new FrameLayout.LayoutParams(-1, this.b.d());
          localLayoutParams1.gravity = 80;
          this.h.setLayoutParams(localLayoutParams1);
          this.h.setBackgroundColor(-1728053248);
          this.h.setVisibility(8);
          localViewGroup.addView(this.h);
          return;
        }
      }
      finally
      {
        localTypedArray.recycle();
      }
      FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(this.b.e(), -1);
      localLayoutParams1.gravity = 5;
    }
  }

  public final p a()
  {
    return this.b;
  }

  public final void a(int paramInt)
  {
    if (this.c)
    {
      this.f = paramInt;
      this.g.setBackgroundColor(this.f);
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e == paramBoolean1);
    do
    {
      return;
      this.e = paramBoolean1;
    }
    while (!this.c);
    if (!paramBoolean2)
    {
      View localView = this.g;
      int i = 0;
      if (paramBoolean1);
      while (true)
      {
        localView.setVisibility(i);
        return;
        i = 8;
      }
    }
    if (paramBoolean1)
    {
      this.g.setVisibility(0);
      this.g.setAlpha(0.0F);
      this.g.animate().alpha(1.0F).setDuration(200L).setListener(new n()).start();
      return;
    }
    this.g.setAlpha(1.0F);
    this.g.animate().alpha(0.0F).setDuration(200L).setListener(new o(this)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.m
 * JD-Core Version:    0.6.0
 */