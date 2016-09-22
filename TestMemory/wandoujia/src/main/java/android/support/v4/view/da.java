package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

class da extends cx
{
  public final void a(cu paramcu, View paramView, dh paramdh)
  {
    if (paramdh != null)
    {
      paramView.animate().setListener(new df(paramdh, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.da
 * JD-Core Version:    0.6.0
 */