package com.wandoujia.jupiter.presenter;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class fb extends c
{
  protected final void a(Model paramModel)
  {
    if ((paramModel.f() == ContentTypeEnum.ContentType.VIDEO) && (TextUtils.isEmpty(paramModel.o())))
      ((TextView)e()).setText(e().getResources().getText(2131625694));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.fb
 * JD-Core Version:    0.6.0
 */