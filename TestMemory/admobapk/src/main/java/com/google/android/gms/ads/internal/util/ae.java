package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;

@TargetApi(9)
public class ae extends ad
{
  public ae()
  {
    super(0);
  }

  public final int a()
  {
    return 6;
  }

  public boolean a(DownloadManager.Request paramRequest)
  {
    paramRequest.setShowRunningNotification(true);
    return true;
  }

  public final int b()
  {
    return 7;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ae
 * JD-Core Version:    0.6.0
 */