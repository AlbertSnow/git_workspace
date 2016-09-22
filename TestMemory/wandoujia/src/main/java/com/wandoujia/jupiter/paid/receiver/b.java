package com.wandoujia.jupiter.paid.receiver;

import android.graphics.Bitmap;
import com.wandoujia.jupiter.paid.d.d;

final class b
  implements d
{
  b(BatteryBroadcastReceiver paramBatteryBroadcastReceiver, Runnable paramRunnable)
  {
  }

  public final void a(boolean paramBoolean, Bitmap paramBitmap)
  {
    BatteryBroadcastReceiver.a(this.b);
    if (paramBoolean)
    {
      BatteryBroadcastReceiver.a(this.b, paramBitmap);
      this.a.run();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.receiver.b
 * JD-Core Version:    0.6.0
 */