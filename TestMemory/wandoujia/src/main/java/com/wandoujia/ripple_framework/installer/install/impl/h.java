package com.wandoujia.ripple_framework.installer.install.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.b;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.a;
import com.wandoujia.ripple_framework.installer.install.n;
import de.greenrobot.event.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class h
  implements Runnable
{
  h(f paramf)
  {
  }

  public final void run()
  {
    int i = 0;
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList2;
    Intent[] arrayOfIntent;
    while (true)
    {
      String str;
      synchronized (f.b(this.a))
      {
        localArrayList2 = new ArrayList(f.b(this.a));
        f.b(this.a).clear();
        arrayOfIntent = new Intent[localArrayList2.size()];
        Iterator localIterator1 = localArrayList2.iterator();
        int j = 0;
        if (!localIterator1.hasNext())
          break;
        j localj4 = (j)localIterator1.next();
        str = localj4.a;
        if (str.startsWith("file://"))
        {
          localUri = Uri.parse(str);
          Intent localIntent2 = new Intent("android.intent.action.VIEW");
          localIntent2.setFlags(268435456);
          localIntent2.setDataAndType(localUri, "application/vnd.android.package-archive");
          int m = j + 1;
          arrayOfIntent[j] = localIntent2;
          localHashSet.add(b.L(localj4.a));
          j = m;
        }
      }
      Uri localUri = Uri.fromFile(new File(str));
    }
    ((c)i.k().a("event_bus")).d(new a(localHashSet));
    try
    {
      if (SystemUtil.aboveApiLevel(11))
        i.k().g().startActivities(arrayOfIntent);
      while (true)
      {
        Iterator localIterator4 = localArrayList2.iterator();
        while (localIterator4.hasNext())
        {
          j localj3 = (j)localIterator4.next();
          if (f.a(this.a) == null)
            continue;
          f.a(this.a).a(localj3.b);
        }
        int k = arrayOfIntent.length;
        while (i < k)
        {
          Intent localIntent1 = arrayOfIntent[i];
          i.k().g().startActivity(localIntent1);
          i++;
        }
      }
    }
    catch (Exception localException)
    {
    }
    finally
    {
      Iterator localIterator3;
      j localj2;
      Iterator localIterator2 = localArrayList2.iterator();
      while (localIterator2.hasNext())
      {
        j localj1 = (j)localIterator2.next();
        if (f.a(this.a) == null)
          continue;
        f.a(this.a).a(localj1.b);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.h
 * JD-Core Version:    0.6.0
 */