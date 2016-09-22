package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.stats.b;
import java.util.Collections;
import java.util.List;

public final class z extends u
{
  private final ab a;
  private zzac b;
  private final au c;
  private l d;

  protected z(w paramw)
  {
    super(paramw);
    this.d = new l(paramw.c());
    this.a = new ab(this);
    this.c = new aa(this, paramw);
  }

  private void e()
  {
    this.d.a();
    this.c.a(((Long)az.A.a()).longValue());
  }

  protected final void a()
  {
  }

  public final boolean a(d paramd)
  {
    android.support.v4.app.d.a(paramd);
    w.r();
    z();
    zzac localzzac = this.b;
    if (localzzac == null)
      return false;
    String str;
    if (paramd.e())
      str = as.h();
    while (true)
    {
      List localList = Collections.emptyList();
      try
      {
        localzzac.a(paramd.b(), paramd.d(), str, localList);
        e();
        return true;
        str = as.i();
      }
      catch (RemoteException localRemoteException)
      {
        c("Failed to send hits to AnalyticsService");
      }
    }
    return false;
  }

  public final boolean b()
  {
    w.r();
    z();
    return this.b != null;
  }

  public final boolean c()
  {
    w.r();
    z();
    if (this.b != null)
      return true;
    zzac localzzac = this.a.a();
    if (localzzac != null)
    {
      this.b = localzzac;
      e();
      return true;
    }
    return false;
  }

  public final void d()
  {
    w.r();
    z();
    try
    {
      b.a();
      k().unbindService(this.a);
      label22: if (this.b != null)
      {
        this.b = null;
        p().d();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label22;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label22;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.z
 * JD-Core Version:    0.6.0
 */