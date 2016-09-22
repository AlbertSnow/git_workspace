package com.google.android.gms.ads.internal.safebrowsing;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import awg;
import awo;
import java.io.ByteArrayOutputStream;

final class b
  implements Runnable
{
  b(a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    this.a.compress(Bitmap.CompressFormat.PNG, 0, localByteArrayOutputStream);
    synchronized (this.b.c)
    {
      this.b.a.g = new awo();
      this.b.a.g.c = localByteArrayOutputStream.toByteArray();
      this.b.a.g.b = "image/png";
      this.b.a.g.a = Integer.valueOf(1);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.safebrowsing.b
 * JD-Core Version:    0.6.0
 */