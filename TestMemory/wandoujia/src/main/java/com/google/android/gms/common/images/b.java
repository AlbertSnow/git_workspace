package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

final class b
  implements Runnable
{
  private final Uri a;
  private final ParcelFileDescriptor b;

  public b(Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramUri;
    this.b = paramParcelFileDescriptor;
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 36	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   3: invokevirtual 40	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   6: invokestatic 45	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   9: if_acmpne +48 -> 57
    //   12: new 47	java/lang/StringBuilder
    //   15: dup
    //   16: ldc 49
    //   18: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: invokestatic 45	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   24: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   27: ldc 58
    //   29: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokestatic 36	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   35: invokevirtual 40	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   38: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: ldc 63
    //   43: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: new 65	java/lang/IllegalStateException
    //   50: dup
    //   51: ldc 67
    //   53: invokespecial 68	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   56: athrow
    //   57: iconst_0
    //   58: istore_1
    //   59: aload_0
    //   60: getfield 23	com/google/android/gms/common/images/b:b	Landroid/os/ParcelFileDescriptor;
    //   63: ifnull +113 -> 176
    //   66: aload_0
    //   67: getfield 23	com/google/android/gms/common/images/b:b	Landroid/os/ParcelFileDescriptor;
    //   70: invokevirtual 74	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   73: invokestatic 80	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    //   76: astore 10
    //   78: aload 10
    //   80: astore_2
    //   81: aload_0
    //   82: getfield 23	com/google/android/gms/common/images/b:b	Landroid/os/ParcelFileDescriptor;
    //   85: invokevirtual 83	android/os/ParcelFileDescriptor:close	()V
    //   88: new 85	java/util/concurrent/CountDownLatch
    //   91: dup
    //   92: iconst_1
    //   93: invokespecial 88	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   96: astore_3
    //   97: aconst_null
    //   98: invokestatic 94	com/google/android/gms/common/images/ImageManager:f	(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    //   101: new 96	com/google/android/gms/common/images/c
    //   104: dup
    //   105: aconst_null
    //   106: aload_0
    //   107: getfield 21	com/google/android/gms/common/images/b:a	Landroid/net/Uri;
    //   110: aload_2
    //   111: iload_1
    //   112: aload_3
    //   113: invokespecial 99	com/google/android/gms/common/images/c:<init>	(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/graphics/Bitmap;ZLjava/util/concurrent/CountDownLatch;)V
    //   116: invokevirtual 105	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   119: pop
    //   120: aload_3
    //   121: invokevirtual 108	java/util/concurrent/CountDownLatch:await	()V
    //   124: return
    //   125: astore 7
    //   127: new 47	java/lang/StringBuilder
    //   130: dup
    //   131: ldc 110
    //   133: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   136: aload_0
    //   137: getfield 21	com/google/android/gms/common/images/b:a	Landroid/net/Uri;
    //   140: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: iconst_1
    //   145: istore_1
    //   146: aconst_null
    //   147: astore_2
    //   148: goto -67 -> 81
    //   151: astore 5
    //   153: new 47	java/lang/StringBuilder
    //   156: dup
    //   157: ldc 112
    //   159: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   162: aload_0
    //   163: getfield 21	com/google/android/gms/common/images/b:a	Landroid/net/Uri;
    //   166: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: return
    //   171: astore 9
    //   173: goto -85 -> 88
    //   176: aconst_null
    //   177: astore_2
    //   178: iconst_0
    //   179: istore_1
    //   180: goto -92 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   66	78	125	java/lang/OutOfMemoryError
    //   120	124	151	java/lang/InterruptedException
    //   81	88	171	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.b
 * JD-Core Version:    0.6.0
 */