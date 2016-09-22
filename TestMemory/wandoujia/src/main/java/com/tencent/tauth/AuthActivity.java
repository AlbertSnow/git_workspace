package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.open.a.f;
import com.tencent.open.utils.o;
import org.json.JSONObject;

public class AuthActivity extends Activity
{
  private static int a = 0;

  private static void a(String paramString)
  {
    f.a("openSDK_LOG.AuthActivity", "execAuthCallback url = " + paramString);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      f.d("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
      return;
    }
    try
    {
      Uri localUri2 = getIntent().getData();
      localUri1 = localUri2;
      f.a("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + localUri1);
      f.c("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
      if ((localUri1 == null) || (localUri1.toString() == null) || (localUri1.toString().equals("")))
      {
        f.d("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
        return;
      }
    }
    catch (Exception localException1)
    {
      Uri localUri1;
      while (true)
      {
        f.e("openSDK_LOG.AuthActivity", "-->onCreate, getIntent().getData() has exception! " + localException1.getMessage());
        localUri1 = null;
      }
      String str1 = localUri1.toString();
      Bundle localBundle1 = o.a(str1.substring(1 + str1.indexOf("#")));
      if (localBundle1 == null)
      {
        f.d("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
        finish();
        return;
      }
      String str2 = localBundle1.getString("action");
      f.c("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + str2);
      if (str2 == null)
      {
        a(str1);
        return;
      }
      if ((str2.equals("shareToQQ")) || (str2.equals("shareToQzone")) || (str2.equals("addToQQFavorites")) || (str2.equals("sendToMyComputer")) || (str2.equals("shareToTroopBar")))
      {
        if ((str2.equals("shareToQzone")) && (b.e(this, "com.tencent.mobileqq") != null) && (b.f(this, "5.2.0") < 0))
        {
          int i = 1 + a;
          a = i;
          if (i == 2)
          {
            a = 0;
            finish();
            return;
          }
        }
        f.c("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
        Intent localIntent1 = new Intent(this, AssistActivity.class);
        localIntent1.putExtras(localBundle1);
        localIntent1.setFlags(603979776);
        startActivity(localIntent1);
        finish();
        return;
      }
      if (str2.equals("sharePrize"))
      {
        Intent localIntent2 = getPackageManager().getLaunchIntentForPackage(getPackageName());
        String str3 = localBundle1.getString("response");
        Object localObject = "";
        try
        {
          String str4 = o.c(str3).getString("activityid");
          localObject = str4;
          if (!TextUtils.isEmpty((CharSequence)localObject))
          {
            localIntent2.putExtra("sharePrize", true);
            Bundle localBundle2 = new Bundle();
            localBundle2.putString("activityid", (String)localObject);
            localIntent2.putExtras(localBundle2);
          }
          startActivity(localIntent2);
          finish();
          return;
        }
        catch (Exception localException2)
        {
          while (true)
            f.b("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", localException2);
        }
      }
      a(str1);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.tauth.AuthActivity
 * JD-Core Version:    0.6.0
 */