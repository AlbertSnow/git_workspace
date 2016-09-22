package com.alipay.android.app;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.mini.window.sdk.MiniWebActivity;
import com.alipay.wandoujia.x;

public final class i
{
  public static final Object a = new Object();
  private Context b;
  private String c;
  private e d;
  private boolean e = false;
  private ServiceConnection f = new j(this);

  public i(Context paramContext, String paramString, e parame)
  {
    new k(this);
    this.b = paramContext;
    this.c = paramString;
    this.d = parame;
  }

  private String a(Intent paramIntent)
  {
    if (this.e)
      return b();
    this.e = true;
    this.b.getApplicationContext().bindService(paramIntent, this.f, 1);
    try
    {
      synchronized (a)
      {
        a.wait(3000L);
        this.e = false;
        return "系统错误";
      }
    }
    catch (Exception localException)
    {
      android.support.v4.app.b.b(localException);
      return null;
    }
    finally
    {
      this.e = false;
    }
    throw localObject1;
  }

  private String a(boolean paramBoolean)
  {
    switch (this.d.h)
    {
    default:
      return android.support.v4.app.b.b(this.c);
    case 4001:
      m localm2 = m.b(this.d.h);
      return android.support.v4.app.b.a(localm2.a(), localm2.b(), "");
    case 7001:
      return android.support.v4.app.b.a(this.d.h, this.d.c, "");
    case 9000:
    }
    String str = this.d.b;
    if (TextUtils.equals(str, "safepay"))
      return c();
    if (TextUtils.equals(str, "alipay"))
      return d();
    if (TextUtils.equals(str, "wap"))
      return b(paramBoolean);
    if ((!TextUtils.equals(str, "download")) && (!TextUtils.equals(str, "wap_sdk")))
    {
      if (TextUtils.equals(str, "exit"))
      {
        m localm1 = m.b(4000);
        return android.support.v4.app.b.a(localm1.a(), localm1.b(), "");
      }
    }
    else
    {
      if ((TextUtils.equals(this.d.e, "safepay")) && (x.d(this.b)))
        return c();
      if ((TextUtils.equals(this.d.e, "alipay")) && (x.c(this.b)))
        return d();
    }
    return android.support.v4.app.b.b(this.c);
  }

  public static String b()
  {
    m localm = m.b(6001);
    return android.support.v4.app.b.a(localm.a(), localm.b(), "");
  }

  private String b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d = new com.unipay.e.a.b(this.b, false, this.c).a();
      if (this.d == null)
        return b();
      return a(false);
    }
    Intent localIntent = new Intent(this.b, MiniWebActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("url", this.d.j);
    localBundle.putInt("timeout", this.d.i);
    localBundle.putBoolean("from_mcashier", true);
    c localc = com.alipay.wandoujia.b.a().e(Binder.getCallingPid());
    try
    {
      localc.a(this.b.getPackageName(), MiniWebActivity.class.getCanonicalName(), Binder.getCallingPid(), localBundle);
    }
    catch (Exception localException)
    {
      synchronized (a)
      {
        try
        {
          a.wait();
          String str = android.support.v4.app.b.b();
          if (TextUtils.isEmpty(str))
            str = b();
          android.support.v4.app.b.a();
          return str;
          localException = localException;
          localIntent.putExtras(localBundle);
          localIntent.addFlags(268435456);
          this.b.startActivity(localIntent);
        }
        catch (InterruptedException localInterruptedException)
        {
          while (true)
            android.support.v4.app.b.b(localInterruptedException);
        }
      }
    }
  }

  private String c()
  {
    return a(new Intent("com.alipay.android.app.IAlixPay"));
  }

  private String d()
  {
    return a(new Intent("com.eg.android.AlipayGphone.IAlixPay"));
  }

  public final String a()
  {
    return a(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.i
 * JD-Core Version:    0.6.0
 */