package com.wandoujia.jupiter.library.presenter;

import android.os.Handler;
import android.widget.Spinner;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.model.Model;

public final class a extends com.wandoujia.ripple_framework.c.c
  implements com.wandoujia.jupiter.library.a.c
{
  protected final void a(Model paramModel)
  {
    Spinner localSpinner = (Spinner)e();
    localSpinner.setAdapter(new com.wandoujia.jupiter.library.a.a(localSpinner, paramModel, this));
  }

  public final void a(Model paramModel, boolean paramBoolean)
  {
    if (!paramBoolean)
      JupiterApplication.a().post(new b(this, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.a
 * JD-Core Version:    0.6.0
 */