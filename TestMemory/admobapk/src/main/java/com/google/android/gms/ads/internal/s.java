package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class s
  implements t
{
  s(r paramr)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    paramb.b("/appSettingsFetched", this);
    Object localObject1 = this.a.a;
    monitorenter;
    if (paramMap != null);
    try
    {
      if ("true".equalsIgnoreCase((String)paramMap.get("isSuccessful")))
      {
        String str = (String)paramMap.get("appSettingsJson");
        bc.a().h.a(this.a.b, str);
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.s
 * JD-Core Version:    0.6.0
 */