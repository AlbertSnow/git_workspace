package com.wandoujia.push2;

import com.wandoujia.push2.protocol.NormalBody;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private Map<String, String> a = new HashMap();

  public c()
  {
  }

  public c(NormalBody paramNormalBody)
  {
    this.a.put("push2_id", paramNormalBody.getId());
    this.a.put("push2_title", paramNormalBody.getTitle());
  }

  public final c a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
    return this;
  }

  public final String a()
  {
    return new com.wandoujia.gson.c().a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.c
 * JD-Core Version:    0.6.0
 */