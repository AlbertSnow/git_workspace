package com.wandoujia.udid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.wandoujia.base.utils.SharePrefSubmitor;

final class a extends Thread
{
  a(String paramString1, Context paramContext, String paramString2)
  {
  }

  public final void run()
  {
    if (!TextUtils.isEmpty(this.a))
    {
      SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.b).edit();
      localEditor.putString(this.c, this.a);
      SharePrefSubmitor.submit(localEditor);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.udid.a
 * JD-Core Version:    0.6.0
 */