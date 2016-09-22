package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.measurement.internal.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@a
public final class c extends b
{
  final Context a;
  private ExecutorService b;

  public c(Context paramContext)
  {
    this.a = paramContext;
    this.b = Executors.newSingleThreadExecutor();
  }

  public final void a(Bundle paramBundle)
  {
    com.google.android.gms.ads.internal.util.c.b("Reporting inAppPurchase entry in GmpInAppPurchaseReporter");
    this.b.execute(new d(this, paramBundle));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.measurement.c
 * JD-Core Version:    0.6.0
 */