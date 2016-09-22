package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.b;

@TargetApi(11)
public class ErrorDialogFragments$Honeycomb extends DialogFragment
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.a(getActivity(), getArguments());
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    return b.a(getActivity(), getArguments(), this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.util.ErrorDialogFragments.Honeycomb
 * JD-Core Version:    0.6.0
 */