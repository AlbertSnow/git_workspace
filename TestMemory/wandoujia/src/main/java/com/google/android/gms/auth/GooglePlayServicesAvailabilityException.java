package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{
  private final int zzOD;

  GooglePlayServicesAvailabilityException(int paramInt, String paramString, Intent paramIntent)
  {
    super(paramString, paramIntent);
    this.zzOD = paramInt;
  }

  public int getConnectionStatusCode()
  {
    return this.zzOD;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.GooglePlayServicesAvailabilityException
 * JD-Core Version:    0.6.0
 */