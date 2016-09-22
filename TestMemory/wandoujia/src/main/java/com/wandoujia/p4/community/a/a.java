package com.wandoujia.p4.community.a;

import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import de.greenrobot.event.c;

public final class a
  implements IAccountListener
{
  private boolean a = true;

  public final void a()
  {
    if (this.a)
    {
      android.support.v4.app.b.O().d(new CommunityEvent(CommunityEvent.Type.LOGIN, true, null));
      this.a = false;
    }
  }

  public final void a(IAccountListener.LoginType paramLoginType)
  {
    if (this.a)
    {
      android.support.v4.app.b.O().d(new CommunityEvent(CommunityEvent.Type.LOGIN, true, null));
      this.a = false;
    }
    ThreadPool.execute(new b(paramLoginType));
  }

  public final void a(boolean paramBoolean)
  {
    this.a = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.a.a
 * JD-Core Version:    0.6.0
 */