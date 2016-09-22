package com.google.android.gms.ads.internal.activeview;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.webview.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class e
  implements t
{
  e(a parama)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    if (!this.a.a(paramMap));
    do
      return;
    while (!paramMap.containsKey("isVisible"));
    if (("1".equals(paramMap.get("isVisible"))) || ("true".equals(paramMap.get("isVisible"))));
    for (boolean bool1 = true; ; bool1 = false)
    {
      Boolean localBoolean = Boolean.valueOf(bool1);
      a locala = this.a;
      boolean bool2 = localBoolean.booleanValue();
      Iterator localIterator = locala.f.iterator();
      while (localIterator.hasNext())
        ((j)localIterator.next()).a(locala, bool2);
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.e
 * JD-Core Version:    0.6.0
 */