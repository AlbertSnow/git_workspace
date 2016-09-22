package com.wandoujia.push2;

import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.toolkit.v;

final class a
  implements Runnable
{
  a(c paramc, TaskEvent.Builder paramBuilder)
  {
  }

  public final void run()
  {
    if (this.a != null)
      this.b.result_info(this.a.a());
    v.b().a(this.b, new ExtraPackage.Builder());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.a
 * JD-Core Version:    0.6.0
 */