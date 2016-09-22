package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharePrefSubmitor
{
  private static final ExecutorService pool = Executors.newSingleThreadExecutor();

  @TargetApi(9)
  public static void submit(SharedPreferences.Editor paramEditor)
  {
    if (SystemUtil.aboveApiLevel(9))
    {
      paramEditor.apply();
      return;
    }
    pool.execute(new g(paramEditor));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.SharePrefSubmitor
 * JD-Core Version:    0.6.0
 */