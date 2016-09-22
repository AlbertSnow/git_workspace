package com.google.android.gms.ads.internal.activeview;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.js.aa;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class o extends a
{
  boolean g;
  private aa h;

  public o(Context paramContext, AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.state.a parama, VersionInfoParcel paramVersionInfoParcel, v paramv, n paramn)
  {
    super(paramContext, paramAdSizeParcel, parama, paramVersionInfoParcel, paramv);
    this.h = paramn.b(null);
    try
    {
      JSONObject localJSONObject = a(paramv.c().a());
      this.h.a(new p(this, localJSONObject), new q(this));
      label64: this.h.a(new r(this), new s(this));
      String str1 = String.valueOf(this.b.c);
      if (str1.length() != 0)
      {
        str2 = "Tracking ad unit: ".concat(str1);
        com.google.android.gms.ads.internal.util.c.b(str2);
        return;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        com.google.android.gms.ads.internal.util.c.b("Failure while processing active view data.", localRuntimeException);
        continue;
        String str2 = new String("Tracking ad unit: ");
      }
    }
    catch (JSONException localJSONException)
    {
      break label64;
    }
  }

  protected final void b()
  {
    synchronized (this.a)
    {
      super.b();
      this.h.a(new u(this), new com.google.android.gms.ads.internal.util.promise.c());
      this.h.a_();
      return;
    }
  }

  protected final void b(JSONObject paramJSONObject)
  {
    this.h.a(new t(this, paramJSONObject), new com.google.android.gms.ads.internal.util.promise.c());
  }

  protected final boolean e()
  {
    return this.g;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.o
 * JD-Core Version:    0.6.0
 */