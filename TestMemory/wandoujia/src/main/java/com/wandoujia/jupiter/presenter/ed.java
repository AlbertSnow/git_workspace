package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class ed extends c
{
  protected final void a(Model paramModel)
  {
    Context localContext = JupiterApplication.e();
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(localContext.getResources().getDimensionPixelSize(2131427472), localContext.getResources().getDimensionPixelSize(2131427471));
    String[] arrayOfString = ((Image)paramModel.w().get(0)).url.split("\\.");
    if (arrayOfString.length > 1)
      arrayOfString = arrayOfString[(-2 + arrayOfString.length)].split("_");
    if (arrayOfString.length > 2);
    try
    {
      int i = Integer.valueOf(arrayOfString[(-1 + arrayOfString.length)]).intValue();
      int j = Integer.valueOf(arrayOfString[(-2 + arrayOfString.length)]).intValue();
      if (j > i)
      {
        int k = localContext.getResources().getDimensionPixelSize(2131427470);
        localLayoutParams.height = (i * k / j);
        localLayoutParams.width = k;
      }
      label152: e().setLayoutParams(localLayoutParams);
      ((ImageView)h().a(2131492889).a()).setAnimation(AnimationUtils.loadAnimation(localContext, 2130968591));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      break label152;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ed
 * JD-Core Version:    0.6.0
 */