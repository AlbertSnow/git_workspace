package de.greenrobot.event.util;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

public abstract class b<T>
{
  protected static T a(a parama)
  {
    Bundle localBundle = new Bundle();
    if (!localBundle.containsKey("de.greenrobot.eventbus.errordialog.title"))
      localBundle.putString("de.greenrobot.eventbus.errordialog.title", null.a.getString(null.b));
    Throwable localThrowable;
    Integer localInteger;
    if (!localBundle.containsKey("de.greenrobot.eventbus.errordialog.message"))
    {
      localThrowable = parama.d;
      localInteger = a.a(localThrowable);
      if (localInteger == null)
        break label118;
    }
    for (int i = localInteger.intValue(); ; i = null.c)
    {
      localBundle.putString("de.greenrobot.eventbus.errordialog.message", null.a.getString(i));
      if (!localBundle.containsKey("de.greenrobot.eventbus.errordialog.finish_after_dialog"))
        localBundle.putBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false);
      localBundle.containsKey("de.greenrobot.eventbus.errordialog.event_type_on_close");
      localBundle.containsKey("de.greenrobot.eventbus.errordialog.icon_id");
      return null.a();
      label118: new StringBuilder("No specific message ressource ID found for ").append(localThrowable);
    }
  }

  protected abstract T a();

  public abstract View b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.util.b
 * JD-Core Version:    0.6.0
 */