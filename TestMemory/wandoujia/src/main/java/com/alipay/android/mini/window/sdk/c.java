package com.alipay.android.mini.window.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.android.app.exception.NetErrorException;
import com.alipay.android.app.exception.ValifyException;
import com.alipay.wandoujia.ai;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.oa;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.rg;
import com.alipay.wandoujia.rh;
import com.wandoujia.image.c.a;
import org.json.JSONObject;

public class c
  implements oa, rh
{
  private Context a = a.a().b();
  private String b = this.a.getPackageName();
  private Handler c = new Handler(Looper.getMainLooper());
  private bd d;
  private com.alipay.wandoujia.c e;
  private k f;
  private l g;

  private void a(Class paramClass)
  {
    int i = 0;
    while (true)
    {
      if ((this.f != null) && (this.f.getClass() == paramClass))
        return;
      try
      {
        Thread.sleep(50L);
        label27: i++;
        if (i < 100)
          continue;
        com.alipay.wandoujia.i.a().d(null, "can not receive activity onload event");
        if (this.e != null)
        {
          this.e.g();
          return;
        }
        throw new AppErrorException(getClass(), "can not use exit cmd");
      }
      catch (InterruptedException localInterruptedException)
      {
        break label27;
      }
    }
  }

  private void a(String paramString)
  {
    int i = this.d.a();
    com.alipay.android.app.c localc = this.d.b();
    try
    {
      localc.a(this.b, paramString, i, null);
      return;
    }
    catch (Exception localException)
    {
      b.b(localException);
      Context localContext = a.a().b();
      Intent localIntent = new Intent();
      localIntent.setClassName(this.b, paramString);
      localIntent.setFlags(268435456);
      localIntent.putExtra("CallingPid", i);
      localContext.startActivity(localIntent);
    }
  }

  private void b()
  {
    if (this.g != null)
      this.g.i();
  }

  private void c()
  {
    String str = MiniPayActivity.class.getCanonicalName();
    if ((this.f != null) && ((this.f instanceof MiniPayActivity)));
    k localk;
    do
    {
      return;
      localk = this.f;
      a(str);
      a(MiniPayActivity.class);
    }
    while (localk == null);
    localk.i();
  }

  public void a(bd parambd)
  {
    this.d = parambd;
    this.e = parambd.c();
  }

  public void a(com.alipay.wandoujia.c paramc, ai paramai)
  {
    if (paramai.f() == 0)
    {
      b.h();
      a(TransContainer.class.getCanonicalName());
      a(TransContainer.class);
    }
    while (true)
    {
      return;
      int i = paramai.f();
      String str = paramai.d().optString("form_name");
      switch (i)
      {
      default:
      case 4:
      case 7:
      case 6:
      case 10:
      case 9:
      case -10:
      }
      JSONObject localJSONObject;
      while (true)
      {
        localJSONObject = paramai.d();
        if (this.g != null)
          this.g.a(i);
        switch (i)
        {
        default:
          return;
        case -10:
          this.g.b(localJSONObject);
          c();
          this.c.post(new g(this, i));
          this.g.b().a(this, new com.alipay.wandoujia.am(ra.d));
          return;
          b();
          this.g = new am(this.d);
          continue;
          b();
          this.g = new al(this.d, this.c);
          continue;
          b();
          if (TextUtils.equals("cashier-card-no", str));
          for (this.g = new m(this.d); ; this.g = new q(this.d))
          {
            this.g.a(str);
            break;
          }
          b();
          this.g = new ak(this.d);
        case 4:
        case 6:
        case 7:
        case 10:
        case 9:
        case 8:
        }
      }
      c();
      this.g.a(this.f);
      this.g.a(localJSONObject);
      this.g.b(localJSONObject.optJSONObject("form"));
      this.g.c(localJSONObject.optJSONObject("subforms"));
      this.g.a(str);
      this.c.post(new e(this, i));
      return;
      this.g.a(localJSONObject);
      this.g.b(localJSONObject);
      this.g.c(localJSONObject.optJSONObject("subforms"));
      this.g.a(str);
      c();
      this.g.a(this.f);
      this.c.post(new f(this, i));
      return;
      if (!localJSONObject.has("msg"))
        break;
      if (this.f == null)
        continue;
      this.f.a(localJSONObject.optString("msg"));
      return;
    }
    this.g.b().a(this, new com.alipay.wandoujia.am(ra.n));
  }

  public void a(com.alipay.wandoujia.c paramc, Exception paramException)
  {
    if ((this.f == null) || (paramException == null))
      c();
    if ((paramException instanceof NetErrorException))
    {
      this.c.removeCallbacksAndMessages(null);
      this.c.post(new j(this));
      return;
    }
    if ((paramException instanceof ValifyException))
    {
      this.c.removeCallbacksAndMessages(null);
      this.c.post(new i(this, paramException));
      return;
    }
    this.c.removeCallbacksAndMessages(null);
    this.c.post(new h(this, paramException));
  }

  public void a(com.alipay.wandoujia.c paramc, String paramString1, String paramString2, String paramString3, String paramString4)
  {
  }

  public void a(Object paramObject)
  {
    this.f = ((k)paramObject);
    this.f.a(this);
  }

  public boolean a()
  {
    if ((this.f != null) && ((this.f instanceof MiniPayActivity)))
    {
      a(MiniPayActivity.class.getCanonicalName());
      return true;
    }
    return false;
  }

  public void i()
  {
    this.c.post(new d(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.c
 * JD-Core Version:    0.6.0
 */