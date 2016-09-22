package com.nispok.snackbar;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;

@TargetApi(16)
final class p extends View
{
  public p(Context paramContext)
  {
    super(paramContext);
    setSaveEnabled(false);
    setWillNotDraw(true);
    setVisibility(8);
  }

  public final void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    super.onWindowSystemUiVisibilityChanged(paramInt);
    ViewParent localViewParent = getParent();
    if ((localViewParent instanceof Snackbar))
      ((Snackbar)localViewParent).h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.p
 * JD-Core Version:    0.6.0
 */