package com.google.android.gms.ads.internal;

import android.os.IBinder;
import com.google.android.gms.ads.internal.formats.client.a;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.f;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ag
  implements f
{
  ag(d paramd, String paramString, com.google.android.gms.ads.internal.webview.b paramb)
  {
  }

  public final void a(com.google.android.gms.ads.internal.webview.b paramb, boolean paramBoolean)
  {
    JSONObject localJSONObject1;
    JSONArray localJSONArray;
    while (true)
    {
      try
      {
        localJSONObject1 = new JSONObject();
        localJSONObject1.put("headline", this.a.a());
        localJSONObject1.put("body", this.a.c());
        localJSONObject1.put("call_to_action", this.a.e());
        localJSONObject1.put("price", this.a.h());
        localJSONObject1.put("star_rating", String.valueOf(this.a.f()));
        localJSONObject1.put("store", this.a.g());
        localJSONObject1.put("icon", af.a(this.a.d()));
        localJSONArray = new JSONArray();
        List localList = this.a.b();
        if (localList == null)
          break;
        Iterator localIterator = localList.iterator();
        if (!localIterator.hasNext())
          break;
        Object localObject = localIterator.next();
        if ((localObject instanceof IBinder))
        {
          locala = com.google.android.gms.ads.internal.formats.client.b.a((IBinder)localObject);
          localJSONArray.put(af.a(locala));
          continue;
        }
      }
      catch (JSONException localJSONException)
      {
        c.c("Exception occurred when loading assets", localJSONException);
        return;
      }
      a locala = null;
    }
    localJSONObject1.put("images", localJSONArray);
    localJSONObject1.put("extras", af.a(this.a.m(), this.b));
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("assets", localJSONObject1);
    localJSONObject2.put("template_id", "2");
    this.c.a("google.afma.nativeExpressAds.loadAssets", localJSONObject2);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ag
 * JD-Core Version:    0.6.0
 */