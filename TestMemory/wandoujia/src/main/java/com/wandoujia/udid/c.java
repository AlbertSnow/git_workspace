package com.wandoujia.udid;

import android.content.Context;

final class c extends Thread
{
  c(int paramInt, Context paramContext, String paramString)
  {
  }

  public final void run()
  {
    monitorenter;
    while (true)
    {
      try
      {
        switch (this.a)
        {
        default:
          return;
        case 0:
          UDIDUtil.a(this.b, this.c);
          continue;
        case 1:
        }
      }
      finally
      {
        monitorexit;
      }
      UDIDUtil.a(this.c);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.udid.c
 * JD-Core Version:    0.6.0
 */