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
import com.unionpay.mpay.widgets.m;
import com.unionpay.mpay_2.upview.a.b;
import com.unionpay.mpay_2.upview.listview.e.a;
import com.unionpay.mpay_2.upwidget.d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n extends b
  implements a.b, e.a
{
  private int l = 0;
  private com.unionpay.mpay_2.upview.a m = null;
  private View.OnClickListener n = null;
  private View.OnClickListener o = null;
  private TextView p = null;
  private com.unionpay.mpay_2.upview.listview.e q = null;
  private LinearLayout r = null;
  private int s = 0;
  private int t = 0;
  private int u = 5;
  private com.unionpay.mpay_2.upwidget.c v = null;

  n(Context paramContext)
  {
    super(paramContext);
    this.f = 13;
    setBackgroundColor(-66566);
    b(1);
  }

  private void a(LinearLayout paramLinearLayout, JSONArray paramJSONArray)
  {
    if (paramJSONArray == null);
    while (true)
    {
      return;
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        m localm = b((JSONObject)com.unionpay.mpay.utils.e.b(paramJSONArray, i));
        if (localm == null)
          continue;
        paramLinearLayout.addView(localm);
      }
    }
  }

  private void g(int paramInt)
  {
    this.s = paramInt;
    this.q.c(paramInt);
  }

  private final boolean m()
  {
    List localList = this.a.O;
    int i = 0;
    if (localList != null)
    {
      int j = this.a.O.size();
      i = 0;
      if (j > 0)
        i = 1;
    }
    return i;
  }

  private void n()
  {
    this.l = 4;
    this.e.a("query", this.a.S, 3);
    this.u = (-1 + this.u);
  }

  protected final void a()
  {
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setBackgroundColor(-1);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setId(localLinearLayout1.hashCode());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams1.topMargin = com.unionpay.mpay.a.a.e;
    localLayoutParams1.addRule(10, -1);
    this.j.addView(localLinearLayout1, localLayoutParams1);
    a(localLinearLayout1, this.a.P);
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setBackgroundColor(-1);
    localLinearLayout2.setOrientation(1);
    localLinearLayout2.setId(localLinearLayout2.hashCode());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.addRule(3, localLinearLayout1.getId());
    this.j.addView(localLinearLayout2, localLayoutParams2);
    if (!m());
    try
    {
      JSONArray localJSONArray = new JSONArray("[{\"placeholder\" : \"银行卡卡号\",\"name\" : \"pan\",\"value\" : \"您尚未绑定银行卡\",\"label\" : \"\",\"type\" : \"pan\",\"readonly\" : \"true\",\"tip\" : \"\"}]");
      localLinearLayout2.addView(new com.unionpay.mpay_2.upview.a(this.d, localJSONArray, this.e.b(), this, this.a.aa, true));
      label189: LinearLayout localLinearLayout4 = new LinearLayout(this.d);
      localLinearLayout4.setOrientation(1);
      localLinearLayout4.setId(localLinearLayout4.hashCode());
      RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams5.addRule(3, localLinearLayout2.getId());
      localLayoutParams5.topMargin = com.unionpay.mpay.a.a.c;
      int i = com.unionpay.mpay.a.a.c;
      localLayoutParams5.bottomMargin = i;
      localLayoutParams5.leftMargin = i;
      this.j.addView(localLinearLayout4, localLayoutParams5);
      if ((this.a.M != null) && (m()))
      {
        this.v = com.unionpay.mpay_2.upwidget.c.a(this.d, com.unionpay.mpay.b.c.ab.q);
        d locald2 = d.a(this.d, this.a.M, null);
        locald2.a(new al(this, locald2.a()));
        com.unionpay.mpay_2.upwidget.c localc = this.v;
        LinearLayout.LayoutParams localLayoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams8.gravity = 16;
        localLayoutParams8.leftMargin = com.unionpay.mpay.a.a.b;
        localc.addView(locald2, localLayoutParams8);
        localLinearLayout4.addView(this.v);
      }
      d locald1 = d.a(this.d, this.a.N, this.c.a(1017, -1, -1));
      if (locald1 != null)
      {
        locald1.a(new am(this, locald1.a()));
        LinearLayout.LayoutParams localLayoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams7.topMargin = com.unionpay.mpay.a.a.e;
        localLinearLayout4.addView(locald1, localLayoutParams7);
      }
      this.p = new TextView(this.d);
      boolean bool;
      if (m())
      {
        this.p.setText(com.unionpay.mpay.b.c.ab.k);
        this.p.setOnClickListener(this.n);
        TextView localTextView = this.p;
        if ((this.m == null) || (this.m.f()))
        {
          bool = true;
          label552: localTextView.setEnabled(bool);
        }
      }
      while (true)
      {
        this.p.setTextSize(22.0F);
        this.p.setTextColor(-1);
        this.p.setGravity(17);
        this.p.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
        int j = com.unionpay.mpay.a.a.j;
        Drawable localDrawable = this.c.a(2009, -1, -1);
        this.p.setBackgroundDrawable(localDrawable);
        RelativeLayout.LayoutParams localLayoutParams6 = new RelativeLayout.LayoutParams(-1, j);
        localLayoutParams6.addRule(3, localLinearLayout4.getId());
        localLayoutParams6.topMargin = com.unionpay.mpay.a.a.e;
        this.j.addView(this.p, localLayoutParams6);
        return;
        this.r = new LinearLayout(this.d);
        this.r.setOrientation(1);
        this.r.setId(this.r.hashCode());
        RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        localLayoutParams3.addRule(3, localLinearLayout1.getId());
        localLinearLayout2.addView(this.r, localLayoutParams3);
        LinearLayout localLinearLayout3 = this.r;
        this.q = new com.unionpay.mpay_2.upview.listview.e(this.d, this.a, this);
        localLinearLayout3.addView(this.q);
        this.m = new com.unionpay.mpay_2.upview.a(this.d, this.a.o, this.e.b(), this, this.a.aa, true);
        this.m.setId(this.m.hashCode());
        RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        localLayoutParams4.addRule(3, this.r.getId());
        localLinearLayout2.addView(this.m, localLayoutParams4);
        break;
        bool = false;
        break label552;
        this.p.setText(com.unionpay.mpay.b.c.ab.l);
        this.p.setOnClickListener(this.o);
        this.p.setEnabled(true);
      }
    }
    catch (Exception localException)
    {
      break label189;
    }
  }

  public final void a(View paramView)
  {
    if ((paramView != null) && (paramView.getVisibility() == 8))
      g(this.s);
  }

  public final void a(com.unionpay.mpay_2.upview.c paramc)
  {
    this.m.d();
    if (!paramc.a())
    {
      c(paramc.a);
      return;
    }
    this.g = false;
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    this.e.b("sms", paramc.a);
    this.l = 2;
  }

  public final void a(JSONObject paramJSONObject)
  {
    switch (this.l)
    {
    default:
    case 2:
    case 1:
    case 3:
    case 4:
    }
    do
    {
      return;
      h();
      this.m.e();
      return;
      h();
      int i = android.support.v4.app.b.a(this.a, paramJSONObject, false);
      if (i != 0)
      {
        c(i);
        g(this.t);
        return;
      }
      g(this.s);
      this.q.a();
      this.m.a(this.a.o, this.a.aa, true);
      return;
      this.a.S = aw.a(paramJSONObject.toString());
      if (this.a.S == null)
      {
        c(2);
        return;
      }
      this.u = 5;
      n();
      return;
      String str = com.unionpay.mpay.utils.e.a(paramJSONObject, "status");
      if ((this.u > 0) && (str.equalsIgnoreCase("01")))
      {
        n();
        return;
      }
      h();
      if (str.equalsIgnoreCase("00"))
      {
        this.l = 0;
        this.a.w = com.unionpay.mpay.utils.e.c(paramJSONObject, "result");
        this.a.D = com.unionpay.mpay.utils.e.a(paramJSONObject, "openupgrade_flag");
        com.unionpay.mpay.utils.e.a(paramJSONObject, "temporary_pay_flag");
        this.a.E = com.unionpay.mpay.utils.e.a(paramJSONObject, "temporary_pay_info");
        this.a.I = com.unionpay.mpay.utils.e.a(paramJSONObject, "front_url");
        this.a.J = com.unionpay.mpay.utils.e.a(paramJSONObject, "front_request");
        this.a.p = com.unionpay.mpay.utils.e.a(paramJSONObject, "title");
        this.a.q = com.unionpay.mpay.utils.e.a(paramJSONObject, "succ_info");
        e(8);
        return;
      }
      if (!str.equalsIgnoreCase("03"))
        continue;
      c(com.unionpay.mpay.utils.e.a(paramJSONObject, "fail_msg"));
      return;
    }
    while (this.u > 0);
    c(19);
  }

  public final void a(boolean paramBoolean)
  {
    TextView localTextView = this.p;
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      localTextView.setEnabled(bool);
      return;
    }
  }

  protected final boolean a(String paramString)
  {
    if (this.l == 1)
    {
      g(this.t);
      this.q.a();
      h();
      c(paramString);
      return true;
    }
    return false;
  }

  protected final void b()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    String str = com.unionpay.mpay.b.c.ab.j;
    ag localag = new ag(this.d, str);
    localLayoutParams.addRule(13, -1);
    this.h.addView(localag, localLayoutParams);
  }

  public final void b(String paramString)
  {
  }

  public final void c()
  {
    if ((this.m != null) && (this.m.d()))
      return;
    if ((this.a.l != null) && (this.a.l.length() > 0))
    {
      j();
      return;
    }
    k();
  }

  public final void f(int paramInt)
  {
    this.t = this.s;
    this.s = paramInt;
    String str = ((com.unionpay.pboctransaction.model.b)this.a.O.get(paramInt)).a();
    this.g = false;
    this.l = 1;
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    this.e.d(android.support.v4.app.b.a("1", str, "1", "2"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.n
 * JD-Core Version:    0.6.0
 */