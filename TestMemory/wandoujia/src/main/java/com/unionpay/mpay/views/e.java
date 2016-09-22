package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.aw;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.widgets.ag;
import com.unionpay.mpay.widgets.k;
import com.unionpay.mpay_2.upview.a.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e extends b
  implements a.b
{
  private int l = 20;
  private int m = 100;
  private com.unionpay.mpay_2.upwidget.a n = null;
  private TextView o = null;
  private com.unionpay.mpay_2.upview.a p = null;
  private boolean q = false;
  private boolean r = true;
  private View.OnClickListener s = new aa(this);
  private View.OnClickListener t = new ac(this);

  public e(Context paramContext)
  {
    super(paramContext);
    this.f = 5;
    setBackgroundColor(-66566);
    b(1);
  }

  private void m()
  {
    this.e.e(this.p.b("pan"));
    this.m = 104;
  }

  private void n()
  {
    this.m = 103;
    this.e.a("query", this.a.S, 3);
    this.l = (-1 + this.l);
  }

  protected final void a()
  {
    int i = 1;
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setOrientation(i);
    localLinearLayout1.setId(localLinearLayout1.hashCode());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    int k = com.unionpay.mpay.a.a.c;
    this.j.addView(localLinearLayout1, localLayoutParams1);
    this.p = new com.unionpay.mpay_2.upview.a(this.d, this.a.s, this.e.b(), this, this.a.aa, i);
    localLinearLayout1.addView(this.p);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.topMargin = k;
    localLayoutParams2.leftMargin = com.unionpay.mpay.a.a.e;
    localLayoutParams2.addRule(3, localLinearLayout1.getId());
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setOrientation(0);
    localLinearLayout2.setId(localLinearLayout2.hashCode());
    this.n = new com.unionpay.mpay_2.upwidget.a(this.d, this.a.U, this.t);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLinearLayout2.addView(this.n, localLayoutParams);
    this.j.addView(localLinearLayout2, localLayoutParams2);
    this.o = new TextView(this.d);
    this.o.setText(com.unionpay.mpay.utils.e.a(this.a.r, "label"));
    this.o.setTextSize(22.0F);
    this.o.setTextColor(-1);
    this.o.setGravity(17);
    this.o.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    int i1 = com.unionpay.mpay.a.a.j;
    Drawable localDrawable = this.c.a(2009, -1, -1);
    this.o.setBackgroundDrawable(localDrawable);
    this.o.setOnClickListener(this.s);
    TextView localTextView = this.o;
    if ((this.p == null) || (this.p.f()));
    while (true)
    {
      localTextView.setEnabled(i);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, i1);
      localLayoutParams3.topMargin = com.unionpay.mpay.a.a.e;
      localLayoutParams3.addRule(3, localLinearLayout2.getId());
      this.j.addView(this.o, localLayoutParams3);
      return;
      int j = 0;
    }
  }

  public final void a(com.unionpay.mpay_2.upview.c paramc)
  {
    if (paramc.a())
    {
      this.g = false;
      this.m = 101;
      this.b.a(com.unionpay.mpay.b.c.ab.B);
      new StringBuilder("sms elements:").append(paramc.a);
      this.e.b("sms", paramc.a);
      return;
    }
    c(paramc.a);
  }

  public final void a(JSONObject paramJSONObject)
  {
    this.r = false;
    switch (this.m)
    {
    default:
    case 101:
    case 102:
    case 103:
      do
      {
        return;
        this.p.e();
        this.b.c();
        this.m = 100;
        return;
        this.a.S = aw.a(paramJSONObject.toString());
        if ((this.a.S == null) || (this.a.S.length() <= 0))
        {
          c(2);
          return;
        }
        this.l = 20;
        n();
        return;
        String str1 = com.unionpay.mpay.utils.e.a(paramJSONObject, "status");
        String str2 = com.unionpay.mpay.utils.e.a(paramJSONObject, "fail_msg");
        if ((this.l > 0) && (str1.equalsIgnoreCase("01")))
        {
          n();
          return;
        }
        this.m = 100;
        if (str1.equalsIgnoreCase("00"))
        {
          this.q = true;
          m();
          return;
        }
        h();
        if (!str1.equalsIgnoreCase("03"))
          continue;
        ad localad = new ad(this);
        ae localae = new ae(this);
        if (this.a.u)
        {
          this.b.a(localad, localae);
          this.b.a(com.unionpay.mpay.b.c.ab.F, str2, com.unionpay.mpay.b.c.ab.G, com.unionpay.mpay.b.c.ab.H);
          return;
        }
        this.b.a(localad, null);
        this.b.a(com.unionpay.mpay.b.c.ab.F, str2, com.unionpay.mpay.b.c.ab.G);
        return;
      }
      while (this.l > 0);
      c(this.a.T);
      return;
    case 104:
    }
    h();
    this.a.o = com.unionpay.mpay.utils.e.c(paramJSONObject, "rules");
    this.a.p = com.unionpay.mpay.utils.e.a(paramJSONObject, "title");
    this.a.r = com.unionpay.mpay.utils.e.b(paramJSONObject, "followrules_button");
    this.a.U = com.unionpay.mpay.utils.e.b(paramJSONObject, "service_checkbox");
    this.a.V = com.unionpay.mpay.utils.e.b(paramJSONObject, "bind_card_checkbox");
    this.a.aa = com.unionpay.mpay.utils.e.a(paramJSONObject, "pan");
    if ((this.a.o == null) || (this.a.o.length() <= 0))
    {
      c(2);
      return;
    }
    if (this.p != null)
      this.p.g();
    this.a.z = false;
    e(6);
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

  protected final boolean a(String paramString)
  {
    this.r = false;
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
  }

  public final void c()
  {
    if (this.p.d())
      return;
    if ((this.a.z) && (this.r))
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.e
 * JD-Core Version:    0.6.0
 */