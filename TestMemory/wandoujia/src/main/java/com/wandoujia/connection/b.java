package com.wandoujia.connection;

import android.os.IBinder;
import android.os.Parcel;

final class b
  implements IConnectionServiceCallback
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.connection.IConnectionServiceCallback");
      int j;
      int k;
      label43: int m;
      if (paramBoolean1)
      {
        j = i;
        localParcel1.writeInt(j);
        if (!paramBoolean2)
          break label122;
        k = i;
        localParcel1.writeInt(k);
        if (!paramBoolean3)
          break label128;
        m = i;
        label58: localParcel1.writeInt(m);
        if (!paramBoolean4)
          break label134;
      }
      while (true)
      {
        localParcel1.writeInt(i);
        localParcel1.writeString(paramString);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        j = 0;
        break;
        label122: k = 0;
        break label43;
        label128: m = 0;
        break label58;
        label134: i = 0;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.b
 * JD-Core Version:    0.6.0
 */