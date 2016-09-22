package com.google.android.gms.common.api;

import android.content.IntentSender.SendIntentException;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import java.util.List;

final class t
  implements Runnable
{
  private final int a;
  private final ConnectionResult b;

  public t(int paramInt, ConnectionResult paramConnectionResult)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
  }

  public final void run()
  {
    if ((!zzm.a(null)) || (zzm.b(null)))
      return;
    zzm.c(null);
    zzm.a(null, this.a);
    zzm.a(null, this.b);
    if (this.b.a())
      try
      {
        int i = 1 + (1 + null.getActivity().getSupportFragmentManager().f().indexOf(null) << 16);
        this.b.a(null.getActivity(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        zzm.d(null);
        return;
      }
    if (a.b(this.b.c()))
    {
      a.a(this.b.c(), null.getActivity(), null, null);
      return;
    }
    zzm.a(null, this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.t
 * JD-Core Version:    0.6.0
 */