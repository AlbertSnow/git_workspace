package com.wandoujia.appmanager.a;

import com.wandoujia.p4.community.http.a.j;
import com.wandoujia.p4.community.http.d.h;
import com.wandoujia.p4.subscribe.http.request.PostSubscribeRequest;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import com.wandoujia.rpc.http.processor.RawProcessor;

public final class b extends GZipHttpDelegate<PostSubscribeRequest, String>
{
  public b()
  {
    super(new d(), new c(0));
  }

  public b(String paramString)
  {
    super(new h(paramString), new j());
  }

  public b(boolean paramBoolean, String[] paramArrayOfString)
  {
    super(new PostSubscribeRequest(paramBoolean, paramArrayOfString), new RawProcessor());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.a.b
 * JD-Core Version:    0.6.0
 */