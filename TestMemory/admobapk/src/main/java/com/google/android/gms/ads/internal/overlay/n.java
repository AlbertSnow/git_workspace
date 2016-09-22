package com.google.android.gms.ads.internal.overlay;

import android.media.MediaCodec.CryptoException;
import com.google.android.gms.ads.internal.util.c;
import id;
import ip;

final class n
  implements ip
{
  n(f paramf)
  {
  }

  public final void a(int paramInt1, int paramInt2, float paramFloat)
  {
    this.a.d = paramInt1;
    this.a.e = paramInt2;
    this.a.f = paramFloat;
    this.a.a(this.a.d, this.a.e, this.a.f);
  }

  public final void a(int paramInt, long paramLong)
  {
    c.b(64 + "Dropped frames. Count: " + paramInt + " Elapsed: " + paramLong);
  }

  public final void a(MediaCodec.CryptoException paramCryptoException)
  {
    this.a.a("CryptoError", paramCryptoException.getMessage());
  }

  public final void a(id paramid)
  {
    this.a.a("DecoderInitializationError", paramid.getMessage());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.n
 * JD-Core Version:    0.6.0
 */