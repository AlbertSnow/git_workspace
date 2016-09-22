package com.google.android.gms.ads.internal.overlay;

import android.media.MediaCodec.CryptoException;
import hy;
import id;
import jd;
import je;

final class b
  implements hy
{
  hy a = null;

  b(a parama)
  {
  }

  public final void a(MediaCodec.CryptoException paramCryptoException)
  {
    this.b.a("CryptoError", paramCryptoException.getMessage());
    if (this.a != null)
      this.a.a(paramCryptoException);
  }

  public final void a(id paramid)
  {
    this.b.a("DecoderInitializationError", paramid.getMessage());
    if (this.a != null)
      this.a.a(paramid);
  }

  public final void a(jd paramjd)
  {
    this.b.a("AudioTrackInitializationError", paramjd.getMessage());
    if (this.a != null)
      this.a.a(paramjd);
  }

  public final void a(je paramje)
  {
    this.b.a("AudioTrackWriteError", paramje.getMessage());
    if (this.a != null)
      this.a.a(paramje);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.b
 * JD-Core Version:    0.6.0
 */