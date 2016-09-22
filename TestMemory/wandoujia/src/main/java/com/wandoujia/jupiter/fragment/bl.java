package com.wandoujia.jupiter.fragment;

import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.jupiter.view.ShareView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class bl extends c
{
  bl(bk parambk)
  {
  }

  protected final void a(Model paramModel)
  {
    ((ShareView)e()).a(ReviewTopicFragment.b(this.a.a));
    ((ShareView)e()).setContentType(ShareUtil.ShareContentType.REVIEW_LIST);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bl
 * JD-Core Version:    0.6.0
 */