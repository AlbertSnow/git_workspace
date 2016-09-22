package com.google.android.gms.ads.internal.gmsg;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import iv;
import jm;
import jp;
import kd;
import kn;
import ky;

@a
@TargetApi(16)
public final class az extends bb
{
  private final String g;

  public az(b paramb, String paramString)
  {
    super(paramb);
    this.g = paramString;
  }

  protected final iv c(String paramString)
  {
    ky localky = new ky(this.a, this.b);
    if ("video/webm".equals(this.g));
    for (Object localObject = new kn(); ; localObject = new kd())
      return new jp(Uri.parse(paramString), localky, (jm)localObject, 2, ((Integer)m.i.a()).intValue());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.az
 * JD-Core Version:    0.6.0
 */