package com.google.android.gms.ads.internal.safebrowsing;

import awn;
import com.google.android.gms.ads.internal.util.future.g;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class c
  implements Runnable
{
  c(a parama, g paramg)
  {
  }

  public final void run()
  {
    try
    {
      Map localMap = (Map)this.a.get();
      locala = this.b;
      if (localMap != null)
      {
        Iterator localIterator = localMap.keySet().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            String str1 = (String)localIterator.next();
            localJSONArray = new JSONObject((String)localMap.get(str1)).optJSONArray("matches");
            if (localJSONArray == null)
              continue;
            synchronized (locala.c)
            {
              i = localJSONArray.length();
              localawn = locala.c(str1);
              if (localawn == null)
              {
                String str2 = String.valueOf(str1);
                if (str2.length() == 0)
                  break;
                str3 = "Cannot find the corresponding resource object for ".concat(str2);
                l.a(str3);
              }
            }
          }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      a locala;
      JSONArray localJSONArray;
      int i;
      awn localawn;
      while (true)
      {
        l.a("Failed to get SafeBrowsing metadata", localInterruptedException);
        return;
        String str3 = new String("Cannot find the corresponding resource object for ");
      }
      localawn.d = new String[i];
      for (int j = 0; j < i; j++)
        localawn.d[j] = localJSONArray.getJSONObject(j).getString("threat_type");
      boolean bool1 = locala.b;
      if (i > 0);
      for (boolean bool2 = true; ; bool2 = false)
      {
        locala.b = (bool2 | bool1);
        monitorexit;
        break;
      }
      this.b.b();
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      break label160;
    }
    catch (JSONException localJSONException)
    {
      label160: break label160;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.safebrowsing.c
 * JD-Core Version:    0.6.0
 */