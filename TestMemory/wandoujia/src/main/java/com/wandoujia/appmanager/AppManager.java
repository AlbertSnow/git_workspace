package com.wandoujia.appmanager;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.wandoujia.appmanager.config.Config;
import com.wandoujia.appmanager.model.LocalAppsInfo;
import com.wandoujia.appmanager.model.MarketAppInfo;
import com.wandoujia.appmanager.model.MarketAppInfo.NotRecommendReason;
import com.wandoujia.appmanager.model.UpdateMarketApps;
import com.wandoujia.appmanager.model.UpgradeLocalAppInfo;
import com.wandoujia.base.utils.AppUtils;
import com.wandoujia.base.utils.DigestUtils;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.Phoenix2Util;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.rpc.http.client.DataApi;
import com.wandoujia.rpc.http.exception.HttpExceptionUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.List<Landroid.content.pm.PackageInfo;>;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class AppManager
{
  private static AppManager a;
  private static Context b;
  private static ExecutorService c;
  private static Field d;
  private static String e;
  private final ai f = new ai(b);
  private final List<WeakReference<LocalAppChangedListener>> g = new LinkedList();
  private final Handler h = new Handler(Looper.getMainLooper());
  private final byte[] i = new byte[0];
  private final Map<String, LocalAppInfo> j = new HashMap();
  private final Map<String, LocalAppInfo> k = new HashMap();
  private boolean l;
  private volatile boolean m;
  private final Map<String, AppManager.AppState> n = new HashMap();
  private final ThreadLocal<Integer> o = new ThreadLocal();
  private final BroadcastReceiver p = new AppManager.1(this);
  private final ah q = new ah(this);
  private boolean r = false;

  static
  {
    AppManager.class.getSimpleName();
  }

  private static int a(PackageInfo paramPackageInfo)
  {
    if (SystemUtil.getApiLevel() < 8);
    while (true)
    {
      return 1;
      try
      {
        Field localField = p();
        if (localField == null)
          continue;
        int i1 = localField.getInt(paramPackageInfo);
        return i1;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        return 1;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
      }
    }
    return 1;
  }

  private static int a(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    int i1 = paramPackageInfo.versionCode;
    try
    {
      String str = paramPackageInfo.applicationInfo.sourceDir;
      if (!new File(str).exists())
        return i1;
      int i2 = paramPackageManager.getPackageArchiveInfo(str, 0).versionCode;
      return i2;
    }
    catch (Exception localException)
    {
    }
    return i1;
  }

  public static PackageInfo a(Context paramContext, String paramString, int paramInt)
  {
    int i1 = 0;
    while (true)
      if (i1 < 3)
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        try
        {
          PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramString, paramInt);
          return localPackageInfo;
        }
        catch (RuntimeException localRuntimeException)
        {
          i1++;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
        }
      }
    return null;
  }

  public static AppManager a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new AppManager();
      AppManager localAppManager = a;
      return localAppManager;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static LocalAppInfo.UpgradeInfo a(MarketAppInfo paramMarketAppInfo)
  {
    LocalAppInfo.UpgradeInfo localUpgradeInfo = new LocalAppInfo.UpgradeInfo();
    localUpgradeInfo.fullUrl = paramMarketAppInfo.getDownloadUrl();
    localUpgradeInfo.detailUrl = paramMarketAppInfo.getDetailUrl();
    try
    {
      localUpgradeInfo.downloadCount = Integer.parseInt(paramMarketAppInfo.getDownloadCount());
      localUpgradeInfo.versionCode = Integer.parseInt(paramMarketAppInfo.getVersionCode());
      localUpgradeInfo.fullSize = Long.parseLong(paramMarketAppInfo.getSize());
      label57: localUpgradeInfo.versionName = paramMarketAppInfo.getVersionName();
      localUpgradeInfo.changeLog = paramMarketAppInfo.getChangeLog();
      localUpgradeInfo.fullMD5 = paramMarketAppInfo.getFileMd5();
      localUpgradeInfo.recommendedType = paramMarketAppInfo.getRecommendedType();
      localUpgradeInfo.notRecommendReason = paramMarketAppInfo.getNotRecommendReason();
      localUpgradeInfo.superior = paramMarketAppInfo.isSuperior();
      localUpgradeInfo.market = paramMarketAppInfo.getMarket();
      localUpgradeInfo.lastModified = paramMarketAppInfo.getLastModified();
      localUpgradeInfo.lastModifiedTime = paramMarketAppInfo.getLastModifiedTime();
      localUpgradeInfo.importantUpdate = paramMarketAppInfo.getImportantUpdate();
      localUpgradeInfo.notificationModel = paramMarketAppInfo.getNotificationModel();
      localUpgradeInfo.importantLevel = paramMarketAppInfo.getImportantLevel();
      if (paramMarketAppInfo.isHasPatch())
      {
        localUpgradeInfo.hasPatch = true;
        localUpgradeInfo.patchUrl = paramMarketAppInfo.getPatchURL();
        localUpgradeInfo.patchMD5 = paramMarketAppInfo.getPatchMd5();
        localUpgradeInfo.patchSize = paramMarketAppInfo.getPatchSize();
      }
      return localUpgradeInfo;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      break label57;
    }
  }

  private static LocalAppInfo a(PackageInfo paramPackageInfo, Map<String, LocalAppInfo> paramMap, Map<String, String> paramMap1, Map<String, String> paramMap2, Set<String> paramSet)
  {
    PackageManager localPackageManager = b.getPackageManager();
    if ((paramPackageInfo == null) || (paramPackageInfo.applicationInfo == null) || (TextUtils.isEmpty(paramPackageInfo.applicationInfo.sourceDir)))
      return null;
    File localFile = new File(paramPackageInfo.applicationInfo.sourceDir);
    if (!localFile.exists())
      return null;
    LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)paramMap.get(paramPackageInfo.packageName);
    LocalAppInfo localLocalAppInfo2 = new LocalAppInfo();
    localLocalAppInfo2.size = localFile.length();
    if ((localLocalAppInfo1 != null) && (localLocalAppInfo1.getVersionCode() == paramPackageInfo.versionCode) && (!TextUtils.isEmpty(localLocalAppInfo1.getTitle())))
      localLocalAppInfo2.title = localLocalAppInfo1.getTitle();
    while (true)
    {
      if ((localLocalAppInfo1 != null) && (!TextUtils.isEmpty(localLocalAppInfo1.getTitlePinyinFirstChar())) && (TextUtils.equals(localLocalAppInfo2.title, localLocalAppInfo1.title)))
      {
        localLocalAppInfo2.titlePinyinFirstChar = localLocalAppInfo1.getTitlePinyinFirstChar();
        label174: if ((localLocalAppInfo1 == null) || (localLocalAppInfo1.getSize() != localFile.length()) || (localLocalAppInfo1.getVersionCode() != paramPackageInfo.versionCode) || (TextUtils.isEmpty(localLocalAppInfo1.getMD5())))
          break label663;
        localLocalAppInfo2.md5 = localLocalAppInfo1.getMD5();
        label226: if ((localLocalAppInfo1 != null) && (localLocalAppInfo1.getSize() == localFile.length()) && (localLocalAppInfo1.getVersionCode() == paramPackageInfo.versionCode) && (localLocalAppInfo1.getUpgradeInfo() != null))
          localLocalAppInfo2.upgradeInfo = localLocalAppInfo1.getUpgradeInfo();
        localLocalAppInfo2.isUpgradeIgnored = paramSet.contains(paramPackageInfo.packageName);
        localLocalAppInfo2.sourceDir = paramPackageInfo.applicationInfo.sourceDir;
        localLocalAppInfo2.dataDir = paramPackageInfo.applicationInfo.dataDir;
        localLocalAppInfo2.versionCode = a(localPackageManager, paramPackageInfo);
        localLocalAppInfo2.versionName = paramPackageInfo.versionName;
        localLocalAppInfo2.packageName = paramPackageInfo.packageName;
        if (Build.VERSION.SDK_INT < 11);
      }
      try
      {
        String str3 = localPackageManager.getInstallerPackageName(paramPackageInfo.packageName);
        str2 = str3;
        label383: boolean bool1;
        label425: boolean bool2;
        label449: int i1;
        label496: boolean bool4;
        if (TextUtils.isEmpty(str2))
        {
          localLocalAppInfo2.packageInstaller = "null";
          if (Build.VERSION.SDK_INT >= 9)
          {
            localLocalAppInfo2.lastUpdateTime = paramPackageInfo.lastUpdateTime;
            localLocalAppInfo2.firstInstallTime = paramPackageInfo.firstInstallTime;
          }
          if ((0x1 & paramPackageInfo.applicationInfo.flags) != 1)
            break label694;
          bool1 = true;
          localLocalAppInfo2.isSystemApp = bool1;
          if ((0x40000 & paramPackageInfo.applicationInfo.flags) != 0)
            break label700;
          bool2 = true;
          localLocalAppInfo2.isInstalledInternal = bool2;
          i1 = a(paramPackageInfo);
          switch (i1)
          {
          default:
            localLocalAppInfo2.preferredInstallLocation = LocalAppInfo.PreferredInstallLocation.AUTO;
            if ((0x40000 & paramPackageInfo.applicationInfo.flags) == 0)
              break;
            bool4 = true;
          case 1:
          case 2:
          }
        }
        while (true)
        {
          label513: localLocalAppInfo2.isMovable = bool4;
          StringBuilder localStringBuilder = new StringBuilder();
          int i4 = 0;
          while (true)
            if ((paramPackageInfo.signatures != null) && (i4 < paramPackageInfo.signatures.length))
            {
              String str1 = DigestUtils.computeMd5forPkg(paramPackageInfo.signatures[i4].toByteArray());
              if (str1 != null)
              {
                if (i4 == 0)
                  localLocalAppInfo2.signature = str1;
                localStringBuilder.append(str1);
                if (i4 < -1 + paramPackageInfo.signatures.length)
                  localStringBuilder.append(',');
              }
              i4++;
              continue;
              localLocalAppInfo2.title = ((String)paramMap2.get(paramPackageInfo.packageName));
              break;
              if (TextUtils.isEmpty(localLocalAppInfo2.title))
                break label174;
              localLocalAppInfo2.titlePinyinFirstChar = AppUtils.convertFirstCharToPinyin(localLocalAppInfo2.title);
              break label174;
              label663: localLocalAppInfo2.md5 = ((String)paramMap1.get(paramPackageInfo.packageName));
              break label226;
              localLocalAppInfo2.packageInstaller = str2;
              break label383;
              label694: bool1 = false;
              break label425;
              label700: bool2 = false;
              break label449;
              localLocalAppInfo2.preferredInstallLocation = LocalAppInfo.PreferredInstallLocation.INTERNAL;
              break label496;
              localLocalAppInfo2.preferredInstallLocation = LocalAppInfo.PreferredInstallLocation.EXTERNAL;
              break label496;
              boolean bool3 = localFile.canRead();
              bool4 = false;
              if (!bool3)
                break label513;
              int i2 = 0x20000000 & paramPackageInfo.applicationInfo.flags;
              bool4 = false;
              if (i2 != 0)
                break label513;
              int i3 = 0x1 & paramPackageInfo.applicationInfo.flags;
              bool4 = false;
              if (i3 != 0)
                break label513;
              if (i1 != 0)
              {
                bool4 = false;
                if (i1 != 2)
                  break label513;
              }
              if (Build.VERSION.SDK_INT < 9);
            }
          try
          {
            boolean bool5 = Environment.isExternalStorageRemovable();
            bool4 = bool5;
            continue;
            bool4 = true;
            continue;
            localLocalAppInfo2.allSignatures = localStringBuilder.toString();
            return localLocalAppInfo2;
          }
          catch (Exception localException)
          {
            bool4 = false;
          }
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
          String str2 = null;
      }
    }
  }

  public static String a(String paramString)
  {
    if ((paramString == null) || (!paramString.endsWith(".patch")))
      return null;
    int i1 = paramString.lastIndexOf("/");
    if (i1 >= 0)
      paramString = paramString.substring(i1 + 1);
    return e + paramString.substring(0, -6 + paramString.length()) + ".apk";
  }

  public static void a(Context paramContext, ExecutorService paramExecutorService, com.wandoujia.appmanager.config.a parama)
  {
    b = paramContext.getApplicationContext();
    c = paramExecutorService;
    a.a(parama);
    String str = parama.b();
    e = str;
    if (!str.endsWith("/"))
      e += "/";
    af.a(paramContext);
  }

  private void a(ae paramae)
  {
    while (true)
    {
      Iterator localIterator;
      synchronized (this.g)
      {
        localIterator = this.g.iterator();
        if (!localIterator.hasNext())
          break;
        LocalAppChangedListener localLocalAppChangedListener = (LocalAppChangedListener)((WeakReference)localIterator.next()).get();
        if (localLocalAppChangedListener != null)
          this.h.post(new z(paramae, localLocalAppChangedListener));
      }
      localIterator.remove();
    }
    monitorexit;
  }

  private static void a(Collection<LocalAppInfo> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
      c.execute(new p(paramCollection));
  }

  private static void a(List<MarketAppInfo> paramList, boolean paramBoolean)
  {
    if (paramList == null)
      return;
    int i1 = 0;
    label7: if (i1 < paramList.size())
    {
      if (!paramBoolean)
        break label43;
      ((MarketAppInfo)paramList.get(i1)).setIndex(2147483647);
    }
    while (true)
    {
      i1++;
      break label7;
      break;
      label43: ((MarketAppInfo)paramList.get(i1)).setIndex(i1);
    }
  }

  public static void b(String paramString)
  {
    Intent localIntent = c(paramString);
    if (localIntent == null)
      return;
    try
    {
      b.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void b(List<MarketAppInfo> paramList, boolean paramBoolean)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      MarketAppInfo localMarketAppInfo = (MarketAppInfo)localIterator.next();
      if ((localMarketAppInfo == null) || (TextUtils.isEmpty(localMarketAppInfo.getRecommendedType())))
      {
        localIterator.remove();
        continue;
      }
      if (!"NOT_RECOMMEND".equals(localMarketAppInfo.getRecommendedType()))
        continue;
      MarketAppInfo.NotRecommendReason localNotRecommendReason = localMarketAppInfo.getNotRecommendReason();
      if ((localNotRecommendReason == null) || (TextUtils.isEmpty(localNotRecommendReason.getType())) || (TextUtils.isEmpty(localNotRecommendReason.getDescription())))
      {
        localIterator.remove();
        continue;
      }
      if ((!localNotRecommendReason.isSignatureMatch()) && (paramBoolean))
      {
        localIterator.remove();
        continue;
      }
      LocalAppInfo localLocalAppInfo = a().f(localMarketAppInfo.getPackageName());
      if (localLocalAppInfo == null)
        continue;
      localLocalAppInfo.getSignature();
      "SIGNATURE_NOT_OFFICIAL".equals(localNotRecommendReason.getType());
    }
  }

  public static Intent c(String paramString)
  {
    if ((b == null) || (TextUtils.isEmpty(paramString)))
      return null;
    PackageManager localPackageManager = b.getPackageManager();
    if (localPackageManager == null)
      return null;
    Intent localIntent2;
    try
    {
      Intent localIntent3 = localPackageManager.getLaunchIntentForPackage(paramString);
      if (localIntent3 != null)
      {
        localIntent3.setFlags(270532608);
        return localIntent3;
      }
    }
    catch (RuntimeException localRuntimeException1)
    {
      Intent localIntent1 = new Intent("android.intent.action.MAIN");
      localIntent1.addCategory("android.intent.category.HOME");
      localIntent1.setPackage(paramString);
      List localList;
      try
      {
        localList = localPackageManager.queryIntentActivities(localIntent1, 0);
        if ((localList == null) || (localList.isEmpty()))
          return null;
      }
      catch (RuntimeException localRuntimeException2)
      {
        return null;
      }
      ResolveInfo localResolveInfo = (ResolveInfo)localList.iterator().next();
      if (localResolveInfo == null)
        return null;
      String str1 = localResolveInfo.activityInfo.packageName;
      String str2 = localResolveInfo.activityInfo.name;
      localIntent2 = new Intent("android.intent.action.MAIN");
      localIntent2.addCategory("android.intent.category.HOME");
      localIntent2.setFlags(270532608);
      localIntent2.setComponent(new ComponentName(str1, str2));
    }
    return localIntent2;
  }

  private void c(String paramString, boolean paramBoolean)
  {
    c.execute(new aa(this, paramString, paramBoolean));
  }

  // ERROR //
  private void c(List<String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 751	com/wandoujia/appmanager/AppManager:l	Z
    //   6: ifeq +16 -> 22
    //   9: aload_1
    //   10: ifnull +145 -> 155
    //   13: aload_1
    //   14: invokeinterface 718 1 0
    //   19: ifne +136 -> 155
    //   22: getstatic 545	com/wandoujia/appmanager/AppManager:c	Ljava/util/concurrent/ExecutorService;
    //   25: new 753	com/wandoujia/appmanager/k
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 755	com/wandoujia/appmanager/k:<init>	(Ljava/util/List;)V
    //   33: invokeinterface 759 2 0
    //   38: astore_3
    //   39: aload_1
    //   40: ifnull +12 -> 52
    //   43: aload_1
    //   44: invokeinterface 718 1 0
    //   49: ifeq +74 -> 123
    //   52: invokestatic 762	com/wandoujia/appmanager/af:a	()Lcom/wandoujia/appmanager/af;
    //   55: invokevirtual 765	com/wandoujia/appmanager/af:c	()Ljava/util/List;
    //   58: astore 4
    //   60: new 68	java/util/HashMap
    //   63: dup
    //   64: invokespecial 69	java/util/HashMap:<init>	()V
    //   67: astore 5
    //   69: aload 4
    //   71: invokeinterface 602 1 0
    //   76: astore 6
    //   78: aload 6
    //   80: invokeinterface 607 1 0
    //   85: ifeq +54 -> 139
    //   88: aload 6
    //   90: invokeinterface 611 1 0
    //   95: checkcast 349	com/wandoujia/appmanager/LocalAppInfo
    //   98: astore 60
    //   100: aload 5
    //   102: aload 60
    //   104: invokevirtual 766	com/wandoujia/appmanager/LocalAppInfo:getPackageName	()Ljava/lang/String;
    //   107: aload 60
    //   109: invokeinterface 770 3 0
    //   114: pop
    //   115: goto -37 -> 78
    //   118: astore_2
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_2
    //   122: athrow
    //   123: invokestatic 762	com/wandoujia/appmanager/af:a	()Lcom/wandoujia/appmanager/af;
    //   126: aload_1
    //   127: invokevirtual 772	com/wandoujia/appmanager/af:a	(Ljava/util/List;)Ljava/util/List;
    //   130: astore 62
    //   132: aload 62
    //   134: astore 4
    //   136: goto -76 -> 60
    //   139: aload_3
    //   140: invokeinterface 775 1 0
    //   145: checkcast 598	java/util/List
    //   148: astore 9
    //   150: aload 9
    //   152: ifnonnull +6 -> 158
    //   155: aload_0
    //   156: monitorexit
    //   157: return
    //   158: aload 9
    //   160: invokeinterface 602 1 0
    //   165: astore 10
    //   167: aload 10
    //   169: invokeinterface 607 1 0
    //   174: ifeq +50 -> 224
    //   177: aload 10
    //   179: invokeinterface 611 1 0
    //   184: checkcast 133	android/content/pm/PackageInfo
    //   187: astore 59
    //   189: aload 59
    //   191: getfield 341	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   194: invokestatic 780	com/wandoujia/base/utils/Phoenix2Util:isPhoenix2	(Ljava/lang/String;)Z
    //   197: ifne +17 -> 214
    //   200: aload 59
    //   202: getfield 341	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   205: ldc_w 782
    //   208: invokestatic 371	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   211: ifeq -44 -> 167
    //   214: aload 10
    //   216: invokeinterface 629 1 0
    //   221: goto -54 -> 167
    //   224: aconst_null
    //   225: astore 11
    //   227: new 68	java/util/HashMap
    //   230: dup
    //   231: invokespecial 69	java/util/HashMap:<init>	()V
    //   234: astore 12
    //   236: new 96	java/util/LinkedList
    //   239: dup
    //   240: invokespecial 97	java/util/LinkedList:<init>	()V
    //   243: astore 13
    //   245: aload 9
    //   247: invokeinterface 602 1 0
    //   252: astore 14
    //   254: aload 14
    //   256: invokeinterface 607 1 0
    //   261: ifeq +179 -> 440
    //   264: aload 14
    //   266: invokeinterface 611 1 0
    //   271: checkcast 133	android/content/pm/PackageInfo
    //   274: astore 52
    //   276: aload 52
    //   278: ifnull -24 -> 254
    //   281: aload 52
    //   283: getfield 141	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   286: ifnull -32 -> 254
    //   289: aload 52
    //   291: getfield 141	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   294: getfield 146	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   297: invokestatic 338	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   300: ifne -46 -> 254
    //   303: new 148	java/io/File
    //   306: dup
    //   307: aload 52
    //   309: getfield 141	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   312: getfield 146	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   315: invokespecial 151	java/io/File:<init>	(Ljava/lang/String;)V
    //   318: astore 53
    //   320: aload 53
    //   322: invokevirtual 155	java/io/File:exists	()Z
    //   325: ifeq -71 -> 254
    //   328: aload 5
    //   330: aload 52
    //   332: getfield 341	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   335: invokeinterface 347 2 0
    //   340: checkcast 349	com/wandoujia/appmanager/LocalAppInfo
    //   343: astore 54
    //   345: aload 54
    //   347: ifnull +775 -> 1122
    //   350: aload 54
    //   352: invokevirtual 376	com/wandoujia/appmanager/LocalAppInfo:getSize	()J
    //   355: aload 53
    //   357: invokevirtual 353	java/io/File:length	()J
    //   360: lcmp
    //   361: ifne +761 -> 1122
    //   364: aload 54
    //   366: invokevirtual 358	com/wandoujia/appmanager/LocalAppInfo:getVersionCode	()I
    //   369: aload 52
    //   371: getfield 137	android/content/pm/PackageInfo:versionCode	I
    //   374: if_icmpne +748 -> 1122
    //   377: iconst_1
    //   378: istore 55
    //   380: iload 55
    //   382: ifeq +14 -> 396
    //   385: aload 54
    //   387: invokevirtual 379	com/wandoujia/appmanager/LocalAppInfo:getMD5	()Ljava/lang/String;
    //   390: invokestatic 338	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   393: ifeq +718 -> 1111
    //   396: aload 11
    //   398: ifnonnull +706 -> 1104
    //   401: iconst_1
    //   402: invokestatic 788	java/util/concurrent/Executors:newFixedThreadPool	(I)Ljava/util/concurrent/ExecutorService;
    //   405: astore 56
    //   407: aload 13
    //   409: aload 56
    //   411: new 790	com/wandoujia/appmanager/l
    //   414: dup
    //   415: aload 52
    //   417: aload 12
    //   419: invokespecial 793	com/wandoujia/appmanager/l:<init>	(Landroid/content/pm/PackageInfo;Ljava/util/Map;)V
    //   422: invokeinterface 759 2 0
    //   427: invokeinterface 796 2 0
    //   432: pop
    //   433: aload 56
    //   435: astore 58
    //   437: goto +678 -> 1115
    //   440: new 68	java/util/HashMap
    //   443: dup
    //   444: invokespecial 69	java/util/HashMap:<init>	()V
    //   447: astore 15
    //   449: new 96	java/util/LinkedList
    //   452: dup
    //   453: invokespecial 97	java/util/LinkedList:<init>	()V
    //   456: astore 16
    //   458: aload 9
    //   460: invokeinterface 602 1 0
    //   465: astore 17
    //   467: aload 17
    //   469: invokeinterface 607 1 0
    //   474: ifeq +116 -> 590
    //   477: aload 17
    //   479: invokeinterface 611 1 0
    //   484: checkcast 133	android/content/pm/PackageInfo
    //   487: astore 47
    //   489: aload 5
    //   491: aload 47
    //   493: getfield 341	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   496: invokeinterface 347 2 0
    //   501: checkcast 349	com/wandoujia/appmanager/LocalAppInfo
    //   504: astore 48
    //   506: aload 48
    //   508: ifnull +38 -> 546
    //   511: aload 48
    //   513: invokevirtual 358	com/wandoujia/appmanager/LocalAppInfo:getVersionCode	()I
    //   516: aload 47
    //   518: getfield 137	android/content/pm/PackageInfo:versionCode	I
    //   521: if_icmpne +25 -> 546
    //   524: aload 48
    //   526: invokevirtual 361	com/wandoujia/appmanager/LocalAppInfo:getTitle	()Ljava/lang/String;
    //   529: invokestatic 338	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   532: ifne +14 -> 546
    //   535: aload 48
    //   537: invokevirtual 367	com/wandoujia/appmanager/LocalAppInfo:getTitlePinyinFirstChar	()Ljava/lang/String;
    //   540: invokestatic 338	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   543: ifeq +554 -> 1097
    //   546: aload 11
    //   548: ifnonnull +542 -> 1090
    //   551: iconst_1
    //   552: invokestatic 788	java/util/concurrent/Executors:newFixedThreadPool	(I)Ljava/util/concurrent/ExecutorService;
    //   555: astore 49
    //   557: aload 16
    //   559: aload 49
    //   561: new 798	com/wandoujia/appmanager/m
    //   564: dup
    //   565: aload 47
    //   567: aload 15
    //   569: invokespecial 799	com/wandoujia/appmanager/m:<init>	(Landroid/content/pm/PackageInfo;Ljava/util/Map;)V
    //   572: invokeinterface 759 2 0
    //   577: invokeinterface 796 2 0
    //   582: pop
    //   583: aload 49
    //   585: astore 51
    //   587: goto +541 -> 1128
    //   590: aload 16
    //   592: invokeinterface 602 1 0
    //   597: astore 18
    //   599: aload 18
    //   601: invokeinterface 607 1 0
    //   606: ifeq +31 -> 637
    //   609: aload 18
    //   611: invokeinterface 611 1 0
    //   616: checkcast 774	java/util/concurrent/Future
    //   619: astore 43
    //   621: aload 43
    //   623: invokeinterface 775 1 0
    //   628: pop
    //   629: goto -30 -> 599
    //   632: astore 45
    //   634: goto -35 -> 599
    //   637: aload 13
    //   639: invokeinterface 602 1 0
    //   644: astore 19
    //   646: aload 19
    //   648: invokeinterface 607 1 0
    //   653: ifeq +31 -> 684
    //   656: aload 19
    //   658: invokeinterface 611 1 0
    //   663: checkcast 774	java/util/concurrent/Future
    //   666: astore 39
    //   668: aload 39
    //   670: invokeinterface 775 1 0
    //   675: pop
    //   676: goto -30 -> 646
    //   679: astore 41
    //   681: goto -35 -> 646
    //   684: aload 11
    //   686: ifnull +10 -> 696
    //   689: aload 11
    //   691: invokeinterface 802 1 0
    //   696: invokestatic 762	com/wandoujia/appmanager/af:a	()Lcom/wandoujia/appmanager/af;
    //   699: invokevirtual 805	com/wandoujia/appmanager/af:d	()Ljava/util/Set;
    //   702: astore 20
    //   704: new 807	java/util/LinkedHashMap
    //   707: dup
    //   708: invokespecial 808	java/util/LinkedHashMap:<init>	()V
    //   711: astore 21
    //   713: aload 9
    //   715: invokeinterface 602 1 0
    //   720: astore 22
    //   722: aload 22
    //   724: invokeinterface 607 1 0
    //   729: ifeq +116 -> 845
    //   732: aload 22
    //   734: invokeinterface 611 1 0
    //   739: checkcast 133	android/content/pm/PackageInfo
    //   742: astore 32
    //   744: aload 32
    //   746: aload 5
    //   748: aload 12
    //   750: aload 15
    //   752: aload 20
    //   754: invokestatic 810	com/wandoujia/appmanager/AppManager:a	(Landroid/content/pm/PackageInfo;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lcom/wandoujia/appmanager/LocalAppInfo;
    //   757: astore 33
    //   759: aload 33
    //   761: ifnull -39 -> 722
    //   764: aload 21
    //   766: aload 32
    //   768: getfield 341	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   771: aload 33
    //   773: invokeinterface 770 3 0
    //   778: pop
    //   779: aload_0
    //   780: getfield 66	com/wandoujia/appmanager/AppManager:i	[B
    //   783: astore 35
    //   785: aload 35
    //   787: monitorenter
    //   788: aload 33
    //   790: invokevirtual 813	com/wandoujia/appmanager/LocalAppInfo:isUpgradable	()Z
    //   793: ifeq +34 -> 827
    //   796: aload_0
    //   797: getfield 73	com/wandoujia/appmanager/AppManager:k	Ljava/util/Map;
    //   800: aload 33
    //   802: getfield 410	com/wandoujia/appmanager/LocalAppInfo:packageName	Ljava/lang/String;
    //   805: aload 33
    //   807: invokeinterface 770 3 0
    //   812: pop
    //   813: aload 35
    //   815: monitorexit
    //   816: goto -94 -> 722
    //   819: astore 36
    //   821: aload 35
    //   823: monitorexit
    //   824: aload 36
    //   826: athrow
    //   827: aload_0
    //   828: getfield 73	com/wandoujia/appmanager/AppManager:k	Ljava/util/Map;
    //   831: aload 33
    //   833: getfield 410	com/wandoujia/appmanager/LocalAppInfo:packageName	Ljava/lang/String;
    //   836: invokeinterface 815 2 0
    //   841: pop
    //   842: goto -29 -> 813
    //   845: new 817	java/util/HashSet
    //   848: dup
    //   849: invokespecial 818	java/util/HashSet:<init>	()V
    //   852: astore 23
    //   854: aload 12
    //   856: invokeinterface 821 1 0
    //   861: invokeinterface 822 1 0
    //   866: astore 24
    //   868: aload 24
    //   870: invokeinterface 607 1 0
    //   875: ifeq +48 -> 923
    //   878: aload 21
    //   880: aload 24
    //   882: invokeinterface 611 1 0
    //   887: checkcast 824	java/util/Map$Entry
    //   890: invokeinterface 827 1 0
    //   895: invokeinterface 347 2 0
    //   900: checkcast 349	com/wandoujia/appmanager/LocalAppInfo
    //   903: astore 30
    //   905: aload 30
    //   907: ifnull -39 -> 868
    //   910: aload 23
    //   912: aload 30
    //   914: invokeinterface 828 2 0
    //   919: pop
    //   920: goto -52 -> 868
    //   923: aload 15
    //   925: invokeinterface 821 1 0
    //   930: invokeinterface 822 1 0
    //   935: astore 25
    //   937: aload 25
    //   939: invokeinterface 607 1 0
    //   944: ifeq +48 -> 992
    //   947: aload 21
    //   949: aload 25
    //   951: invokeinterface 611 1 0
    //   956: checkcast 824	java/util/Map$Entry
    //   959: invokeinterface 827 1 0
    //   964: invokeinterface 347 2 0
    //   969: checkcast 349	com/wandoujia/appmanager/LocalAppInfo
    //   972: astore 28
    //   974: aload 28
    //   976: ifnull -39 -> 937
    //   979: aload 23
    //   981: aload 28
    //   983: invokeinterface 828 2 0
    //   988: pop
    //   989: goto -52 -> 937
    //   992: aload 23
    //   994: invokeinterface 829 1 0
    //   999: ifne +8 -> 1007
    //   1002: aload 23
    //   1004: invokestatic 831	com/wandoujia/appmanager/AppManager:a	(Ljava/util/Collection;)V
    //   1007: aload_0
    //   1008: getfield 66	com/wandoujia/appmanager/AppManager:i	[B
    //   1011: astore 26
    //   1013: aload 26
    //   1015: monitorenter
    //   1016: aload_0
    //   1017: getfield 71	com/wandoujia/appmanager/AppManager:j	Ljava/util/Map;
    //   1020: aload 21
    //   1022: invokeinterface 835 2 0
    //   1027: aload 26
    //   1029: monitorexit
    //   1030: aload_1
    //   1031: ifnull +12 -> 1043
    //   1034: aload_1
    //   1035: invokeinterface 718 1 0
    //   1040: ifeq -885 -> 155
    //   1043: aload_0
    //   1044: iconst_1
    //   1045: putfield 751	com/wandoujia/appmanager/AppManager:l	Z
    //   1048: aload_0
    //   1049: new 837	com/wandoujia/appmanager/n
    //   1052: dup
    //   1053: invokespecial 838	com/wandoujia/appmanager/n:<init>	()V
    //   1056: invokespecial 562	com/wandoujia/appmanager/AppManager:a	(Lcom/wandoujia/appmanager/ae;)V
    //   1059: goto -904 -> 155
    //   1062: astore 27
    //   1064: aload 26
    //   1066: monitorexit
    //   1067: aload 27
    //   1069: athrow
    //   1070: astore 44
    //   1072: goto -473 -> 599
    //   1075: astore 40
    //   1077: goto -431 -> 646
    //   1080: astore 8
    //   1082: goto -927 -> 155
    //   1085: astore 7
    //   1087: goto -932 -> 155
    //   1090: aload 11
    //   1092: astore 49
    //   1094: goto -537 -> 557
    //   1097: aload 11
    //   1099: astore 51
    //   1101: goto +27 -> 1128
    //   1104: aload 11
    //   1106: astore 56
    //   1108: goto -701 -> 407
    //   1111: aload 11
    //   1113: astore 58
    //   1115: aload 58
    //   1117: astore 11
    //   1119: goto -865 -> 254
    //   1122: iconst_0
    //   1123: istore 55
    //   1125: goto -745 -> 380
    //   1128: aload 51
    //   1130: astore 11
    //   1132: goto -665 -> 467
    //
    // Exception table:
    //   from	to	target	type
    //   2	9	118	finally
    //   13	22	118	finally
    //   22	39	118	finally
    //   43	52	118	finally
    //   52	60	118	finally
    //   60	78	118	finally
    //   78	115	118	finally
    //   123	132	118	finally
    //   139	150	118	finally
    //   158	167	118	finally
    //   167	214	118	finally
    //   214	221	118	finally
    //   227	254	118	finally
    //   254	276	118	finally
    //   281	345	118	finally
    //   350	377	118	finally
    //   385	396	118	finally
    //   401	407	118	finally
    //   407	433	118	finally
    //   440	467	118	finally
    //   467	506	118	finally
    //   511	546	118	finally
    //   551	557	118	finally
    //   557	583	118	finally
    //   590	599	118	finally
    //   599	621	118	finally
    //   621	629	118	finally
    //   637	646	118	finally
    //   646	668	118	finally
    //   668	676	118	finally
    //   689	696	118	finally
    //   696	722	118	finally
    //   722	759	118	finally
    //   764	788	118	finally
    //   824	827	118	finally
    //   845	868	118	finally
    //   868	905	118	finally
    //   910	920	118	finally
    //   923	937	118	finally
    //   937	974	118	finally
    //   979	989	118	finally
    //   992	1007	118	finally
    //   1007	1016	118	finally
    //   1034	1043	118	finally
    //   1043	1059	118	finally
    //   1067	1070	118	finally
    //   621	629	632	java/lang/InterruptedException
    //   668	676	679	java/lang/InterruptedException
    //   788	813	819	finally
    //   813	816	819	finally
    //   821	824	819	finally
    //   827	842	819	finally
    //   1016	1030	1062	finally
    //   1064	1067	1062	finally
    //   621	629	1070	java/util/concurrent/ExecutionException
    //   668	676	1075	java/util/concurrent/ExecutionException
    //   139	150	1080	java/util/concurrent/ExecutionException
    //   139	150	1085	java/lang/InterruptedException
  }

  private static List<PackageInfo> d(List<String> paramList)
  {
    Object localObject = null;
    PackageManager localPackageManager = b.getPackageManager();
    if ((paramList == null) || (paramList.isEmpty()))
    {
      int i1 = 0;
      while (true)
      {
        if (i1 >= 3)
          break label134;
        try
        {
          List localList = localPackageManager.getInstalledPackages(64);
          localObject = localList;
          i1++;
        }
        catch (RuntimeException localRuntimeException)
        {
          while (true)
            try
            {
              Thread.sleep(2000L);
            }
            catch (InterruptedException localInterruptedException)
            {
            }
        }
      }
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      PackageInfo localPackageInfo = a(b, str, 64);
      if (localPackageInfo == null)
        continue;
      localLinkedList.add(localPackageInfo);
    }
    localObject = localLinkedList;
    label134: if (localObject == null)
      localObject = new LinkedList();
    return (List<PackageInfo>)localObject;
  }

  private boolean e(List<String> paramList)
  {
    if ((OemUtil.isPaid()) && (!OemUtil.isSntpTimeOut()))
      return false;
    while (true)
    {
      try
      {
        Map localMap = f(paramList);
        this.m = true;
        localHashMap1 = new HashMap();
        localHashMap2 = new HashMap();
        synchronized (this.i)
        {
          localLinkedList = new LinkedList();
          if ((paramList != null) && (!paramList.isEmpty()))
            continue;
          localLinkedList.addAll(this.j.values());
          Iterator localIterator1 = localLinkedList.iterator();
          if (!localIterator1.hasNext())
            continue;
          localLocalAppInfo1 = (LocalAppInfo)localIterator1.next();
          localMarketAppInfo = (MarketAppInfo)localMap.get(localLocalAppInfo1.getPackageName());
          if (localMarketAppInfo != null)
            continue;
          if (localLocalAppInfo1.upgradeInfo == null)
            continue;
          LocalAppInfo localLocalAppInfo2 = localLocalAppInfo1.clone();
          localLocalAppInfo2.upgradeInfo = null;
          localHashMap1.put(localLocalAppInfo2.getPackageName(), localLocalAppInfo2);
          localHashMap2.put(localLocalAppInfo2.getPackageName(), new Pair(localLocalAppInfo1.clone(), localLocalAppInfo2));
          this.k.remove(localLocalAppInfo2.packageName);
        }
      }
      catch (ExecutionException localExecutionException)
      {
        HashMap localHashMap1;
        HashMap localHashMap2;
        LinkedList localLinkedList;
        LocalAppInfo localLocalAppInfo1;
        MarketAppInfo localMarketAppInfo;
        if (((paramList != null) && (!paramList.isEmpty())) || (!HttpExceptionUtils.canRetry(localExecutionException)))
          continue;
        Object localObject2 = this.o.get();
        if (localObject2 != null)
          continue;
        int i1 = 0;
        if (i1 >= 2)
          continue;
        try
        {
          Thread.sleep(10000L);
          ThreadLocal localThreadLocal = this.o;
          i1++;
          localThreadLocal.set(Integer.valueOf(i1));
          e(null);
          this.o.remove();
          return false;
          Iterator localIterator2 = paramList.iterator();
          if (!localIterator2.hasNext())
            continue;
          String str = (String)localIterator2.next();
          LocalAppInfo localLocalAppInfo4 = (LocalAppInfo)this.j.get(str);
          if (localLocalAppInfo4 == null)
            continue;
          localLinkedList.add(localLocalAppInfo4);
          continue;
          LocalAppInfo.UpgradeInfo localUpgradeInfo1 = a(localMarketAppInfo);
          LocalAppInfo.UpgradeInfo localUpgradeInfo2 = localLocalAppInfo1.getUpgradeInfo();
          if (localUpgradeInfo2 != null)
            continue;
          i2 = 1;
          if (i2 == 0)
            continue;
          localLocalAppInfo1.setIndex(localMarketAppInfo.getIndex());
          LocalAppInfo localLocalAppInfo3 = localLocalAppInfo1.clone();
          localLocalAppInfo3.upgradeInfo = localUpgradeInfo1;
          localHashMap1.put(localLocalAppInfo3.getPackageName(), localLocalAppInfo3);
          localHashMap2.put(localLocalAppInfo3.getPackageName(), new Pair(localLocalAppInfo1.clone(), localLocalAppInfo3));
          this.k.put(localLocalAppInfo3.packageName, localLocalAppInfo3);
          continue;
          if ((localUpgradeInfo2.getVersionCode() == localUpgradeInfo1.getVersionCode()) && (TextUtils.equals(localUpgradeInfo2.getFullMD5(), localUpgradeInfo1.getFullMD5())) && (TextUtils.equals(localUpgradeInfo2.getMarket(), localUpgradeInfo1.getMarket())) && (localUpgradeInfo2.isSuperior() == localUpgradeInfo1.isSuperior()) && (TextUtils.equals(localUpgradeInfo2.getRecommendedType(), localUpgradeInfo1.getRecommendedType())) && (localUpgradeInfo2.hasPatch() == localUpgradeInfo1.hasPatch()) && (TextUtils.equals(localUpgradeInfo2.getPatchMD5(), localUpgradeInfo1.getPatchMD5())))
          {
            if (localUpgradeInfo2.isImportantUpdate() == localUpgradeInfo1.isImportantUpdate())
              break label729;
            break label723;
            this.j.putAll(localHashMap1);
            monitorexit;
            if (localHashMap1.isEmpty())
              continue;
            a(localHashMap1.values());
            a(new o(localHashMap2));
            this.o.remove();
            return true;
            i1 = ((Integer)this.o.get()).intValue();
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          this.o.set(Integer.valueOf(i1 + 1));
          e(null);
          continue;
        }
      }
      finally
      {
        this.o.remove();
      }
      label723: int i2 = 1;
      continue;
      label729: i2 = 0;
    }
  }

  private Map<String, MarketAppInfo> f(List<String> paramList)
  {
    if (!a.a().c())
      return Collections.emptyMap();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    byte[] arrayOfByte = this.i;
    monitorenter;
    if (paramList != null);
    while (true)
    {
      UpgradeLocalAppInfo localUpgradeLocalAppInfo;
      try
      {
        if (!paramList.isEmpty())
          continue;
        localLinkedList.addAll(this.j.values());
        monitorexit;
        Iterator localIterator1 = localLinkedList.iterator();
        if (!localIterator1.hasNext())
          break;
        LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)localIterator1.next();
        if ((Phoenix2Util.isPhoenix2(localLocalAppInfo1.getPackageName())) || (TextUtils.equals(localLocalAppInfo1.getPackageName(), "com.wandoujia.phoenix2.usbproxy")))
          continue;
        localUpgradeLocalAppInfo = new UpgradeLocalAppInfo();
        localUpgradeLocalAppInfo.setP(localLocalAppInfo1.getPackageName());
        localUpgradeLocalAppInfo.setVc(String.valueOf(localLocalAppInfo1.getVersionCode()));
        localUpgradeLocalAppInfo.setS(localLocalAppInfo1.getSignature());
        localUpgradeLocalAppInfo.setF(localLocalAppInfo1.getMD5());
        localUpgradeLocalAppInfo.setVn(localLocalAppInfo1.getVersionName());
        localUpgradeLocalAppInfo.setFi(Long.valueOf(localLocalAppInfo1.getFirstInstallTime()));
        localUpgradeLocalAppInfo.setLu(Long.valueOf(localLocalAppInfo1.getLastUpdateTime()));
        if (localLocalAppInfo1.isSystemApp())
        {
          localArrayList2.add(localUpgradeLocalAppInfo);
          continue;
          Iterator localIterator4 = paramList.iterator();
          if (!localIterator4.hasNext())
            continue;
          String str = (String)localIterator4.next();
          LocalAppInfo localLocalAppInfo2 = (LocalAppInfo)this.j.get(str);
          if (localLocalAppInfo2 == null)
            continue;
          localLinkedList.add(localLocalAppInfo2);
          continue;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      localArrayList1.add(localUpgradeLocalAppInfo);
    }
    if ((localArrayList1.isEmpty()) && (localArrayList2.isEmpty()))
      return Collections.emptyMap();
    LocalAppsInfo localLocalAppsInfo = new LocalAppsInfo();
    localLocalAppsInfo.setUserApps(localArrayList1);
    localLocalAppsInfo.setSysApps(localArrayList2);
    localLocalAppsInfo.setSdkVersion(Build.VERSION.SDK_INT);
    localLocalAppsInfo.setCpuFamily(SystemUtil.getCpuFamily(b));
    localLocalAppsInfo.setCpuFeatures(SystemUtil.getCpuFeatures(b));
    com.wandoujia.appmanager.a.b localb = new com.wandoujia.appmanager.a.b();
    UpdateMarketApps localUpdateMarketApps;
    HashMap localHashMap;
    try
    {
      ((com.wandoujia.appmanager.a.d)localb.getRequestBuilder()).b(new com.wandoujia.gson.c().a(localLocalAppsInfo));
      localUpdateMarketApps = (UpdateMarketApps)a.a().d().execute(localb);
      localHashMap = new HashMap();
      if (localUpdateMarketApps == null)
        return localHashMap;
    }
    catch (Throwable localThrowable)
    {
      return Collections.emptyMap();
    }
    float f1 = localUpdateMarketApps.pushFrequency;
    SharedPreferences.Editor localEditor1 = Config.a().edit();
    localEditor1.putFloat("upgrade_last_push_frequency", f1);
    SharePrefSubmitor.submit(localEditor1);
    float f2 = localUpdateMarketApps.importantPushFrequency;
    SharedPreferences.Editor localEditor2 = Config.a().edit();
    localEditor2.putFloat("import_upgrade_last_push_frequency", f2);
    SharePrefSubmitor.submit(localEditor2);
    if (localUpdateMarketApps.getUserApps() != null)
    {
      List localList2 = localUpdateMarketApps.getUserApps();
      if (paramList != null);
      for (boolean bool2 = true; ; bool2 = false)
      {
        a(localList2, bool2);
        b(localUpdateMarketApps.getUserApps(), false);
        Iterator localIterator3 = localUpdateMarketApps.getUserApps().iterator();
        while (localIterator3.hasNext())
        {
          MarketAppInfo localMarketAppInfo2 = (MarketAppInfo)localIterator3.next();
          localHashMap.put(localMarketAppInfo2.getPackageName(), localMarketAppInfo2);
        }
      }
    }
    if (localUpdateMarketApps.getSysApps() != null)
    {
      List localList1 = localUpdateMarketApps.getSysApps();
      boolean bool1 = false;
      if (paramList != null)
        bool1 = true;
      a(localList1, bool1);
      b(localUpdateMarketApps.getSysApps(), true);
      Iterator localIterator2 = localUpdateMarketApps.getSysApps().iterator();
      while (localIterator2.hasNext())
      {
        MarketAppInfo localMarketAppInfo1 = (MarketAppInfo)localIterator2.next();
        localHashMap.put(localMarketAppInfo1.getPackageName(), localMarketAppInfo1);
      }
    }
    return localHashMap;
  }

  public static String j(String paramString)
  {
    PackageManager localPackageManager = b.getPackageManager();
    PackageInfo localPackageInfo = localPackageManager.getPackageArchiveInfo(paramString, 0);
    if ((localPackageInfo != null) && (localPackageInfo.applicationInfo != null))
    {
      localPackageInfo.applicationInfo.sourceDir = paramString;
      localPackageInfo.applicationInfo.publicSourceDir = paramString;
      try
      {
        String str = (String)localPackageInfo.applicationInfo.loadLabel(localPackageManager);
        return str;
      }
      catch (Exception localException)
      {
      }
    }
    return "";
  }

  public static float m()
  {
    return Config.a().getFloat("upgrade_last_push_frequency", 0.0F);
  }

  public static float n()
  {
    return Config.a().getFloat("import_upgrade_last_push_frequency", 0.0F);
  }

  private static Field p()
  {
    if (d == null);
    try
    {
      d = PackageInfo.class.getDeclaredField("installLocation");
      label17: return d;
    }
    catch (SecurityException localSecurityException)
    {
      break label17;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label17;
    }
  }

  public final Map<String, LocalAppInfo> a(List<String> paramList)
  {
    LinkedHashMap localLinkedHashMap;
    synchronized (this.i)
    {
      localLinkedHashMap = new LinkedHashMap();
      Iterator localIterator = paramList.iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localLinkedHashMap.put(str, this.j.get(str));
      }
    }
    monitorexit;
    return localLinkedHashMap;
  }

  public final Future<List<LocalAppInfo>> a(Handler[] paramArrayOfHandler)
  {
    return c.submit(new ac(this, paramArrayOfHandler));
  }

  public final void a(LocalAppChangedListener paramLocalAppChangedListener)
  {
    synchronized (this.g)
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        LocalAppChangedListener localLocalAppChangedListener = (LocalAppChangedListener)((WeakReference)localIterator.next()).get();
        if ((localLocalAppChangedListener != null) && (localLocalAppChangedListener.equals(paramLocalAppChangedListener)))
          return;
      }
      this.g.add(new WeakReference(paramLocalAppChangedListener));
      return;
    }
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    this.f.a(paramString, paramBoolean, this.q);
  }

  public final void a(Map<String, String> paramMap)
  {
    HashSet localHashSet;
    synchronized (this.i)
    {
      localHashSet = new HashSet();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)this.j.get(str);
        if (localLocalAppInfo == null)
          continue;
        localLocalAppInfo.md5 = ((String)localEntry.getValue());
        localHashSet.add(localLocalAppInfo);
      }
    }
    a(localHashSet);
    c.execute(new d(this, paramMap));
    monitorexit;
  }

  public final Future<List<LocalAppInfo>> b(Handler[] paramArrayOfHandler)
  {
    return c.submit(new ad(this, paramArrayOfHandler));
  }

  public final void b()
  {
    monitorenter;
    try
    {
      boolean bool = this.r;
      if (bool);
      while (true)
      {
        return;
        this.r = true;
        af.a().b();
        IntentFilter localIntentFilter1 = new IntentFilter("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        a.a().h().registerReceiver(this.p, localIntentFilter1);
        IntentFilter localIntentFilter2 = new IntentFilter();
        localIntentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        localIntentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        localIntentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        localIntentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
        localIntentFilter2.addDataScheme("package");
        a.a().h().registerReceiver(this.p, localIntentFilter2);
        c.execute(new y(this));
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void b(LocalAppChangedListener paramLocalAppChangedListener)
  {
    synchronized (this.g)
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        LocalAppChangedListener localLocalAppChangedListener = (LocalAppChangedListener)((WeakReference)localIterator.next()).get();
        if ((localLocalAppChangedListener == null) || (!localLocalAppChangedListener.equals(paramLocalAppChangedListener)))
          continue;
        localIterator.remove();
        return;
      }
      return;
    }
  }

  public final void b(String paramString, boolean paramBoolean)
  {
    this.f.b(paramString, paramBoolean, this.q);
  }

  public final List<LocalAppInfo> c()
  {
    LinkedList localLinkedList;
    synchronized (this.i)
    {
      localLinkedList = new LinkedList();
      Iterator localIterator = this.j.values().iterator();
      if (localIterator.hasNext())
        localLinkedList.add((LocalAppInfo)localIterator.next());
    }
    monitorexit;
    return localLinkedList;
  }

  public final Future<List<LocalAppInfo>> c(Handler[] paramArrayOfHandler)
  {
    if (!a.a().c())
      return new b();
    return c.submit(new c(this, paramArrayOfHandler));
  }

  public final List<LocalAppInfo> d()
  {
    LinkedList localLinkedList;
    synchronized (this.i)
    {
      localLinkedList = new LinkedList();
      Iterator localIterator = this.j.values().iterator();
      while (localIterator.hasNext())
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
        if (localLocalAppInfo.isSystemApp())
          continue;
        localLinkedList.add(localLocalAppInfo);
      }
    }
    monitorexit;
    return localLinkedList;
  }

  public final void d(String paramString)
  {
    c(paramString, true);
  }

  public final int e()
  {
    byte[] arrayOfByte = this.i;
    monitorenter;
    int i2;
    for (int i1 = 0; ; i1 = i2)
    {
      try
      {
        Iterator localIterator = this.j.values().iterator();
        if (localIterator.hasNext())
        {
          if (!((LocalAppInfo)localIterator.next()).isSystemApp())
          {
            i2 = i1 + 1;
            continue;
          }
        }
        else
          return i1;
      }
      finally
      {
        monitorexit;
      }
      i2 = i1;
    }
  }

  public final void e(String paramString)
  {
    c(paramString, false);
  }

  public final int f()
  {
    synchronized (this.i)
    {
      int i1 = this.j.size();
      return i1;
    }
  }

  public final LocalAppInfo f(String paramString)
  {
    synchronized (this.i)
    {
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)this.j.get(paramString);
      return localLocalAppInfo;
    }
  }

  public final int g()
  {
    byte[] arrayOfByte = this.i;
    monitorenter;
    int i2;
    for (int i1 = 0; ; i1 = i2)
    {
      try
      {
        Iterator localIterator = this.j.values().iterator();
        if (localIterator.hasNext())
        {
          if (((LocalAppInfo)localIterator.next()).isSystemApp())
          {
            i2 = i1 + 1;
            continue;
          }
        }
        else
          return i1;
      }
      finally
      {
        monitorexit;
      }
      i2 = i1;
    }
  }

  public final boolean g(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    LocalAppInfo localLocalAppInfo;
    do
    {
      return false;
      localLocalAppInfo = f(paramString);
    }
    while ((localLocalAppInfo == null) || (!paramString.equals(localLocalAppInfo.getPackageName())) || (!localLocalAppInfo.isUpgradable()));
    return true;
  }

  public final List<LocalAppInfo> h()
  {
    LinkedList localLinkedList = new LinkedList();
    synchronized (this.i)
    {
      Iterator localIterator = this.j.values().iterator();
      while (localIterator.hasNext())
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
        if (!localLocalAppInfo.isSystemApp())
          continue;
        localLinkedList.add(localLocalAppInfo);
      }
    }
    monitorexit;
    return localLinkedList;
  }

  public final boolean h(String paramString)
  {
    synchronized (this.i)
    {
      if (this.j.containsKey(paramString))
        return true;
      if (a(b, paramString, 0) == null)
        return false;
    }
    return true;
  }

  public final AppManager.AppState i(String paramString)
  {
    synchronized (this.n)
    {
      AppManager.AppState localAppState1 = (AppManager.AppState)this.n.get(paramString);
      if (localAppState1 != null)
        return localAppState1;
      synchronized (this.i)
      {
        if (this.j.containsKey(paramString))
        {
          AppManager.AppState localAppState2 = AppManager.AppState.INSTALLED;
          return localAppState2;
        }
      }
    }
    monitorexit;
    return AppManager.AppState.NOT_EXIST;
  }

  public final List<LocalAppInfo> i()
  {
    if (!a.a().c())
      return Collections.EMPTY_LIST;
    if ((OemUtil.isPaid()) && (!OemUtil.isSntpTimeOut()))
      return Collections.EMPTY_LIST;
    synchronized (this.i)
    {
      ArrayList localArrayList = new ArrayList(this.k.values());
      return localArrayList;
    }
  }

  public final int j()
  {
    if (!a.a().c())
      return 0;
    synchronized (this.i)
    {
      int i1 = this.k.size();
      return i1;
    }
  }

  public final List<LocalAppInfo> k()
  {
    LinkedList localLinkedList;
    synchronized (this.i)
    {
      localLinkedList = new LinkedList();
      Iterator localIterator = this.k.values().iterator();
      while (localIterator.hasNext())
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
        if ((!localLocalAppInfo.isUpgradeIgnored()) || (!localLocalAppInfo.isUpgradable()))
          continue;
        localLinkedList.add(localLocalAppInfo);
      }
    }
    monitorexit;
    return localLinkedList;
  }

  public final boolean l()
  {
    if (!this.l)
      c(null);
    return e(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.AppManager
 * JD-Core Version:    0.6.0
 */