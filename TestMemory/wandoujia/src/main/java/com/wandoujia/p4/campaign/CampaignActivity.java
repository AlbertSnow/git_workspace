package com.wandoujia.p4.campaign;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.Window;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class CampaignActivity extends BaseActivity
{
  private CampaignFragment a;

  public static String a(String paramString1, String paramString2)
  {
    try
    {
      String str = URLEncoder.encode(paramString1, "UTF-8");
      paramString1 = str;
      label11: Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString1;
      if (paramString2 == null)
        paramString2 = "";
      arrayOfObject[1] = paramString2;
      return String.format("wdj://web/campaign?url=%1$s&title=%2$s", arrayOfObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label11;
    }
  }

  private void a(Intent paramIntent)
  {
    Object localObject = paramIntent.getDataString();
    String str1;
    String str4;
    label46: String str2;
    String str3;
    if (localObject != null)
    {
      str1 = ((String)localObject).toLowerCase();
      if ((str1 == null) || (!str1.startsWith("wdj://web")))
        break label438;
      Uri localUri = Uri.parse((String)localObject);
      if (!str1.startsWith("wdj://web/doraemon"))
        break label424;
      str4 = "phoenix.intent.action.DORAEMON_WEBVIEW";
      String str5 = localUri.getQueryParameter("url");
      String str6 = localUri.getQueryParameter("title");
      localObject = str5;
      str2 = str4;
      str3 = str6;
      label75: if (!paramIntent.hasExtra("phoenix.intent.extra.IS_PORTRAIT"))
        break label526;
    }
    label526: for (Boolean localBoolean1 = Boolean.valueOf(paramIntent.getBooleanExtra("phoenix.intent.extra.IS_PORTRAIT", true)); ; localBoolean1 = null)
    {
      if (paramIntent.hasExtra("phoenix.intent.extra.SHOW_ACTION_BAR"));
      for (Boolean localBoolean2 = Boolean.valueOf(paramIntent.getBooleanExtra("phoenix.intent.extra.SHOW_ACTION_BAR", true)); ; localBoolean2 = null)
      {
        if (paramIntent.hasExtra("phoenix.intent.extra.IS_FULLSCREEN"));
        for (Boolean localBoolean3 = Boolean.valueOf(paramIntent.getBooleanExtra("phoenix.intent.extra.IS_FULLSCREEN", false)); ; localBoolean3 = null)
        {
          boolean bool = paramIntent.hasExtra("phoenix.intent.extra.SHOW_MORE_MENU");
          Boolean localBoolean4 = null;
          if (bool)
            localBoolean4 = Boolean.valueOf(paramIntent.getBooleanExtra("phoenix.intent.extra.SHOW_MORE_MENU", true));
          if ((TextUtils.isEmpty((CharSequence)localObject)) && (getIntent() != null) && (getIntent().getExtras() != null))
            localObject = getIntent().getExtras().getString("page_api_url");
          if ((TextUtils.isEmpty((CharSequence)localObject)) && (getIntent() != null) && (getIntent().getData() != null))
            localObject = getIntent().getData().toString();
          Bundle localBundle = new Bundle();
          if (!TextUtils.isEmpty(str2))
            localBundle.putString("phoenix.intent.extra.ACTION", str2);
          if (!TextUtils.isEmpty((CharSequence)localObject))
          {
            localBundle.putString("phoenix.intent.extra.URL", (String)localObject);
            label279: if (!TextUtils.isEmpty(str3))
              localBundle.putString("phoenix.intent.extra.TITLE", str3);
            if (localBoolean1 != null)
              if (!localBoolean1.booleanValue())
                break label508;
          }
          label424: label438: label508: for (int i = 1; ; i = 0)
          {
            setRequestedOrientation(i);
            if ((localBoolean3 != null) && (localBoolean3.booleanValue()))
              getWindow().setFlags(1024, 1024);
            if (localBoolean2 != null)
              localBundle.putBoolean("phoenix.intent.extra.SHOW_ACTION_BAR", localBoolean2.booleanValue());
            if (localBoolean4 != null)
              localBundle.putBoolean("phoenix.intent.extra.SHOW_MORE_MENU", localBoolean4.booleanValue());
            this.a = new CampaignFragment();
            this.a.setArguments(localBundle);
            getSupportFragmentManager().a().b(16908290, this.a).a();
            return;
            str1 = null;
            break;
            str1.startsWith("wdj://web/campaign");
            str4 = "phoenix.intent.action.CAMPAIGN_WEBVIEW";
            break label46;
            if ((str1 != null) && ((str1.startsWith("http://")) || (str1.startsWith("https://"))))
            {
              str2 = "phoenix.intent.action.CAMPAIGN_WEBVIEW";
              str3 = paramIntent.getStringExtra("phoenix.intent.extra.TITLE");
              break label75;
            }
            str2 = paramIntent.getStringExtra("phoenix.intent.extra.ACTION");
            localObject = paramIntent.getStringExtra("phoenix.intent.extra.URL");
            str3 = paramIntent.getStringExtra("phoenix.intent.extra.TITLE");
            break label75;
            finish();
            break label279;
          }
        }
      }
    }
  }

  public void onBackPressed()
  {
    if ((this.a != null) && (this.a.b()))
      return;
    super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.CampaignActivity
 * JD-Core Version:    0.6.0
 */