package com.wandoujia.jupiter.homepage.splashwindow;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.WindowManager;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

public final class k
{
  private static int a;
  private static boolean b;
  private static boolean c;
  private static int d;
  private static int e;
  private static boolean f;
  private static Model g;
  private static int h;
  private static int i;

  static
  {
    if (com.wandoujia.jupiter.homepage.a.b())
      com.wandoujia.jupiter.homepage.a.c();
    d = JupiterApplication.e().getResources().getDimensionPixelSize(2131427883);
    e = JupiterApplication.e().getResources().getDimensionPixelSize(2131427692);
  }

  public static int a()
  {
    return a;
  }

  public static int a(Bitmap paramBitmap)
  {
    return a(paramBitmap, SystemUtil.getScreenWidth((WindowManager)GlobalConfig.getAppContext().getSystemService("window")));
  }

  public static int a(Bitmap paramBitmap, int paramInt)
  {
    int j = paramBitmap.getHeight();
    int k = paramBitmap.getWidth();
    return (int)(1.0F * (j * paramInt) / k);
  }

  public static void a(int paramInt)
  {
    a = paramInt;
  }

  public static void a(boolean paramBoolean)
  {
    c = paramBoolean;
  }

  public static int b()
  {
    return e;
  }

  public static void b(int paramInt)
  {
    h = paramInt;
  }

  public static int c()
  {
    return a - e;
  }

  public static void c(int paramInt)
  {
    i = paramInt;
  }

  public static boolean d()
  {
    return b;
  }

  public static void e()
  {
    b = false;
  }

  public static void f()
  {
    if (com.wandoujia.jupiter.homepage.a.b())
      com.wandoujia.jupiter.homepage.a.c();
    b = true;
  }

  public static int g()
  {
    return d;
  }

  public static int h()
  {
    return a - e - d;
  }

  public static void i()
  {
    com.wandoujia.jupiter.homepage.b.a locala = (com.wandoujia.jupiter.homepage.b.a)i.k().a("splash_ad_cache");
    locala.a();
    Model localModel = locala.b();
    g = localModel;
    if ((localModel == null) || (!TemplateTypeEnum.TemplateType.SINGLE_GRAND.equals(g.g())))
      f = false;
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext())
      {
        List localList = g.v();
        f = true;
        localIterator = localList.iterator();
      }
    }
    while (FileUtil.exists(com.wandoujia.jupiter.homepage.b.a.a(((Image)localIterator.next()).url)));
    f = false;
  }

  public static boolean j()
  {
    return f;
  }

  public static Model k()
  {
    return g;
  }

  public static boolean l()
  {
    return c;
  }

  public static int m()
  {
    int j = e - com.wandoujia.jupiter.homepage.a.a();
    if (com.wandoujia.jupiter.homepage.a.b());
    for (int k = com.wandoujia.jupiter.homepage.a.c(); ; k = 0)
      return j - k;
  }

  public static int n()
  {
    return h;
  }

  public static int o()
  {
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.k
 * JD-Core Version:    0.6.0
 */