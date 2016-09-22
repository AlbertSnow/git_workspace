package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class NestedScrollView$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new aj();
  public int a;

  public NestedScrollView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
  }

  NestedScrollView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.NestedScrollView.SavedState
 * JD-Core Version:    0.6.0
 */