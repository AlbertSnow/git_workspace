package com.wandoujia.ripple_framework.installer.model;

import java.io.Serializable;

public class IncompatibleAppInfo
  implements Serializable
{
  public final String incompatibleDetail;
  public final String packageName;

  public IncompatibleAppInfo(a parama)
  {
    this.packageName = a.a(parama);
    this.incompatibleDetail = a.b(parama);
  }

  public static a newBuilder()
  {
    return new a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.model.IncompatibleAppInfo
 * JD-Core Version:    0.6.0
 */