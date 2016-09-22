package com.google.android.gms.common;

import android.util.Log;
import ano;
import apj;
import apn;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;
import pa;
import pg;

@KeepName
@DynamiteApi
@RetainForClient
public class GoogleCertificatesImpl extends ano
{
  @RetainForClient
  public apj getGoogleCertificates()
  {
    pa[] arrayOfpa = pg.a();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(arrayOfpa.length);
    Log.d("GoogleCertificatesImpl", String.format("Fetched %d Google certificates", arrayOfObject));
    return apn.a(arrayOfpa);
  }

  @RetainForClient
  public apj getGoogleReleaseCertificates()
  {
    pa[] arrayOfpa = pg.b();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(arrayOfpa.length);
    Log.d("GoogleCertificatesImpl", String.format("Fetched %d Google release certificates", arrayOfObject));
    return apn.a(arrayOfpa);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GoogleCertificatesImpl
 * JD-Core Version:    0.6.0
 */