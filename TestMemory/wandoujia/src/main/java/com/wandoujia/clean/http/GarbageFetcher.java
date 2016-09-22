package com.wandoujia.clean.http;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.udid.UDIDUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public final class GarbageFetcher
{
  private static a a;

  private static String a(Context paramContext, String paramString)
  {
    try
    {
      Uri.Builder localBuilder = Uri.parse(paramString).buildUpon();
      localBuilder.appendQueryParameter("f", "phoenix2");
      localBuilder.appendQueryParameter("v", SystemUtil.getVersionName(paramContext));
      localBuilder.appendQueryParameter("vc", SystemUtil.getVersionCode(paramContext));
      localBuilder.appendQueryParameter("u", UDIDUtil.a(paramContext));
      String str1 = Config.b();
      if (!TextUtils.isEmpty(str1))
        localBuilder.appendQueryParameter("ch", str1);
      String str2 = localBuilder.build().toString();
      return str2;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static void a()
  {
    List localList = AppManager.a().c();
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
      localArrayList1.add(new GarbageFetcher.PackageNameParam(b.A(localLocalAppInfo.getPackageName()), com.wandoujia.clean.db.c.a(localLocalAppInfo.getPackageName()), null));
    }
    if (!localArrayList1.isEmpty())
    {
      int i = 1 + localArrayList1.size() / 10;
      for (int j = 0; j < i; j++)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(new BasicNameValuePair("pkgNameMd5s", d.a().a(localArrayList1.subList(j * 10, Math.min(10 * (j + 1), localArrayList1.size())))));
        a(localArrayList2);
      }
    }
  }

  // ERROR //
  private static boolean a(List<org.apache.http.NameValuePair> paramList)
  {
    // Byte code:
    //   0: new 181	org/apache/http/client/methods/HttpPost
    //   3: dup
    //   4: invokestatic 187	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   7: ldc 189
    //   9: invokestatic 191	com/wandoujia/clean/http/GarbageFetcher:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   12: invokespecial 194	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   15: astore_1
    //   16: aload_1
    //   17: new 196	org/apache/http/client/entity/UrlEncodedFormEntity
    //   20: dup
    //   21: aload_0
    //   22: ldc 198
    //   24: invokespecial 201	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   27: invokevirtual 205	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   30: new 207	com/wandoujia/clean/http/f
    //   33: dup
    //   34: invokespecial 208	com/wandoujia/clean/http/f:<init>	()V
    //   37: astore 5
    //   39: aload 5
    //   41: aload_1
    //   42: invokevirtual 211	com/wandoujia/clean/http/f:a	(Lorg/apache/http/client/methods/HttpRequestBase;)V
    //   45: getstatic 213	com/wandoujia/clean/http/GarbageFetcher:a	Lcom/wandoujia/clean/http/a;
    //   48: ifnonnull +124 -> 172
    //   51: new 215	com/wandoujia/clean/http/b
    //   54: dup
    //   55: invokespecial 216	com/wandoujia/clean/http/b:<init>	()V
    //   58: pop
    //   59: invokestatic 219	com/wandoujia/clean/http/Config:d	()Z
    //   62: ifne +199 -> 261
    //   65: new 221	android/os/StatFs
    //   68: dup
    //   69: invokestatic 227	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   72: invokevirtual 232	java/io/File:getPath	()Ljava/lang/String;
    //   75: invokespecial 233	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   78: astore 7
    //   80: aload 7
    //   82: invokevirtual 236	android/os/StatFs:getAvailableBlocks	()I
    //   85: i2l
    //   86: aload 7
    //   88: invokevirtual 239	android/os/StatFs:getBlockSize	()I
    //   91: i2l
    //   92: lmul
    //   93: ldc2_w 240
    //   96: lcmp
    //   97: ifge +158 -> 255
    //   100: ldc 243
    //   102: invokestatic 246	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   105: invokevirtual 251	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifeq +147 -> 255
    //   111: iconst_1
    //   112: istore 8
    //   114: iload 8
    //   116: invokestatic 254	com/wandoujia/clean/http/Config:a	(Z)V
    //   119: iload 8
    //   121: ifeq +178 -> 299
    //   124: invokestatic 257	com/wandoujia/base/utils/SystemUtil:getDeviceExternalCacheDir	()Ljava/io/File;
    //   127: astore 9
    //   129: aload 9
    //   131: ifnull +138 -> 269
    //   134: new 45	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   141: aload 9
    //   143: invokevirtual 260	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   146: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: ldc_w 265
    //   152: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: astore 10
    //   160: new 267	com/wandoujia/clean/http/a
    //   163: dup
    //   164: aload 10
    //   166: invokespecial 268	com/wandoujia/clean/http/a:<init>	(Ljava/lang/String;)V
    //   169: putstatic 213	com/wandoujia/clean/http/GarbageFetcher:a	Lcom/wandoujia/clean/http/a;
    //   172: getstatic 213	com/wandoujia/clean/http/GarbageFetcher:a	Lcom/wandoujia/clean/http/a;
    //   175: aload 5
    //   177: invokevirtual 272	com/wandoujia/clean/http/a:execute	(Lcom/wandoujia/rpc/http/delegate/ApiDelegate;)Ljava/lang/Object;
    //   180: checkcast 274	org/apache/http/HttpResponse
    //   183: astore 11
    //   185: aload 11
    //   187: invokeinterface 278 1 0
    //   192: invokeinterface 283 1 0
    //   197: sipush 200
    //   200: if_icmpne +135 -> 335
    //   203: aload 11
    //   205: invokeinterface 287 1 0
    //   210: invokestatic 292	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   213: astore 12
    //   215: new 294	com/wandoujia/clean/http/c
    //   218: dup
    //   219: invokespecial 295	com/wandoujia/clean/http/c:<init>	()V
    //   222: astore 13
    //   224: invokestatic 150	com/wandoujia/clean/http/d:a	()Lcom/wandoujia/gson/c;
    //   227: aload 12
    //   229: aload 13
    //   231: invokevirtual 301	com/wandoujia/gson/b/a:getType	()Ljava/lang/reflect/Type;
    //   234: invokevirtual 304	com/wandoujia/gson/c:a	(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   237: checkcast 96	java/util/List
    //   240: astore 15
    //   242: aload 15
    //   244: ifnull +9 -> 253
    //   247: aload 15
    //   249: invokestatic 305	com/wandoujia/clean/db/c:a	(Ljava/util/List;)Z
    //   252: pop
    //   253: iconst_1
    //   254: ireturn
    //   255: iconst_0
    //   256: istore 8
    //   258: goto -144 -> 114
    //   261: invokestatic 307	com/wandoujia/clean/http/Config:c	()Z
    //   264: istore 8
    //   266: goto -147 -> 119
    //   269: new 45	java/lang/StringBuilder
    //   272: dup
    //   273: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   276: invokestatic 187	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   279: invokevirtual 312	android/content/Context:getCacheDir	()Ljava/io/File;
    //   282: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   285: ldc_w 265
    //   288: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: astore 10
    //   296: goto -136 -> 160
    //   299: new 45	java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   306: invokestatic 187	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   309: invokevirtual 312	android/content/Context:getCacheDir	()Ljava/io/File;
    //   312: invokevirtual 315	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   315: ldc_w 265
    //   318: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: astore 17
    //   326: aload 17
    //   328: astore 10
    //   330: goto -170 -> 160
    //   333: astore 4
    //   335: iconst_0
    //   336: ireturn
    //   337: astore_3
    //   338: goto -3 -> 335
    //   341: astore_2
    //   342: goto -7 -> 335
    //   345: astore 14
    //   347: goto -12 -> 335
    //
    // Exception table:
    //   from	to	target	type
    //   0	111	333	android/database/sqlite/SQLiteException
    //   114	119	333	android/database/sqlite/SQLiteException
    //   124	129	333	android/database/sqlite/SQLiteException
    //   134	160	333	android/database/sqlite/SQLiteException
    //   160	172	333	android/database/sqlite/SQLiteException
    //   172	224	333	android/database/sqlite/SQLiteException
    //   224	242	333	android/database/sqlite/SQLiteException
    //   247	253	333	android/database/sqlite/SQLiteException
    //   261	266	333	android/database/sqlite/SQLiteException
    //   269	296	333	android/database/sqlite/SQLiteException
    //   299	326	333	android/database/sqlite/SQLiteException
    //   0	111	337	java/io/IOException
    //   114	119	337	java/io/IOException
    //   124	129	337	java/io/IOException
    //   134	160	337	java/io/IOException
    //   160	172	337	java/io/IOException
    //   172	224	337	java/io/IOException
    //   224	242	337	java/io/IOException
    //   247	253	337	java/io/IOException
    //   261	266	337	java/io/IOException
    //   269	296	337	java/io/IOException
    //   299	326	337	java/io/IOException
    //   0	111	341	java/util/concurrent/ExecutionException
    //   114	119	341	java/util/concurrent/ExecutionException
    //   124	129	341	java/util/concurrent/ExecutionException
    //   134	160	341	java/util/concurrent/ExecutionException
    //   160	172	341	java/util/concurrent/ExecutionException
    //   172	224	341	java/util/concurrent/ExecutionException
    //   224	242	341	java/util/concurrent/ExecutionException
    //   247	253	341	java/util/concurrent/ExecutionException
    //   261	266	341	java/util/concurrent/ExecutionException
    //   269	296	341	java/util/concurrent/ExecutionException
    //   299	326	341	java/util/concurrent/ExecutionException
    //   224	242	345	com/wandoujia/gson/JsonSyntaxException
    //   247	253	345	com/wandoujia/gson/JsonSyntaxException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.http.GarbageFetcher
 * JD-Core Version:    0.6.0
 */