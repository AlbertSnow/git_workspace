package com.google.android.gms.ads.internal.appcontent;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;

final class l
{
  private ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
  private Base64OutputStream b = new Base64OutputStream(this.a, 10);

  public final void a(byte[] paramArrayOfByte)
  {
    this.b.write(paramArrayOfByte);
  }

  // ERROR //
  public final java.lang.String toString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	com/google/android/gms/ads/internal/appcontent/l:b	Landroid/util/Base64OutputStream;
    //   4: invokevirtual 37	android/util/Base64OutputStream:close	()V
    //   7: aload_0
    //   8: getfield 19	com/google/android/gms/ads/internal/appcontent/l:a	Ljava/io/ByteArrayOutputStream;
    //   11: invokevirtual 38	java/io/ByteArrayOutputStream:close	()V
    //   14: aload_0
    //   15: getfield 19	com/google/android/gms/ads/internal/appcontent/l:a	Ljava/io/ByteArrayOutputStream;
    //   18: invokevirtual 40	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   21: astore 4
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 19	com/google/android/gms/ads/internal/appcontent/l:a	Ljava/io/ByteArrayOutputStream;
    //   28: aload_0
    //   29: aconst_null
    //   30: putfield 26	com/google/android/gms/ads/internal/appcontent/l:b	Landroid/util/Base64OutputStream;
    //   33: aload 4
    //   35: areturn
    //   36: astore_1
    //   37: ldc 42
    //   39: aload_1
    //   40: invokestatic 47	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   43: goto -36 -> 7
    //   46: astore_3
    //   47: ldc 42
    //   49: aload_3
    //   50: invokestatic 47	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   53: aload_0
    //   54: aconst_null
    //   55: putfield 19	com/google/android/gms/ads/internal/appcontent/l:a	Ljava/io/ByteArrayOutputStream;
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 26	com/google/android/gms/ads/internal/appcontent/l:b	Landroid/util/Base64OutputStream;
    //   63: ldc 49
    //   65: areturn
    //   66: astore_2
    //   67: aload_0
    //   68: aconst_null
    //   69: putfield 19	com/google/android/gms/ads/internal/appcontent/l:a	Ljava/io/ByteArrayOutputStream;
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield 26	com/google/android/gms/ads/internal/appcontent/l:b	Landroid/util/Base64OutputStream;
    //   77: aload_2
    //   78: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	7	36	java/io/IOException
    //   7	23	46	java/io/IOException
    //   7	23	66	finally
    //   47	53	66	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.l
 * JD-Core Version:    0.6.0
 */