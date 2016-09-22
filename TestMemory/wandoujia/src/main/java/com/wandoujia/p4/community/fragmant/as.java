package com.wandoujia.p4.community.fragmant;

import android.content.res.Resources;
import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.views.q;

final class as
  implements q
{
  as(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  public final void a(float paramFloat)
  {
    int i = CommunityTopicListTabFragment.b(this.a).getMeasuredHeight() - this.a.getResources().getDimensionPixelSize(2131427446);
    if (SystemUtil.aboveApiLevel(19))
      i -= (int)this.a.getResources().getDimension(2131427884);
    ViewHelper.setTranslationY(CommunityTopicListTabFragment.b(this.a), (int)(i * (paramFloat - 1.0F)));
    if (CommunityTopicListTabFragment.d(this.a) != null)
    {
      if (paramFloat != 0.0F)
        break label90;
      CommunityTopicListTabFragment.e(this.a);
    }
    label90: 
    do
      return;
    while (paramFloat != 1.0F);
    CommunityTopicListTabFragment.f(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.as
 * JD-Core Version:    0.6.0
 */