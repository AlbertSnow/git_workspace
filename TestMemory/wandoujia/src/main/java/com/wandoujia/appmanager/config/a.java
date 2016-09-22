package com.wandoujia.appmanager.config;

import android.content.Context;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.logv3.model.packages.ClientPackage.Product;
import com.wandoujia.ripple_framework.log.b;
import com.wandoujia.rpc.http.client.DataApi;

public abstract interface a
{
  public abstract SystemUtil.InstallOption a();

  public abstract String a(String paramString);

  public abstract void a(String paramString1, String paramString2, String paramString3);

  public abstract String b();

  public abstract boolean c();

  public abstract DataApi d();

  public abstract String e();

  public abstract String f();

  public abstract String g();

  public abstract Context h();

  public abstract ClientPackage.Product i();

  public abstract String j();

  public abstract Class<?> k();

  public abstract b l();

  public abstract String m();

  public abstract Class<?> n();

  public abstract String o();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.config.a
 * JD-Core Version:    0.6.0
 */