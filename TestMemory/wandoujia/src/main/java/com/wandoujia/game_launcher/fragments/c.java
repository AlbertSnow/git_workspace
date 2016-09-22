package com.wandoujia.game_launcher.fragments;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.wandoujia.base.utils.IntentUtils;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class c
  implements View.OnClickListener
{
  c(GLHomeFragment paramGLHomeFragment)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("wdj://search/history"));
    if (IntentUtils.canHandleIntent(paramView.getContext(), localIntent))
    {
      this.a.startActivity(localIntent);
      b.a(paramView, "game_launcher", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, this.a.getString(R.string.title_search_game));
      return;
    }
    Toast.makeText(paramView.getContext(), R.string.toast_no_wdj_game, 0).show();
    this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.wandoujia.com")));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.fragments.c
 * JD-Core Version:    0.6.0
 */