package com.wandoujia.ripple_framework;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.wandoujia.base.storage.StorageManager;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.io.File;

public final class o
{
  public static Typeface a(Context paramContext, TypefaceManager.FONT paramFONT)
  {
    if (!BadgeUtil.g(paramContext))
      return paramFONT.defaultTypeface;
    int i;
    DownloadManager localDownloadManager;
    Object localObject;
    if (!new File(a(paramFONT)).exists())
    {
      i = 1;
      if (i == 0)
        break label246;
      localDownloadManager = (DownloadManager)i.k().a("download");
      if (localDownloadManager != null)
      {
        localObject = null;
        if (paramFONT != null)
        {
          boolean bool1 = TextUtils.isEmpty(paramFONT.url);
          localObject = null;
          if (!bool1)
            break label98;
        }
      }
    }
    while (true)
    {
      localDownloadManager.a(localObject.b());
      return paramFONT.defaultTypeface;
      i = 0;
      break;
      label98: r localr = new r();
      localr.a(DownloadRequestParam.Type.COMMON);
      localr.b(paramFONT.url);
      boolean bool2 = TextUtils.isEmpty(b.a());
      localObject = null;
      if (bool2)
        continue;
      String str = paramFONT.url.substring(1 + paramFONT.url.lastIndexOf('/'));
      localr.f(str);
      localr.d(b.a() + str);
      localr.e(paramFONT.url);
      localr.a(false);
      localr.a();
      localr.a(paramFONT.md5);
      localr.a(DownloadPackage.VerifyType.MD5);
      localObject = localr;
    }
    label246: if (!Config.aa())
      return paramFONT.defaultTypeface;
    try
    {
      Typeface localTypeface = Typeface.createFromFile(a(paramFONT));
      return localTypeface;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return paramFONT.defaultTypeface;
  }

  private static String a(TypefaceManager.FONT paramFONT)
  {
    return StorageManager.getInstance().getExternalStorageDirectory(-1L) + "/" + i.k().b() + "/" + paramFONT.path;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.o
 * JD-Core Version:    0.6.0
 */