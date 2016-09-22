package com.wandoujia.p4.http.request;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.a.i;
import com.wandoujia.p4.utils.s;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Value;

public class e extends i
{
  protected OptionFields a()
  {
    return null;
  }

  protected void setHeaders(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setHeaders(paramParams);
    AbstractHttpRequestBuilder.Value localValue = paramParams.get("Cookie");
    StringBuilder localStringBuilder = new StringBuilder();
    if ((localValue != null) && (!TextUtils.isEmpty(localValue.value)))
      localStringBuilder.append(localValue).append(";");
    localStringBuilder.append(s.a().b());
    paramParams.put("Cookie", localStringBuilder.toString());
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
 * Qualified Name:     com.wandoujia.p4.http.request.e
 * JD-Core Version:    0.6.0
 */