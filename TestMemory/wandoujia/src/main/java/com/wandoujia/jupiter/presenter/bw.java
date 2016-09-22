package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.LoadingView;

final class bw extends c
{
  private Model b()
  {
    return (Model)i().a(2131492900);
  }

  public final void a()
  {
    super.a();
    ((LoadingView)h().a(2131492899).a()).d();
  }

  protected final void a(Model paramModel)
  {
    View localView1 = h().a(2131493417).a();
    localView1.setOnClickListener(new bx(this, localView1, paramModel));
    e().setTag(2131492903, h().a(2131493641).a());
    LoadingView localLoadingView = (LoadingView)h().a(2131492899).a();
    if (CollectionUtils.isEmpty(paramModel.B()))
      localLoadingView.c();
    while (true)
    {
      if (b().g() == TemplateTypeEnum.TemplateType.DETAIL_HEADER)
      {
        localView1.setVisibility(8);
        View localView2 = h().a(2131493574).a();
        RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localView2.getLayoutParams();
        localLayoutParams1.setMargins(0, 0, 0, 0);
        localView2.setLayoutParams(localLayoutParams1);
        View localView3 = h().a(2131493641).a();
        RelativeLayout.LayoutParams localLayoutParams2 = (RelativeLayout.LayoutParams)localView3.getLayoutParams();
        localLayoutParams2.setMargins(0, 0, f().getResources().getDimensionPixelOffset(2131427676), 0);
        localView3.setLayoutParams(localLayoutParams2);
      }
      return;
      localLoadingView.d();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bw
 * JD-Core Version:    0.6.0
 */