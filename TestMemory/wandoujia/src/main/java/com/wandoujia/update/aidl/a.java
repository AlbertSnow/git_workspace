package com.wandoujia.update.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.wandoujia.update.protocol.UpdateInfo;

final class a
  implements IUpdateCallback
{
  private IBinder a;

  a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateCallback");
      this.a.transact(2, localParcel1, localParcel2, 0);
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

  public final void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateCallback");
      localParcel1.writeInt(paramInt);
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

  public final void a(UpdateInfo paramUpdateInfo)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateCallback");
      if (paramUpdateInfo != null)
      {
        localParcel1.writeInt(1);
        paramUpdateInfo.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateCallback");
      if (paramUpdateInfo != null)
      {
        localParcel1.writeInt(1);
        paramUpdateInfo.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        this.a.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.wandoujia.update.aidl.IUpdateCallback");
      int i = 0;
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.a.transact(5, localParcel1, localParcel2, 0);
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

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.a
 * JD-Core Version:    0.6.0
 */