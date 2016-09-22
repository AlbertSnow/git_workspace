package com.google.android.gms.ads.internal.appcontent;

import android.view.View;
import com.google.android.gms.ads.internal.util.c;
import java.util.List;

final class e
  implements Runnable
{
  e(d paramd, View paramView)
  {
  }

  public final void run()
  {
    d locald = this.b;
    View localView = this.a;
    try
    {
      a locala = new a(locald.e, locald.f, locald.g, locald.h);
      h localh = locald.a(localView, locala);
      locala.c();
      if ((localh.a == 0) && (localh.b == 0))
        return;
      if (((localh.b != 0) || (locala.b != 0)) && ((localh.b != 0) || (!locald.c.a(locala))))
      {
        b localb = locald.c;
        synchronized (localb.a)
        {
          if (localb.c.size() >= 10)
          {
            int j = localb.c.size();
            c.b(41 + "Queue is full, current size = " + j);
            localb.c.remove(0);
          }
          int i = localb.b;
          localb.b = (i + 1);
          locala.c = i;
          localb.c.add(locala);
          return;
        }
      }
    }
    catch (Exception localException)
    {
      c.b("Exception in fetchContentOnUIThread", localException);
      locald.d.a(localException, true);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.e
 * JD-Core Version:    0.6.0
 */