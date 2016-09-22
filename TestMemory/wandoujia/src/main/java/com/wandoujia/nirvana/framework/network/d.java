package com.wandoujia.nirvana.framework.network;

import com.android.volley.Request;
import com.android.volley.Request.Priority;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.p4.app.detail.model.b;

final class d extends Request<Object>
{
  private final com.android.volley.a a;
  private final String b;

  public d(com.android.volley.a parama, String paramString)
  {
    super(0, null, null);
    this.a = parama;
    this.b = paramString;
  }

  protected final b<Object> a(com.wandoujia.nirvana.framework.network.a.a parama)
  {
    return null;
  }

  protected final void a(Object paramObject)
  {
  }

  public final boolean g()
  {
    LaunchLogger localLaunchLogger = this.a.a(this.b);
    if (localLaunchLogger != null)
    {
      localLaunchLogger.e = (System.currentTimeMillis() - 604800000L);
      this.a.a(this.b, localLaunchLogger);
    }
    return true;
  }

  public final Request.Priority o()
  {
    return Request.Priority.IMMEDIATE;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.d
 * JD-Core Version:    0.6.0
 */