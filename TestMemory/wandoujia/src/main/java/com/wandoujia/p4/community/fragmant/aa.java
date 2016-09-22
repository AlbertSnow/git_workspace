package com.wandoujia.p4.community.fragmant;

import android.support.v4.app.FragmentActivity;
import com.wandoujia.p4.community.http.c.h;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import java.util.List;

final class aa
  implements y
{
  aa(CommunityPostReplyFragment paramCommunityPostReplyFragment)
  {
  }

  public final void a(String paramString, List<String> paramList)
  {
    String str1 = null;
    if (paramList != null)
    {
      boolean bool = paramList.isEmpty();
      str1 = null;
      if (!bool)
        str1 = (String)paramList.get(0);
    }
    FragmentActivity localFragmentActivity = this.a.getActivity();
    String str2 = CommunityPostReplyFragment.b(this.a).getId();
    if (CommunityPostReplyFragment.c(this.a) != null);
    for (String str3 = CommunityPostReplyFragment.c(this.a).getId(); ; str3 = "")
    {
      new h(localFragmentActivity, str2, paramString, str1, str3).a(CommunityPostReplyFragment.a(this.a));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.aa
 * JD-Core Version:    0.6.0
 */