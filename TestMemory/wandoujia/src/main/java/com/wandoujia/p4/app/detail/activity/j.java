package com.wandoujia.p4.app.detail.activity;

import android.os.AsyncTask;
import com.wandoujia.gson.c;
import com.wandoujia.p4.http.b.ac;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;

final class j extends AsyncTask<ReportActivity.SubmitForm, Void, HttpResponse>
{
  private j(ReportActivity paramReportActivity)
  {
  }

  private HttpResponse a(ReportActivity.SubmitForm[] paramArrayOfSubmitForm)
  {
    ReportActivity.SubmitForm localSubmitForm;
    int i;
    if ((paramArrayOfSubmitForm != null) && (paramArrayOfSubmitForm[0] != null))
    {
      localSubmitForm = paramArrayOfSubmitForm[0];
      localSubmitForm.packageurl = ReportActivity.c(this.a).downloadUrl;
      i = 0;
    }
    while (true)
    {
      if (i < 10);
      try
      {
        HttpGet localHttpGet = new HttpGet(localSubmitForm.packageurl);
        localHttpGet.getParams().setParameter("http.protocol.handle-redirects", Boolean.valueOf(false));
        ac localac2 = new ac();
        localac2.a(localHttpGet);
        HttpResponse localHttpResponse2 = (HttpResponse)com.wandoujia.p4.a.b().execute(localac2);
        if (localHttpResponse2.getStatusLine().getStatusCode() == 302)
        {
          localSubmitForm.packageurl = new URI(localSubmitForm.packageurl).resolve(new URI(localHttpResponse2.getFirstHeader("Location").getValue())).toString();
          i++;
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        try
        {
          HttpPost localHttpPost = new HttpPost("http://12321.wandoujia.com/post");
          ByteArrayEntity localByteArrayEntity = new ByteArrayEntity(com.wandoujia.p4.http.c.a.a().a(localSubmitForm).getBytes("UTF-8"));
          localByteArrayEntity.setContentEncoding(new BasicHeader("Content-Type", "application/json; charset=utf-8"));
          localHttpPost.setEntity(localByteArrayEntity);
          ac localac1 = new ac();
          localac1.a(localHttpPost);
          HttpResponse localHttpResponse1 = (HttpResponse)com.wandoujia.p4.a.b().execute(localac1);
          return localHttpResponse1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          return null;
          return null;
        }
        catch (ExecutionException localExecutionException1)
        {
          break label252;
        }
      }
      catch (ExecutionException localExecutionException2)
      {
        label163: label252: break label163;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.j
 * JD-Core Version:    0.6.0
 */