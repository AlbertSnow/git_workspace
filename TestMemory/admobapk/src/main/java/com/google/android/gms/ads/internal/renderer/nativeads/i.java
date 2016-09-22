package com.google.android.gms.ads.internal.renderer.nativeads;

import anw;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.bd;
import com.google.android.gms.ads.internal.formats.client.ae;
import com.google.android.gms.ads.internal.util.future.a;
import dh;

final class i
  implements Runnable
{
  i(f paramf, a parama, String paramString)
  {
  }

  public final void run()
  {
    a locala = this.a;
    an localan = this.c.a;
    anw.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    locala.b((ae)localan.d.v.get(this.b));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.i
 * JD-Core Version:    0.6.0
 */