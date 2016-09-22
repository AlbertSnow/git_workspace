package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

public abstract class IMediaSession$Stub extends Binder
  implements IMediaSession
{
  public IMediaSession$Stub()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaSession");
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
      return true;
    case 1:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      if (paramParcel1.readInt() != 0)
        KeyEvent.CREATOR.createFromParcel(paramParcel1);
      boolean bool2 = a();
      paramParcel2.writeNoException();
      int k = 0;
      if (bool2)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 3:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      IMediaControllerCallback.Stub.a(paramParcel1.readStrongBinder());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      IMediaControllerCallback.Stub.a(paramParcel1.readStrongBinder());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      boolean bool1 = b();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool1)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 6:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str2 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 7:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str1 = d();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 8:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      PendingIntent localPendingIntent = e();
      paramParcel2.writeNoException();
      if (localPendingIntent != null)
      {
        paramParcel2.writeInt(1);
        localPendingIntent.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      long l = f();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      return true;
    case 10:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      ParcelableVolumeInfo localParcelableVolumeInfo = g();
      paramParcel2.writeNoException();
      if (localParcelableVolumeInfo != null)
      {
        paramParcel2.writeInt(1);
        localParcelableVolumeInfo.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 11:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readInt();
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readInt();
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readLong();
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 18:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 20:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readLong();
      paramParcel2.writeNoException();
      return true;
    case 24:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      if (paramParcel1.readInt() != 0)
        RatingCompat.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 25:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 26:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      MediaMetadataCompat localMediaMetadataCompat = h();
      paramParcel2.writeNoException();
      if (localMediaMetadataCompat != null)
      {
        paramParcel2.writeInt(1);
        localMediaMetadataCompat.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 27:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      PlaybackStateCompat localPlaybackStateCompat = i();
      paramParcel2.writeNoException();
      if (localPlaybackStateCompat != null)
      {
        paramParcel2.writeInt(1);
        localPlaybackStateCompat.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 28:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      List localList = j();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(localList);
      return true;
    case 29:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      CharSequence localCharSequence = k();
      paramParcel2.writeNoException();
      if (localCharSequence != null)
      {
        paramParcel2.writeInt(1);
        TextUtils.writeToParcel(localCharSequence, paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 30:
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      Bundle localBundle = l();
      paramParcel2.writeNoException();
      if (localBundle != null)
      {
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 31:
    }
    paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
    int i = m();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.IMediaSession.Stub
 * JD-Core Version:    0.6.0
 */