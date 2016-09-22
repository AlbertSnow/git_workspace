package com.wandoujia.jupiter.library.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Spinner;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Arrays;

public final class c extends com.wandoujia.ripple_framework.c.c
{
  protected final void a(Model paramModel)
  {
    Spinner localSpinner = (Spinner)e();
    com.wandoujia.jupiter.library.a.d locald = new com.wandoujia.jupiter.library.a.d(localSpinner);
    locald.a(Arrays.asList(e().getContext().getResources().getStringArray(2131230735)));
    localSpinner.setOnItemSelectedListener(new d(this, paramModel));
    localSpinner.setAdapter(locald);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.c
 * JD-Core Version:    0.6.0
 */