package com.unionpay.pboctransaction.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.support.v4.app.i;
import com.unionpay.mobile.tsm.connect.IInitCallback.Stub;
import com.unionpay.mobile.tsm.connect.IRemoteApdu;
import com.unionpay.pboctransaction.AppIdentification;
import com.unionpay.pboctransaction.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  implements com.unionpay.pboctransaction.c
{
  com.unionpay.pboctransaction.b a;
  private IRemoteApdu b = null;
  private boolean c = false;
  private Context d = null;
  private ServiceConnection e = new b(this);
  private IInitCallback.Stub f = new c(this);

  public a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public final ArrayList<com.unionpay.pboctransaction.model.b> a(e parame)
  {
    Object localObject;
    try
    {
      if (this.c);
      for (String str2 = "D15600010100016111000000B0004101"; ; str2 = "D15600010100016111000000B0004001")
      {
        String str3 = this.b.writeApdu("00a4040010" + str2, 0);
        if ((str3 != null) && (str3.equalsIgnoreCase("9000")))
          str3 = this.b.writeApdu("80CA2F0000", 0);
        ArrayList localArrayList3 = i.c(str3);
        localArrayList1 = localArrayList3;
        localObject = null;
        if (localArrayList1 == null)
          break label218;
        int i = localArrayList1.size();
        localObject = null;
        if (i <= 0)
          break label218;
        localArrayList2 = new ArrayList();
        Iterator localIterator = localArrayList1.iterator();
        while (localIterator.hasNext())
        {
          AppIdentification localAppIdentification = (AppIdentification)localIterator.next();
          if ("06".equalsIgnoreCase(localAppIdentification.b()))
            continue;
          String str1 = i.d(parame.a(localAppIdentification));
          if ((str1 == null) || (str1.length() <= 0))
            continue;
          localArrayList2.add(new com.unionpay.pboctransaction.model.a(4, localAppIdentification.a(), "", str1, 1));
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      ArrayList localArrayList2;
      while (true)
        ArrayList localArrayList1 = null;
      localObject = localArrayList2;
    }
    label218: return localObject;
  }

  public final void a()
  {
  }

  public final void a(com.unionpay.pboctransaction.b paramb, Context paramContext)
  {
    this.a = paramb;
    this.d = paramContext;
    Intent localIntent = new Intent("com.unionpay.mobile.tsm.PBOCService");
    paramContext.startService(localIntent);
    if ((!paramContext.bindService(localIntent, this.e, 1)) && (this.a != null))
      this.a.b();
  }

  public final byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null)
      return null;
    String str1 = i.a(paramArrayOfByte, paramArrayOfByte.length);
    try
    {
      String str3 = this.b.writeApdu(str1, paramInt);
      str2 = str3;
      return i.b(str2);
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        String str2 = null;
    }
  }

  public final void b()
  {
  }

  public final void c()
  {
    if (this.b != null);
    try
    {
      this.b.closeChannel(0);
      this.b.closeChannel(1);
      this.b.closeChannel(2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void d()
  {
    Context localContext = this.d;
    localContext.startService(new Intent("com.unionpay.mobile.tsm.PBOCService"));
    localContext.unbindService(this.e);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.a.a
 * JD-Core Version:    0.6.0
 */