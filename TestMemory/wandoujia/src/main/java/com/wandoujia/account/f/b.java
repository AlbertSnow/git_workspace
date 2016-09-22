package com.wandoujia.account.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.AccountResponse;
import com.wandoujia.account.dto.DeviceBean;
import com.wandoujia.account.dto.FIELDS;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.g.l;
import com.wandoujia.account.g.m;
import com.wandoujia.account.g.p;
import com.wandoujia.account.g.t;
import com.wandoujia.account.g.u;
import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private com.wandoujia.account.b.a a;
  private String b = "unknown";
  private String c;
  private final d d = new d(this);
  private DeviceBean e;
  private List<WeakReference<e>> f;
  private Handler g;

  public b(String paramString1, String paramString2, DeviceBean paramDeviceBean)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramDeviceBean;
    this.a = new com.wandoujia.account.b.a();
    this.f = new ArrayList();
    this.g = new Handler(Looper.getMainLooper());
  }

  private String i(String paramString)
  {
    if (TextUtils.isEmpty(this.c))
      return this.b + "," + paramString;
    return this.b + "," + this.c;
  }

  public final AccountResponse a(String paramString1, String paramString2)
  {
    return this.a.c(paramString1, paramString2);
  }

  public final AccountResponse a(String paramString1, String paramString2, String paramString3)
  {
    return this.a.a(paramString1, paramString2, i(paramString3), this.e);
  }

  public final AccountResponse a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return this.a.a(paramString1, paramString2, "", paramString3, i(paramString4), this.e);
  }

  public final AccountResponse a(String paramString, FIELDS[] paramArrayOfFIELDS)
  {
    return this.a.a(i(paramString), this.e, paramArrayOfFIELDS);
  }

  public final String a()
  {
    return this.b;
  }

  public final void a(AccountParamConstants.FinishType paramFinishType)
  {
    if ((this.f == null) || (this.f.isEmpty()));
    while (true)
    {
      return;
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() != null)
        {
          this.g.post(new c(localWeakReference, paramFinishType));
          continue;
        }
        localIterator.remove();
      }
    }
  }

  public final void a(Platform paramPlatform, Context paramContext, com.wandoujia.account.listener.b paramb, String paramString)
  {
    this.a.a(paramPlatform, paramContext, paramb, i(paramString), this.e);
  }

  public final void a(IAccountListener paramIAccountListener)
  {
    this.a.a(paramIAccountListener);
  }

  public final void a(e parame)
  {
    this.f.add(new WeakReference(parame));
  }

  public final void a(String paramString)
  {
    this.a.d(paramString);
  }

  public final void a(String paramString, com.wandoujia.account.listener.a parama)
  {
    FIELDS[] arrayOfFIELDS = new FIELDS[1];
    arrayOfFIELDS[0] = FIELDS.BASIC_SOCIAL;
    new Thread(new t("", parama, paramString, this, arrayOfFIELDS)).start();
  }

  public final void a(String paramString1, String paramString2, com.wandoujia.account.listener.a parama)
  {
    new Thread(new l(paramString1, paramString2, parama, this)).start();
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama)
  {
    new Thread(new u(paramString1, paramString2, "register", paramString3, paramString4, parama, this)).start();
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, com.wandoujia.account.listener.a parama)
  {
    new Thread(new m(paramString1, paramString2, paramString4, paramString5, parama, this)).start();
  }

  public final AccountResponse b(String paramString)
  {
    return this.a.a(paramString);
  }

  public final AccountResponse b(String paramString1, String paramString2)
  {
    return this.a.d(paramString1, paramString2);
  }

  public final AccountResponse b(String paramString1, String paramString2, String paramString3)
  {
    return this.a.a(paramString1, paramString2, paramString3);
  }

  public final AccountResponse b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return this.a.a(paramString1, paramString2, paramString3, paramString4);
  }

  public final String b()
  {
    return this.c;
  }

  public final void b(Platform paramPlatform, Context paramContext, com.wandoujia.account.listener.b paramb, String paramString)
  {
    this.a.b(paramPlatform, paramContext, paramb, i(paramString), this.e);
  }

  public final void b(IAccountListener paramIAccountListener)
  {
    this.a.b(paramIAccountListener);
  }

  public final void b(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama)
  {
    new Thread(new p(paramString1, paramString2, paramString3, paramString4, parama, this)).start();
  }

  public final SsoHandler c()
  {
    return this.a.d();
  }

  public final AccountResponse c(String paramString1, String paramString2, String paramString3)
  {
    return this.a.b(paramString1, paramString2, i(paramString3), this.e);
  }

  public final void c(String paramString)
  {
    new Thread(new com.wandoujia.account.g.d(paramString, "", this.d, this)).start();
  }

  public final boolean c(String paramString1, String paramString2)
  {
    return this.a.b(paramString1, paramString2);
  }

  public final com.wandoujia.account.b.a d()
  {
    return this.a;
  }

  public final AccountResponse d(String paramString)
  {
    return this.a.f(paramString);
  }

  public final AccountResponse d(String paramString1, String paramString2)
  {
    return this.a.e(paramString1, paramString2);
  }

  public final AccountResponse d(String paramString1, String paramString2, String paramString3)
  {
    return this.a.c(paramString1, paramString2, paramString3);
  }

  public final AccountResponse e(String paramString)
  {
    return this.a.e(paramString);
  }

  public final AccountResponse e(String paramString1, String paramString2)
  {
    return this.a.f(paramString1, paramString2);
  }

  public final AccountResponse e(String paramString1, String paramString2, String paramString3)
  {
    return this.a.b(paramString1, paramString2, paramString3);
  }

  public final void e()
  {
    com.wandoujia.account.a.x();
    this.a.c();
  }

  public final AccountResponse f(String paramString)
  {
    com.wandoujia.account.b.a locala = this.a;
    String str = i(paramString);
    DeviceBean localDeviceBean = this.e;
    FIELDS[] arrayOfFIELDS = new FIELDS[1];
    arrayOfFIELDS[0] = FIELDS.BASIC_SOCIAL;
    return locala.a(str, localDeviceBean, arrayOfFIELDS);
  }

  public final AccountResponse f(String paramString1, String paramString2)
  {
    return this.a.g(paramString1, paramString2);
  }

  public final String f()
  {
    return this.b + this.c;
  }

  public final void g(String paramString)
  {
    d locald = this.d;
    FIELDS[] arrayOfFIELDS = new FIELDS[1];
    arrayOfFIELDS[0] = FIELDS.BASIC_SOCIAL;
    new Thread(new t("", locald, paramString, this, arrayOfFIELDS)).start();
  }

  public final AccountResponse h(String paramString)
  {
    return this.a.g(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.f.b
 * JD-Core Version:    0.6.0
 */