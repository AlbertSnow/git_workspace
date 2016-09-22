package com.sina.weibo.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.sina.weibo.sdk.a.f;

public class a
{
  static
  {
    a.class.getName();
  }

  public static boolean a(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return false;
      try
      {
        PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 64);
        Signature[] arrayOfSignature = localPackageInfo.signatures;
        if (arrayOfSignature == null)
          continue;
        int i = arrayOfSignature.length;
        for (int j = 0; j < i; j++)
          if ("18da2bf10352443a00a5e046d9fca6bd".equals(f.a(arrayOfSignature[j].toByteArray())))
            return true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a
 * JD-Core Version:    0.6.0
 */