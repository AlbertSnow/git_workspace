package com.wandoujia.game_launcher;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.game_launcher.models.GameRecommendModel;
import com.wandoujia.game_launcher.models.RecommendModel;

final class b
  implements Runnable
{
  b(String paramString, d paramd)
  {
  }

  public final void run()
  {
    GameRecommendModel localGameRecommendModel = android.support.v4.app.b.B(this.a);
    if ((localGameRecommendModel != null) && (localGameRecommendModel.getRecommend() != null))
    {
      a.a(this.b, localGameRecommendModel.getRecommend(), true);
      RecommendModel localRecommendModel = localGameRecommendModel.getRecommend();
      if ((!TextUtils.isEmpty("daily_recommend_cache")) && (localRecommendModel != null))
      {
        if (android.support.v4.app.b.j(GlobalConfig.getAppContext(), "daily_recommend_cache"))
          GlobalConfig.getAppContext().deleteFile("daily_recommend_cache");
        android.support.v4.app.b.a(GlobalConfig.getAppContext(), "daily_recommend_cache", localRecommendModel);
      }
      return;
    }
    a.a(this.b, null, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.b
 * JD-Core Version:    0.6.0
 */