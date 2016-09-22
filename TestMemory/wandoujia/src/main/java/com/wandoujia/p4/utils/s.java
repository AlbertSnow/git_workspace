package com.wandoujia.p4.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.wandoujia.base.infos.FeatureInfos;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.a;
import com.wandoujia.ripple_framework.Config;

public final class s
{
  private static s f;
  private boolean a = true;
  private int b = -1;
  private String c = Config.i();
  private String d;
  private long e = -1L;

  private s()
  {
    TextUtils.isEmpty(this.c);
    Config.j();
    Config.k();
    this.b = Build.VERSION.SDK_INT;
    this.e = FeatureInfos.genFeatureInfos(a.a().getPackageManager().getSystemAvailableFeatures());
    this.d = SystemUtil.getCpuFamily(a.a());
  }

  public static s a()
  {
    monitorenter;
    try
    {
      if (f == null)
        f = new s();
      s locals = f;
      return locals;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.e != -1L)
      localStringBuilder.append("features=").append(this.e).append(";");
    if (this.b != -1)
      localStringBuilder.append("sdk=").append(this.b).append(";");
    if ((this.a) && (!TextUtils.isEmpty(this.c)))
      localStringBuilder.append("gpuVersion=").append(this.c).append(";");
    if (!TextUtils.isEmpty(this.d))
      localStringBuilder.append("cpuFamily=").append(this.d).append(";");
    Config.a(localStringBuilder.toString());
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.s
 * JD-Core Version:    0.6.0
 */