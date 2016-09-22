package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.c;
import com.alipay.wandoujia.cc;
import com.alipay.wandoujia.cs;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.rg;
import com.wandoujia.jupiter.d.a;
import org.json.JSONObject;

public abstract class b
  implements l, rg
{
  protected String[] a = null;
  protected String[] b = null;
  private bd c;
  private k d;
  private Object e;
  private Activity f;
  private String g;
  private boolean h = false;
  private String i = "";
  private a j;

  protected b(bd parambd)
  {
    this.c = parambd;
  }

  public final String a()
  {
    return this.g;
  }

  public final void a(int paramInt)
  {
  }

  protected abstract void a(Activity paramActivity, View paramView);

  public final void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    this.f = paramActivity;
    RelativeLayout localRelativeLayout = (RelativeLayout)paramViewGroup;
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localRelativeLayout.getLayoutParams();
    paramActivity.getWindow().setLayout(-1, -1);
    localLayoutParams.setMargins(0, 0, 0, 0);
    localRelativeLayout.setPadding(0, 0, 0, 0);
    localRelativeLayout.setGravity(49);
    localRelativeLayout.setBackgroundResource(d.e("mini_page_bg_color"));
    View localView = LayoutInflater.from(paramActivity).inflate(d(), paramViewGroup, false);
    if (localView == null)
      throw new AppErrorException(getClass(), "no such form:" + a());
    localView.getLayoutParams().height = -1;
    localRelativeLayout.removeAllViews();
    localRelativeLayout.addView(localView);
    a(paramActivity, localView);
    if (this.j != null)
      a(this, new am(ra.a$65b37f89(this.j)));
  }

  public final void a(k paramk)
  {
    this.d = paramk;
  }

  public final void a(String paramString)
  {
    this.g = paramString;
  }

  public void a(JSONObject paramJSONObject)
  {
    d.a(paramJSONObject);
  }

  protected abstract boolean a(ra paramra);

  public final boolean a(Object paramObject, am paramam)
  {
    boolean bool = false;
    ra localra;
    int m;
    if (paramam != null)
    {
      localra = paramam.b();
      m = g()[localra.ordinal()];
      bool = false;
    }
    switch (m)
    {
    case 2:
    case 5:
    case 6:
    case 11:
    case 12:
    case 15:
    case 18:
    default:
    case 10:
    case 3:
    case 4:
    case 13:
    case 14:
    case 8:
    case 9:
    case 1:
    case 7:
    case 16:
    case 17:
      Activity localActivity;
      do
      {
        do
        {
          do
          {
            return bool;
            if (this.h)
            {
              cv.a(this.f, this.i, new ae(this));
              return false;
            }
            return this.c.c().e();
            cv.a(this.f, this.i, new at(this));
            return false;
            String str3 = paramam.a("message");
            this.d.a(str3);
            return false;
            this.d.b();
            if ((this.e != null) && ((this.e instanceof cc)))
              ((cc)this.e).b();
            return true;
            bool = this.c.c().d();
          }
          while (!bool);
          this.d.a();
          return bool;
          bool = f();
          if (!bool)
            continue;
          bool = a(localra);
        }
        while (!bool);
        this.e = paramObject;
        this.d.a();
        return bool;
        cs.b(localra.a());
        return false;
        localActivity = this.f;
        bool = false;
      }
      while (localActivity == null);
      String[] arrayOfString = cs.a(localra.a());
      String str1 = arrayOfString[0];
      String str2 = arrayOfString[3];
      Intent localIntent = new Intent(this.f, MiniWebActivity.class);
      localIntent.putExtra("url", str1);
      localIntent.putExtra("title", str2);
      this.d.a(localIntent);
      return false;
    case 19:
    }
    return e();
  }

  public final rg b()
  {
    return this;
  }

  public void b(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("form");
    this.j = a.a(localJSONObject1, "onload");
    if (localJSONObject1.has("exit"))
      this.i = paramJSONObject.optString("exit");
    boolean bool2;
    if (localJSONObject1.has("allowBack"))
    {
      boolean bool1 = Boolean.parseBoolean(paramJSONObject.optString("allowBack"));
      bool2 = false;
      if (!bool1);
    }
    for (this.h = bool2; ; this.h = false)
    {
      this.a = new String[3];
      this.b = new String[3];
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject("confirm");
      cv.a(this.a, this.b, localJSONObject2);
      return;
      bool2 = true;
      break;
    }
  }

  protected final bd c()
  {
    return this.c;
  }

  public void c(JSONObject paramJSONObject)
  {
  }

  protected abstract int d();

  protected abstract boolean e();

  protected abstract boolean f();

  public void i()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.b
 * JD-Core Version:    0.6.0
 */