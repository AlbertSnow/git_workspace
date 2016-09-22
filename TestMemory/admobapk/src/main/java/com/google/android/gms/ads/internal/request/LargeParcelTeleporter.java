package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@a
public final class LargeParcelTeleporter extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new ad();
  final int a;
  ParcelFileDescriptor b;
  private Parcelable c;
  private boolean d;

  LargeParcelTeleporter(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramInt;
    this.b = paramParcelFileDescriptor;
    this.c = null;
    this.d = true;
  }

  public LargeParcelTeleporter(SafeParcelable paramSafeParcelable)
  {
    this.a = 1;
    this.b = null;
    this.c = paramSafeParcelable;
    this.d = false;
  }

  // ERROR //
  private ParcelFileDescriptor a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 44	android/os/ParcelFileDescriptor:createPipe	()[Landroid/os/ParcelFileDescriptor;
    //   3: astore 4
    //   5: new 46	android/os/ParcelFileDescriptor$AutoCloseOutputStream
    //   8: dup
    //   9: aload 4
    //   11: iconst_1
    //   12: aaload
    //   13: invokespecial 49	android/os/ParcelFileDescriptor$AutoCloseOutputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   16: astore_3
    //   17: new 51	java/lang/Thread
    //   20: dup
    //   21: new 53	com/google/android/gms/ads/internal/request/ac
    //   24: dup
    //   25: aload_0
    //   26: aload_3
    //   27: aload_1
    //   28: invokespecial 56	com/google/android/gms/ads/internal/request/ac:<init>	(Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/io/OutputStream;[B)V
    //   31: invokespecial 59	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   34: invokevirtual 62	java/lang/Thread:start	()V
    //   37: aload 4
    //   39: iconst_0
    //   40: aaload
    //   41: astore 5
    //   43: aload 5
    //   45: areturn
    //   46: astore_2
    //   47: aconst_null
    //   48: astore_3
    //   49: ldc 64
    //   51: aload_2
    //   52: invokestatic 69	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   55: invokestatic 74	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   58: getfield 78	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   61: aload_2
    //   62: iconst_1
    //   63: invokevirtual 83	com/google/android/gms/ads/internal/state/h:a	(Ljava/lang/Throwable;Z)V
    //   66: aload_3
    //   67: invokestatic 88	aop:a	(Ljava/io/Closeable;)V
    //   70: aconst_null
    //   71: areturn
    //   72: astore_2
    //   73: goto -24 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	46	java/io/IOException
    //   17	43	72	java/io/IOException
  }

  // ERROR //
  public final SafeParcelable a(Parcelable.Creator paramCreator)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:d	Z
    //   4: ifeq +105 -> 109
    //   7: aload_0
    //   8: getfield 30	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   11: ifnonnull +10 -> 21
    //   14: ldc 91
    //   16: invokestatic 94	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;)V
    //   19: aconst_null
    //   20: areturn
    //   21: new 96	java/io/DataInputStream
    //   24: dup
    //   25: new 98	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   28: dup
    //   29: aload_0
    //   30: getfield 30	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   33: invokespecial 99	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   36: invokespecial 102	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 106	java/io/DataInputStream:readInt	()I
    //   44: newarray byte
    //   46: astore 5
    //   48: aload_2
    //   49: aload 5
    //   51: iconst_0
    //   52: aload 5
    //   54: arraylength
    //   55: invokevirtual 110	java/io/DataInputStream:readFully	([BII)V
    //   58: aload_2
    //   59: invokestatic 88	aop:a	(Ljava/io/Closeable;)V
    //   62: invokestatic 116	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   65: astore 6
    //   67: aload 6
    //   69: aload 5
    //   71: iconst_0
    //   72: aload 5
    //   74: arraylength
    //   75: invokevirtual 119	android/os/Parcel:unmarshall	([BII)V
    //   78: aload 6
    //   80: iconst_0
    //   81: invokevirtual 123	android/os/Parcel:setDataPosition	(I)V
    //   84: aload_0
    //   85: aload_1
    //   86: aload 6
    //   88: invokeinterface 129 2 0
    //   93: checkcast 131	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   96: putfield 32	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:c	Landroid/os/Parcelable;
    //   99: aload 6
    //   101: invokevirtual 134	android/os/Parcel:recycle	()V
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield 34	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:d	Z
    //   109: aload_0
    //   110: getfield 32	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:c	Landroid/os/Parcelable;
    //   113: checkcast 131	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   116: areturn
    //   117: astore 4
    //   119: new 136	java/lang/IllegalStateException
    //   122: dup
    //   123: ldc 138
    //   125: aload 4
    //   127: invokespecial 140	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   130: athrow
    //   131: astore_3
    //   132: aload_2
    //   133: invokestatic 88	aop:a	(Ljava/io/Closeable;)V
    //   136: aload_3
    //   137: athrow
    //   138: astore 7
    //   140: aload 6
    //   142: invokevirtual 134	android/os/Parcel:recycle	()V
    //   145: aload 7
    //   147: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   40	58	117	java/io/IOException
    //   40	58	131	finally
    //   119	131	131	finally
    //   67	99	138	finally
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Parcel localParcel;
    if (this.b == null)
      localParcel = Parcel.obtain();
    try
    {
      this.c.writeToParcel(localParcel, 0);
      byte[] arrayOfByte = localParcel.marshall();
      localParcel.recycle();
      this.b = a(arrayOfByte);
      int i = aod.a(paramParcel, 20293);
      aod.a(paramParcel, 1, this.a);
      aod.a(paramParcel, 2, this.b, paramInt, false);
      aod.b(paramParcel, i);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.LargeParcelTeleporter
 * JD-Core Version:    0.6.0
 */