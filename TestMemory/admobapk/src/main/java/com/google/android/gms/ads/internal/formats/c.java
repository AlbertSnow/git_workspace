package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import apj;
import apn;
import com.google.android.gms.ads.internal.formats.client.b;
import com.google.android.gms.ads.internal.report.client.a;

@a
public final class c extends b
{
  private final Drawable a;
  private final Uri b;
  private final double c;

  public c(Drawable paramDrawable, Uri paramUri, double paramDouble)
  {
    this.a = paramDrawable;
    this.b = paramUri;
    this.c = paramDouble;
  }

  public final apj a()
  {
    return apn.a(this.a);
  }

  public final Uri b()
  {
    return this.b;
  }

  public final double c()
  {
    return this.c;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.c
 * JD-Core Version:    0.6.0
 */