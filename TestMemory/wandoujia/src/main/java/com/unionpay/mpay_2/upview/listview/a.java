package com.unionpay.mpay_2.upview.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.unionpay.mpay.utils.d;
import java.util.List;

public final class a extends LinearLayout
{
  private static final int a = com.unionpay.mpay.a.a.s;
  private Context b = null;
  private List<com.unionpay.pboctransaction.model.b> c = null;
  private b d = null;
  private int e = -1;
  private a.b f = null;
  private List<Drawable> g = null;

  public a(Context paramContext, List<com.unionpay.pboctransaction.model.b> paramList, a.b paramb)
  {
    super(paramContext);
    this.b = paramContext;
    this.c = paramList;
    this.f = paramb;
    setOrientation(1);
  }

  public final void a()
  {
    removeAllViews();
    int i = this.d.getCount();
    int j;
    int k;
    label37: View localView;
    Drawable localDrawable1;
    Drawable localDrawable2;
    if (this.e == -1)
    {
      j = a;
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, j);
      k = 0;
      if (k >= i)
        return;
      localView = this.d.getView(k, null, null);
      localView.setOnClickListener(new c(this));
      addView(localView, localLayoutParams);
      if (i != 1)
        break label119;
      localDrawable1 = d.a(true);
      localDrawable2 = d.a(false);
    }
    while (true)
    {
      localView.setBackgroundDrawable(d.a(localDrawable1, localDrawable2));
      k++;
      break label37;
      j = this.e;
      break;
      label119: if (k == 0)
      {
        localDrawable1 = d.b(-787971, 3);
        localDrawable2 = d.b(-12607521, 3);
        continue;
      }
      if (k == i - 1)
      {
        localDrawable1 = d.b(-787971, 12);
        localDrawable2 = d.b(-12607521, 12);
        continue;
      }
      localDrawable1 = d.b(-787971, 0);
      localDrawable2 = d.b(-12607521, 0);
    }
  }

  public final void a(List<Drawable> paramList)
  {
    this.g = paramList;
  }

  public final void b()
  {
    if (this.d == null)
      this.d = new b(this, 0);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay_2.upview.listview.a
 * JD-Core Version:    0.6.0
 */