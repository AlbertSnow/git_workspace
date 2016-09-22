package com.wandoujia.jupiter.library.fragment;

import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.p4.subscribe.core.h;

final class ap
  implements h
{
  private ao a;

  public ap(ao paramao)
  {
    this.a = paramao;
  }

  private void b()
  {
    if (this.a != null)
      ao.a(this.a);
  }

  public final void a()
  {
    this.a = null;
  }

  public final void a(b paramb)
  {
    b();
    if (this.a != null)
      ao.a(this.a, paramb);
  }

  public final void b(b paramb)
  {
    b();
  }

  public final void c(b paramb)
  {
    b();
    if (this.a != null)
      ao.a(this.a, paramb);
  }

  public final void d(b paramb)
  {
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ap
 * JD-Core Version:    0.6.0
 */