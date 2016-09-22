package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
  implements Parcelable
{
  public static final Parcelable.Creator<FullSpanItem> CREATOR = new dg();
  int a;
  private int b;
  private int[] c;
  private boolean d;

  public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()
  {
  }

  public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == i);
    while (true)
    {
      this.d = i;
      int j = paramParcel.readInt();
      if (j > 0)
      {
        this.c = new int[j];
        paramParcel.readIntArray(this.c);
      }
      return;
      i = 0;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.d);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      if ((this.c == null) || (this.c.length <= 0))
        break;
      paramParcel.writeInt(this.c.length);
      paramParcel.writeIntArray(this.c);
      return;
    }
    paramParcel.writeInt(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem
 * JD-Core Version:    0.6.0
 */