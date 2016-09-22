package com.wandoujia.p4.card.models;

import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.button.views.i;
import java.util.List;

public abstract interface CardViewModel extends BaseModel
{
  public abstract Action a(View paramView);

  public abstract CharSequence a();

  public abstract Action b(View paramView);

  public abstract List<CardViewModel.SubBadgeType> b();

  public abstract String c();

  public abstract List<i> d();

  public abstract CharSequence e();

  public abstract CharSequence f();

  public abstract CharSequence g();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.models.CardViewModel
 * JD-Core Version:    0.6.0
 */