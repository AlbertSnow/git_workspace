package com.unionpay.mpay.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.widgets.ag;
import com.unionpay.mpay_2.upview.b.a;
import org.json.JSONObject;

public final class at extends b
  implements b.a
{
  private com.unionpay.mpay_2.upview.b l = null;
  private ViewGroup m = null;

  public at(Context paramContext)
  {
    super(paramContext);
    this.f = 14;
    this.h = e();
    b();
    d();
  }

  public final void a(JSONObject paramJSONObject)
  {
  }

  protected final void b()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    ag localag = new ag(this.d, this.a.Q);
    localLayoutParams.addRule(13, -1);
    this.h.addView(localag, localLayoutParams);
  }

  protected final void d()
  {
    super.d();
    this.l = new com.unionpay.mpay_2.upview.b(this.d, this);
    this.l.setOnTouchListener(new w());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams1.addRule(3, this.h.getId());
    localLayoutParams1.addRule(12, -1);
    this.j.addView(this.l, localLayoutParams1);
    this.m = new RelativeLayout(this.d);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, a.n - a.i);
    localLayoutParams2.addRule(3, this.h.getId());
    localLayoutParams2.addRule(12, -1);
    localLayoutParams2.addRule(10, -1);
    localLayoutParams2.bottomMargin = 0;
    localLayoutParams2.topMargin = 0;
    this.j.addView(this.m, localLayoutParams2);
    ProgressBar localProgressBar = new ProgressBar(this.d);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams3.addRule(13, -1);
    this.m.addView(localProgressBar, localLayoutParams3);
    this.l.a(this.a.R);
  }

  public final void m()
  {
    this.l.setVisibility(8);
    this.m.setVisibility(0);
  }

  public final void n()
  {
    this.l.setVisibility(0);
    this.m.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.at
 * JD-Core Version:    0.6.0
 */