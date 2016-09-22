package com.wandoujia.p4.community.fragmant;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

final class w
  implements AdapterView.OnItemClickListener
{
  w(CommunityPostContentFragment paramCommunityPostContentFragment)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = CommunityPostContentFragment.a(this.a).size();
    if (paramInt >= i)
      return;
    int j;
    if ((!TextUtils.isEmpty((CharSequence)CommunityPostContentFragment.a(this.a).get(paramInt))) || (CommunityPostContentFragment.b(this.a)))
    {
      CommunityPostContentFragment.a(this.a, paramInt);
      j = 1;
    }
    while (true)
    {
      this.a.a(j, 0);
      return;
      j = 1 + (CommunityPostContentFragment.c(this.a) - i);
      CommunityPostContentFragment.a(this.a, -1);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.w
 * JD-Core Version:    0.6.0
 */