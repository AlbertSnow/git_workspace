package com.tencent.connect.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.b.c;
import com.tencent.open.utils.o;

public abstract class b
{
  protected c a;

  private b(c paramc)
  {
    this.a = paramc;
  }

  public b(c paramc, byte paramByte)
  {
    this(paramc);
  }

  protected static void a(Activity paramActivity, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramActivity.getApplicationContext(), AssistActivity.class);
    if (paramBoolean)
      localIntent.putExtra("is_qq_mobile_share", true);
    localIntent.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", paramIntent);
    paramActivity.startActivityForResult(localIntent, paramInt);
  }

  protected static void a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    paramIntent.putExtra("key_request_code", paramInt);
    Intent localIntent = new Intent(paramActivity.getApplicationContext(), AssistActivity.class);
    localIntent.putExtra("is_login", true);
    localIntent.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", paramIntent);
    paramActivity.startActivityForResult(localIntent, paramInt);
  }

  protected final Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("format", "json");
    localBundle.putString("status_os", Build.VERSION.RELEASE);
    localBundle.putString("status_machine", Build.MODEL);
    localBundle.putString("status_version", Build.VERSION.SDK);
    localBundle.putString("sdkv", "2.9.4");
    localBundle.putString("sdkp", "a");
    if ((this.a != null) && (this.a.a()))
    {
      localBundle.putString("access_token", this.a.c());
      localBundle.putString("oauth_consumer_key", this.a.b());
      localBundle.putString("openid", this.a.d());
      localBundle.putString("appid_for_getting_config", this.a.b());
    }
    localBundle.putString("pf", android.support.v4.app.b.t().getSharedPreferences("pfStore", 0).getString("pf", "openmobile_android"));
    return localBundle;
  }

  protected final String a(String paramString)
  {
    Bundle localBundle = a();
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
      localBundle.putString("need_version", paramString);
    localStringBuilder.append("http://openmobile.qq.com/oauth2.0/m_jump_by_version?");
    localStringBuilder.append(o.a(localBundle));
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.common.b
 * JD-Core Version:    0.6.0
 */