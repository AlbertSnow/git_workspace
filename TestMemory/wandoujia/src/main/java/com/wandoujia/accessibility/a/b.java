package com.wandoujia.accessibility.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Method;

public final class b
{
  private static String a;
  private final c b;
  private boolean c;
  private boolean d;
  private boolean e;
  private View f;
  private View g;

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
  public b(Activity paramActivity)
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
        this.b = new c(paramActivity, 0);
        if (this.b.c())
          continue;
        this.d = false;
        if (!this.c)
          continue;
        this.f = new View(paramActivity);
        FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-1, this.b.b());
        localLayoutParams2.gravity = 48;
        if ((!this.d) || (this.b.a()))
          continue;
        localLayoutParams2.rightMargin = this.b.e();
        this.f.setLayoutParams(localLayoutParams2);
        this.f.setBackgroundColor(-1728053248);
        this.f.setVisibility(8);
        localViewGroup.addView(this.f);
        if (!this.d)
          continue;
        this.g = new View(paramActivity);
        if (this.b.a())
        {
          localLayoutParams1 = new FrameLayout.LayoutParams(-1, this.b.d());
          localLayoutParams1.gravity = 80;
          this.g.setLayoutParams(localLayoutParams1);
          this.g.setBackgroundColor(-1728053248);
          this.g.setVisibility(8);
          localViewGroup.addView(this.g);
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

  public final void a()
  {
    if (this.e == true);
    do
    {
      return;
      this.e = true;
    }
    while (!this.c);
    this.f.setVisibility(0);
  }

  public final void a(int paramInt)
  {
    if (this.c)
      this.f.setBackgroundResource(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.a.b
 * JD-Core Version:    0.6.0
 */