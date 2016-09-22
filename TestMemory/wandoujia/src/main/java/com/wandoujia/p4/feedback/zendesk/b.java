package com.wandoujia.p4.feedback.zendesk;

import android.os.Handler;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.http.b.ac;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;

final class b
  implements Runnable
{
  b(long paramLong1, long paramLong2, String paramString)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("http://android.help.wandoujia.com/zendesk/api/v2/tickets/");
      localStringBuilder.append(this.a);
      localStringBuilder.append(".json?signiture=");
      localStringBuilder.append(a.a(l));
      localStringBuilder.append("&timestamp=");
      localStringBuilder.append(l);
      HttpPut localHttpPut = new HttpPut(localStringBuilder.toString());
      localHttpPut.setHeader("Content-Type", "application/json");
      localStringBuilder.delete(0, localStringBuilder.length());
      localStringBuilder.append("{\"ticket\": {\"comment\": {\"author_id\": ");
      localStringBuilder.append(this.b);
      localStringBuilder.append(",\"body\": \"");
      localStringBuilder.append(this.c);
      localStringBuilder.append("\",\"public\": \"true\"},\"status\":\"open\"}}");
      localHttpPut.setEntity(new StringEntity(localStringBuilder.toString(), "UTF-8"));
      ac localac = new ac();
      localac.a(localHttpPut);
      if (((HttpResponse)com.wandoujia.p4.a.b().execute(localac)).getStatusLine().getStatusCode() == 200)
      {
        int i = Config.d(this.a);
        Config.a(this.a, i + 1);
        com.wandoujia.p4.a.d().post(new c());
        return;
      }
      com.wandoujia.p4.a.d().post(new d());
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.b
 * JD-Core Version:    0.6.0
 */