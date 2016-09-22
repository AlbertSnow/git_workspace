package com.wandoujia.jupiter.library.fragment;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.online_config.c;
import com.wandoujia.ripple_framework.view.e;

final class ag
  implements Runnable
{
  ag(af paramaf, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    if (this.a != null)
    {
      this.b.a.h().a(2131492903).h().setImageBitmap(this.a);
      return;
    }
    new e();
    ImageView localImageView = this.b.a.h().a(2131492903).h();
    c.a();
    e.a(localImageView, c.i(), 2131362003);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ag
 * JD-Core Version:    0.6.0
 */