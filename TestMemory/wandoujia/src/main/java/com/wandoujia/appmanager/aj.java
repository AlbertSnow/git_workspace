package com.wandoujia.appmanager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.wandoujia.base.utils.SystemUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class aj
  implements Runnable
{
  aj(ai paramai)
  {
  }

  public final void run()
  {
    ArrayList localArrayList2;
    Intent[] arrayOfIntent;
    synchronized (ai.a(this.a))
    {
      localArrayList2 = new ArrayList(ai.a(this.a));
      ai.a(this.a).clear();
      arrayOfIntent = new Intent[localArrayList2.size()];
    }
    synchronized (ai.a())
    {
      Iterator localIterator1 = localArrayList2.iterator();
      int i = 0;
      while (localIterator1.hasNext())
      {
        ao localao4 = (ao)localIterator1.next();
        Uri localUri = ai.a(localao4.a);
        Intent localIntent2 = new Intent("android.intent.action.VIEW");
        localIntent2.setFlags(268435456);
        localIntent2.setDataAndType(localUri, "application/vnd.android.package-archive");
        int m = i + 1;
        arrayOfIntent[i] = localIntent2;
        ai.a().add(localao4.d);
        i = m;
        continue;
        localObject1 = finally;
        monitorexit;
        throw localObject1;
      }
    }
    try
    {
      if (SystemUtil.aboveApiLevel(11))
        ai.b(this.a).startActivities(arrayOfIntent);
      while (true)
      {
        Iterator localIterator4 = localArrayList2.iterator();
        while (localIterator4.hasNext())
        {
          ao localao3 = (ao)localIterator4.next();
          if (localao3.c == null)
            continue;
          localao3.c.b(localao3.b);
        }
        localObject2 = finally;
        monitorexit;
        throw localObject2;
        int j = arrayOfIntent.length;
        for (int k = 0; k < j; k++)
        {
          Intent localIntent1 = arrayOfIntent[k];
          ai.b(this.a).startActivity(localIntent1);
        }
      }
    }
    catch (Exception localException)
    {
    }
    finally
    {
      Iterator localIterator3;
      ao localao2;
      Iterator localIterator2 = localArrayList2.iterator();
      while (localIterator2.hasNext())
      {
        ao localao1 = (ao)localIterator2.next();
        if (localao1.c == null)
          continue;
        localao1.c.b(localao1.b);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.aj
 * JD-Core Version:    0.6.0
 */