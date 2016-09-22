package com.unionpay.mpay_2.upwidget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.utils.d;

public final class e extends LinearLayout
{
  private Context a = null;
  private TextView b = null;

  private e(Context paramContext, Drawable paramDrawable)
  {
    super(paramContext);
    this.a = paramContext;
    setOrientation(0);
    Context localContext = this.a;
    if (paramDrawable != null)
    {
      ImageView localImageView = new ImageView(localContext);
      localImageView.setBackgroundDrawable(paramDrawable);
      int i = a.x;
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i, i);
      localLayoutParams1.gravity = 16;
      addView(localImageView, localLayoutParams1);
    }
    this.b = new TextView(localContext);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.gravity = 16;
    if (paramDrawable != null)
      localLayoutParams2.leftMargin = a.c;
    addView(this.b, localLayoutParams2);
  }

  public static e a(Context paramContext, Drawable paramDrawable)
  {
    e locale = new e(paramContext, paramDrawable);
    if (locale.b != null)
      locale.b.setTextSize(16.0F);
    locale.a(d.a(-16758391, -65536));
    return locale;
  }

  public final void a(ColorStateList paramColorStateList)
  {
    if (this.b != null)
      this.b.setTextColor(paramColorStateList);
  }

  public final void a(String paramString)
  {
    Spanned localSpanned = Html.fromHtml(paramString);
    if (this.b != null)
      this.b.setText(localSpanned);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.b != null)
      this.b.setOnClickListener(paramOnClickListener);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upwidget.e
 * JD-Core Version:    0.6.0
 */