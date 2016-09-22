package com.unionpay.mpay.widgets;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.c.c;

public final class k
{
  private Context a = null;
  private TextView b = null;
  private View.OnClickListener c = null;
  private TextView d = null;
  private View.OnClickListener e = null;
  private int f = 0;
  private c g = null;
  private Dialog h = null;
  private Drawable i = null;
  private DialogInterface.OnDismissListener j = null;

  public k(Context paramContext, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    this.a = paramContext;
    this.j = paramOnDismissListener;
    this.g = c.a(paramContext);
    this.f = (a.B - 4 * a.a);
    int k = this.f / 2;
    this.i = this.g.a(1033, k, -1);
  }

  private RelativeLayout a(Context paramContext)
  {
    c();
    this.h = new o(paramContext);
    this.h.setOnDismissListener(this.j);
    this.h.setCanceledOnTouchOutside(false);
    this.h.setOwnerActivity((Activity)paramContext);
    this.h.requestWindowFeature(1);
    this.h.getWindow().setBackgroundDrawable(this.g.a(4004, -1, -1));
    RelativeLayout localRelativeLayout1 = new RelativeLayout(this.a);
    this.h.getWindow().setBackgroundDrawable(this.g.a(4004, -1, -1));
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(this.f, -2);
    this.h.setContentView(localRelativeLayout1, localLayoutParams1);
    RelativeLayout localRelativeLayout2 = new RelativeLayout(this.a);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(13, -1);
    localRelativeLayout1.addView(localRelativeLayout2, localLayoutParams2);
    return localRelativeLayout1;
  }

  private boolean d()
  {
    return ((Activity)this.a).isFinishing();
  }

  public final void a(View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    this.c = paramOnClickListener1;
    this.e = paramOnClickListener2;
  }

  public final void a(String paramString)
  {
    RelativeLayout localRelativeLayout = a(this.a);
    LinearLayout localLinearLayout1 = new LinearLayout(this.a);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setGravity(17);
    int k = a.h;
    int m = this.f - (k << 1);
    ImageView localImageView = new ImageView(this.a);
    localImageView.setImageDrawable(this.i);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(m, -2);
    localLayoutParams1.topMargin = (k << 1);
    localLinearLayout1.addView(localImageView, localLayoutParams1);
    TextView localTextView = new TextView(this.a);
    localTextView.setTextSize(18.0F);
    localTextView.setTextColor(-13421773);
    localTextView.setText(paramString);
    localTextView.setGravity(16);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.topMargin = k;
    localLinearLayout1.addView(localTextView, localLayoutParams2);
    LinearLayout localLinearLayout2 = new LinearLayout(this.a);
    localLinearLayout2.setOrientation(0);
    localLinearLayout2.setGravity(17);
    int n = a.l;
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(n, n);
    localLayoutParams3.bottomMargin = k;
    localLayoutParams3.topMargin = k;
    localLinearLayout1.addView(new ProgressBar(this.a), localLayoutParams3);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(10, -1);
    localLayoutParams.addRule(14, -1);
    localRelativeLayout.addView(localLinearLayout1, localLayoutParams);
    if ((this.h != null) && (!this.h.isShowing()) && (!d()))
      this.h.show();
  }

