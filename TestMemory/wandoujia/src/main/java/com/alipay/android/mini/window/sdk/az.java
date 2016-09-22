package com.alipay.android.mini.window.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.alipay.wandoujia.x;
import com.wandoujia.image.c.a;
import java.util.HashSet;

public final class az
{
  private SharedPreferences a;

  static
  {
    new HashSet();
  }

  public az()
  {
    Context localContext = a.a().b();
    this.a = localContext.getSharedPreferences("msp_guides", 0);
    String str1 = x.a(localContext).a();
    String str2 = this.a.getString("version", "");
    if ((!TextUtils.isEmpty(str2)) && (!TextUtils.equals(str2, str1)))
    {
      this.a.edit().putString("version", str1).commit();
      this.a.edit().putBoolean("info", false).putBoolean("switch", false).putBoolean("desc", false).commit();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.az
 * JD-Core Version:    0.6.0
 */