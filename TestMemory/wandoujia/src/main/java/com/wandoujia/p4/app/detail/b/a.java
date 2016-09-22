package com.wandoujia.p4.app.detail.b;

import android.text.TextUtils;
import com.wandoujia.p4.app.detail.model.CommentSummary;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import org.apache.http.client.methods.HttpUriRequest;

public final class a extends GZipHttpDelegate<d, CommentSummary>
{
  public a()
  {
    super(new d(), new b(0));
  }

  public final HttpUriRequest getHttpRequest()
  {
    HttpUriRequest localHttpUriRequest = super.getHttpRequest();
    String str = com.wandoujia.account.a.i();
    if (!TextUtils.isEmpty(str))
      localHttpUriRequest.setHeader("Cookie", "wdj_auth=" + str);
    return localHttpUriRequest;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.b.a
 * JD-Core Version:    0.6.0
 */