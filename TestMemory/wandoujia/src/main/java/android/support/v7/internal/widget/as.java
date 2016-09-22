package android.support.v7.internal.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class as extends ContextWrapper
{
  private Resources a;

  private as(Context paramContext)
  {
    super(paramContext);
  }

  public static Context a(Context paramContext)
  {
    if (!(paramContext instanceof as))
      paramContext = new as(paramContext);
    return paramContext;
  }

  public final Resources getResources()
  {
    if (this.a == null)
      this.a = new at(super.getResources(), au.a(this));
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.as
 * JD-Core Version:    0.6.0
 */