package com.unionpay.mpay_2.upview.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.unionpay.mpay.c.c;
import java.util.ArrayList;
import java.util.List;

public final class g extends LinearLayout
  implements a.b
{
  private d a = null;
  private a b = null;
  private com.unionpay.uppay.b c = null;
  private g.a d = null;

  public g(Context paramContext, com.unionpay.uppay.b paramb, g.a parama)
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
    this.c.B = 0;
    this.a = new d(paramContext, localDrawable1, localc.a(1031, -1, -1), localDrawable2);
    this.a.a(((com.unionpay.pboctransaction.model.b)this.c.h.get(0)).c());
    this.a.setOnClickListener(new i(this));
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, com.unionpay.mpay.a.a.j);
    addView(this.a, localLayoutParams);
    this.b = new a(paramContext, this.c.h, this);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localc.a(1016, i, i));
    this.b.a(localArrayList);
    this.b.b();
    this.b.setVisibility(8);
    addView(this.b);
  }

  private void b()
  {
    if (this.b == null)
      return;
    if (this.b.getVisibility() == 8);
    for (int i = 0; ; i = 8)
    {
      this.b.setVisibility(i);
      if (i != 8)
        break;
      this.a.a(((com.unionpay.pboctransaction.model.b)this.c.h.get(this.c.B)).c());
      return;
    }
    this.a.a("");
  }

  public final void a()
  {
    b();
  }

  public final void a(int paramInt)
  {
    this.c.B = paramInt;
    b();
    this.a.a(((com.unionpay.pboctransaction.model.b)this.c.h.get(paramInt)).c());
  }

  public final void b(int paramInt)
  {
    if (this.d != null)
      this.d.f(paramInt);
  }

  public final void c(int paramInt)
  {
    com.unionpay.uppay.b localb1 = this.c;
    if ((localb1.h != null) && (paramInt < localb1.h.size()))
      localb1.h.remove(paramInt);
    if ((this.c.h != null) && (this.c.h.size() > 0))
    {
      if (paramInt == this.c.B)
        this.c.B = 0;
      while (true)
      {
        this.b.a();
        return;
        if (paramInt >= this.c.B)
          continue;
        com.unionpay.uppay.b localb2 = this.c;
        localb2.B = (-1 + localb2.B);
      }
    }
    this.c.B = -1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.listview.g
 * JD-Core Version:    0.6.0
 */