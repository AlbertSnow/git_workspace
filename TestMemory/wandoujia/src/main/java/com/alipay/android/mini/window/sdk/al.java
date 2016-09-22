package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.test.ui.core.EventObject;
import com.alipay.wandoujia.ai;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.c;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.f;
import com.alipay.wandoujia.r;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.u;
import org.json.JSONArray;
import org.json.JSONObject;

public final class al extends au
{
  private int g;
  private String h;
  private String i;
  private boolean j = false;
  private Handler k;

  protected al(bd parambd, Handler paramHandler)
  {
    super(parambd);
    this.k = paramHandler;
    if (this.k == null)
      this.k = new Handler(Looper.getMainLooper());
  }

  public final void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    int m = 1;
    int n;
    if (this.j)
    {
      ai localai = this.c.p();
      if ((localai instanceof com.alipay.wandoujia.al))
      {
        if (!((com.alipay.wandoujia.al)localai).h())
          break label162;
        n = 0;
      }
    }
    while (true)
    {
      m = n;
      if (paramViewGroup != null)
      {
        if (m != 0)
        {
          paramActivity.getWindow().setLayout(-2, -2);
          paramActivity.getWindow().setBackgroundDrawable(null);
          paramViewGroup.setVisibility(8);
          paramViewGroup.removeAllViews();
        }
      }
      else
        label82: if (!TextUtils.equals("hidden", this.i))
        {
          if (this.g != 0)
            break label194;
          b.a(paramActivity, this.h);
        }
      try
      {
        while (true)
        {
          com.alipay.a.a.a locala = com.alipay.a.a.a.a();
          EventObject localEventObject = EventObject.OnResume;
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = paramActivity;
          arrayOfObject[1] = "toast";
          arrayOfObject[2] = this.h;
          arrayOfObject[3] = this.d;
          locala.onChangeEvent(localEventObject, arrayOfObject);
          return;
          label162: n = m;
          break;
          if (this.a != 10)
            break label82;
          paramViewGroup.setVisibility(0);
          paramViewGroup.setBackgroundResource(d.c("mini_page_bg_color"));
          break label82;
          label194: b.a(paramActivity, this.g, this.h);
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  protected final boolean a(ra paramra)
  {
    return true;
  }

  public final boolean a(Object paramObject, am paramam)
  {
    boolean bool = false;
    ra localra;
    if (paramam != null)
      localra = paramam.b();
    switch (j()[localra.ordinal()])
    {
    default:
      bool = super.a(paramObject, paramam);
      return bool;
    case 10:
      if (d())
      {
        h().c().g();
        return false;
      }
      return h().c().e();
    case 3:
    case 4:
    }
    return h().c().g();
  }

  public final void b(JSONObject paramJSONObject)
  {
    super.b(paramJSONObject);
    this.i = paramJSONObject.optString("visibility");
    this.j = paramJSONObject.optBoolean("fullscreen");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("blocks").optJSONObject(0).optJSONArray("value");
    String str1 = localJSONArray.optJSONObject(0).optString("type");
    String str2 = null;
    if (TextUtils.equals("component", str1))
      if (localJSONArray.optJSONObject(0).optJSONArray("value").length() == 1)
        this.h = localJSONArray.optJSONObject(0).optJSONArray("value").optJSONObject(0).optString("value");
    while (true)
    {
      this.g = cv.f(str2);
      a(this, new am(ra.a$65b37f89(e())));
      return;
      str2 = localJSONArray.optJSONObject(0).optJSONArray("value").optJSONObject(0).optString("image");
      this.h = localJSONArray.optJSONObject(0).optJSONArray("value").optJSONObject(1).optString("value");
      continue;
      if (localJSONArray.length() == 1)
      {
        this.h = localJSONArray.optJSONObject(0).optString("value");
        str2 = null;
        continue;
      }
      str2 = localJSONArray.optJSONObject(0).optString("image");
      this.h = localJSONArray.optJSONObject(1).optString("value");
    }
  }

  public final boolean b(ra paramra)
  {
    f localf = h().g();
    u localu = localf.e();
    localu.a(paramra.h());
    localu.a().c(paramra.a());
    localu.a().a(paramra.b());
    com.wandoujia.clean.b.a locala = h().m$24af20d5();
    locala.b(paramra.e());
    locala.c(paramra.f());
    localf.a(b.a(null, paramra.c()));
    return h().c().d();
  }

  protected final boolean c()
  {
    return true;
  }

  public final void i()
  {
    super.i();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.al
 * JD-Core Version:    0.6.0
 */