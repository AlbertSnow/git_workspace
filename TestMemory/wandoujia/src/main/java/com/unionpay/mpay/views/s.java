package com.unionpay.mpay.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.widgets.ag;
import com.unionpay.mpay.widgets.k;
import com.unionpay.mpay_2.upview.a.b;
import com.unionpay.mpay_2.upwidget.d;
import org.json.JSONObject;

public final class s extends b
  implements a.b
{
  private TextView l = null;
  private View.OnClickListener m = null;
  private com.unionpay.mpay_2.upview.a n = null;

  s(Context paramContext)
  {
    super(paramContext);
    this.f = 12;
    setBackgroundColor(-66566);
    b(1);
  }

  protected final void a()
  {
    int i = 1;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams1.addRule(10, -1);
    this.n = new com.unionpay.mpay_2.upview.a(this.d, this.a.K, this);
    this.n.setOrientation(i);
    this.n.setId(this.n.hashCode());
    this.j.addView(this.n, localLayoutParams1);
    d locald = d.a(this.d, this.a.L, this.c.a(1017, -1, -1));
    if (locald != null)
    {
      locald.setId(locald.hashCode());
      locald.a(new ap(this, locald.a()));
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams3.addRule(3, this.n.getId());
      int i2 = com.unionpay.mpay.a.a.c;
      localLayoutParams3.bottomMargin = i2;
      localLayoutParams3.topMargin = i2;
      localLayoutParams3.leftMargin = com.unionpay.mpay.a.a.c;
      this.j.addView(locald, localLayoutParams3);
    }
    this.l = new TextView(this.d);
    this.l.setText(com.unionpay.mpay.b.c.ab.i);
    this.l.setTextSize(22.0F);
    this.l.setTextColor(-1);
    this.l.setGravity(17);
    TextView localTextView = this.l;
    RelativeLayout.LayoutParams localLayoutParams2;
    if ((this.n == null) || (this.n.f()))
    {
      localTextView.setEnabled(i);
      this.l.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
      int k = com.unionpay.mpay.a.a.j;
      Drawable localDrawable = this.c.a(2009, -1, -1);
      this.l.setBackgroundDrawable(localDrawable);
      this.l.setOnClickListener(this.m);
      localLayoutParams2 = new RelativeLayout.LayoutParams(-1, k);
      if (locald == null)
        break label386;
    }
    label386: for (int i1 = locald.getId(); ; i1 = this.n.getId())
    {
      localLayoutParams2.addRule(3, i1);
      localLayoutParams2.topMargin = com.unionpay.mpay.a.a.e;
      this.j.addView(this.l, localLayoutParams2);
      return;
      int j = 0;
      break;
    }
  }

  public final void a(com.unionpay.mpay_2.upview.c paramc)
  {
  }

  public final void a(JSONObject paramJSONObject)
  {
    this.b.c();
    int i = android.support.v4.app.b.b(this.a, paramJSONObject);
    if (i != 0)
    {
      c(i);
      return;
    }
    if (this.n != null)
      this.n.g();
    e(13);
  }

  public final void a(boolean paramBoolean)
  {
    TextView localTextView;
    if (this.l != null)
    {
      localTextView = this.l;
      if (paramBoolean)
        break label24;
    }
    label24: for (boolean bool = true; ; bool = false)
    {
      localTextView.setEnabled(bool);
      return;
    }
  }

  protected final void b()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    String str = com.unionpay.mpay.b.c.ab.h;
    ag localag = new ag(this.d, str);
    localLayoutParams.addRule(13, -1);
    this.h.addView(localag, localLayoutParams);
  }

  public final void b(String paramString)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.s
 * JD-Core Version:    0.6.0
 */