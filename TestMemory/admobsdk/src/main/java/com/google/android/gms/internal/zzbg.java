package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzbg
{
  private static MessageDigest zzto = null;
  protected Object zzpV = new Object();

  abstract byte[] zzu(String paramString);

  protected MessageDigest zzcL()
  {
    synchronized (this.zzpV)
    {
      if (zzto != null)
        return zzto;
      for (int i = 0; i < 2; i++)
        try
        {
          zzto = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
        }
      return zzto;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbg
 * JD-Core Version:    0.6.0
 */