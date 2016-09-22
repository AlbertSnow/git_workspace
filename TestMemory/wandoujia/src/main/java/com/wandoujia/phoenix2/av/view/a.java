package com.wandoujia.phoenix2.av.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

public final class a
{
  private d a;
  private int b;
  private Handler c;
  private int d = 5;

  public final a a(View paramView, d paramd)
  {
    this.a = paramd;
    this.b = 0;
    if (this.c == null)
      this.c = new b(this, Looper.getMainLooper());
    this.c.removeMessages(0);
    paramView.setOnClickListener(new c(this));
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.a
 * JD-Core Version:    0.6.0
 */