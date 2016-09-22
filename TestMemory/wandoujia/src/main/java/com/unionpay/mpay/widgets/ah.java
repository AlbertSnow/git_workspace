package com.unionpay.mpay.widgets;

import android.content.Context;
import android.text.TextPaint;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.utils.e;
import org.json.JSONObject;

abstract class ah extends LinearLayout
{
  protected Context a = null;
  protected boolean b = false;
  protected String c = null;
  protected RelativeLayout d = null;
  private int e = -16777216;
  private int f = -7829368;
  private String g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  private String k = null;
  private String l = null;
  private TextView m = null;
  private boolean n = false;

  public ah(Context paramContext, JSONObject paramJSONObject)
  {
    super(paramContext);
    this.a = paramContext;
    this.j = e.a(paramJSONObject, "label");
    this.l = e.a(paramJSONObject, "placeholder");
    this.k = e.a(paramJSONObject, "tip");
    this.g = e.a(paramJSONObject, "name");
    this.h = e.a(paramJSONObject, "value");
    this.i = e.a(paramJSONObject, "type");
    this.c = e.a(paramJSONObject, "regexp");
    String str = e.a(paramJSONObject, "readonly");
    if ((str != null) && (str.equalsIgnoreCase("true")))
      this.b = true;
    boolean bool;
    if (e.a(paramJSONObject, "margin").length() > 0)
      bool = true;
    while (true)
    {
      this.n = bool;
      setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      setBackgroundColor(0);
      setOrientation(1);
      setPadding(2, 2, 2, 2);
      if (this.i.equalsIgnoreCase("string"))
        break;
      this.m = new TextView(this.a);
      this.m.setTextSize(20.0F);
      this.m.setText(this.j);
      this.m.setTextColor(this.e);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams1.leftMargin = a.e;
      addView(this.m, localLayoutParams1);
      if ((this.j == null) || (this.j.length() == 0))
        this.m.setVisibility(8);
      d();
      if ((this.k == null) || (this.k.length() <= 0))
      {
        return;
        bool = false;
        continue;
      }
      TextView localTextView = new TextView(this.a);
      localTextView.setTextSize(15.0F);
      localTextView.setTextColor(this.f);
      localTextView.setText(this.k);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      if (this.n == true);
      for (int i1 = a.c; ; i1 = localLayoutParams2.leftMargin)
      {
        localLayoutParams2.leftMargin = i1;
        addView(localTextView, localLayoutParams2);
        return;
      }
    }
    d();
  }

  private void d()
  {
    this.d = new RelativeLayout(this.a);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    addView(this.d, localLayoutParams);
  }

  public final String j()
  {
    return this.g;
  }

  public final String k()
  {
    return this.j;
  }

  public final String l()
  {
    return this.l;
  }

  public String m()
  {
    return this.h;
  }

  protected final void n()
  {
    if (this.m != null)
      this.m.setTextColor(-15365480);
  }

  protected final void o()
  {
    if (this.m != null)
      this.m.setTextSize(17.0F);
  }

  protected final void p()
  {
    if (this.m != null)
      this.m.getPaint().setFakeBoldText(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.ah
 * JD-Core Version:    0.6.0
 */