package com.sina.weibo.sdk.api.share;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.bs;
import android.support.v4.view.ck;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.bool;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.integer;
import android.support.v7.appcompat.R.styleable;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class i
  implements ck
{
  private Context a;

  public i()
  {
  }

  private i(Context paramContext)
  {
    this.a = paramContext;
  }

  public static e a(Context paramContext, String paramString)
  {
    return new l(paramContext, paramString);
  }

  public static i a(Context paramContext)
  {
    return new i(paramContext);
  }

  public final int a()
  {
    return this.a.getResources().getInteger(R.integer.abc_max_action_buttons);
  }

  public void a(int paramInt)
  {
  }

  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void b(int paramInt)
  {
  }

  public final boolean b()
  {
    if (Build.VERSION.SDK_INT >= 19);
    do
      return true;
    while (!bs.b(ViewConfiguration.get(this.a)));
    return false;
  }

  public final int c()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public final boolean d()
  {
    if (this.a.getApplicationInfo().targetSdkVersion >= 16)
      return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs_pre_jb);
  }

  public final int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
    int i = localTypedArray.getLayoutDimension(R.styleable.ActionBar_height, 0);
    Resources localResources = this.a.getResources();
    if (!d())
      i = Math.min(i, localResources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
    localTypedArray.recycle();
    return i;
  }

  public final boolean f()
  {
    return this.a.getApplicationInfo().targetSdkVersion < 14;
  }

  public final int g()
  {
    return this.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.i
 * JD-Core Version:    0.6.0
 */