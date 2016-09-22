package com.unionpay.mpay_2.upwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.unionpay.mpay.a.a;

public final class c extends LinearLayout
{
  private Context a = null;
  private CheckBox b = null;
  private com.unionpay.mpay.c.c c = null;

  private c(Context paramContext, String paramString)
  {
    super(paramContext);
    this.a = paramContext;
    this.c = com.unionpay.mpay.c.c.a(this.a);
    setOrientation(0);
    this.b = new CheckBox(this.a);
    this.b.setChecked(true);
    this.b.setPadding(this.b.getPaddingLeft() + a.b, this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
    this.b.setText(paramString);
    Drawable localDrawable = this.c.a(2004, a.p, a.p);
    this.b.setButtonDrawable(localDrawable);
    this.b.setTextSize(16.0F);
    this.b.setTextColor(-16777216);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    addView(this.b, localLayoutParams);
  }

  public static c a(Context paramContext, String paramString)
  {
    return new c(paramContext, paramString);
  }

  public final boolean a()
  {
    if (this.b != null)
      return this.b.isChecked();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upwidget.c
 * JD-Core Version:    0.6.0
 */