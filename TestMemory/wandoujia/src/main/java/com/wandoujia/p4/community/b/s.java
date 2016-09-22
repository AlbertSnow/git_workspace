package com.wandoujia.p4.community.b;

import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.base.utils.ThreadPool.Priority;
import com.wandoujia.mvc.Action;

public final class s
  implements Action
{
  private String a;
  private w b;

  public s(String paramString, w paramw)
  {
    this.a = paramString;
    this.b = paramw;
  }

  public final void execute()
  {
    ThreadPool.execute(new t(this, this.a), ThreadPool.Priority.LOW);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.s
 * JD-Core Version:    0.6.0
 */