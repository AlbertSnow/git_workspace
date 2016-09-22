package com.wandoujia.p4.http.request;

public enum OptionFields
{
  private final String optionFields;

  static
  {
    APPS_LITE = new OptionFields("APPS_LITE", 2, "apps.apks.compatible,apps.apks.incompatibleDetail,apps.title,apps.packageName,apps.ad,apps.appType,apps.icons.px256,apps.installedCountStr,apps.apks.downloadUrl.url,apps.apks.bytes,apps.apks.verified,apps.apks.versionName,apps.apks.versionCode,apps.detailParam,apps.imprUrl,apps.stat.weeklyStr,apps.exclusiveBadge,apps.apks.md5,apps.editorComment,apps.description,apps.apks.paidType,apps.likesRate,apps.apks.superior,apps.extensionPacks.*,apps.tags.*,apkObbs.*");
    CATEGORY = new OptionFields("CATEGORY", 3, "apps.apks.compatible,apps.apks.incompatibleDetail,apps.title,apps.packageName,apps.ad,apps.appType,apps.icons.px256,apps.installedCountStr,apps.apks.downloadUrl.url,apps.apks.bytes,apps.apks.verified,apps.apks.versionName,apps.apks.versionCode,category.alias,category.name,apps.detailParam,apps.imprUrl,apps.apks.md5,apps.editorComment,apps.description,apps.apks.paidType,apps.likesRate,apps.apks.superior,apps.extensionPacks.*,apps.tags.*,apps.award.issue,apkObbs.*");
    TAG = new OptionFields("TAG", 4, "apps.apks.creation,apps.apks.compatible,apps.apks.incompatibleDetail,apps.title,apps.packageName,apps.ad,apps.appType,apps.icons.px256,apps.installedCountStr,apps.apks.downloadUrl.url,apps.apks.bytes,apps.apks.verified,apps.apks.versionName,apps.apks.versionCode,category.alias,category.name,apps.detailParam,apps.imprUrl,apps.apks.md5,apps.editorComment,apps.description,apps.apks.paidType,apps.likesRate,apps.apks.superior,apps.extensionPacks.*,apps.tags.*,apps.award.issue,apkObbs.*,apps.publishDate");
    TAG_WITH_CATEGORY = new OptionFields("TAG_WITH_CATEGORY", 5, "category.*,specialApps" + TAG.optionFields);
    APP_SPECIAL_SUB_CATEGORY = new OptionFields("APP_SPECIAL_SUB_CATEGORY", 6, "tag.*,availableApps,specialApps.app.apks.creation,specialApps.app.apks.compatible,specialApps.app.apks.incompatibleDetail,specialApps.app.title,specialApps.app.packageName,specialApps.app.ad,specialApps.app.appType,specialApps.app.icons.px256,specialApps.app.installedCountStr,specialApps.app.apks.downloadUrl.url,specialApps.app.apks.bytes,specialApps.app.apks.verified,specialApps.app.apks.versionName,specialApps.app.apks.versionCode,specialApps.app.detailParam,specialApps.app.imprUrl,specialApps.app.apks.md5,specialApps.app.editorComment,specialApps.app.description,specialApps.app.apks.paidType,specialApps.app.likesRate,specialApps.app.apks.superior,specialApps.app.extensionPacks.*,specialApps.app.tags.*,specialApps.app.award.issue,specialApps.app.publishDate,specialApps.banner,specialApps.highlight,specialApps.snippet,specialApps.isAvailable," + TAG_WITH_CATEGORY.getOptionFields());
    CATEGORY_SUMMARY = new OptionFields("CATEGORY_SUMMARY", 7, "category.*,related_categories.*,select.*,summary.category.*,summary.apps.apks.compatible,summary.apps.apks.incompatibleDetail,summary.apps.title,summary.apps.packageName,summary.apps.ad,apps.appType,summary.apps.icons.px256,summary.apps.installedCountStr,summary.apps.apks.downloadUrl.url,summary.apps.apks.bytes,summary.apps.apks.verified,summary.apps.apks.versionName,summary.apps.apks.versionCode,summary.apps.detailParam,summary.apps.imprUrl,summary.apps.stat.weeklyStr,summary.apps.exclusiveBadge,summary.apps.apks.md5,summary.apps.editorComment,summary.apps.description,summary.apps.apks.paidType,summary.apps.likesRate,summary.apps.apks.superior,summary.apps.extensionPacks.*,summary.apps.tags.*,summary.apkObbs.*");
    APP_WITH_RANKING = new OptionFields("APP_WITH_RANKING", 8, "curAlbum.*,albums.*," + APPS_LITE.optionFields);
    RECOMMEND = new OptionFields("RECOMMEND", 9, "app.apks.compatible,app.apks.incompatibleDetail,app.title,apps.appType,app.packageName,app.description,app.ad,app.icons.px256,app.installedCountStr,app.apks.downloadUrl.url,app.apks.bytes,app.apks.verified,app.apks.versionName,app.apks.versionCode,app.detailParam,app.imprUrl,recReason.reasonType,recReason.label,recReason.reasonContent,app.exclusiveBadge,app.apks.md5,apps.apks.paidType,app.likesRate,app.apks.superior,app.extensionPacks.*,app.tags.*,apkObbs.*");
    HISTORY = new OptionFields("HISTORY", 10, "app.apks.compatible,app.apks.incompatibleDetail,app.title,app.packageName,app.ad,app.icons.px256,app.installedCountStr,app.appType,app.apks.downloadUrl.url,app.apks.bytes,app.apks.verified,app.apks.versionName,app.apks.versionCode,app.detailParam,app.imprUrl,recReason.reasonType,recReason.label,recReason.reasonContent,app.exclusiveBadge,app.apks.md5,apps.apks.paidType,app.likesRate,app.apks.superior,userAppInfo.installedTime,app.extensionPacks.*,tags.*,apkObbs.*");
    AWARD = new OptionFields("AWARD", 11, "apks.compatible,apks.incompatibleDetail,title,packageName,ad,appType,icons.px256,installedCountStr,apks.downloadUrl.url,apks.bytes,apks.verified,apks.versionName,apks.versionCode,detailParam,imprUrl,apks.md5,editorComment,description,apks.paidType,likesRate,apks.superior,extensionPacks.*,tags.*,award.issue,apkObbs.*");
    FRIENDS = new OptionFields("FRIENDS", 12, "apks.compatible,apks.incompatibleDetail,title,packageName,ad,appType,icons.px256,installedCountStr,apks.downloadUrl.url,apks.bytes,apks.verified,apks.versionName,apks.versionCode,detailParam,stat.weeklyStr,exclusiveBadge,apks.md5,editorComment,description,apks.paidType,likesRate,apks.superior,extensionPacks.*,tags.*,apkObbs.*");
    BANNER = new OptionFields("BANNER", 13, "apks.compatible,apks.incompatibleDetail,title,packageName,ad,appType,icons.px256,installedCountStr,apks.downloadUrl.url,apks.bytes,apks.verified,apks.versionName,apks.versionCode,detailParam,imprUrl,stat.weeklyStr,banner,apks.md5,apks.paidType,likesRate,apks.superior,extensionPacks.*,apkObbs.*,apkObbs.*");
    LITE_DETAIL = new OptionFields("LITE_DETAIL", 14, "icons.px256,title,apks.downloadUrl.url,apks.size");
    QR_DETAIL = new OptionFields("QR_DETAIL", 15, "icons.px256,title,apks.size,apks.bytes,packageName,installedCountStr");
    LITE_BACKUP = new OptionFields("LITE_BACKUP", 16, "icons.px256,packageName");
    LITE_APP_FEEDS = new OptionFields("LITE_APP_FEEDS", 17, "cursor,adsCursor,data.app.apks.compatible,data.app.apks.incompatibleDetail,data.reason.*,data.app.title,data.app.packageName,data.app.ad,data.appType,data.app.icons.px256,data.app.installedCountStr,data.app.apks.downloadUrl.url,data.app.apks.bytes,data.app.apks.verified,data.app.apks.versionName,data.app.apks.versionCode,data.app.detailParam,data.app.imprUrl,data.app.stat.weeklyStr,data.app.exclusiveBadge,data.app.apks.md5,data.app.editorComment,data.app.description,data.app.award.issue,data.app.apks.superior,data.app.apks.paidType,data.app.likesRate,data.app.tags.*,data.app.extensionPacks.*,apkObbs.*");
    LITE_APP_MUST_HAVE = new OptionFields("LITE_APP_MUST_HAVE", 18, "apks.compatible,apks.incompatibleDetail,title,packageName,ad,appType,icons.px256,installedCountStr,apks.downloadUrl.url,apks.bytes,apks.verified,apks.versionName,apks.versionCode,detailParam,imprUrl,stat.weeklyStr,exclusiveBadge,apks.md5,editorComment,description,apks.paidType,likesRate,apks.superior,extensionPacks.*,tags.*,apkObbs.*");
    SEARCH_APP = new OptionFields("SEARCH_APP", 19, "apks.compatible,apks.incompatibleDetail,title,packageName,ad,appType,icons.px256,installedCountStr,apks.downloadUrl.url,apks.bytes,apks.verified,apks.versionName,apks.versionCode,detailParam,imprUrl,stat.weeklyStr,exclusiveBadge,apks.md5,editorComment,description,apks.paidType,likesRate,apks.superior,extensionPacks.*,apkObbs.*");
    MIX_SEARCH = new OptionFields("MIX_SEARCH", 20, "apks.compatible,apks.incompatibleDetail,title,packageName,ad,appType,icons.px256,installedCountStr,apks.downloadUrl.url,apks.bytes,apks.verified,apks.versionName,apks.versionCode,detailParam,imprUrl,stat.weeklyStr,exclusiveBadge,apks.md5,editorComment,description,apks.paidType,likesRate,apks.superior,extensionPacks.*,apkObbs.*");
    APP_DESCRIPTION = new OptionFields("APP_DESCRIPTION", 21, "description");
    VIDEO_TV_LITE = new OptionFields("VIDEO_TV_LITE", 22, "noDownloadUrls,noPlayInfos,downloadCount,recommend,description,id,type,title,directors,actors,latestEpisodeNum,latestEpisodeDate,totalEpisodesNum,marketRatings.*,cover.*,pictures.*,categories.*,subscribeUrl");
    VIDEO_VARIETY_LITE = new OptionFields("VIDEO_VARIETY_LITE", 23, "noDownloadUrls,noPlayInfos,downloadCount,recommend,description,updatedDate,id,type,title,presenters,latestEpisodeNum,totalEpisodesNum,marketRatings.*,cover.*,pictures.*,categories.*,latestEpisodeDate,subscribeUrl");
    VIDEO_COMIC_LITE = new OptionFields("VIDEO_COMIC_LITE", 24, "noDownloadUrls,noPlayInfos,downloadCount,recommend,description,id,type,title,actors,latestEpisodeNum,latestEpisodeDate,totalEpisodesNum,marketRatings.*,cover.*,pictures.*,categories.*,region,subscribeUrl");
    VIDEO_SHORT_VIDEO_LITE = new OptionFields("VIDEO_SHORT_VIDEO_LITE", 25, "createdDate,noDownloadUrls,noPlayInfos,recommend,downloadCount,description,id,type,title,directors,actors,marketRatings.*,cover.*,pictures.*,categories.*,region,videoEpisodes.id,videoEpisodes.episodeNum,videoEpisodes.downloadUrls.*,videoEpisodes.playInfo.*,subscribeUrl");
    VIDEO_MOVIE_LITE = new OptionFields("VIDEO_MOVIE_LITE", 26, "noDownloadUrls,noPlayInfos,downloadCount,recommend,description,id,type,title,directors,actors,marketRatings.*,cover.*,pictures.*,categories.*,region,videoEpisodes.id,videoEpisodes.episodeNum,videoEpisodes.downloadUrls.*,videoEpisodes.playInfo.*,subscribeUrl");
    VIDEO_SUBSCRIBE_LITE = new OptionFields("VIDEO_SUBSCRIBE_LITE", 27, "noDownloadUrls,noPlayInfos,downloadCount,recommend,description,id,type,title,directors,actors,presenters,marketRatings.*,cover.*,pictures.*,categories.*,region,videoEpisodes.id,videoEpisodes.episodeDate,videoEpisodes.episodeNum,latestEpisodeNum,latestEpisodeDate,totalEpisodesNum,updatedDate,marketComments.*,subscribeUrl");
    VIDEO_DETAIL_LITE = new OptionFields("VIDEO_DETAIL_LITE", 28, "releaseDate,recommend,previewEpisodes.*,totalSize,createdDate,noDownloadUrls,noPlayInfos,downloadCount,description,id,type,title,directors,actors,presenters,marketRatings.*,cover.*,pictures.*,categories.*,region,videoEpisodes.id,videoEpisodes.episodeDate,videoEpisodes.title,videoEpisodes.episodeNum,videoEpisodes.downloadUrls.*,videoEpisodes.playInfo.*,latestEpisodeNum,latestEpisodeDate,totalEpisodesNum,updatedDate,marketComments.*,subscribeUrl,tags,providerNames");
    VIDEO_EPISODES_LITE = new OptionFields("VIDEO_EPISODES_LITE", 29, "noDownloadUrls,noPlayInfos,videoEpisodes.id,videoEpisodes.episodeDate,videoEpisodes.title,videoEpisodes.episodeNum,videoEpisodes.downloadUrls.*,videoEpisodes.playInfo.*");
    VIDEO_DETAIL_EPISODES = new OptionFields("VIDEO_DETAIL_EPISODES", 30, "noDownloadUrls,noPlayInfos,downloadCount,description,id,type,title,cover.*,directors,actors,presenters,pictures.*,latestEpisodeNum,latestEpisodeDate,totalEpisodesNum,updatedDate,subscribeUrl,videoEpisodes.id,videoEpisodes.title,videoEpisodes.episodeDate,videoEpisodes.episodeNum,videoEpisodes.downloadUrls.*,videoEpisodes.playInfo.*,providerNames");
    VIDEO_SEARCH_LITE = new OptionFields("VIDEO_SEARCH_LITE", 31, "noDownloadUrls,noPlayInfos,downloadCount,recommend,description,updatedDate,actors,latestEpisodeNum,totalEpisodesNum,latestEpisodeDate,presenters,marketRatings.*,title,pictures.*,cover.*,categories.*,region,videoEpisodes.id,videoEpisodes.episodeNum,videoEpisodes.downloadUrls.*,videoEpisodes.playInfo.*,type,id");
    VIDEO_DETAIL_MICRO = new OptionFields("VIDEO_DETAIL_MICRO", 32, "noDownloadUrls,noPlayInfos,downloadCount,description,id,type,title,directors,actors,presenters,cover.*,pictures.*,latestEpisodeNum,latestEpisodeDate,totalEpisodesNum,updatedDate,subscribeUrl,videoEpisodes.id,videoEpisodes.episodeNum,providerNames");
    APP_SPECIAL_LIST = new OptionFields("APP_SPECIAL_LIST", 33, "special.*," + APPS_LITE.optionFields);
    APP_SPECIAL_LIST_RELATED = new OptionFields("APP_SPECIAL_LIST_RELATED", 34, "special.name,special.intro,special.alias,apps.icons.*");
    EBOOK_LIST_LITE = new OptionFields("EBOOK_LIST_LITE", 35, "category.*,cover.*,id,title,status,description,totalChaptersNum,latestEpisodeTitle,updatedDate,rating,publishType,subscribeUrl,totalReadCount,weeklyReadCount,monthlyReadCount,providerOpenInfos.*,authors,sourceChapterListUrl,onlyProviderOpen");
    EBOOK_LIST_RECOMMENDATIONS = new OptionFields("EBOOK_LIST_RECOMMENDATIONS", 36, "category.*,cover.*,id,title,status,totalChaptersNum,latestEpisodeTitle,updatedDate,rating,publishType,subscribeUrl,totalReadCount,weeklyReadCount,monthlyReadCount,providerOpenInfos.*,authors,sourceChapterListUrl,onlyProviderOpen");
    WALLPAPER_LIST = new OptionFields("WALLPAPER_LIST", 37, "category.name,description,promotType,providerPackageNames,downloadUrl,id,height,image,providerNames,size,source,sourceUrl,tags,thumbnail,width");
    WALLPAPER_CATEGORIES = new OptionFields("WALLPAPER_CATEGORIES", 38, "id,name,thumbnail,wallpapers");
    AUTOINSTALL = new OptionFields("AUTOINSTALL", 39, "isBlocked");
    DARK_KNOWLEDGE = new OptionFields("DARK_KNOWLEDGE", 40, "app.packageName,app.icons.*,id,image,showIcon,showNumber,showTitle,title,subtitle,uri,cardType");
    OptionFields[] arrayOfOptionFields = new OptionFields[41];
    arrayOfOptionFields[0] = DETAIL;
    arrayOfOptionFields[1] = LITE;
    arrayOfOptionFields[2] = APPS_LITE;
    arrayOfOptionFields[3] = CATEGORY;
    arrayOfOptionFields[4] = TAG;
    arrayOfOptionFields[5] = TAG_WITH_CATEGORY;
    arrayOfOptionFields[6] = APP_SPECIAL_SUB_CATEGORY;
    arrayOfOptionFields[7] = CATEGORY_SUMMARY;
    arrayOfOptionFields[8] = APP_WITH_RANKING;
    arrayOfOptionFields[9] = RECOMMEND;
    arrayOfOptionFields[10] = HISTORY;
    arrayOfOptionFields[11] = AWARD;
    arrayOfOptionFields[12] = FRIENDS;
    arrayOfOptionFields[13] = BANNER;
    arrayOfOptionFields[14] = LITE_DETAIL;
    arrayOfOptionFields[15] = QR_DETAIL;
    arrayOfOptionFields[16] = LITE_BACKUP;
    arrayOfOptionFields[17] = LITE_APP_FEEDS;
    arrayOfOptionFields[18] = LITE_APP_MUST_HAVE;
    arrayOfOptionFields[19] = SEARCH_APP;
    arrayOfOptionFields[20] = MIX_SEARCH;
    arrayOfOptionFields[21] = APP_DESCRIPTION;
    arrayOfOptionFields[22] = VIDEO_TV_LITE;
    arrayOfOptionFields[23] = VIDEO_VARIETY_LITE;
    arrayOfOptionFields[24] = VIDEO_COMIC_LITE;
    arrayOfOptionFields[25] = VIDEO_SHORT_VIDEO_LITE;
    arrayOfOptionFields[26] = VIDEO_MOVIE_LITE;
    arrayOfOptionFields[27] = VIDEO_SUBSCRIBE_LITE;
    arrayOfOptionFields[28] = VIDEO_DETAIL_LITE;
    arrayOfOptionFields[29] = VIDEO_EPISODES_LITE;
    arrayOfOptionFields[30] = VIDEO_DETAIL_EPISODES;
    arrayOfOptionFields[31] = VIDEO_SEARCH_LITE;
    arrayOfOptionFields[32] = VIDEO_DETAIL_MICRO;
    arrayOfOptionFields[33] = APP_SPECIAL_LIST;
    arrayOfOptionFields[34] = APP_SPECIAL_LIST_RELATED;
    arrayOfOptionFields[35] = EBOOK_LIST_LITE;
    arrayOfOptionFields[36] = EBOOK_LIST_RECOMMENDATIONS;
    arrayOfOptionFields[37] = WALLPAPER_LIST;
    arrayOfOptionFields[38] = WALLPAPER_CATEGORIES;
    arrayOfOptionFields[39] = AUTOINSTALL;
    arrayOfOptionFields[40] = DARK_KNOWLEDGE;
    $VALUES = arrayOfOptionFields;
  }

  private OptionFields(String paramString)
  {
    this.optionFields = paramString;
  }

  public final String getOptionFields()
  {
    return this.optionFields;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.OptionFields
 * JD-Core Version:    0.6.0
 */