package com.google.android.gms.ads.internal.util.future;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@com.google.android.gms.ads.internal.report.client.a
public final class c
{
  public static g a(List paramList)
  {
    a locala = new a();
    int i = paramList.size();
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).a(new e(localAtomicInteger, i, locala, paramList));
    return locala;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.future.c
 * JD-Core Version:    0.6.0
 */