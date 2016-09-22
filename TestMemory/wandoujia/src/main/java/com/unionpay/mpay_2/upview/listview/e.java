package com.unionpay.mpay_2.upview.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.unionpay.mpay.c.c;
import java.util.List;

public final class e extends LinearLayout
  implements a.b
{
  private d a = null;
  private a b = null;
  private com.unionpay.uppay.b c = null;
  private e.a d = null;

  public e(Context paramContext, com.unionpay.uppay.b paramb, e.a parama)
  {
    super(paramContext);
    this.c = paramb;
    this.d = parama;
    c localc = c.a(paramContext);
    Drawable localDrawable1 = com.unionpay.mpay.utils.d.a(com.unionpay.mpay.utils.d.a(true), com.unionpay.mpay.utils.d.a(false));
    int i = com.unionpay.mpay.a.a.x;
    localc.a(1016, i, i);
    Drawable localDrawable2 = localc.a(1011, -1, -1);
    setOrientation(1);
    this.a = new d(paramContext, localDrawable1, localc.a(1031, -1, -1), localDrawable2);
    this.a.setId(this.a.hashCode());
    c(0);
    this.a.setOnClickListener(new h(this));
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, com.unionpay.mpay.a.a.s);
    addView(this.a, localLayoutParams);
    this.b = new a(paramContext, this.c.O, this);
    this.b.a(null);
    this.b.b();
    this.b.setVisibility(8);
    addView(this.b);
  }

  public final void a()
  {
    if (this.b == null)
      return;
    if (this.b.getVisibility() == 8);
    for (int i = 0; ; i = 8)
    {
      this.b.setVisibility(i);
      if (this.d != null)
        this.d.a(this.b);
      if (i == 8)
        break;
      this.a.a("");
      return;
    }
  }

  public final void a(int paramInt)
  {
    if (this.d != null)
      this.d.f(paramInt);
  }

  public final void b(int paramInt)
  {
  }

  public final void c(int paramInt)
  {
    String str = ((com.unionpay.pboctransaction.model.b)this.c.O.get(paramInt)).c();
    this.a.a(str);
  }

  public final int getId()
  {
    return this.a.getId();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.listview.e
 * JD-Core Version:    0.6.0
 */