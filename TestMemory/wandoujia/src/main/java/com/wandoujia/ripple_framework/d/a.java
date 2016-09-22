package com.wandoujia.ripple_framework.d;

import com.wandoujia.nirvana.framework.network.page.e;
import java.util.List;

public final class a<T>
  implements e<T>
{
  private final e<T> a;
  private final e<T> b;

  private a(e<T> parame1, e<T> parame2)
  {
    this.a = parame1;
    this.b = parame2;
  }

  public static <T> a<T> a(e<T> parame1, e<T> parame2)
  {
    return new a(parame1, parame2);
  }

  public final List<T> a(List<T> paramList)
  {
    return this.b.a(this.a.a(paramList));
  }

  public final void a()
  {
    this.a.a();
    this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.d.a
 * JD-Core Version:    0.6.0
 */