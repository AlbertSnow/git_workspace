package com.tencent.open.yyb;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.open.a.f;
import java.util.HashMap;

public final class i extends Dialog
{
  private LinearLayout a;
  private RelativeLayout b;
  private HashMap<String, TextView> c = new HashMap(4);
  private float d;
  private Rect e = new Rect(0, a(9.0F), 0, 0);

  public i(Context paramContext)
  {
    super(paramContext, 16973840);
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.d = localDisplayMetrics.density;
    f.b("openSDK_LOG.MoreFloatingDialog", "-->(MoreFloatingDialog) : density = " + this.d);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    this.b = new RelativeLayout(paramContext);
    this.b.setLayoutParams(localLayoutParams1);
    this.b.setBackgroundDrawable(a.a("yyb_appdetail_bg_floatingwindow.9.png", paramContext, this.e));
    this.a = new LinearLayout(paramContext);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
    this.a.setLayoutParams(localLayoutParams2);
    this.c.put("yyb_qq.png", a(a.a("yyb_qq.png", getContext(), this.e), "QQ分享"));
    this.c.put("yyb_qzone.png", a(a.a("yyb_qzone.png", getContext(), this.e), "空间分享"));
    this.b.addView(this.a, localLayoutParams2);
    setContentView(this.b);
  }

  private int a(float paramFloat)
  {
    return (int)(0.5F + paramFloat * this.d);
  }

  private TextView a(Drawable paramDrawable, String paramString)
  {
    if (paramDrawable != null)
      paramDrawable.setBounds(0, 0, a(28.0F), a(28.0F));
    TextView localTextView = new TextView(getContext());
    localTextView.setTextColor(-1);
    localTextView.setCompoundDrawables(null, paramDrawable, null, null);
    localTextView.setTextSize(13.0F);
    localTextView.setCompoundDrawablePadding(a(8.0F));
    localTextView.setPadding(0, a(19.0F), 0, a(19.0F));
    localTextView.setGravity(1);
    localTextView.setText(paramString);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -2);
    localLayoutParams1.weight = 1.0F;
    localLayoutParams1.gravity = 1;
    this.a.addView(localTextView, localLayoutParams1);
    ImageView localImageView = new ImageView(getContext());
    localImageView.setBackgroundColor(Color.parseColor("#33ffffff"));
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(a(1.0F), -1);
    this.a.addView(localImageView, localLayoutParams2);
    return localTextView;
  }

  public final View a()
  {
    return (View)this.c.get("yyb_qq.png");
  }

  public final View b()
  {
    return (View)this.c.get("yyb_qzone.png");
  }

  public final View c()
  {
    return (View)this.c.get("yyb_weixin.png");
  }

  public final View d()
  {
    return (View)this.c.get("yyb_friends.png");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.i
 * JD-Core Version:    0.6.0
 */