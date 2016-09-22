package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class at extends af
{
  private final au a;

  public at(Resources paramResources, au paramau)
  {
    super(paramResources);
    this.a = paramau;
  }

  public final Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    if (localDrawable != null)
      this.a.a(paramInt, localDrawable);
    return localDrawable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.at
 * JD-Core Version:    0.6.0
 */