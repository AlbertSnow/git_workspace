package com.wandoujia.p4.gift.http.a;

import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import java.util.List;

public final class a extends GZipHttpDelegate<com.wandoujia.p4.gift.http.c.b, List<GiftModel>>
{
  public a()
  {
    super(new com.wandoujia.p4.gift.http.c.a(), new b());
  }

  public a(byte paramByte)
  {
    super(new com.wandoujia.p4.gift.http.c.b(), new c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.a.a
 * JD-Core Version:    0.6.0
 */