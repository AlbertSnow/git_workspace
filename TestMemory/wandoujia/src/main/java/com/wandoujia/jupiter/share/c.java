package com.wandoujia.jupiter.share;

import com.tencent.tauth.b;
import com.tencent.tauth.d;
import com.wandoujia.jupiter.h;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

final class c
  implements b
{
  c(String paramString)
  {
  }

  public final void a(d paramd)
  {
    ((Logger)h.k().a("log")).a(new TaskEvent.Builder().action(TaskEvent.Action.SHARE).result(TaskEvent.Result.FAIL).result_info(SharePlatformEnum.QQ.name()), new ExtraPackage.Builder().content_package(new ContentPackage.Builder().identity(this.a).build()));
  }

  public final void a(Object paramObject)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.c
 * JD-Core Version:    0.6.0
 */