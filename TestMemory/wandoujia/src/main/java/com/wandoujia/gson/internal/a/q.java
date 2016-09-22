package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;

abstract class q
{
  final String a;
  final boolean b;
  final boolean c;

  protected q(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }

  abstract void a(a parama, Object paramObject);

  abstract void a(c paramc, Object paramObject);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.q
 * JD-Core Version:    0.6.0
 */