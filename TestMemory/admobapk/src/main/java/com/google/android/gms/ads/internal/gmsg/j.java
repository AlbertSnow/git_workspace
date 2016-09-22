package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.HashMap;
import java.util.Map;

final class j
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("urls");
    if (TextUtils.isEmpty(str1))
    {
      c.e("URLs missing in canOpenURLs GMSG.");
      return;
    }
    String[] arrayOfString1 = str1.split(",");
    HashMap localHashMap = new HashMap();
    PackageManager localPackageManager = paramb.getContext().getPackageManager();
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String str2 = arrayOfString1[j];
      String[] arrayOfString2 = str2.split(";", 2);
      String str3 = arrayOfString2[0].trim();
      String str4;
      if (arrayOfString2.length > 1)
      {
        str4 = arrayOfString2[1].trim();
        label110: if (localPackageManager.resolveActivity(new Intent(str4, Uri.parse(str3)), 65536) == null)
          break label163;
      }
      label163: for (boolean bool = true; ; bool = false)
      {
        localHashMap.put(str2, Boolean.valueOf(bool));
        j++;
        break;
        str4 = "android.intent.action.VIEW";
        break label110;
      }
    }
    paramb.a("openableURLs", localHashMap);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.j
 * JD-Core Version:    0.6.0
 */