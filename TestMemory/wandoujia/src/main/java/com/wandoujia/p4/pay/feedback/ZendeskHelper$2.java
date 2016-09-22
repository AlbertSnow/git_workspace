package com.wandoujia.p4.pay.feedback;

import android.content.Context;
import android.os.Handler;
import com.wandoujia.p4.pay.model.ZendeskModels.TicktetRequest;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ExternUtil;
import com.wandoujia.p4.pay.utils.HttpUtil;
import com.wandoujia.p4.pay.utils.SLog;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

class ZendeskHelper$2
  implements Runnable
{
  public void run()
  {
    Context localContext = LocalStorage.getCurrentConfig().getApplicationContext();
    try
    {
      HttpPost localHttpPost = new HttpPost(ZendeskHelper.access$000(this.this$0, this.val$url, System.currentTimeMillis()));
      localHttpPost.setEntity(new StringEntity(ExternUtil.toJson(this.val$ticktetRequest), "UTF-8"));
      localHttpPost.setHeader("Content-Type", "application/json");
      int i = HttpUtil.getHttpClient().execute(localHttpPost).getStatusLine().getStatusCode();
      SLog.w("FeedBack", "statusCode::" + i);
      if ((i >= 200) && (i < 300))
      {
        ZendeskHelper.access$100().post(new ZendeskHelper.2.1(this, localContext));
        return;
      }
      ZendeskHelper.access$100().post(new ZendeskHelper.2.2(this, localContext));
      return;
    }
    catch (Exception localException)
    {
      ZendeskHelper.access$100().post(new ZendeskHelper.2.3(this, localContext));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.ZendeskHelper.2
 * JD-Core Version:    0.6.0
 */