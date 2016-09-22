package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class bq extends c
{
  public static String b(Model paramModel)
  {
    if (!TextUtils.isEmpty(paramModel.n()))
      return paramModel.n();
    if (!TextUtils.isEmpty(paramModel.r()))
    {
      if ((CollectionUtils.isEmpty(paramModel.w())) && (CollectionUtils.isEmpty(paramModel.v())));
      for (int i = 1; i != 0; i = 0)
        return paramModel.r();
    }
    return "";
  }

  protected final void a(Model paramModel)
  {
    ((TextView)e()).setText(b(paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bq
 * JD-Core Version:    0.6.0
 */