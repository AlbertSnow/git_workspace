package com.wandoujia.p4.views;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;

final class k
  implements View.OnClickListener
{
  private k(ExpandablePanel paramExpandablePanel)
  {
  }

  public final void onClick(View paramView)
  {
    if ((!ExpandablePanel.d(this.a)) || (ExpandablePanel.e(this.a)))
      return;
    Animation localAnimation = ExpandablePanel.f(this.a).getAnimation();
    if ((localAnimation != null) && (localAnimation.hasStarted()) && (!localAnimation.hasEnded()))
    {
      localAnimation.setAnimationListener(new l(paramView));
      return;
    }
    ExpandablePanel.f(this.a).clearAnimation();
    j localj;
    if (ExpandablePanel.a(this.a) != null)
    {
      localj = ExpandablePanel.a(this.a);
      if (ExpandablePanel.b(this.a))
        break label130;
    }
    label130: for (boolean bool = true; ; bool = false)
    {
      localj.a(bool);
      if (!ExpandablePanel.b(this.a))
        break;
      this.a.b();
      return;
    }
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.k
 * JD-Core Version:    0.6.0
 */