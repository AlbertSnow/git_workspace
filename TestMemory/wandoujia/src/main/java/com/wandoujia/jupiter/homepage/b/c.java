package com.wandoujia.jupiter.homepage.b;

import com.wandoujia.api.proto.HttpResponse;

final class c
  implements Runnable
{
  c(a parama)
  {
  }

  public final void run()
  {
    new com.wandoujia.ripple_framework.a.b("http://startpage.wandoujia.com/five/v3/tabs/welcome", null, HttpResponse.class, new d(this), new e(), 0).u();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.b.c
 * JD-Core Version:    0.6.0
 */