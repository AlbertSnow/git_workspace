package com.wandoujia.accessibility;

import android.content.Intent;
import android.text.TextUtils;
import com.wandoujia.account.a;
import com.wandoujia.logv3.model.packages.ClientPackage.Product;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage.Builder;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage.Source;
import com.wandoujia.logv3.toolkit.i;

public final class b extends i
{
  private ClientPackage.Product a;
  private String b;
  private String c;
  private String d;
  private String e;

  public b(ClientPackage.Product paramProduct, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramProduct;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
  }

  public final LaunchSourcePackage a(Intent paramIntent)
  {
    return new LaunchSourcePackage.Builder().source(LaunchSourcePackage.Source.UNKNOWN).build();
  }

  protected final String a()
  {
    return this.c;
  }

  protected final ClientPackage.Product b()
  {
    return this.a;
  }

  protected final String c()
  {
    return this.d;
  }

  protected final String d()
  {
    return this.e;
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.b
 * JD-Core Version:    0.6.0
 */