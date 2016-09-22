package com.alipay.wandoujia;

import android.content.Context;

final class q extends l
{
  private boolean a;

  q(Context paramContext)
  {
    super(paramContext);
  }

  // ERROR //
  private static void a(java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 21	java/io/File:exists	()Z
    //   6: ifeq +38 -> 44
    //   9: aload_0
    //   10: invokevirtual 24	java/io/File:isFile	()Z
    //   13: ifeq +31 -> 44
    //   16: new 26	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 28
    //   22: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokevirtual 35	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   29: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: astore_2
    //   36: aload_2
    //   37: invokestatic 48	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   40: ifeq +41 -> 81
    //   43: return
    //   44: aload_0
    //   45: invokevirtual 21	java/io/File:exists	()Z
    //   48: ifeq +145 -> 193
    //   51: aload_0
    //   52: invokevirtual 51	java/io/File:isAbsolute	()Z
    //   55: ifeq +138 -> 193
    //   58: new 26	java/lang/StringBuilder
    //   61: dup
    //   62: ldc 53
    //   64: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload_0
    //   68: invokevirtual 35	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   71: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore_2
    //   78: goto -42 -> 36
    //   81: invokestatic 59	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   84: ldc 61
    //   86: invokevirtual 65	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   89: invokevirtual 71	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   92: astore_1
    //   93: new 26	java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   100: astore 8
    //   102: aload 8
    //   104: aload_2
    //   105: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload 8
    //   111: ldc 76
    //   113: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload 8
    //   119: ldc 78
    //   121: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload 8
    //   127: ldc 76
    //   129: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_1
    //   134: aload 8
    //   136: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokevirtual 84	java/lang/String:getBytes	()[B
    //   142: invokevirtual 90	java/io/OutputStream:write	([B)V
    //   145: aload_1
    //   146: invokevirtual 93	java/io/OutputStream:flush	()V
    //   149: aload_1
    //   150: invokevirtual 96	java/io/OutputStream:close	()V
    //   153: aload_0
    //   154: invokevirtual 35	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   157: pop
    //   158: invokestatic 101	android/support/v4/app/b:g	()V
    //   161: return
    //   162: astore 5
    //   164: aload_1
    //   165: invokevirtual 96	java/io/OutputStream:close	()V
    //   168: goto -15 -> 153
    //   171: astore 6
    //   173: goto -20 -> 153
    //   176: astore_3
    //   177: aload_1
    //   178: invokevirtual 96	java/io/OutputStream:close	()V
    //   181: aload_3
    //   182: athrow
    //   183: astore 4
    //   185: goto -4 -> 181
    //   188: astore 13
    //   190: goto -37 -> 153
    //   193: aconst_null
    //   194: astore_2
    //   195: goto -159 -> 36
    //
    // Exception table:
    //   from	to	target	type
    //   81	149	162	java/io/IOException
    //   164	168	171	java/lang/Exception
    //   81	149	176	finally
    //   177	181	183	java/lang/Exception
    //   149	153	188	java/lang/Exception
  }

