package com.wandoujia.p4.community.http.d;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.h;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class t extends h
{
  private String a;

  public t()
  {
    setAttachDefaultCookie(true);
  }

  public final t a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (TextUtils.isEmpty(this.a))
      throw new IllegalArgumentException("Please set topic id first");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1//topics/%s", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("opt_fields", "curUserPermissions");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.t
 * JD-Core Version:    0.6.0
 */