package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class ai
  implements t
{
  private final Object a = new Object();
  private final Map b = new HashMap();

  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("id");
    String str2 = (String)paramMap.get("fail");
    paramMap.get("fail_reason");
    String str3 = (String)paramMap.get("result");
    synchronized (this.a)
    {
      if ((aj)this.b.remove(str1) == null)
      {
        String str4 = String.valueOf(str1);
        if (str4.length() != 0)
        {
          str5 = "Received result for unexpected method invocation: ".concat(str4);
          c.e(str5);
          return;
        }
        String str5 = new String("Received result for unexpected method invocation: ");
      }
    }
    if (!TextUtils.isEmpty(str2))
    {
      monitorexit;
      return;
    }
    if (str3 == null)
    {
      monitorexit;
      return;
    }
    try
    {
      new JSONObject(str3);
      monitorexit;
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localJSONException.getMessage();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ai
 * JD-Core Version:    0.6.0
 */