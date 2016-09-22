package com.alipay.wandoujia;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.wandoujia.image.c.a;

public final class i
  implements Runnable
{
  private static i c;
  private static boolean d;
  private n a;
  private long b;

  private i()
  {
    d = false;
  }

  public static i a()
  {
    if (c == null)
      c = new i();
    return c;
  }

  private static String a(Throwable paramThrowable)
  {
    if (paramThrowable == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramThrowable.getClass().getName());
    localStringBuilder.append(":");
    localStringBuilder.append(paramThrowable.getMessage());
    return localStringBuilder.toString();
  }

  private void a(k paramk)
  {
    try
    {
      if ((Thread.currentThread().getId() != this.b) && (this.a != null))
      {
        Message localMessage = this.a.obtainMessage(0, paramk);
        this.a.sendMessage(localMessage);
        k.a();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void b()
  {
    if (d)
      return;
    new Thread(a()).start();
  }

  public final void a(long paramLong, String paramString)
  {
    id localid = x.b(a.a().b());
    if (localid == id.a)
      return;
    if ((!TextUtils.isEmpty(paramString)) && (paramString.indexOf("https") >= 0));
    for (String str = "https"; ; str = "http")
    {
      a(new k(fa.i, localid.b() + ":" + paramLong + "--URL:" + str));
      return;
    }
  }

  public final void a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[Exit]Android--");
    localStringBuilder.append(Build.VERSION.SDK_INT);
    localStringBuilder.append("--");
    try
    {
      localStringBuilder.append(x.a(a.a().b()).a());
      localStringBuilder.append("--");
      label54: localStringBuilder.append(paramString);
      a(new k(fa.m, localStringBuilder.toString()));
      return;
    }
    catch (Exception localException)
    {
      break label54;
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString1))
      localStringBuilder.append(localStringBuilder);
    if (!TextUtils.isEmpty(paramString2))
      localStringBuilder.append(paramString2);
    if (localStringBuilder.length() > 0)
      a(new k(fa.h, localStringBuilder.toString()));
  }

  public final void a(Throwable paramThrowable, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append("--");
    }
    localStringBuilder.append(a(paramThrowable));
    if (localStringBuilder.length() > 0)
      a(new k(fa.e, localStringBuilder.toString()));
  }

  public final void b(long paramLong, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append("--");
    }
    localStringBuilder.append(paramLong);
    a(new k(fa.l, localStringBuilder.toString()));
  }

  public final void b(Throwable paramThrowable, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append("--");
    }
    if (paramThrowable != null)
      localStringBuilder.append(a(paramThrowable));
    if (TextUtils.equals("uncatch crash", paramString))
      new Thread(new j(localStringBuilder)).start();
    do
      return;
    while (localStringBuilder.length() <= 0);
    a(new k(fa.f, localStringBuilder.toString()));
  }

  public final void c(Throwable paramThrowable, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append("--");
    }
    localStringBuilder.append(a(paramThrowable));
    if (localStringBuilder.length() > 0)
      a(new k(fa.a, localStringBuilder.toString()));
  }

  public final void d(Throwable paramThrowable, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append("--");
    }
    if (paramThrowable != null)
      localStringBuilder.append(a(paramThrowable));
    if (localStringBuilder.length() > 0)
      a(new k(fa.b, localStringBuilder.toString()));
  }

  public final void run()
  {
    d = true;
    this.b = Thread.currentThread().getId();
    Thread.currentThread().setName("sampling point");
    Thread.currentThread().setPriority(5);
    h.a();
    Looper localLooper = Looper.myLooper();
    if (localLooper == null)
    {
      Looper.prepare();
      localLooper = Looper.myLooper();
    }
    this.a = new n(localLooper);
    Looper.loop();
    d = false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.i
 * JD-Core Version:    0.6.0
 */