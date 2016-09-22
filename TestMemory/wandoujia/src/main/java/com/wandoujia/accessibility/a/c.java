package com.wandoujia.accessibility.a;

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
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.TextView;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;
import com.wandoujia.ripple_framework.accessibility.R.string;
import java.util.Locale;

public final class c
{
  private final int a;
  private final boolean b;
  private final int c;
  private final int d;
  private final boolean e;
  private final float f;

  private c(Activity paramActivity)
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

  public static void a(Context paramContext, View.OnClickListener paramOnClickListener)
  {
    View localView = android.support.v4.app.b.a(paramContext, R.layout.hibernation_guide_notification);
    String str = String.format(Locale.CHINA, paramContext.getResources().getString(R.string.hibernation_guide_notification), new Object[0]);
    ((TextView)localView.findViewById(R.id.text)).setText(str);
    localView.setOnClickListener(paramOnClickListener);
    a(paramContext, localView);
  }

  private static void a(Context paramContext, View paramView)
  {
    android.support.v4.app.b.a(paramContext, paramView, true, 81, -2, -2);
    paramView.postDelayed(new d(paramContext, paramView), 3000L);
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    View localView = android.support.v4.app.b.a(paramContext, R.layout.hibernation_toast_notification);
    String str = String.format(Locale.CHINA, paramContext.getResources().getString(R.string.hibernation_toast_notification), new Object[] { paramString1, paramString2 });
    ((TextView)localView.findViewById(R.id.text)).setText(str);
    a(paramContext, localView);
    v.b().a(new TaskEvent.Builder().action(TaskEvent.Action.TOAST).status(TaskEvent.Status.START).result(TaskEvent.Result.SUCCESS), new ExtraPackage.Builder().content_package(new ContentPackage.Builder().identity("ONEKEY_CLEAN").build()));
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
      if (!"1".equals(b.b()));
    }
    while (true)
    {
      return false;
      if (!"0".equals(b.b()))
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.a.c
 * JD-Core Version:    0.6.0
 */