package com.wandoujia.entities.app;

import com.wandoujia.entities.game.GameDetailInfo;
import java.io.Serializable;
import java.util.List;

public class AppDetailInfo
  implements IAppDetailInfo, Serializable
{
  private boolean ad;
  private int adType;
  private String alias;
  private List<ApkObbInfo> apkObbs;
  private List<ApkDetailInfo> apks;
  private String appType;
  private AwardLiteInfo award;
  private String banner;
  private List<BelongInfo> categories;
  private int commentsCount;
  private String description;
  private String detailParam;
  private Developer developer;
  private int dislikesCount;
  private String editorComment;
  private List<ExtensionPack> extensionPacks;
  private Extra extra;
  private GameDetailInfo game;
  private Integer gsfType;
  private IconSet icons;
  private int id;
  private String imprUrl;
  private String installedCountStr;
  private boolean isFreeTraffic;
  private int likesCount;
  private int likesRate;
  private String packageName;
  private ScreenShotSet screenshots;
  private String tagline;
  private List<AppDetailInfo.Tag> tags;
  private String title;
  private String titleEn;
  private int trusted;
  private long updatedDate;

  public int getAdType()
  {
    return this.adType;
  }

  public String getAlias()
  {
    return this.alias;
  }

  public List<ApkObbInfo> getApkObbs()
  {
    return this.apkObbs;
  }

  public List<ApkDetailInfo> getApks()
  {
    return this.apks;
  }

  public boolean getAppDetailCompatible()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return true;
    return ((ApkDetailInfo)this.apks.get(0)).getCompatible() == 1;
  }

  public String getAppDetailDownloadUrl()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return "";
    if (((ApkDetailInfo)this.apks.get(0)).getDownloadUrl() == null)
      return "";
    return ((ApkDetailInfo)this.apks.get(0)).getDownloadUrl().getUrl();
  }

  public String getAppDetailIcon()
  {
    if (this.icons == null)
      return "";
    return this.icons.getSuitableIconUrl();
  }

  public List<String> getAppDetailIncompatibleDetail()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return null;
    return ((ApkDetailInfo)this.apks.get(0)).getIncompatibleDetail();
  }

  public String getAppDetailMd5()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return null;
    return ((ApkDetailInfo)this.apks.get(0)).getMd5();
  }

  public String getAppDetailPackageName()
  {
    return this.packageName;
  }

  public String getAppDetailPaidStatus()
  {
    if ((this.apks == null) || (this.apks.isEmpty()))
      return null;
    return ((ApkDetailInfo)this.apks.get(0)).getPaidType();
  }

  public int getAppDetailSize()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return 0;
    return ((ApkDetailInfo)this.apks.get(0)).getBytes();
  }

  public String getAppDetailTitle()
  {
    return this.title;
  }

  public int getAppDetailVersionCode()
  {
    if ((this.apks == null) || (this.apks.size() <= 0))
      return 0;
    return ((ApkDetailInfo)this.apks.get(0)).getVersionCode();
  }

  public String getAppLiteDetailParam()
  {
    return this.detailParam;
  }

  public String getAppLiteDisplayStatUrl()
  {
    return this.imprUrl;
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

  public List<BelongInfo> getCategories()
  {
    return this.categories;
  }

  public String getDescription()
  {
    return this.description;
  }

  public Developer getDeveloper()
  {
    return this.developer;
  }

  public List<ExtensionPack> getExtensionPacks()
  {
    return this.extensionPacks;
  }

  public Extra getExtra()
  {
    return this.extra;
  }

  public GameDetailInfo getGame()
  {
    return this.game;
  }

  public IconSet getIcons()
  {
    return this.icons;
  }

  public int getId()
  {
    return this.id;
  }

  public String getImprUrl()
  {
    return this.imprUrl;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getTagline()
  {
    return this.tagline;
  }

  public List<? extends IAppDetailInfo.ITag> getTags()
  {
    return this.tags;
  }

  public String getTitle()
  {
    return this.title;
  }

  public boolean isAd()
  {
    return this.ad;
  }

  public boolean isFreeTraffic()
  {
    return this.isFreeTraffic;
  }

  public void setExtra(Extra paramExtra)
  {
    this.extra = paramExtra;
  }

  public void setIsFreeTraffic(boolean paramBoolean)
  {
    this.isFreeTraffic = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.AppDetailInfo
 * JD-Core Version:    0.6.0
 */