package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.utils.e;
import com.unionpay.mpay.widgets.ac;
import com.unionpay.mpay.widgets.ag;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ao extends b
{
  private TextView l = null;
  private View.OnClickListener m = new r(this);
  private View.OnClickListener n = new t(this);

  public ao(Context paramContext)
  {
    super(paramContext);
    b(2);
  }

  private final boolean m()
  {
    String str = this.a.D;
    int i = 0;
    if (str != null)
    {
      boolean bool = this.a.D.equalsIgnoreCase("0");
      i = 0;
      if (bool)
        i = 1;
    }
    return i;
  }

  private void n()
  {
    this.a.x.e = "success";
    i();
  }

  protected final void a()
  {
    RelativeLayout localRelativeLayout1 = new RelativeLayout(this.d);
    localRelativeLayout1.setBackgroundColor(-1);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams1.addRule(12, -1);
    localLayoutParams1.topMargin = a.c;
    localLayoutParams1.bottomMargin = a.c;
    this.j.addView(localRelativeLayout1, localLayoutParams1);
    LinearLayout localLinearLayout = new LinearLayout(this.d);
    localLinearLayout.setPadding(0, a.c, 0, a.c);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setId(localLinearLayout.hashCode());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    this.j.addView(localLinearLayout, localLayoutParams2);
    if (!m())
      localLinearLayout.setVisibility(4);
    TextView localTextView1 = new TextView(this.d);
    localTextView1.setTextSize(18.0F);
    localTextView1.setText(this.a.E);
    localTextView1.setTextColor(-10066330);
    localTextView1.setGravity(17);
    localLinearLayout.addView(localTextView1, new RelativeLayout.LayoutParams(-1, -2));
    RelativeLayout localRelativeLayout2 = new RelativeLayout(this.d);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams3.topMargin = a.c;
    localLayoutParams3.addRule(3, localLinearLayout.getId());
    this.j.addView(localRelativeLayout2, localLayoutParams3);
    int i = a.j;
    Drawable localDrawable = this.c.a(2009, -1, -1);
    if (m());
    for (int j = (a.B - 3 * a.c) / 2; ; j = -1)
    {
      this.l = new TextView(this.d);
      this.l.setText(com.unionpay.mpay.b.c.ab.r);
      this.l.setTextSize(22.0F);
      this.l.setTextColor(-1);
      this.l.setGravity(17);
      this.l.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
      this.l.setOnClickListener(this.m);
      this.l.setBackgroundDrawable(localDrawable);
      RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(j, i);
      localLayoutParams4.addRule(9, -1);
      localLayoutParams4.addRule(15, -1);
      localRelativeLayout2.addView(this.l, localLayoutParams4);
      if (m())
      {
        TextView localTextView2 = new TextView(this.d);
        localTextView2.setText(com.unionpay.mpay.b.c.ab.s);
        localTextView2.setTextSize(22.0F);
        localTextView2.setTextColor(-1);
        localTextView2.setGravity(17);
        localTextView2.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
        localTextView2.setOnClickListener(this.n);
        localTextView2.setBackgroundDrawable(localDrawable);
        RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(j, i);
        localLayoutParams5.addRule(11, -1);
        localLayoutParams5.addRule(15, -1);
        localRelativeLayout2.addView(localTextView2, localLayoutParams5);
      }
      return;
    }
  }

  protected final void a(int paramInt)
  {
    int i = 2;
    LinearLayout localLinearLayout1 = new LinearLayout(this.d);
    localLinearLayout1.setOrientation(1);
    TextView localTextView = new TextView(this.d);
    localTextView.setText(this.a.q);
    localTextView.setTextSize(24.0F);
    localTextView.setTextColor(-15365480);
    localTextView.setGravity(1);
    localTextView.setPadding(0, a.c, 0, 0);
    localTextView.getPaint().setFakeBoldText(true);
    localLinearLayout1.addView(localTextView, new LinearLayout.LayoutParams(-1, -2));
    LinearLayout localLinearLayout2 = new LinearLayout(this.d);
    localLinearLayout2.setOrientation(0);
    localLinearLayout2.setBackgroundColor(-6958338);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, 1);
    int j = a.c;
    localLayoutParams1.bottomMargin = j;
    localLayoutParams1.topMargin = j;
    localLinearLayout1.addView(localLinearLayout2, localLayoutParams1);
    this.i.addView(localLinearLayout1);
    JSONArray localJSONArray = this.a.w;
    LinearLayout localLinearLayout3;
    if (localJSONArray != null)
      if (localJSONArray.length() >= i)
      {
        localLinearLayout1.addView(android.support.v4.app.b.a(this.d, localJSONArray, 0, i), new LinearLayout.LayoutParams(-1, -2));
        int k = localJSONArray.length();
        localLinearLayout3 = android.support.v4.app.b.a(this.d, localJSONArray, i, k);
        LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        this.i.addView(localLinearLayout3, localLayoutParams3);
        if (m())
          localLinearLayout3.setVisibility(8);
      }
    while (true)
    {
      ac localac = new ac(this.d, m());
      localac.setId(localac.hashCode());
      this.i.setOnClickListener(new u(this, localLinearLayout3));
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams2.bottomMargin = 0;
      this.i.addView(localac, localLayoutParams2);
      return;
      i = localJSONArray.length();
      break;
      localLinearLayout3 = null;
    }
  }

  public final void a(JSONObject paramJSONObject)
  {
    h();
    this.a.G = e.c(paramJSONObject, "open_rules");
    this.a.p = e.a(paramJSONObject, "title");
    this.a.r = e.b(paramJSONObject, "openrules_button");
    this.a.U = e.b(paramJSONObject, "service_checkbox");
    this.a.aa = e.a(paramJSONObject, "pan");
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
    n();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.ao
 * JD-Core Version:    0.6.0
 */