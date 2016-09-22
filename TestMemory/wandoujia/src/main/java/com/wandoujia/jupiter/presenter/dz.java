package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.a.h;
import com.wandoujia.ripple_framework.adapter.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class dz extends c
{
  private int a = JupiterApplication.e().getResources().getDimensionPixelSize(2131427722);
  private eb g;

  protected final void a(Model paramModel)
  {
    if ((paramModel == null) || (!(e() instanceof RecyclerView)))
      return;
    RecyclerView localRecyclerView = (RecyclerView)e();
    switch (ea.a[paramModel.g().ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      ((a)localRecyclerView.getAdapter()).a(paramModel.B());
      return;
      e().getContext();
      localRecyclerView.setLayoutManager(new h());
      if ((!CollectionUtils.isEmpty(paramModel.B())) && (((Model)paramModel.B().get(0)).g() == TemplateTypeEnum.TemplateType.SCREENSHOT))
      {
        if (this.g != null)
          continue;
        this.g = new eb(this.a, 0);
        localRecyclerView.a(this.g);
        continue;
      }
      if (this.g == null)
        continue;
      localRecyclerView.b(this.g);
      this.g = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dz
 * JD-Core Version:    0.6.0
 */