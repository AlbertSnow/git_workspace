package com.wandoujia.base.utils;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

public class AppKillBlacklistUtil
{
  private static final List<String> appKillWhiteList;

  static
  {
    ArrayList localArrayList = new ArrayList();
    appKillWhiteList = localArrayList;
    localArrayList.add("com.wandoujia.phoenix2");
    appKillWhiteList.add("com.wandoujia.roshan");
    appKillWhiteList.add("com.wandoujia.eyepetizer");
    appKillWhiteList.add("com.wandoujia");
    appKillWhiteList.add("android");
    appKillWhiteList.add("com.android.phone");
    appKillWhiteList.add("com.android.mms");
    appKillWhiteList.add("com.android.systemui");
    appKillWhiteList.add("com.android.providers.settings");
    appKillWhiteList.add("com.android.providers.applications");
    appKillWhiteList.add("com.android.providers.contacts");
    appKillWhiteList.add("com.android.providers.userdictionary");
    appKillWhiteList.add("com.android.providers.telephony");
    appKillWhiteList.add("com.android.providers.drm");
    appKillWhiteList.add("com.android.providers.downloads");
    appKillWhiteList.add("com.android.providers.media");
    String str1 = Build.MANUFACTURER;
    String str2;
    if (str1.equalsIgnoreCase("HTC"))
    {
      appKillWhiteList.add("com.android.htccontacts");
      appKillWhiteList.add("com.android.htcdialer");
      appKillWhiteList.add("com.htc.messagecs");
      appKillWhiteList.add("com.htc.idlescreen.shortcut");
      appKillWhiteList.add("com.android.providers.htcCheckin");
      str2 = Build.MODEL;
      if ((!str2.equalsIgnoreCase("HTC Sensation Z710e")) && (!str2.equalsIgnoreCase("HTC Sensation G14")) && (!str2.equalsIgnoreCase("HTC Z710e")))
        break label614;
      appKillWhiteList.add("android.process.acore");
    }
    label614: 
    do
    {
      return;
      if (str1.equalsIgnoreCase("ZTE"))
      {
        appKillWhiteList.add("zte.com.cn.alarmclock");
        appKillWhiteList.add("com.android.utk");
        break;
      }
      if (str1.equalsIgnoreCase("huawei"))
      {
        appKillWhiteList.add("com.huawei.widget.localcityweatherclock");
        break;
      }
      if (str1.equalsIgnoreCase("Sony Ericsson"))
      {
        appKillWhiteList.add("com.sonyericsson.provider.useragent");
        appKillWhiteList.add("com.sonyericsson.provider.customization");
        appKillWhiteList.add("com.sonyericsson.secureclockservice");
        appKillWhiteList.add("com.sonyericsson.widget.digitalclock");
        appKillWhiteList.add("com.sonyericsson.digitalclockwidget");
        break;
      }
      if (str1.equalsIgnoreCase("samsung"))
      {
        appKillWhiteList.add("com.samsung.inputmethod");
        appKillWhiteList.add("com.sec.android.app.controlpanel");
        appKillWhiteList.add("com.sonyericsson.provider.customization");
        break;
      }
      if (str1.equalsIgnoreCase("motorola"))
      {
        appKillWhiteList.add("com.motorola.numberlocation");
        appKillWhiteList.add("com.motorola.android.fota");
        appKillWhiteList.add("com.motorola.atcmd");
        appKillWhiteList.add("com.motorola.locationsensor");
        appKillWhiteList.add("com.motorola.blur.conversations");
        appKillWhiteList.add("com.motorola.blur.alarmclock");
        appKillWhiteList.add("com.motorola.blur.providers.contacts");
        break;
      }
      if (str1.equalsIgnoreCase("LGE"))
      {
        appKillWhiteList.add("com.lge.clock");
        break;
      }
      if (!str1.equalsIgnoreCase("magnum2x"))
        break;
      appKillWhiteList.add("ty.com.android.TYProfileSetting");
      break;
      if (str2.equalsIgnoreCase("LT18i"))
      {
        appKillWhiteList.add("com.sonyericsson.provider.customization");
        appKillWhiteList.add("com.sonyericsson.provider.useragent");
        return;
      }
      if ((str2.equalsIgnoreCase("U8500")) || (str2.equalsIgnoreCase("U8500 HiQQ")))
      {
        appKillWhiteList.add("android.process.launcherdb");
        appKillWhiteList.add("com.motorola.process.system");
        appKillWhiteList.add("com.nd.assistance.ServerService");
        return;
      }
      if (str2.equalsIgnoreCase("MT15I"))
      {
        appKillWhiteList.add("com.sonyericsson.eventstream.calllogplugin");
        return;
      }
      if ((str2.equalsIgnoreCase("GT-I9100")) || (str2.equalsIgnoreCase("GT-I9100G")))
      {
        appKillWhiteList.add("com.samsung.inputmethod");
        appKillWhiteList.add("com.sec.android.app.controlpanel");
        appKillWhiteList.add("com.sec.android.app.FileTransferManager");
        appKillWhiteList.add("com.sec.android.providers.downloads");
        appKillWhiteList.add("com.android.providers.downloads.ui");
        return;
      }
      if (str2.equalsIgnoreCase("DROIDX"))
      {
        appKillWhiteList.add("com.motorola.blur.contacts.data");
        appKillWhiteList.add("com.motorola.blur.contacts");
        return;
      }
      if ((str2.equalsIgnoreCase("DROID2")) || (str2.equalsIgnoreCase("DROID2 GLOBA")))
      {
        appKillWhiteList.add("com.motorola.blur.contacts");
        return;
      }
      if (str2.startsWith("U8800"))
      {
        appKillWhiteList.add("com.huawei.android.gpms");
        appKillWhiteList.add("com.android.hwdrm");
        appKillWhiteList.add("com.huawei.omadownload");
        return;
      }
      if (str2.equalsIgnoreCase("LG-P503"))
      {
        appKillWhiteList.add("com.lge.simcontacts");
        return;
      }
      if (str2.equalsIgnoreCase("XT702"))
      {
        appKillWhiteList.add("com.motorola.usb");
        appKillWhiteList.add("com.android.alarmclock");
        return;
      }
      if (str2.equalsIgnoreCase("e15i"))
      {
        appKillWhiteList.add("com.sec.ccl.csp.app.secretwallpaper.themetwo");
        return;
      }
      if (!str2.equalsIgnoreCase("zte-c n600"))
        continue;
      appKillWhiteList.add("com.android.wallpaper");
      appKillWhiteList.add("com.android.musicvis");
      appKillWhiteList.add("com.android.magicsmoke");
      return;
    }
    while ((!str2.startsWith("GT-5830")) && (!str2.startsWith("HTC Velocity 4G")));
    appKillWhiteList.add("com.android.providers.downloads.ui");
  }

  public static boolean isAppInWhiteList(String paramString)
  {
    return appKillWhiteList.contains(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.AppKillBlacklistUtil
 * JD-Core Version:    0.6.0
 */