package com.wandoujia.p4.b;

import android.database.ContentObserver;

final class e extends ContentObserver
{
  e(b paramb)
  {
    super(null);
  }

  public final void onChange(boolean paramBoolean)
  {
    b.b(this.a).postDelayed(new f(this), 1000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.b.e
 * JD-Core Version:    0.6.0
 */