package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.d;

public class ErrorDialogFragment extends DialogFragment
{
  private Dialog a = null;
  private DialogInterface.OnCancelListener b = null;

  public static ErrorDialogFragment a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    ErrorDialogFragment localErrorDialogFragment = new ErrorDialogFragment();
    Dialog localDialog = (Dialog)d.a(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    localErrorDialogFragment.a = localDialog;
    if (paramOnCancelListener != null)
      localErrorDialogFragment.b = paramOnCancelListener;
    return localErrorDialogFragment;
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.b != null)
      this.b.onCancel(paramDialogInterface);
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.a == null)
      setShowsDialog(false);
    return this.a;
  }

  public void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.ErrorDialogFragment
 * JD-Core Version:    0.6.0
 */