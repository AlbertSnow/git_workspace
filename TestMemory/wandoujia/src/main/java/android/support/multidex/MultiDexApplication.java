package android.support.multidex;

import android.app.Application;
import android.content.Context;

public class MultiDexApplication extends Application
{
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    MultiDex.install(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.multidex.MultiDexApplication
 * JD-Core Version:    0.6.0
 */