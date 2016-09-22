package com.wandoujia.game_launcher.views;

import java.util.List;
import java.util.Random;

final class c
  implements j
{
  c(GameRecommendCellView paramGameRecommendCellView)
  {
  }

  private void c()
  {
    int i = new Random().nextInt(GameRecommendCellView.i(this.a).size());
    GameRecommendCellView.a(this.a, (String)GameRecommendCellView.i(this.a).get(i));
    this.a.a(GameRecommendCellView.a(this.a));
    GameRecommendCellView.i(this.a).remove(i);
  }

  public final void a()
  {
    GameRecommendCellView.c(this.a).b();
    this.a.a(null);
  }

  public final void b()
  {
    if (!GameRecommendCellView.h(this.a))
      return;
    GameRecommendCellView.c(this.a).b();
    if (!GameRecommendCellView.i(this.a).isEmpty())
    {
      c();
      return;
    }
    new d(this).execute(new Void[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.c
 * JD-Core Version:    0.6.0
 */