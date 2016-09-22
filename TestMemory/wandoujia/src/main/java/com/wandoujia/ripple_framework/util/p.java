package com.wandoujia.ripple_framework.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;

public final class p
{
  private final int a;
  private final boolean b;
  private final int c;
  private final int d;
  private final boolean e;
  private final float f;

  private p(Activity paramActivity)
  {
    Resources localResources1 = paramActivity.getResources();
    DisplayMetrics localDisplayMetrics;
    label62: String str;
    label181: int n;
    label190: int i1;
    if (localResources1.getConfiguration().orientation == i)
    {
      int k = i;
      this.e = k;
      localDisplayMetrics = new DisplayMetrics();
      if (Build.VERSION.SDK_INT < 16)
        break label251;
      paramActivity.getWindowManager().getDefaultDisplay().getRealMetrics(localDisplayMetrics);
      this.f = Math.min(localDisplayMetrics.widthPixels / localDisplayMetrics.density, localDisplayMetrics.heightPixels / localDisplayMetrics.density);
      this.a = a(localResources1, "status_bar_height");
      if (Build.VERSION.SDK_INT >= 14)
      {
        TypedValue localTypedValue = new TypedValue();
        paramActivity.getTheme().resolveAttribute(16843499, localTypedValue, i);
        TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
      }
      Resources localResources2 = paramActivity.getResources();
      if ((Build.VERSION.SDK_INT < 14) || (!a(paramActivity)))
        break label275;
      if (!this.e)
        break label268;
      str = "navigation_bar_height";
      n = a(localResources2, str);
      this.c = n;
      Resources localResources3 = paramActivity.getResources();
      if ((Build.VERSION.SDK_INT < 14) || (!a(paramActivity)))
        break label281;
      i1 = a(localResources3, "navigation_bar_width");
      label226: this.d = i1;
      if (this.c <= 0)
        break label287;
    }
    while (true)
    {
      this.b = i;
      return;
      int m = 0;
      break;
      label251: paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      break label62;
      label268: str = "navigation_bar_height_landscape";
      break label181;
      label275: n = 0;
      break label190;
      label281: i1 = 0;
      break label226;
      label287: int j = 0;
    }
  }

  private static int a(Resources paramResources, String paramString)
  {
    int i = paramResources.getIdentifier(paramString, "dimen", "android");
    int j = 0;
    if (i > 0)
      j = paramResources.getDimensionPixelSize(i);
    return j;
  }

  @TargetApi(14)
  private static boolean a(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
    boolean bool;
    if (i != 0)
    {
      bool = localResources.getBoolean(i);
      if (!"1".equals(m.b()));
    }
    while (true)
    {
      return false;
      if (!"0".equals(m.b()))
        break;
      return true;
      if (!ViewConfiguration.get(paramContext).hasPermanentMenuKey())
        return true;
    }
    return bool;
  }

  public final boolean a()
  {
    return (this.f >= 600.0F) || (this.e);
  }

  public final int b()
  {
    return this.a;
  }

  public final boolean c()
  {
    return this.b;
  }

  public final int d()
  {
    return this.c;
  }

  public final int e()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.p
 * JD-Core Version:    0.6.0
 */