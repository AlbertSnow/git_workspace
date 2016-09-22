package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.http.c.j;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

public final class ac
  implements Action
{
  private final Activity a;
  private final CommunityTopicModel b;

  public ac(Activity paramActivity, CommunityTopicModel paramCommunityTopicModel)
  {
    this.a = paramActivity;
    this.b = paramCommunityTopicModel;
  }

  private void a(boolean paramBoolean)
  {
    new j(this.a, this.b.getId(), paramBoolean).a(null);
  }

  public final void execute()
  {
    if ((this.a == null) || (this.a.isFinishing()) || (this.b == null))
      return;
    if (!this.b.isCurUserLiked());
    for (boolean bool = true; !com.wandoujia.account.a.z(); bool = false)
    {
      Activity localActivity3 = this.a;
      Resources localResources = this.a.getResources();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.a.getResources().getString(2131624472);
      com.wandoujia.p4.community.utils.a.a(localActivity3, localResources.getString(2131624495, arrayOfObject2));
      return;
    }
    if (com.wandoujia.account.a.m())
    {
      Activity localActivity1 = this.a;
      Activity localActivity2 = this.a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.a.getString(2131624472);
      p.a(localActivity1, localActivity2.getString(2131624496, arrayOfObject1), p.b).a();
      return;
    }
    String str = com.wandoujia.account.a.t();
    if (String.valueOf(this.b.getAuthor().getUid()).equals(str))
    {
      p.a(this.a, 2131624436, p.b).a();
      return;
    }
    if (!this.b.currentUserCanVote())
      ThreadPool.execute(new ad(this, bool));
    a(bool);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ac
 * JD-Core Version:    0.6.0
 */