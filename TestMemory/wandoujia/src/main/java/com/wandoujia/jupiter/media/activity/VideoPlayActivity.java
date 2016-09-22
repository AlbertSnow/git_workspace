package com.wandoujia.jupiter.media.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.Window;
import com.wandoujia.jupiter.media.view.VideoPlayFragment;

public class VideoPlayActivity extends FragmentActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    String str = getIntent().getStringExtra("videoUrl");
    if (TextUtils.isEmpty(str))
    {
      finish();
      return;
    }
    VideoPlayFragment localVideoPlayFragment = VideoPlayFragment.a(str);
    getSupportFragmentManager().a().b(16908290, localVideoPlayFragment).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.activity.VideoPlayActivity
 * JD-Core Version:    0.6.0
 */