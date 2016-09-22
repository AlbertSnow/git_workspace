package com.wandoujia.p4.game.acitvity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class GameVideoActivity extends BaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getIntent().getStringExtra("page_api_url");
    if (TextUtils.isEmpty(str))
      str = "http://www.wandoujia.com/game-vertical/video";
    setTitle(2131624854);
    Bundle localBundle = new Bundle();
    localBundle.putString("phoenix.intent.extra.URL", str);
    a locala = new a();
    locala.setArguments(localBundle);
    getSupportFragmentManager().a().b(16908290, locala).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.acitvity.GameVideoActivity
 * JD-Core Version:    0.6.0
 */