package com.wandoujia.gamepacket;

import android.support.v4.app.d;
import java.io.IOException;
import java.net.URLEncoder;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

final class p
  implements Runnable
{
  private String a;

  public p(String paramString)
  {
    this.a = paramString;
  }

  public final void run()
  {
    if (this.a != null);
    try
    {
      HttpGet localHttpGet = new HttpGet("http://games.wandoujia.com/api/v1/game/vertical/datapacket/cputype?gpuRenderer=" + URLEncoder.encode(this.a, "UTF-8"));
      d.l(EntityUtils.toString(new DefaultHttpClient().execute(localHttpGet).getEntity()));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.p
 * JD-Core Version:    0.6.0
 */