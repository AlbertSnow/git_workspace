package com.wandoujia.jupiter.search.utils;

public enum SearchConst$RankType
{
  private String rankType;

  static
  {
    APK_SIZE_ASC = new RankType("APK_SIZE_ASC", 2, "apkSizeAsc");
    WEEKLY_DOWNLOAD = new RankType("WEEKLY_DOWNLOAD", 3, "weekly");
    RankType[] arrayOfRankType = new RankType[4];
    arrayOfRankType[0] = INSTALL_COUNT;
    arrayOfRankType[1] = LATEST;
    arrayOfRankType[2] = APK_SIZE_ASC;
    arrayOfRankType[3] = WEEKLY_DOWNLOAD;
    $VALUES = arrayOfRankType;
  }

  private SearchConst$RankType(String paramString)
  {
    this.rankType = paramString;
  }

  public final String getRankType()
  {
    return this.rankType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.utils.SearchConst.RankType
 * JD-Core Version:    0.6.0
 */