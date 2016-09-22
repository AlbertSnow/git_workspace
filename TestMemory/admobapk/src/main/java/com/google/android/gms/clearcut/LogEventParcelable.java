package com.google.android.gms.clearcut;

import android.os.Parcel;
import anu;
import aod;
import awt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;
import nt;
import nw;

public class LogEventParcelable extends AbstractSafeParcelable
{
  public static final nw CREATOR = new nw();
  public final int a;
  public PlayLoggerContext b;
  public byte[] c;
  public int[] d;
  public String[] e;
  public int[] f;
  public byte[][] g;
  public boolean h;
  public final awt i;
  public final nt j;
  public final nt k;

  public LogEventParcelable(int paramInt, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte1, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramPlayLoggerContext;
    this.c = paramArrayOfByte;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfString;
    this.i = null;
    this.j = null;
    this.k = null;
    this.f = paramArrayOfInt2;
    this.g = paramArrayOfByte1;
    this.h = paramBoolean;
  }

  public LogEventParcelable(PlayLoggerContext paramPlayLoggerContext, awt paramawt, nt paramnt1, nt paramnt2, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    this.a = 1;
    this.b = paramPlayLoggerContext;
    this.i = paramawt;
    this.j = paramnt1;
    this.k = paramnt2;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfString;
    this.f = paramArrayOfInt2;
    this.g = paramArrayOfByte;
    this.h = paramBoolean;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    while (true)
    {
      return true;
      if (!(paramObject instanceof LogEventParcelable))
        break;
      LogEventParcelable localLogEventParcelable = (LogEventParcelable)paramObject;
      if ((this.a != localLogEventParcelable.a) || (!anu.a(this.b, localLogEventParcelable.b)) || (!Arrays.equals(this.c, localLogEventParcelable.c)) || (!Arrays.equals(this.d, localLogEventParcelable.d)) || (!Arrays.equals(this.e, localLogEventParcelable.e)) || (!anu.a(this.i, localLogEventParcelable.i)) || (!anu.a(this.j, localLogEventParcelable.j)) || (!anu.a(this.k, localLogEventParcelable.k)) || (!Arrays.equals(this.f, localLogEventParcelable.f)) || (!Arrays.deepEquals(this.g, localLogEventParcelable.g)) || (this.h != localLogEventParcelable.h))
        return false;
    }
    return false;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[11];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.i;
    arrayOfObject[6] = this.j;
    arrayOfObject[7] = this.k;
    arrayOfObject[8] = this.f;
    arrayOfObject[9] = this.g;
    arrayOfObject[10] = Boolean.valueOf(this.h);
    return Arrays.hashCode(arrayOfObject);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[").append(this.a).append(", ").append(this.b).append(", LogEventBytes: ");
    if (this.c == null);
    for (String str = null; ; str = new String(this.c))
      return str + ", TestCodes: " + Arrays.toString(this.d) + ", MendelPackages: " + Arrays.toString(this.e) + ", LogEvent: " + this.i + ", ExtensionProducer: " + this.j + ", VeProducer: " + this.k + ", ExperimentIDs: " + Arrays.toString(this.f) + ", ExperimentTokens: " + Arrays.toString(this.g) + ", AddPhenotypeExperimentTokens: " + this.h + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 0;
    int n = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, paramInt, false);
    aod.a(paramParcel, 3, this.c, false);
    aod.a(paramParcel, 4, this.d, false);
    String[] arrayOfString = this.e;
    if (arrayOfString != null)
    {
      int i3 = aod.a(paramParcel, 5);
      paramParcel.writeStringArray(arrayOfString);
      aod.b(paramParcel, i3);
    }
    aod.a(paramParcel, 6, this.f, false);
    byte[][] arrayOfByte = this.g;
    if (arrayOfByte != null)
    {
      int i1 = aod.a(paramParcel, 7);
      int i2 = arrayOfByte.length;
      paramParcel.writeInt(i2);
      while (m < i2)
      {
        paramParcel.writeByteArray(arrayOfByte[m]);
        m++;
      }
      aod.b(paramParcel, i1);
    }
    aod.a(paramParcel, 8, this.h);
    aod.b(paramParcel, n);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.clearcut.LogEventParcelable
 * JD-Core Version:    0.6.0
 */