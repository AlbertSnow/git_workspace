package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class c
{
  private static final a a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new e();
      return;
    }
    if (i >= 11)
    {
      a = new d();
      return;
    }
    a = new a();
  }

  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.c
 * JD-Core Version:    0.6.0
 */