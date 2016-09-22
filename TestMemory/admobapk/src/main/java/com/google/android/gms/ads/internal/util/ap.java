package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class ap
  implements DialogInterface.OnClickListener
{
  ap(ao paramao, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    y.a(this.b.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ap
 * JD-Core Version:    0.6.0
 */