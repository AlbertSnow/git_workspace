package com.wandoujia.p4.netcheck.a;

import android.text.TextUtils;
import com.wandoujia.base.utils.IOUtils;
import com.wandoujia.rpc.http.processor.Processor;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

final class d
  implements Processor<HttpResponse, String, IOException>
{
  public static String a(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse.getStatusLine().getStatusCode() == 200)
    {
      String str1 = IOUtils.readString(paramHttpResponse.getEntity().getContent(), "UTF-8");
      String str2 = str1.substring(5 + str1.indexOf("src"));
      String str3 = str2.substring(0, str2.indexOf("\""));
      if (!TextUtils.isEmpty(str3))
      {
        HttpGet localHttpGet = new HttpGet(str3);
        try
        {
          HttpResponse localHttpResponse = new DefaultHttpClient().execute(localHttpGet);
          if (localHttpResponse.getStatusLine().getStatusCode() == 200)
          {
            String str4 = IOUtils.readString(localHttpResponse.getEntity().getContent(), "UTF-8");
            return str4;
          }
        }
        catch (IOException localIOException)
        {
        }
      }
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.a.d
 * JD-Core Version:    0.6.0
 */