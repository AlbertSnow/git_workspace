package com.google.android.gms.ads.internal.safebrowsing;

import aio;
import ais;
import android.text.TextUtils;
import aqr;
import ard;
import are;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.future.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

final class i extends TimerTask
{
  i(h paramh)
  {
  }

  public final void run()
  {
    f localf = this.a.c;
    aio localaio1 = this.a.c.c;
    Set localSet = this.a.a;
    a locala = this.a.b;
    HashMap localHashMap = new HashMap();
    AtomicInteger localAtomicInteger = new AtomicInteger(localSet.size());
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      ard localard = (ard)aqr.c;
      aio localaio2 = localf.c;
      List localList = f.a;
      String str2 = (String)m.aR.a();
      if (localList == null)
        throw new IllegalArgumentException("Null threatTypes in lookupUri");
      if (TextUtils.isEmpty(str1))
        throw new IllegalArgumentException("Null or empty uri in lookupUri");
      localaio2.a(new are(localard, localaio2, localList, str1, str2)).a(new j(localf, localHashMap, str1, localAtomicInteger, localaio1, locala));
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.safebrowsing.i
 * JD-Core Version:    0.6.0
 */