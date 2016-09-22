package com.wandoujia.p4.community.fragmant;

import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.community.PullToRefreshAsyncloadFragment;
import java.util.List;

public abstract class CommunityNetworkListAsyncloadFragment<M extends BaseModel> extends PullToRefreshAsyncloadFragment<M>
{
  protected void a(int paramInt1, int paramInt2, k<M> paramk)
  {
    super.a(paramInt1, paramInt2, paramk);
    if ((paramk.a.isEmpty()) && (paramInt1 == 0) && (!k().isEmpty()))
      k().a(paramk.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityNetworkListAsyncloadFragment
 * JD-Core Version:    0.6.0
 */