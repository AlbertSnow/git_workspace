package android.support.v4.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class TransportMediatorJellybeanMR2$3 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
      return;
    }
    catch (ClassCastException localClassCastException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.TransportMediatorJellybeanMR2.3
 * JD-Core Version:    0.6.0
 */