  // ERROR //
  private static void a(java.io.File paramFile, org.json.JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 105	java/io/File:canRead	()Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aconst_null
    //   9: astore_2
    //   10: new 107	java/io/BufferedReader
    //   13: dup
    //   14: new 109	java/io/FileReader
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 111	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   22: invokespecial 114	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual 117	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore 9
    //   32: aload 9
    //   34: ifnonnull +15 -> 49
    //   37: aload_3
    //   38: invokevirtual 118	java/io/BufferedReader:close	()V
    //   41: aload_3
    //   42: invokevirtual 118	java/io/BufferedReader:close	()V
    //   45: return
    //   46: astore 10
    //   48: return
    //   49: aload_1
    //   50: new 120	org/json/JSONObject
    //   53: dup
    //   54: aload 9
    //   56: invokespecial 121	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   59: invokevirtual 127	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   62: pop
    //   63: goto -37 -> 26
    //   66: astore 7
    //   68: aload_3
    //   69: ifnull -62 -> 7
    //   72: aload_3
    //   73: invokevirtual 118	java/io/BufferedReader:close	()V
    //   76: return
    //   77: astore 8
    //   79: return
    //   80: astore 5
    //   82: aload_2
    //   83: ifnull +7 -> 90
    //   86: aload_2
    //   87: invokevirtual 118	java/io/BufferedReader:close	()V
    //   90: aload 5
    //   92: athrow
    //   93: astore 6
    //   95: goto -5 -> 90
    //   98: astore 4
    //   100: aload_3
    //   101: astore_2
    //   102: aload 4
    //   104: astore 5
    //   106: goto -24 -> 82
    //   109: astore 12
    //   111: aconst_null
    //   112: astore_3
    //   113: goto -45 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   41	45	46	java/io/IOException
    //   26	32	66	java/lang/Exception
    //   37	41	66	java/lang/Exception
    //   49	63	66	java/lang/Exception
    //   72	76	77	java/io/IOException
    //   10	26	80	finally
    //   86	90	93	java/io/IOException
    //   26	32	98	finally
    //   37	41	98	finally
    //   49	63	98	finally
    //   10	26	109	java/lang/Exception
  }

