package com.tencent.connect.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.open.a.f;
import com.tencent.open.utils.o;
import com.tencent.tauth.b;
import org.json.JSONObject;

public class AssistActivity extends Activity
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = false;
  private Handler d = new a(this);

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    StringBuilder localStringBuilder = new StringBuilder("--onActivityResult--requestCode: ").append(paramInt1).append(" | resultCode: ").append(paramInt2).append("data = null ? ");
    if (paramIntent == null);
    for (boolean bool = true; ; bool = false)
    {
      f.c("openSDK_LOG.AssistActivity", bool);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      if (paramInt1 != 0)
        break;
      return;
    }
    if (paramIntent != null)
      paramIntent.putExtra("key_action", "action_login");
    if (paramIntent == null)
    {
      f.d("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
      setResult(0, paramIntent);
    }
    while (true)
    {
      finish();
      return;
      try
      {
        String str1 = paramIntent.getStringExtra("key_response");
        f.b("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- " + str1);
        if (TextUtils.isEmpty(str1))
          break label231;
        JSONObject localJSONObject = new JSONObject(str1);
        String str2 = localJSONObject.optString("openid");
        String str3 = localJSONObject.optString("access_token");
        if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str3)))
          break label215;
        f.c("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
        setResult(-1, paramIntent);
      }
      catch (Exception localException)
      {
        f.e("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
      }
      continue;
      label215: f.d("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
      setResult(0, paramIntent);
      continue;
      label231: f.d("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
      setResult(-1, paramIntent);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    setRequestedOrientation(3);
    f.b("openSDK_LOG.AssistActivity", "--onCreate--");
    if (getIntent() == null)
    {
      f.e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
      finish();
    }
    Intent localIntent = (Intent)getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
    int i;
    if (localIntent == null)
      i = 0;
    Bundle localBundle;
    while (true)
    {
      localBundle = getIntent().getBundleExtra("h5_share_data");
      if (paramBundle != null)
        this.a = paramBundle.getBoolean("RESTART_FLAG");
      if (this.a)
        break label400;
      if (localBundle != null)
        break label184;
      if (localIntent == null)
        break;
      f.c("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + i);
      if (localIntent.getComponent() != null)
      {
        this.b = false;
        startActivityForResult(localIntent, i);
        return;
        i = localIntent.getIntExtra("key_request_code", 0);
        continue;
      }
      this.b = true;
      this.c = false;
      startActivity(localIntent);
      return;
    }
    f.e("openSDK_LOG.AssistActivity", "--onCreate--activityIntent is null");
    finish();
    return;
    label184: f.d("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
    String str1 = localBundle.getString("viaShareType");
    String str2 = localBundle.getString("callbackAction");
    String str3 = localBundle.getString("url");
    String str4 = localBundle.getString("openId");
    String str5 = localBundle.getString("appId");
    String str6 = "";
    String str7 = "";
    if ("shareToQQ".equals(str2))
    {
      str6 = "ANDROIDQQ.SHARETOQQ.XX";
      str7 = "10";
      if (o.a(this, str3))
        break label370;
      b localb = e.a().a(str2);
      if (localb != null)
        localb.a(new com.tencent.tauth.d(-6, "打开浏览器失败!"));
      com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(str4, str5, str6, str7, "3", "1", str1, "0", "2", "0");
      finish();
    }
    while (true)
    {
      getIntent().removeExtra("shareH5");
      return;
      if (!"shareToQzone".equals(str2))
        break;
      str6 = "ANDROIDQQ.SHARETOQZ.XX";
      str7 = "11";
      break;
      label370: com.tencent.open.b.d.a();
      com.tencent.open.b.d.a(str4, str5, str6, str7, "3", "0", str1, "0", "2", "0");
    }
    label400: f.b("openSDK_LOG.AssistActivity", "is restart");
  }

  protected void onDestroy()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onDestroy");
    super.onDestroy();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    f.c("openSDK_LOG.AssistActivity", "--onNewIntent");
    super.onNewIntent(paramIntent);
    paramIntent.putExtra("key_action", "action_share");
    setResult(-1, paramIntent);
    if (!isFinishing())
    {
      f.c("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
      finish();
    }
  }

  protected void onPause()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onPause");
    if (this.b)
    {
      if (!this.c)
        break label35;
      this.d.removeMessages(0);
    }
    while (true)
    {
      super.onPause();
      return;
      label35: this.c = true;
    }
  }

  protected void onResume()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onResume");
    super.onResume();
    Intent localIntent = getIntent();
    if (localIntent.getBooleanExtra("is_login", false));
    do
    {
      return;
      if ((localIntent.getBooleanExtra("is_qq_mobile_share", false)) || (!this.a) || (isFinishing()))
        continue;
      finish();
    }
    while ((!this.b) || (!this.c));
    Message localMessage = this.d.obtainMessage(0);
    this.d.sendMessageDelayed(localMessage, 200L);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    f.b("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
    paramBundle.putBoolean("RESTART_FLAG", true);
    super.onSaveInstanceState(paramBundle);
  }

  protected void onStart()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onStart");
    super.onStart();
  }

  protected void onStop()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onStop");
    super.onStop();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.common.AssistActivity
 * JD-Core Version:    0.6.0
 */