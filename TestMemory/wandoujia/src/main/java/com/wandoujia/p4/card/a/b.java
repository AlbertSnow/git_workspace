package com.wandoujia.p4.card.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.views.a;

final class b
  implements View.OnClickListener
{
  b(CardViewModel paramCardViewModel, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    Action localAction = this.a.a(this.b.getView());
    if (localAction != null)
      localAction.execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.a.b
 * JD-Core Version:    0.6.0
 */