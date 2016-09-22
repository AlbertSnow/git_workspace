package com.wandoujia.jupiter.presenter;

import android.widget.Spinner;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class cj extends c
{
  protected final void a(Model paramModel)
  {
    Integer localInteger1 = (Integer)paramModel.a(2131492965);
    if (localInteger1 == null);
    for (Integer localInteger2 = Integer.valueOf(0); ; localInteger2 = localInteger1)
    {
      Spinner localSpinner = (Spinner)e();
      localSpinner.setAdapter(new cl(localSpinner, paramModel));
      localSpinner.setSelection(localInteger2.intValue());
      localSpinner.setOnItemSelectedListener(new ck(paramModel));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cj
 * JD-Core Version:    0.6.0
 */