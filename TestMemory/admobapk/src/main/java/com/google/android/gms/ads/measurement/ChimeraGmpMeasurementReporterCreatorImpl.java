package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.IBinder;
import apj;
import apn;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.measurement.internal.d;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@DynamiteApi
@RetainForClient
public final class ChimeraGmpMeasurementReporterCreatorImpl extends d
{
  public final IBinder newGmpMeasurementReporter(apj paramapj)
  {
    Context localContext = (Context)apn.a(paramapj);
    com.google.android.gms.ads.internal.util.c.b("Use classic dynamite to create in app purchase reporter.");
    return new c(localContext);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.measurement.ChimeraGmpMeasurementReporterCreatorImpl
 * JD-Core Version:    0.6.0
 */