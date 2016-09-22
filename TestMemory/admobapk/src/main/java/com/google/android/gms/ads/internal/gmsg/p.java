package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.a;
import com.google.android.gms.ads.internal.util.bg;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import java.util.concurrent.Future;

final class p
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str = (String)paramMap.get("u");
    if (str == null)
    {
      c.e("URL missing from httpTrack GMSG.");
      return;
    }
    ((Future)new bg(paramb.getContext(), paramb.o().b, str).d());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.p
 * JD-Core Version:    0.6.0
 */