package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.alipay.android.app.exception.AppErrorException;
import com.wandoujia.jupiter.d.a;
import org.json.JSONObject;

public abstract class bw
  implements sh
{
  private static int w = 0;
  protected boolean a = false;
  private String b;
  private Object c;
  private boolean d = true;
  private float e;
  private String f;
  private String g;
  private boolean h = false;
  private String i;
  private String j;
  private a k;
  private String l;
  private View m;
  private String n;
  private rg o;
  private int[] p = new int[4];
  private int[] q = new int[4];
  private boolean r = false;
  private int s = -2;
  private boolean t = false;
  private String u;
  private sg v;

  protected abstract int a();

  public final View a(Activity paramActivity, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this.a = paramBoolean;
    if ((this.m == null) && (a() != 0))
      this.m = LayoutInflater.from(paramActivity).inflate(a(), paramViewGroup, false);
    int i1;
    if (this.d)
      i1 = 0;
    while (true)
    {
      this.m.setVisibility(i1);
      ViewGroup.LayoutParams localLayoutParams1 = this.m.getLayoutParams();
      if (localLayoutParams1 != null)
        localLayoutParams1.width = this.s;
      if (this.r)
        this.m.setPadding(this.q[1], this.q[0], this.q[3], this.q[2]);
      ViewGroup.LayoutParams localLayoutParams2 = this.m.getLayoutParams();
      if ((localLayoutParams2 instanceof LinearLayout.LayoutParams))
        ((LinearLayout.LayoutParams)localLayoutParams2).setMargins(this.p[1], this.p[0], this.p[3], this.p[2]);
      try
      {
        while (true)
        {
          a(paramActivity, this.m);
          this.m.getViewTreeObserver().addOnGlobalLayoutListener(new by(this));
          w = 1 + w;
          this.m.setId(w);
          return this.m;
          i1 = 8;
          break;
          if (!(localLayoutParams2 instanceof RelativeLayout.LayoutParams))
            continue;
          ((RelativeLayout.LayoutParams)localLayoutParams2).setMargins(this.p[1], this.p[0], this.p[3], this.p[2]);
        }
      }
      catch (AppErrorException localAppErrorException)
      {
        while (true)
          b.b(localAppErrorException);
      }
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p[0] = paramInt2;
    this.p[3] = paramInt3;
    this.p[2] = paramInt4;
    this.p[1] = paramInt1;
  }

  protected abstract void a(Activity paramActivity, View paramView);

  public final void a(rg paramrg)
  {
    this.o = paramrg;
  }

  public final void a(sg paramsg)
  {
    this.v = paramsg;
  }

  protected final void a(Object paramObject, am paramam)
  {
    if (this.o != null)
      this.o.a(paramObject, paramam);
  }

  public void a(String paramString)
  {
  }

  public void a(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.optString("name");
    this.c = paramJSONObject.opt("value");
    this.d = paramJSONObject.optBoolean("display", true);
    this.e = cv.c(paramJSONObject.optString("size"));
    this.f = paramJSONObject.optString("color");
    paramJSONObject.optString("tip");
    this.g = paramJSONObject.optString("hint");
    this.h = paramJSONObject.optBoolean("underline", false);
    paramJSONObject.optBoolean("crossline", false);
    paramJSONObject.optBoolean("overline", false);
    this.i = paramJSONObject.optString("default");
    this.j = paramJSONObject.optString("image");
    this.k = a.a(paramJSONObject, "action");
    this.u = paramJSONObject.optString("align");
    this.l = paramJSONObject.optString("params");
    String str = paramJSONObject.optString("padding");
    this.n = paramJSONObject.optString("margin");
    if (!TextUtils.isEmpty(str))
    {
      this.r = true;
      this.q = cv.d(str);
    }
    if (!TextUtils.isEmpty(this.n))
      this.p = cv.e(this.n);
  }

  public String c()
  {
    return this.b;
  }

  public void d()
  {
    if (this.m != null)
      this.m.requestFocus();
  }

  public boolean f()
  {
    return true;
  }

  public boolean g()
  {
    return true;
  }

  public void i()
  {
    this.m = null;
    if (this.o != null)
      this.o = null;
  }

  protected void j()
  {
  }

  public String k()
  {
    return this.u;
  }

  public final sg m()
  {
    return this.v;
  }

  protected final Object n()
  {
    return this.c;
  }

  protected final boolean o()
  {
    return this.d;
  }

  protected final String p()
  {
    return this.f;
  }

  protected final String q()
  {
    return this.i;
  }

  protected final a r()
  {
    return this.k;
  }

  protected final float s()
  {
    return this.e;
  }

  protected final String t()
  {
    return this.g;
  }

  protected final String u()
  {
    return this.j;
  }

  protected final JSONObject v()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(this.l);
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return new JSONObject();
  }

  public final void w()
  {
    this.s = -1;
  }

  public final boolean x()
  {
    return this.h;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bw
 * JD-Core Version:    0.6.0
 */