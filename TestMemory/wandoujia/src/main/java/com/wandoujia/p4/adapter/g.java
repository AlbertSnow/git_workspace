package com.wandoujia.p4.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;
import java.util.Set;

final class g
  implements View.OnClickListener
{
  g(BaseCardSelectableAdapter paramBaseCardSelectableAdapter)
  {
  }

  public final void onClick(View paramView)
  {
    if (BaseCardSelectableAdapter.b(this.a).size() == BaseCardSelectableAdapter.c(this.a).size())
    {
      this.a.e();
      this.a.a();
      return;
    }
    this.a.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.g
 * JD-Core Version:    0.6.0
 */