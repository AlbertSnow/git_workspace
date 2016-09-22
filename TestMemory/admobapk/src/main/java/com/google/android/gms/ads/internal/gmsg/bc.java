package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.util.c;

final class bc
  implements d
{
  bc(bb parambb)
  {
  }

  public final void a(String paramString1, String paramString2)
  {
    bb localbb = this.a;
    String str1 = String.valueOf(paramString1);
    if (str1.length() != 0);
    for (String str2 = "ExoPlayer caching failed. Type: ".concat(str1); ; str2 = new String("ExoPlayer caching failed. Type: "))
    {
      localbb.e = str2;
      c.e(46 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + "ExoPlayer failed during precache: " + paramString1 + " Exception: " + paramString2);
      this.a.a();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.bc
 * JD-Core Version:    0.6.0
 */