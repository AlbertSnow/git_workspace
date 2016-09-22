package com.sina.weibo.sdk.api.share;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboShareException;
import com.sina.weibo.sdk.g;

class l
  implements e
{
  private Context a;
  private String b;
  private g c = null;
  private boolean d = true;
  private Dialog e = null;

  static
  {
    l.class.getName();
  }

  public l(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
    this.d = false;
    this.c = com.sina.weibo.sdk.f.a(paramContext).a();
    if (this.c != null)
      this.c.toString();
    com.sina.weibo.sdk.a.a.a(paramContext).a(paramString);
  }

  private static boolean a(Activity paramActivity, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramActivity == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)))
      return false;
    Intent localIntent = new Intent();
    localIntent.setPackage(paramString2);
    localIntent.setAction(paramString1);
    String str = paramActivity.getPackageName();
    localIntent.putExtra("_weibo_sdkVersion", "0030105000");
    localIntent.putExtra("_weibo_appPackage", str);
    localIntent.putExtra("_weibo_appKey", paramString3);
    localIntent.putExtra("_weibo_flag", 538116905);
    localIntent.putExtra("_weibo_sign", com.sina.weibo.sdk.a.f.a(android.support.v4.app.b.c(paramActivity, str)));
    localIntent.putExtras(paramBundle);
    try
    {
      new StringBuilder("launchWeiboActivity intent=").append(localIntent).append(", extra=").append(localIntent.getExtras());
      paramActivity.startActivityForResult(localIntent, 765);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      localActivityNotFoundException.getMessage();
    }
    return false;
  }

  public final boolean a()
  {
    return (this.c != null) && (this.c.c());
  }

  public final boolean a(Activity paramActivity, b paramb)
  {
    try
    {
      boolean bool = this.d;
      if (a())
        break label174;
      if (bool)
      {
        if (this.e == null)
        {
          Context localContext = this.a;
          String str1 = "提示";
          String str2 = "未安装微博客户端，是否现在去下载？";
          String str3 = "现在下载";
          String str4 = "以后再说";
          if (!android.support.v4.app.b.i(localContext.getApplicationContext()))
          {
            str1 = "Notice";
            str2 = "Sina Weibo client is not installed, download now?";
            str3 = "Download Now";
            str4 = "Download Later";
          }
          this.e = new AlertDialog.Builder(localContext).setMessage(str2).setTitle(str1).setPositiveButton(str3, new j(localContext)).setNegativeButton(str4, new k()).create();
          this.e.show();
          break label282;
        }
        if (this.e.isShowing())
          break label282;
        this.e.show();
      }
    }
    catch (Exception localException)
    {
      localException.getMessage();
      return false;
    }
    throw new WeiboShareException("Weibo is not installed!");
    label174: if (!b())
      throw new WeiboShareException("Weibo do not support share api!");
    if (!com.sina.weibo.sdk.a.a(this.a, this.c.a()))
      throw new WeiboShareException("Weibo signature is incorrect!");
    label282: for (int i = 1; i != 0; i = 0)
    {
      g localg = this.c;
      new h();
      if (!paramb.a(localg))
        break;
      Bundle localBundle = new Bundle();
      paramb.a(localBundle);
      return a(paramActivity, "com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY", this.c.a(), this.b, localBundle);
    }
    return false;
  }

  public final boolean a(Intent paramIntent, d paramd)
  {
    String str1 = paramIntent.getStringExtra("_weibo_appPackage");
    String str2 = paramIntent.getStringExtra("_weibo_transaction");
    if (TextUtils.isEmpty(str1))
      return false;
    if (!(paramd instanceof Activity))
      return false;
    Activity localActivity = (Activity)paramd;
    localActivity.getCallingPackage();
    if (TextUtils.isEmpty(str2))
      return false;
    if ((!com.sina.weibo.sdk.a.a(this.a, str1)) && (!str1.equals(localActivity.getPackageName())))
      return false;
    paramd.a(new f(paramIntent.getExtras()));
    return true;
  }

  public final boolean b()
  {
    if ((this.c == null) || (!this.c.c()));
    for (int i = -1; i >= 10350; i = this.c.b())
      return true;
    return false;
  }

  public final boolean c()
  {
    Context localContext = this.a;
    String str1 = this.b;
    Intent localIntent = new Intent("com.sina.weibo.sdk.Intent.ACTION_WEIBO_REGISTER");
    String str2 = localContext.getPackageName();
    localIntent.putExtra("_weibo_sdkVersion", "0030105000");
    localIntent.putExtra("_weibo_appPackage", str2);
    localIntent.putExtra("_weibo_appKey", str1);
    localIntent.putExtra("_weibo_flag", 538116905);
    localIntent.putExtra("_weibo_sign", com.sina.weibo.sdk.a.f.a(android.support.v4.app.b.c(localContext, str2)));
    if (!TextUtils.isEmpty(null))
      localIntent.setPackage(null);
    new StringBuilder("intent=").append(localIntent).append(", extra=").append(localIntent.getExtras());
    localContext.sendBroadcast(localIntent, "com.sina.weibo.permission.WEIBO_SDK_PERMISSION");
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.l
 * JD-Core Version:    0.6.0
 */