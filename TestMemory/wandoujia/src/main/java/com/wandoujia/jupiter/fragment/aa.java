package com.wandoujia.jupiter.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cm;
import android.view.View;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.a.c;
import com.wandoujia.nirvana.framework.ui.recycler.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class aa extends c
{
  private final int a;
  private final int b;
  private final int c;
  private final com.wandoujia.nirvana.framework.ui.recycler.i<Model> d;

  public aa(com.wandoujia.nirvana.framework.ui.recycler.i<Model> parami)
  {
    super(parami);
    this.d = parami;
    this.a = JupiterApplication.e().getResources().getDimensionPixelOffset(2131427707);
    this.b = android.support.v4.app.i.a(24.0F, JupiterApplication.e());
    this.c = JupiterApplication.e().getResources().getDimensionPixelOffset(2131427716);
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, cm paramcm)
  {
    super.a(paramRect, paramView, paramRecyclerView, paramcm);
    if (CollectionUtils.isEmpty(this.d.f()));
    while (true)
    {
      return;
      int i = RecyclerView.c(paramView);
      if ((this.d instanceof a));
      for (int j = i - ((a)this.d).c(); (j > 0) && (j < this.d.f().size()) && (((Model)this.d.f().get(j)).g() == TemplateTypeEnum.TemplateType.SINGLE_IMAGE); j = i)
      {
        paramView.setPadding(this.b, this.c, this.b, this.c);
        return;
      }
    }
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (CollectionUtils.isEmpty(this.d.f()))
      return 0;
    if ((this.d instanceof a))
      paramInt2 -= ((a)this.d).c();
    if ((paramInt2 > 0) && (paramInt2 < this.d.f().size()))
    {
      Model localModel = (Model)this.d.f().get(paramInt2);
      switch (q.a[localModel.g().ordinal()])
      {
      default:
        return 0;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      return this.a;
    }
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.aa
 * JD-Core Version:    0.6.0
 */