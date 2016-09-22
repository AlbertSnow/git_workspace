package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.text.TextUtils;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityTopicDetailActivity;
import com.wandoujia.p4.community.http.model.CommunityNotificationModel;

public final class an
  implements Action
{
  private final Activity a;
  private final String b;
  private final CommunityNotificationModel c;

  public an(CommunityNotificationModel paramCommunityNotificationModel, Activity paramActivity)
  {
    this.c = paramCommunityNotificationModel;
    this.a = paramActivity;
    this.b = null;
  }

  public an(String paramString, Activity paramActivity)
  {
    this.a = paramActivity;
    this.b = paramString;
    this.c = null;
  }

  public final void execute()
  {
    if (this.c != null)
      if ("REPLY".equals(this.c.getCommentType()))
        CommunityTopicDetailActivity.a(this.a, this.c);
    do
    {
      return;
      CommunityTopicDetailActivity.a(this.a, this.c.getTopicId());
      return;
    }
    while (TextUtils.isEmpty(this.b));
    CommunityTopicDetailActivity.a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.an
 * JD-Core Version:    0.6.0
 */