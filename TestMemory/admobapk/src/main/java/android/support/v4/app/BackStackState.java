package android.support.v4.app;

import ak;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import o;
import s;
import u;
import z;

public final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new u();
  private int[] a;
  private int b;
  private int c;
  private String d;
  private int e;
  private int f;
  private CharSequence g;
  private int h;
  private CharSequence i;
  private ArrayList j;
  private ArrayList k;

  public BackStackState(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }

  public BackStackState(o paramo)
  {
    s locals1 = paramo.a;
    int m = 0;
    while (locals1 != null)
    {
      if (locals1.i != null)
        m += locals1.i.size();
      locals1 = locals1.a;
    }
    this.a = new int[m + 7 * paramo.b];
    if (!paramo.e)
      throw new IllegalStateException("Not on back stack");
    s locals2 = paramo.a;
    int n = 0;
    if (locals2 != null)
    {
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      arrayOfInt1[n] = locals2.c;
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      int i3;
      if (locals2.d != null)
        i3 = locals2.d.h;
      int i7;
      while (true)
      {
        arrayOfInt2[i1] = i3;
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        arrayOfInt3[i2] = locals2.e;
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        arrayOfInt4[i4] = locals2.f;
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        arrayOfInt5[i5] = locals2.g;
        int[] arrayOfInt6 = this.a;
        i7 = i6 + 1;
        arrayOfInt6[i6] = locals2.h;
        if (locals2.i == null)
          break;
        int i8 = locals2.i.size();
        int[] arrayOfInt8 = this.a;
        int i9 = i7 + 1;
        arrayOfInt8[i7] = i8;
        int i10 = 0;
        while (true)
          if (i10 < i8)
          {
            int[] arrayOfInt9 = this.a;
            int i11 = i9 + 1;
            arrayOfInt9[i9] = ((z)locals2.i.get(i10)).h;
            i10++;
            i9 = i11;
            continue;
            i3 = -1;
            break;
          }
        n = i9;
      }
      while (true)
      {
        locals2 = locals2.a;
        break;
        int[] arrayOfInt7 = this.a;
        n = i7 + 1;
        arrayOfInt7[i7] = 0;
      }
    }
    this.b = paramo.c;
    this.c = paramo.d;
    this.d = paramo.f;
    this.e = paramo.g;
    this.f = paramo.h;
    this.g = paramo.i;
    this.h = paramo.j;
    this.i = paramo.k;
    this.j = paramo.l;
    this.k = paramo.m;
  }

  public final o a(ak paramak)
  {
    o localo = new o(paramak);
    int m = 0;
    while (m < this.a.length)
    {
      s locals = new s();
      int[] arrayOfInt1 = this.a;
      int n = m + 1;
      locals.c = arrayOfInt1[m];
      int[] arrayOfInt2 = this.a;
      int i1 = n + 1;
      int i2 = arrayOfInt2[n];
      if (i2 >= 0);
      for (locals.d = ((z)paramak.b.get(i2)); ; locals.d = null)
      {
        int[] arrayOfInt3 = this.a;
        int i3 = i1 + 1;
        locals.e = arrayOfInt3[i1];
        int[] arrayOfInt4 = this.a;
        int i4 = i3 + 1;
        locals.f = arrayOfInt4[i3];
        int[] arrayOfInt5 = this.a;
        int i5 = i4 + 1;
        locals.g = arrayOfInt5[i4];
        int[] arrayOfInt6 = this.a;
        int i6 = i5 + 1;
        locals.h = arrayOfInt6[i5];
        int[] arrayOfInt7 = this.a;
        m = i6 + 1;
        int i7 = arrayOfInt7[i6];
        if (i7 <= 0)
          break;
        locals.i = new ArrayList(i7);
        int i8 = 0;
        while (i8 < i7)
        {
          ArrayList localArrayList = paramak.b;
          int[] arrayOfInt8 = this.a;
          int i9 = m + 1;
          z localz = (z)localArrayList.get(arrayOfInt8[m]);
          locals.i.add(localz);
          i8++;
          m = i9;
        }
      }
      localo.a(locals);
    }
    localo.c = this.b;
    localo.d = this.c;
    localo.f = this.d;
    localo.g = this.e;
    localo.e = true;
    localo.h = this.f;
    localo.i = this.g;
    localo.j = this.h;
    localo.k = this.i;
    localo.l = this.j;
    localo.m = this.k;
    localo.a(1);
    return localo;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.BackStackState
 * JD-Core Version:    0.6.0
 */