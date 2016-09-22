package com.wandoujia.p4.netcheck.a;

import com.wandoujia.p4.http.b.ac;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;

public final class h extends ac
{
  private String a;
  private String b;

  public final h a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final HttpResponse a(HttpResponse paramHttpResponse)
  {
    return super.a(paramHttpResponse);
  }

  public final h b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final HttpUriRequest getHttpRequest()
  {
    HttpPost localHttpPost = new HttpPost("http://netcheck.wandoujia.com/P3data");
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(new BasicNameValuePair("udid", this.a));
    localArrayList.add(new BasicNameValuePair("debugfile", this.b));
    try
    {
      localHttpPost.setEntity(new UrlEncodedFormEntity(localArrayList, "UTF-8"));
      return localHttpPost;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return localHttpPost;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.a.h
 * JD-Core Version:    0.6.0
 */