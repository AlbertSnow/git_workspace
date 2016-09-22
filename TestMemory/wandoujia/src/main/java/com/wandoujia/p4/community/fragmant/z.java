package com.wandoujia.p4.community.fragmant;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.community.http.c.f;

final class z
  implements f
{
  z(CommunityPostReplyFragment paramCommunityPostReplyFragment)
  {
  }

  public final void a()
  {
    Log.d("ugc", "post result failed", new Object[0]);
  }

  public final void b()
  {
    if (this.a.isAdded())
      this.a.getActivity().finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.z
 * JD-Core Version:    0.6.0
 */