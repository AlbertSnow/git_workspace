package com.wandoujia.game_launcher.views;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.game_launcher.lib.R.string;

final class a
  implements View.OnClickListener
{
  a(GameRecommendCellView paramGameRecommendCellView)
  {
  }

  public final void onClick(View paramView)
  {
    if (NetworkUtil.isNetworkConnected(GlobalConfig.getAppContext()))
    {
      this.a.a(GameRecommendCellView.a(this.a));
      return;
    }
    Toast.makeText(GlobalConfig.getAppContext(), R.string.toast_no_network, 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.a
 * JD-Core Version:    0.6.0
 */