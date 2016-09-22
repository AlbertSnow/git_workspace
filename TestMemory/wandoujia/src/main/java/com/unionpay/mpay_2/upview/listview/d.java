package com.unionpay.mpay_2.upview.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;

public final class d extends RelativeLayout
{
  private Context a = null;
  private TextView b = null;
  private ImageView c = null;

  public d(Context paramContext, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3)
  {
    super(paramContext);
    this.a = paramContext;
    if (paramDrawable1 != null)
      setBackgroundDrawable(paramDrawable1);
    int i = a.a;
    setPadding(i, i, i, i);
    LinearLayout localLinearLayout;
    if (paramDrawable2 == null)
    {
      localLinearLayout = null;
      if (paramDrawable3 == null);
    }
    else
    {
      localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setGravity(16);
      localLinearLayout.setOrientation(0);
      localLinearLayout.setId(localLinearLayout.hashCode());
      if (paramDrawable3 != null)
      {
        ImageView localImageView = new ImageView(paramContext);
        localImageView.setId(localImageView.hashCode());
        localImageView.setBackgroundDrawable(paramDrawable3);
        localLinearLayout.addView(localImageView);
      }
      if (paramDrawable2 != null)
      {
        this.c = new ImageView(this.a);
        this.c.setBackgroundDrawable(paramDrawable2);
        int k = a.z;
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(k, k);
        localLayoutParams.leftMargin = a.b;
        localLinearLayout.addView(this.c, localLayoutParams);
      }
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, a.s);
      localLayoutParams2.addRule(11, -1);
      localLayoutParams2.addRule(15, -1);
      localLayoutParams2.rightMargin = a.a;
      addView(localLinearLayout, localLayoutParams2);
    }
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, a.s);
    localLayoutParams1.addRule(9, -1);
    if (localLinearLayout != null)
      localLayoutParams1.addRule(0, localLinearLayout.getId());
    localLayoutParams1.addRule(15, -1);
    int j = a.b;
    localLayoutParams1.leftMargin = j;
    localLayoutParams1.rightMargin = j;
    this.b = new TextView(paramContext);
    this.b.setTextSize(20.0F);
    this.b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    this.b.setGravity(16);
    this.b.setSingleLine();
    addView(this.b, localLayoutParams1);
  }

  public final void a(int paramInt)
  {
    if (this.c != null)
      this.c.setTag(Integer.valueOf(paramInt));
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    if (this.c != null)
      this.c.setOnClickListener(paramOnClickListener);
  }

  public final void a(String paramString)
  {
    if (this.b != null)
      this.b.setText(Html.fromHtml(paramString));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.listview.d
 * JD-Core Version:    0.6.0
 */