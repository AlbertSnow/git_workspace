package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command
  implements Parcelable
{

  @Deprecated
  public static final Parcelable.Creator<Command> CREATOR = new a();
  private String a;
  private String b;
  private String c;

  @Deprecated
  public Command()
  {
  }

  @Deprecated
  Command(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.c;
  }

  @Deprecated
  public int describeContents()
  {
    return 0;
  }

  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.Command
 * JD-Core Version:    0.6.0
 */