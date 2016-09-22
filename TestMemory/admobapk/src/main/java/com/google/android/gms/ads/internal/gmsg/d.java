package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.k;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

@a
public final class d
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    String str5;
    String str6;
    String str7;
    if ("tick".equals(str1))
    {
      str5 = (String)paramMap.get("label");
      str6 = (String)paramMap.get("start_label");
      str7 = (String)paramMap.get("timestamp");
      if (TextUtils.isEmpty(str5))
        c.e("No label given for CSI tick.");
    }
    label256: 
    do
    {
      return;
      if (TextUtils.isEmpty(str7))
      {
        c.e("No timestamp given for CSI tick.");
        return;
      }
      while (true)
      {
        long l4;
        l locall3;
        j localj;
        String[] arrayOfString;
        l locall4;
        try
        {
          long l1 = Long.parseLong(str7);
          long l2 = bc.a().i.a();
          long l3 = bc.a().i.b();
          l4 = l3 + (l1 - l2);
          if (!TextUtils.isEmpty(str6))
            continue;
          str6 = "native:view_load";
          k localk = paramb.y();
          locall3 = localk.b;
          localj = (j)localk.a.get(str6);
          arrayOfString = new String[] { str5 };
          if ((locall3 == null) || (localj == null))
          {
            Map localMap = localk.a;
            locall4 = localk.b;
            if (locall4 != null)
              break label256;
            localObject = null;
            localMap.put(str5, localObject);
            return;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          c.c("Malformed timestamp for CSI tick.", localNumberFormatException);
          return;
        }
        locall3.a(localj, l4, arrayOfString);
        continue;
        Object localObject = locall4.a(l4);
      }
      if (!"experiment".equals(str1))
        continue;
      String str4 = (String)paramMap.get("value");
      if (TextUtils.isEmpty(str4))
      {
        c.e("No value given for CSI experiment.");
        return;
      }
      l locall2 = paramb.y().b;
      if (locall2 == null)
      {
        c.e("No ticker for WebView, dropping experiment ID.");
        return;
      }
      locall2.a("e", str4);
      return;
    }
    while (!"extra".equals(str1));
    String str2 = (String)paramMap.get("name");
    String str3 = (String)paramMap.get("value");
    if (TextUtils.isEmpty(str3))
    {
      c.e("No value given for CSI extra.");
      return;
    }
    if (TextUtils.isEmpty(str2))
    {
      c.e("No name given for CSI extra.");
      return;
    }
    l locall1 = paramb.y().b;
    if (locall1 == null)
    {
      c.e("No ticker for WebView, dropping extra parameter.");
      return;
    }
    locall1.a(str2, str3);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.d
 * JD-Core Version:    0.6.0
 */