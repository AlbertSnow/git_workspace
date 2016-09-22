package com.wandoujia.p4.app.button.model;

import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.entities.app.ExtensionPack;
import com.wandoujia.entities.app.IAppLiteInfo;
import com.wandoujia.entities.app.UseInfo;
import java.util.List;

public final class b
  implements a
{
  private final IAppLiteInfo a;

  public b(IAppLiteInfo paramIAppLiteInfo)
  {
    this.a = paramIAppLiteInfo;
  }

  public final String a()
  {
    return this.a.getAppLiteTitle();
  }

  public final String b()
  {
    return this.a.getAppLiteIcon();
  }

  public final long c()
  {
    return this.a.getAppLiteSize();
  }

  public final String d()
  {
    return this.a.getAppLitePackageName();
  }

  public final String e()
  {
    return this.a.getAppLiteDownloadUrl();
  }

  public final int f()
  {
    return this.a.getAppLiteVersionCode();
  }

  public final String g()
  {
    return this.a.getAppLiteMd5();
  }

  public final boolean h()
  {
    return this.a.getAppLiteCompatible();
  }

  public final List<String> i()
  {
    return this.a.getAppLiteIncompatibleDetail();
  }

  public final String j()
  {
    return this.a.getAppLitePaidStatus();
  }

  public final boolean k()
  {
    return this.a.isFreeTraffic();
  }

  public final String l()
  {
    return this.a.getAppLiteDetailParam();
  }

  public final boolean m()
  {
    return this.a.getAppLiteAd();
  }

  public final int n()
  {
    return this.a.getAppLiteAdType();
  }

  public final List<ExtensionPack> o()
  {
    return this.a.getExtensionPacks();
  }

  public final List<ApkObbInfo> p()
  {
    return this.a.getApkObbs();
  }

  public final String q()
  {
    return this.a.getAppLiteDisplayStatUrl();
  }

  public final String r()
  {
    String str1 = this.a.getAppLiteDetailParam();
    String str2 = null;
    String[] arrayOfString;
    int i;
    if (str1 != null)
    {
      boolean bool = str1.contains("bid=");
      str2 = null;
      if (bool)
      {
        arrayOfString = str1.split("&");
        i = arrayOfString.length;
      }
    }
    for (int j = 0; ; j++)
    {
      str2 = null;
      if (j < i)
      {
        String str3 = arrayOfString[j];
        if (!str3.contains("bid="))
          continue;
        str2 = str3.replace("bid=", "");
      }
      return str2;
    }
  }

  public final UseInfo s()
  {
    return this.a.getUseInfo();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.button.model.b
 * JD-Core Version:    0.6.0
 */