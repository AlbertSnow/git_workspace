package com.google.android.gms.internal;

import android.content.Intent;

public class zza extends zzr
{
  private Intent zza;

  public zza()
  {
  }

  public zza(zzi paramzzi)
  {
    super(paramzzi);
  }

  public String getMessage()
  {
    if (this.zza != null)
      return "User needs to (re)enter credentials.";
    return super.getMessage();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zza
 * JD-Core Version:    0.6.0
 */