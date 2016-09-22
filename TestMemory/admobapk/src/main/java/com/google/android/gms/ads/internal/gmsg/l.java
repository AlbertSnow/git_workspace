package com.google.android.gms.ads.internal.gmsg;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.a;
import com.google.android.gms.ads.internal.util.bg;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.b;
import ha;
import hb;
import java.util.Map;
import java.util.concurrent.Future;

final class l
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("u");
    if (str1 == null)
    {
      c.e("URL missing from click GMSG.");
      return;
    }
    Uri localUri1 = Uri.parse(str1);
    Uri localUri2;
    String str2;
    try
    {
      ha localha = paramb.n();
      if ((localha != null) && (localha.b(localUri1)))
      {
        Uri localUri3 = localha.a(localUri1, paramb.getContext());
        localUri2 = localUri3;
        String str4 = localUri2.toString();
        ((Future)new bg(paramb.getContext(), paramb.o().b, str4).d());
        return;
      }
    }
    catch (hb localhb)
    {
      str2 = String.valueOf(str1);
      if (str2.length() == 0);
    }
    for (String str3 = "Unable to append parameter to URL: ".concat(str2); ; str3 = new String("Unable to append parameter to URL: "))
    {
      c.e(str3);
      localUri2 = localUri1;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.l
 * JD-Core Version:    0.6.0
 */