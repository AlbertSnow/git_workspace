package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.d;
import android.support.v4.app.q;

public class SupportErrorDialogFragment extends DialogFragment
{
  private Dialog a = null;
  private DialogInterface.OnCancelListener b = null;

  public static SupportErrorDialogFragment a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    SupportErrorDialogFragment localSupportErrorDialogFragment = new SupportErrorDialogFragment();
    Dialog localDialog = (Dialog)d.a(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    localSupportErrorDialogFragment.a = localDialog;
    if (paramOnCancelListener != null)
      localSupportErrorDialogFragment.b = paramOnCancelListener;
    return localSupportErrorDialogFragment;
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

  public void show(q paramq, String paramString)
  {
    super.show(paramq, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.SupportErrorDialogFragment
 * JD-Core Version:    0.6.0
 */