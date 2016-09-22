package com.wandoujia.jupiter.paid.model;

import android.support.v4.app.d;
import android.text.TextUtils;
import com.wandoujia.gson.c;
import java.io.Serializable;

public class RecommendAppInfo
  implements Serializable
{
  public static final String APP_BATTERY = "battery";
  public static final String APP_CLEANER = "cleaner";
  public static final String ONLINE_CONFIG_FIELD = "recommend_app_info";
  public static final String POS_CONTENT = "content";
  public static final String POS_NOTIFICATION = "notification";
  public static final String POS_RECOMMEND = "recommend";
  public static final String POS_TOOLS = "tools";
  private static final String debugConfigs = "[{ \"ch\": \".*\", \"app\": \"cleaner\", \"pos\": \".*\", \"title\": \"极速清理\", \"packageName\": \"com.fastclean\", \"downloadUrl\": \"\", \"iconUrl\": \"http://img.wdjimg.com/mms/icon/v1/c/3a/40cf6ebdc6bdbefabd0f0b3890caf3ac.png\", \"versionName\": \"\", \"size\": 0, \"md5\": \"\"},\n{ \"ch\": \".*\", \"app\": \"battery\", \"pos\": \".*\", \"title\": \"省电宝\", \"packageName\": \"com.zhimahu\", \"downloadUrl\": \"\", \"iconUrl\": \"http://img.wdjimg.com/mms/icon/v1/e/00/f6769c7b8ffa3dd62dc7147cd5fc900e.png\", \"versionName\": \"\", \"size\": 0, \"md5\": \"\"}]";
  private static String sConfig;
  private static RecommendAppInfo[] sInfos;
  public String app = ".*";
  public String ch = ".*";
  public String downloadUrl = "";
  public String editorComment = "";
  public String iconUrl = "";
  public String md5 = "";
  public String packageName = "";
  public String pos = ".*";
  public long size = 0L;
  public String title = "";
  public String versionName = "";

  public static RecommendAppInfo get(String paramString1, String paramString2)
  {
    init();
    if (sInfos == null);
    while (true)
    {
      return null;
      for (RecommendAppInfo localRecommendAppInfo : sInfos)
        if ((paramString1.matches(localRecommendAppInfo.app)) && (paramString2.matches(localRecommendAppInfo.pos)))
          return localRecommendAppInfo;
    }
  }

  private static void init()
  {
    monitorenter;
    while (true)
    {
      String str1;
      try
      {
        str1 = d.n("recommend_app_info");
        if (TextUtils.isEmpty(str1))
        {
          str2 = "[{ \"ch\": \".*\", \"app\": \"cleaner\", \"pos\": \".*\", \"title\": \"极速清理\", \"packageName\": \"com.fastclean\", \"downloadUrl\": \"\", \"iconUrl\": \"http://img.wdjimg.com/mms/icon/v1/c/3a/40cf6ebdc6bdbefabd0f0b3890caf3ac.png\", \"versionName\": \"\", \"size\": 0, \"md5\": \"\"},\n{ \"ch\": \".*\", \"app\": \"battery\", \"pos\": \".*\", \"title\": \"省电宝\", \"packageName\": \"com.zhimahu\", \"downloadUrl\": \"\", \"iconUrl\": \"http://img.wdjimg.com/mms/icon/v1/e/00/f6769c7b8ffa3dd62dc7147cd5fc900e.png\", \"versionName\": \"\", \"size\": 0, \"md5\": \"\"}]";
          boolean bool = TextUtils.equals(str2, sConfig);
          if (bool)
            return;
          try
          {
            sInfos = (RecommendAppInfo[])new c().a(str2, [Lcom.wandoujia.jupiter.paid.model.RecommendAppInfo.class);
            sConfig = str2;
          }
          catch (Exception localException)
          {
          }
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      String str2 = str1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.model.RecommendAppInfo
 * JD-Core Version:    0.6.0
 */