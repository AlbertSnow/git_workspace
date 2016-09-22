package com.google.android.gms.ads.internal.interstitial;

import android.os.Handler;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a
final class b
{
  final List a = new LinkedList();

  final void a(aa paramaa)
  {
    Handler localHandler = com.google.android.gms.ads.internal.util.y.a;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      localHandler.post(new y(this, (z)localIterator.next(), paramaa));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.b
 * JD-Core Version:    0.6.0
 */