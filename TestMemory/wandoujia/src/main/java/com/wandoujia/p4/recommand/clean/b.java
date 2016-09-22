package com.wandoujia.p4.recommand.clean;

import android.graphics.Bitmap;
import com.wandoujia.jupiter.paid.d.d;

final class b
  implements d
{
  b(CleanBroadcastReceiver paramCleanBroadcastReceiver, Runnable paramRunnable)
  {
  }

  public final void a(boolean paramBoolean, Bitmap paramBitmap)
  {
    CleanBroadcastReceiver.a(this.b);
    if (paramBoolean)
    {
      CleanBroadcastReceiver.a(this.b, paramBitmap);
      if (this.a != null)
        this.a.run();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.recommand.clean.b
 * JD-Core Version:    0.6.0
 */