package com.google.android.gms.appstreaming.internal;

import aoq;
import apj;
import apn;
import asn;
import aso;
import ate;
import com.google.android.gms.appstreaming.AppStreamingState;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.logging.Level;
import java.util.logging.Logger;
import ng;

@DynamiteApi
public class AppStreamingHelperDelegateImpl extends ng
{
  private static final Logger a = aso.a("AppStreamingHelper", "AppStreamingHelperDelegateImpl");
  private static boolean b;

  public apj getDefaultDialog(AppStreamingState paramAppStreamingState, apj paramapj1, apj paramapj2)
  {
    return null;
  }

  public void initialize(apj paramapj)
  {
    apn.a(paramapj);
    Logger localLogger;
    Level localLevel;
    String str1;
    try
    {
      if ((aoq.a(19)) && (ate.a()));
      for (boolean bool = true; ; bool = false)
      {
        b = bool;
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      localLogger = a;
      localLevel = asn.a;
      str1 = String.valueOf(localThrowable.toString());
      if (str1.length() == 0);
    }
    for (String str2 = "Error while determining app streaming support.".concat(str1); ; str2 = new String("Error while determining app streaming support."))
    {
      localLogger.log(localLevel, str2);
      return;
    }
  }

  public boolean isAppStreamingSupported()
  {
    return b;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstreaming.internal.AppStreamingHelperDelegateImpl
 * JD-Core Version:    0.6.0
 */