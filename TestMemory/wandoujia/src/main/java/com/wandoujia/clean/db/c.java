package com.wandoujia.clean.db;

import com.wandoujia.clean.db.model.GarbageBean;
import java.util.List;

public final class c
{
  private static final d a = new d();
  private static final b<GarbageBean> b = new b(h.a(), a);

  static
  {
    new b(h.a(), new e());
    new b(h.a(), new f());
    new b(h.a(), new g());
  }

  // ERROR //
  public static long a(java.lang.String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokestatic 48	android/support/v4/app/b:A	(Ljava/lang/String;)Ljava/lang/String;
    //   6: astore_2
    //   7: aload_0
    //   8: invokestatic 54	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   11: ifeq +9 -> 20
    //   14: lconst_0
    //   15: lstore 12
    //   17: lload 12
    //   19: lreturn
    //   20: iconst_1
    //   21: anewarray 56	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: ldc 58
    //   28: aastore
    //   29: astore_3
    //   30: iconst_1
    //   31: anewarray 56	java/lang/String
    //   34: dup
    //   35: iconst_0
    //   36: aload_2
    //   37: aastore
    //   38: astore 4
    //   40: invokestatic 25	com/wandoujia/clean/db/h:a	()Lcom/wandoujia/clean/db/h;
    //   43: invokevirtual 62	com/wandoujia/clean/db/h:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   46: ldc 64
    //   48: aload_3
    //   49: ldc 66
    //   51: aload 4
    //   53: aconst_null
    //   54: aconst_null
    //   55: ldc 68
    //   57: ldc 70
    //   59: invokevirtual 76	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore 8
    //   64: aload 8
    //   66: ifnull +42 -> 108
    //   69: aload 8
    //   71: invokeinterface 82 1 0
    //   76: ifeq +32 -> 108
    //   79: aload 8
    //   81: iconst_0
    //   82: invokeinterface 86 2 0
    //   87: lstore 10
    //   89: lload 10
    //   91: lstore 12
    //   93: aload 8
    //   95: ifnull -78 -> 17
    //   98: aload 8
    //   100: invokeinterface 89 1 0
    //   105: lload 12
    //   107: lreturn
    //   108: aload 8
    //   110: ifnull +10 -> 120
    //   113: aload 8
    //   115: invokeinterface 89 1 0
    //   120: lconst_0
    //   121: lreturn
    //   122: astore 6
    //   124: aconst_null
    //   125: astore 7
    //   127: aload 7
    //   129: ifnull -9 -> 120
    //   132: aload 7
    //   134: invokeinterface 89 1 0
    //   139: goto -19 -> 120
    //   142: astore 5
    //   144: aload_1
    //   145: ifnull +9 -> 154
    //   148: aload_1
    //   149: invokeinterface 89 1 0
    //   154: aload 5
    //   156: athrow
    //   157: astore 5
    //   159: aload 8
    //   161: astore_1
    //   162: goto -18 -> 144
    //   165: astore 9
    //   167: aload 8
    //   169: astore 7
    //   171: goto -44 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   40	64	122	java/lang/Exception
    //   40	64	142	finally
    //   69	89	157	finally
    //   69	89	165	java/lang/Exception
  }

  public static boolean a(List<GarbageBean> paramList)
  {
    return b.a(paramList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.c
 * JD-Core Version:    0.6.0
 */