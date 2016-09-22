package com.wandoujia.jupiter.onboard;

import android.support.v4.view.ck;
import com.wandoujia.jupiter.view.PageDotIndicator;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class p
  implements ck
{
  p(StoryFragment paramStoryFragment)
  {
  }

  public final void a(int paramInt)
  {
    StoryFragment.a(this.a, paramInt);
    StoryFragment.a(this.a).setCurrentPage(paramInt);
    StoryFragment.a(this.a, (Model)StoryFragment.b(this.a).get(paramInt));
    StoryFragment.c(this.a);
    if ((StoryFragment.d(this.a).e(paramInt) instanceof StoryItemFragment))
      ((StoryItemFragment)StoryFragment.d(this.a).e(paramInt)).e();
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void b(int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.p
 * JD-Core Version:    0.6.0
 */