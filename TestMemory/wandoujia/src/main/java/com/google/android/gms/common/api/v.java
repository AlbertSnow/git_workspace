package com.google.android.gms.common.api;

import android.content.IntentSender.SendIntentException;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import java.util.List;

final class v
  implements Runnable
{
  private final int a;
  private final ConnectionResult b;

  public v(zzn paramzzn, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
  }

  public final void run()
  {
    if (this.b.a())
      try
      {
        int i = 1 + (1 + this.c.getActivity().getSupportFragmentManager().f().indexOf(this.c) << 16);
        this.b.a(this.c.getActivity(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        zzn.a(this.c);
        return;
      }
    if (a.b(this.b.c()))
    {
      a.a(this.b.c(), this.c.getActivity(), this.c, this.c);
      return;
    }
    zzn.a(this.c, this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.v
 * JD-Core Version:    0.6.0
 */