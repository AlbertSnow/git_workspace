package com.tencent.open.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.app.b;

public final class e extends SQLiteOpenHelper
{
  private static e a;

  static
  {
    new String[] { "key" };
  }

  private e(Context paramContext)
  {
    super(paramContext, "sdk_report.db", null, 2);
  }

  public static e a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new e(b.t());
      e locale = a;
      return locale;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  public final java.util.List<java.io.Serializable> a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 37	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 39	java/util/ArrayList:<init>	()V
    //   9: invokestatic 45	java/util/Collections:synchronizedList	(Ljava/util/List;)Ljava/util/List;
    //   12: astore_3
    //   13: aload_1
    //   14: invokestatic 51	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   17: istore 4
    //   19: iload 4
    //   21: ifeq +11 -> 32
    //   24: aload_3
    //   25: astore 10
    //   27: aload_0
    //   28: monitorexit
    //   29: aload 10
    //   31: areturn
    //   32: aload_0
    //   33: invokevirtual 55	com/tencent/open/b/e:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   36: astore 5
    //   38: aload 5
    //   40: ifnonnull +9 -> 49
    //   43: aload_3
    //   44: astore 10
    //   46: goto -19 -> 27
    //   49: aload 5
    //   51: ldc 57
    //   53: aconst_null
    //   54: ldc 59
    //   56: iconst_1
    //   57: anewarray 10	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: invokevirtual 65	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   70: astore 11
    //   72: aload 11
    //   74: astore 9
    //   76: aload 9
    //   78: ifnull +105 -> 183
    //   81: aload 9
    //   83: invokeinterface 71 1 0
    //   88: ifle +95 -> 183
    //   91: aload 9
    //   93: invokeinterface 75 1 0
    //   98: pop
    //   99: new 77	java/io/ByteArrayInputStream
    //   102: dup
    //   103: aload 9
    //   105: aload 9
    //   107: ldc 79
    //   109: invokeinterface 83 2 0
    //   114: invokeinterface 87 2 0
    //   119: invokespecial 90	java/io/ByteArrayInputStream:<init>	([B)V
    //   122: astore 13
    //   124: new 92	java/io/ObjectInputStream
    //   127: dup
    //   128: aload 13
    //   130: invokespecial 95	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   133: astore 14
    //   135: aload 14
    //   137: invokevirtual 99	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   140: checkcast 101	java/io/Serializable
    //   143: astore 18
    //   145: aload 14
    //   147: invokevirtual 104	java/io/ObjectInputStream:close	()V
    //   150: aload 13
    //   152: invokevirtual 105	java/io/ByteArrayInputStream:close	()V
    //   155: aload 18
    //   157: ifnull +12 -> 169
    //   160: aload_3
    //   161: aload 18
    //   163: invokeinterface 111 2 0
    //   168: pop
    //   169: aload 9
    //   171: invokeinterface 114 1 0
    //   176: istore 19
    //   178: iload 19
    //   180: ifne -81 -> 99
    //   183: aload 9
    //   185: ifnull +10 -> 195
    //   188: aload 9
    //   190: invokeinterface 115 1 0
    //   195: aload 5
    //   197: ifnull +8 -> 205
    //   200: aload 5
    //   202: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   205: aload_3
    //   206: astore 10
    //   208: goto -181 -> 27
    //   211: astore 27
    //   213: aconst_null
    //   214: astore 16
    //   216: aload 16
    //   218: ifnull +8 -> 226
    //   221: aload 16
    //   223: invokevirtual 104	java/io/ObjectInputStream:close	()V
    //   226: aload 13
    //   228: invokevirtual 105	java/io/ByteArrayInputStream:close	()V
    //   231: aconst_null
    //   232: astore 18
    //   234: goto -79 -> 155
    //   237: astore 17
    //   239: aconst_null
    //   240: astore 18
    //   242: goto -87 -> 155
    //   245: astore 22
    //   247: aconst_null
    //   248: astore 14
    //   250: aload 14
    //   252: ifnull +8 -> 260
    //   255: aload 14
    //   257: invokevirtual 104	java/io/ObjectInputStream:close	()V
    //   260: aload 13
    //   262: invokevirtual 105	java/io/ByteArrayInputStream:close	()V
    //   265: aload 22
    //   267: athrow
    //   268: astore 6
    //   270: aload 9
    //   272: astore 7
    //   274: ldc 118
    //   276: ldc 120
    //   278: aload 6
    //   280: invokestatic 126	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   283: aload 7
    //   285: ifnull +10 -> 295
    //   288: aload 7
    //   290: invokeinterface 115 1 0
    //   295: aload 5
    //   297: ifnull -92 -> 205
    //   300: aload 5
    //   302: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   305: goto -100 -> 205
    //   308: astore_2
    //   309: aload_0
    //   310: monitorexit
    //   311: aload_2
    //   312: athrow
    //   313: astore 8
    //   315: aconst_null
    //   316: astore 9
    //   318: aload 9
    //   320: ifnull +10 -> 330
    //   323: aload 9
    //   325: invokeinterface 115 1 0
    //   330: aload 5
    //   332: ifnull +8 -> 340
    //   335: aload 5
    //   337: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   340: aload 8
    //   342: athrow
    //   343: astore 25
    //   345: goto -195 -> 150
    //   348: astore 26
    //   350: goto -195 -> 155
    //   353: astore 21
    //   355: goto -129 -> 226
    //   358: astore 24
    //   360: goto -100 -> 260
    //   363: astore 23
    //   365: goto -100 -> 265
    //   368: astore 8
    //   370: goto -52 -> 318
    //   373: astore 8
    //   375: aload 7
    //   377: astore 9
    //   379: goto -61 -> 318
    //   382: astore 6
    //   384: aconst_null
    //   385: astore 7
    //   387: goto -113 -> 274
    //   390: astore 22
    //   392: goto -142 -> 250
    //   395: astore 15
    //   397: aload 14
    //   399: astore 16
    //   401: goto -185 -> 216
    //
    // Exception table:
    //   from	to	target	type
    //   124	135	211	java/lang/Exception
    //   226	231	237	java/io/IOException
    //   124	135	245	finally
    //   81	99	268	java/lang/Exception
    //   99	124	268	java/lang/Exception
    //   145	150	268	java/lang/Exception
    //   150	155	268	java/lang/Exception
    //   160	169	268	java/lang/Exception
    //   169	178	268	java/lang/Exception
    //   221	226	268	java/lang/Exception
    //   226	231	268	java/lang/Exception
    //   255	260	268	java/lang/Exception
    //   260	265	268	java/lang/Exception
    //   265	268	268	java/lang/Exception
    //   2	19	308	finally
    //   32	38	308	finally
    //   188	195	308	finally
    //   200	205	308	finally
    //   288	295	308	finally
    //   300	305	308	finally
    //   323	330	308	finally
    //   335	340	308	finally
    //   340	343	308	finally
    //   49	72	313	finally
    //   145	150	343	java/io/IOException
    //   150	155	348	java/io/IOException
    //   221	226	353	java/io/IOException
    //   255	260	358	java/io/IOException
    //   260	265	363	java/io/IOException
    //   81	99	368	finally
    //   99	124	368	finally
    //   145	150	368	finally
    //   150	155	368	finally
    //   160	169	368	finally
    //   169	178	368	finally
    //   221	226	368	finally
    //   226	231	368	finally
    //   255	260	368	finally
    //   260	265	368	finally
    //   265	268	368	finally
    //   274	283	373	finally
    //   49	72	382	java/lang/Exception
    //   135	145	390	finally
    //   135	145	395	java/lang/Exception
  }

  // ERROR //
  public final void a(String paramString, java.util.List<java.io.Serializable> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_2
    //   5: invokeinterface 130 1 0
    //   10: istore 5
    //   12: iload 5
    //   14: ifne +6 -> 20
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: iload 5
    //   22: bipush 20
    //   24: if_icmpgt +154 -> 178
    //   27: iload 5
    //   29: istore 6
    //   31: aload_1
    //   32: invokestatic 51	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   35: ifne -18 -> 17
    //   38: aload_0
    //   39: aload_1
    //   40: invokevirtual 133	com/tencent/open/b/e:b	(Ljava/lang/String;)V
    //   43: aload_0
    //   44: invokevirtual 136	com/tencent/open/b/e:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   47: astore 7
    //   49: aload 7
    //   51: ifnull -34 -> 17
    //   54: aload 7
    //   56: invokevirtual 139	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   59: new 141	android/content/ContentValues
    //   62: dup
    //   63: invokespecial 142	android/content/ContentValues:<init>	()V
    //   66: astore 8
    //   68: iconst_0
    //   69: istore 9
    //   71: iload 9
    //   73: iload 6
    //   75: if_icmpge +190 -> 265
    //   78: aload_2
    //   79: iload 9
    //   81: invokeinterface 146 2 0
    //   86: checkcast 101	java/io/Serializable
    //   89: astore 12
    //   91: aload 12
    //   93: ifnull +74 -> 167
    //   96: aload 8
    //   98: ldc 148
    //   100: aload_1
    //   101: invokevirtual 152	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: new 154	java/io/ByteArrayOutputStream
    //   107: dup
    //   108: sipush 512
    //   111: invokespecial 157	java/io/ByteArrayOutputStream:<init>	(I)V
    //   114: astore 13
    //   116: new 159	java/io/ObjectOutputStream
    //   119: dup
    //   120: aload 13
    //   122: invokespecial 162	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   125: astore 14
    //   127: aload 14
    //   129: aload 12
    //   131: invokevirtual 166	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   134: aload 14
    //   136: invokevirtual 167	java/io/ObjectOutputStream:close	()V
    //   139: aload 13
    //   141: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   144: aload 8
    //   146: ldc 79
    //   148: aload 13
    //   150: invokevirtual 172	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   153: invokevirtual 175	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   156: aload 7
    //   158: ldc 57
    //   160: aconst_null
    //   161: aload 8
    //   163: invokevirtual 179	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   166: pop2
    //   167: aload 8
    //   169: invokevirtual 182	android/content/ContentValues:clear	()V
    //   172: iinc 9 1
    //   175: goto -104 -> 71
    //   178: bipush 20
    //   180: istore 6
    //   182: goto -151 -> 31
    //   185: astore 26
    //   187: aconst_null
    //   188: astore 16
    //   190: aload 16
    //   192: ifnull +8 -> 200
    //   195: aload 16
    //   197: invokevirtual 167	java/io/ObjectOutputStream:close	()V
    //   200: aload 13
    //   202: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   205: goto -61 -> 144
    //   208: astore 17
    //   210: goto -66 -> 144
    //   213: astore 21
    //   215: aload_3
    //   216: ifnull +7 -> 223
    //   219: aload_3
    //   220: invokevirtual 167	java/io/ObjectOutputStream:close	()V
    //   223: aload 13
    //   225: invokevirtual 168	java/io/ByteArrayOutputStream:close	()V
    //   228: aload 21
    //   230: athrow
    //   231: astore 11
    //   233: ldc 118
    //   235: ldc 184
    //   237: invokestatic 187	com/tencent/open/a/f:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: aload 7
    //   242: invokevirtual 190	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   245: aload 7
    //   247: ifnull -230 -> 17
    //   250: aload 7
    //   252: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   255: goto -238 -> 17
    //   258: astore 4
    //   260: aload_0
    //   261: monitorexit
    //   262: aload 4
    //   264: athrow
    //   265: aload 7
    //   267: invokevirtual 193	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   270: aload 7
    //   272: invokevirtual 190	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   275: aload 7
    //   277: ifnull -260 -> 17
    //   280: aload 7
    //   282: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   285: goto -268 -> 17
    //   288: astore 10
    //   290: aload 7
    //   292: invokevirtual 190	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   295: aload 7
    //   297: ifnull +8 -> 305
    //   300: aload 7
    //   302: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   305: aload 10
    //   307: athrow
    //   308: astore 24
    //   310: goto -171 -> 139
    //   313: astore 25
    //   315: goto -171 -> 144
    //   318: astore 20
    //   320: goto -120 -> 200
    //   323: astore 23
    //   325: goto -102 -> 223
    //   328: astore 22
    //   330: goto -102 -> 228
    //   333: astore 21
    //   335: aload 14
    //   337: astore_3
    //   338: goto -123 -> 215
    //   341: astore 15
    //   343: aload 14
    //   345: astore 16
    //   347: goto -157 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   116	127	185	java/io/IOException
    //   200	205	208	java/io/IOException
    //   116	127	213	finally
    //   59	68	231	java/lang/Exception
    //   78	91	231	java/lang/Exception
    //   96	116	231	java/lang/Exception
    //   134	139	231	java/lang/Exception
    //   139	144	231	java/lang/Exception
    //   144	167	231	java/lang/Exception
    //   167	172	231	java/lang/Exception
    //   195	200	231	java/lang/Exception
    //   200	205	231	java/lang/Exception
    //   219	223	231	java/lang/Exception
    //   223	228	231	java/lang/Exception
    //   228	231	231	java/lang/Exception
    //   265	270	231	java/lang/Exception
    //   4	12	258	finally
    //   31	49	258	finally
    //   54	59	258	finally
    //   240	245	258	finally
    //   250	255	258	finally
    //   270	275	258	finally
    //   280	285	258	finally
    //   290	295	258	finally
    //   300	305	258	finally
    //   305	308	258	finally
    //   59	68	288	finally
    //   78	91	288	finally
    //   96	116	288	finally
    //   134	139	288	finally
    //   139	144	288	finally
    //   144	167	288	finally
    //   167	172	288	finally
    //   195	200	288	finally
    //   200	205	288	finally
    //   219	223	288	finally
    //   223	228	288	finally
    //   228	231	288	finally
    //   233	240	288	finally
    //   265	270	288	finally
    //   134	139	308	java/io/IOException
    //   139	144	313	java/io/IOException
    //   195	200	318	java/io/IOException
    //   219	223	323	java/io/IOException
    //   223	228	328	java/io/IOException
    //   127	134	333	finally
    //   127	134	341	java/io/IOException
  }

  // ERROR //
  public final void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 51	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokevirtual 136	com/tencent/open/b/e:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 4
    //   20: aload 4
    //   22: ifnull -11 -> 11
    //   25: aload 4
    //   27: ldc 57
    //   29: ldc 59
    //   31: iconst_1
    //   32: anewarray 10	java/lang/String
    //   35: dup
    //   36: iconst_0
    //   37: aload_1
    //   38: aastore
    //   39: invokevirtual 197	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   42: pop
    //   43: aload 4
    //   45: ifnull -34 -> 11
    //   48: aload 4
    //   50: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   53: goto -42 -> 11
    //   56: astore_2
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_2
    //   60: athrow
    //   61: astore 6
    //   63: ldc 118
    //   65: ldc 199
    //   67: aload 6
    //   69: invokestatic 126	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   72: aload 4
    //   74: ifnull -63 -> 11
    //   77: aload 4
    //   79: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   82: goto -71 -> 11
    //   85: astore 5
    //   87: aload 4
    //   89: ifnull +8 -> 97
    //   92: aload 4
    //   94: invokevirtual 116	android/database/sqlite/SQLiteDatabase:close	()V
    //   97: aload 5
    //   99: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	56	finally
    //   14	20	56	finally
    //   48	53	56	finally
    //   77	82	56	finally
    //   92	97	56	finally
    //   97	100	56	finally
    //   25	43	61	java/lang/Exception
    //   25	43	85	finally
    //   63	72	85	finally
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS via_cgi_report( _id INTEGER PRIMARY KEY,key TEXT,type TEXT,blob BLOB);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS via_cgi_report");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.e
 * JD-Core Version:    0.6.0
 */