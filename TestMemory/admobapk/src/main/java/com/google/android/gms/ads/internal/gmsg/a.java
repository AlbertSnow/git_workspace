package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.c;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
public final class a
  implements t
{
  private final b a;

  public a(b paramb)
  {
    this.a = paramb;
  }

  public final void a(com.google.android.gms.ads.internal.webview.b paramb, Map paramMap)
  {
    String str = (String)paramMap.get("name");
    if (str == null)
    {
      c.e("App event with no name parameter.");
      return;
    }
    this.a.a(str, (String)paramMap.get("info"));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.a
 * JD-Core Version:    0.6.0
 */