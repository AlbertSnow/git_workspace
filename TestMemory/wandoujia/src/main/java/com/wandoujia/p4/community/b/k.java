package com.wandoujia.p4.community.b;

import com.wandoujia.mvc.Action;

public final class k
  implements Action
{
  private final String a;
  private final boolean b;

  public k(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public final void execute()
  {
    new Thread(new l(this)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.k
 * JD-Core Version:    0.6.0
 */