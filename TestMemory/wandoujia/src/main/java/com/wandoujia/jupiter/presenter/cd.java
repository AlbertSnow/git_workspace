package com.wandoujia.jupiter.presenter;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.d;

final class cd
  implements j
{
  cd(ca paramca)
  {
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    if ((this.a.i() == null) || (this.a.i().Q().a() != 2))
      return;
    this.a.a(paramVolleyError);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cd
 * JD-Core Version:    0.6.0
 */