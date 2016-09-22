package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.renderer.nativeads.e;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.c;

final class m extends e
{
  m(j paramj)
  {
  }

  public final void a(ak paramak)
  {
    paramak.a("/loadHtml", new n(this, paramak));
    paramak.a("/showOverlay", new p(this));
    paramak.a("/hideOverlay", new q(this));
    this.a.b.l().a("/hideOverlay", new r(this));
    this.a.b.l().a("/sendMessageToSdk", new s(this, paramak));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.m
 * JD-Core Version:    0.6.0
 */