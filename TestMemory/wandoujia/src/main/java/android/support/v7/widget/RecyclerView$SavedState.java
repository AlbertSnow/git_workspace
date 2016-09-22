package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class RecyclerView$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new cj();
  Parcelable a;

  RecyclerView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readParcelable(ce.class.getClassLoader());
  }

  RecyclerView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.a, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.SavedState
 * JD-Core Version:    0.6.0
 */