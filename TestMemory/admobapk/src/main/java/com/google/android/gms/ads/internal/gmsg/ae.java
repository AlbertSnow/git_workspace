package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class ae
  implements t
{
  public final HashMap a = new HashMap();

  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = (String)paramMap.get("fetched_ad");
    c.b("Received ad from the cache.");
    com.google.android.gms.ads.internal.util.future.a locala = (com.google.android.gms.ads.internal.util.future.a)this.a.get(str1);
    if (locala == null)
    {
      c.c("Could not find the ad request for the corresponding ad response.");
      return;
    }
    try
    {
      locala.b(new JSONObject(str2));
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Failed constructing JSON object from value passed from javascript", localJSONException);
      locala.b(null);
      return;
    }
    finally
    {
      this.a.remove(str1);
    }
    throw localObject;
  }

  public final void a(String paramString)
  {
    com.google.android.gms.ads.internal.util.future.a locala = (com.google.android.gms.ads.internal.util.future.a)this.a.get(paramString);
    if (locala == null)
    {
      c.c("Could not find the ad request for the corresponding ad response.");
      return;
    }
    if (!locala.isDone())
      locala.cancel(true);
    this.a.remove(paramString);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ae
 * JD-Core Version:    0.6.0
 */