package com.wandoujia.p4.app.view.model;

import android.view.View;
import com.wandoujia.entities.app.IAppLiteInfo;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.button.views.i;
import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.CardViewModel.SubBadgeType;
import java.util.ArrayList;
import java.util.List;

public final class CardViewModelAppImpl
  implements CardViewModel
{
  private String a;
  private CharSequence b;
  private String c;
  private String d;
  private String e;
  private Action f;
  private List<CardViewModel.SubBadgeType> g;

  public final Action a(View paramView)
  {
    if (this.f == null)
    {
      paramView.getContext();
      this.f = com.wandoujia.p4.app.c.a.a();
    }
    return this.f;
  }

  public final CharSequence a()
  {
    if (this.b == null)
      this.b = com.wandoujia.p4.app.c.a.b();
    return this.b;
  }

  public final Action b(View paramView)
  {
    return new a();
  }

  public final List<CardViewModel.SubBadgeType> b()
  {
    if (this.g == null)
      this.g = new ArrayList();
    return this.g;
  }

  public final String c()
  {
    if (this.c == null)
      this.c = null.getAppLiteIcon();
    return this.c;
  }

  public final List<i> d()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.view.model.CardViewModelAppImpl
 * JD-Core Version:    0.6.0
 */