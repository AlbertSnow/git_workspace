package com.wandoujia.launcher_base.app_usage_stats;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.wandoujia.launcher_base.utils.e;
import java.util.List;

public class AppStartTimesProvider extends ContentProvider
{
  private static Uri a;
  private static String[] b;
  private static final UriMatcher c;
  private SQLiteOpenHelper d;

  static
  {
    if (!AppStartTimesProvider.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      e = bool;
      a = Uri.parse("content://com.wandoujia.launcher_base.app_usage_stats");
      b = new String[] { "_id" };
      c = new UriMatcher(-1);
      return;
    }
  }

  public AppStartTimesProvider()
  {
    c.addURI("com.wandoujia.launcher_base.app_usage_stats", "detail", 1);
    c.addURI("com.wandoujia.launcher_base.app_usage_stats", "detail/*", 2);
  }

  // ERROR //
  private int a(ContentValues paramContentValues)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnonnull +5 -> 8
    //   6: iconst_0
    //   7: ireturn
    //   8: aload_1
    //   9: ldc 67
    //   11: invokevirtual 73	android/content/ContentValues:containsKey	(Ljava/lang/String;)Z
    //   14: ifeq +12 -> 26
    //   17: aload_1
    //   18: ldc 75
    //   20: invokevirtual 73	android/content/ContentValues:containsKey	(Ljava/lang/String;)Z
    //   23: ifne +5 -> 28
    //   26: iconst_0
    //   27: ireturn
    //   28: iconst_2
    //   29: anewarray 36	java/lang/String
    //   32: astore_3
    //   33: aload_3
    //   34: iconst_0
    //   35: aload_1
    //   36: ldc 67
    //   38: invokevirtual 79	android/content/ContentValues:getAsString	(Ljava/lang/String;)Ljava/lang/String;
    //   41: aastore
    //   42: aload_3
    //   43: iconst_1
    //   44: aload_1
    //   45: ldc 75
    //   47: invokevirtual 79	android/content/ContentValues:getAsString	(Ljava/lang/String;)Ljava/lang/String;
    //   50: aastore
    //   51: aload_0
    //   52: getstatic 34	com/wandoujia/launcher_base/app_usage_stats/AppStartTimesProvider:a	Landroid/net/Uri;
    //   55: invokevirtual 83	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   58: ldc 54
    //   60: invokevirtual 89	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   63: invokevirtual 93	android/net/Uri$Builder:toString	()Ljava/lang/String;
    //   66: invokestatic 32	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   69: getstatic 40	com/wandoujia/launcher_base/app_usage_stats/AppStartTimesProvider:b	[Ljava/lang/String;
    //   72: ldc 95
    //   74: aload_3
    //   75: ldc 97
    //   77: invokevirtual 101	com/wandoujia/launcher_base/app_usage_stats/AppStartTimesProvider:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore 18
    //   82: aload 18
    //   84: ifnull +242 -> 326
    //   87: aload 18
    //   89: invokeinterface 106 1 0
    //   94: ifeq +232 -> 326
    //   97: aload 18
    //   99: iconst_0
    //   100: invokeinterface 110 2 0
    //   105: lstore 20
    //   107: lload 20
    //   109: lstore 7
    //   111: aload 18
    //   113: ifnull +10 -> 123
    //   116: aload 18
    //   118: invokeinterface 113 1 0
    //   123: aload_0
    //   124: getfield 115	com/wandoujia/launcher_base/app_usage_stats/AppStartTimesProvider:d	Landroid/database/sqlite/SQLiteOpenHelper;
    //   127: invokevirtual 121	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   130: astore 9
    //   132: lload 7
    //   134: lconst_0
    //   135: lcmp
    //   136: ifge +55 -> 191
    //   139: aload 9
    //   141: ldc 123
    //   143: aconst_null
    //   144: aload_1
    //   145: invokevirtual 129	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   148: pop2
    //   149: iconst_1
    //   150: ireturn
    //   151: astore 5
    //   153: aconst_null
    //   154: astore 6
    //   156: aload 6
    //   158: ifnull +160 -> 318
    //   161: aload 6
    //   163: invokeinterface 113 1 0
    //   168: ldc2_w 130
    //   171: lstore 7
    //   173: goto -50 -> 123
    //   176: astore 4
    //   178: aload_2
    //   179: ifnull +9 -> 188
    //   182: aload_2
    //   183: invokeinterface 113 1 0
    //   188: aload 4
    //   190: athrow
    //   191: aload_1
    //   192: ldc 75
    //   194: invokevirtual 79	android/content/ContentValues:getAsString	(Ljava/lang/String;)Ljava/lang/String;
    //   197: astore 10
    //   199: aload_1
    //   200: ldc 67
    //   202: invokevirtual 79	android/content/ContentValues:getAsString	(Ljava/lang/String;)Ljava/lang/String;
    //   205: astore 11
    //   207: aload_1
    //   208: ldc 133
    //   210: invokevirtual 137	android/content/ContentValues:getAsLong	(Ljava/lang/String;)Ljava/lang/Long;
    //   213: astore 12
    //   215: aload 12
    //   217: ifnonnull +9 -> 226
    //   220: lconst_0
    //   221: invokestatic 143	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   224: astore 12
    //   226: aload_1
    //   227: ldc 145
    //   229: invokevirtual 149	android/content/ContentValues:getAsInteger	(Ljava/lang/String;)Ljava/lang/Integer;
    //   232: astore 13
    //   234: aload 13
    //   236: ifnonnull +9 -> 245
    //   239: iconst_1
    //   240: invokestatic 154	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   243: astore 13
    //   245: ldc 156
    //   247: iconst_4
    //   248: anewarray 158	java/lang/Object
    //   251: dup
    //   252: iconst_0
    //   253: aload 13
    //   255: aastore
    //   256: dup
    //   257: iconst_1
    //   258: aload 12
    //   260: aastore
    //   261: dup
    //   262: iconst_2
    //   263: aload 11
    //   265: aastore
    //   266: dup
    //   267: iconst_3
    //   268: aload 10
    //   270: aastore
    //   271: invokestatic 162	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   274: astore 14
    //   276: ldc 164
    //   278: aload 14
    //   280: iconst_0
    //   281: anewarray 158	java/lang/Object
    //   284: invokestatic 169	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   287: aload 9
    //   289: aload 14
    //   291: invokevirtual 173	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   294: iconst_1
    //   295: ireturn
    //   296: astore 15
    //   298: goto -4 -> 294
    //   301: astore 4
    //   303: aload 18
    //   305: astore_2
    //   306: goto -128 -> 178
    //   309: astore 19
    //   311: aload 18
    //   313: astore 6
    //   315: goto -159 -> 156
    //   318: ldc2_w 130
    //   321: lstore 7
    //   323: goto -200 -> 123
    //   326: ldc2_w 130
    //   329: lstore 7
    //   331: goto -220 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   51	82	151	java/lang/Exception
    //   51	82	176	finally
    //   287	294	296	android/database/sqlite/SQLiteException
    //   87	107	301	finally
    //   87	107	309	java/lang/Exception
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
    if ((!e) && (localSQLiteDatabase == null))
      throw new AssertionError();
    switch (c.match(paramUri))
    {
    default:
      throw new UnsupportedOperationException("unkown uri: " + paramUri);
    case 1:
    }
    return localSQLiteDatabase.delete("al_app_stat", paramString, paramArrayOfString);
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
    switch (c.match(paramUri))
    {
    default:
      throw new UnsupportedOperationException("unkown uri: " + paramUri);
    case 1:
    }
    long l = localSQLiteDatabase.insert("al_app_stat", null, paramContentValues);
    return Uri.parse(a.buildUpon().appendPath("detail") + "/" + l);
  }

  public boolean onCreate()
  {
    this.d = e.a(getContext());
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    switch (c.match(paramUri))
    {
    default:
      throw new UnsupportedOperationException("unkown uri: " + paramUri);
    case 1:
      localSQLiteQueryBuilder.setTables("al_app_stat");
      if (!TextUtils.isEmpty(paramString2))
        break;
      paramString2 = "duration desc";
    case 2:
    }
    for (String str = paramString2; ; str = paramString2)
    {
      return localSQLiteQueryBuilder.query(this.d.getReadableDatabase(), paramArrayOfString1, paramString1, paramArrayOfString2, null, null, str);
      localSQLiteQueryBuilder.setTables("al_app_stat");
      localSQLiteQueryBuilder.appendWhere("_id='");
      localSQLiteQueryBuilder.appendWhere((String)paramUri.getPathSegments().get(1) + "'");
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    switch (c.match(paramUri))
    {
    default:
      throw new UnsupportedOperationException("unkown uri: " + paramUri);
    case 1:
    }
    return a(paramContentValues);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.app_usage_stats.AppStartTimesProvider
 * JD-Core Version:    0.6.0
 */