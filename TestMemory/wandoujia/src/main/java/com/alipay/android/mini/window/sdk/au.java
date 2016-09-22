package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.ao;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.c;
import com.alipay.wandoujia.cc;
import com.alipay.wandoujia.co;
import com.alipay.wandoujia.cs;
import com.alipay.wandoujia.ct;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.f;
import com.alipay.wandoujia.g;
import com.alipay.wandoujia.ic;
import com.alipay.wandoujia.r;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.rg;
import com.alipay.wandoujia.sg;
import com.alipay.wandoujia.sh;
import com.alipay.wandoujia.u;
import com.alipay.wandoujia.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class au
  implements l, ic, rg
{
  protected static boolean e;
  protected int a = -1;
  protected bh b;
  protected bd c;
  Map d;
  protected boolean f;
  private String g;
  private com.wandoujia.jupiter.d.a h;
  private boolean i;
  private List j = null;
  private JSONObject k = null;
  private WeakReference l;
  private ct m;
  private k n;
  private Object o;
  private aq p;
  private boolean q = false;
  private String r = "";
  private boolean s;

  protected au(bd parambd)
  {
    this.c = parambd;
    this.i = false;
    this.s = false;
    e = false;
    this.d = new HashMap();
  }

  private void j()
  {
    if (this.n != null)
      this.n.a();
  }

  public String a()
  {
    return this.g;
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  public void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    this.l = new WeakReference(paramActivity);
    LinearLayout localLinearLayout = (LinearLayout)paramViewGroup.findViewById(android.support.v4.app.d.a("mini_linBlocksConpent"));
    localLinearLayout.removeAllViews();
    Iterator localIterator;
    if (this.j != null)
      localIterator = this.j.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localLinearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new av(this));
        return;
      }
      localLinearLayout.addView((ViewGroup)((sg)localIterator.next()).b(paramActivity, localLinearLayout, this.f));
    }
  }

  public final void a(k paramk)
  {
    this.n = paramk;
  }

  public void a(String paramString)
  {
    this.g = paramString;
  }

  public void a(JSONObject paramJSONObject)
  {
    android.support.v4.app.d.a(paramJSONObject);
  }

  protected abstract boolean a(ra paramra);

  public boolean a(Object paramObject, am paramam)
  {
    boolean bool1 = false;
    ra localra1;
    int i1;
    if (paramam != null)
    {
      localra1 = paramam.b();
      i1 = k()[localra1.ordinal()];
      bool1 = false;
    }
    switch (i1)
    {
    case 2:
    case 15:
    case 20:
    case 21:
    default:
    case 10:
    case 3:
    case 4:
    case 11:
    case 13:
    case 14:
    case 8:
    case 9:
    case 1:
    case 7:
    case 5:
    case 6:
    case 16:
    case 18:
    case 17:
      Object localObject;
      do
      {
        WeakReference localWeakReference;
        do
        {
          do
          {
            do
            {
              do
              {
                boolean bool5;
                do
                {
                  boolean bool6;
                  do
                  {
                    return bool1;
                    bool6 = this.s;
                    bool1 = false;
                  }
                  while (bool6);
                  if (this.p != null)
                  {
                    this.p.i();
                    this.p = null;
                    return true;
                  }
                  if (this.q)
                  {
                    cv.a((Context)this.l.get(), this.r, new aw(this));
                    return false;
                  }
                  return this.c.c().e();
                  cv.a((Context)this.l.get(), this.r, new ax(this));
                  return false;
                  bool5 = e;
                  bool1 = false;
                }
                while (bool5);
                e = true;
                String str18 = cs.a(localra1.a())[0];
                if (!TextUtils.isEmpty(str18))
                {
                  Activity localActivity = (Activity)this.l.get();
                  ViewGroup localViewGroup = (ViewGroup)localActivity.findViewById(android.support.v4.app.d.a("mini_layout"));
                  cv.a(localViewGroup.getWindowToken(), localActivity);
                  localViewGroup.postDelayed(new ay(this, str18, localActivity, localViewGroup), 200L);
                }
                for (int i2 = 1; ; i2 = 0)
                  return i2;
                String str17 = paramam.a("message");
                this.n.a(str17);
                return false;
                this.n.b();
                if ((this.o != null) && ((this.o instanceof cc)))
                  ((cc)this.o).b();
                if (this.m != null)
                  this.m.a().c();
                return true;
                bool1 = this.c.c().d();
              }
              while (!bool1);
              j();
              return bool1;
              bool1 = a(localra1);
              if (!bool1)
                continue;
              bool1 = b(localra1);
            }
            while (!bool1);
            this.o = paramObject;
            j();
            return bool1;
            f localf = this.c.g();
            u localu = localf.e();
            localu.a().a(com.wandoujia.image.c.a.a().c().h());
            localu.a().c("/cashier/switchChannel");
            localf.a(null);
            this.c.m$24af20d5().d();
            bool1 = this.c.c().d();
          }
          while (!bool1);
          j();
          return bool1;
          cs.b(localra1.a());
          return false;
          String[] arrayOfString3 = cs.a(paramam.b().a());
          String str6 = arrayOfString3[1];
          String str7 = cs.c(str6);
          Iterator localIterator;
          String str9;
          String str10;
          String str11;
          String str12;
          boolean bool3;
          boolean bool4;
          com.wandoujia.jupiter.d.a locala;
          ra localra2;
          if (!TextUtils.isEmpty(str7))
          {
            localIterator = this.b.a().iterator();
            if (localIterator.hasNext());
          }
          else
          {
            String str8 = paramam.a("name");
            str9 = paramam.a("host");
            str10 = paramam.a("params");
            str11 = paramam.a("enctype");
            str12 = paramam.a("request_param");
            bool3 = Boolean.valueOf(paramam.a("validate")).booleanValue();
            bool4 = Boolean.valueOf(paramam.a("https")).booleanValue();
            locala = com.wandoujia.jupiter.d.a.a(str8, str9, str10, str11, str12, bool3, bool4);
            if ((arrayOfString3.length <= 4) || (TextUtils.isEmpty(arrayOfString3[4])))
              break label922;
            localra2 = ra.a$65b37f89(com.wandoujia.jupiter.d.a.a(arrayOfString3[4], str9, str10, str11, str12, bool3, bool4));
            if ((arrayOfString3.length <= 5) || (TextUtils.isEmpty(arrayOfString3[5])))
              break label932;
          }
          for (ra localra3 = ra.a$65b37f89(com.wandoujia.jupiter.d.a.a(arrayOfString3[5], str9, str10, str11, str12, bool3, bool4)); ; localra3 = ra.b)
          {
            k localk = this.n;
            String str13 = arrayOfString3[0];
            String str14 = arrayOfString3[1];
            String str15 = arrayOfString3[2];
            String str16 = arrayOfString3[3];
            localk.a(str13, str14, str15, localra2, str16, localra3);
            return false;
            sh localsh = (sh)localIterator.next();
            if (!TextUtils.equals(str7, localsh.c()))
              break;
            if (!(localsh instanceof co))
              break label640;
            arrayOfString3[1] = cs.a(str6, ((co)localsh).b());
            break label640;
            localra2 = ra.a$65b37f89(locala);
            break label775;
          }
          localWeakReference = this.l;
          bool1 = false;
        }
        while (localWeakReference == null);
        localObject = this.l.get();
        bool1 = false;
      }
      while (localObject == null);
      String[] arrayOfString2 = cs.a(localra1.a());
      String str4 = arrayOfString2[0];
      String str5 = arrayOfString2[3];
      Intent localIntent3 = new Intent((Context)this.l.get(), MiniWebActivity.class);
      localIntent3.putExtra("url", str4);
      localIntent3.putExtra("title", str5);
      this.n.a(localIntent3);
      return false;
    case 19:
      return c();
    case 12:
      if (this.m == null)
        this.m = new ct();
      b.c();
      ao localao = (ao)paramam;
      this.m.a(localao);
      this.m.a(localao, this.c.g());
      return true;
    case 23:
      label640: label775: label922: label932: String str2;
      String str3;
      if (x.c(com.wandoujia.image.c.a.a().b()))
      {
        String[] arrayOfString1 = cs.a(localra1.a());
        String str1 = arrayOfString1[0].substring(0, arrayOfString1[0].indexOf(";"));
        str2 = arrayOfString1[0].substring(1 + arrayOfString1[0].indexOf(";"));
        if (TextUtils.equals(str2, "loginpwd"))
        {
          str3 = "20000015";
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("alipays://platformapi/startApp?appId=").append(str3).append("&sourceId=trustedMsp&logonId=").append(str1).append("&fromWhich=").append(g.z().y());
          Intent localIntent2 = new Intent();
          localIntent2.setAction("android.intent.action.VIEW");
          localIntent2.setData(Uri.parse(localStringBuilder.toString()));
          localIntent2.addCategory("android.intent.category.BROWSABLE");
          this.n.a(localIntent2);
        }
      }
      while (true)
      {
        if ((this instanceof al))
          break label1387;
        return true;
        if (TextUtils.equals(str2, "paypwd"))
        {
          str3 = "20000013";
          break;
        }
        boolean bool2 = TextUtils.equals(str2, "simplepwd");
        str3 = null;
        if (!bool2)
          break;
        str3 = "20000060";
        break;
        Intent localIntent1 = new Intent();
        localIntent1.setAction("android.intent.action.VIEW");
        localIntent1.setData(Uri.parse("http://d.alipay.com"));
        this.n.a(localIntent1);
      }
    case 22:
    }
    label1387: return this.c.c().f();
  }

  protected final aq b(String paramString)
  {
    if (!this.k.has(paramString))
      return null;
    JSONObject localJSONObject = this.k.optJSONObject(paramString);
    if (this.p == null)
      this.p = new aq(this.c, this);
    this.p.b(localJSONObject);
    return this.p;
  }

  public rg b()
  {
    return this;
  }

  public void b(JSONObject paramJSONObject)
  {
    this.f = paramJSONObject.optBoolean("fullscreen", false);
    if (paramJSONObject.has("exit"))
      this.r = paramJSONObject.optString("exit");
    boolean bool2;
    if (paramJSONObject.has("allowBack"))
    {
      boolean bool1 = Boolean.parseBoolean(paramJSONObject.optString("allowBack"));
      bool2 = false;
      if (!bool1);
    }
    for (this.q = bool2; ; this.q = false)
    {
      this.b = new bh();
      this.s = paramJSONObject.optBoolean("disableBack");
      paramJSONObject.optString("image");
      this.h = com.wandoujia.jupiter.d.a.a(paramJSONObject, "onload");
      this.j = this.b.a(this, paramJSONObject.optJSONArray("blocks"));
      return;
      bool2 = true;
      break;
    }
  }

  protected abstract boolean b(ra paramra);

  public void c(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null);
    try
    {
      this.k = new JSONObject(paramJSONObject.toString());
      return;
    }
    catch (JSONException localJSONException)
    {
      b.b(localJSONException);
    }
  }

  protected abstract boolean c();

  public final boolean d()
  {
    return this.q;
  }

  protected final com.wandoujia.jupiter.d.a e()
  {
    return this.h;
  }

  protected final List f()
  {
    return this.b.a();
  }

  protected final List g()
  {
    return this.j;
  }

  protected final bd h()
  {
    return this.c;
  }

  public void i()
  {
    Iterator localIterator;
    if (this.j != null)
      localIterator = this.j.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        if (this.m != null)
          this.m.b();
        this.j = null;
        this.b = null;
        this.n = null;
        this.c = null;
        this.o = null;
        return;
      }
      ((sg)localIterator.next()).i();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.au
 * JD-Core Version:    0.6.0
 */