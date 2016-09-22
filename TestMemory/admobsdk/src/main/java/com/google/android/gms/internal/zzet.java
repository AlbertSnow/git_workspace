package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzet
{
  public List<String> zza(JSONObject paramJSONObject, String paramString)
    throws JSONException
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

  public void zza(Context paramContext, String paramString1, zzif paramzzif, String paramString2, boolean paramBoolean, List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
      return;
    String str1 = paramBoolean ? "1" : "0";
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      str2 = str2.replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str1).replaceAll("@gw_qdata@", paramzzif.zzKV.zzBT).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", zzr.zzbF().getSessionId()).replaceAll("@gw_seqnum@", paramzzif.zzHw);
      if (paramzzif.zzCp != null)
        str2 = str2.replaceAll("@gw_adnetid@", paramzzif.zzCp.zzBA).replaceAll("@gw_allocid@", paramzzif.zzCp.zzBC);
      zziy localzziy = new zziy(paramContext, paramString1, str2);
      localzziy.zzhn();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzet
 * JD-Core Version:    0.6.0
 */