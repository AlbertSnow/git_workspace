package com.google.android.gms.ads.internal.formats;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class n
  implements t
{
  n(m paramm, ak paramak)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    this.b.a.b.l().e = new o(this, paramMap);
    String str1 = (String)paramMap.get("overlayHtml");
    String str2 = (String)paramMap.get("baseUrl");
    if (TextUtils.isEmpty(str2))
    {
      this.b.a.b.loadData(str1, "text/html", "UTF-8");
      return;
    }
    this.b.a.b.loadDataWithBaseURL(str2, str1, "text/html", "UTF-8", null);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.n
 * JD-Core Version:    0.6.0
 */