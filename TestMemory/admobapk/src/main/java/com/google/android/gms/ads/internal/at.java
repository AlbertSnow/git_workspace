package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.c;
import java.lang.ref.WeakReference;

final class at
  implements Runnable
{
  at(as paramas, WeakReference paramWeakReference)
  {
  }

  public final void run()
  {
    this.b.b = false;
    a locala = (a)this.a.get();
    AdRequestParcel localAdRequestParcel;
    if (locala != null)
    {
      localAdRequestParcel = this.b.a;
      if (locala.b(localAdRequestParcel))
        locala.a(localAdRequestParcel);
    }
    else
    {
      return;
    }
    c.d("Ad is not visible. Not refreshing ad.");
    locala.c.a(localAdRequestParcel);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.at
 * JD-Core Version:    0.6.0
 */