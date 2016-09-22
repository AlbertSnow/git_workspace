package com.google.android.gms.ads.internal.gmsg;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;

@a
public final class s
  implements ay
{
  public final ar a(b paramb, int paramInt, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      if (paramInt == 1)
        return new ba(paramb);
      if (paramInt == 2)
        return new az(paramb, paramString);
    }
    return new bd(paramb);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.s
 * JD-Core Version:    0.6.0
 */