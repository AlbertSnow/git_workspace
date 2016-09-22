package com.google.android.gms.ads.internal.csi;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.request.service.r;
import com.google.android.gms.ads.internal.request.service.t;
import com.google.android.gms.ads.internal.util.y;
import java.util.LinkedHashMap;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  public boolean a;
  public String b;
  public Map c;
  public Context d = null;
  public String e = null;

  public a(Context paramContext, String paramString)
  {
    this.d = paramContext;
    this.e = paramString;
    this.a = ((Boolean)m.v.a()).booleanValue();
    this.b = ((String)m.w.a());
    this.c = new LinkedHashMap();
    this.c.put("s", "gmob_sdk");
    this.c.put("v", "3");
    this.c.put("os", Build.VERSION.RELEASE);
    this.c.put("sdk", Build.VERSION.SDK);
    Map localMap1 = this.c;
    localMap1.put("device", y.c());
    Map localMap2 = this.c;
    String str1;
    Map localMap3;
    if (paramContext.getApplicationContext() != null)
    {
      str1 = paramContext.getApplicationContext().getPackageName();
      localMap2.put("app", str1);
      localMap3 = this.c;
      if (!y.i(paramContext))
        break label283;
    }
    label283: for (String str2 = "1"; ; str2 = "0")
    {
      localMap3.put("is_lite_sdk", str2);
      r localr = bc.a().k.a(this.d);
      this.c.put("network_coarse", Integer.toString(localr.m));
      this.c.put("network_fine", Integer.toString(localr.n));
      return;
      str1 = paramContext.getPackageName();
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.csi.a
 * JD-Core Version:    0.6.0
 */