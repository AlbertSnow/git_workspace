package com.tencent.open.a;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

public class f
{
  private static f a = null;
  private static b c;
  private static boolean d = false;
  private a b = new a(c);

  static
  {
    String str1 = c.d;
    d locald = android.support.v4.app.b.s();
    int i = 0;
    if (locald != null)
    {
      boolean bool = locald.a() < c.f;
      i = 0;
      if (bool)
        i = 1;
    }
    if (i != 0);
    for (File localFile = new File(Environment.getExternalStorageDirectory(), str1); ; localFile = new File(android.support.v4.app.b.v(), str1))
    {
      int j = c.h;
      String str2 = c.c;
      c = new b(localFile, j, str2);
      return;
    }
  }

  private static f a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
      {
        a = new f();
        d = true;
      }
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    String str2;
    if (d)
    {
      String str1 = android.support.v4.app.b.u();
      if (!TextUtils.isEmpty(str1))
      {
        str2 = str1 + " SDK_VERSION:2.9.4";
        if (this.b != null);
      }
    }
    do
    {
      return;
      e.a.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str2, null);
      this.b.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str2, null);
      d = false;
      e.a.b(paramInt, Thread.currentThread(), System.currentTimeMillis(), paramString1, paramString2, paramThrowable);
    }
    while ((!android.support.v4.app.b.b(c.b, paramInt)) || (this.b == null));
    this.b.b(paramInt, Thread.currentThread(), System.currentTimeMillis(), paramString1, paramString2, paramThrowable);
  }

  public static final void a(String paramString1, String paramString2)
  {
    a().a(1, paramString1, paramString2, null);
  }

  public static final void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a().a(2, paramString1, paramString2, paramThrowable);
  }

  public static final void b(String paramString1, String paramString2)
  {
    a().a(2, paramString1, paramString2, null);
  }

  public static final void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a().a(16, paramString1, paramString2, paramThrowable);
  }

  public static final void c(String paramString1, String paramString2)
  {
    a().a(4, paramString1, paramString2, null);
  }

  public static final void d(String paramString1, String paramString2)
  {
    a().a(8, paramString1, paramString2, null);
  }

  public static final void e(String paramString1, String paramString2)
  {
    a().a(16, paramString1, paramString2, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a.f
 * JD-Core Version:    0.6.0
 */