package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;

public abstract class IMediaControllerCallback$Stub extends Binder
  implements IMediaControllerCallback
{
  public IMediaControllerCallback$Stub()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
  }

  public static IMediaControllerCallback a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IMediaControllerCallback)))
      return (IMediaControllerCallback)localIInterface;
    return new a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      return true;
    case 1:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      String str = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (i1 != 0)
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(str, localBundle2);
      return true;
    case 2:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      a();
      return true;
    case 3:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      int n = paramParcel1.readInt();
      PlaybackStateCompat localPlaybackStateCompat = null;
      if (n != 0)
        localPlaybackStateCompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
      a(localPlaybackStateCompat);
      return true;
    case 4:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      int m = paramParcel1.readInt();
      MediaMetadataCompat localMediaMetadataCompat = null;
      if (m != 0)
        localMediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
      a(localMediaMetadataCompat);
      return true;
    case 5:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      a(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
      return true;
    case 6:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      int k = paramParcel1.readInt();
      CharSequence localCharSequence = null;
      if (k != 0)
        localCharSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
      a(localCharSequence);
      return true;
    case 7:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      int j = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (j != 0)
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(localBundle1);
      return true;
    case 8:
    }
    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
    int i = paramParcel1.readInt();
    ParcelableVolumeInfo localParcelableVolumeInfo = null;
    if (i != 0)
      localParcelableVolumeInfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
    a(localParcelableVolumeInfo);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback.Stub
 * JD-Core Version:    0.6.0
 */