package com.wandoujia.p4.campaign;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.wandoujia.account.AccountParams;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.AppManager.AppState;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.infos.FeatureInfos;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.gson.c;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.activity.EntryWeiboActivity;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.feedback.model.PhoneInfo;
import com.wandoujia.p4.game.acitvity.GameVideoPlayActivity;
import com.wandoujia.p4.model.CampaignDownloadInfo;
import com.wandoujia.p4.search.utils.SearchConst.ShareType;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.DownloadManager.PauseReason;
import com.wandoujia.udid.UDIDUtil;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class e
{
  private final Activity a;
  private final WebView b;

  public e(Activity paramActivity, WebView paramWebView)
  {
    this.a = paramActivity;
    this.b = paramWebView;
  }

  @JavascriptInterface
  public final void cancelAsync(String paramString)
  {
    DownloadManager localDownloadManager = (DownloadManager)com.wandoujia.ripple_framework.i.k().a("download");
    localDownloadManager.a(localDownloadManager.a(paramString));
  }

  @JavascriptInterface
  public final void closeWebView()
  {
    this.a.finish();
  }

  @JavascriptInterface
  public final void download(String paramString1, String paramString2, int paramInt)
  {
    new Handler(Looper.getMainLooper()).post(new g(paramString2, paramString1));
  }

  @JavascriptInterface
  public final void downloadApp(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    p.a(this.a, paramString2, paramString1, paramString4, paramString3, 0);
  }

  @JavascriptInterface
  public final String getAllApps()
  {
    List localList = AppManager.a().c();
    return new c().a(localList);
  }

  @JavascriptInterface
  public final void getAllAppsAsync(String paramString)
  {
    ThreadPool.execute(new i(this, paramString));
  }

  @JavascriptInterface
  public final int getAppCount()
  {
    return AppManager.a().f();
  }

  @JavascriptInterface
  public final String getAppInfo(String paramString)
  {
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString);
    return new c().a(localLocalAppInfo);
  }

  @JavascriptInterface
  public final void getAppInfoAsync(String paramString1, String paramString2)
  {
    ThreadPool.execute(new m(this, paramString1, paramString2));
  }

  @JavascriptInterface
  public final String getAppInfos(String[] paramArrayOfString)
  {
    Map localMap = AppManager.a().a(Arrays.asList(paramArrayOfString));
    return new c().a(localMap);
  }

  @JavascriptInterface
  public final void getAppInfosAsync(String[] paramArrayOfString, String paramString)
  {
    ThreadPool.execute(new l(this, paramArrayOfString, paramString));
  }

  @JavascriptInterface
  public final int getAppState(String paramString)
  {
    return AppManager.a().i(paramString).ordinal();
  }

  @JavascriptInterface
  public final int getAppVersionCode(String paramString)
  {
    return p.b(paramString);
  }

  @JavascriptInterface
  public final String getAppVersionName(String paramString)
  {
    return p.c(paramString);
  }

  @JavascriptInterface
  public final String getAvatar()
  {
    return com.wandoujia.account.a.k();
  }

  @JavascriptInterface
  public final String getBrand()
  {
    return SystemUtil.getBrand();
  }

  @JavascriptInterface
  public final String getDownloadInfo(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      DownloadInfo localDownloadInfo = ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).a(paramString);
      return new c().a(CampaignDownloadInfo.from(localDownloadInfo));
    }
    return "";
  }

  @JavascriptInterface
  public final String getDownloadInfos(String[] paramArrayOfString)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      localLinkedList.add(CampaignDownloadInfo.from(((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).a(str)));
    }
    return new c().a(localLinkedList);
  }

  @JavascriptInterface
  public final String getFirstChannel()
  {
    return com.wandoujia.p4.configs.Config.l();
  }

  @JavascriptInterface
  public final String getFullVersionName()
  {
    return SystemUtil.getFullVersion();
  }

  @JavascriptInterface
  public final String getIMEI()
  {
    return SystemUtil.getImei(this.a);
  }

  @JavascriptInterface
  public final String getLastChannel()
  {
    return com.wandoujia.p4.configs.Config.m();
  }

  @JavascriptInterface
  public final String getLocaleCountry()
  {
    return Locale.getDefault().getCountry();
  }

  @JavascriptInterface
  public final String getLocaleLanguage()
  {
    return Locale.getDefault().getLanguage();
  }

  @JavascriptInterface
  public final String getNetworkInfo()
  {
    c localc = new c();
    com.wandoujia.p4.feedback.model.NetworkInfo localNetworkInfo = new com.wandoujia.p4.feedback.model.NetworkInfo();
    String str1 = ((TelephonyManager)GlobalConfig.getAppContext().getSystemService("phone")).getSubscriberId();
    String str2;
    String str3;
    if (str1 != null)
      if ((str1.startsWith("46000")) || (str1.startsWith("46002")))
      {
        str2 = GlobalConfig.getAppContext().getString(2131624766);
        localNetworkInfo.setProvider(str2);
        if (!NetworkUtil.isWifiConnected(GlobalConfig.getAppContext()))
          break label165;
        str3 = GlobalConfig.getAppContext().getString(2131624774);
      }
    while (true)
    {
      localNetworkInfo.setType(str3);
      return localc.a(localNetworkInfo);
      if (str1.startsWith("46001"))
      {
        str2 = GlobalConfig.getAppContext().getString(2131624768);
        break;
      }
      if (str1.startsWith("46003"))
      {
        str2 = GlobalConfig.getAppContext().getString(2131624767);
        break;
      }
      str2 = GlobalConfig.getAppContext().getString(2131624769);
      break;
      label165: if (NetworkUtil.isNetworkConnected());
      switch (((ConnectivityManager)GlobalConfig.getAppContext().getSystemService("connectivity")).getActiveNetworkInfo().getSubtype())
      {
      default:
        str3 = GlobalConfig.getAppContext().getString(2131624773);
        break;
      case 1:
      case 2:
      case 4:
      case 7:
      case 11:
        str3 = GlobalConfig.getAppContext().getString(2131624770);
        break;
      case 3:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 12:
      case 14:
      case 15:
        str3 = GlobalConfig.getAppContext().getString(2131624771);
        break;
      case 13:
        str3 = GlobalConfig.getAppContext().getString(2131624772);
      }
    }
  }

  @JavascriptInterface
  public final int getNetworkType()
  {
    return NetworkUtil.getNetworkType();
  }

  @JavascriptInterface
  public final String getNickName()
  {
    return com.wandoujia.account.a.l();
  }

  @JavascriptInterface
  public final int getNonSystemAppCount()
  {
    return AppManager.a().e();
  }

  @JavascriptInterface
  public final String getNonSystemApps()
  {
    List localList = AppManager.a().d();
    return new c().a(localList);
  }

  @JavascriptInterface
  public final void getNonSystemAppsAsync(String paramString)
  {
    ThreadPool.execute(new j(this, paramString));
  }

  @JavascriptInterface
  public final String getPhoneInfo()
  {
    c localc = new c();
    PhoneInfo localPhoneInfo = new PhoneInfo();
    localPhoneInfo.setCpuFamily(SystemUtil.getCpuFamily(GlobalConfig.getAppContext()));
    localPhoneInfo.setSdk(Build.VERSION.SDK_INT);
    localPhoneInfo.setGpuRenderer(com.wandoujia.ripple_framework.Config.k());
    localPhoneInfo.setGpuVendor(com.wandoujia.ripple_framework.Config.j());
    localPhoneInfo.setFeatures(FeatureInfos.genFeatureInfos(GlobalConfig.getAppContext().getPackageManager().getSystemAvailableFeatures()));
    return localc.a(localPhoneInfo);
  }

  @JavascriptInterface
  public final String getPhoneNumber()
  {
    return ((TelephonyManager)this.a.getSystemService("phone")).getLine1Number();
  }

  @JavascriptInterface
  public final int getSDKVersionInt()
  {
    return SystemUtil.getSdkVersionInt();
  }

  @JavascriptInterface
  public final int getSystemAppCount()
  {
    return AppManager.a().g();
  }

  @JavascriptInterface
  public final String getSystemApps()
  {
    List localList = AppManager.a().h();
    return new c().a(localList);
  }

  @JavascriptInterface
  public final void getSystemAppsAsync(String paramString)
  {
    ThreadPool.execute(new k(this, paramString));
  }

  @JavascriptInterface
  public final String getUDID()
  {
    return UDIDUtil.a(this.a);
  }

  @JavascriptInterface
  public final String getUID()
  {
    return com.wandoujia.account.a.t();
  }

  @JavascriptInterface
  public final int getUpgradableAppCount()
  {
    return AppManager.a().j();
  }

  @JavascriptInterface
  public final String getUpgradableApps()
  {
    List localList = AppManager.a().i();
    return new c().a(localList);
  }

  @JavascriptInterface
  public final void getUpgradableAppsAsync(String paramString)
  {
    ThreadPool.execute(new n(this, paramString));
  }

  @JavascriptInterface
  public final String getUpgradeIgnoredApps()
  {
    List localList = AppManager.a().k();
    return new c().a(localList);
  }

  @JavascriptInterface
  public final void getUpgradeIgnoredAppsAsync(String paramString)
  {
    ThreadPool.execute(new o(this, paramString));
  }

  @JavascriptInterface
  public final String getUserAuth()
  {
    return com.wandoujia.account.a.i();
  }

  @JavascriptInterface
  public final String getUserEmail()
  {
    return com.wandoujia.account.a.q();
  }

  @JavascriptInterface
  public final String getUserPhoneNumber()
  {
    return com.wandoujia.account.a.r();
  }

  @JavascriptInterface
  public final int getVersionCode()
  {
    return SystemUtil.getVersionCode(this.a);
  }

  @JavascriptInterface
  public final String getVersionName()
  {
    return SystemUtil.getVersionName(this.a);
  }

  @JavascriptInterface
  public final void install(String paramString1, String paramString2)
  {
    com.wandoujia.p4.app.a.a(paramString1);
  }

  @JavascriptInterface
  public final void install(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    p.a(this.a, paramString1, paramString2, paramString3, paramString4, paramInt);
  }

  @JavascriptInterface
  public final void installByPackage(String paramString)
  {
    p.d(this.a, paramString);
  }

  @JavascriptInterface
  public final void installInMarket(String paramString)
  {
    p.e(this.a, paramString);
  }

  @JavascriptInterface
  public final boolean isInstalled(String paramString)
  {
    return AppManager.a().h(paramString);
  }

  @JavascriptInterface
  public final boolean isLogin()
  {
    return com.wandoujia.account.a.z();
  }

  @JavascriptInterface
  public final boolean isUpgradable(String paramString)
  {
    return AppManager.a().g(paramString);
  }

  @JavascriptInterface
  public final void loginAccount()
  {
    AccountParams localAccountParams = new AccountParams("campaign", 0);
    AccountUtil.a(this.a, localAccountParams);
  }

  @JavascriptInterface
  public final void loginAccount(String paramString)
  {
    AccountParams localAccountParams = new AccountParams("campaign", 0);
    AccountUtil.a(this.a, localAccountParams, new h(this, paramString));
  }

  @JavascriptInterface
  public final boolean openApp(String paramString)
  {
    return p.a(paramString);
  }

  @JavascriptInterface
  public final void openAppDetail(String paramString)
  {
    ViewLogPackage.Element localElement = ViewLogPackage.Element.LABEL;
    ViewLogPackage.Action localAction = ViewLogPackage.Action.REDIRECT;
    com.wandoujia.p4.a.d().post(new f(this, localElement, localAction, "open_app_detail"));
    p.c(this.a, paramString);
  }

  @JavascriptInterface
  public final void openAppDetailWithoutAward(String paramString)
  {
    p.c(this.a, paramString);
  }

  @JavascriptInterface
  public final void openInBrowser(String paramString)
  {
    p.b(this.a, paramString);
  }

  @JavascriptInterface
  public final void openNewWebView(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Intent localIntent = new Intent(this.a, CampaignActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("phoenix.intent.extra.ACTION", "phoenix.intent.action.CAMPAIGN_WEBVIEW");
    localIntent.putExtra("phoenix.intent.extra.URL", paramString1);
    localIntent.putExtra("phoenix.intent.extra.TITLE", paramString2);
    localIntent.putExtra("phoenix.intent.extra.SHOW_ACTION_BAR", paramBoolean1);
    localIntent.putExtra("phoenix.intent.extra.IS_PORTRAIT", paramBoolean2);
    localIntent.putExtra("phoenix.intent.extra.IS_FULLSCREEN", paramBoolean3);
    this.a.startActivity(localIntent);
  }

  @JavascriptInterface
  public final void pauseApp(String paramString)
  {
    DownloadInfo localDownloadInfo = ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).a(paramString);
    ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).a(localDownloadInfo, DownloadManager.PauseReason.APP);
  }

  @JavascriptInterface
  public final void playGameVideo(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Intent localIntent = new Intent(JupiterApplication.e(), GameVideoPlayActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("phoenix.intent.extra.URL", paramString1);
    localIntent.putExtra("phoenix.intent.extra.IS_PORTRAIT", paramBoolean);
    localIntent.putExtra("phoenix.intent.extra.PACKAGE_NAME", paramString3);
    localIntent.putExtra("phoenix.intent.extra.TITLE", paramString2);
    JupiterApplication.e().startActivity(localIntent);
  }

  @JavascriptInterface
  public final void playGameVideo(String paramString, boolean paramBoolean)
  {
    Intent localIntent = new Intent(this.a, GameVideoPlayActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("phoenix.intent.extra.URL", paramString);
    localIntent.putExtra("phoenix.intent.extra.IS_PORTRAIT", paramBoolean);
    this.a.startActivity(localIntent);
  }

  @JavascriptInterface
  public final void resumeAsync(String paramString)
  {
    DownloadInfo localDownloadInfo = ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).a(paramString);
    ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).b(localDownloadInfo);
  }

  @JavascriptInterface
  public final void setClipboardText(String paramString)
  {
    ((ClipboardManager)this.a.getSystemService("clipboard")).setText(paramString);
  }

  @JavascriptInterface
  public final void setOrientation(boolean paramBoolean)
  {
    Activity localActivity = this.a;
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localActivity.setRequestedOrientation(i);
      return;
    }
  }

  @JavascriptInterface
  public final void share(String paramString1, String paramString2)
  {
    p.a(this.a, paramString1, paramString2);
  }

  @JavascriptInterface
  public final void shareTo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    p.a(this.a, paramString1, paramString2, paramString3, paramString4, paramString5);
  }

  @JavascriptInterface
  public final void shareTo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    SearchConst.ShareType localShareType = SearchConst.ShareType.valueOf(paramString5);
    if ((SearchConst.ShareType.WECHAT == localShareType) || (SearchConst.ShareType.WECHAT_TIMELINE == localShareType))
    {
      v.a(paramString6);
      v.a(this.b);
    }
    if (SearchConst.ShareType.SINA_WEIBO == localShareType)
    {
      EntryWeiboActivity.a(paramString6);
      EntryWeiboActivity.a(this.b);
    }
    p.a(this.a, paramString1, paramString2, paramString3, paramString4, paramString5);
  }

  @JavascriptInterface
  public final boolean startActivity(String paramString)
  {
    try
    {
      Intent localIntent = Intent.parseUri(paramString, 1);
      localIntent.addFlags(268435456);
      this.a.startActivity(localIntent);
      return true;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      return false;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      label28: break label28;
    }
  }

  @JavascriptInterface
  public final void toast(String paramString)
  {
    p.a(this.a, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.e
 * JD-Core Version:    0.6.0
 */