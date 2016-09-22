package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public class zzac
{
  public static zzl zza(Context paramContext, zzy paramzzy)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    String str1 = "volley/0";
    try
    {
      String str2 = paramContext.getPackageName();
      localObject = paramContext.getPackageManager().getPackageInfo(str2, 0);
      str1 = str2 + "/" + ((PackageInfo)localObject).versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    if (paramzzy == null)
      if (Build.VERSION.SDK_INT >= 9)
        paramzzy = new zzz();
      else
        paramzzy = new zzw(AndroidHttpClient.newInstance(str1));
    zzt localzzt = new zzt(paramzzy);
    Object localObject = new zzl(new zzv(localFile), localzzt);
    ((zzl)localObject).start();
    return (zzl)localObject;
  }

  public static zzl zza(Context paramContext)
  {
    return zza(paramContext, null);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzac
 * JD-Core Version:    0.6.0
 */