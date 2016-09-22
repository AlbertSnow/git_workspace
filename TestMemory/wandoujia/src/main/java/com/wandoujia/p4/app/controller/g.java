package com.wandoujia.p4.app.controller;

import com.wandoujia.entities.app.comment.Comment;
import com.wandoujia.p4.http.b.k;
import com.wandoujia.p4.http.request.f;
import java.util.List;

final class g
  implements Runnable
{
  private g(AppCommenter paramAppCommenter)
  {
  }

  public final void run()
  {
    try
    {
      k localk = new k();
      ((f)localk.getRequestBuilder()).b(com.wandoujia.account.a.t()).c("phone").d(com.wandoujia.account.a.i()).a(AppCommenter.d(this.a));
      List localList = (List)com.wandoujia.p4.a.b().execute(localk);
      if ((localList != null) && (!localList.isEmpty()))
        AppCommenter.a(this.a, (Comment)localList.get(0));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.controller.g
 * JD-Core Version:    0.6.0
 */