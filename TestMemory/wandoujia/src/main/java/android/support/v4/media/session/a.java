package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

final class a
  implements IMediaControllerCallback
{
  private IBinder a;

  a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      this.a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(7, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(MediaMetadataCompat paramMediaMetadataCompat)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramMediaMetadataCompat != null)
      {
        localParcel.writeInt(1);
        paramMediaMetadataCompat.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(4, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramParcelableVolumeInfo != null)
      {
        localParcel.writeInt(1);
        paramParcelableVolumeInfo.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(8, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(PlaybackStateCompat paramPlaybackStateCompat)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramPlaybackStateCompat != null)
      {
        localParcel.writeInt(1);
        paramPlaybackStateCompat.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(3, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(CharSequence paramCharSequence)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramCharSequence != null)
      {
        localParcel.writeInt(1);
        TextUtils.writeToParcel(paramCharSequence, localParcel, 0);
      }
      while (true)
      {
        this.a.transact(6, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(String paramString, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final void a(List<MediaSessionCompat.QueueItem> paramList)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      localParcel.writeTypedList(paramList);
      this.a.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.a
 * JD-Core Version:    0.6.0
 */