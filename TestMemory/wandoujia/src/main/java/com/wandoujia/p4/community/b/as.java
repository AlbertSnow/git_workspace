package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityPostContentActivity;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

public final class as
  implements Action
{
  private final Activity a;
  private final CommunityGroupModel b;

  public as(Activity paramActivity, CommunityGroupModel paramCommunityGroupModel)
  {
    this.a = paramActivity;
    this.b = paramCommunityGroupModel;
  }

  public final void execute()
  {
    if (com.wandoujia.account.a.z())
    {
      if (this.b.currentUserCanAddTopic())
      {
        CommunityPostContentActivity.a(this.a, this.b);
        return;
      }
      ThreadPool.execute(new av(this, 0));
      return;
    }
    Activity localActivity = this.a;
    String str = this.a.getString(2131624474);
    Resources localResources = this.a.getResources();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a.getResources().getString(2131624503);
    com.wandoujia.p4.community.utils.a.a(localActivity, str, localResources.getString(2131624495, arrayOfObject), this.a.getString(2131624330), new at(), this.a.getString(2131624157), new au(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.as
 * JD-Core Version:    0.6.0
 */