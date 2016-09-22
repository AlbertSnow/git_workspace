package com.wandoujia.p4.community.fragmant;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.phoenix2.av.view.ScrollDownLayout;

final class ar
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private int a = 0;

  ar(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  public final void onGlobalLayout()
  {
    int i = CommunityTopicListTabFragment.b(this.b).getHeight();
    if (this.a == i)
      return;
    this.a = i;
    CommunityTopicListTabFragment.c(this.b).setMaxOffset(this.a);
    int j = this.b.getResources().getDimensionPixelSize(2131427446);
    if (SystemUtil.aboveApiLevel(19))
      j += (int)this.b.getResources().getDimension(2131427884);
    CommunityTopicListTabFragment.c(this.b).setMinOffset(j);
    CommunityTopicListTabFragment.c(this.b).scrollTo(0, -CommunityTopicListTabFragment.c(this.b).getMaxOffset());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.ar
 * JD-Core Version:    0.6.0
 */