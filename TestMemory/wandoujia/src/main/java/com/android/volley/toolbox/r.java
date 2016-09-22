package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Request.Priority;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.n;
import com.wandoujia.nirvana.framework.network.a.a;

public final class r extends Request<Bitmap>
{
  private static final Object e = new Object();
  private final k<Bitmap> a;
  private final Bitmap.Config b;
  private final int c;
  private final int d;

  public r(String paramString, k<Bitmap> paramk, int paramInt1, int paramInt2, Bitmap.Config paramConfig, j paramj)
  {
    super(0, paramString, paramj);
    a(new m(1000, 2, 2.0F));
    this.a = paramk;
    this.b = paramConfig;
    this.c = paramInt1;
    this.d = paramInt2;
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
      paramInt1 = paramInt3;
    double d1;
    do
    {
      do
      {
        return paramInt1;
        if (paramInt1 == 0)
          return (int)(paramInt2 / paramInt4 * paramInt3);
      }
      while (paramInt2 == 0);
      d1 = paramInt4 / paramInt3;
    }
    while (d1 * paramInt1 <= paramInt2);
    return (int)(paramInt2 / d1);
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d1 = Math.min(paramInt1 / paramInt3, paramInt2 / paramInt4);
    float f = 1.0F;
    while (f * 2.0F <= d1)
      f *= 2.0F;
    return (int)f;
  }

  protected final com.wandoujia.p4.app.detail.model.b<Bitmap> a(a parama)
  {
    while (true)
    {
      Bitmap localBitmap;
      synchronized (e)
      {
        try
        {
          byte[] arrayOfByte = parama.a;
          BitmapFactory.Options localOptions = new BitmapFactory.Options();
          localOptions.inPreferredConfig = this.b;
          if ((this.c != 0) || (this.d != 0))
            continue;
          localObject3 = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions);
          if (localObject3 != null)
            break label313;
          com.wandoujia.p4.app.detail.model.b localb2 = com.wandoujia.p4.app.detail.model.b.a(new ParseError());
          localObject4 = localb2;
          return localObject4;
          localOptions.inJustDecodeBounds = true;
          BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions);
          int i = localOptions.outWidth;
          int j = localOptions.outHeight;
          int k = a(this.c, this.d, i, j);
          int m = a(this.d, this.c, j, i);
          localOptions.inJustDecodeBounds = false;
          localOptions.inSampleSize = b(i, j, k, m);
          localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions);
          if ((Build.VERSION.SDK_INT < 11) && (localBitmap != null) && (k > 0) && (m > 0) && ((localBitmap.getWidth() > k) || (localBitmap.getHeight() > m)))
          {
            localObject3 = Bitmap.createScaledBitmap(localBitmap, k, m, true);
            localBitmap.recycle();
            continue;
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(parama.a.length);
          arrayOfObject[1] = c();
          n.c("Caught OOM for %d byte image, url=%s", arrayOfObject);
          com.wandoujia.p4.app.detail.model.b localb1 = com.wandoujia.p4.app.detail.model.b.a(new ParseError(localOutOfMemoryError));
          return localb1;
        }
      }
      Object localObject3 = localBitmap;
      continue;
      label313: com.wandoujia.p4.app.detail.model.b localb3 = com.wandoujia.p4.app.detail.model.b.a(localObject3, android.support.v4.app.b.a(parama));
      Object localObject4 = localb3;
    }
  }

  public final Request.Priority o()
  {
    return Request.Priority.LOW;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.r
 * JD-Core Version:    0.6.0
 */