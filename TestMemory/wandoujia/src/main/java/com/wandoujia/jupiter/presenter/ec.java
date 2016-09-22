package com.wandoujia.jupiter.presenter;

import android.support.v4.app.i;
import android.view.View;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class ec extends c
{
  protected final void a(Model paramModel)
  {
    View localView = h().a(2131493174).a();
    int i;
    if (localView != null)
    {
      i = i.a(16.0F, f());
      if ((paramModel.g() == TemplateTypeEnum.TemplateType.APP_ATTACH) || (paramModel.g() == TemplateTypeEnum.TemplateType.VIDEO_ATTACH))
      {
        int j = i.a(30.0F, f());
        localView.setPadding(j, j, j, i);
      }
    }
    else
    {
      return;
    }
    localView.setPadding(i, i, i, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ec
 * JD-Core Version:    0.6.0
 */