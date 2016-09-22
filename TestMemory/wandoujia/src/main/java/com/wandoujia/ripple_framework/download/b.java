package com.wandoujia.ripple_framework.download;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.api.proto.Video;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.FileNameUtil;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.Phoenix2Util;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.logv3.model.packages.DownloadPackage.Status;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.download.a.p;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class b
  implements p
{
  b(DownloadDataList paramDownloadDataList, boolean paramBoolean)
  {
  }

  public static DownloadPackage.Status a(DownloadInfo.Status paramStatus)
  {
    switch (t.b[paramStatus.ordinal()])
    {
    default:
      return DownloadPackage.Status.FAILED;
    case 1:
    case 2:
      return DownloadPackage.Status.PENDING;
    case 3:
      return DownloadPackage.Status.RUNNING;
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
      return DownloadPackage.Status.CANCELED;
    case 9:
    }
    return DownloadPackage.Status.SUCCEED;
  }

  static DownloadInfo a(q paramq, Context paramContext)
  {
    if (GlobalConfig.isDebug())
    {
      if ((paramq.a != null) && (paramq.d != null));
    }
    else
      do
        return null;
      while (paramq.d == null);
    DownloadInfo localDownloadInfo = new DownloadInfo();
    DownloadRequestParam localDownloadRequestParam = new DownloadRequestParam();
    DownloadRequestParam.Type localType;
    String str1;
    label144: String str2;
    if (paramq.a == null)
    {
      localType = DownloadRequestParam.Type.COMMON;
      localDownloadRequestParam.a = localType;
      localDownloadRequestParam.f = paramq.b;
      localDownloadRequestParam.g = paramq.c;
      localDownloadRequestParam.b = paramq.d;
      if (!TextUtils.isEmpty(paramq.f))
        break label410;
      String str4 = paramq.k;
      if (SystemUtil.aboveApiLevel(11))
        str4 = paramq.i;
      str1 = a(str4, paramq.d, null, paramq.m, paramq.o, paramq.r, Config.r());
      localDownloadRequestParam.e = str1;
      localDownloadRequestParam.d = paramq.n;
      localDownloadRequestParam.h.put("download_url_v1", paramq.e);
      DownloadInfo2 localDownloadInfo2 = new DownloadInfo2(localDownloadRequestParam);
      localDownloadInfo2.d = paramq.r;
      localDownloadInfo.a(localDownloadInfo2);
      localDownloadInfo.h = paramq.g;
      if (!TextUtils.isEmpty(paramq.h))
        break label419;
      str2 = paramq.d;
      label223: localDownloadInfo.b = str2;
      String str3 = localDownloadInfo.b;
      localDownloadInfo.a = (str3 + System.currentTimeMillis());
      if ((paramq.s) || (NetworkUtil.isWifiConnected(paramContext)))
        break label428;
      localDownloadInfo.c = DownloadInfo.Status.PAUSED_BY_NETWORK;
      label281: localDownloadInfo.f = paramq.i;
      localDownloadInfo.g = paramq.j;
      if (paramq.m != null)
        break label438;
    }
    label410: label419: label428: label438: for (ContentTypeEnum.ContentType localContentType = ContentTypeEnum.ContentType.NOT_SUPPORT; ; localContentType = paramq.m)
    {
      localDownloadInfo.e = localContentType;
      localDownloadInfo.i = System.currentTimeMillis();
      localDownloadInfo.m = paramq.k;
      localDownloadInfo.n = paramq.l;
      localDownloadInfo.o = null;
      localDownloadInfo.p = paramq.o;
      localDownloadInfo.q = paramq.p;
      localDownloadInfo.j = paramq.s;
      localDownloadInfo.k = paramq.t;
      localDownloadInfo.l = paramq.u;
      localDownloadInfo.r = paramq.q;
      localDownloadInfo.s = paramq.v;
      return localDownloadInfo;
      localType = paramq.a;
      break;
      str1 = paramq.f;
      break label144;
      str2 = paramq.h;
      break label223;
      localDownloadInfo.c = DownloadInfo.Status.CREATED;
      break label281;
    }
  }

  public static q a(Model paramModel, ApkDetail paramApkDetail, ViewLogPackage paramViewLogPackage, boolean paramBoolean)
  {
    r localr = a(paramModel, paramViewLogPackage);
    localr.b(paramApkDetail.download_url.url);
    localr.a(paramApkDetail.md5);
    localr.a(paramApkDetail.version_code.intValue());
    localr.a(DownloadRequestParam.Type.APP);
    localr.a(paramApkDetail.bytes_.intValue());
    localr.j("history_version");
    localr.k(String.valueOf(paramApkDetail.version_code));
    localr.a(paramBoolean);
    return localr.b();
  }

  public static q a(Model paramModel, ExtensionPack paramExtensionPack, DownloadUrl paramDownloadUrl, ViewLogPackage paramViewLogPackage, boolean paramBoolean)
  {
    r localr = a(paramModel, paramViewLogPackage);
    if ((localr == null) || (paramExtensionPack == null))
      return null;
    if (paramDownloadUrl != null)
      localr.b(paramDownloadUrl.url);
    localr.a(DownloadRequestParam.Type.GAME_PACKET);
    localr.a(DownloadPackage.VerifyType.PF5);
    localr.a(paramExtensionPack.pf5);
    localr.j("game_packet");
    localr.k(com.wandoujia.gamepacket.b.a(paramExtensionPack.src_path, paramExtensionPack.dst_path));
    localr.a(paramBoolean);
    return localr.b();
  }

  public static r a(LocalAppInfo.UpgradeInfo paramUpgradeInfo, Model paramModel)
  {
    r localr = new r();
    localr.a(DownloadRequestParam.Type.COMMON);
    localr.a(DownloadPackage.VerifyType.MD5);
    localr.a(paramUpgradeInfo.getPatchMD5());
    localr.b(paramUpgradeInfo.getPatchUrl());
    localr.h(paramModel.F().package_name);
    localr.a(paramUpgradeInfo.getVersionCode());
    localr.a(ContentTypeEnum.ContentType.PATCH);
    localr.a(paramUpgradeInfo.getPatchSize());
    localr.f(paramModel.n());
    localr.g(paramModel.i());
    localr.e(a(paramModel));
    localr.k(paramUpgradeInfo.toJson());
    localr.b(System.currentTimeMillis());
    return localr;
  }

  public static r a(Model paramModel, ViewLogPackage paramViewLogPackage)
  {
    if ((paramModel == null) || (paramModel.f() == null))
      return null;
    r localr = new r();
    switch (t.a[paramModel.f().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localr.e(a(paramModel));
      localr.a(paramViewLogPackage);
      localr.b(System.currentTimeMillis());
      return localr;
      if ((paramModel.F() == null) || (CollectionUtils.isEmpty(paramModel.F().apk)))
        break;
      ApkDetail localApkDetail = (ApkDetail)paramModel.F().apk.get(0);
      localr.a(DownloadRequestParam.Type.APPV2);
      localr.a(DownloadPackage.VerifyType.MD5);
      localr.a(localApkDetail.md5);
      localr.b(new s().a(paramModel.F().package_name).b(paramModel.F().detail_param).a());
      localr.c(localApkDetail.download_url.url);
      localr.h(paramModel.F().package_name);
      localr.a(localApkDetail.version_code.intValue());
      localr.i(Config.a());
      localr.a(ContentTypeEnum.ContentType.APP);
      localr.a(localApkDetail.bytes_.intValue());
      if (!TextUtils.isEmpty(paramModel.F().title))
        localr.f(paramModel.F().title);
      while (true)
      {
        localr.g(paramModel.j());
        break;
        localr.f(paramModel.n());
      }
      if (CollectionUtils.isEmpty(paramModel.y()))
        break;
      localr.a(DownloadRequestParam.Type.COMMON);
      localr.b(((Video)paramModel.y().get(0)).url);
      localr.a(ContentTypeEnum.ContentType.VIDEO);
      localr.f(paramModel.n());
      localr.g(paramModel.i());
    }
  }

  public static String a()
  {
    String str1 = StorageManager.getInstance().getExternalStorageDirectory(-1L);
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      str2 = str1 + "/" + i.k().b() + "/fonts/";
      File localFile = new File(str2);
      if ((localFile.exists()) || (localFile.mkdirs()));
    }
    else
    {
      return null;
    }
    return str2;
  }

  public static String a(ContentTypeEnum.ContentType paramContentType)
  {
    return a(paramContentType, -1L);
  }

  private static String a(ContentTypeEnum.ContentType paramContentType, long paramLong)
  {
    return a(StorageManager.getInstance().getExternalStorageDirectory(paramLong), paramContentType);
  }

  private static String a(ContentTypeEnum.ContentType paramContentType, String paramString)
  {
    switch (ai.a[paramContentType.ordinal()])
    {
    default:
      return "";
    case 1:
      if ("game_packet".equalsIgnoreCase(paramString))
        return ".packet";
      return ".apk";
    case 2:
      return ".patch";
    case 3:
      return ".png";
    case 4:
    }
    return ".mp4";
  }

  public static String a(Model paramModel)
  {
    if ((paramModel == null) || (paramModel.f() == null));
    do
    {
      do
      {
        return null;
        switch (t.a[paramModel.f().ordinal()])
        {
        case 2:
        default:
          return null;
        case 1:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      }
      while (paramModel.F() == null);
      return paramModel.F().package_name;
    }
    while (CollectionUtils.isEmpty(paramModel.y()));
    return ((Video)paramModel.y().get(0)).url;
  }

  public static String a(String paramString, ContentTypeEnum.ContentType paramContentType)
  {
    String str;
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramContentType == null)
        paramContentType = ContentTypeEnum.ContentType.APP;
      str = paramString + "/" + i.k().b() + "/" + paramContentType.name().toLowerCase() + "/";
      File localFile = new File(str);
      if ((localFile.exists()) || (localFile.mkdirs()));
    }
    else
    {
      return null;
    }
    return str;
  }

  private static String a(String paramString1, String paramString2, String paramString3, ContentTypeEnum.ContentType paramContentType, String paramString4, long paramLong, String paramString5)
  {
    if (TextUtils.isEmpty(null))
    {
      if (!TextUtils.isEmpty(paramString5))
        break label58;
      if (paramLong <= 0L)
        break label47;
      paramString3 = a(paramContentType, paramLong);
    }
    while (TextUtils.isEmpty(paramString3))
    {
      throw new StorageUtil.GenerateSaveFileException("no target Folder");
      label47: paramString3 = a(paramContentType, -1L);
      continue;
      label58: paramString3 = a(paramString5, paramContentType);
    }
    String str1 = paramString3.replaceFirst("file://", "");
    if (!str1.endsWith("/"))
      str1 = str1 + "/";
    File localFile = new File(str1);
    if ((!localFile.exists()) && (!localFile.mkdirs()))
      throw new StorageUtil.GenerateSaveFileException("unable to make folder");
    String str4;
    String str2;
    if (TextUtils.isEmpty(paramString1))
      if ((paramString2 != null) && (paramString2.length() > 0))
      {
        int m = paramString2.lastIndexOf('?');
        if (m <= 0)
          break label498;
        str4 = paramString2.substring(0, m);
        int n = str4.lastIndexOf('/');
        if (n >= 0)
          str4 = str4.substring(n + 1);
        if ((str4.length() > 0) && (Pattern.matches("[a-zA-Z_0-9\\.\\-\\(\\)]+", str4)))
        {
          int i1 = str4.lastIndexOf('.');
          if (i1 >= 0)
            str2 = str4.substring(0, i1);
        }
      }
    while (true)
    {
      if (!TextUtils.isEmpty(str2))
        str2 = FileNameUtil.removeIllegalChars(str2);
      String str3;
      if ((paramContentType == ContentTypeEnum.ContentType.APP) || (paramContentType == ContentTypeEnum.ContentType.PATCH))
        str3 = a(paramContentType, paramString4);
      label496: 
      while (true)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str1);
        if (!TextUtils.isEmpty(str2))
        {
          localStringBuilder.append(str2);
          localStringBuilder.append('_');
        }
        localStringBuilder.append(System.currentTimeMillis());
        if (!TextUtils.isEmpty(str3))
          localStringBuilder.append(str3);
        return localStringBuilder.toString();
        str2 = "";
        break;
        int k;
        if ((paramString2 != null) && (paramString2.length() > 0))
        {
          int i = paramString2.lastIndexOf('?');
          if (i > 0)
            paramString2 = paramString2.substring(0, i);
          int j = paramString2.lastIndexOf('/');
          if (j >= 0)
            paramString2 = paramString2.substring(j + 1);
          if ((paramString2.length() > 0) && (Pattern.matches("[a-zA-Z_0-9\\.\\-\\(\\)]+", paramString2)))
          {
            k = paramString2.lastIndexOf('.');
            if (k < 0);
          }
        }
        for (str3 = paramString2.substring(k + 1); ; str3 = "")
        {
          if (!TextUtils.isEmpty(str3))
            break label496;
          str3 = a(paramContentType, paramString4);
          break;
        }
      }
      label498: str4 = paramString2;
      break;
      str2 = paramString1;
    }
  }

  public static boolean a(DownloadInfo paramDownloadInfo)
  {
    if (!b(paramDownloadInfo))
      throw new IllegalStateException("Download info must be not null and the contentType must be APP or PATCH");
    String str = paramDownloadInfo.m;
    if (Phoenix2Util.isPhoenix2(str))
      return paramDownloadInfo.n <= SystemUtil.getVersionCode(GlobalConfig.getAppContext());
    if (!AppManager.a().h(str))
      return false;
    if ("game_packet".equals(paramDownloadInfo.p))
      return true;
    LocalAppInfo localLocalAppInfo = ((AppManager)i.k().a("app")).f(paramDownloadInfo.m);
    if (localLocalAppInfo == null)
      return false;
    int i = paramDownloadInfo.n;
    if ((i > 0) && (i > localLocalAppInfo.getVersionCode()));
    for (int j = 1; j == 0; j = 0)
      return true;
    return false;
  }

  public static r b(LocalAppInfo.UpgradeInfo paramUpgradeInfo, Model paramModel)
  {
    r localr = new r();
    localr.a(DownloadRequestParam.Type.APP);
    localr.a(DownloadPackage.VerifyType.MD5);
    localr.a(paramUpgradeInfo.getFullMD5());
    localr.b(paramUpgradeInfo.getFullUrl());
    localr.h(paramModel.F().package_name);
    localr.a(paramUpgradeInfo.getVersionCode());
    localr.a(ContentTypeEnum.ContentType.APP);
    localr.a(paramUpgradeInfo.getFullSize());
    localr.f(paramModel.n());
    localr.g(paramModel.i());
    localr.e(a(paramModel));
    localr.b(System.currentTimeMillis());
    return localr;
  }

  public static String b(List<DownloadInfo> paramList)
  {
    if (CollectionUtils.isEmpty(paramList))
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramList.iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if (i != 0)
        i = 0;
      while (true)
      {
        localStringBuilder.append(localDownloadInfo.m);
        break;
        localStringBuilder.append(";");
      }
    }
    return localStringBuilder.toString();
  }

  public static boolean b(DownloadInfo paramDownloadInfo)
  {
    return (paramDownloadInfo != null) && ((paramDownloadInfo.e == ContentTypeEnum.ContentType.APP) || (paramDownloadInfo.e == ContentTypeEnum.ContentType.PATCH));
  }

  static String c(DownloadInfo paramDownloadInfo)
  {
    String str = paramDownloadInfo.m;
    if (SystemUtil.aboveApiLevel(11))
      str = paramDownloadInfo.f;
    return a(str, paramDownloadInfo.d.a.b, null, paramDownloadInfo.e, paramDownloadInfo.p, paramDownloadInfo.d.d, Config.r());
  }

  public final void a(List<Model> paramList)
  {
    DownloadDataList.b(this.b);
    if (this.a)
      DownloadDataList.a(this.b).clear();
    DownloadDataList.a(this.b).addAll(DownloadDataList.a(this.b, DataLoadListener.Op.REFRESH, paramList));
    DownloadDataList.a(this.b, DataLoadListener.Op.REFRESH, new g(0, DownloadDataList.a(this.b).size()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.b
 * JD-Core Version:    0.6.0
 */