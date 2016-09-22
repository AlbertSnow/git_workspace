package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConverterWrapper
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  private final int a;
  private final StringToIntConverter b;

  ConverterWrapper(int paramInt, StringToIntConverter paramStringToIntConverter)
  {
    this.a = paramInt;
    this.b = paramStringToIntConverter;
  }

  private ConverterWrapper(StringToIntConverter paramStringToIntConverter)
  {
    this.a = 1;
    this.b = paramStringToIntConverter;
  }

  public static ConverterWrapper a(com.google.android.gms.common.server.response.a<?, ?> parama)
  {
    if ((parama instanceof StringToIntConverter))
      return new ConverterWrapper((StringToIntConverter)parama);
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }

  final int a()
  {
    return this.a;
  }

  final StringToIntConverter b()
  {
    return this.b;
  }

  public final com.google.android.gms.common.server.response.a<?, ?> c()
  {
    if (this.b != null)
      return this.b;
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.converter.ConverterWrapper
 * JD-Core Version:    0.6.0
 */