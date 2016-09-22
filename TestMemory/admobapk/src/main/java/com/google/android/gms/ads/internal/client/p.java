package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.e;

abstract class p
{
  p(k paramk)
  {
  }

  protected abstract Object a();

  protected abstract Object a(aq paramaq);

  protected final Object b()
  {
    aq localaq = this.a.a();
    if (localaq == null)
    {
      e.e("ClientApi class cannot be loaded.");
      return null;
    }
    try
    {
      Object localObject = a(localaq);
      return localObject;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Cannot invoke local loader using ClientApi class", localRemoteException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.p
 * JD-Core Version:    0.6.0
 */