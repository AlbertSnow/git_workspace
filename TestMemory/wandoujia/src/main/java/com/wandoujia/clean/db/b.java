package com.wandoujia.clean.db;

final class b<T>
{
  private h a;
  private final a<T> b;

  b(h paramh, a<T> parama)
  {
    this.a = paramh;
    this.b = parama;
  }

  // ERROR //
  final boolean a(java.util.List<T> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 17	com/wandoujia/clean/db/b:a	Lcom/wandoujia/clean/db/h;
    //   6: invokevirtual 30	com/wandoujia/clean/db/h:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   9: astore 9
    //   11: aload 9
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 35	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   18: aload_1
    //   19: invokeinterface 41 1 0
    //   24: astore 10
    //   26: aload 10
    //   28: invokeinterface 47 1 0
    //   33: ifeq +85 -> 118
    //   36: aload 10
    //   38: invokeinterface 51 1 0
    //   43: astore 11
    //   45: aload_2
    //   46: aload_0
    //   47: getfield 19	com/wandoujia/clean/db/b:b	Lcom/wandoujia/clean/db/a;
    //   50: invokeinterface 56 1 0
    //   55: aconst_null
    //   56: aload_0
    //   57: getfield 19	com/wandoujia/clean/db/b:b	Lcom/wandoujia/clean/db/a;
    //   60: aload 11
    //   62: invokeinterface 59 2 0
    //   67: invokevirtual 63	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   70: pop2
    //   71: goto -45 -> 26
    //   74: astore 8
    //   76: new 65	java/lang/StringBuilder
    //   79: dup
    //   80: ldc 67
    //   82: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: getfield 19	com/wandoujia/clean/db/b:b	Lcom/wandoujia/clean/db/a;
    //   89: invokeinterface 56 1 0
    //   94: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc 76
    //   99: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 84	android/support/v4/app/b:z	(Ljava/lang/String;)V
    //   108: aload_2
    //   109: ifnull +7 -> 116
    //   112: aload_2
    //   113: invokevirtual 87	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   116: iconst_0
    //   117: ireturn
    //   118: aload_2
    //   119: invokevirtual 90	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   122: aload_2
    //   123: ifnull +7 -> 130
    //   126: aload_2
    //   127: invokevirtual 87	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   130: iconst_1
    //   131: ireturn
    //   132: astore 6
    //   134: new 65	java/lang/StringBuilder
    //   137: dup
    //   138: ldc 67
    //   140: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: aload_0
    //   144: getfield 19	com/wandoujia/clean/db/b:b	Lcom/wandoujia/clean/db/a;
    //   147: invokeinterface 56 1 0
    //   152: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 92
    //   157: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 84	android/support/v4/app/b:z	(Ljava/lang/String;)V
    //   166: aload_2
    //   167: ifnull -51 -> 116
    //   170: aload_2
    //   171: invokevirtual 87	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   174: goto -58 -> 116
    //   177: astore_3
    //   178: aconst_null
    //   179: astore 4
    //   181: aload_3
    //   182: astore 5
    //   184: aload 4
    //   186: ifnull +8 -> 194
    //   189: aload 4
    //   191: invokevirtual 87	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   194: aload 5
    //   196: athrow
    //   197: astore 7
    //   199: aload_2
    //   200: astore 4
    //   202: aload 7
    //   204: astore 5
    //   206: goto -22 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	74	android/database/sqlite/SQLiteException
    //   14	26	74	android/database/sqlite/SQLiteException
    //   26	71	74	android/database/sqlite/SQLiteException
    //   118	122	74	android/database/sqlite/SQLiteException
    //   2	11	132	java/lang/Exception
    //   14	26	132	java/lang/Exception
    //   26	71	132	java/lang/Exception
    //   118	122	132	java/lang/Exception
    //   2	11	177	finally
    //   14	26	197	finally
    //   26	71	197	finally
    //   76	108	197	finally
    //   118	122	197	finally
    //   134	166	197	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.b
 * JD-Core Version:    0.6.0
 */