package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.c.c;

public final class ag extends RelativeLayout
{
  private Context a = null;
  private int b = 0;

  public ag(Context paramContext, String paramString)
  {
    this(paramContext, paramString, 0);
  }

  private ag(Context paramContext, String paramString, byte paramByte)
  {
    super(paramContext);
    this.a = paramContext;
    this.b = a.i;
    setLayoutParams(new RelativeLayout.LayoutParams(-1, this.b));
    setBackgroundColor(-15171651);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, this.b);
    localLayoutParams1.addRule(15, -1);
    localLayoutParams1.addRule(11, -1);
    localLayoutParams1.rightMargin = a.a;
    TextView localTextView = new TextView(this.a);
    localTextView.setTextSize(20.0F);
    localTextView.setTextColor(-1);
    localTextView.setText(paramString);
    localTextView.setGravity(16);
    addView(localTextView, localLayoutParams1);
    int i = a.d;
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(a.w, a.v);
    localLayoutParams2.addRule(9, -1);
    localLayoutParams2.addRule(15, -1);
    localLayoutParams2.leftMargin = i;
    Drawable localDrawable = c.a(this.a).a(1034, -1, -1);
    ImageView localImageView = new ImageView(this.a);
    localImageView.setBackgroundDrawable(localDrawable);
    addView(localImageView, localLayoutParams2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.ag
 * JD-Core Version:    0.6.0
 */