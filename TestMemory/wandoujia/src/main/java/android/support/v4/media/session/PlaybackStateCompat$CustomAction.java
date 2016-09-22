package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator<CustomAction> CREATOR = new g();
  private final String a;
  private final CharSequence b;
  private final int c;
  private final Bundle d;

  private PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = paramParcel.readInt();
    this.d = paramParcel.readBundle();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    return "Action:mName='" + this.b + ", mIcon=" + this.c + ", mExtras=" + this.d;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    TextUtils.writeToParcel(this.b, paramParcel, paramInt);
    paramParcel.writeInt(this.c);
    paramParcel.writeBundle(this.d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.CustomAction
 * JD-Core Version:    0.6.0
 */