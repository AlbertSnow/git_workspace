package com.unionpay.mpay.widgets;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import org.json.JSONObject;

public final class q extends m
{
  private int e = 0;

  public q(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramJSONObject);
    this.e = paramInt;
    RelativeLayout localRelativeLayout = this.d;
    LinearLayout localLinearLayout = new LinearLayout(this.a);
    localRelativeLayout.addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    localLinearLayout.setOrientation(0);
    int i = (int)(0.4F * this.e);
    int j = this.e - i - a.e;
    TextView localTextView1 = new TextView(this.a);
    localTextView1.setTextSize(18.0F);
    localTextView1.setText(k());
    localTextView1.setTextColor(-10066330);
    localTextView1.setGravity(19);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i, -2);
    localLayoutParams1.gravity = 48;
    localLayoutParams1.leftMargin = a.e;
    localLinearLayout.addView(localTextView1, localLayoutParams1);
    TextView localTextView2 = new TextView(this.a);
    localTextView2.setGravity(16);
    localTextView2.setTextSize(18.0F);
    localTextView2.setText(m());
    localTextView2.setTextColor(-16758391);
    localTextView2.setPadding(0, 0, a.f, 0);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(j, -2);
    localLayoutParams2.gravity = 48;
    localLayoutParams2.rightMargin = a.f;
    localLinearLayout.addView(localTextView2, localLayoutParams2);
  }

  public q(Context paramContext, JSONObject paramJSONObject)
  {
    super(paramContext, paramJSONObject);
    int i = a.e;
    String str1 = k();
    if ((str1 != null) && (str1.length() > 0))
    {
      TextView localTextView2 = new TextView(this.a);
      localTextView2.setTextSize(20.0F);
      localTextView2.setText(k());
      localTextView2.setTextColor(-7829368);
      localTextView2.setPadding(i, 0, i, 0);
      addView(localTextView2);
    }
    String str2 = m();
    if ((str2 != null) && (str2.length() > 0))
    {
      TextView localTextView1 = new TextView(this.a);
      localTextView1.setTextSize(18.0F);
      localTextView1.setTextColor(-7829368);
      localTextView1.setText(m());
      localTextView1.setPadding(i, 0, i, i);
      addView(localTextView1);
    }
  }

  public final boolean a()
  {
    return true;
  }

  public final String b()
  {
    return null;
  }

  public final boolean c()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.q
 * JD-Core Version:    0.6.0
 */