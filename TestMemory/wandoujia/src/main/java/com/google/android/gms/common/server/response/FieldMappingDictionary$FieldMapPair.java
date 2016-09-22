package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FieldMappingDictionary$FieldMapPair
  implements SafeParcelable
{
  public static final c CREATOR = new c();
  final int a;
  final String b;
  final FastJsonResponse.Field<?, ?> c;

  FieldMappingDictionary$FieldMapPair(int paramInt, String paramString, FastJsonResponse.Field<?, ?> paramField)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramField;
  }

  FieldMappingDictionary$FieldMapPair(String paramString, FastJsonResponse.Field<?, ?> paramField)
  {
    this.a = 1;
    this.b = paramString;
    this.c = paramField;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMappingDictionary.FieldMapPair
 * JD-Core Version:    0.6.0
 */