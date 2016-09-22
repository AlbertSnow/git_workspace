package com.sina.weibo.sdk.auth.sso;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.c;
import com.sina.weibo.sdk.exception.WeiboDialogException;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.f;
import com.sina.weibo.sdk.g;

public final class SsoHandler
{
  private b a;
  private c b;
  private Activity c;
  private int d;
  private g e;
  private com.sina.weibo.sdk.auth.a f;
  private ServiceConnection g = new a(this);

  public SsoHandler(Activity paramActivity, com.sina.weibo.sdk.auth.a parama)
  {
    this.c = paramActivity;
    this.f = parama;
    this.a = new b(paramActivity, parama);
    this.e = f.a(paramActivity).a();
    com.sina.weibo.sdk.a.a.a(this.c).a(parama.a());
  }

  private boolean a(String paramString1, String paramString2)
  {
    int i = 1;
    Intent localIntent = new Intent();
    localIntent.setClassName(paramString1, paramString2);
    localIntent.putExtras(this.a.a().f());
    localIntent.putExtra("_weibo_command_type", 3);
    localIntent.putExtra("_weibo_transaction", String.valueOf(System.currentTimeMillis()));
    localIntent.putExtra("aid", android.support.v4.app.b.d(this.c, this.f.a()));
    if (!android.support.v4.app.b.a(this.c, localIntent))
      return false;
    String str = android.support.v4.app.b.d(this.c, this.f.a());
    if (!TextUtils.isEmpty(str))
      localIntent.putExtra("aid", str);
    try
    {
      this.c.startActivityForResult(localIntent, this.d);
      return i;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        i = 0;
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    new StringBuilder("requestCode: ").append(paramInt1).append(", resultCode: ").append(paramInt2).append(", data: ").append(paramIntent);
    if (paramInt1 == this.d)
    {
      if (paramInt2 != -1)
        break label247;
      if (android.support.v4.app.b.a(this.c, this.e, paramIntent))
        break label61;
    }
    label61: label247: 
    do
    {
      return;
      String str1 = paramIntent.getStringExtra("error");
      if (str1 == null)
        str1 = paramIntent.getStringExtra("error_type");
      if (str1 != null)
      {
        if ((str1.equals("access_denied")) || (str1.equals("OAuthAccessDeniedException")))
        {
          this.b.a();
          return;
        }
        String str2 = paramIntent.getStringExtra("error_description");
        if (str2 != null)
          str1 = str1 + ":" + str2;
        this.b.a(new WeiboDialogException(str1, paramInt2, str2));
        return;
      }
      Bundle localBundle = paramIntent.getExtras();
      com.sina.weibo.sdk.auth.b localb = com.sina.weibo.sdk.auth.b.a(localBundle);
      if ((localb != null) && (localb.a()))
      {
        new StringBuilder("Login Success! ").append(localb.toString());
        this.b.a(localBundle);
        return;
      }
      this.a.a(this.b);
      return;
    }
    while (paramInt2 != 0);
    if (paramIntent != null)
    {
      new StringBuilder("Login failed: ").append(paramIntent.getStringExtra("error"));
      this.b.a(new WeiboDialogException(paramIntent.getStringExtra("error"), paramIntent.getIntExtra("error_code", -1), paramIntent.getStringExtra("failing_url")));
      return;
    }
    this.b.a();
  }

  public final void a(c paramc)
  {
    SsoHandler.AuthType localAuthType = SsoHandler.AuthType.ALL;
    this.d = 32973;
    this.b = paramc;
    if (localAuthType == SsoHandler.AuthType.SsoOnly);
    for (int i = 1; ; i = 0)
    {
      if (localAuthType == SsoHandler.AuthType.WebOnly)
        this.a.a(paramc);
      label163: 
      while (true)
      {
        return;
        Context localContext = this.c.getApplicationContext();
        int j;
        label69: boolean bool;
        if ((this.e != null) && (this.e.c()))
        {
          j = 1;
          bool = false;
          if (j != 0)
            break label119;
        }
        while (true)
        {
          if (bool)
            break label163;
          if (i == 0)
            break label165;
          if (this.b == null)
            break;
          this.b.a(new WeiboException("not install weibo client!!!!!"));
          return;
          j = 0;
          break label69;
          label119: String str = this.e.a();
          Intent localIntent = new Intent("com.sina.weibo.remotessoservice");
          localIntent.setPackage(str);
          bool = localContext.bindService(localIntent, this.g, 1);
        }
      }
      label165: this.a.a(this.b);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.auth.sso.SsoHandler
 * JD-Core Version:    0.6.0
 */