package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a
public final class aq
  implements Iterable
{
  public final List a = new LinkedList();

  static ao b(b paramb)
  {
    Iterator localIterator = bc.a().x.iterator();
    while (localIterator.hasNext())
    {
      ao localao = (ao)localIterator.next();
      if (localao.a == paramb)
        return localao;
    }
    return null;
  }

  public final boolean a(b paramb)
  {
    ao localao = b(paramb);
    if (localao != null)
    {
      localao.b.a();
      return true;
    }
    return false;
  }

  public final Iterator iterator()
  {
    return this.a.iterator();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.aq
 * JD-Core Version:    0.6.0
 */