package com.tencent.open.yyb;

import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class TitleBar extends RelativeLayout
{
  private float a;
  private ImageView b;
  private ImageView c;
  private TextView d;
  private RelativeLayout e;

  public TitleBar(Context paramContext)
  {
    super(paramContext);
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.a = localDisplayMetrics.density;
    setLayoutParams(new RelativeLayout.LayoutParams(-1, a(51.0F)));
    setBackgroundDrawable(a.a("yyb_topbar.9.png", paramContext));
    this.e = new RelativeLayout(getContext());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -1);
    this.e.setLayoutParams(localLayoutParams1);
    addView(this.e);
    this.b = new ImageView(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(a(11.0F), a(18.0F));
    localLayoutParams2.addRule(15);
    localLayoutParams2.leftMargin = a(20.0F);
    this.b.setId(10000);
    this.b.setLayoutParams(localLayoutParams2);
    this.b.setClickable(true);
    this.b.setBackgroundDrawable(a.a("yyb_icon_back.png", getContext()));
    this.b.setPadding(a(15.0F), a(7.0F), a(20.0F), a(7.0F));
    this.e.addView(this.b);
    this.d = new TextView(getContext());
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams3.addRule(15);
    localLayoutParams3.addRule(1, 10000);
    localLayoutParams3.leftMargin = a(20.0F);
    this.d.setTextColor(Color.parseColor("#fefefe"));
    this.d.setTextSize(20.0F);
    this.d.setShadowLayer(2.0F, 0.0F, 2.0F, Color.parseColor("#2E000000"));
    this.e.addView(this.d, localLayoutParams3);
    this.c = new ImageView(getContext());
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(a(52.0F), a(52.0F));
    localLayoutParams4.addRule(15);
    localLayoutParams4.addRule(11);
    ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    this.c.setLayoutParams(localLayoutParams4);
    this.c.setClickable(true);
    this.c.setBackgroundDrawable(a.a("yyb_appdetail_showmore.png", getContext()));
    addView(this.c);
  }

  private int a(float paramFloat)
  {
    return (int)(0.5F + paramFloat * this.a);
  }

  public RelativeLayout getBackBtn()
  {
    return this.e;
  }

  public ImageView getSharBtn()
  {
    return this.c;
  }

  public void setTitle(String paramString)
  {
    this.d.setText(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.TitleBar
 * JD-Core Version:    0.6.0
 */