package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.a;

public class zza extends IAccountAccessor.zza
{
  private int a;

  // ERROR //
  public static Account a(IAccountAccessor paramIAccountAccessor)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: ifnull +22 -> 25
    //   6: invokestatic 15	android/os/Binder:clearCallingIdentity	()J
    //   9: lstore_2
    //   10: aload_0
    //   11: invokeinterface 20 1 0
    //   16: astore 6
    //   18: aload 6
    //   20: astore_1
    //   21: lload_2
    //   22: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   25: aload_1
    //   26: areturn
    //   27: astore 5
    //   29: lload_2
    //   30: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   33: aconst_null
    //   34: areturn
    //   35: astore 4
    //   37: lload_2
    //   38: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   41: aload 4
    //   43: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   10	18	27	android/os/RemoteException
    //   10	18	35	finally
  }

  public final Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.a)
      return null;
    if (a.a(i))
    {
      this.a = i;
      return null;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof zza))
      return false;
    return null.equals(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.zza
 * JD-Core Version:    0.6.0
 */