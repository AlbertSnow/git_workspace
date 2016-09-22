package com.google.android.gms.common.api;

import aiy;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import aod;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Scope extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new aiy();
  final int a;
  public final String b;

  public Scope(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException(String.valueOf("scopeUri must not be null or empty"));
    this.a = paramInt;
    this.b = paramString;
  }

  public Scope(String paramString)
  {
    this(1, paramString);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof Scope))
      return false;
    return this.b.equals(((Scope)paramObject).b);
  }

  public final int hashCode()
  {
    return this.b.hashCode();
  }

  public final String toString()
  {
    return this.b;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Scope
 * JD-Core Version:    0.6.0
 */