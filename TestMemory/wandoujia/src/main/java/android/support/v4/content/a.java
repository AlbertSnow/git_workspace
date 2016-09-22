package android.support.v4.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class a
{
  public static final Drawable a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
      return paramContext.getDrawable(paramInt);
    return paramContext.getResources().getDrawable(paramInt);
  }

  public Intent a(ComponentName paramComponentName)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.a
 * JD-Core Version:    0.6.0
 */