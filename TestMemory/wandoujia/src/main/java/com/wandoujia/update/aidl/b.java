package com.wandoujia.update.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.wandoujia.update.protocol.UpdateInfo;

final class b
  implements IUpdateRemoteService
{
  private IBinder a;

  b(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateRemoteService");
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(IUpdateCallback paramIUpdateCallback, UpdateParams paramUpdateParams)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateRemoteService");
      IBinder localIBinder;
      if (paramIUpdateCallback != null)
      {
        localIBinder = paramIUpdateCallback.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramUpdateParams == null)
          break label84;
        localParcel1.writeInt(1);
        paramUpdateParams.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label84: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(UpdateInfo paramUpdateInfo, UpdateParams paramUpdateParams)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateRemoteService");
        if (paramUpdateInfo == null)
          continue;
        localParcel1.writeInt(1);
        paramUpdateInfo.writeToParcel(localParcel1, 0);
        if (paramUpdateParams != null)
        {
          localParcel1.writeInt(1);
          paramUpdateParams.writeToParcel(localParcel1, 0);
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateRemoteService");
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.b
 * JD-Core Version:    0.6.0
 */