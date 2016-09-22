package com.tencent.connect.b;

import android.os.Build;
import com.tencent.connect.common.b;
import com.tencent.open.a.f;

public final class a extends b
{
  private static String b = "libwbsafeedit";

  static
  {
    new StringBuilder().append(b).append(".so");
    String str = Build.CPU_ABI;
    if ((str != null) && (!str.equals("")))
    {
      if (str.equalsIgnoreCase("arm64-v8a"))
      {
        b = "libwbsafeedit_64";
        new StringBuilder().append(b).append(".so");
        f.c("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        return;
      }
      if (str.equalsIgnoreCase("x86"))
      {
        b = "libwbsafeedit_x86";
        new StringBuilder().append(b).append(".so");
        f.c("openSDK_LOG.AuthAgent", "is x86 architecture");
        return;
      }
      if (str.equalsIgnoreCase("x86_64"))
      {
        b = "libwbsafeedit_x86_64";
        new StringBuilder().append(b).append(".so");
        f.c("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        return;
      }
      b = "libwbsafeedit";
      new StringBuilder().append(b).append(".so");
      f.c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
      return;
    }
    b = "libwbsafeedit";
    new StringBuilder().append(b).append(".so");
    f.c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
  }

  public a(c paramc)
  {
    super(paramc, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.b.a
 * JD-Core Version:    0.6.0
 */