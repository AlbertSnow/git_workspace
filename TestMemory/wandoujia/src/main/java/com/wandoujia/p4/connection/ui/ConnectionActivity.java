package com.wandoujia.p4.connection.ui;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.gson.c;
import com.wandoujia.p4.b.l;
import com.wandoujia.p4.http.b.ac;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.udid.UDIDUtil;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONException;

public class ConnectionActivity extends BaseActivity
{
  private Handler a = new a(this);
  private ConnectionFragment b;

  private void a(Intent paramIntent)
  {
    Uri localUri;
    if (paramIntent != null)
    {
      String str = paramIntent.getDataString();
      if (!TextUtils.isEmpty(str))
      {
        localUri = Uri.parse(str);
        if (localUri != null)
          break label26;
      }
    }
    return;
    label26: if (l.c().e())
    {
      a(localUri);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("phoenix.intent.extra.USER_AGENT", "phoenix");
    localIntent.putExtra("phoenix.intent.extra.SOURCE", 2);
    com.wandoujia.p4.connection.a.a.a(getApplicationContext(), localIntent);
    new b(this, localUri).start();
  }

  private void a(Uri paramUri)
  {
    String str1 = l.c().h();
    String str2 = paramUri.getQueryParameter("callback");
    String str3 = paramUri.getQueryParameter("pcid");
    if (!TextUtils.isEmpty(str1))
    {
      if (!TextUtils.isEmpty(str2))
      {
        String[] arrayOfString = str2.split("\\|");
        if (arrayOfString != null)
        {
          int i = arrayOfString.length;
          int j = 0;
          if (j < i)
          {
            String str4 = URLDecoder.decode(arrayOfString[j]);
            StringBuilder localStringBuilder2;
            if (!TextUtils.isEmpty(str4))
            {
              localStringBuilder2 = new StringBuilder();
              localStringBuilder2.append(str4);
              if (!str4.contains("?"))
                break label164;
              localStringBuilder2.append("&");
            }
            while (true)
            {
              localStringBuilder2.append("authcode=");
              localStringBuilder2.append(str1);
              localStringBuilder2.append("&udid=");
              localStringBuilder2.append(UDIDUtil.a(this));
              a(localStringBuilder2.toString());
              j++;
              break;
              label164: localStringBuilder2.append("?");
            }
          }
        }
      }
      if (TextUtils.isEmpty(str3));
    }
    try
    {
      c localc = new c();
      StringBuilder localStringBuilder1 = new StringBuilder("http://apppush.wandoujia.com/v1/push");
      localStringBuilder1.append("?did=");
      localStringBuilder1.append(str3);
      localStringBuilder1.append("&data=");
      localStringBuilder1.append(URLEncoder.encode(localc.a(new ConnectionActivity.PushContent("connect", UDIDUtil.a(this), str1))));
      a(localStringBuilder1.toString());
      return;
    }
    catch (JSONException localJSONException)
    {
    }
  }

  private static void a(String paramString)
  {
    HttpGet localHttpGet = new HttpGet(paramString);
    ac localac = new ac();
    localac.a(localHttpGet);
    com.wandoujia.p4.a.b().executeAsync(localac, null);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1000)
    {
      new com.wandoujia.p4.d.a();
      com.wandoujia.p4.d.a.a(this, paramIntent);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!com.wandoujia.p4.connection.a.a.b(this))
    {
      new com.wandoujia.p4.app.view.a.a(this, false).a();
      Intent localIntent = new Intent("phoenix.intent.action.OPEN_CONN_ACTIVITY");
      localIntent.addFlags(268435456);
      List localList = getPackageManager().queryIntentActivities(localIntent, 0);
      if ((localList == null) || (localList.size() <= 0))
        break label145;
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        if (!((ResolveInfo)localIterator.next()).activityInfo.exported)
          continue;
        startActivity(localIntent);
      }
    }
    label145: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label151;
      finish();
      return;
      if (!com.wandoujia.p4.connection.a.a.a(this))
        break;
      new com.wandoujia.p4.app.view.a.a(this, true).a();
      break;
    }
    label151: setContentView(2130903059);
    this.b = ((ConnectionFragment)getSupportFragmentManager().a(2131493146));
    setTitle(2131625523);
    a(getIntent());
  }

  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }

  protected void onResume()
  {
    super.onResume();
    l.c().a(this.a);
    com.wandoujia.p4.connection.a.a.a().b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.ConnectionActivity
 * JD-Core Version:    0.6.0
 */