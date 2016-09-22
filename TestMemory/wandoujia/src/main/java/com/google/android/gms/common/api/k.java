package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzq.zza;
import java.lang.ref.WeakReference;

final class k extends zzq.zza
{
  private final WeakReference<g> a = new WeakReference(null);

  k(g paramg)
  {
  }

  public final void a(ResolveAccountResponse paramResolveAccountResponse)
  {
    g localg = (g)this.a.get();
    if (localg == null)
      return;
    g.b(localg).c.post(new l(localg, paramResolveAccountResponse));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.k
 * JD-Core Version:    0.6.0
 */