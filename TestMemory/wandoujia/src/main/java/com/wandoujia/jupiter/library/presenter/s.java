package com.wandoujia.jupiter.library.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Spinner;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.library.a.e;
import com.wandoujia.jupiter.library.a.h;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Arrays;

public final class s extends c
{
  protected final void a(Model paramModel)
  {
    if (paramModel.g() == TemplateTypeEnum.TemplateType.UPGRADE_APP)
    {
      Spinner localSpinner2 = (Spinner)e();
      h localh = new h(localSpinner2);
      localh.a(Arrays.asList(e().getContext().getResources().getStringArray(2131230761)));
      localh.a(paramModel.F().package_name);
      localh.b(paramModel.n());
      localSpinner2.setAdapter(localh);
    }
    do
      return;
    while (paramModel.g() != TemplateTypeEnum.TemplateType.IGNORE_UPGRADE_APP);
    Spinner localSpinner1 = (Spinner)e();
    e locale = new e(localSpinner1);
    locale.a(Arrays.asList(e().getContext().getResources().getStringArray(2131230744)));
    locale.a(paramModel.F().package_name);
    locale.b(paramModel.n());
    localSpinner1.setAdapter(locale);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.s
 * JD-Core Version:    0.6.0
 */