  public final void a(String paramString1, String paramString2, String paramString3)
  {
    RelativeLayout localRelativeLayout = a(this.a);
    int k = a.a;
    LinearLayout localLinearLayout1 = new LinearLayout(this.a);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setGravity(1);
    localRelativeLayout.addView(localLinearLayout1, new LinearLayout.LayoutParams(-1, -2));
    if ((paramString1 != null) && (paramString1.length() != 0))
    {
      TextView localTextView2 = new TextView(this.a);
      localTextView2.setTextSize(20.0F);
      localTextView2.setTextColor(-16758391);
      localTextView2.setText(paramString1);
      localTextView2.setGravity(17);
      localTextView2.setPadding(k, k << 1, k, k);
      localLinearLayout1.addView(localTextView2, new LinearLayout.LayoutParams(-1, -2));
    }
    TextView localTextView1 = new TextView(this.a);
    localTextView1.setTextSize(18.0F);
    localTextView1.setTextColor(-13421773);
    localTextView1.setText(paramString2);
    localTextView1.setPadding(k, k, k, 0);
    localTextView1.setGravity(17);
    localLinearLayout1.addView(localTextView1, new LinearLayout.LayoutParams(-1, -2));
    FrameLayout localFrameLayout = new FrameLayout(this.a);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams1.topMargin = (a.a << 1);
    localLinearLayout1.addView(localFrameLayout, localLayoutParams1);
    LinearLayout localLinearLayout2 = new LinearLayout(this.a);
    localFrameLayout.addView(localLinearLayout2, new LinearLayout.LayoutParams(-1, -2));
    localLinearLayout2.setOrientation(0);
    localLinearLayout2.setGravity(17);
    this.b = new TextView(this.a);
    this.b.setText(paramString3);
    this.b.setTextSize(18.0F);
    this.b.setTextColor(-1);
    this.b.setGravity(17);
    int m = a.k;
    Drawable localDrawable = this.g.a(2005, -1, -1);
    this.b.setBackgroundDrawable(localDrawable);
    if (this.c != null)
      this.b.setOnClickListener(this.c);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, m);
    localLinearLayout2.addView(this.b, localLayoutParams2);
    localFrameLayout.addView(new g(this.a, -1), new FrameLayout.LayoutParams(-1, a.A));
    if ((this.h != null) && (!this.h.isShowing()) && (!d()))
      this.h.show();
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    RelativeLayout localRelativeLayout = a(this.a);
    int k = a.a;
    LinearLayout localLinearLayout1 = new LinearLayout(this.a);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setGravity(1);
    localRelativeLayout.addView(localLinearLayout1, new LinearLayout.LayoutParams(-1, -2));
    if ((paramString1 != null) && (paramString1.length() != 0))
    {
      TextView localTextView2 = new TextView(this.a);
      localTextView2.setTextSize(20.0F);
      localTextView2.setTextColor(-16758391);
      localTextView2.setText(paramString1);
      localTextView2.setGravity(17);
      localTextView2.setPadding(k, k << 1, k, k);
      localLinearLayout1.addView(localTextView2, new LinearLayout.LayoutParams(-1, -2));
    }
    TextView localTextView1 = new TextView(this.a);
    localTextView1.setTextSize(18.0F);
    localTextView1.setTextColor(-13421773);
    localTextView1.setText(paramString2);
    localTextView1.setPadding(k, k, k, 0);
    localTextView1.setGravity(17);
    localLinearLayout1.addView(localTextView1, new LinearLayout.LayoutParams(-1, -2));
    FrameLayout localFrameLayout = new FrameLayout(this.a);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams1.topMargin = (a.a << 1);
    localLinearLayout1.addView(localFrameLayout, localLayoutParams1);
    LinearLayout localLinearLayout2 = new LinearLayout(this.a);
    localFrameLayout.addView(localLinearLayout2, new LinearLayout.LayoutParams(-1, -2));
    localLinearLayout2.setOrientation(0);
    localLinearLayout2.setGravity(17);
    int m = this.f - a.A >> 1;
    this.b = new TextView(this.a);
    this.b.setText(paramString3);
    this.b.setTextSize(18.0F);
    this.b.setTextColor(-1);
    this.b.setGravity(17);
    int n = a.k;
    Drawable localDrawable1 = this.g.a(2001, -1, -1);
    this.b.setBackgroundDrawable(localDrawable1);
    if (this.c != null)
      this.b.setOnClickListener(this.c);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(m, n);
    localLinearLayout2.addView(this.b, localLayoutParams2);
    localLinearLayout2.addView(new g(this.a, -1, 1), new LinearLayout.LayoutParams(a.A, n));
    this.d = new TextView(this.a);
    this.d.setText(paramString4);
    this.d.setTextSize(18.0F);
    this.d.setTextColor(-1);
    this.d.setGravity(17);
    Drawable localDrawable2 = this.g.a(2002, -1, -1);
    this.d.setBackgroundDrawable(localDrawable2);
    if (this.e != null)
      this.d.setOnClickListener(this.e);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(m, n);
    localLinearLayout2.addView(this.d, localLayoutParams3);
    localFrameLayout.addView(new g(this.a, -1), new FrameLayout.LayoutParams(-1, a.A));
    if ((this.h != null) && (!this.h.isShowing()) && (!d()))
      this.h.show();
  }

  public final boolean a()
  {
    return (this.h != null) && (this.h.isShowing());
  }

  public final void b()
  {
    if (this.h != null)
    {
      this.h.hide();
      this.h.show();
    }
  }

  public final void c()
  {
    if ((this.h != null) && (this.h.isShowing()))
    {
      this.h.dismiss();
      this.h = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.k
 * JD-Core Version:    0.6.0
 */