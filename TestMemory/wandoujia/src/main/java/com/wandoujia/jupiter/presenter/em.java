package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class em extends c
{
  private int[] a = { 2131493736, 2131493737, 2131493738 };

  protected final void a(Model paramModel)
  {
    if (CollectionUtils.isEmpty(paramModel.v()))
      e().setVisibility(8);
    while (true)
    {
      return;
      int i = Math.min((int)(10.0D * (2 * ((SystemUtil.getScreenWidth((WindowManager)e().getContext().getSystemService("window")) - e().getResources().getDimensionPixelOffset(2131427847)) / 3) / 7.5D)), e().getResources().getDimensionPixelOffset(2131427848));
      ViewGroup.LayoutParams localLayoutParams = e().getLayoutParams();
      localLayoutParams.height = i;
      e().setLayoutParams(localLayoutParams);
      List localList = paramModel.v();
      for (int j = 0; (j < localList.size()) && (j < this.a.length); j++)
      {
        ImageView localImageView = h().b(this.a[j]).h();
        Image localImage = (Image)localList.get(j);
        new e();
        e.a(localImageView, localImage.url, 2131361862);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.em
 * JD-Core Version:    0.6.0
 */