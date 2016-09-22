package com.wandoujia.base.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class ManifestUtil
{
  public static String getMetaInfo(Context paramContext, String paramString)
  {
    try
    {
      String str = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.getString(paramString);
      if (str != null)
        return str;
    }
    catch (RuntimeException localRuntimeException)
    {
      return "";
    }
    catch (NullPointerException localNullPointerException)
    {
      break label33;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label33: break label33;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ManifestUtil
 * JD-Core Version:    0.6.0
 */