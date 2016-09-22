package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityPostContentActivity;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

public final class ap
  implements Action
{
  private final Activity a;
  private final CommunityTopicModel b;
  private final CommunityReplyModel c;

  public ap(Activity paramActivity, CommunityTopicModel paramCommunityTopicModel)
  {
    this.b = paramCommunityTopicModel;
    this.a = paramActivity;
    this.c = null;
  }

  public ap(Activity paramActivity, CommunityTopicModel paramCommunityTopicModel, CommunityReplyModel paramCommunityReplyModel)
  {
    this.a = paramActivity;
    this.c = paramCommunityReplyModel;
    this.b = paramCommunityTopicModel;
  }

  public final void execute()
  {
    if (this.b == null)
      return;
    if (!com.wandoujia.account.a.z())
    {
      Activity localActivity3 = this.a;
      Resources localResources = this.a.getResources();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.a.getResources().getString(2131624782);
      com.wandoujia.p4.community.utils.a.a(localActivity3, localResources.getString(2131624495, arrayOfObject2));
      return;
    }
    if (com.wandoujia.account.a.m())
    {
      Activity localActivity1 = this.a;
      Activity localActivity2 = this.a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.a.getString(2131624782);
      p.a(localActivity1, localActivity2.getString(2131624496, arrayOfObject1), p.b).a();
      return;
    }
    if (TextUtils.isEmpty(this.b.getGroup().getCurUserRole()))
    {
      com.wandoujia.p4.community.utils.a.a(this.a, this.a.getResources().getString(2131624470), this.b.getGroup().getId());
      return;
    }
    if (!this.b.currentUserCanAddReply())
    {
      ThreadPool.execute(new aq(this));
      return;
    }
    CommunityPostContentActivity.a(this.a, this.b, this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ap
 * JD-Core Version:    0.6.0
 */