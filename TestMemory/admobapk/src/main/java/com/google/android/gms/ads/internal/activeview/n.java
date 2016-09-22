package com.google.android.gms.ads.internal.activeview;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class n extends a
{
  private final ak g;

  public n(Context paramContext, AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.state.a parama, VersionInfoParcel paramVersionInfoParcel, v paramv, ak paramak)
  {
    super(paramContext, paramAdSizeParcel, parama, paramVersionInfoParcel, paramv);
    this.g = paramak;
    a(this.g);
    a();
    a(3);
    String str1 = String.valueOf(this.b.c);
    if (str1.length() != 0);
    for (String str2 = "Tracking ad unit: ".concat(str1); ; str2 = new String("Tracking ad unit: "))
    {
      c.b(str2);
      return;
    }
  }

  protected final void b()
  {
    synchronized (this.a)
    {
      super.b();
      b(this.g);
      return;
    }
  }

  protected final void b(JSONObject paramJSONObject)
  {
    this.g.a("AFMA_updateActiveView", paramJSONObject);
  }

  public final void c()
  {
    b();
  }

  protected final boolean e()
  {
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.n
 * JD-Core Version:    0.6.0
 */