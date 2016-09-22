package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new d();
  private final Object a;

  MediaSessionCompat$Token(Object paramObject)
  {
    this.a = paramObject;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramParcel.writeParcelable((Parcelable)this.a, paramInt);
      return;
    }
    paramParcel.writeStrongBinder((IBinder)this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token
 * JD-Core Version:    0.6.0
 */