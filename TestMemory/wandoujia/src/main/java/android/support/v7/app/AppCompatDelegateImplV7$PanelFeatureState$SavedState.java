package android.support.v7.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class AppCompatDelegateImplV7$PanelFeatureState$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new y();
  private int a;
  private boolean b;
  private Bundle c;

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    if (this.b);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      if (this.b)
        paramParcel.writeBundle(this.c);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState.SavedState
 * JD-Core Version:    0.6.0
 */