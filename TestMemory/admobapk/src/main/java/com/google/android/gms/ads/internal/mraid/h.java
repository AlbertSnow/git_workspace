package com.google.android.gms.ads.internal.mraid;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.ad;

public final class h
  implements DialogInterface.OnClickListener
{
  public h(g paramg, String paramString1, String paramString2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DownloadManager localDownloadManager = (DownloadManager)this.c.b.getSystemService("download");
    try
    {
      String str1 = this.a;
      String str2 = this.b;
      DownloadManager.Request localRequest = new DownloadManager.Request(Uri.parse(str1));
      localRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
      bc.a().g.a(localRequest);
      localDownloadManager.enqueue(localRequest);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      this.c.a("Could not store picture.");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.h
 * JD-Core Version:    0.6.0
 */