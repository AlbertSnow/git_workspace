package com.unionpay.mpay_2.upwidget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import org.json.JSONObject;

public final class d extends LinearLayout
{
  private String a = null;
  private e b = null;

  private d(Context paramContext, String paramString1, String paramString2, Drawable paramDrawable)
  {
    super(paramContext);
    setOrientation(0);
    this.a = paramString2;
    this.b = e.a(paramContext, paramDrawable);
    this.b.a(String.format("<u>%s</u>", new Object[] { paramString1 }));
    ColorStateList localColorStateList = com.unionpay.mpay.utils.d.a(-13601621, -15909519);
    this.b.a(localColorStateList);
    addView(this.b);
  }

  public static final d a(Context paramContext, JSONObject paramJSONObject, Drawable paramDrawable)
  {
    d locald = null;
    if (paramJSONObject != null)
      locald = new d(paramContext, com.unionpay.mpay.utils.e.a(paramJSONObject, "label"), com.unionpay.mpay.utils.e.a(paramJSONObject, "href"), paramDrawable);
    return locald;
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    if (this.b != null)
      this.b.setOnClickListener(paramOnClickListener);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upwidget.d
 * JD-Core Version:    0.6.0
 */