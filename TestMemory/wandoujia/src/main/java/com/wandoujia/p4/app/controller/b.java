package com.wandoujia.p4.app.controller;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.Uri.Builder;
import com.wandoujia.entities.app.RequestInfo;
import com.wandoujia.p4.http.b.ac;
import com.wandoujia.rpc.http.util.PhoenixAuthorizeUtil;
import java.lang.ref.WeakReference;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

final class b
  implements Runnable
{
  private final WeakReference<c> a;

  b(c paramc)
  {
    this.a = new WeakReference(paramc);
  }

  public final void run()
  {
    try
    {
      Uri.Builder localBuilder = Uri.parse(PhoenixAuthorizeUtil.appendAuthorizeParam(RequestInfo.GET_APP_COMMENT_CAPTCHA.getURL(), com.wandoujia.p4.a.a())).buildUpon();
      localBuilder.appendQueryParameter("source", "phone");
      HttpGet localHttpGet = new HttpGet(localBuilder.build().toString());
      localHttpGet.addHeader("Cookie", "wdj_auth=" + com.wandoujia.account.a.i());
      ac localac = new ac();
      localac.a(localHttpGet);
      HttpResponse localHttpResponse = (HttpResponse)com.wandoujia.p4.a.b().execute(localac);
      if ((localHttpResponse != null) && (localHttpResponse.getStatusLine().getStatusCode() == 200))
      {
        HttpEntity localHttpEntity = localHttpResponse.getEntity();
        if (localHttpEntity != null)
        {
          byte[] arrayOfByte = EntityUtils.toByteArray(localHttpEntity);
          if (arrayOfByte != null)
          {
            Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
            if (localBitmap != null)
            {
              c localc = (c)this.a.get();
              if (localc != null)
                localc.a(localBitmap);
            }
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.controller.b
 * JD-Core Version:    0.6.0
 */