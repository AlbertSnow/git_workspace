package org.simalliance.openmobileapi;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.simalliance.openmobileapi.service.ISmartcardService.Stub;

class SEService$2
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    monitorenter;
    try
    {
      SEService.access$002(this.this$0, ISmartcardService.Stub.asInterface(paramIBinder));
      if (SEService.access$100(this.this$0) != null)
        SEService.access$100(this.this$0).serviceConnected(this.this$0);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    while (true)
    {
      int j;
      Reader localReader;
      synchronized (SEService.access$200(this.this$0))
      {
        Reader[] arrayOfReader2 = SEService.access$200(this.this$0);
        int i = arrayOfReader2.length;
        j = 0;
        if (j < i)
          localReader = arrayOfReader2[j];
      }
      try
      {
        localReader.closeSessions();
        label46: j++;
        continue;
        monitorexit;
        SEService.access$002(this.this$0, null);
        return;
        localObject = finally;
        monitorexit;
        throw localObject;
      }
      catch (Exception localException)
      {
        break label46;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     org.simalliance.openmobileapi.SEService.2
 * JD-Core Version:    0.6.0
 */