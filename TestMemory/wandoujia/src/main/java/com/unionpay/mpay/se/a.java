package com.unionpay.mpay.se;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.aw;
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
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends com.unionpay.mpay.views.b
  implements Handler.Callback, a.b
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
  private Handler u = null;
  private View.OnClickListener v = new b(this);
  private View.OnClickListener w = new d(this);

  public a(Context paramContext)
  {
    super(paramContext);
    this.f = 6;
    setBackgroundColor(-66566);
    b(1);
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
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setId(localLinearLayout1.hashCode());
    localLinearLayout1.setOrientation(1);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    this.j.addView(localLinearLayout1, localLayoutParams1);
    this.s = new com.unionpay.mpay_2.upview.a(this.d, this.a.o, this.e.b(), this, this.a.aa, false);
    localLinearLayout1.addView(this.s);
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setOrientation(1);
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
    this.r.setText(com.unionpay.mpay.utils.e.a(this.a.r, "label"));
    this.r.setTextSize(22.0F);
    this.r.setTextColor(-1);
    this.r.setGravity(17);
    TextView localTextView = this.r;
    boolean bool1;
    if (this.s != null)
    {
      boolean bool2 = this.s.f();
      bool1 = false;
      if (!bool2);
    }
    else
    {
      bool1 = true;
    }
    localTextView.setEnabled(bool1);
    this.r.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    int i = com.unionpay.mpay.a.a.j;
    Drawable localDrawable = this.c.a(2009, -1, -1);
    this.r.setBackgroundDrawable(localDrawable);
    this.r.setOnClickListener(this.v);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, i);
    localLayoutParams3.addRule(3, localLinearLayout2.getId());
    localLayoutParams3.topMargin = com.unionpay.mpay.a.a.e;
    this.j.addView(this.r, localLayoutParams3);
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
    this.t = false;
    switch (this.n)
    {
    case 2:
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
        int i = android.support.v4.app.b.a(this.a, paramJSONObject, false);
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
        this.l = com.unionpay.mpay.utils.e.a(paramJSONObject, "status");
        if ((this.o > 0) && (this.l.equalsIgnoreCase("01")))
        {
          f(this.m);
          return;
        }
        this.n = 0;
        if (this.l.equalsIgnoreCase("00"))
        {
          h();
          this.n = 0;
          this.a.w = com.unionpay.mpay.utils.e.c(paramJSONObject, "result");
          this.a.D = com.unionpay.mpay.utils.e.a(paramJSONObject, "openupgrade_flag");
          com.unionpay.mpay.utils.e.a(paramJSONObject, "temporary_pay_flag");
          this.a.E = com.unionpay.mpay.utils.e.a(paramJSONObject, "temporary_pay_info");
          this.a.I = com.unionpay.mpay.utils.e.a(paramJSONObject, "front_url");
          this.a.J = com.unionpay.mpay.utils.e.a(paramJSONObject, "front_request");
          this.a.p = com.unionpay.mpay.utils.e.a(paramJSONObject, "title");
          this.a.q = com.unionpay.mpay.utils.e.a(paramJSONObject, "succ_info");
          if (this.s != null)
            this.s.g();
          e(8);
          return;
        }
        if (!this.l.equalsIgnoreCase("03"))
          continue;
        String str = com.unionpay.mpay.utils.e.a(paramJSONObject, "fail_msg");
        if (this.n == 3)
        {
          c(str);
          return;
        }
        e locale = new e(this);
        f localf = new f(this);
        if (this.a.u)
        {
          this.b.a(locale, localf);
          this.b.a(com.unionpay.mpay.b.c.ab.E, str, com.unionpay.mpay.b.c.ab.C, com.unionpay.mpay.b.c.ab.D);
          return;
        }
        this.b.a(locale, null);
        this.b.a(com.unionpay.mpay.b.c.ab.E, str, com.unionpay.mpay.b.c.ab.C);
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
    this.t = false;
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
    if ((this.a.z) && (this.t))
    {
      this.a.z = false;
      k();
      return;
    }
    this.a.z = false;
    j();
  }

  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null)
    {
      Bundle localBundle = (Bundle)paramMessage.obj;
      String str1 = localBundle.getString("action_resp_code");
      String str2 = localBundle.getString("action_resp_message");
      if (!"0000".equalsIgnoreCase(str1))
        break label56;
      if (str2 != null)
        a(0, str2);
    }
    while (true)
    {
      return true;
      label56: a(this.a.Y, false);
    }
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.s.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.se.a
 * JD-Core Version:    0.6.0
 */