package com.wandoujia.entities.app;

import android.text.Html;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

public class AppLiteInfo
  implements IAppLiteInfo, Serializable
{
  public static final int AD_TYPE_BRAND = 1;
  public static final String NEW_APP = "新品";
  public static final String RELEASE_FIRST = "首发";
  public static final String WANDOUBI = "支持豌豆币";
  private static final long serialVersionUID = -615428477935783505L;
  private boolean ad;
  private int adType;
  private List<ApkObbInfo> apkObbs;
  private List<ApkLiteInfo> apks;
  private String appType;
  private String availableInfo;
  private AwardLiteInfo award;
  private String banner;
  private String cateAlias;
  private String cateName;
  private String cdkey;
  private String cdkeyId;
  private String changelog;
  private String commentInCard;
  private String content;
  private String description;
  private String detailParam;
  private String directions;
  private String editorComment;
  private long editorDate;
  private long endDateStamp;
  private String exchangeDateRange;
  private int exclusiveBadge;
  private List<ExtensionPack> extensionPacks;
  private String feedDetail;
  private long giftId;
  private String giftTitle;
  private String giftType;
  private String iconPath;
  private IconSet icons;
  private String imprUrl;
  private String installedCountStr;
  private boolean isApp = true;
  private boolean isFreeTraffic = false;
  private int likesRate;
  private String packageName;
  private String pinYin;
  private String provideType;
  private long publishDate;
  private AppLiteInfo.Screenshots screenshots;
  private String section_tagline;
  private StatLiteInfo stat;
  private String subject;
  private String tagline;
  private List<AppLiteInfo.Tag> tags;
  private String title;
  private int trusted;
  private UseInfo useInfo;

  public AppLiteInfo()
  {
  }

  public AppLiteInfo(String paramString1, String paramString2)
  {
    this.isApp = false;
    this.cateAlias = paramString1;
    this.cateName = paramString2;
  }

  public AppLiteInfo clone()
  {
    return clone();
  }

  public List<ApkObbInfo> getApkObbs()
  {
    return this.apkObbs;
  }

  public List<ApkLiteInfo> getApks()
  {
    return this.apks;
  }

  public String getAppGiftCdKey()
  {
    return this.cdkey;
  }

  public String getAppGiftCdKeyId()
  {
    return this.cdkeyId;
  }

  public String getAppGiftContent()
  {
    return this.content;
  }

  public String getAppGiftDirections()
  {
    return this.directions;
  }

  public long getAppGiftEndDateStamp()
  {
    return this.endDateStamp;
  }

  public String getAppGiftExchangeDateRange()
  {
    return this.exchangeDateRange;
  }

  public long getAppGiftId()
  {
    return this.giftId;
  }

  public String getAppGiftProvideType()
  {
    return this.provideType;
  }

  public String getAppGiftSubject()
  {
    return this.subject;
  }

  public boolean getAppLiteAd()
  {
    return this.ad;
  }

  public int getAppLiteAdType()
  {
    return this.adType;
  }

  public boolean getAppLiteCompatible()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return true;
    return ((ApkLiteInfo)this.apks.get(0)).getCompatible() == 1;
  }

  public String getAppLiteDescription()
  {
    return this.description;
  }

  public String getAppLiteDetailParam()
  {
    return this.detailParam;
  }

  public String getAppLiteDisplayStatUrl()
  {
    return this.imprUrl;
  }

  public String getAppLiteDownloadCountStr()
  {
    return this.installedCountStr;
  }

  public String getAppLiteDownloadUrl()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return "";
    if (((ApkLiteInfo)this.apks.get(0)).getDownloadUrl() == null)
      return "";
    return ((ApkLiteInfo)this.apks.get(0)).getDownloadUrl().getUrl();
  }

  public String getAppLiteEditorComment()
  {
    return this.editorComment;
  }

  public String getAppLiteGiftTitle()
  {
    return this.giftTitle;
  }

  public String getAppLiteIcon()
  {
    if (this.icons == null)
      return "";
    return this.icons.getSuitableIconUrl();
  }

  public List<String> getAppLiteIncompatibleDetail()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return null;
    return ((ApkLiteInfo)this.apks.get(0)).getIncompatibleDetail();
  }

  public boolean getAppLiteIsAward()
  {
    return (this.award != null) && (this.award.getIssue() > 0);
  }

  public int getAppLiteLikesRate()
  {
    return this.likesRate;
  }

  public String getAppLiteMd5()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return null;
    return ((ApkLiteInfo)this.apks.get(0)).getMd5();
  }

  public String getAppLitePackageName()
  {
    return this.packageName;
  }

  public String getAppLitePaidStatus()
  {
    if ((this.apks == null) || (this.apks.isEmpty()))
      return null;
    return ((ApkLiteInfo)this.apks.get(0)).getPaidType();
  }

  public int getAppLiteSize()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return 0;
    return ((ApkLiteInfo)this.apks.get(0)).getBytes();
  }

  public String getAppLiteTitle()
  {
    return this.title;
  }

  public int getAppLiteVersionCode()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return 0;
    return ((ApkLiteInfo)this.apks.get(0)).getVersionCode();
  }

  public String getAppLiteWeeklyDownloadCountStr()
  {
    if (this.stat != null)
      return this.stat.getWeeklyStr();
    return null;
  }

  public String getAppType()
  {
    return this.appType;
  }

  public AwardLiteInfo getAward()
  {
    return this.award;
  }

  public String getBanner()
  {
    return this.banner;
  }

  public String getDescription()
  {
    return this.description;
  }

  public List<ExtensionPack> getExtensionPacks()
  {
    return this.extensionPacks;
  }

  public IconSet getIcons()
  {
    return this.icons;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public StatLiteInfo getStat()
  {
    return this.stat;
  }

  public String getTagline()
  {
    return this.tagline;
  }

  public List<? extends IAppLiteInfo.ITag> getTags()
  {
    return this.tags;
  }

  public String getTitle()
  {
    return this.title;
  }

  public UseInfo getUseInfo()
  {
    return this.useInfo;
  }

  public boolean isAd()
  {
    return this.ad;
  }

  public boolean isApp()
  {
    return this.isApp;
  }

  public boolean isFreeTraffic()
  {
    return this.isFreeTraffic;
  }

  public boolean isTrusted()
  {
    return this.trusted == 1;
  }

  public void setDescription(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      paramString = Html.fromHtml(paramString).toString();
    this.description = paramString;
  }

  public void setIcons(IconSet paramIconSet)
  {
    this.icons = paramIconSet;
  }

  public void setIsFreeTraffic(boolean paramBoolean)
  {
    this.isFreeTraffic = paramBoolean;
  }

  public void setTitle(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      paramString = Html.fromHtml(paramString).toString();
    this.title = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.AppLiteInfo
 * JD-Core Version:    0.6.0
 */