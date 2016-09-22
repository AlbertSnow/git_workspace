package com.unionpay.mpay_2.upwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.c.c;
import com.unionpay.mpay.utils.d;
import com.unionpay.mpay.utils.e;
import org.json.JSONObject;

public final class a extends LinearLayout
{
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private Button j = null;
  private boolean k = false;
  private Context l = null;
  private float m = 0.0F;
  private View.OnClickListener n = new b(this);

  public a(Context paramContext, JSONObject paramJSONObject, View.OnClickListener paramOnClickListener)
  {
    this(paramContext, paramJSONObject, paramOnClickListener, 0);
  }

  private a(Context paramContext, JSONObject paramJSONObject, View.OnClickListener paramOnClickListener, byte paramByte)
  {
    super(paramContext);
    this.l = paramContext;
    this.m = 16.0F;
    this.a = e.a(paramJSONObject, "name");
    this.b = e.a(paramJSONObject, "value");
    this.c = e.a(paramJSONObject, "label");
    this.d = e.a(paramJSONObject, "href_label");
    this.e = e.a(paramJSONObject, "href_url");
    this.f = e.a(paramJSONObject, "href_title");
    this.g = e.a(paramJSONObject, "checked");
    this.h = e.a(paramJSONObject, "required");
    this.i = e.a(paramJSONObject, "error_info");
    this.j = new Button(this.l);
    if ((a(this.g)) && (this.g.equalsIgnoreCase("0")));
    for (this.k = true; ; this.k = false)
    {
      this.j.setOnClickListener(this.n);
      f();
      int i1 = com.unionpay.mpay.a.a.x;
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i1, i1);
      addView(this.j, localLayoutParams1);
      if (a(this.c))
      {
        TextView localTextView1 = new TextView(this.l);
        localTextView1.setText(this.c);
        localTextView1.setTextSize(this.m);
        localTextView1.setTextColor(-16777216);
        localTextView1.setOnClickListener(this.n);
        LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams2.gravity = 16;
        localLayoutParams2.leftMargin = com.unionpay.mpay.a.a.c;
        addView(localTextView1, localLayoutParams2);
      }
      if ((a(this.d)) && (a(this.e)))
      {
        TextView localTextView2 = new TextView(this.l);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.d;
        localTextView2.setText(Html.fromHtml(String.format("<u>%s</u>", arrayOfObject)));
        localTextView2.setTextSize(this.m);
        localTextView2.setOnClickListener(paramOnClickListener);
        localTextView2.setTextColor(d.a(-13601621, -15909519));
        LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams3.gravity = 16;
        addView(localTextView2, localLayoutParams3);
      }
      return;
    }
  }

  private static boolean a(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0);
  }

  private void f()
  {
    if (this.j == null)
      return;
    if (this.k);
    for (int i1 = 1010; ; i1 = 1009)
    {
      Drawable localDrawable = c.a(this.l).a(i1, com.unionpay.mpay.a.a.p, com.unionpay.mpay.a.a.p);
      this.j.setBackgroundDrawable(localDrawable);
      return;
    }
  }

  public final String a()
  {
    if (this.k);
    for (String str = this.b; ; str = "")
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.a;
      arrayOfObject[1] = str;
      return String.format("\"%s\":\"%s\"", arrayOfObject);
    }
  }

  public final String b()
  {
    return this.i;
  }

  public final String c()
  {
    return this.e;
  }

  public final String d()
  {
    return this.f;
  }

  public final boolean e()
  {
    boolean bool = true;
    if ((a(this.h)) && (this.h.equalsIgnoreCase("0")))
      bool = this.k;
    return bool;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upwidget.a
 * JD-Core Version:    0.6.0
 */