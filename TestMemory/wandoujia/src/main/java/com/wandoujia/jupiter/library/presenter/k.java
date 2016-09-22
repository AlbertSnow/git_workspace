package com.wandoujia.jupiter.library.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Spinner;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.jupiter.library.a.g;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Arrays;

public final class k extends c
{
  protected final void a(Model paramModel)
  {
    Spinner localSpinner = (Spinner)e();
    g localg = new g(localSpinner);
    localg.a(paramModel.F().package_name);
    i.k().a("app");
    if (AppManager.c(paramModel.F().package_name) == null)
      localg.a(Arrays.asList(e().getContext().getResources().getStringArray(2131230745)));
    while (true)
    {
      localSpinner.setAdapter(localg);
      localSpinner.setOnTouchListener(new l());
      return;
      localg.a(Arrays.asList(e().getContext().getResources().getStringArray(2131230747)));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.k
 * JD-Core Version:    0.6.0
 */