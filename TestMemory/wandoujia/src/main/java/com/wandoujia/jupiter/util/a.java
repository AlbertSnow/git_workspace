package com.wandoujia.jupiter.util;

import android.os.Build;
import com.wandoujia.account.dto.Role;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static final String[] a = { "launchedCount", "launchedAge", "netStatus" };

  public static Map<String, String> a()
  {
    LocalFeedManager localLocalFeedManager = (LocalFeedManager)j.a().a("local_feed");
    HashMap localHashMap = new HashMap();
    if (com.wandoujia.account.a.a(Role.ROLE_SUBSCRIBER))
      localHashMap.put("isFollowUser", "true");
    localHashMap.put("launchedCount", String.valueOf(localLocalFeedManager.e()));
    localHashMap.put("launchedAge", String.valueOf(localLocalFeedManager.c()));
    String str1;
    String str2;
    label105: String str3;
    label129: String str4;
    if (Build.MODEL != null)
    {
      str1 = Build.MODEL;
      localHashMap.put("deviceModel", str1);
      if (Build.BRAND == null)
        break label211;
      str2 = Build.BRAND;
      localHashMap.put("deviceBrand", str2);
      if (!SystemUtil.isDeviceTablet(JupiterApplication.e()))
        break label218;
      str3 = "tablet";
      localHashMap.put("deviceType", str3);
      localHashMap.put("resolution", SystemUtil.getScreenResolution(JupiterApplication.e()));
      localHashMap.put("deviceCPU", SystemUtil.getCPU());
      str4 = NetworkUtil.getNetworkTypeName(JupiterApplication.e());
      if (str4 == null)
        break label225;
    }
    while (true)
    {
      localHashMap.put("netStatus", str4);
      localHashMap.put("apiVersion", "2");
      return localHashMap;
      str1 = "";
      break;
      label211: str2 = "";
      break label105;
      label218: str3 = "phone";
      break label129;
      label225: str4 = "";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.a
 * JD-Core Version:    0.6.0
 */