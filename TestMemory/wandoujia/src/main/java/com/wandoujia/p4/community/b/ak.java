package com.wandoujia.p4.community.b;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.activity.CommunityNewNominateActivity;

public final class ak
  implements Action
{
  private Context a;

  public ak(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void execute()
  {
    if (!com.wandoujia.account.a.z())
    {
      Context localContext = this.a;
      String str = this.a.getString(2131624474);
      Resources localResources = this.a.getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.getResources().getString(2131624405);
      com.wandoujia.p4.community.utils.a.a(localContext, str, localResources.getString(2131624495, arrayOfObject), this.a.getString(2131624330), new al(), this.a.getString(2131624157), new am(this));
      return;
    }
    CommunityNewNominateActivity.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ak
 * JD-Core Version:    0.6.0
 */