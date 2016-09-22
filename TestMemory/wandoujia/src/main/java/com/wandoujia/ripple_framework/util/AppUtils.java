package com.wandoujia.ripple_framework.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Comparator;
import java.util.List;

public final class AppUtils
{
  private static final Comparator<LocalAppInfo> a = new a();
  private static final Comparator<LocalAppInfo> b = new b();
  private static final Comparator<LocalAppInfo> c = new c();
  private static final Comparator<LocalAppInfo> d = new d();
  private static final Comparator<LocalAppInfo> e = new e();
  private static final Comparator<LocalAppInfo> f = new f();
  private static final Comparator<LocalAppInfo> g = new g();

  public static PackageInfo a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramString, 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return null;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }

  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    String str1 = paramString.trim();
    if (TextUtils.isEmpty(str1))
      return null;
    if (TextUtil.isChinese(str1.charAt(0)))
    {
      String str2 = TextUtil.convert2Pinyin(i.k().g(), str1.substring(0, 1));
      str1 = str2.trim().toUpperCase() + str1.substring(1);
    }
    return str1.trim().replaceAll("^[\\s ]*|[\\s ]*$", "").toUpperCase();
  }

  public static boolean a(Model paramModel)
  {
    return (paramModel.F() != null) && (!CollectionUtils.isEmpty(paramModel.F().apk)) && (((ApkDetail)paramModel.F().apk.get(0)).compatible != null) && (((ApkDetail)paramModel.F().apk.get(0)).compatible.intValue() != 1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.AppUtils
 * JD-Core Version:    0.6.0
 */