package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.support.v4.app.d;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.rg;
import com.alipay.wandoujia.ua;

public final class aq extends am
{
  private Activity g;
  private View h;
  private rg i;
  private boolean j;

  protected aq(bd parambd, rg paramrg)
  {
    super(parambd);
    this.i = paramrg;
    this.j = false;
  }

  public final void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    if (this.j)
      return;
    this.j = true;
    this.g = paramActivity;
    this.h = paramViewGroup.getChildAt(0);
    ua.a((ViewGroup)this.g.findViewById(d.a("mini_layout")), new ar(this, paramActivity, paramViewGroup));
  }

  protected final boolean a(ra paramra)
  {
    return true;
  }

  public final boolean a(Object paramObject, com.alipay.wandoujia.am paramam)
  {
    if ((this.i != null) && (paramam.b() == ra.j))
      return this.i.a(paramObject, paramam);
    if (paramam.b() == ra.k)
      return true;
    return super.a(paramObject, paramam);
  }

  protected final boolean b(ra paramra)
  {
    return true;
  }

  protected final boolean c()
  {
    return true;
  }

  public final void i()
  {
    super.i();
    this.j = false;
    ViewGroup localViewGroup = (ViewGroup)this.g.findViewById(d.a("mini_layout"));
    ua.b(localViewGroup, new as(this, localViewGroup));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.aq
 * JD-Core Version:    0.6.0
 */