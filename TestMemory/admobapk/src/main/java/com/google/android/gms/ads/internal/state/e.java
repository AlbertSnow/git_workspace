package com.google.android.gms.ads.internal.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class e
{
  public final long a;
  public String b;
  public String c;
  public boolean d = false;
  private final List e = new ArrayList();
  private final Map f = new HashMap();

  public e(String paramString, long paramLong)
  {
    this.c = paramString;
    this.a = paramLong;
    a(paramString);
  }

  private final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return;
      JSONObject localJSONObject;
      try
      {
        localJSONObject = new JSONObject(paramString);
        if (localJSONObject.optInt("status", -1) != 1)
        {
          this.d = false;
          c.e("App settings could not be fetched successfully.");
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        c.c("Exception occurred while processing app setting json", localJSONException);
        bc.a().h.a(localJSONException, true);
        return;
      }
      this.d = true;
      this.b = localJSONObject.optString("app_id");
      JSONArray localJSONArray = localJSONObject.optJSONArray("ad_unit_id_settings");
      int i = 0;
      if (localJSONArray == null)
        continue;
      while (i < localJSONArray.length())
      {
        a(localJSONArray.getJSONObject(i));
        i++;
      }
    }
  }

  private final void a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("format");
    String str2 = paramJSONObject.optString("ad_unit_id");
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)));
    int i;
    label89: f localf;
    while (true)
    {
      return;
      if ("interstitial".equalsIgnoreCase(str1))
      {
        this.e.add(str2);
        return;
      }
      if (!"rewarded".equalsIgnoreCase(str1))
        continue;
      JSONObject localJSONObject1 = paramJSONObject.optJSONObject("mediation_config");
      if (localJSONObject1 == null)
        continue;
      JSONArray localJSONArray1 = localJSONObject1.optJSONArray("ad_networks");
      if (localJSONArray1 == null)
        continue;
      i = 0;
      if (i >= localJSONArray1.length())
        break;
      JSONObject localJSONObject2 = localJSONArray1.getJSONObject(i);
      JSONArray localJSONArray2 = localJSONObject2.optJSONArray("adapters");
      if (localJSONArray2 == null)
        continue;
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < localJSONArray2.length(); j++)
        localArrayList.add(localJSONArray2.getString(j));
      JSONObject localJSONObject3 = localJSONObject2.optJSONObject("data");
      if (localJSONObject3 == null)
        continue;
      Bundle localBundle = new Bundle();
      Iterator localIterator = localJSONObject3.keys();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        localBundle.putString(str3, localJSONObject3.getString(str3));
      }
      localf = new f(this, localArrayList, localBundle);
      if (!this.f.containsKey(str2))
        break label308;
    }
    label308: for (g localg = (g)this.f.get(str2); ; localg = new g(this))
    {
      localg.a.add(localf);
      this.f.put(str2, localg);
      i++;
      break label89;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.e
 * JD-Core Version:    0.6.0
 */