package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.utils.e;
import com.unionpay.mpay.widgets.ag;
import org.json.JSONArray;
import org.json.JSONObject;

public final class v extends b
{
  private TextView l = null;
  private View.OnClickListener m = new aq(this);

  public v(Context paramContext)
  {
    super(paramContext);
    this.f = 11;
    this.h = e();
    b();
    super.d();
    a();
  }

  private void m()
  {
    this.a.x.e = "success";
    i();
  }

  protected final void a()
  {
    int i = a.c;
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setBackgroundColor(-1114114);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setPadding(0, i, 0, i);
    localLinearLayout1.setId(localLinearLayout1.hashCode());
    TextView localTextView1 = new TextView(this.d);
    localTextView1.setText(this.a.q);
    localTextView1.setTextSize(24.0F);
    localTextView1.setTextColor(-15365480);
    localTextView1.setGravity(1);
    localTextView1.getPaint().setFakeBoldText(true);
    localLinearLayout1.addView(localTextView1);
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setOrientation(0);
    localLinearLayout2.setBackgroundColor(-6958338);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, 2);
    localLayoutParams1.addRule(14, -1);
    int j = a.c;
    localLayoutParams1.bottomMargin = j;
    localLayoutParams1.topMargin = j;
    localLinearLayout1.addView(localLinearLayout2);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.addRule(10, -1);
    this.j.addView(localLinearLayout1, localLayoutParams2);
    LinearLayout localLinearLayout3 = new LinearLayout(this.d);
    localLinearLayout3.setPadding(i, i, i, i);
    localLinearLayout3.setOrientation(1);
    localLinearLayout3.setId(localLinearLayout3.hashCode());
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams3.addRule(3, localLinearLayout1.getId());
    this.j.addView(localLinearLayout3, localLayoutParams3);
    TextView localTextView2 = new TextView(this.d);
    localTextView2.setTextSize(18.0F);
    localTextView2.setText(this.a.F);
    localTextView2.setTextColor(-10066330);
    localTextView2.setGravity(3);
    localLinearLayout3.addView(localTextView2, new RelativeLayout.LayoutParams(-1, -2));
    this.l = new TextView(this.d);
    this.l.setText(com.unionpay.mpay.b.c.ab.r);
    this.l.setTextSize(22.0F);
    this.l.setTextColor(-1);
    this.l.setGravity(17);
    this.l.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    this.l.setOnClickListener(this.m);
    int k = a.j;
    Drawable localDrawable = this.c.a(2009, -1, -1);
    this.l.setBackgroundDrawable(localDrawable);
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-1, k);
    localLayoutParams4.addRule(3, localLinearLayout3.getId());
    localLayoutParams4.addRule(12, -1);
    localLayoutParams4.bottomMargin = a.a;
    localLayoutParams4.topMargin = a.a;
    int n = a.c;
    localLayoutParams4.rightMargin = n;
    localLayoutParams4.leftMargin = n;
    this.j.addView(this.l, localLayoutParams4);
  }

  public final void a(JSONObject paramJSONObject)
  {
    h();
    this.a.G = e.c(paramJSONObject, "open_rules");
    if ((this.a.G == null) || (this.a.G.length() <= 0))
    {
      c(2);
      return;
    }
    e(10);
  }

  protected final void b()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    ag localag = new ag(getContext(), this.a.p);
    localLayoutParams.addRule(13, -1);
    this.h.addView(localag, localLayoutParams);
  }

  public final void c()
  {
    m();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.v
 * JD-Core Version:    0.6.0
 */