package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator<QueueItem> CREATOR = new b();
  private final MediaDescriptionCompat a;
  private final long b;

  private MediaSessionCompat$QueueItem(Parcel paramParcel)
  {
    this.a = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    this.b = paramParcel.readLong();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem
 * JD-Core Version:    0.6.0
 */