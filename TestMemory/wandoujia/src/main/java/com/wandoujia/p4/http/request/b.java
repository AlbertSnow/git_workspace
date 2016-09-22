package com.wandoujia.p4.http.request;

import android.text.TextUtils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public abstract class b extends com.wandoujia.p4.http.request.a.b
{
  private String a;

  protected OptionFields a()
  {
    return null;
  }

  public final b a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected String getUrl()
  {
    if (TextUtils.isEmpty(this.a))
      return null;
    try
    {
      String str1 = URLEncoder.encode(this.a, "UTF-8");
      String str2 = "http://api.wandoujia.com/v1/apps/" + str1;
      return str2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    OptionFields localOptionFields = a();
    if (localOptionFields != null)
      paramParams.put("opt_fields", localOptionFields.getOptionFields());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.b
 * JD-Core Version:    0.6.0
 */