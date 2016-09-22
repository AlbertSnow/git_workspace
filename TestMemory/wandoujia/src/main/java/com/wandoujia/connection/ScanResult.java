package com.wandoujia.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScanResult
  implements Parcelable
{
  public static final Parcelable.Creator<ScanResult> CREATOR = new f();
  private int a;
  private List<ScanItem> b = new ArrayList();

  private ScanResult(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    for (int j = 0; j < i; j++)
      this.b.add(ScanItem.CREATOR.createFromParcel(paramParcel));
    this.a = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.b.size());
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((ScanItem)localIterator.next()).writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.connection.ScanResult
 * JD-Core Version:    0.6.0
 */