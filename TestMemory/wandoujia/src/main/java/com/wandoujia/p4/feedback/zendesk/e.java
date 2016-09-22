package com.wandoujia.p4.feedback.zendesk;

import android.os.Handler;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.JsonSerializer;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.http.b.ac;
import com.wandoujia.rpc.http.processor.GZipHttpResponseProcessor;
import com.wandoujia.rpc.http.processor.ProcessorConnector;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

final class e
  implements Runnable
{
  e(a parama, String paramString, ZendeskModels.TicketRequest paramTicketRequest)
  {
  }

  public final void run()
  {
    try
    {
      HttpPost localHttpPost = new HttpPost(a.a(this.a, System.currentTimeMillis()));
      localHttpPost.setEntity(new StringEntity(JsonSerializer.toJson(this.b), "UTF-8"));
      localHttpPost.setHeader("Content-Type", "application/json");
      ac localac = new ac();
      localac.a(localHttpPost);
      HttpResponse localHttpResponse = (HttpResponse)com.wandoujia.p4.a.b().execute(localac);
      int i = localHttpResponse.getStatusLine().getStatusCode();
      Log.d("Match", "statusCode::" + i, new Object[0]);
      if ((i >= 200) && (i < 300))
      {
        if (this.c)
        {
          long l = ((ZendeskModels.ForTicketId)ProcessorConnector.connect(new GZipHttpResponseProcessor(), new l(0)).process(localHttpResponse)).getTicket().getId();
          if (l != -1L)
          {
            List localList = Config.n();
            localList.add(Long.valueOf(l));
            Config.a(localList);
            Config.a(l, 1 + Config.d(l));
          }
        }
        com.wandoujia.p4.a.d().post(new f());
        return;
      }
      com.wandoujia.p4.a.d().post(new g());
      return;
    }
    catch (Exception localException)
    {
      com.wandoujia.p4.a.d().post(new h());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.e
 * JD-Core Version:    0.6.0
 */