package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.e;

@com.google.android.gms.ads.internal.report.client.a
public final class m
  implements com.google.android.gms.ads.reward.a
{
  private final a a;

  public m(a parama)
  {
    this.a = parama;
  }

  public final String a()
  {
    if (this.a == null)
      return null;
    try
    {
      String str = this.a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not forward getType to RewardItem", localRemoteException);
    }
    return null;
  }

  public final int b()
  {
    if (this.a == null)
      return 0;
    try
    {
      int i = this.a.b();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Could not forward getAmount to RewardItem", localRemoteException);
    }
    return 0;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.m
 * JD-Core Version:    0.6.0
 */