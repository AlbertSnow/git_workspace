package com.alipay.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class Picasso
{
  private static final Object d = new Object();
  private static Picasso e = null;
  final Handler a = new e(Looper.getMainLooper());
  final Context b;
  final Map<Object, Request> c;
  private Loader f;
  private ExecutorService g;
  private Cache h;
  private k i;

  Picasso(Context paramContext, Loader paramLoader, ExecutorService paramExecutorService, Cache paramCache, k paramk)
  {
    this.b = paramContext;
    this.f = paramLoader;
    this.g = paramExecutorService;
    this.h = paramCache;
    this.i = paramk;
    this.c = new WeakHashMap();
  }

  private static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    Matrix localMatrix = new Matrix();
    if (paramInt != 0)
      localMatrix.preRotate(paramInt);
    Object localObject1 = d;
    monitorenter;
    Bitmap localBitmap1 = paramBitmap;
    try
    {
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, j, k, localMatrix, false);
      if (localBitmap2 != paramBitmap)
      {
        paramBitmap.recycle();
        paramBitmap = localBitmap2;
      }
      return paramBitmap;
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  private Bitmap a(Uri paramUri, g paramg)
  {
    ContentResolver localContentResolver = this.b.getContentResolver();
    if ((paramg != null) && (paramg.inJustDecodeBounds))
    {
      BitmapFactory.decodeStream(localContentResolver.openInputStream(paramUri), null, paramg);
      p.a(paramg);
    }
    return BitmapFactory.decodeStream(localContentResolver.openInputStream(paramUri), null, paramg);
  }

  private static Bitmap a(InputStream paramInputStream, g paramg)
  {
    if (paramInputStream == null)
      return null;
    if (paramg != null)
      paramg.inJustDecodeBounds = false;
    return BitmapFactory.decodeStream(paramInputStream, null, paramg);
  }

  public static Picasso a(Context paramContext)
  {
    if (e == null)
      e = new f(paramContext).a();
    return e;
  }

  private j a(Uri paramUri)
  {
    return new j(this, paramUri);
  }

  private void a(Object paramObject, Uri paramUri)
  {
    Request localRequest = (Request)this.c.remove(paramObject);
    if (localRequest != null)
    {
      if (localRequest.h.isDone())
        break label42;
      localRequest.h.cancel(true);
    }
    label42: 
    do
      return;
    while ((paramUri != null) && (paramUri.equals(localRequest.b)));
    localRequest.l = true;
  }

  // ERROR //
  private Bitmap d(Request paramRequest)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_1
    //   5: getfield 156	com/alipay/squareup/picasso/Request:b	Landroid/net/Uri;
    //   8: astore 4
    //   10: aload_1
    //   11: getfield 171	com/alipay/squareup/picasso/Request:c	I
    //   14: istore 5
    //   16: iload 5
    //   18: ifeq +36 -> 54
    //   21: aload_0
    //   22: getfield 48	com/alipay/squareup/picasso/Picasso:b	Landroid/content/Context;
    //   25: invokevirtual 175	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   28: iload 5
    //   30: aconst_null
    //   31: invokestatic 179	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   34: astore 14
    //   36: aload_1
    //   37: getstatic 185	com/alipay/squareup/picasso/Request$LoadedFrom:DISK	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   40: putfield 188	com/alipay/squareup/picasso/Request:j	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   43: aload 14
    //   45: ifnonnull +333 -> 378
    //   48: aconst_null
    //   49: astore 14
    //   51: aload 14
    //   53: areturn
    //   54: aload 4
    //   56: invokevirtual 192	android/net/Uri:getScheme	()Ljava/lang/String;
    //   59: astore 6
    //   61: ldc 194
    //   63: aload 6
    //   65: invokevirtual 197	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   68: ifeq +87 -> 155
    //   71: aload_0
    //   72: getfield 48	com/alipay/squareup/picasso/Picasso:b	Landroid/content/Context;
    //   75: invokevirtual 92	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   78: astore 17
    //   80: getstatic 202	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   83: invokevirtual 205	android/net/Uri:getHost	()Ljava/lang/String;
    //   86: aload 4
    //   88: invokevirtual 205	android/net/Uri:getHost	()Ljava/lang/String;
    //   91: invokevirtual 197	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   94: ifeq +41 -> 135
    //   97: aload 4
    //   99: invokevirtual 209	android/net/Uri:getPathSegments	()Ljava/util/List;
    //   102: ldc 211
    //   104: invokeinterface 216 2 0
    //   109: ifne +26 -> 135
    //   112: aload 17
    //   114: aload 4
    //   116: invokestatic 219	com/alipay/squareup/picasso/p:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;
    //   119: aconst_null
    //   120: invokestatic 221	com/alipay/squareup/picasso/Picasso:a	(Ljava/io/InputStream;Lcom/alipay/squareup/picasso/g;)Landroid/graphics/Bitmap;
    //   123: astore 14
    //   125: aload_1
    //   126: getstatic 185	com/alipay/squareup/picasso/Request$LoadedFrom:DISK	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   129: putfield 188	com/alipay/squareup/picasso/Request:j	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   132: goto -89 -> 43
    //   135: aload 17
    //   137: aload 4
    //   139: invokestatic 224	com/alipay/squareup/picasso/p:a	(Landroid/content/ContentResolver;Landroid/net/Uri;)I
    //   142: istore_2
    //   143: aload_0
    //   144: aload 4
    //   146: aconst_null
    //   147: invokespecial 226	com/alipay/squareup/picasso/Picasso:a	(Landroid/net/Uri;Lcom/alipay/squareup/picasso/g;)Landroid/graphics/Bitmap;
    //   150: astore 14
    //   152: goto -27 -> 125
    //   155: ldc 228
    //   157: aload 6
    //   159: invokevirtual 197	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   162: ifeq +31 -> 193
    //   165: aload 4
    //   167: invokevirtual 231	android/net/Uri:getPath	()Ljava/lang/String;
    //   170: invokestatic 234	com/alipay/squareup/picasso/p:a	(Ljava/lang/String;)I
    //   173: istore_2
    //   174: aload_0
    //   175: aload 4
    //   177: aconst_null
    //   178: invokespecial 226	com/alipay/squareup/picasso/Picasso:a	(Landroid/net/Uri;Lcom/alipay/squareup/picasso/g;)Landroid/graphics/Bitmap;
    //   181: astore 14
    //   183: aload_1
    //   184: getstatic 185	com/alipay/squareup/picasso/Request$LoadedFrom:DISK	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   187: putfield 188	com/alipay/squareup/picasso/Request:j	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   190: goto -147 -> 43
    //   193: ldc 236
    //   195: aload 6
    //   197: invokevirtual 197	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   200: ifeq +24 -> 224
    //   203: aload_0
    //   204: aload 4
    //   206: aconst_null
    //   207: invokespecial 226	com/alipay/squareup/picasso/Picasso:a	(Landroid/net/Uri;Lcom/alipay/squareup/picasso/g;)Landroid/graphics/Bitmap;
    //   210: astore 14
    //   212: aload_1
    //   213: getstatic 185	com/alipay/squareup/picasso/Request$LoadedFrom:DISK	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   216: putfield 188	com/alipay/squareup/picasso/Request:j	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   219: iconst_0
    //   220: istore_2
    //   221: goto -178 -> 43
    //   224: aload_0
    //   225: getfield 50	com/alipay/squareup/picasso/Picasso:f	Lcom/alipay/squareup/picasso/Loader;
    //   228: astore 9
    //   230: aload_1
    //   231: getfield 239	com/alipay/squareup/picasso/Request:k	I
    //   234: ifne +47 -> 281
    //   237: iconst_1
    //   238: istore 10
    //   240: aload 9
    //   242: aload 4
    //   244: iload 10
    //   246: invokeinterface 245 3 0
    //   251: astore 11
    //   253: aload 11
    //   255: ifnonnull +32 -> 287
    //   258: aload 11
    //   260: ifnull +19 -> 279
    //   263: aload 11
    //   265: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   268: ifnull +11 -> 279
    //   271: aload 11
    //   273: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   276: invokevirtual 255	java/io/InputStream:close	()V
    //   279: aconst_null
    //   280: areturn
    //   281: iconst_0
    //   282: istore 10
    //   284: goto -44 -> 240
    //   287: aload 11
    //   289: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   292: aconst_null
    //   293: invokestatic 221	com/alipay/squareup/picasso/Picasso:a	(Ljava/io/InputStream;Lcom/alipay/squareup/picasso/g;)Landroid/graphics/Bitmap;
    //   296: astore 12
    //   298: aload 11
    //   300: ifnull +19 -> 319
    //   303: aload 11
    //   305: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   308: ifnull +11 -> 319
    //   311: aload 11
    //   313: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   316: invokevirtual 255	java/io/InputStream:close	()V
    //   319: aload 11
    //   321: getfield 257	com/alipay/squareup/picasso/b:b	Z
    //   324: ifeq +46 -> 370
    //   327: getstatic 185	com/alipay/squareup/picasso/Request$LoadedFrom:DISK	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   330: astore 13
    //   332: aload_1
    //   333: aload 13
    //   335: putfield 188	com/alipay/squareup/picasso/Request:j	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   338: aload 12
    //   340: astore 14
    //   342: iconst_0
    //   343: istore_2
    //   344: goto -301 -> 43
    //   347: astore 7
    //   349: aload_3
    //   350: ifnull +17 -> 367
    //   353: aload_3
    //   354: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   357: ifnull +10 -> 367
    //   360: aload_3
    //   361: getfield 250	com/alipay/squareup/picasso/b:a	Ljava/io/InputStream;
    //   364: invokevirtual 255	java/io/InputStream:close	()V
    //   367: aload 7
    //   369: athrow
    //   370: getstatic 260	com/alipay/squareup/picasso/Request$LoadedFrom:NETWORK	Lcom/alipay/squareup/picasso/Request$LoadedFrom;
    //   373: astore 13
    //   375: goto -43 -> 332
    //   378: aload_0
    //   379: getfield 56	com/alipay/squareup/picasso/Picasso:i	Lcom/alipay/squareup/picasso/k;
    //   382: aload 14
    //   384: invokevirtual 265	com/alipay/squareup/picasso/k:a	(Landroid/graphics/Bitmap;)V
    //   387: iload_2
    //   388: ifeq -337 -> 51
    //   391: aload 14
    //   393: iload_2
    //   394: invokestatic 267	com/alipay/squareup/picasso/Picasso:a	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   397: areturn
    //   398: astore 8
    //   400: goto -33 -> 367
    //   403: astore 7
    //   405: aload 11
    //   407: astore_3
    //   408: goto -59 -> 349
    //   411: astore 15
    //   413: goto -94 -> 319
    //   416: astore 16
    //   418: goto -139 -> 279
    //
    // Exception table:
    //   from	to	target	type
    //   224	237	347	finally
    //   240	253	347	finally
    //   360	367	398	java/io/IOException
    //   287	298	403	finally
    //   311	319	411	java/io/IOException
    //   271	279	416	java/io/IOException
  }

  final Bitmap a(Object paramObject, Uri paramUri, String paramString)
  {
    Bitmap localBitmap = this.h.get(paramString);
    a(paramObject, paramUri);
    if (localBitmap != null)
      this.i.a();
    return localBitmap;
  }

  public final j a(File paramFile)
  {
    return a(Uri.fromFile(paramFile));
  }

  public final j a(String paramString)
  {
    if (paramString == null)
      return new j(this, null);
    if (paramString.trim().length() == 0)
      throw new IllegalArgumentException("Path must not be empty.");
    return a(Uri.parse(paramString));
  }

  final void a(Request paramRequest)
  {
    Object localObject = paramRequest.a();
    if (localObject == null)
      return;
    a(localObject, paramRequest.b);
    this.c.put(localObject, paramRequest);
    paramRequest.h = this.g.submit(paramRequest);
  }

  public final void a(Target paramTarget)
  {
    a(paramTarget, null);
  }

  final Bitmap b(Request paramRequest)
  {
    Bitmap localBitmap1 = this.h.get(paramRequest.g);
    if (localBitmap1 != null)
      paramRequest.j = Request.LoadedFrom.MEMORY;
    if (localBitmap1 == null)
    {
      this.i.a.sendEmptyMessage(2);
      try
      {
        Bitmap localBitmap2 = d(paramRequest);
        if (localBitmap2 != null)
          this.h.set(paramRequest.g, localBitmap2);
        return localBitmap2;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        throw new IOException("Failed to decode request: " + paramRequest, localOutOfMemoryError);
      }
    }
    this.i.a();
    return localBitmap1;
  }

  final void c(Request paramRequest)
  {
    if (paramRequest.l)
      return;
    if (paramRequest.k > 0)
    {
      paramRequest.k = (-1 + paramRequest.k);
      a(paramRequest);
      return;
    }
    this.c.remove(paramRequest.a());
    paramRequest.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.Picasso
 * JD-Core Version:    0.6.0
 */