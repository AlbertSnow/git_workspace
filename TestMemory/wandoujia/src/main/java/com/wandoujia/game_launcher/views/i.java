package com.wandoujia.game_launcher.views;

import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class i
  implements View.OnClickListener
{
  i(GameStoryView paramGameStoryView)
  {
  }

  public final void onClick(View paramView)
  {
    b.a(paramView, "game_review", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REFRESH, "refresh_game");
    if (GameStoryView.f(this.a) != null)
      GameStoryView.f(this.a).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.i
 * JD-Core Version:    0.6.0
 */