package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.aw;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.utils.e;
import com.unionpay.mpay.widgets.ag;
import com.unionpay.mpay.widgets.k;
import com.unionpay.mpay_2.upview.a.b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aj extends b
  implements a.b
{
  private String l = "00";
  private int m = 0;
  private int n = 0;
  private int o = 20;
  private com.unionpay.mpay_2.upwidget.a p = null;
  private com.unionpay.mpay_2.upwidget.a q = null;
  private TextView r = null;
  private com.unionpay.mpay_2.upview.a s = null;
  private boolean t = false;
  private boolean u = false;
  private View.OnClickListener v = new m(this);
  private View.OnClickListener w = new o(this);

  public aj(Context paramContext)
  {
    super(paramContext);
    this.f = 6;
    setBackgroundColor(-66566);
    b(1);
  }

  private void d(String paramString)
  {
    this.g = false;
    this.n = 3;
    String str1 = android.support.v4.app.b.a(this.a.r);
    if (this.p != null);
    for (String str2 = this.p.a(); ; str2 = null)
    {
      String str3 = android.support.v4.app.b.c("1", "1", str2, paramString);
      this.e.b(str1, str3);
      return;
    }
  }

  private void f(int paramInt)
  {
    this.n = 4;
    this.m = paramInt;
    this.e.a("query", this.a.S, 3);
    this.o = (-1 + this.o);
  }

  protected final void a()
  {
    int i = 1;
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setId(localLinearLayout1.hashCode());
    localLinearLayout1.setOrientation(i);
    localLinearLayout1.setBackgroundColor(-1);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    this.j.addView(localLinearLayout1, localLayoutParams1);
    this.s = new com.unionpay.mpay_2.upview.a(this.d, this.a.o, this.e.b(), this, this.a.aa, i);
    localLinearLayout1.addView(this.s);
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setOrientation(i);
    localLinearLayout2.setId(localLinearLayout2.hashCode());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.addRule(3, localLinearLayout1.getId());
    localLayoutParams2.leftMargin = com.unionpay.mpay.a.a.e;
    localLayoutParams2.topMargin = localLayoutParams2.leftMargin;
    this.j.addView(localLinearLayout2, localLayoutParams2);
    if ((g()) || (this.a.U != null) || (this.a.V != null))
    {
      if (this.a.U != null)
      {
        this.q = new com.unionpay.mpay_2.upwidget.a(this.d, this.a.U, this.w);
        localLinearLayout2.addView(this.q);
      }
      if (this.a.V != null)
      {
        this.p = new com.unionpay.mpay_2.upwidget.a(this.d, this.a.V, null);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams.topMargin = com.unionpay.mpay.a.a.e;
        localLinearLayout2.addView(this.p, localLayoutParams);
      }
    }
    this.r = new TextView(this.d);
    this.r.setText(e.a(this.a.r, "label"));
    this.r.setTextSize(22.0F);
    this.r.setTextColor(-1);
    this.r.setGravity(17);
    TextView localTextView = this.r;
    if ((this.s == null) || (this.s.f()));
    while (true)
    {
      localTextView.setEnabled(i);
      this.r.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
      int k = com.unionpay.mpay.a.a.j;
      Drawable localDrawable = this.c.a(2009, -1, -1);
      this.r.setBackgroundDrawable(localDrawable);
      this.r.setOnClickListener(this.v);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, k);
      localLayoutParams3.addRule(3, localLinearLayout2.getId());
      localLayoutParams3.topMargin = com.unionpay.mpay.a.a.e;
      this.j.addView(this.r, localLayoutParams3);
      return;
      int j = 0;
    }
  }

  public final void a(com.unionpay.mpay_2.upview.c paramc)
  {
    if (!paramc.a())
    {
      c(paramc.a);
      return;
    }
    new StringBuilder("sms elements:").append(paramc.a);
    this.g = false;
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    this.e.b("sms", paramc.a);
    this.n = 1;
  }

  public final void a(JSONObject paramJSONObject)
  {
    this.u = false;
    switch (this.n)
    {
    case 5:
    default:
    case 1:
    case 6:
    case 4:
      do
      {
        return;
        h();
        this.n = 0;
        this.s.e();
        return;
        h();
        int i = android.support.v4.app.b.a(this.a, paramJSONObject, true);
        if (i != 0)
          c(i);
        while (true)
        {
          this.n = 0;
          return;
          this.a.z = true;
          if ((this.a.o != null) && (this.a.o.length() > 0))
          {
            e(6);
            continue;
          }
          if ((this.a.s == null) || (this.a.s.length() <= 0))
            continue;
          e(5);
        }
        this.l = e.a(paramJSONObject, "status");
        if ((this.o > 0) && (this.l.equalsIgnoreCase("01")))
        {
          f(this.m);
          return;
        }
        this.n = 0;
        if (this.l.equalsIgnoreCase("00"))
        {
          switch (this.m)
          {
          default:
            h();
            this.n = 0;
            this.a.w = e.c(paramJSONObject, "result");
            this.a.D = e.a(paramJSONObject, "openupgrade_flag");
            e.a(paramJSONObject, "temporary_pay_flag");
            this.a.E = e.a(paramJSONObject, "temporary_pay_info");
            this.a.I = e.a(paramJSONObject, "front_url");
            this.a.J = e.a(paramJSONObject, "front_request");
            this.a.p = e.a(paramJSONObject, "title");
            this.a.q = e.a(paramJSONObject, "succ_info");
            if (this.s != null)
              this.s.g();
            e(8);
            return;
          case 2:
          }
          this.t = true;
          d(this.s.c().a);
          return;
        }
        if (!this.l.equalsIgnoreCase("03"))
          continue;
        String str = e.a(paramJSONObject, "fail_msg");
        if (this.m == 3)
        {
          c(str);
          return;
        }
        p localp = new p(this);
        q localq = new q(this);
        if (this.a.u)
        {
          this.b.a(localp, localq);
          this.b.a(com.unionpay.mpay.b.c.ab.F, str, com.unionpay.mpay.b.c.ab.G, com.unionpay.mpay.b.c.ab.H);
          return;
        }
        this.b.a(localp, null);
        this.b.a(com.unionpay.mpay.b.c.ab.F, str, com.unionpay.mpay.b.c.ab.G);
        return;
      }
      while (this.o > 0);
      if (this.m == 3)
      {
        a(this.a.T, true);
        return;
      }
      c(this.a.T);
      return;
    case 2:
    case 3:
    }
    this.a.S = aw.a(paramJSONObject.toString());
    if ((this.a.S == null) || (this.a.S.length() <= 0))
    {
      c(2);
      return;
    }
    this.o = 20;
    f(this.n);
  }

  public final void a(boolean paramBoolean)
  {
    TextView localTextView;
    if (this.r != null)
    {
      localTextView = this.r;
      if (paramBoolean)
        break label24;
    }
    label24: for (boolean bool = true; ; bool = false)
    {
      localTextView.setEnabled(bool);
      return;
    }
  }

  protected final boolean a(String paramString)
  {
    this.u = false;
    return false;
  }

  protected final void b()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    ag localag = new ag(getContext(), this.a.p);
    localLayoutParams.addRule(13, -1);
    this.h.addView(localag, localLayoutParams);
  }

  public final void b(String paramString)
  {
    this.g = false;
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    String str = "\"card\":\"" + ((com.unionpay.pboctransaction.model.b)this.a.h.get(this.a.B)).a() + "\"";
    new StringBuilder("cmd:").append(paramString).append(", ele:").append(str);
    this.e.b(paramString, str);
    this.n = 6;
  }

  public final void c()
  {
    if (this.s.d())
      return;
    if ((this.a.z) && (this.u))
    {
      this.a.z = false;
      android.support.v4.app.b.a(this.a, this.a.v);
      k();
      return;
    }
    this.a.z = false;
    this.a.v = null;
    j();
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.s.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.aj
 * JD-Core Version:    0.6.0
 */