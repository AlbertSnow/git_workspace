package com.google.android.gms.auth.api.credentials.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract interface ICredentialsCallbacks extends IInterface
{
  public abstract void a(Status paramStatus);

  public abstract void a(Status paramStatus, Credential paramCredential);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
 * JD-Core Version:    0.6.0
 */