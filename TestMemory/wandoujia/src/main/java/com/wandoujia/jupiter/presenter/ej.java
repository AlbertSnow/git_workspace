package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.Spinner;
import com.wandoujia.ripple_framework.view.aw;
import com.wandoujia.ripple_framework.view.ax;

final class ej
  implements aw
{
  ej(eh parameh, Spinner paramSpinner)
  {
  }

  public final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    Model localModel = ((el)this.a.getAdapter().a(paramInt)).b();
    eh.a(paramView.getContext(), localModel, this.a);
    eh.b(this.b, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ej
 * JD-Core Version:    0.6.0
 */