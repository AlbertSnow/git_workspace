package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.aw;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.utils.e;
import com.unionpay.mpay.widgets.ag;
import com.unionpay.mpay.widgets.k;
import com.unionpay.mpay_2.upview.a.b;
import org.json.JSONObject;

public final class x extends b
  implements a.b
{
  private int l = 100;
  private int m = 20;
  private com.unionpay.mpay_2.upwidget.a n = null;
  private TextView o = null;
  private com.unionpay.mpay_2.upview.a p = null;
  private View.OnClickListener q = new ar(this);
  private View.OnClickListener r = new as(this);

  public x(Context paramContext)
  {
    super(paramContext);
    this.f = 10;
    setBackgroundColor(-66566);
    this.h = e();
    b();
    super.d();
    a();
  }

  private void m()
  {
    this.l = 103;
    new StringBuilder().append(this.m);
    this.e.a("query", this.a.S, 3);
    this.m = (-1 + this.m);
  }

  protected final void a()
  {
    int i = 1;
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setBackgroundColor(-1);
    localLinearLayout1.setOrientation(i);
    localLinearLayout1.setId(localLinearLayout1.hashCode());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    int k = com.unionpay.mpay.a.a.e;
    localLayoutParams1.rightMargin = k;
    localLayoutParams1.leftMargin = k;
    this.j.addView(localLinearLayout1, localLayoutParams1);
    this.p = new com.unionpay.mpay_2.upview.a(this.d, this.a.G, this.e.b(), this, this.a.aa, i);
    localLinearLayout1.addView(this.p);
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setOrientation(i);
    localLinearLayout2.setId(localLinearLayout2.hashCode());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.topMargin = com.unionpay.mpay.a.a.c;
    localLayoutParams2.leftMargin = com.unionpay.mpay.a.a.c;
    localLayoutParams2.addRule(3, localLinearLayout1.getId());
    this.j.addView(localLinearLayout2, localLayoutParams2);
    this.n = new com.unionpay.mpay_2.upwidget.a(this.d, this.a.U, this.r);
    localLinearLayout2.addView(this.n);
    this.o = new TextView(this.d);
    this.o.setText(e.a(this.a.r, "label"));
    this.o.setTextSize(22.0F);
    this.o.setTextColor(-1);
    this.o.setGravity(17);
    this.o.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    int i1 = com.unionpay.mpay.a.a.j;
    Drawable localDrawable = this.c.a(2009, -1, -1);
    this.o.setBackgroundDrawable(localDrawable);
    this.o.setOnClickListener(this.q);
    TextView localTextView = this.o;
    if ((this.p == null) || (this.p.f()));
    while (true)
    {
      localTextView.setEnabled(i);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, i1);
      localLayoutParams3.topMargin = com.unionpay.mpay.a.a.c;
      int i2 = com.unionpay.mpay.a.a.c;
      localLayoutParams3.rightMargin = i2;
      localLayoutParams3.leftMargin = i2;
      localLayoutParams3.addRule(3, localLinearLayout2.getId());
      this.j.addView(this.o, localLayoutParams3);
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
    this.g = false;
    this.l = 101;
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    new StringBuilder("sms elements:").append(paramc.a);
    this.e.b("sms", paramc.a);
  }

  public final void a(JSONObject paramJSONObject)
  {
    switch (this.l)
    {
    default:
    case 101:
    case 102:
    case 103:
    }
    do
    {
      return;
      this.p.e();
      this.b.c();
      this.l = 100;
      return;
      this.a.S = aw.a(paramJSONObject.toString());
      if ((this.a.S == null) || (this.a.S.length() <= 0))
      {
        c(2);
        return;
      }
      this.m = 20;
      m();
      return;
      String str1 = e.a(paramJSONObject, "status");
      String str2 = e.a(paramJSONObject, "fail_msg");
      this.a.F = e.a(paramJSONObject, "open_info");
      this.a.p = e.a(paramJSONObject, "title");
      this.a.q = e.a(paramJSONObject, "succ_info");
      if ((this.m > 0) && (str1.equalsIgnoreCase("01")))
      {
        m();
        return;
      }
      this.l = 100;
      h();
      if (str1.equalsIgnoreCase("00"))
      {
        e(11);
        return;
      }
      if (!str1.equalsIgnoreCase("03"))
        continue;
      c localc = new c(this);
      this.b.a(localc, null);
      this.b.a(com.unionpay.mpay.b.c.ab.F, str2, com.unionpay.mpay.b.c.ab.G);
      return;
    }
    while (this.m > 0);
    c(20);
  }

  public final void a(boolean paramBoolean)
  {
    TextView localTextView;
    if (this.o != null)
    {
      localTextView = this.o;
      if (paramBoolean)
        break label24;
    }
    label24: for (boolean bool = true; ; bool = false)
    {
      localTextView.setEnabled(bool);
      return;
    }
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
  }

  public final void c()
  {
    if (this.p.d())
      return;
    k();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.x
 * JD-Core Version:    0.6.0
 */