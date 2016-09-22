package com.tencent.open.yyb;

import android.os.AsyncTask;

final class f extends AsyncTask<String, Void, byte[]>
{
  private e a;

  public f(e parame)
  {
    this.a = parame;
  }

  // ERROR //
  private static byte[] a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: new 23	java/net/URL
    //   3: dup
    //   4: aload_0
    //   5: iconst_0
    //   6: aaload
    //   7: invokespecial 26	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 30	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   15: checkcast 32	java/net/HttpURLConnection
    //   18: astore_3
    //   19: aload_3
    //   20: sipush 5000
    //   23: invokevirtual 36	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   26: aload_3
    //   27: ldc 38
    //   29: invokevirtual 41	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   32: aload_3
    //   33: invokevirtual 45	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   36: astore 6
    //   38: aload_3
    //   39: invokevirtual 49	java/net/HttpURLConnection:getResponseCode	()I
    //   42: sipush 200
    //   45: if_icmpne +69 -> 114
    //   48: new 51	java/io/ByteArrayOutputStream
    //   51: dup
    //   52: invokespecial 52	java/io/ByteArrayOutputStream:<init>	()V
    //   55: astore 8
    //   57: sipush 1024
    //   60: newarray byte
    //   62: astore 9
    //   64: aload 6
    //   66: aload 9
    //   68: invokevirtual 58	java/io/InputStream:read	([B)I
    //   71: istore 10
    //   73: iload 10
    //   75: iconst_m1
    //   76: if_icmpeq +16 -> 92
    //   79: aload 8
    //   81: aload 9
    //   83: iconst_0
    //   84: iload 10
    //   86: invokevirtual 62	java/io/ByteArrayOutputStream:write	([BII)V
    //   89: goto -25 -> 64
    //   92: aload 8
    //   94: invokevirtual 65	java/io/ByteArrayOutputStream:close	()V
    //   97: aload 6
    //   99: invokevirtual 66	java/io/InputStream:close	()V
    //   102: aload 8
    //   104: invokevirtual 70	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   107: astore 11
    //   109: aload 11
    //   111: areturn
    //   112: astore 7
    //   114: aconst_null
    //   115: areturn
    //   116: astore 12
    //   118: aconst_null
    //   119: areturn
    //   120: astore_2
    //   121: aconst_null
    //   122: areturn
    //   123: astore 4
    //   125: aconst_null
    //   126: areturn
    //   127: astore 5
    //   129: aconst_null
    //   130: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   38	64	112	java/io/IOException
    //   64	73	112	java/io/IOException
    //   79	89	112	java/io/IOException
    //   92	109	112	java/io/IOException
    //   0	11	116	java/net/MalformedURLException
    //   11	19	120	java/io/IOException
    //   26	32	123	java/net/ProtocolException
    //   32	38	127	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.f
 * JD-Core Version:    0.6.0
 */