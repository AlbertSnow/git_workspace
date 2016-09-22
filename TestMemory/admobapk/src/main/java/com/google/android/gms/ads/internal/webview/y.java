package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class y
  implements DialogInterface.OnClickListener
{
  y(JsPromptResult paramJsPromptResult)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.cancel();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.y
 * JD-Core Version:    0.6.0
 */