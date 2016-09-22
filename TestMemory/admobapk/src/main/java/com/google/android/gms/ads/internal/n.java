package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.state.b;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import java.util.Iterator;
import java.util.List;

@a
public final class n
{
  boolean a;
  private final Context b;
  private final AutoClickProtectionConfigurationParcel c;

  public n(Context paramContext)
  {
    this(paramContext, false);
  }

  public n(Context paramContext, b paramb)
  {
    this.b = paramContext;
    if ((paramb != null) && (paramb.b.G != null))
    {
      this.c = paramb.b.G;
      return;
    }
    this.c = new AutoClickProtectionConfigurationParcel();
  }

  public n(Context paramContext, boolean paramBoolean)
  {
    this.b = paramContext;
    this.c = new AutoClickProtectionConfigurationParcel(false);
  }

  public final void a(String paramString)
  {
    if (paramString != null);
    while (true)
    {
      c.d("Action was blocked because no touch was detected.");
      if ((!this.c.b) || (this.c.c == null))
        break;
      Iterator localIterator = this.c.c.iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if (TextUtils.isEmpty(str1))
          continue;
        String str2 = str1.replace("{NAVIGATION_URL}", Uri.encode(paramString));
        bc.a().e.a(this.b, "", str2);
      }
      paramString = "";
    }
  }

  public final boolean a()
  {
    return (!this.c.b) || (this.a);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.n
 * JD-Core Version:    0.6.0
 */