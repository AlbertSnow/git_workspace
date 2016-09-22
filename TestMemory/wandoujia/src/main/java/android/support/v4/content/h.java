package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class h
{
  private static final Object f = new Object();
  private static h g;
  private final Context a;
  private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap();
  private final HashMap<String, ArrayList<k>> c = new HashMap();
  private final ArrayList<j> d = new ArrayList();
  private final Handler e;

  private h(Context paramContext)
  {
    this.a = paramContext;
    this.e = new i(this, paramContext.getMainLooper());
  }

  public static h a(Context paramContext)
  {
    synchronized (f)
    {
      if (g == null)
        g = new h(paramContext.getApplicationContext());
      h localh = g;
      return localh;
    }
  }

  public final boolean a(Intent paramIntent)
  {
    while (true)
    {
      synchronized (this.b)
      {
        String str1 = paramIntent.getAction();
        String str2 = paramIntent.resolveTypeIfNeeded(this.a.getContentResolver());
        Uri localUri = paramIntent.getData();
        String str3 = paramIntent.getScheme();
        Set localSet = paramIntent.getCategories();
        if ((0x8 & paramIntent.getFlags()) == 0)
          break label408;
        i = 1;
        if (i == 0)
          continue;
        new StringBuilder("Resolving type ").append(str2).append(" scheme ").append(str3).append(" of intent ").append(paramIntent);
        ArrayList localArrayList = (ArrayList)this.c.get(paramIntent.getAction());
        if (localArrayList == null)
          break label371;
        if (i == 0)
          break label389;
        new StringBuilder("Action list: ").append(localArrayList);
        break label389;
        if (j < localArrayList.size())
        {
          k localk = (k)localArrayList.get(j);
          if (i == 0)
            continue;
          new StringBuilder("Matching against filter ").append(localk.a);
          if (!localk.c)
            continue;
          if (i == 0)
            break label382;
          localObject3 = localObject2;
          break label398;
          int m = localk.a.match(str1, str2, str3, localUri, localSet, "LocalBroadcastManager");
          if (m < 0)
            break label382;
          if (i == 0)
            continue;
          new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString(m));
          if (localObject2 != null)
            break label375;
          localObject3 = new ArrayList();
          ((ArrayList)localObject3).add(localk);
          localk.c = true;
        }
      }
      if (localObject2 != null)
      {
        for (int k = 0; k < ((ArrayList)localObject2).size(); k++)
          ((k)((ArrayList)localObject2).get(k)).c = false;
        this.d.add(new j(paramIntent, (ArrayList)localObject2));
        if (!this.e.hasMessages(1))
          this.e.sendEmptyMessage(1);
        monitorexit;
        return true;
      }
      label371: monitorexit;
      return false;
      label375: Object localObject3 = localObject2;
      continue;
      label382: localObject3 = localObject2;
      break label398;
      label389: Object localObject2 = null;
      int j = 0;
      continue;
      label398: j++;
      localObject2 = localObject3;
      continue;
      label408: int i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.h
 * JD-Core Version:    0.6.0
 */