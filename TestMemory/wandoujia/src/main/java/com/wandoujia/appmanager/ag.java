package com.wandoujia.appmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

final class ag extends SQLiteOpenHelper
{
  private ag(af paramaf, Context paramContext)
  {
    super(paramContext, "localapps.db", null, 8);
  }

  // ERROR //
  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 27	java/util/HashSet
    //   5: dup
    //   6: invokespecial 30	java/util/HashSet:<init>	()V
    //   9: astore_2
    //   10: getstatic 36	com/wandoujia/appmanager/config/Config$ContentDir:DATA	Lcom/wandoujia/appmanager/config/Config$ContentDir;
    //   13: invokestatic 41	com/wandoujia/appmanager/config/Config:a	(Lcom/wandoujia/appmanager/config/Config$ContentDir;)Ljava/lang/String;
    //   16: astore_3
    //   17: aload_3
    //   18: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   21: ifne +172 -> 193
    //   24: new 49	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   31: aload_3
    //   32: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 56
    //   37: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: astore 4
    //   45: aload 4
    //   47: invokestatic 66	com/wandoujia/base/utils/FileUtil:exists	(Ljava/lang/String;)Z
    //   50: ifeq +69 -> 119
    //   53: new 68	java/io/BufferedReader
    //   56: dup
    //   57: new 70	java/io/FileReader
    //   60: dup
    //   61: aload 4
    //   63: invokespecial 73	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   66: invokespecial 76	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   69: astore 11
    //   71: aload 11
    //   73: invokevirtual 79	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   76: astore 19
    //   78: aload 19
    //   80: ifnull +120 -> 200
    //   83: aload 19
    //   85: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   88: ifne -17 -> 71
    //   91: aload_2
    //   92: aload 19
    //   94: invokeinterface 85 2 0
    //   99: pop
    //   100: goto -29 -> 71
    //   103: astore 16
    //   105: aload 11
    //   107: astore 17
    //   109: aload 17
    //   111: ifnull +8 -> 119
    //   114: aload 17
    //   116: invokevirtual 88	java/io/BufferedReader:close	()V
    //   119: aload_2
    //   120: invokeinterface 92 1 0
    //   125: astore 5
    //   127: aload 5
    //   129: invokeinterface 98 1 0
    //   134: ifeq +120 -> 254
    //   137: aload 5
    //   139: invokeinterface 102 1 0
    //   144: checkcast 104	java/lang/String
    //   147: astore 6
    //   149: aload 6
    //   151: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   154: ifne -27 -> 127
    //   157: new 106	android/content/ContentValues
    //   160: dup
    //   161: invokespecial 107	android/content/ContentValues:<init>	()V
    //   164: astore 7
    //   166: aload 7
    //   168: ldc 109
    //   170: aload 6
    //   172: invokevirtual 113	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: aload_0
    //   176: ldc 115
    //   178: aconst_null
    //   179: aload 7
    //   181: invokevirtual 121	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   184: pop2
    //   185: goto -58 -> 127
    //   188: astore 8
    //   190: goto -63 -> 127
    //   193: ldc 123
    //   195: astore 4
    //   197: goto -152 -> 45
    //   200: aload 11
    //   202: invokevirtual 88	java/io/BufferedReader:close	()V
    //   205: goto -86 -> 119
    //   208: astore 21
    //   210: goto -91 -> 119
    //   213: astore 23
    //   215: aload_1
    //   216: ifnull -97 -> 119
    //   219: aload_1
    //   220: invokevirtual 88	java/io/BufferedReader:close	()V
    //   223: goto -104 -> 119
    //   226: astore 13
    //   228: goto -109 -> 119
    //   231: astore 14
    //   233: aload_1
    //   234: ifnull +7 -> 241
    //   237: aload_1
    //   238: invokevirtual 88	java/io/BufferedReader:close	()V
    //   241: aload 14
    //   243: athrow
    //   244: astore 18
    //   246: goto -127 -> 119
    //   249: astore 15
    //   251: goto -10 -> 241
    //   254: return
    //   255: astore 14
    //   257: aload 11
    //   259: astore_1
    //   260: goto -27 -> 233
    //   263: astore 12
    //   265: aload 11
    //   267: astore_1
    //   268: goto -53 -> 215
    //   271: astore 22
    //   273: aconst_null
    //   274: astore 17
    //   276: goto -167 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   71	78	103	java/io/FileNotFoundException
    //   83	100	103	java/io/FileNotFoundException
    //   175	185	188	android/database/sqlite/SQLiteException
    //   200	205	208	java/io/IOException
    //   53	71	213	java/io/IOException
    //   219	223	226	java/io/IOException
    //   53	71	231	finally
    //   114	119	244	java/io/IOException
    //   237	241	249	java/io/IOException
    //   71	78	255	finally
    //   83	100	255	finally
    //   71	78	263	java/io/IOException
    //   83	100	263	java/io/IOException
    //   53	71	271	java/io/FileNotFoundException
  }

  // ERROR //
  private void b(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 126	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 127	java/util/ArrayList:<init>	()V
    //   9: astore_3
    //   10: aload_1
    //   11: ldc 115
    //   13: aconst_null
    //   14: aconst_null
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: aconst_null
    //   19: invokevirtual 131	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   22: astore 7
    //   24: aload 7
    //   26: astore 5
    //   28: aload 5
    //   30: ifnull +84 -> 114
    //   33: aload 5
    //   35: invokeinterface 136 1 0
    //   40: pop
    //   41: aload 5
    //   43: invokeinterface 139 1 0
    //   48: ifne +66 -> 114
    //   51: ldc 109
    //   53: aload 5
    //   55: invokestatic 144	com/wandoujia/appmanager/af:a	(Ljava/lang/String;Landroid/database/Cursor;)Ljava/lang/String;
    //   58: astore 11
    //   60: aload 11
    //   62: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   65: ifne +12 -> 77
    //   68: aload_3
    //   69: aload 11
    //   71: invokeinterface 147 2 0
    //   76: pop
    //   77: aload 5
    //   79: invokeinterface 150 1 0
    //   84: pop
    //   85: goto -44 -> 41
    //   88: astore 9
    //   90: aload 5
    //   92: ifnull +10 -> 102
    //   95: aload 5
    //   97: invokeinterface 151 1 0
    //   102: aload_0
    //   103: getfield 10	com/wandoujia/appmanager/ag:a	Lcom/wandoujia/appmanager/af;
    //   106: invokestatic 154	com/wandoujia/appmanager/af:a	(Lcom/wandoujia/appmanager/af;)Lcom/wandoujia/shared_storage/AppIgnoreUpdateStorage;
    //   109: aload_3
    //   110: invokevirtual 159	com/wandoujia/shared_storage/AppIgnoreUpdateStorage:a	(Ljava/util/List;)V
    //   113: return
    //   114: aload 5
    //   116: ifnull -14 -> 102
    //   119: aload 5
    //   121: invokeinterface 151 1 0
    //   126: goto -24 -> 102
    //   129: astore 6
    //   131: aload_2
    //   132: ifnull +9 -> 141
    //   135: aload_2
    //   136: invokeinterface 151 1 0
    //   141: aload 6
    //   143: athrow
    //   144: astore 8
    //   146: aload 5
    //   148: astore_2
    //   149: aload 8
    //   151: astore 6
    //   153: goto -22 -> 131
    //   156: astore 4
    //   158: aconst_null
    //   159: astore 5
    //   161: goto -71 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   33	41	88	android/database/sqlite/SQLiteException
    //   41	77	88	android/database/sqlite/SQLiteException
    //   77	85	88	android/database/sqlite/SQLiteException
    //   10	24	129	finally
    //   33	41	144	finally
    //   41	77	144	finally
    //   77	85	144	finally
    //   10	24	156	android/database/sqlite/SQLiteException
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps (packagename TEXT NOT NULL PRIMARY KEY,title TEXT,title_pinyin_first_char TEXT, size INTEGER,md5 TEXT,versioncode INTEGER,upgrade_info TEXT,show_index INTEGER DEFAULT(2147483647))");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ignore_upgrade (packagename TEXT NOT NULL PRIMARY KEY)");
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS apps");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ignore_upgrade");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps (packagename TEXT NOT NULL PRIMARY KEY,title TEXT,title_pinyin_first_char TEXT, size INTEGER,md5 TEXT,versioncode INTEGER,upgrade_info TEXT,show_index INTEGER DEFAULT(2147483647))");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ignore_upgrade (packagename TEXT NOT NULL PRIMARY KEY)");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 1;
    if (i <= paramInt2)
      switch (i)
      {
      case 7:
      default:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 9:
      }
    while (true)
    {
      i++;
      break;
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ignore_upgrade (packagename TEXT NOT NULL PRIMARY KEY)");
      try
      {
        paramSQLiteDatabase.execSQL("INSERT INTO ignore_upgrade SELECT packagename FROM apps WHERE ignored=1");
        label74: paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps (packagename TEXT NOT NULL PRIMARY KEY,title TEXT,size INTEGER,md5 TEXT,versioncode INTEGER)".replace("apps", "apps_backup"));
        try
        {
          paramSQLiteDatabase.execSQL("INSERT INTO " + "apps_backup" + " SELECT packagename,title,md5,size,versioncode FROM apps");
          label113: paramSQLiteDatabase.execSQL("DROP TABLE apps");
          paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps (packagename TEXT NOT NULL PRIMARY KEY,title TEXT,size INTEGER,md5 TEXT,versioncode INTEGER)");
          try
          {
            paramSQLiteDatabase.execSQL("INSERT INTO apps SELECT * FROM " + "apps_backup");
            label146: paramSQLiteDatabase.execSQL("DROP TABLE " + "apps_backup");
            a(paramSQLiteDatabase);
            continue;
            b(paramSQLiteDatabase);
            paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ignore_upgrade");
            continue;
            try
            {
              paramSQLiteDatabase.execSQL("ALTER TABLE apps ADD upgrade_info TEXT");
            }
            catch (SQLiteException localSQLiteException3)
            {
            }
            continue;
            paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS apps");
            paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps (packagename TEXT NOT NULL PRIMARY KEY,title TEXT,title_pinyin_first_char TEXT, size INTEGER,md5 TEXT,versioncode INTEGER,upgrade_info TEXT,show_index INTEGER DEFAULT(2147483647))");
            continue;
            try
            {
              paramSQLiteDatabase.execSQL("ALTER TABLE apps ADD title_pinyin_first_char TEXT");
            }
            catch (SQLiteException localSQLiteException2)
            {
            }
            continue;
            try
            {
              paramSQLiteDatabase.execSQL("ALTER TABLE apps ADD show_index INTEGER DEFAULT(2147483647)");
            }
            catch (SQLiteException localSQLiteException1)
            {
            }
            continue;
            return;
          }
          catch (SQLiteException localSQLiteException6)
          {
            break label146;
          }
        }
        catch (SQLiteException localSQLiteException5)
        {
          break label113;
        }
      }
      catch (SQLiteException localSQLiteException4)
      {
        break label74;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.ag
 * JD-Core Version:    0.6.0
 */