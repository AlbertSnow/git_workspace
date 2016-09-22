package com.wandoujia.jupiter.library.fragment;

import android.graphics.Bitmap;
import android.os.Handler;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.launcher.e.e;

final class af
  implements e
{
  af(ae paramae)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    JupiterApplication.a().post(new ag(this, paramBitmap));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.af
 * JD-Core Version:    0.6.0
 */