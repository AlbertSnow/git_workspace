package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.widgets.ag;
import com.unionpay.mpay_2.upview.a.b;
import com.unionpay.mpay_2.upview.listview.g.a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ab extends b
  implements a.b, g.a
{
  private int l = 0;
  private int m = -1;
  private Button n = null;
  private com.unionpay.mpay_2.upview.a o = null;
  private com.unionpay.mpay_2.upview.listview.g p = null;

  public ab(Context paramContext)
  {
    super(paramContext);
    this.f = 2;
    setBackgroundColor(-66566);
    b(0);
  }

  private Button m()
  {
    Button localButton = new Button(this.d);
    localButton.setText(com.unionpay.mpay.utils.e.a(this.a.e, "label"));
    localButton.setTextSize(22.0F);
    localButton.setTextColor(-1);
    localButton.setGravity(17);
    localButton.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    localButton.setBackgroundDrawable(this.c.a(2009, -1, -1));
    localButton.setOnClickListener(new i(this));
    return localButton;
  }

  protected final void a()
  {
    int i = 1;
    this.j.removeAllViews();
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    int k = com.unionpay.mpay.a.a.b;
    localLayoutParams.rightMargin = k;
    localLayoutParams.leftMargin = k;
    LinearLayout localLinearLayout2;
    if (g())
    {
      boolean bool = this.a.y;
      localLinearLayout2 = new LinearLayout(this.d);
      localLinearLayout2.setOrientation(i);
      localLinearLayout2.setBackgroundColor(-1);
      if (this.a.k != null)
      {
        this.o = new com.unionpay.mpay_2.upview.a(this.d, this.a.k, this);
        this.o.a();
        localLinearLayout2.addView(this.o);
      }
      if ((this.a.j != null) && (this.a.j.length() > 0))
      {
        com.unionpay.mpay_2.upwidget.e locale = com.unionpay.mpay_2.upwidget.e.a(this.d, null);
        locale.a(com.unionpay.mpay.b.c.ab.f);
        locale.setOnClickListener(new d(this));
        LinearLayout.LayoutParams localLayoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        localLayoutParams10.leftMargin = com.unionpay.mpay.a.a.e;
        localLayoutParams10.topMargin = com.unionpay.mpay.a.a.e;
        localLinearLayout2.addView(locale, localLayoutParams10);
      }
      this.n = m();
      Button localButton = this.n;
      if ((this.o == null) || (this.o.f()))
      {
        localButton.setEnabled(i);
        LinearLayout.LayoutParams localLayoutParams7 = new LinearLayout.LayoutParams(-1, com.unionpay.mpay.a.a.j);
        localLayoutParams7.topMargin = com.unionpay.mpay.a.a.e;
        localLinearLayout2.addView(this.n, localLayoutParams7);
        if (!bool)
        {
          String str3 = com.unionpay.mpay.utils.e.a(this.a.m, "label");
          if ((this.a.m != null) && (str3.length() > 0))
          {
            TextView localTextView4 = new TextView(this.d);
            localTextView4.setText(com.unionpay.mpay.b.c.ab.e);
            localTextView4.setTextSize(14.0F);
            localTextView4.setTextColor(-6710887);
            LinearLayout.LayoutParams localLayoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            localLayoutParams8.topMargin = com.unionpay.mpay.a.a.e;
            localLayoutParams8.leftMargin = com.unionpay.mpay.a.a.e;
            localLinearLayout2.addView(localTextView4, localLayoutParams8);
            Drawable localDrawable3 = this.c.a(1012, -1, -1);
            Drawable localDrawable4 = this.c.a(1001, -1, -1);
            com.unionpay.mpay_2.upwidget.f localf3 = com.unionpay.mpay_2.upwidget.f.a(this.d, localDrawable3, localDrawable4);
            localf3.a(str3);
            localf3.a(20.0F);
            localf3.setOnClickListener(new f(this));
            LinearLayout.LayoutParams localLayoutParams9 = new LinearLayout.LayoutParams(-1, -2);
            localLayoutParams9.topMargin = com.unionpay.mpay.a.a.e;
            localLinearLayout2.addView(localf3, localLayoutParams9);
          }
        }
      }
    }
    LinearLayout localLinearLayout1;
    for (Object localObject = localLinearLayout2; ; localObject = localLinearLayout1)
    {
      this.j.addView((View)localObject, localLayoutParams);
      return;
      int j = 0;
      break;
      localLinearLayout1 = new LinearLayout(this.d);
      localLinearLayout1.setOrientation(j);
      localLinearLayout1.setBackgroundColor(-1);
      TextView localTextView1 = new TextView(this.d);
      localTextView1.setText(com.unionpay.mpay.b.c.ab.c);
      localTextView1.setTextSize(17.0F);
      localTextView1.setTextColor(-15365480);
      localTextView1.getPaint().setFakeBoldText(j);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams1.topMargin = com.unionpay.mpay.a.a.a;
      localLayoutParams1.leftMargin = com.unionpay.mpay.a.a.e;
      localLinearLayout1.addView(localTextView1, localLayoutParams1);
      TextView localTextView2 = new TextView(this.d);
      localTextView2.setText(com.unionpay.mpay.b.c.ab.d);
      localTextView2.setTextSize(14.0F);
      localTextView2.setTextColor(-6710887);
      localLinearLayout1.addView(localTextView2, localLayoutParams1);
      this.p = new com.unionpay.mpay_2.upview.listview.g(this.d, this.a, this);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams2.topMargin = com.unionpay.mpay.a.a.e;
      localLinearLayout1.addView(this.p, localLayoutParams2);
      this.n = m();
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-1, com.unionpay.mpay.a.a.j);
      localLayoutParams3.topMargin = com.unionpay.mpay.a.a.e;
      localLinearLayout1.addView(this.n, localLayoutParams3);
      String str1 = com.unionpay.mpay.utils.e.a(this.a.n, "label");
      String str2 = com.unionpay.mpay.utils.e.a(this.a.m, "label");
      if (((str1 == null) || (str1.length() <= 0)) && ((str2 == null) || (str2.length() <= 0)))
        continue;
      TextView localTextView3 = new TextView(this.d);
      localTextView3.setText(com.unionpay.mpay.b.c.ab.e);
      localTextView3.setTextSize(14.0F);
      localTextView3.setTextColor(-6710887);
      LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams4.topMargin = com.unionpay.mpay.a.a.e;
      localLayoutParams4.leftMargin = com.unionpay.mpay.a.a.e;
      localLinearLayout1.addView(localTextView3, localLayoutParams4);
      Drawable localDrawable1 = this.c.a(1012, -1, -1);
      Drawable localDrawable2 = this.c.a(1001, -1, -1);
      if ((this.a.n != null) && (str1.length() > 0))
      {
        com.unionpay.mpay_2.upwidget.f localf2 = com.unionpay.mpay_2.upwidget.f.a(this.d, localDrawable1, localDrawable2);
        localf2.a(str1);
        localf2.setOnClickListener(new g(this));
        localf2.a(20.0F);
        LinearLayout.LayoutParams localLayoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        localLayoutParams6.topMargin = com.unionpay.mpay.a.a.e;
        localLinearLayout1.addView(localf2, localLayoutParams6);
      }
      if ((this.a.m == null) || (str2.length() <= 0))
        continue;
      com.unionpay.mpay_2.upwidget.f localf1 = com.unionpay.mpay_2.upwidget.f.a(this.d, localDrawable1, localDrawable2);
      localf1.a(str2);
      localf1.a(20.0F);
      localf1.setOnClickListener(new h(this));
      LinearLayout.LayoutParams localLayoutParams5 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams5.topMargin = com.unionpay.mpay.a.a.e;
      localLinearLayout1.addView(localf1, localLayoutParams5);
    }
  }

  public final void a(com.unionpay.mpay_2.upview.c paramc)
  {
  }

  public final void a(JSONObject paramJSONObject)
  {
    this.b.c();
    switch (this.l)
    {
    default:
      return;
    case 2:
      int k = android.support.v4.app.b.a(this.a, paramJSONObject, false);
      if (k != 0)
        c(k);
      while (true)
      {
        this.l = 0;
        return;
        if ((this.a.o != null) && (this.a.o.length() > 0))
        {
          e(6);
          continue;
        }
        if ((this.a.s == null) || (this.a.s.length() <= 0))
          continue;
        e(5);
      }
    case 1:
      com.unionpay.uppay.b localb = this.a;
      localb.K = com.unionpay.mpay.utils.e.c(paramJSONObject, "login_rules");
      localb.L = com.unionpay.mpay.utils.e.b(paramJSONObject, "register_url");
      if ((localb.K != null) && (localb.K.length() > 0))
        break;
    case 3:
    case 4:
    }
    for (int j = 2; ; j = 0)
    {
      if (j != 0)
        c(2);
      while (true)
      {
        this.l = 0;
        return;
        e(12);
      }
      this.p.c(this.m);
      if ((this.a.h == null) || (this.a.h.size() <= 0))
      {
        this.a.B = -1;
        a();
      }
      this.l = 0;
      return;
      int i = android.support.v4.app.b.b(this.a, paramJSONObject);
      if (i != 0)
      {
        c(i);
        return;
      }
      e(13);
      this.l = 0;
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    Button localButton;
    if ((this.n != null) && (this.n != null))
    {
      localButton = this.n;
      if (paramBoolean)
        break label31;
    }
    label31: for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  protected final void b()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    String str = this.a.f;
    ag localag = new ag(this.d, str);
    localLayoutParams.addRule(13, -1);
    this.h.addView(localag, localLayoutParams);
  }

  public final void b(String paramString)
  {
  }

  public final void c()
  {
    if (this.a.y)
    {
      super.c();
      this.a.y = false;
      return;
    }
    k localk = new k(this);
    l locall = new l(this);
    this.b.a(localk, locall);
    this.b.a(com.unionpay.mpay.b.c.ab.E, com.unionpay.mpay.b.c.ab.L, com.unionpay.mpay.b.c.ab.C, com.unionpay.mpay.b.c.ab.D);
  }

  public final void f(int paramInt)
  {
    this.m = paramInt;
    if (this.m == -1);
    while (true)
    {
      return;
      if (((com.unionpay.pboctransaction.model.b)this.a.h.get(paramInt)).d() == 0)
        break;
      if (this.p == null)
        continue;
      this.p.a();
      return;
    }
    this.l = 3;
    this.g = false;
    this.b.a(com.unionpay.mpay.b.c.ab.B);
    this.e.g(((com.unionpay.pboctransaction.model.b)this.a.h.get(paramInt)).a());
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.o != null)
      this.o.clearFocus();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.ab
 * JD-Core Version:    0.6.0
 */