package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class ActionMenuPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new h();
  private int a;

  ActionMenuPresenter$SavedState()
  {
  }

  ActionMenuPresenter$SavedState(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuPresenter.SavedState
 * JD-Core Version:    0.6.0
 */