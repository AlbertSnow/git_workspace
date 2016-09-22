package com.wandoujia.gson;

import android.support.v4.app.b;
import com.wandoujia.gson.b.a;

final class t
  implements v
{
  private final a<?> a;
  private final boolean b;
  private final r<?> c;
  private final m<?> d;

  private t(Object paramObject, a<?> parama, boolean paramBoolean)
  {
    r localr;
    m localm;
    if ((paramObject instanceof r))
    {
      localr = (r)paramObject;
      this.c = localr;
      if (!(paramObject instanceof m))
        break label81;
      localm = (m)paramObject;
      label36: this.d = localm;
      if ((this.c == null) && (this.d == null))
        break label87;
    }
    label81: label87: for (boolean bool = true; ; bool = false)
    {
      b.a(bool);
      this.a = parama;
      this.b = paramBoolean;
      return;
      localr = null;
      break;
      localm = null;
      break label36;
    }
  }

  public final <T> u<T> a(c paramc, a<T> parama)
  {
    boolean bool;
    if (this.a != null)
      if ((this.a.equals(parama)) || ((this.b) && (this.a.getType() == parama.getRawType())))
        bool = true;
    while (true)
    {
      s locals = null;
      if (bool)
        locals = new s(this.c, this.d, paramc, parama, this, 0);
      return locals;
      bool = false;
      continue;
      bool = null.isAssignableFrom(parama.getRawType());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.t
 * JD-Core Version:    0.6.0
 */