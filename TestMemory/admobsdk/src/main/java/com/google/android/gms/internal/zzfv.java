package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface zzfv extends IInterface
{
  public abstract void onCreate(Bundle paramBundle)
    throws RemoteException;

  public abstract void onRestart()
    throws RemoteException;

  public abstract void onStart()
    throws RemoteException;

  public abstract void onResume()
    throws RemoteException;

  public abstract void onPause()
    throws RemoteException;

  public abstract void onSaveInstanceState(Bundle paramBundle)
    throws RemoteException;

  public abstract void onStop()
    throws RemoteException;

  public abstract void onDestroy()
    throws RemoteException;

  public abstract void zzaD()
    throws RemoteException;

  public abstract void onBackPressed()
    throws RemoteException;

  public abstract boolean zzfn()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzfv
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzfv zzL(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      if ((localIInterface != null) && ((localIInterface instanceof zzfv)))
        return (zzfv)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      Bundle localBundle;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (0 != data.readInt())
          localBundle = (Bundle)Bundle.CREATOR.createFromParcel(data);
        else
          localBundle = null;
        onCreate(localBundle);
        reply.writeNoException();
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onRestart();
        reply.writeNoException();
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onStart();
        reply.writeNoException();
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onResume();
        reply.writeNoException();
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onPause();
        reply.writeNoException();
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (0 != data.readInt())
          localBundle = (Bundle)Bundle.CREATOR.createFromParcel(data);
        else
          localBundle = null;
        onSaveInstanceState(localBundle);
        reply.writeNoException();
        if (localBundle != null)
        {
          reply.writeInt(1);
          localBundle.writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 7:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onStop();
        reply.writeNoException();
        return true;
      case 8:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onDestroy();
        reply.writeNoException();
        return true;
      case 9:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        zzaD();
        reply.writeNoException();
        return true;
      case 10:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        onBackPressed();
        reply.writeNoException();
        return true;
      case 11:
        data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        boolean bool = zzfn();
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzfv
    {
      private IBinder zzoz;

      zza(IBinder paramIBinder)
      {
        this.zzoz = paramIBinder;
      }

      public IBinder asBinder()
      {
        return this.zzoz;
      }

      public void onCreate(Bundle savedInstanceState)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          if (savedInstanceState != null)
          {
            localParcel1.writeInt(1);
            savedInstanceState.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onRestart()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onStart()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onResume()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onPause()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onSaveInstanceState(Bundle outState)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          if (outState != null)
          {
            localParcel1.writeInt(1);
            outState.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (0 != localParcel2.readInt())
            outState.readFromParcel(localParcel2);
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onStop()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onDestroy()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zzaD()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onBackPressed()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public boolean zzfn()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
          this.zzoz.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = 0 != localParcel2.readInt() ? 1 : 0;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return i;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfv
 * JD-Core Version:    0.6.0
 */