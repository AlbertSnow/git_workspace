package com.wandoujia.game_launcher.views;

import android.view.View;
import com.wandoujia.game_launcher.d;
import com.wandoujia.game_launcher.models.RecommendModel;

final class b
  implements d<RecommendModel>
{
  b(GameRecommendCellView paramGameRecommendCellView)
  {
  }

  public final void a()
  {
    GameRecommendCellView.c(this.a).setVisibility(4);
    GameRecommendCellView.f(this.a).b();
    GameRecommendCellView.d(this.a).setVisibility(0);
    GameRecommendCellView.g(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.b
 * JD-Core Version:    0.6.0
 */