package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

public final class ib
{
  private static final ib a = new ib();

  static e a(PackageInfo paramPackageInfo, e[] paramArrayOfe)
  {
    if (paramPackageInfo.signatures.length != 1)
      return null;
    cf localcf = new cf(paramPackageInfo.signatures[0].toByteArray());
    for (int i = 0; i < paramArrayOfe.length; i++)
      if (paramArrayOfe[i].equals(localcf))
        return paramArrayOfe[i];
    if (Log.isLoggable("GoogleSignatureVerifier", 2))
      new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(localcf.a(), 0));
    return null;
  }

  public static ib a()
  {
    return a;
  }

  private static boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if (paramPackageInfo.signatures.length != 1)
      return false;
    cf localcf = new cf(paramPackageInfo.signatures[0].toByteArray());
    if (paramBoolean);
    for (Set localSet = d.a(); localSet.contains(localcf); localSet = d.b())
      return true;
    if (Log.isLoggable("GoogleSignatureVerifier", 2))
      new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(localcf.a(), 0));
    return false;
  }

  public static boolean a(PackageManager paramPackageManager, String paramString)
  {
    PackageInfo localPackageInfo;
    boolean bool2;
    do
    {
      try
      {
        localPackageInfo = paramPackageManager.getPackageInfo(paramString, 64);
        bool2 = false;
        if (localPackageInfo == null)
          return bool2;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        boolean bool1;
        do
        {
          bool1 = Log.isLoggable("GoogleSignatureVerifier", 3);
          bool2 = false;
        }
        while (!bool1);
        new StringBuilder("Package manager can't find package ").append(paramString).append(", defaulting to false");
        return false;
      }
      if (a.a(paramPackageManager))
        return a(localPackageInfo, true);
      bool2 = a(localPackageInfo, false);
    }
    while (bool2);
    a(localPackageInfo, true);
    return bool2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.ib
 * JD-Core Version:    0.6.0
 */