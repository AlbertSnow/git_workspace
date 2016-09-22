package com.wandoujia.game_launcher.views;

import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class g
  implements View.OnClickListener
{
  g(GameStoryView paramGameStoryView)
  {
  }

  public final void onClick(View paramView)
  {
    GameStoryView.e(this.a);
    b.a(paramView, "game_review", ViewLogPackage.Element.ICON, ViewLogPackage.Action.OPEN, "view_article_more");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.g
 * JD-Core Version:    0.6.0
 */