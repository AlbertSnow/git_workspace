package com.google.android.gms.ads.internal.config;

import com.google.android.gms.ads.internal.report.client.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@a
public final class i
{
  final Collection a = new ArrayList();
  final Collection b = new ArrayList();
  final Collection c = new ArrayList();

  public final List a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((d)localIterator.next()).a();
      if (str == null)
        continue;
      localArrayList.add(str);
    }
    return localArrayList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.config.i
 * JD-Core Version:    0.6.0
 */