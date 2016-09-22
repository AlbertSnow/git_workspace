package com.wandoujia.jupiter.media.view;

import android.content.Context;
import android.widget.Toast;
import com.wandoujia.jupiter.media.controller.aa;
import com.wandoujia.jupiter.media.controller.r;

final class c
  implements aa
{
  c(VideoPlayView paramVideoPlayView)
  {
  }

  public final void a()
  {
    if (VideoPlayView.a(this.a))
      this.a.h();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    VideoPlayView.a(this.a, paramInt1, paramInt2);
  }

  public final void b()
  {
    this.a.i();
    Toast.makeText(this.a.getContext(), this.a.getContext().getString(2131625632), 0).show();
  }

  public final void c()
  {
    this.a.a.f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.c
 * JD-Core Version:    0.6.0
 */