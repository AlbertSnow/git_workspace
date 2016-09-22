package com.wandoujia.jupiter.media.controller;

import java.util.HashMap;
import java.util.Map;

public final class s
{
  private final Map<String, t> a = new HashMap();

  public final t a(String paramString)
  {
    return (t)this.a.remove(paramString);
  }

  public final void a(String paramString, t paramt)
  {
    if (!this.a.containsKey(paramString))
      this.a.put(paramString, paramt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.s
 * JD-Core Version:    0.6.0
 */