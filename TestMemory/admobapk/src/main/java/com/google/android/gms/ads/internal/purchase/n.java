package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;

@a
public final class n
{
  private final String a;

  public n(String paramString)
  {
    this.a = paramString;
  }

  public final boolean a(String paramString, Intent paramIntent)
  {
    if ((paramString == null) || (paramIntent == null));
    String str1;
    String str2;
    while (true)
    {
      return false;
      str1 = k.b(paramIntent);
      if (paramIntent == null);
      for (str2 = null; (str1 != null) && (str2 != null); str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE"))
      {
        if (paramString.equals(k.a(str1)))
          break label84;
        c.e("Developer payload not match.");
        return false;
      }
    }
    label84: if (this.a != null)
    {
      String str3 = this.a;
      if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str3)) || (TextUtils.isEmpty(str2)))
        c.c("Purchase verification failed: missing data.");
      for (boolean bool = false; !bool; bool = o.a(o.a(str3), str1, str2))
      {
        c.e("Fail to verify signature.");
        return false;
      }
    }
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.n
 * JD-Core Version:    0.6.0
 */