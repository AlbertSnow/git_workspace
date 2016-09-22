package com.sina.weibo.sdk.net;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboException;
import java.io.File;

public class DownloadService extends IntentService
{
  private static final String a = DownloadService.class.getCanonicalName();
  private static final String b = com.sina.weibo.sdk.b.a;

  public DownloadService()
  {
    super(a);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle == null)
      stopSelf();
    while (true)
    {
      return;
      String str1 = localBundle.getString("download_url");
      String str2 = localBundle.getString("notification_content");
      new StringBuilder("onHandleIntent downLoadUrl:").append(str1).append("!!!!!");
      if (TextUtils.isEmpty(str1))
      {
        stopSelf();
        return;
      }
      Object localObject = "";
      String str3;
      String str4;
      try
      {
        str3 = HttpManager.b(getApplicationContext(), str1, "GET", new g(""));
        str4 = "";
        int i = str3.lastIndexOf("/");
        if (i != -1)
          str4 = str3.substring(i + 1, str3.length());
        if ((TextUtils.isEmpty(str4)) || (!str4.endsWith(".apk")))
        {
          stopSelf();
          return;
        }
      }
      catch (WeiboException localWeiboException)
      {
      }
      while ((!TextUtils.isEmpty((CharSequence)localObject)) && (new File((String)localObject).exists()))
      {
        android.support.v4.app.b.b(getApplicationContext(), str2, (String)localObject);
        return;
        String str5 = b;
        getApplicationContext();
        String str6 = HttpManager.a(str3, str5, str4);
        localObject = str6;
      }
    }
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
    if (paramIntent == null);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.DownloadService
 * JD-Core Version:    0.6.0
 */