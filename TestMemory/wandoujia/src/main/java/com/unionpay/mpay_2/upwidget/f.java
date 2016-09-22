package com.unionpay.mpay_2.upwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.utils.d;

public final class f extends RelativeLayout
{
  private TextView a = null;

  private f(Context paramContext, Drawable paramDrawable1, Drawable paramDrawable2)
  {
    super(paramContext);
    this.a = new TextView(paramContext);
    this.a.setGravity(16);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, a.j);
    localLayoutParams1.leftMargin = a.a;
    localLayoutParams1.addRule(15, -1);
    localLayoutParams1.addRule(9, -1);
    addView(this.a, localLayoutParams1);
    if (paramDrawable2 != null)
    {
      ImageView localImageView = new ImageView(paramContext);
      localImageView.setBackgroundDrawable(paramDrawable2);
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams2.rightMargin = a.a;
      localLayoutParams2.addRule(15, -1);
      localLayoutParams2.addRule(11, -1);
      addView(localImageView, localLayoutParams2);
    }
    setBackgroundDrawable(d.a(paramDrawable1, d.a(false)));
  }

  public static f a(Context paramContext, Drawable paramDrawable1, Drawable paramDrawable2)
  {
    f localf = new f(paramContext, paramDrawable1, paramDrawable2);
    localf.a(16.0F);
    return localf;
  }

  public final void a(float paramFloat)
  {
    if (this.a != null)
      this.a.setTextSize(paramFloat);
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (this.a != null)
      this.a.setText(paramCharSequence);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upwidget.f
 * JD-Core Version:    0.6.0
 */