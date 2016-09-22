package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

@a
public final class ac
  implements t
{
  private final ad a;

  public ac(ad paramad)
  {
    this.a = paramad;
  }

  public final void a(b paramb, Map paramMap)
  {
    boolean bool1 = "1".equals(paramMap.get("transparentBackground"));
    boolean bool2 = "1".equals(paramMap.get("blur"));
    try
    {
      if (paramMap.get("blurRadius") != null)
      {
        float f2 = Float.parseFloat((String)paramMap.get("blurRadius"));
        f1 = f2;
        this.a.b(bool1);
        this.a.a(bool2, f1);
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        c.b("Fail to parse float", localNumberFormatException);
        float f1 = 0.0F;
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ac
 * JD-Core Version:    0.6.0
 */