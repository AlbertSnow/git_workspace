package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new j();
  private int[] a;
  private int b;
  private int c;
  private String d;
  private int e;
  private int f;
  private CharSequence g;
  private int h;
  private CharSequence i;
  private ArrayList<String> j;
  private ArrayList<String> k;

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

  public BackStackState(e parame)
  {
    h localh1 = parame.a;
    int m = 0;
    while (localh1 != null)
    {
      if (localh1.i != null)
        m += localh1.i.size();
      localh1 = localh1.a;
    }
    this.a = new int[m + 7 * parame.b];
    if (!parame.e)
      throw new IllegalStateException("Not on back stack");
    h localh2 = parame.a;
    int n = 0;
    if (localh2 != null)
    {
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      arrayOfInt1[n] = localh2.c;
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      int i3;
      if (localh2.d != null)
        i3 = localh2.d.mIndex;
      int i7;
      while (true)
      {
        arrayOfInt2[i1] = i3;
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        arrayOfInt3[i2] = localh2.e;
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        arrayOfInt4[i4] = localh2.f;
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        arrayOfInt5[i5] = localh2.g;
        int[] arrayOfInt6 = this.a;
        i7 = i6 + 1;
        arrayOfInt6[i6] = localh2.h;
        if (localh2.i == null)
          break;
        int i8 = localh2.i.size();
        int[] arrayOfInt8 = this.a;
        int i9 = i7 + 1;
        arrayOfInt8[i7] = i8;
        int i10 = 0;
        while (true)
          if (i10 < i8)
          {
            int[] arrayOfInt9 = this.a;
            int i11 = i9 + 1;
            arrayOfInt9[i9] = ((Fragment)localh2.i.get(i10)).mIndex;
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
        localh2 = localh2.a;
        break;
        int[] arrayOfInt7 = this.a;
        n = i7 + 1;
        arrayOfInt7[i7] = 0;
      }
    }
    this.b = parame.c;
    this.c = parame.d;
    this.d = parame.f;
    this.e = parame.g;
    this.f = parame.h;
    this.g = parame.i;
    this.h = parame.j;
    this.i = parame.k;
    this.j = parame.l;
    this.k = parame.m;
  }

  public final e a(s params)
  {
    e locale = new e(params);
    int m = 0;
    while (m < this.a.length)
    {
      h localh = new h();
      int[] arrayOfInt1 = this.a;
      int n = m + 1;
      localh.c = arrayOfInt1[m];
      int[] arrayOfInt2 = this.a;
      int i1 = n + 1;
      int i2 = arrayOfInt2[n];
      if (i2 >= 0);
      for (localh.d = ((Fragment)params.a.get(i2)); ; localh.d = null)
      {
        int[] arrayOfInt3 = this.a;
        int i3 = i1 + 1;
        localh.e = arrayOfInt3[i1];
        int[] arrayOfInt4 = this.a;
        int i4 = i3 + 1;
        localh.f = arrayOfInt4[i3];
        int[] arrayOfInt5 = this.a;
        int i5 = i4 + 1;
        localh.g = arrayOfInt5[i4];
        int[] arrayOfInt6 = this.a;
        int i6 = i5 + 1;
        localh.h = arrayOfInt6[i5];
        int[] arrayOfInt7 = this.a;
        m = i6 + 1;
        int i7 = arrayOfInt7[i6];
        if (i7 <= 0)
          break;
        localh.i = new ArrayList(i7);
        int i8 = 0;
        while (i8 < i7)
        {
          ArrayList localArrayList = params.a;
          int[] arrayOfInt8 = this.a;
          int i9 = m + 1;
          Fragment localFragment = (Fragment)localArrayList.get(arrayOfInt8[m]);
          localh.i.add(localFragment);
          i8++;
          m = i9;
        }
      }
      locale.a(localh);
    }
    locale.c = this.b;
    locale.d = this.c;
    locale.f = this.d;
    locale.g = this.e;
    locale.e = true;
    locale.h = this.f;
    locale.i = this.g;
    locale.j = this.h;
    locale.k = this.i;
    locale.l = this.j;
    locale.m = this.k;
    locale.a(1);
    return locale;
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.BackStackState
 * JD-Core Version:    0.6.0
 */