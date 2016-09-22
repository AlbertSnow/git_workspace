package com.wandoujia.ripple_framework.ripple.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;
import android.widget.FrameLayout;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;

final class e extends cf
{
  e(FeedDetailFragment paramFeedDetailFragment)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    if ((FeedDetailFragment.a(this.a)) && (paramInt == 0))
    {
      FeedDetailFragment.a(this.a, 0);
      ViewHelper.setTranslationY(FeedDetailFragment.b(this.a), 0.0F);
      FeedDetailFragment.a(this.a, false);
    }
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    int i = ((ObservableRecyclerView)paramRecyclerView).getScrollItemIndex();
    int j = ((ObservableRecyclerView)paramRecyclerView).getScrollItemOffset();
    FeedDetailFragment localFeedDetailFragment;
    if (paramInt2 >= 0)
    {
      FeedDetailFragment.b(this.a, paramInt2);
      if (FeedDetailFragment.c(this.a) > FeedDetailFragment.e())
        FeedDetailFragment.a(this.a, FeedDetailFragment.e());
      if (FeedDetailFragment.c(this.a) == FeedDetailFragment.e())
        if ((i > FeedDetailFragment.d(this.a)) || ((i == FeedDetailFragment.d(this.a)) && (j < -FeedDetailFragment.f())))
        {
          FeedDetailFragment.e(this.a);
          ViewHelper.setTranslationY(FeedDetailFragment.b(this.a), -FeedDetailFragment.c(this.a));
          localFeedDetailFragment = this.a;
          if (FeedDetailFragment.c(this.a) < FeedDetailFragment.g())
            break label306;
        }
    }
    label306: for (boolean bool = true; ; bool = false)
    {
      FeedDetailFragment.b(localFeedDetailFragment, bool);
      this.a.renderSystemBar(true);
      return;
      FeedDetailFragment.f(this.a).setVisibility(8);
      break;
      FeedDetailFragment.f(this.a).setVisibility(8);
      break;
      if (paramInt2 >= 0)
        break;
      FeedDetailFragment.b(this.a, paramInt2);
      if (i != 0)
        if (FeedDetailFragment.c(this.a) < FeedDetailFragment.g())
          FeedDetailFragment.a(this.a, FeedDetailFragment.g());
      while (true)
      {
        FeedDetailFragment.g(this.a);
        break;
        if (j < -FeedDetailFragment.g())
        {
          if (FeedDetailFragment.c(this.a) >= FeedDetailFragment.g())
            continue;
          FeedDetailFragment.a(this.a, FeedDetailFragment.g());
          continue;
        }
        if (FeedDetailFragment.c(this.a) >= 0)
          continue;
        FeedDetailFragment.a(this.a, 0);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.e
 * JD-Core Version:    0.6.0
 */