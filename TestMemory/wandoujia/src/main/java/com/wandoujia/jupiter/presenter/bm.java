package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.p4.subscribe.core.h;

final class bm
  implements h
{
  private bk a = null;

  private void a()
  {
    if (this.a != null)
      this.a.e().setEnabled(true);
  }

  public final void a(bk parambk)
  {
    this.a = parambk;
  }

  public final void a(b paramb)
  {
    a();
    if (this.a != null)
      bk.a(this.a, paramb);
  }

  public final void b(b paramb)
  {
    a();
  }

  public final void c(b paramb)
  {
    a();
    if (this.a != null)
      bk.a(this.a, paramb);
  }

  public final void d(b paramb)
  {
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bm
 * JD-Core Version:    0.6.0
 */