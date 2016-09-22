package com.wandoujia.jupiter.library.fragment;

import android.os.Handler;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.app.upgrade.j;
import com.wandoujia.ripple_framework.view.StatefulButton;

final class o
  implements j
{
  o(n paramn, StatefulButton paramStatefulButton)
  {
  }

  public final void a()
  {
    JupiterApplication.a().post(new p(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.o
 * JD-Core Version:    0.6.0
 */