  // ERROR //
  private boolean b(java.io.File paramFile)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: new 120	org/json/JSONObject
    //   7: dup
    //   8: invokespecial 130	org/json/JSONObject:<init>	()V
    //   11: astore 4
    //   13: new 123	org/json/JSONArray
    //   16: dup
    //   17: invokespecial 131	org/json/JSONArray:<init>	()V
    //   20: astore 5
    //   22: new 120	org/json/JSONObject
    //   25: dup
    //   26: invokespecial 130	org/json/JSONObject:<init>	()V
    //   29: astore 6
    //   31: aload 6
    //   33: ldc 133
    //   35: ldc 135
    //   37: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   40: pop
    //   41: aload 6
    //   43: ldc 140
    //   45: ldc 142
    //   47: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   50: pop
    //   51: aload 6
    //   53: ldc 144
    //   55: getstatic 150	com/alipay/android/app/pay/c:k	Ljava/lang/String;
    //   58: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   61: pop
    //   62: aload 6
    //   64: ldc 152
    //   66: getstatic 157	android/os/Build:MODEL	Ljava/lang/String;
    //   69: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   72: pop
    //   73: aload 6
    //   75: ldc 159
    //   77: aload 5
    //   79: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   82: pop
    //   83: aload 4
    //   85: ldc 161
    //   87: aload 6
    //   89: invokevirtual 138	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   92: pop
    //   93: aload_1
    //   94: aload 5
    //   96: invokestatic 163	com/alipay/wandoujia/q:a	(Ljava/io/File;Lorg/json/JSONArray;)V
    //   99: aload_0
    //   100: invokevirtual 167	com/alipay/wandoujia/q:d	()Landroid/content/Context;
    //   103: getstatic 170	com/alipay/android/app/pay/c:h	Ljava/lang/String;
    //   106: aload 4
    //   108: invokevirtual 171	org/json/JSONObject:toString	()Ljava/lang/String;
    //   111: invokestatic 174	android/support/v4/app/b:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/HttpResponse;
    //   114: astore 18
    //   116: aload 18
    //   118: astore_3
    //   119: aload_3
    //   120: invokeinterface 180 1 0
    //   125: invokeinterface 186 1 0
    //   130: istore 20
    //   132: iload 20
    //   134: sipush 404
    //   137: if_icmpne +87 -> 224
    //   140: aload_1
    //   141: invokevirtual 189	java/io/File:getName	()Ljava/lang/String;
    //   144: astore 21
    //   146: aload 21
    //   148: getstatic 195	com/alipay/wandoujia/fa:f	Lcom/alipay/wandoujia/fa;
    //   151: invokevirtual 197	com/alipay/wandoujia/fa:a	()Ljava/lang/String;
    //   154: invokevirtual 201	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   157: ifgt +21 -> 178
    //   160: aload 21
    //   162: getstatic 203	com/alipay/wandoujia/fa:b	Lcom/alipay/wandoujia/fa;
    //   165: invokevirtual 197	com/alipay/wandoujia/fa:a	()Ljava/lang/String;
    //   168: invokevirtual 201	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   171: istore 23
    //   173: iload 23
    //   175: ifle +25 -> 200
    //   178: aload_3
    //   179: ifnull +17 -> 196
    //   182: aload_3
    //   183: invokeinterface 207 1 0
    //   188: invokeinterface 213 1 0
    //   193: invokevirtual 216	java/io/InputStream:close	()V
    //   196: iconst_0
    //   197: istore_2
    //   198: iload_2
    //   199: ireturn
    //   200: aload_3
    //   201: ifnull -3 -> 198
    //   204: aload_3
    //   205: invokeinterface 207 1 0
    //   210: invokeinterface 213 1 0
    //   215: invokevirtual 216	java/io/InputStream:close	()V
    //   218: iload_2
    //   219: ireturn
    //   220: astore 24
    //   222: iload_2
    //   223: ireturn
    //   224: iload 20
    //   226: sipush 400
    //   229: if_icmplt +31 -> 260
    //   232: iload 20
    //   234: sipush 500
    //   237: if_icmpge +23 -> 260
    //   240: aload_3
    //   241: ifnull +17 -> 258
    //   244: aload_3
    //   245: invokeinterface 207 1 0
    //   250: invokeinterface 213 1 0
    //   255: invokevirtual 216	java/io/InputStream:close	()V
    //   258: iconst_0
    //   259: ireturn
    //   260: aload_3
    //   261: ifnull -63 -> 198
    //   264: aload_3
    //   265: invokeinterface 207 1 0
    //   270: invokeinterface 213 1 0
    //   275: invokevirtual 216	java/io/InputStream:close	()V
    //   278: iload_2
    //   279: ireturn
    //   280: astore 25
    //   282: iload_2
    //   283: ireturn
    //   284: astore 9
    //   286: aconst_null
    //   287: astore 10
    //   289: aload 10
    //   291: ifnull +18 -> 309
    //   294: aload 10
    //   296: invokeinterface 207 1 0
    //   301: invokeinterface 213 1 0
    //   306: invokevirtual 216	java/io/InputStream:close	()V
    //   309: iconst_0
    //   310: ireturn
    //   311: astore 7
    //   313: aload_3
    //   314: ifnull +17 -> 331
    //   317: aload_3
    //   318: invokeinterface 207 1 0
    //   323: invokeinterface 213 1 0
    //   328: invokevirtual 216	java/io/InputStream:close	()V
    //   331: aload 7
    //   333: athrow
    //   334: astore 8
    //   336: goto -5 -> 331
    //   339: astore 11
    //   341: goto -32 -> 309
    //   344: astore 19
    //   346: aload_3
    //   347: astore 10
    //   349: goto -60 -> 289
    //   352: astore 26
    //   354: goto -96 -> 258
    //   357: astore 22
    //   359: goto -163 -> 196
    //
    // Exception table:
    //   from	to	target	type
    //   204	218	220	java/lang/Exception
    //   264	278	280	java/lang/Exception
    //   4	116	284	java/lang/Exception
    //   4	116	311	finally
    //   119	132	311	finally
    //   140	173	311	finally
    //   317	331	334	java/lang/Exception
    //   294	309	339	java/lang/Exception
    //   119	132	344	java/lang/Exception
    //   140	173	344	java/lang/Exception
    //   244	258	352	java/lang/Exception
    //   182	196	357	java/lang/Exception
  }

  protected final void e()
  {
    this.a = true;
  }

  // ERROR //
  protected final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 219	com/alipay/wandoujia/q:a	Z
    //   5: invokestatic 221	com/alipay/wandoujia/q:b	()Z
    //   8: ifne +10 -> 18
    //   11: aload_0
    //   12: invokevirtual 224	com/alipay/wandoujia/q:c	()Z
    //   15: ifne +4 -> 19
    //   18: return
    //   19: new 17	java/io/File
    //   22: dup
    //   23: invokestatic 229	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   26: invokevirtual 232	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   29: invokeinterface 235 1 0
    //   34: invokespecial 236	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: astore_1
    //   38: aload_1
    //   39: invokevirtual 21	java/io/File:exists	()Z
    //   42: ifeq -24 -> 18
    //   45: aload_1
    //   46: invokevirtual 240	java/io/File:listFiles	()[Ljava/io/File;
    //   49: astore_3
    //   50: iconst_0
    //   51: istore 4
    //   53: iload 4
    //   55: aload_3
    //   56: arraylength
    //   57: if_icmpge -39 -> 18
    //   60: aload_3
    //   61: iload 4
    //   63: aaload
    //   64: astore 5
    //   66: ldc 242
    //   68: invokestatic 247	com/alipay/wandoujia/k:a	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore 6
    //   73: aload 5
    //   75: invokevirtual 189	java/io/File:getName	()Ljava/lang/String;
    //   78: aload 6
    //   80: invokestatic 251	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   83: ifne +136 -> 219
    //   86: aload 5
    //   88: invokevirtual 240	java/io/File:listFiles	()[Ljava/io/File;
    //   91: astore 7
    //   93: iconst_0
    //   94: istore 8
    //   96: iload 8
    //   98: aload 7
    //   100: arraylength
    //   101: if_icmplt +49 -> 150
    //   104: aload 5
    //   106: invokevirtual 240	java/io/File:listFiles	()[Ljava/io/File;
    //   109: astore 11
    //   111: aload 11
    //   113: ifnull +9 -> 122
    //   116: aload 11
    //   118: arraylength
    //   119: ifne +8 -> 127
    //   122: aload 5
    //   124: invokestatic 253	com/alipay/wandoujia/q:a	(Ljava/io/File;)V
    //   127: aload_0
    //   128: getfield 219	com/alipay/wandoujia/q:a	Z
    //   131: ifeq +88 -> 219
    //   134: invokestatic 221	com/alipay/wandoujia/q:b	()Z
    //   137: ifeq +82 -> 219
    //   140: aload_0
    //   141: invokevirtual 224	com/alipay/wandoujia/q:c	()Z
    //   144: ifeq -126 -> 18
    //   147: goto +72 -> 219
    //   150: aload 7
    //   152: iload 8
    //   154: aaload
    //   155: astore 9
    //   157: aload 9
    //   159: invokevirtual 257	java/io/File:length	()J
    //   162: invokestatic 229	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   165: invokevirtual 232	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   168: invokeinterface 259 1 0
    //   173: i2l
    //   174: lcmp
    //   175: ifge +6 -> 181
    //   178: goto +47 -> 225
    //   181: aload_0
    //   182: aload 9
    //   184: invokespecial 261	com/alipay/wandoujia/q:b	(Ljava/io/File;)Z
    //   187: ifeq +11 -> 198
    //   190: aload 9
    //   192: invokestatic 253	com/alipay/wandoujia/q:a	(Ljava/io/File;)V
    //   195: goto +30 -> 225
    //   198: aload_1
    //   199: invokevirtual 257	java/io/File:length	()J
    //   202: ldc2_w 262
    //   205: lcmp
    //   206: ifle +19 -> 225
    //   209: aload 9
    //   211: invokestatic 253	com/alipay/wandoujia/q:a	(Ljava/io/File;)V
    //   214: goto +11 -> 225
    //   217: astore_2
    //   218: return
    //   219: iinc 4 1
    //   222: goto -169 -> 53
    //   225: iinc 8 1
    //   228: goto -132 -> 96
    //   231: astore 10
    //   233: goto -8 -> 225
    //
    // Exception table:
    //   from	to	target	type
    //   19	50	217	java/lang/Exception
    //   53	93	217	java/lang/Exception
    //   96	111	217	java/lang/Exception
    //   116	122	217	java/lang/Exception
    //   122	127	217	java/lang/Exception
    //   127	147	217	java/lang/Exception
    //   150	157	217	java/lang/Exception
    //   157	178	231	java/lang/Exception
    //   181	195	231	java/lang/Exception
    //   198	214	231	java/lang/Exception
  }

  protected final boolean g()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.q
 * JD-Core Version:    0.6.0
 */