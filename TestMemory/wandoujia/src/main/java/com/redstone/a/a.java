package com.redstone.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.redstone.sdk.enabler.remote.IRsSystemService;

public final class a
{
  private static a a = new a();
  private static Context c = null;
  private IRsSystemService b = null;
  private ServiceConnection d = new b(this);

  public static a a()
  {
    return a;
  }

  public static void a(Context paramContext)
  {
    c = paramContext;
  }

  public final boolean b()
  {
    Intent localIntent = new Intent("com.redstone.intent.action.CALL_DMSYS");
    localIntent.setPackage(c.getPackageName());
    return c.bindService(localIntent, this.d, 1);
  }

  public final IRsSystemService c()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.redstone.a.a
 * JD-Core Version:    0.6.0
 */