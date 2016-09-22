package com.google.android.gms.ads.internal.overlay;

import android.media.MediaCodec.CryptoException;
import hy;
import id;
import jd;
import je;

final class o
  implements hy
{
  o(f paramf)
  {
  }

  public final void a(MediaCodec.CryptoException paramCryptoException)
  {
    this.a.a("CryptoError", paramCryptoException.getMessage());
  }

  public final void a(id paramid)
  {
    this.a.a("DecoderInitializationError", paramid.getMessage());
  }

  public final void a(jd paramjd)
  {
    this.a.a("AudioTrackInitializationError", paramjd.getMessage());
  }

  public final void a(je paramje)
  {
    this.a.a("AudioTrackWriteError", paramje.getMessage());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.o
 * JD-Core Version:    0.6.0
 */