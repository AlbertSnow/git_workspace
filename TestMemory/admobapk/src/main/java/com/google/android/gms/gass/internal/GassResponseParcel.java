package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import aqk;
import awa;
import awb;
import com.google.ads.afma.nano.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GassResponseParcel extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new aqk();
  public final int a;
  public d b;
  byte[] c;

  public GassResponseParcel(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = null;
    this.c = paramArrayOfByte;
    b();
  }

  private final void b()
  {
    if ((this.b == null) && (this.c != null));
    do
      return;
    while ((this.b != null) && (this.c == null));
    if ((this.b != null) && (this.c != null))
      throw new IllegalStateException("Invalid internal representation - full");
    if ((this.b == null) && (this.c == null))
      throw new IllegalStateException("Invalid internal representation - empty");
    throw new IllegalStateException("Impossible");
  }

  public final void a()
  {
    int i;
    if (this.b != null)
      i = 1;
    while (true)
    {
      if (i == 0);
      try
      {
        byte[] arrayOfByte = this.c;
        this.b = ((d)awb.a(new d(), arrayOfByte));
        this.c = null;
        b();
        return;
        i = 0;
      }
      catch (awa localawa)
      {
      }
    }
    throw new IllegalStateException(localawa);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    if (this.c != null);
    for (byte[] arrayOfByte = this.c; ; arrayOfByte = awb.a(this.b))
    {
      aod.a(paramParcel, 2, arrayOfByte, false);
      aod.b(paramParcel, i);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.gass.internal.GassResponseParcel
 * JD-Core Version:    0.6.0
 */