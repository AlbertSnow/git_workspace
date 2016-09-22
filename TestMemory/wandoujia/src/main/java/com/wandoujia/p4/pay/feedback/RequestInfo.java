package com.wandoujia.p4.pay.feedback;

public class RequestInfo
{
  public static final RequestInfo APPLECORE_APP_BOUTIQUE_BANNER;
  public static final RequestInfo APPLECORE_APP_BOUTIQUE_FASHION;
  public static final RequestInfo APPLECORE_APP_BOUTIQUE_LATEST;
  public static final RequestInfo APPLECORE_APP_BOUTIQUE_SCORE;
  public static final RequestInfo APPLECORE_APP_DETAIL;
  public static final RequestInfo APPLECORE_APP_FEATURED_GAMES;
  public static final RequestInfo APPLECORE_APP_HOMEPAGE;
  public static final RequestInfo APPLECORE_APP_LIST_ALL;
  public static final RequestInfo APPLECORE_APP_LIST_APPROLL;
  public static final RequestInfo APPLECORE_APP_LIST_AWARD;
  public static final RequestInfo APPLECORE_APP_LIST_RECOMMEND;
  public static final RequestInfo APPLECORE_APP_LIST_RISE;
  public static final RequestInfo APPLECORE_APP_LIST_UCAPP;
  public static final RequestInfo APPLECORE_GAME_LIST_AWARD;
  public static final RequestInfo APPLECORE_SPECIAL;
  public static final RequestInfo APPLECORE_TAGS;
  public static final RequestInfo GET_APP_COMMENT_CAPTCHA = new RequestInfo("GetAppCommentCaptcha", "http://api.wandoujia.com/v1/comments/captcha");
  public static final RequestInfo PAYMENT_ZENDESK_CREATE_TICKET;
  public static final RequestInfo ZENDESK_CREATE_TICKET;
  private final String mName;
  private final String mURL;

  static
  {
    APPLECORE_APP_LIST_RISE = new RequestInfo("GetRise", "http://api.wandoujia.com/v1/apps?type=noteworthy");
    APPLECORE_APP_LIST_ALL = new RequestInfo("GetAllApp", "http://api.wandoujia.com/v1/apps?type=total");
    APPLECORE_APP_DETAIL = new RequestInfo("GetDetail", "http://api.wandoujia.com/v1/apps/");
    APPLECORE_APP_LIST_RECOMMEND = new RequestInfo("GetRecommend", "http://api.wandoujia.com/v1/recommendations/users");
    APPLECORE_APP_LIST_AWARD = new RequestInfo("GetAward", "http://api.wandoujia.com/v1/apps?type=award&appType=APP");
    APPLECORE_GAME_LIST_AWARD = new RequestInfo("GetAward", "http://api.wandoujia.com/v1/apps?type=award&appType=GAME");
    APPLECORE_APP_LIST_UCAPP = new RequestInfo("GetUCChannel", "http://api.wandoujia.com/v1/apps?type=ucapp");
    APPLECORE_APP_LIST_APPROLL = new RequestInfo("GetAppRoll", "http://api.wandoujia.com/v1/apps?type=approll");
    APPLECORE_APP_BOUTIQUE_FASHION = new RequestInfo("GetFashion", "http://api.wandoujia.com/v1/boutique?type=fashion");
    APPLECORE_APP_BOUTIQUE_LATEST = new RequestInfo("GetLaster", "http://api.wandoujia.com/v1/boutique?type=latest");
    APPLECORE_APP_BOUTIQUE_SCORE = new RequestInfo("GetScore", "http://api.wandoujia.com/v1/boutique?type=score");
    APPLECORE_APP_BOUTIQUE_BANNER = new RequestInfo("GetBanner", "http://api.wandoujia.com/v1/boutique?type=banner");
    APPLECORE_APP_FEATURED_GAMES = new RequestInfo("GetBanner", "http://api.wandoujia.com/v1/apps?type=featuredgames");
    APPLECORE_APP_HOMEPAGE = new RequestInfo("GetHomePage", "http://api.wandoujia.com/v1/apps?app_type=mobileindex");
    ZENDESK_CREATE_TICKET = new RequestInfo("CreateTicket", "http://android.help.wandoujia.com/zendesk/api/v2/tickets.json");
    PAYMENT_ZENDESK_CREATE_TICKET = new RequestInfo("CreateTicket", "http://devrel.help.wandoujia.com/zendesk/api/v2/tickets.json");
    APPLECORE_SPECIAL = new RequestInfo("GetSpecial", "http://api.wandoujia.com/v1/special/");
    APPLECORE_TAGS = new RequestInfo("GetTag", "http://api.wandoujia.com/v1/apps");
  }

  public RequestInfo(String paramString1, String paramString2)
  {
    this.mURL = paramString2;
    this.mName = paramString1;
  }

  public static RequestInfo createCategoryAppsRequestInfo(String paramString)
  {
    return new RequestInfo("GetCategoryApps_" + paramString, APPLECORE_APP_LIST_ALL.getURL() + "&category=" + paramString);
  }

  public static RequestInfo createSpecialRequestInfo(String paramString)
  {
    return new RequestInfo(APPLECORE_SPECIAL.getTypeInfo() + "_" + paramString, APPLECORE_SPECIAL.getURL() + paramString);
  }

  public static RequestInfo createTagsRequestInfo(String paramString1, String paramString2)
  {
    return new RequestInfo(APPLECORE_TAGS.getTypeInfo() + "_" + paramString1, APPLECORE_TAGS.getURL() + "?type=" + paramString2 + "&tag=" + paramString1);
  }

  public String getDetailUrl(String paramString)
  {
    return this.mURL;
  }

  public String getTypeInfo()
  {
    return this.mName;
  }

  public String getURL()
  {
    return this.mURL;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.RequestInfo
 * JD-Core Version:    0.6.0
 */