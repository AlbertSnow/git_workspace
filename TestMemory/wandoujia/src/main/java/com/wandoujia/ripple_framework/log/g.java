package com.wandoujia.ripple_framework.log;

import android.content.Intent;
import android.text.TextUtils;
import com.wandoujia.account.a;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.ClientPackage.Product;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage.Builder;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage.Source;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.udid.UDIDUtil;

public final class g extends com.wandoujia.logv3.toolkit.i
{
  private ClientPackage.Product a;
  private String b;
  private String c;
  private com.wandoujia.logv3.i d;

  public g(ClientPackage.Product paramProduct, String paramString1, com.wandoujia.logv3.i parami, String paramString2)
  {
    this.a = paramProduct;
    this.b = paramString1;
    this.d = parami;
    this.c = paramString2;
  }

  public final LaunchSourcePackage a(Intent paramIntent)
  {
    LaunchSourcePackage.Builder localBuilder = new LaunchSourcePackage.Builder();
    if (paramIntent == null)
      return localBuilder.source(LaunchSourcePackage.Source.UNKNOWN).build();
    String str = paramIntent.getStringExtra("launch_from");
    if (str != null);
    try
    {
      LaunchSourcePackage.Source localSource2 = LaunchSourcePackage.Source.valueOf(str.toUpperCase());
      localSource1 = localSource2;
      if (localSource1 != null)
        localBuilder.source(localSource1);
      while (true)
      {
        localBuilder.keyword(paramIntent.getStringExtra("launch_keyword"));
        return localBuilder.build();
        localBuilder.source(LaunchSourcePackage.Source.UNKNOWN);
      }
      if ("android.intent.action.MAIN".equals(paramIntent.getAction()))
        return localBuilder.source(LaunchSourcePackage.Source.WELCOME).build();
      return localBuilder.source(LaunchSourcePackage.Source.UNKNOWN).build();
    }
    catch (Exception localException)
    {
      while (true)
        LaunchSourcePackage.Source localSource1 = null;
    }
  }

  protected final String a()
  {
    if (TextUtils.isEmpty(this.c))
      return UDIDUtil.a(GlobalConfig.getAppContext());
    return this.c;
  }

  protected final ClientPackage.Product b()
  {
    return this.a;
  }

  protected final String c()
  {
    return Config.c();
  }

  protected final String d()
  {
    return Config.f();
  }

  protected final String e()
  {
    String str = a.t();
    if (!TextUtils.isEmpty(str))
      return str;
    return null;
  }

  protected final String f()
  {
    String str = a.u();
    if (!TextUtils.isEmpty(str))
      return str;
    return null;
  }

  protected final String g()
  {
    String str = a.v();
    if (!TextUtils.isEmpty(str))
      return str;
    return null;
  }

  public final String h()
  {
    return this.b;
  }

  public final com.wandoujia.logv3.i k()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.log.g
 * JD-Core Version:    0.6.0
 */