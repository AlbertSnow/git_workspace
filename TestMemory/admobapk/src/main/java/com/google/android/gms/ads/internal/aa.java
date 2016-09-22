package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.ab;
import com.google.android.gms.ads.internal.formats.client.ae;
import com.google.android.gms.ads.internal.mediation.client.b;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import dh;

@a
public final class aa extends ac
{
  private com.google.android.gms.ads.internal.client.v a;
  private com.google.android.gms.ads.internal.formats.client.v b;
  private com.google.android.gms.ads.internal.formats.client.y c;
  private dh d;
  private dh e;
  private NativeAdOptionsParcel f;
  private at g;
  private final Context h;
  private final b i;
  private final String j;
  private final VersionInfoParcel k;
  private final m l;

  public aa(Context paramContext, String paramString, b paramb, VersionInfoParcel paramVersionInfoParcel, m paramm)
  {
    this.h = paramContext;
    this.j = paramString;
    this.i = paramb;
    this.k = paramVersionInfoParcel;
    this.e = new dh();
    this.d = new dh();
    this.l = paramm;
  }

  public final com.google.android.gms.ads.internal.client.y a()
  {
    return new y(this.h, this.j, this.i, this.k, this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.l);
  }

  public final void a(at paramat)
  {
    this.g = paramat;
  }

  public final void a(com.google.android.gms.ads.internal.client.v paramv)
  {
    this.a = paramv;
  }

  public final void a(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    this.f = paramNativeAdOptionsParcel;
  }

  public final void a(com.google.android.gms.ads.internal.formats.client.v paramv)
  {
    this.b = paramv;
  }

  public final void a(com.google.android.gms.ads.internal.formats.client.y paramy)
  {
    this.c = paramy;
  }

  public final void a(String paramString, ae paramae, ab paramab)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    this.e.put(paramString, paramae);
    this.d.put(paramString, paramab);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.aa
 * JD-Core Version:    0.6.0
 */