package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.u;
import java.lang.reflect.Field;

final class o extends q
{
  private u<?> d = this.e.a(this.f);

  o(String paramString, boolean paramBoolean1, boolean paramBoolean2, com.wandoujia.gson.c paramc, com.wandoujia.gson.b.a parama, Field paramField, boolean paramBoolean3)
  {
    super(paramString, paramBoolean1, paramBoolean2);
  }

  final void a(com.wandoujia.gson.stream.a parama, Object paramObject)
  {
    Object localObject = this.d.a(parama);
    if ((localObject != null) || (!this.h))
      this.g.set(paramObject, localObject);
  }

  final void a(com.wandoujia.gson.stream.c paramc, Object paramObject)
  {
    Object localObject = this.g.get(paramObject);
    new v(this.e, this.d, this.f.getType()).a(paramc, localObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.o
 * JD-Core Version:    0.6.0
 */