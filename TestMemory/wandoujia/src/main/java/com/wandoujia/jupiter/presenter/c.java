package com.wandoujia.jupiter.presenter;

import android.content.Context;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.util.AutoInstallGuideUtil;
import com.wandoujia.ripple_framework.c.bs;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

final class c extends bs
{
  c(StatefulButton paramStatefulButton)
  {
    super(paramStatefulButton);
  }

  protected final void a(Context paramContext)
  {
    super.a(paramContext);
    if (this.g.g() != TemplateTypeEnum.TemplateType.SINGLE_MICRO)
      AutoInstallGuideUtil.a(paramContext);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.c
 * JD-Core Version:    0.6.0
 */