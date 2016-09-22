package com.unionpay.pboc.engine;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.pboctransaction.AppIdentification;
import com.unionpay.uppay.PayActivityEx;
import java.util.ArrayList;
import java.util.HashMap;

public final class b
  implements Handler.Callback
{
  private int a = 0;
  private Handler b = null;
  private ArrayList<com.unionpay.pboctransaction.model.b> c = null;
  private ArrayList<com.unionpay.pboctransaction.model.b> d = null;
  private ArrayList<com.unionpay.pboctransaction.model.b> e = null;
  private ArrayList<com.unionpay.pboctransaction.model.b> f = null;
  private com.unionpay.pboctransaction.e g = null;
  private com.unionpay.pboctransaction.sdapdu.a h = null;
  private com.unionpay.pboctransaction.b i = new c(this);
  private com.unionpay.pboctransaction.e j = null;
  private com.unionpay.pboctransaction.a.a k = null;
  private com.unionpay.pboctransaction.b l = new d(this);
  private com.unionpay.pboctransaction.e m = null;
  private com.unionpay.pboctransaction.simapdu.a n = null;
  private com.unionpay.pboctransaction.b o = new e(this);
  private a p = null;

  public b(Context paramContext, a parama, boolean paramBoolean)
  {
    com.unionpay.pboctransaction.d locald = (com.unionpay.pboctransaction.d)((PayActivityEx)paramContext).a(UPPayEngine.class.toString());
    this.h = new com.unionpay.pboctransaction.sdapdu.a();
    this.g = new com.unionpay.pboctransaction.e(this.h, locald);
    com.unionpay.pboctransaction.b localb = this.i;
    if (localb != null)
      localb.a();
    this.k = new com.unionpay.pboctransaction.a.a(paramBoolean);
    this.j = new com.unionpay.pboctransaction.e(this.k, locald);
    this.k.a(this.l, paramContext);
    this.n = com.unionpay.pboctransaction.simapdu.a.d();
    this.m = new com.unionpay.pboctransaction.e(this.n, locald);
    this.n.a(this.o, paramContext);
    this.p = parama;
  }

  public final Bundle a(com.unionpay.pboctransaction.model.b paramb, String paramString, HashMap<String, String> paramHashMap)
  {
    if (paramb == null);
    int i2;
    do
      while (true)
      {
        return null;
        int i1 = paramb.d();
        i2 = paramb.e();
        if (i2 != 1)
          break;
        AppIdentification localAppIdentification = new AppIdentification(paramb.a(), null);
        if (paramb.e() == 1);
        for (String str1 = "2"; i1 == 8; str1 = "1")
          return this.g.a(localAppIdentification, paramString, str1, paramHashMap);
        if (i1 == 4)
          return this.j.a(localAppIdentification, paramString, str1, paramHashMap);
        if (i1 == 16)
          return this.m.a(localAppIdentification, paramString, str1, paramHashMap);
      }
    while (i2 != 2);
    String str2 = paramb.a();
    return this.g.b(Integer.parseInt(str2), paramString);
  }

  public final void a()
  {
    if (this.k != null)
      this.k.d();
    if (this.n != null)
    {
      this.n.f();
      this.n = null;
    }
    this.a = 0;
  }

  public final boolean handleMessage(Message paramMessage)
  {
    new StringBuilder(" msg.what = ").append(paramMessage.what);
    if ((paramMessage.what == 1) || (paramMessage.what == 2) || (paramMessage.what == 4))
    {
      this.a ^= paramMessage.what;
      new StringBuilder(" mTag = ").append(this.a);
      if (paramMessage.obj != null)
      {
        if (paramMessage.what != 1)
          break label215;
        this.d = ((ArrayList)paramMessage.obj);
      }
    }
    while (true)
    {
      if ((this.a == 7) && (this.p != null))
      {
        if ((this.d != null) && (this.d.size() > 0))
          this.c.addAll(this.d);
        if ((this.e != null) && (this.e.size() > 0))
          this.c.addAll(this.e);
        if ((this.f != null) && (this.f.size() > 0))
          this.c.addAll(this.f);
        this.p.a(this.c);
      }
      return true;
      label215: if (paramMessage.what == 2)
      {
        this.e = ((ArrayList)paramMessage.obj);
        continue;
      }
      if (paramMessage.what != 4)
        continue;
      this.f = ((ArrayList)paramMessage.obj);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboc.engine.b
 * JD-Core Version:    0.6.0
 */