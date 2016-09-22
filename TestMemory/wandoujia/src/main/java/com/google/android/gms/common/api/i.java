package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.zzb;
import java.lang.ref.WeakReference;

final class i extends zzb
{
  private final WeakReference<g> a;

  i(g paramg)
  {
    this.a = new WeakReference(paramg);
  }

  public final void a(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult)
  {
    g localg = (g)this.a.get();
    if (localg == null)
      return;
    g.b(localg).c.post(new j(localg, paramConnectionResult));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.i
 * JD-Core Version:    0.6.0
 */