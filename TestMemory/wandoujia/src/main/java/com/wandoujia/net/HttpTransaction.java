package com.wandoujia.net;

import android.net.Uri;
import com.wandoujia.net.codec.ChunkDecoder;
import com.wandoujia.net.codec.b;
import com.wandoujia.net.codec.e;
import com.wandoujia.net.codec.f;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;

abstract class HttpTransaction
{
  protected h a;
  protected final AsyncHttpRequest b;
  protected final a c;
  protected final long d;
  protected Uri e;
  protected b f;
  protected int g = 2;
  private o h;
  private HttpTransaction.State i;
  private f j;
  private ByteArrayOutputStream k;
  private long l;
  private x m;
  private boolean n;

  public HttpTransaction(a parama, long paramLong, AsyncHttpRequest paramAsyncHttpRequest)
  {
    this.c = parama;
    this.b = paramAsyncHttpRequest;
    this.d = paramLong;
    this.m = new x(this, 0);
    this.a = new h();
  }

  // ERROR //
  private void a(Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/wandoujia/net/HttpTransaction:c	Lcom/wandoujia/net/a;
    //   4: astore_2
    //   5: iconst_2
    //   6: anewarray 4	java/lang/Object
    //   9: astore_3
    //   10: aload_3
    //   11: iconst_0
    //   12: aload_0
    //   13: aastore
    //   14: aload_3
    //   15: iconst_1
    //   16: aload_1
    //   17: invokevirtual 72	android/net/Uri:toString	()Ljava/lang/String;
    //   20: aastore
    //   21: aload_2
    //   22: iconst_1
    //   23: aload_3
    //   24: invokevirtual 77	com/wandoujia/net/a:a	(I[Ljava/lang/Object;)V
    //   27: aload_0
    //   28: new 79	com/wandoujia/net/codec/f
    //   31: dup
    //   32: invokespecial 80	com/wandoujia/net/codec/f:<init>	()V
    //   35: putfield 82	com/wandoujia/net/HttpTransaction:j	Lcom/wandoujia/net/codec/f;
    //   38: aload_0
    //   39: aload_1
    //   40: putfield 84	com/wandoujia/net/HttpTransaction:e	Landroid/net/Uri;
    //   43: aload_0
    //   44: getstatic 89	com/wandoujia/net/HttpTransaction$State:READ_HEADER	Lcom/wandoujia/net/HttpTransaction$State;
    //   47: putfield 91	com/wandoujia/net/HttpTransaction:i	Lcom/wandoujia/net/HttpTransaction$State;
    //   50: aload_1
    //   51: invokevirtual 94	android/net/Uri:getScheme	()Ljava/lang/String;
    //   54: invokevirtual 99	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   57: astore 5
    //   59: aload_1
    //   60: invokevirtual 103	android/net/Uri:getPort	()I
    //   63: istore 6
    //   65: ldc 105
    //   67: aload 5
    //   69: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   72: ifeq +115 -> 187
    //   75: iload 6
    //   77: iconst_m1
    //   78: if_icmpeq +102 -> 180
    //   81: aload_1
    //   82: invokevirtual 112	android/net/Uri:getHost	()Ljava/lang/String;
    //   85: iload 6
    //   87: invokestatic 118	java/net/InetSocketAddress:createUnresolved	(Ljava/lang/String;I)Ljava/net/InetSocketAddress;
    //   90: astore 7
    //   92: new 120	com/wandoujia/net/u
    //   95: dup
    //   96: aload_0
    //   97: invokespecial 123	com/wandoujia/net/u:<init>	(Lcom/wandoujia/net/HttpTransaction;)V
    //   100: astore 8
    //   102: ldc 105
    //   104: aload_1
    //   105: invokevirtual 94	android/net/Uri:getScheme	()Ljava/lang/String;
    //   108: invokevirtual 99	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   111: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   114: ifeq +141 -> 255
    //   117: aload_0
    //   118: new 125	com/wandoujia/net/i
    //   121: dup
    //   122: aload 8
    //   124: invokespecial 128	com/wandoujia/net/i:<init>	(Lcom/wandoujia/net/p;)V
    //   127: putfield 130	com/wandoujia/net/HttpTransaction:h	Lcom/wandoujia/net/o;
    //   130: aload 7
    //   132: invokevirtual 133	java/net/InetSocketAddress:getHostName	()Ljava/lang/String;
    //   135: invokestatic 139	java/net/InetAddress:getAllByName	(Ljava/lang/String;)[Ljava/net/InetAddress;
    //   138: astore 11
    //   140: aload 11
    //   142: ifnull +9 -> 151
    //   145: aload 11
    //   147: arraylength
    //   148: ifne +132 -> 280
    //   151: new 64	java/net/UnknownHostException
    //   154: dup
    //   155: ldc 141
    //   157: invokespecial 144	java/net/UnknownHostException:<init>	(Ljava/lang/String;)V
    //   160: athrow
    //   161: astore 10
    //   163: aload_0
    //   164: new 146	com/wandoujia/net/HttpException
    //   167: dup
    //   168: getstatic 152	com/wandoujia/net/HttpException$Type:RESOLVE_IP_FAILED	Lcom/wandoujia/net/HttpException$Type;
    //   171: aload 10
    //   173: invokespecial 155	com/wandoujia/net/HttpException:<init>	(Lcom/wandoujia/net/HttpException$Type;Ljava/lang/Exception;)V
    //   176: invokevirtual 158	com/wandoujia/net/HttpTransaction:a	(Lcom/wandoujia/net/HttpException;)V
    //   179: return
    //   180: bipush 80
    //   182: istore 6
    //   184: goto -103 -> 81
    //   187: ldc 160
    //   189: aload 5
    //   191: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   194: ifeq +17 -> 211
    //   197: iload 6
    //   199: iconst_m1
    //   200: if_icmpne -119 -> 81
    //   203: sipush 443
    //   206: istore 6
    //   208: goto -127 -> 81
    //   211: new 146	com/wandoujia/net/HttpException
    //   214: dup
    //   215: getstatic 163	com/wandoujia/net/HttpException$Type:INVALID_URL	Lcom/wandoujia/net/HttpException$Type;
    //   218: ldc 165
    //   220: iconst_1
    //   221: anewarray 4	java/lang/Object
    //   224: dup
    //   225: iconst_0
    //   226: aload 5
    //   228: aastore
    //   229: invokestatic 169	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   232: invokespecial 172	com/wandoujia/net/HttpException:<init>	(Lcom/wandoujia/net/HttpException$Type;Ljava/lang/String;)V
    //   235: athrow
    //   236: astore 4
    //   238: aload_0
    //   239: new 146	com/wandoujia/net/HttpException
    //   242: dup
    //   243: getstatic 163	com/wandoujia/net/HttpException$Type:INVALID_URL	Lcom/wandoujia/net/HttpException$Type;
    //   246: aload 4
    //   248: invokespecial 155	com/wandoujia/net/HttpException:<init>	(Lcom/wandoujia/net/HttpException$Type;Ljava/lang/Exception;)V
    //   251: invokevirtual 158	com/wandoujia/net/HttpTransaction:a	(Lcom/wandoujia/net/HttpException;)V
    //   254: return
    //   255: aload_0
    //   256: new 174	com/wandoujia/net/k
    //   259: dup
    //   260: aload 8
    //   262: aload_0
    //   263: getfield 84	com/wandoujia/net/HttpTransaction:e	Landroid/net/Uri;
    //   266: invokevirtual 112	android/net/Uri:getHost	()Ljava/lang/String;
    //   269: iload 6
    //   271: invokespecial 177	com/wandoujia/net/k:<init>	(Lcom/wandoujia/net/p;Ljava/lang/String;I)V
    //   274: putfield 130	com/wandoujia/net/HttpTransaction:h	Lcom/wandoujia/net/o;
    //   277: goto -147 -> 130
    //   280: aload_0
    //   281: invokestatic 183	android/os/SystemClock:uptimeMillis	()J
    //   284: putfield 59	com/wandoujia/net/HttpTransaction:l	J
    //   287: aload_0
    //   288: getfield 40	com/wandoujia/net/HttpTransaction:c	Lcom/wandoujia/net/a;
    //   291: astore 12
    //   293: iconst_2
    //   294: anewarray 4	java/lang/Object
    //   297: astore 13
    //   299: aload 13
    //   301: iconst_0
    //   302: aload_0
    //   303: aastore
    //   304: aload 13
    //   306: iconst_1
    //   307: aload 11
    //   309: iconst_0
    //   310: aaload
    //   311: invokevirtual 186	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   314: aastore
    //   315: aload 12
    //   317: iconst_2
    //   318: aload 13
    //   320: invokevirtual 77	com/wandoujia/net/a:a	(I[Ljava/lang/Object;)V
    //   323: new 114	java/net/InetSocketAddress
    //   326: dup
    //   327: aload 11
    //   329: iconst_0
    //   330: aaload
    //   331: iload 6
    //   333: invokespecial 189	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
    //   336: astore 14
    //   338: aload_0
    //   339: getfield 130	com/wandoujia/net/HttpTransaction:h	Lcom/wandoujia/net/o;
    //   342: aload 14
    //   344: invokeinterface 194 2 0
    //   349: aload_0
    //   350: getfield 51	com/wandoujia/net/HttpTransaction:m	Lcom/wandoujia/net/x;
    //   353: invokevirtual 196	com/wandoujia/net/x:a	()V
    //   356: return
    //   357: astore 9
    //   359: aload_0
    //   360: new 146	com/wandoujia/net/HttpException
    //   363: dup
    //   364: getstatic 152	com/wandoujia/net/HttpException$Type:RESOLVE_IP_FAILED	Lcom/wandoujia/net/HttpException$Type;
    //   367: aload 9
    //   369: invokespecial 155	com/wandoujia/net/HttpException:<init>	(Lcom/wandoujia/net/HttpException$Type;Ljava/lang/Exception;)V
    //   372: invokevirtual 158	com/wandoujia/net/HttpTransaction:a	(Lcom/wandoujia/net/HttpException;)V
    //   375: return
    //
    // Exception table:
    //   from	to	target	type
    //   130	140	161	java/net/UnknownHostException
    //   145	151	161	java/net/UnknownHostException
    //   151	161	161	java/net/UnknownHostException
    //   280	356	161	java/net/UnknownHostException
    //   50	75	236	java/lang/Exception
    //   81	92	236	java/lang/Exception
    //   187	197	236	java/lang/Exception
    //   211	236	236	java/lang/Exception
    //   130	140	357	java/lang/SecurityException
    //   145	151	357	java/lang/SecurityException
    //   151	161	357	java/lang/SecurityException
    //   280	356	357	java/lang/SecurityException
  }

