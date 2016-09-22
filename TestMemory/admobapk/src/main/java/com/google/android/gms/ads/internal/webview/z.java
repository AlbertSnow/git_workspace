package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class z
  implements DialogInterface.OnClickListener
{
  z(JsPromptResult paramJsPromptResult, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.confirm(this.b.getText().toString());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.z
 * JD-Core Version:    0.6.0
 */