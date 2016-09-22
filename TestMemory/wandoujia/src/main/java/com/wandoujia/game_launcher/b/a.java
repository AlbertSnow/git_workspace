package com.wandoujia.game_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.game_launcher.views.GameRecommendCellView;

public final class a extends com.wandoujia.launcher_base.launcher.c.a
{
  private GameRecommendCellView a;
  private boolean b = false;

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (this.a == null)
      this.a = GameRecommendCellView.a(paramViewGroup);
    return this.a;
  }

  public final void a()
  {
    if (this.a == null)
      return;
    if ((!this.b) && (!this.a.b()))
    {
      this.a.a(null);
      this.b = true;
      return;
    }
    this.a.a();
  }

  public final void b()
  {
    this.b = false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.b.a
 * JD-Core Version:    0.6.0
 */