package com.wandoujia.jupiter;

import android.content.Context;
import android.os.Environment;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.jupiter.activity.HomeActivity;
import com.wandoujia.jupiter.library.activity.LibActivity;
import com.wandoujia.logv3.model.packages.ClientPackage.Product;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.jni.NativeDiffDecoder;
import com.wandoujia.ripple_framework.AppMd5Manager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.b;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.rpc.http.client.DataApi;
import com.wandoujia.udid.UDIDUtil;
import java.io.File;

final class g
  implements com.wandoujia.appmanager.config.a
{
  g(JupiterApplication paramJupiterApplication)
  {
  }

  public final SystemUtil.InstallOption a()
  {
    return BadgeUtil.f(JupiterApplication.h());
  }

  public final String a(String paramString)
  {
    return ((AppMd5Manager)i.k().a("app_md5")).a(paramString);
  }

  public final void a(String paramString1, String paramString2, String paramString3)
  {
    int i = paramString3.lastIndexOf('/');
    if (i > 0)
    {
      File localFile = new File(paramString3.substring(0, i));
      if (!localFile.exists())
        localFile.mkdirs();
    }
    NativeDiffDecoder.a(this.a, paramString1, paramString2, paramString3);
  }

  public final String b()
  {
    if (SystemUtil.isSDCardMounted())
      return Environment.getExternalStorageDirectory() + "/wandoujia/app/";
    return Environment.getDataDirectory() + "/data/com.wandoujia.phoenix2/files/";
  }

  public final boolean c()
  {
    return BadgeUtil.e(i.k().g());
  }

  public final DataApi d()
  {
    return com.wandoujia.p4.a.b();
  }

  public final String e()
  {
    return Config.l();
  }

  public final String f()
  {
    return UDIDUtil.a(this.a);
  }

  public final String g()
  {
    return com.wandoujia.account.a.t();
  }

  public final Context h()
  {
    return this.a;
  }

  public final ClientPackage.Product i()
  {
    return ClientPackage.Product.JUPITER;
  }

  public final String j()
  {
    return "jupiter";
  }

  public final Class<?> k()
  {
    return HomeActivity.class;
  }

  public final b l()
  {
    return new b(this.a, "UA-15790641-73", "wdj:/");
  }

  public final String m()
  {
    return "wandoujia";
  }

  public final Class<?> n()
  {
    return LibActivity.class;
  }

  public final String o()
  {
    return "wandoujia";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.g
 * JD-Core Version:    0.6.0
 */