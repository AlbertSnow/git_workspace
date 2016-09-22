package com.google.android.gms.ads.internal.mediation;

import android.content.Context;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class k
{
  public static List a(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray != null)
    {
      ArrayList localArrayList = new ArrayList(localJSONArray.length());
      for (int i = 0; i < localJSONArray.length(); i++)
        localArrayList.add(localJSONArray.getString(i));
      return Collections.unmodifiableList(localArrayList);
    }
    return null;
  }

  public static void a(Context paramContext, String paramString1, com.google.android.gms.ads.internal.state.a parama, String paramString2, boolean paramBoolean, List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
      return;
    if (paramBoolean);
    for (String str1 = "1"; ; str1 = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str1).replaceAll("@gw_qdata@", parama.q.h).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", bc.a().h.b).replaceAll("@gw_seqnum@", parama.i).replaceAll("@gw_adnetstatus@", parama.s);
        if (parama.n != null)
          str2 = str2.replaceAll("@gw_adnetid@", parama.n.b).replaceAll("@gw_allocid@", parama.n.d);
        ((Future)new bg(paramContext, paramString1, str2).d());
      }
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.k
 * JD-Core Version:    0.6.0
 */