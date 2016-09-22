package com.google.android.gms.ads.internal.overlay;

import android.media.MediaCodec.CryptoException;
import id;
import ip;

final class e
  implements ip
{
  ip a = null;

  e(a parama)
  {
  }

  public final void a(int paramInt1, int paramInt2, float paramFloat)
  {
    if (this.a != null)
      this.a.a(paramInt1, paramInt2, paramFloat);
  }

  public final void a(int paramInt, long paramLong)
  {
    if (this.a != null)
      this.a.a(paramInt, paramLong);
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
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.e
 * JD-Core Version:    0.6.0
 */