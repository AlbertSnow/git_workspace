package com.wandoujia.jupiter.paid.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.SparseArray;
import com.alipay.wandoujia.nd;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.jupiter.paid.model.RecommendAppInfo;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.q;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.i;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static a a;
  private SparseArray b = new SparseArray();

  public static int a(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences(paramString, 0).getInt("showing_type", 0);
  }

  public static String a(String paramString)
  {
    Iterator localIterator = StorageManager.getInstance().getExternalStorageDirectories().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramString.startsWith(str))
        continue;
      paramString = paramString.substring(str.length());
    }
    return paramString;
  }

  public static List<String> a()
  {
    List localList = StorageManager.getInstance().getExternalStorageDirectories();
    if (localList.size() <= 1)
      return localList;
    Collections.sort(localList, new b());
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localList.get(0));
    int i = 1;
    String str;
    if (i < localList.size())
    {
      str = (String)localList.get(i);
      Iterator localIterator = localArrayList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!str.startsWith((String)localIterator.next()));
    }
    for (int j = 0; ; j = 1)
    {
      if (j != 0)
        localArrayList.add(str);
      i++;
      break;
      return localArrayList;
    }
  }

  public static void a(Context paramContext, int paramInt, String paramString)
  {
    paramContext.getSharedPreferences(paramString, 0).edit().putInt("showing_type", paramInt).apply();
  }

  public static void a(RecommendAppInfo paramRecommendAppInfo)
  {
    q localq = new r().e(paramRecommendAppInfo.packageName).b(paramRecommendAppInfo.downloadUrl).a(ContentTypeEnum.ContentType.APP).a(DownloadRequestParam.Type.APP).a(DownloadPackage.VerifyType.MD5).a(paramRecommendAppInfo.md5).g(paramRecommendAppInfo.iconUrl).f(paramRecommendAppInfo.title).a(false).a(paramRecommendAppInfo.size).h(paramRecommendAppInfo.packageName).b();
    ((DownloadManager)i.k().a("download")).a(localq);
  }

  public static void a(String paramString, d paramd)
  {
    if (paramString == null)
      throw new IllegalArgumentException();
    try
    {
      android.support.v4.app.b.a(new c(paramString, paramd), new Void[0]);
      return;
    }
    catch (Exception localException)
    {
      paramd.a(false, null);
    }
  }

  private static boolean a(long paramLong1, long paramLong2)
  {
    return SimpleDateFormat.getDateInstance().format(new Date(paramLong1)).equals(SimpleDateFormat.getDateInstance().format(new Date(paramLong2)));
  }

  public static boolean a(Context paramContext, String paramString, int paramInt)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramString, 0);
    int i = localSharedPreferences.getInt("last_day_show_count", 0);
    long l1 = localSharedPreferences.getLong("last_show_time", 0L);
    long l2 = System.currentTimeMillis();
    Log.d("RecommendUtils", "Read. Today show count: " + i + ", max: " + paramInt + ", SP: " + paramString, new Object[0]);
    boolean bool = a(l2, l1);
    int j = 0;
    if (bool)
    {
      j = 0;
      if (i >= paramInt)
        j = 1;
    }
    return j;
  }

  public static a b()
  {
    if (a == null)
      a = new a();
    return a;
  }

  public static void b(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramString, 0);
    int i = localSharedPreferences.getInt("last_day_show_count", 0);
    long l1 = localSharedPreferences.getLong("last_show_time", 0L);
    long l2 = System.currentTimeMillis();
    if (!a(l1, l2))
      i = 0;
    int j = i + 1;
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putLong("last_show_time", l2);
    localEditor.putInt("last_day_show_count", j);
    localEditor.apply();
    Log.d("RecommendUtils", "Write. Today show count: " + j + ", SP: " + paramString, new Object[0]);
  }

  public static boolean c(Context paramContext, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo2 = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      localPackageInfo1 = localPackageInfo2;
      int i = 0;
      if (localPackageInfo1 != null)
        i = 1;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        PackageInfo localPackageInfo1 = null;
    }
  }

  public final void a(int paramInt)
  {
    nd localnd = (nd)this.b.get(paramInt);
    if (localnd != null)
    {
      localnd.i();
      this.b.remove(paramInt);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.d.a
 * JD-Core Version:    0.6.0
 */