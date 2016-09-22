package com.google.android.gms.ads.internal.request;

import alz;
import ama;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import anw;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.bd;
import com.google.android.gms.ads.internal.util.be;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.common.ConnectionResult;

@com.google.android.gms.ads.internal.report.client.a
public final class o extends k
  implements alz, ama
{
  private Context a;
  private VersionInfoParcel b;
  private com.google.android.gms.ads.internal.util.promise.a c;
  private final i d;
  private final Object e = new Object();
  private p f;
  private boolean g;

  public o(Context paramContext, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.util.promise.a parama, i parami)
  {
    super(parama, parami);
    this.a = paramContext;
    this.b = paramVersionInfoParcel;
    this.c = parama;
    this.d = parami;
    if (((Boolean)m.q.a()).booleanValue())
      this.g = true;
    for (Looper localLooper = bc.a().q.a(); ; localLooper = paramContext.getMainLooper())
    {
      this.f = new p(paramContext, localLooper, this, this, this.b.d);
      this.f.i();
      return;
    }
  }

  public final void a()
  {
    synchronized (this.e)
    {
      if ((this.f.e()) || (this.f.f()))
        this.f.d();
      Binder.flushPendingCommands();
      bd localbd;
      if (this.g)
        localbd = bc.a().q;
      synchronized (localbd.c)
      {
        int i = localbd.b;
        boolean bool = false;
        if (i > 0)
          bool = true;
        anw.b(bool, "Invalid state: release() called more times than expected.");
        int j = -1 + localbd.b;
        localbd.b = j;
        if (j == 0)
          localbd.a.post(new be(localbd));
        this.g = false;
        return;
      }
    }
  }

  public final void a(int paramInt)
  {
    c.b("Disconnected from remote ad request service.");
  }

  public final void a(Bundle paramBundle)
  {
    ((Void)d());
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    c.b("Cannot connect to remote service, fallback to local instance.");
    new n(this.a, this.c, this.d).d();
    Bundle localBundle = new Bundle();
    localBundle.putString("action", "gms_connection_failed_fallback_to_local");
    bc.a().e.b(this.a, this.b.b, "gmob-apps", localBundle, true);
  }

  public final w b()
  {
    try
    {
      synchronized (this.e)
      {
        w localw = this.f.c();
        return localw;
        label21: return null;
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      break label21;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label21;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.o
 * JD-Core Version:    0.6.0
 */