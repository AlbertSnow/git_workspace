package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class l extends h
{
  l(Model paramModel1, Model paramModel2, MorphData paramMorphData)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    Entity.Builder localBuilder = new Entity.Builder(this.a.b());
    localBuilder.action(this.b.action);
    Model localModel = new Model(localBuilder.build());
    ((c)i.k().a("navigation")).a(paramView.getContext(), localModel, paramView);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.l
 * JD-Core Version:    0.6.0
 */