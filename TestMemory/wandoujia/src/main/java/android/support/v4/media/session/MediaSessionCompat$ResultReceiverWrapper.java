package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new c();
  private ResultReceiver a;

  MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    this.a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper
 * JD-Core Version:    0.6.0
 */