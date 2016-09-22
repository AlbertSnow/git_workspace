package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class u
  implements DialogInterface.OnCancelListener
{
  u(JsResult paramJsResult)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.cancel();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.u
 * JD-Core Version:    0.6.0
 */