package com.wandoujia.nirvana.framework.network;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.i;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.startpage.manager.LocalFeedManager;
import com.wandoujia.p4.utils.k;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.udid.UDIDUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private i a;

  public static Map<String, String> b()
  {
    HashMap localHashMap = new HashMap();
    Context localContext = GlobalConfig.getAppContext();
    localHashMap.put("udid", UDIDUtil.a(localContext));
    localHashMap.put("v", SystemUtil.getVersionName(localContext));
    localHashMap.put("vc", String.valueOf(SystemUtil.getVersionCode(localContext)));
    localHashMap.put("capacity", String.valueOf(k.a()));
    if (!TextUtils.isEmpty(com.wandoujia.account.a.t()))
      localHashMap.put("uid", com.wandoujia.account.a.t());
    localHashMap.put("channel", Config.d());
    localHashMap.put("rippleSupported", String.valueOf(AppManager.a().h("com.wandoujia")));
    localHashMap.put("sdk", String.valueOf(SystemUtil.getSdkVersionInt()));
    if (OemUtil.isOem())
      localHashMap.put("id", "");
    LocalFeedManager localLocalFeedManager = (LocalFeedManager)j.a().a("local_feed");
    localHashMap.put("launchedCount", String.valueOf(localLocalFeedManager.e()));
    localHashMap.put("launchedAge", String.valueOf(localLocalFeedManager.c()));
    String str = SystemUtil.getImei(localContext);
    if (!TextUtils.isEmpty(str))
      localHashMap.put("deviceId", Base64.encodeToString(str.getBytes(), 2));
    return localHashMap;
  }

  public final i a()
  {
    if (this.a == null)
      this.a = com.wandoujia.nirvana.framework.network.a.a.a(new File(j.a().e(), "volley-api"), "jupiter");
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.a
 * JD-Core Version:    0.6.0
 */