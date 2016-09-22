package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class es extends c
{
  protected final void a(Model paramModel)
  {
    if ((paramModel == null) || (CollectionUtils.isEmpty(paramModel.w())))
      return;
    Image localImage = (Image)paramModel.w().get(0);
    ViewGroup.LayoutParams localLayoutParams = h().a(2131492889).a().getLayoutParams();
    Integer localInteger = localImage.height;
    int i = 0;
    if (localInteger != null)
    {
      int j = localInteger.intValue();
      i = 0;
      if (j != 0)
        i = 1;
    }
    if (i != 0)
      localLayoutParams.height = localImage.height.intValue();
    h().a(2131492889).a().setLayoutParams(localLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.es
 * JD-Core Version:    0.6.0
 */