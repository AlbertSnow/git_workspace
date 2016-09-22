package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.mvc.Action;

public final class x
  implements Action
{
  private final Activity a;
  private final String b;

  public x(String paramString, Activity paramActivity)
  {
    this.b = paramString;
    this.a = paramActivity;
  }

  public final void execute()
  {
    if (!com.wandoujia.account.a.z())
    {
      Activity localActivity = this.a;
      String str = this.a.getString(2131624474);
      Resources localResources = this.a.getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.getResources().getString(2131624465);
      com.wandoujia.p4.community.utils.a.a(localActivity, str, localResources.getString(2131624495, arrayOfObject), this.a.getString(2131624330), new y(), this.a.getString(2131624157), new z(this));
      return;
    }
    ThreadPool.execute(new aa(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.x
 * JD-Core Version:    0.6.0
 */