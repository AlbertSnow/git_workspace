package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public final class e
  implements DialogInterface.OnClickListener
{
  private final Activity a;
  private final Fragment b;
  private final Intent c;

  public e(Activity paramActivity, Intent paramIntent)
  {
    this.a = paramActivity;
    this.b = null;
    this.c = paramIntent;
  }

  public e(Fragment paramFragment, Intent paramIntent)
  {
    this.a = null;
    this.b = paramFragment;
    this.c = paramIntent;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.c != null) && (this.b != null))
        this.b.startActivityForResult(this.c, 2);
      while (true)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.c == null)
          continue;
        this.a.startActivityForResult(this.c, 2);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.e
 * JD-Core Version:    0.6.0
 */