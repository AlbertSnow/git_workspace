package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

class zzg$zzb extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    if (localUri != null);
    for (String str = localUri.getSchemeSpecificPart(); ; str = null)
    {
      if ((str == null) || (!str.equals("com.google.android.gms")));
      a locala;
      do
      {
        return;
        locala = (a)null.get();
      }
      while (locala == null);
      a.a(locala);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.zzg.zzb
 * JD-Core Version:    0.6.0
 */