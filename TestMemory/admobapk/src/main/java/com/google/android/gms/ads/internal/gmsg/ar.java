package com.google.android.gms.ads.internal.gmsg;

import aiu;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.lang.ref.WeakReference;

@com.google.android.gms.ads.internal.report.client.a
public abstract class ar
  implements aiu
{
  public Context a;
  public String b;
  public WeakReference c;

  public ar(b paramb)
  {
    this.a = paramb.getContext();
    this.b = bc.a().e.a(this.a, paramb.o().b);
    this.c = new WeakReference(paramb);
  }

  public abstract void a();

  protected final void a(String paramString1, String paramString2, int paramInt)
  {
    com.google.android.gms.ads.internal.util.client.a.a.post(new au(this, paramString1, paramString2, paramInt));
  }

  protected final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    com.google.android.gms.ads.internal.util.client.a.a.post(new aw(this, paramString1, paramString2, paramString3, paramString4));
  }

  public abstract boolean a(String paramString);

  protected String b(String paramString)
  {
    return com.google.android.gms.ads.internal.util.client.a.a(paramString);
  }

  public void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ar
 * JD-Core Version:    0.6.0
 */