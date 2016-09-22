package com.wandoujia.game_launcher.views;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.wandoujia.game_launcher.lib.R.dimen;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.launcher.launcher.views.TopCropAsyncImageView;

final class k extends cf
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f = this.g.getResources().getDimensionPixelSize(R.dimen.game_launcher_split_padding);

  public k(GameStoryView paramGameStoryView)
  {
    this.b = b.a(150.0F, paramGameStoryView.getContext());
    this.c = b.a(75.0F, paramGameStoryView.getContext());
    this.d = (paramGameStoryView.getResources().getDimensionPixelSize(R.dimen.quotation_max_top_padding) + paramGameStoryView.getResources().getDimensionPixelSize(R.dimen.game_launcher_split_padding));
    this.e = paramGameStoryView.getResources().getDimensionPixelSize(R.dimen.quotation_start_move);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    super.a(paramRecyclerView, paramInt);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.a(paramRecyclerView, paramInt1, paramInt2);
    View localView1 = GameStoryView.g(this.g).b(0);
    if ((localView1 == null) || (localView1.getTop() > 0));
    while (true)
    {
      return;
      this.a = (-localView1.getTop());
      try
      {
        int i1 = GameStoryView.h(this.g).getDrawable().getIntrinsicHeight();
        i = i1;
        if (this.a >= this.b)
        {
          j = 0;
          f1 = 0.0F;
          GameStoryView.i(this.g).setAlpha(f1);
          ViewGroup.LayoutParams localLayoutParams = GameStoryView.h(this.g).getLayoutParams();
          localLayoutParams.height = j;
          GameStoryView.h(this.g).setLayoutParams(localLayoutParams);
          int k = this.a;
          int m = this.c;
          f2 = 0.0F;
          if (k < m)
            break label371;
          GameStoryView.j(this.g).setAlpha(f2);
          if (f2 != 1.0F)
            break label392;
          GameStoryView.j(this.g).setVisibility(0);
          GameStoryView.j(this.g).setClickable(true);
          View localView2 = GameStoryView.k(this.g).findViewById(R.id.quote_area);
          if (this.a < this.e)
            break label418;
          if (!GameStoryView.d(this.g))
          {
            GameStoryView.c(this.g).b();
            GameStoryView.a(this.g, true);
          }
          if (localView2 == null)
            continue;
          View localView3 = localView2.findViewById(R.id.game_divider);
          int n = this.d;
          if (this.a >= this.e)
          {
            n = this.d - 2 * (this.a - this.e) / 3;
            if (n < this.f)
              n = this.f;
          }
          localView3.setPadding(localView3.getPaddingLeft(), n, localView3.getPaddingRight(), localView3.getPaddingBottom());
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          int i = 0;
          continue;
          float f1 = (this.b - this.a) / this.b;
          int j = i - this.a / 3;
          continue;
          label371: float f2 = (this.c - this.a) / this.c;
          continue;
          label392: GameStoryView.j(this.g).setVisibility(8);
          GameStoryView.j(this.g).setClickable(false);
          continue;
          label418: if (!GameStoryView.d(this.g))
            continue;
          GameStoryView.c(this.g).a();
          GameStoryView.a(this.g, false);
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.k
 * JD-Core Version:    0.6.0
 */