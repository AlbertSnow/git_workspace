package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new e();
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;

  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.b = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.ParcelableVolumeInfo
 * JD-Core Version:    0.6.0
 */