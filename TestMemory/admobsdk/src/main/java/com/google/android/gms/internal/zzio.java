package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public class zzio extends Handler
{
  public zzio(Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message msg)
  {
    try
    {
      super.handleMessage(msg);
    }
    catch (Exception localException)
    {
      zzr.zzbF().zzb(localException, false);
      throw localException;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzio
 * JD-Core Version:    0.6.0
 */