  private void m()
  {
    this.h.a();
    this.h = null;
    if ((this.a.a() == 200) || (this.a.a() == 206))
    {
      f();
      return;
    }
    this.a.b(k());
    a(new HttpException(HttpException.Type.BAD_RESPONSE, String.valueOf(this.a.a())));
  }

  public void a()
  {
    a(this.b.a());
  }

  protected final void a(Uri paramUri, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.c().c("Range");
      this.b.c().c("Accept-Ranges");
    }
    this.h.a();
    a(paramUri);
  }

  protected final void a(HttpException paramHttpException)
  {
    boolean bool = true;
    if (this.n)
      return;
    this.n = bool;
    if (this.h != null)
    {
      this.h.a();
      this.h = null;
    }
    if ((paramHttpException.getType() != HttpException.Type.CHUNK_ERROR.ordinal()) && (paramHttpException.getType() != HttpException.Type.DOWNLOAD_IO_ERROR.ordinal()));
    while (true)
    {
      this.a.a(paramHttpException);
      a(bool);
      return;
      bool = false;
    }
  }

  protected abstract void a(boolean paramBoolean);

  public void b()
  {
    if (this.h != null)
      this.h.a();
  }

  protected void c()
  {
    a locala = this.c;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = Long.valueOf(this.f.b());
    locala.a(5, arrayOfObject);
  }

  protected boolean d()
  {
    switch (this.a.a())
    {
    case 206:
    default:
    case 200:
    case 301:
    case 302:
    case 307:
    case 416:
    }
    while (true)
    {
      this.a.b(this.a.e());
      if (this.b.b() != AsyncHttpRequest.Method.HEAD)
        break;
      m();
      return false;
      if (this.b.c().a("Range") == null)
        continue;
      a(this.e, true);
      return false;
      String str = this.a.f().a("Location");
      if (str == null)
      {
        a(new HttpException(HttpException.Type.NOT_HTTP, "no location"));
        return false;
      }
      Uri localUri = Uri.parse(str);
      h localh = this.a;
      localUri.toString();
      localh.k();
      a(localUri, false);
      return false;
      if (this.b.c().a("Range") == null)
        continue;
      a(this.e, true);
      return false;
    }
    return true;
  }

  protected abstract void e();

  protected abstract void f();

  protected abstract HttpTransaction g();

  final long h()
  {
    return this.d;
  }

  final h i()
  {
    return this.a;
  }

  protected final void j()
  {
    this.k = new ByteArrayOutputStream();
    v localv = new v(Channels.newChannel(this.k));
    if (this.a.c())
    {
      this.f = new ChunkDecoder(localv);
      return;
    }
    if (this.a.e() > -1L)
    {
      this.f = new e(localv, 0L, this.a.e());
      return;
    }
    throw new HttpException(HttpException.Type.UNSUPPORT_TRANSFER_ENCODING, "Identity NOT Support");
  }

  protected final String k()
  {
    if (this.k == null)
      return null;
    String str1 = this.a.d();
    if (str1 == null)
      return new String(this.k.toByteArray());
    try
    {
      String str2 = new String(this.k.toByteArray(), str1);
      return str2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return new String(this.k.toByteArray());
  }

  protected final boolean l()
  {
    return ((this.a.a() < 400) || (this.a.a() >= 500)) && (this.g > 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.HttpTransaction
 * JD-Core Version:    0.6.0
 */