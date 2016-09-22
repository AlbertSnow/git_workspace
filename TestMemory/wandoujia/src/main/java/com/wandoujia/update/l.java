package com.wandoujia.update;

import com.wandoujia.base.log.Log;
import com.wandoujia.gson.c;
import com.wandoujia.net.HttpException;
import com.wandoujia.net.a;
import com.wandoujia.net.g;
import com.wandoujia.net.h;
import com.wandoujia.update.protocol.EventReportProtocol.EventStatus;
import com.wandoujia.update.protocol.EventReportProtocol.EventType;
import com.wandoujia.update.protocol.UpdateInfo;

final class l
  implements g
{
  l(j paramj)
  {
  }

  public final void a(long paramLong)
  {
  }

  public final void b(long paramLong)
  {
    if (paramLong == j.a(this.a))
    {
      h localh = j.b(this.a).a(paramLong);
      int i = (int)(100L * localh.i() / localh.j());
      j.c(this.a).a(i);
    }
  }

  public final void c(long paramLong)
  {
    String str1 = j.class.getSimpleName();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    Log.d(str1, String.format("fetched updated, id = %d", arrayOfObject1), new Object[0]);
    UpdateInfo localUpdateInfo;
    if (paramLong == j.d(this.a))
    {
      h localh = j.b(this.a).a(paramLong);
      localUpdateInfo = (UpdateInfo)new c().a(localh.g(), UpdateInfo.class);
      if ((localUpdateInfo == null) || (!localUpdateInfo.isValid()))
        j.e(this.a).a();
    }
    do
    {
      return;
      j.a(this.a, localUpdateInfo);
      j.e(this.a).a(j.f(this.a));
      String str2 = j.class.getSimpleName();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(paramLong);
      Log.d(str2, String.format("update success, id = %d", arrayOfObject2), new Object[0]);
      return;
    }
    while (paramLong != j.a(this.a));
    new n(this.a).execute(new Void[0]);
  }

  public final void d(long paramLong)
  {
    if (paramLong == j.d(this.a))
      j.e(this.a).a();
    do
      return;
    while (paramLong != j.a(this.a));
    HttpException localHttpException = j.b(this.a).a(paramLong).h();
    String str1 = "unkown";
    String str2 = "unkown";
    if (localHttpException != null)
    {
      str1 = localHttpException.getMessage();
      str2 = new Integer(localHttpException.getType()).toString();
    }
    j.c(this.a).a(false);
    this.a.a(EventReportProtocol.EventType.DOWNLOAD_COMPLETE, EventReportProtocol.EventStatus.ERROR_DOWNLOAD, str2, str1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.l
 * JD-Core Version:    0.6.0
 */