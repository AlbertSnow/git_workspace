package com.google.android.gms.ads.internal.mraid;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

@a
public final class f
{
  public final b a;
  public final boolean b;
  public final String c;

  public f(b paramb, Map paramMap)
  {
    this.a = paramb;
    this.c = ((String)paramMap.get("forceOrientation"));
    if (paramMap.containsKey("allowOrientationChange"))
    {
      this.b = Boolean.parseBoolean((String)paramMap.get("allowOrientationChange"));
      return;
    }
    this.b = true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.f
 * JD-Core Version:    0.6.0
 */