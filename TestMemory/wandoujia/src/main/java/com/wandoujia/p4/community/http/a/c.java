package com.wandoujia.p4.community.http.a;

import com.wandoujia.p4.community.http.d.aa;
import com.wandoujia.p4.community.http.d.f;
import com.wandoujia.p4.community.http.d.g;
import com.wandoujia.p4.community.http.d.z;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;

public final class c extends GZipHttpDelegate<aa, CommunityResponseInfo>
{
  public c()
  {
    super(new f(), new d(0));
  }

  public c(String paramString)
  {
    super(new g(paramString), new i(0));
  }

  public c(String paramString1, String paramString2, String paramString3)
  {
    super(new z(paramString1, paramString2, paramString3), new ao(0));
  }

  public c(String paramString, boolean paramBoolean)
  {
    super(new aa(paramString, paramBoolean), new ap(0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.a.c
 * JD-Core Version:    0.6.0
 */