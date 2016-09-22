package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.webview.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class aw
  implements Runnable
{
  aw(ar paramar, String paramString1, String paramString2, String paramString3, String paramString4)
  {
  }

  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheCanceled");
    localHashMap.put("src", this.a);
    if (!TextUtils.isEmpty(this.b))
      localHashMap.put("cachedSrc", this.b);
    String str1 = this.c;
    String str2 = "internal";
    int i = -1;
    switch (str1.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
    case 96784904:
    case -642208130:
    case -1347010958:
    case -659376217:
    case 725497484:
    case 580119100:
    case -1396664534:
    case -918817863:
    case -354048396:
    case -32082395:
    }
    while (true)
    {
      localHashMap.put("type", str2);
      localHashMap.put("reason", this.c);
      if (!TextUtils.isEmpty(this.d))
        localHashMap.put("message", this.d);
      b localb = (b)this.e.c.get();
      if (localb != null)
        localb.a("onPrecacheEvent", localHashMap);
      return;
      if (!str1.equals("error"))
        break;
      i = 0;
      break;
      if (!str1.equals("playerFailed"))
        break;
      i = 1;
      break;
      if (!str1.equals("inProgress"))
        break;
      i = 2;
      break;
      if (!str1.equals("contentLengthMissing"))
        break;
      i = 3;
      break;
      if (!str1.equals("noCacheDir"))
        break;
      i = 4;
      break;
      if (!str1.equals("expireFailed"))
        break;
      i = 5;
      break;
      if (!str1.equals("badUrl"))
        break;
      i = 6;
      break;
      if (!str1.equals("downloadTimeout"))
        break;
      i = 7;
      break;
      if (!str1.equals("sizeExceeded"))
        break;
      i = 8;
      break;
      if (!str1.equals("externalAbort"))
        break;
      i = 9;
      break;
      str2 = "internal";
      continue;
      str2 = "io";
      continue;
      str2 = "network";
      continue;
      str2 = "policy";
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.aw
 * JD-Core Version:    0.6.0
 */