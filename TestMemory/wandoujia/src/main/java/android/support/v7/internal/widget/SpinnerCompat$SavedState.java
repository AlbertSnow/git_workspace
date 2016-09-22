package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class SpinnerCompat$SavedState extends AbsSpinnerCompat.SavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new ap();
  boolean c;

  private SpinnerCompat$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.c = bool;
      return;
    }
  }

  SpinnerCompat$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    if (this.c);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeByte((byte)i);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.SpinnerCompat.SavedState
 * JD-Core Version:    0.6.0
 */