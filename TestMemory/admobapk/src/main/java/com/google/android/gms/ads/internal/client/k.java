package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.formats.client.ah;
import com.google.android.gms.ads.internal.purchase.client.s;
import com.google.android.gms.ads.internal.reward.client.n;

@com.google.android.gms.ads.internal.report.client.a
public class k
{
  final e a;
  final d b;
  private aq c;
  private final Object d = new Object();

  public k(e parame, d paramd, bn parambn, ah paramah, n paramn, s params, com.google.android.gms.ads.internal.overlay.client.a parama)
  {
    this.a = parame;
    this.b = paramd;
  }

  public static Object a(Context paramContext, boolean paramBoolean, p paramp)
  {
    if (!com.google.android.gms.ads.internal.util.client.a.b(paramContext))
    {
      com.google.android.gms.ads.internal.util.client.e.b("Google Play Services is not available");
      paramBoolean = true;
    }
    Object localObject;
    if (paramBoolean)
    {
      localObject = paramp.b();
      if (localObject == null)
        localObject = paramp.a();
    }
    do
    {
      return localObject;
      localObject = paramp.a();
    }
    while (localObject != null);
    return paramp.b();
  }

  private static aq b()
  {
    try
    {
      Object localObject = k.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
      if (!(localObject instanceof IBinder))
      {
        com.google.android.gms.ads.internal.util.client.e.e("ClientApi class is not an instance of IBinder");
        return null;
      }
      aq localaq = ar.asInterface((IBinder)localObject);
      return localaq;
    }
    catch (Exception localException)
    {
      com.google.android.gms.ads.internal.util.client.e.c("Failed to instantiate ClientApi class.", localException);
    }
    return null;
  }

  final aq a()
  {
    synchronized (this.d)
    {
      if (this.c == null)
        this.c = b();
      aq localaq = this.c;
      return localaq;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.k
 * JD-Core Version:    0.6.0
 */