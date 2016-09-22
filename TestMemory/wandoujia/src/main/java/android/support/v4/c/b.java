package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b<T>
  implements Parcelable.Creator<T>
{
  private c<T> a;

  public b(c<T> paramc)
  {
    this.a = paramc;
  }

  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }

  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.c.b
 * JD-Core Version:    0.6.0
 */