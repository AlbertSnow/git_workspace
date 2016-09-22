package com.wandoujia.p4.community.http.c;

import android.app.Activity;
import android.content.Context;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.view.p;

final class c
  implements Runnable
{
  c(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    Activity localActivity = this.b.a.a;
    Context localContext = JupiterApplication.e();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.a);
    p.a(localActivity, localContext.getString(2131624548, arrayOfObject), p.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.c
 * JD-Core Version:    0.6.0
 */