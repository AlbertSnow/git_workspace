package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class eo extends c
{
  private int a;

  public eo()
  {
    this(2147483647);
  }

  public eo(int paramInt)
  {
    this.a = paramInt;
  }

  protected final void a(Model paramModel)
  {
    if (CollectionUtils.isEmpty(paramModel.v()))
      e().setVisibility(8);
    label239: 
    while (true)
    {
      return;
      int i = SystemUtil.getScreenWidth((WindowManager)e().getContext().getSystemService("window")) - e().getResources().getDimensionPixelOffset(2131427847);
      int j = 9 * (i / 16);
      List localList = paramModel.v();
      int k = Math.min(localList.size(), this.a);
      for (int m = 0; ; m++)
      {
        if (m >= k)
          break label239;
        Image localImage = (Image)localList.get(m);
        if ((m < ((ViewGroup)e()).getChildCount()) && (((ImageView)((ViewGroup)e()).getChildAt(m)).getTag().equals(localImage.url)))
          break;
        ImageView localImageView = (ImageView)b.a((ViewGroup)e(), 2130903379);
        ViewGroup.LayoutParams localLayoutParams = localImageView.getLayoutParams();
        localLayoutParams.width = i;
        localLayoutParams.height = j;
        localImageView.setLayoutParams(localLayoutParams);
        new e();
        e.a(localImageView, localImage.url, 2131361862);
        localImageView.setTag(localImage.url);
        ((ViewGroup)e()).addView(localImageView);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.eo
 * JD-Core Version:    0.6.0
 */