package com.google.android.gms.ads.internal.gmsg;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import ht;
import iv;

@a
@TargetApi(16)
public final class ba extends bb
{
  public ba(b paramb)
  {
    super(paramb);
  }

  protected final iv c(String paramString)
  {
    return new ht(this.a, Uri.parse(paramString), null, 2);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ba
 * JD-Core Version:    0.6.0
 */