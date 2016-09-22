package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.am;
import com.google.android.gms.analytics.internal.aw;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.internal.ai;
import com.wandoujia.p4.app_launcher.c.a;
import java.util.HashMap;
import java.util.Map;

final class m
  implements Runnable
{
  m(l paraml, Map paramMap, boolean paramBoolean1, String paramString1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString2)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    l.a(this.h).b();
    Map localMap = this.a;
    f localf = this.h.o();
    android.support.v4.app.d.k("getClientId can not be called from the main thread");
    com.google.android.gms.analytics.internal.m.b(localMap, "cid", localf.e().o().b());
    String str1 = (String)this.a.get("sf");
    if (str1 != null)
    {
      double d1 = com.google.android.gms.analytics.internal.m.b(str1);
      if (com.google.android.gms.analytics.internal.m.a(d1, (String)this.a.get("cid")))
      {
        this.h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
        return;
      }
    }
    com.google.android.gms.analytics.internal.b localb = l.b(this.h);
    if (this.b)
    {
      com.google.android.gms.analytics.internal.m.a(this.a, "ate", localb.b());
      com.google.android.gms.analytics.internal.m.a(this.a, "adid", localb.c());
      com.google.android.gms.internal.ag localag = l.c(this.h).b();
      com.google.android.gms.analytics.internal.m.a(this.a, "an", localag.a());
      com.google.android.gms.analytics.internal.m.a(this.a, "av", localag.b());
      com.google.android.gms.analytics.internal.m.a(this.a, "aid", localag.c());
      com.google.android.gms.analytics.internal.m.a(this.a, "aiid", localag.d());
      this.a.put("v", "1");
      this.a.put("_v", v.b);
      com.google.android.gms.analytics.internal.m.a(this.a, "ul", l.d(this.h).b().a());
      com.google.android.gms.analytics.internal.m.a(this.a, "sr", l.e(this.h).c());
      if ((!this.c.equals("transaction")) && (!this.c.equals("item")))
        break label385;
    }
    label385: for (boolean bool2 = bool1; ; bool2 = false)
    {
      if ((bool2) || (l.f(this.h).c()))
        break label391;
      l.g(this.h).a(this.a, "Too many hits sent too quickly, rate limiting invoked");
      return;
      this.a.remove("ate");
      this.a.remove("adid");
      break;
    }
    label391: long l1 = com.google.android.gms.analytics.internal.m.c((String)this.a.get("ht"));
    if (l1 == 0L)
      l1 = this.d;
    if (this.e)
    {
      com.google.android.gms.analytics.internal.d locald1 = new com.google.android.gms.analytics.internal.d(this.h, this.a, l1, this.f);
      l.h(this.h).c("Dry run enabled. Would have sent hit", locald1);
      return;
    }
    String str2 = (String)this.a.get("cid");
    HashMap localHashMap = new HashMap();
    com.google.android.gms.analytics.internal.m.a(localHashMap, "uid", this.a);
    com.google.android.gms.analytics.internal.m.a(localHashMap, "an", this.a);
    com.google.android.gms.analytics.internal.m.a(localHashMap, "aid", this.a);
    com.google.android.gms.analytics.internal.m.a(localHashMap, "av", this.a);
    com.google.android.gms.analytics.internal.m.a(localHashMap, "aiid", this.a);
    String str3 = this.g;
    if (!TextUtils.isEmpty((CharSequence)this.a.get("adid")));
    while (true)
    {
      com.wandoujia.p4.app_launcher.manager.b localb1 = new com.wandoujia.p4.app_launcher.manager.b(str2, str3, bool1, 0L, localHashMap);
      long l2 = l.i(this.h).a(localb1);
      this.a.put("_s", String.valueOf(l2));
      com.google.android.gms.analytics.internal.d locald2 = new com.google.android.gms.analytics.internal.d(this.h, this.a, l1, this.f);
      l.j(this.h).a(locald2);
      return;
      bool1 = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.m
 * JD-Core Version:    0.6.0
 */