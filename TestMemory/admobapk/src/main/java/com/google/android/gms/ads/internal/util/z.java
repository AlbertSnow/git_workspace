package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.customtabs.a;
import com.google.android.gms.ads.internal.customtabs.b;
import h;
import java.util.Iterator;
import java.util.List;

final class z
  implements b
{
  z(y paramy, List paramList, a parama, Context paramContext)
  {
  }

  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = String.valueOf(str1);
      if (str2.length() != 0);
      for (String str3 = "Pinging url: ".concat(str2); ; str3 = new String("Pinging url: "))
      {
        c.d(str3);
        Uri localUri = Uri.parse(str1);
        a locala = this.b;
        if (locala.a == null)
          break;
        h localh = locala.a();
        if (localh == null)
          break;
        localh.a(localUri, null, null);
        break;
      }
    }
    this.b.a((Activity)this.c);
  }

  public final void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.z
 * JD-Core Version:    0.6.0
 */