package com.wandoujia.ripple_framework.download.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;

final class q extends SQLiteOpenHelper
{
  q(Context paramContext)
  {
    super(paramContext, a(paramContext), null, 7);
  }

  private static int a(Cursor paramCursor, String paramString, int paramInt)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i < 0)
      return paramInt;
    return paramCursor.getInt(i);
  }

  private static long a(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i < 0)
      return 0L;
    return paramCursor.getLong(i);
  }

  private static DownloadInfo a(Cursor paramCursor)
  {
    int i = 1;
    DownloadInfo localDownloadInfo = new DownloadInfo();
    localDownloadInfo.a = b(paramCursor, "download_id");
    localDownloadInfo.b = b(paramCursor, "identity");
    localDownloadInfo.c = ((DownloadInfo.Status)a(DownloadInfo.Status.class, paramCursor, "status"));
    DownloadRequestParam localDownloadRequestParam = new DownloadRequestParam();
    localDownloadRequestParam.a = ((DownloadRequestParam.Type)a(DownloadRequestParam.Type.class, paramCursor, "download_type"));
    localDownloadRequestParam.b = b(paramCursor, "url");
    localDownloadRequestParam.e = b(paramCursor, "filepath");
    localDownloadRequestParam.f = ((DownloadPackage.VerifyType)a(DownloadPackage.VerifyType.class, paramCursor, "verify_type"));
    localDownloadRequestParam.g = b(paramCursor, "md5");
    DownloadInfo2 localDownloadInfo2 = new DownloadInfo2(localDownloadRequestParam);
    localDownloadInfo2.d = a(paramCursor, "totalBytes");
    localDownloadInfo2.e = a(paramCursor, "currentBytes");
    localDownloadInfo.d = localDownloadInfo2;
    localDownloadInfo.f = b(paramCursor, "title");
    localDownloadInfo.g = b(paramCursor, "icon");
    int j;
    if (a(paramCursor, "isVisible", i) != 0)
    {
      j = i;
      localDownloadInfo.h = j;
      localDownloadInfo.i = a(paramCursor, "lastMod");
      localDownloadInfo.e = ((ContentTypeEnum.ContentType)a(ContentTypeEnum.ContentType.class, paramCursor, "type"));
      localDownloadInfo.m = b(paramCursor, "package_name");
      localDownloadInfo.n = a(paramCursor, "version_code", 0);
      localDownloadInfo.o = b(paramCursor, "extra_id");
      localDownloadInfo.p = b(paramCursor, "extra_type");
      localDownloadInfo.q = b(paramCursor, "extra_data");
      localDownloadInfo.r = b(paramCursor, "start_timestamp");
      if ((0x1 & a(paramCursor, "flag", 0)) <= 0)
        break label301;
    }
    while (true)
    {
      localDownloadInfo.l = i;
      return localDownloadInfo;
      j = 0;
      break;
      label301: i = 0;
    }
  }

  private static <T extends Enum<T>> T a(Class<? extends T> paramClass, Cursor paramCursor, String paramString)
  {
    int i = a(paramCursor, paramString, -1);
    if (i == -1)
      return null;
    return ((Enum[])paramClass.getEnumConstants())[i];
  }

  private static String a(Context paramContext)
  {
    String str1 = SystemUtil.getProcessName(paramContext);
    if (str1.equals(paramContext.getPackageName()))
      return "download_manager.db";
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(str1.getBytes());
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfByte.length; i++)
        localStringBuffer.append(Integer.toHexString(0x100 | 0xFF & arrayOfByte[i]).substring(1, 3));
      String str2 = localStringBuffer.toString() + "_download_manager.db";
      return str2;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return "download_manager.db";
  }

  private static String b(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i < 0)
      return null;
    return paramCursor.getString(i);
  }

  private static ContentValues c(DownloadInfo paramDownloadInfo)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("download_id", paramDownloadInfo.a);
    localContentValues.put("identity", paramDownloadInfo.b);
    localContentValues.put("status", Integer.valueOf(paramDownloadInfo.c.ordinal()));
    if (paramDownloadInfo.d != null)
    {
      localContentValues.put("currentBytes", Long.valueOf(paramDownloadInfo.d.e));
      localContentValues.put("totalBytes", Long.valueOf(paramDownloadInfo.d.d));
      if (paramDownloadInfo.d.a != null)
      {
        localContentValues.put("download_type", Integer.valueOf(paramDownloadInfo.d.a.a.ordinal()));
        localContentValues.put("url", paramDownloadInfo.d.a.b);
        localContentValues.put("filepath", paramDownloadInfo.d.a.e);
        localContentValues.put("verify_type", Integer.valueOf(paramDownloadInfo.d.a.f.ordinal()));
        localContentValues.put("md5", paramDownloadInfo.d.a.g);
      }
    }
    localContentValues.put("title", paramDownloadInfo.f);
    localContentValues.put("isVisible", Boolean.valueOf(paramDownloadInfo.h));
    localContentValues.put("lastMod", Long.valueOf(paramDownloadInfo.i));
    localContentValues.put("icon", paramDownloadInfo.g);
    localContentValues.put("type", Integer.valueOf(paramDownloadInfo.e.ordinal()));
    localContentValues.put("package_name", paramDownloadInfo.m);
    localContentValues.put("version_code", Integer.valueOf(paramDownloadInfo.n));
    localContentValues.put("start_timestamp", paramDownloadInfo.r);
    localContentValues.put("extra_id", paramDownloadInfo.o);
    localContentValues.put("extra_type", paramDownloadInfo.p);
    localContentValues.put("extra_data", paramDownloadInfo.q);
    boolean bool = paramDownloadInfo.l;
    int i = 0;
    if (bool)
      i = 1;
    localContentValues.put("flag", Integer.valueOf(i));
    return localContentValues;
  }

  final long a(DownloadInfo paramDownloadInfo)
  {
    try
    {
      long l = getWritableDatabase().insert("tasks", null, c(paramDownloadInfo));
      return l;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  final long a(String paramString)
  {
    try
    {
      int i = getWritableDatabase().delete("tasks", "download_id=?", new String[] { paramString });
      return i;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  final long a(List<String> paramList)
  {
    try
    {
      String str = TextUtils.join(",", Collections.nCopies(paramList.size(), "?"));
      int i = getWritableDatabase().delete("tasks", "download_id in (" + str + ")", (String[])paramList.toArray(new String[paramList.size()]));
      return i;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  // ERROR //
  final List<DownloadInfo> a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 355	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 356	java/util/ArrayList:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: invokevirtual 359	com/wandoujia/ripple_framework/download/a/q:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 300
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: aconst_null
    //   21: aconst_null
    //   22: ldc_w 361
    //   25: invokevirtual 365	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore 6
    //   30: aload 6
    //   32: astore 4
    //   34: aload 4
    //   36: invokeinterface 369 1 0
    //   41: ifeq +34 -> 75
    //   44: aload_2
    //   45: aload 4
    //   47: invokestatic 371	com/wandoujia/ripple_framework/download/a/q:a	(Landroid/database/Cursor;)Lcom/wandoujia/ripple_framework/download/DownloadInfo;
    //   50: invokeinterface 374 2 0
    //   55: pop
    //   56: goto -22 -> 34
    //   59: astore 8
    //   61: aload 4
    //   63: ifnull +10 -> 73
    //   66: aload 4
    //   68: invokeinterface 377 1 0
    //   73: aload_2
    //   74: areturn
    //   75: aload 4
    //   77: ifnull -4 -> 73
    //   80: aload 4
    //   82: invokeinterface 377 1 0
    //   87: aload_2
    //   88: areturn
    //   89: astore 5
    //   91: aload_1
    //   92: ifnull +9 -> 101
    //   95: aload_1
    //   96: invokeinterface 377 1 0
    //   101: aload 5
    //   103: athrow
    //   104: astore 7
    //   106: aload 4
    //   108: astore_1
    //   109: aload 7
    //   111: astore 5
    //   113: goto -22 -> 91
    //   116: astore_3
    //   117: aconst_null
    //   118: astore 4
    //   120: goto -59 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   34	56	59	java/lang/Exception
    //   10	30	89	finally
    //   34	56	104	finally
    //   10	30	116	java/lang/Exception
  }

  // ERROR //
  final List<DownloadInfo> a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 355	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 356	java/util/ArrayList:<init>	()V
    //   9: astore_3
    //   10: aload_0
    //   11: invokevirtual 359	com/wandoujia/ripple_framework/download/a/q:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 300
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: aconst_null
    //   21: aconst_null
    //   22: ldc_w 380
    //   25: iload_1
    //   26: invokestatic 382	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   29: invokevirtual 385	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore 7
    //   34: aload 7
    //   36: astore 5
    //   38: aload 5
    //   40: invokeinterface 369 1 0
    //   45: ifeq +34 -> 79
    //   48: aload_3
    //   49: aload 5
    //   51: invokestatic 371	com/wandoujia/ripple_framework/download/a/q:a	(Landroid/database/Cursor;)Lcom/wandoujia/ripple_framework/download/DownloadInfo;
    //   54: invokeinterface 374 2 0
    //   59: pop
    //   60: goto -22 -> 38
    //   63: astore 9
    //   65: aload 5
    //   67: ifnull +10 -> 77
    //   70: aload 5
    //   72: invokeinterface 377 1 0
    //   77: aload_3
    //   78: areturn
    //   79: aload 5
    //   81: ifnull -4 -> 77
    //   84: aload 5
    //   86: invokeinterface 377 1 0
    //   91: aload_3
    //   92: areturn
    //   93: astore 6
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 377 1 0
    //   105: aload 6
    //   107: athrow
    //   108: astore 8
    //   110: aload 5
    //   112: astore_2
    //   113: aload 8
    //   115: astore 6
    //   117: goto -22 -> 95
    //   120: astore 4
    //   122: aconst_null
    //   123: astore 5
    //   125: goto -60 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   38	60	63	java/lang/Exception
    //   10	34	93	finally
    //   38	60	108	finally
    //   10	34	120	java/lang/Exception
  }

  final long b(DownloadInfo paramDownloadInfo)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = c(paramDownloadInfo);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramDownloadInfo.a;
      int i = localSQLiteDatabase.update("tasks", localContentValues, "download_id=?", arrayOfString);
      return i;
    }
    catch (Exception localException)
    {
    }
    return -1L;
  }

  // ERROR //
  final List<com.wandoujia.ripple_framework.model.Model> b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 355	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 356	java/util/ArrayList:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: invokevirtual 359	com/wandoujia/ripple_framework/download/a/q:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 300
    //   17: aconst_null
    //   18: ldc_w 391
    //   21: iconst_1
    //   22: anewarray 196	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc_w 393
    //   30: aastore
    //   31: aconst_null
    //   32: aconst_null
    //   33: ldc_w 361
    //   36: invokevirtual 365	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   39: astore 6
    //   41: aload 6
    //   43: astore 4
    //   45: aload 4
    //   47: invokeinterface 369 1 0
    //   52: ifeq +103 -> 155
    //   55: aload 4
    //   57: invokestatic 371	com/wandoujia/ripple_framework/download/a/q:a	(Landroid/database/Cursor;)Lcom/wandoujia/ripple_framework/download/DownloadInfo;
    //   60: astore 9
    //   62: new 395	com/wandoujia/ripple_framework/model/Model
    //   65: dup
    //   66: new 397	com/wandoujia/api/proto/Entity$Builder
    //   69: dup
    //   70: invokespecial 398	com/wandoujia/api/proto/Entity$Builder:<init>	()V
    //   73: aload 9
    //   75: getfield 114	com/wandoujia/ripple_framework/download/DownloadInfo:f	Ljava/lang/String;
    //   78: invokevirtual 401	com/wandoujia/api/proto/Entity$Builder:title	(Ljava/lang/String;)Lcom/wandoujia/api/proto/Entity$Builder;
    //   81: aload 9
    //   83: getfield 117	com/wandoujia/ripple_framework/download/DownloadInfo:g	Ljava/lang/String;
    //   86: invokevirtual 403	com/wandoujia/api/proto/Entity$Builder:icon	(Ljava/lang/String;)Lcom/wandoujia/api/proto/Entity$Builder;
    //   89: aload 9
    //   91: getfield 44	com/wandoujia/ripple_framework/download/DownloadInfo:a	Ljava/lang/String;
    //   94: invokevirtual 406	com/wandoujia/api/proto/Entity$Builder:id_string	(Ljava/lang/String;)Lcom/wandoujia/api/proto/Entity$Builder;
    //   97: getstatic 409	com/wandoujia/api/proto/ContentTypeEnum$ContentType:DOWNLOAD_INFO	Lcom/wandoujia/api/proto/ContentTypeEnum$ContentType;
    //   100: invokevirtual 413	com/wandoujia/api/proto/Entity$Builder:content_type	(Lcom/wandoujia/api/proto/ContentTypeEnum$ContentType;)Lcom/wandoujia/api/proto/Entity$Builder;
    //   103: getstatic 419	com/wandoujia/api/proto/TemplateTypeEnum$TemplateType:DOWNLOAD_ITEM	Lcom/wandoujia/api/proto/TemplateTypeEnum$TemplateType;
    //   106: invokevirtual 423	com/wandoujia/api/proto/Entity$Builder:template_type	(Lcom/wandoujia/api/proto/TemplateTypeEnum$TemplateType;)Lcom/wandoujia/api/proto/Entity$Builder;
    //   109: invokevirtual 427	com/wandoujia/api/proto/Entity$Builder:build	()Lcom/wandoujia/api/proto/Entity;
    //   112: invokespecial 430	com/wandoujia/ripple_framework/model/Model:<init>	(Lcom/wandoujia/api/proto/Entity;)V
    //   115: astore 10
    //   117: aload 10
    //   119: getstatic 435	com/wandoujia/ripple_framework/download/R$id:download_info	I
    //   122: aload 9
    //   124: invokevirtual 438	com/wandoujia/ripple_framework/model/Model:a	(ILjava/lang/Object;)V
    //   127: aload_2
    //   128: aload 10
    //   130: invokeinterface 374 2 0
    //   135: pop
    //   136: goto -91 -> 45
    //   139: astore 8
    //   141: aload 4
    //   143: ifnull +10 -> 153
    //   146: aload 4
    //   148: invokeinterface 377 1 0
    //   153: aload_2
    //   154: areturn
    //   155: aload 4
    //   157: ifnull -4 -> 153
    //   160: aload 4
    //   162: invokeinterface 377 1 0
    //   167: aload_2
    //   168: areturn
    //   169: astore 5
    //   171: aload_1
    //   172: ifnull +9 -> 181
    //   175: aload_1
    //   176: invokeinterface 377 1 0
    //   181: aload 5
    //   183: athrow
    //   184: astore 7
    //   186: aload 4
    //   188: astore_1
    //   189: aload 7
    //   191: astore 5
    //   193: goto -22 -> 171
    //   196: astore_3
    //   197: aconst_null
    //   198: astore 4
    //   200: goto -59 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   45	136	139	java/lang/Exception
    //   10	41	169	finally
    //   45	136	184	finally
    //   10	41	196	java/lang/Exception
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tasks(id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT not null unique, identity TEXT not null, status INTEGER, download_type INTEGER, url TEXT not null, filepath TEXT, verify_type INTEGER, md5 TEXT, totalBytes INTEGER, currentBytes INTEGER, title TEXT, icon TEXT, type INTEGER, isVisible INTEGER, lastMod INTEGER, package_name TEXT, version_code INTEGER, start_timestamp TEXT, extra_id TEXT, extra_type TEXT, extra_data TEXT, flag INTEGER)");
    paramSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_download_id ON tasks(download_id)");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_status ON tasks(status)");
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    super.onDowngrade(paramSQLiteDatabase, paramInt1, paramInt2);
    paramSQLiteDatabase.execSQL("drop table tasks");
    onCreate(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 5)
    {
      paramSQLiteDatabase.execSQL("drop table tasks");
      onCreate(paramSQLiteDatabase);
    }
    do
    {
      return;
      if (paramInt1 > 5)
        continue;
      paramSQLiteDatabase.execSQL("ALTER TABLE tasks ADD flag TEXT");
    }
    while (paramInt1 > 6);
    paramSQLiteDatabase.execSQL("ALTER TABLE tasks ADD start_timestamp INTEGER");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.q
 * JD-Core Version:    0.6.0
 */