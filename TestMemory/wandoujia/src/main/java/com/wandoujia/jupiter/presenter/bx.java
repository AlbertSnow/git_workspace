package com.wandoujia.jupiter.presenter;

import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.wandoujia.jupiter.anim.ChangeAnimType;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;

final class bx
  implements View.OnClickListener
{
  bx(bw parambw, View paramView, Model paramModel)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.setOnClickListener(null);
    Model localModel = bw.a(this.c);
    localModel.Q().a(0);
    int i = b.a(this.c.j().a(), localModel);
    if ((i >= 0) && (this.c.j().a() != null))
    {
      View localView = android.support.v4.app.d.d(this.c.e());
      if (localView != null)
        localView.setTag(2131492884, ChangeAnimType.FLIP_RIGHT);
      this.c.j().a().a(i, localModel);
      if (this.b.Q().e())
        this.b.Q().a(false);
    }
    ViewGroup localViewGroup = this.c.h().a(2131493645).i();
    localViewGroup.postDelayed(new by(localViewGroup), 300L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bx
 * JD-Core Version:    0.6.0
 */