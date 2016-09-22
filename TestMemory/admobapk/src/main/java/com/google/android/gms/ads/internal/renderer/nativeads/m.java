package com.google.android.gms.ads.internal.renderer.nativeads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import aop;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.util.az;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

final class m
  implements az
{
  m(f paramf, boolean paramBoolean, double paramDouble, String paramString)
  {
  }

  private c b()
  {
    this.d.a(2, this.a);
    return null;
  }

  private c b(InputStream paramInputStream)
  {
    Bitmap localBitmap;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      aop.a(paramInputStream, localByteArrayOutputStream, true, 1024);
      byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
      arrayOfByte1 = arrayOfByte2;
      if (arrayOfByte1 == null)
      {
        this.d.a(2, this.a);
        return null;
      }
    }
    catch (IOException localIOException)
    {
      byte[] arrayOfByte1;
      while (true)
        arrayOfByte1 = null;
      localBitmap = BitmapFactory.decodeByteArray(arrayOfByte1, 0, arrayOfByte1.length);
      if (localBitmap == null)
      {
        this.d.a(2, this.a);
        return null;
      }
      localBitmap.setDensity((int)(160.0D * this.b));
    }
    return new c(new BitmapDrawable(Resources.getSystem(), localBitmap), Uri.parse(this.c), this.b);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.m
 * JD-Core Version:    0.6.0
 */