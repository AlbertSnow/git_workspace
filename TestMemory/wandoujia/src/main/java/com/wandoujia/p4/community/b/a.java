package com.wandoujia.p4.community.b;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.mvc.Action;

public final class a
  implements Action
{
  private String a;
  private Context b;

  public a(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.a = paramString;
  }

  public final void execute()
  {
    if (this.a == null)
      return;
    if (!com.wandoujia.account.a.z())
    {
      Context localContext = this.b;
      String str = this.b.getString(2131624474);
      Resources localResources = this.b.getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.b.getResources().getString(2131624431);
      com.wandoujia.p4.community.utils.a.a(localContext, str, localResources.getString(2131624495, arrayOfObject), this.b.getString(2131624330), new b(), this.b.getString(2131624157), new c(this));
      return;
    }
    ThreadPool.execute(new d(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.a
 * JD-Core Version:    0.6.0
 */