package com.wandoujia.account;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AccountParams
  implements Parcelable
{
  public static final Parcelable.Creator<AccountParams> CREATOR = new i();
  private String a;
  private String b;
  private int c = -1;
  private String d;
  private String e;
  private String f;
  private boolean g = false;
  private boolean h = false;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private PendingIntent p;
  private AccountErrorResponse q;
  private int r;
  private AccountParams.Page s;
  private AccountParams.Type t;

  private AccountParams(Parcel paramParcel)
  {
    this.i = i1;
    this.j = i1;
    this.k = i1;
    this.l = i1;
    this.m = i1;
    this.n = i1;
    this.o = false;
    this.r = -1;
    this.s = AccountParams.Page.LOG_IN;
    this.t = AccountParams.Type.PHOENIX;
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    int i2;
    if (paramParcel.readByte() == i1)
      i2 = i1;
    while (true)
    {
      this.g = i2;
      int i3;
      label149: int i4;
      label166: int i5;
      label183: int i6;
      label200: int i7;
      label217: int i8;
      label234: int i9;
      if (paramParcel.readByte() == i1)
      {
        i3 = i1;
        this.h = i3;
        if (paramParcel.readByte() != i1)
          break label344;
        i4 = i1;
        this.i = i4;
        if (paramParcel.readByte() != i1)
          break label350;
        i5 = i1;
        this.j = i5;
        if (paramParcel.readByte() != i1)
          break label356;
        i6 = i1;
        this.k = i6;
        if (paramParcel.readByte() != i1)
          break label362;
        i7 = i1;
        this.l = i7;
        if (paramParcel.readByte() != i1)
          break label368;
        i8 = i1;
        this.m = i8;
        if (paramParcel.readByte() != i1)
          break label374;
        i9 = i1;
        label251: this.n = i9;
        if (paramParcel.readByte() != i1)
          break label380;
        this.o = i1;
      }
      try
      {
        this.p = ((PendingIntent)paramParcel.readParcelable(PendingIntent.class.getClassLoader()));
        this.q = ((AccountErrorResponse)paramParcel.readParcelable(AccountErrorResponse.class.getClassLoader()));
        label302: this.r = paramParcel.readInt();
        this.s = ((AccountParams.Page)paramParcel.readSerializable());
        this.t = ((AccountParams.Type)paramParcel.readSerializable());
        return;
        i2 = 0;
        continue;
        i3 = 0;
        break label149;
        label344: i4 = 0;
        break label166;
        label350: i5 = 0;
        break label183;
        label356: i6 = 0;
        break label200;
        label362: i7 = 0;
        break label217;
        label368: i8 = 0;
        break label234;
        label374: i9 = 0;
        break label251;
        label380: i1 = 0;
      }
      catch (BadParcelableException localBadParcelableException)
      {
        break label302;
      }
    }
  }

  public AccountParams(String paramString)
  {
    this.i = true;
    this.j = true;
    this.k = true;
    this.l = true;
    this.m = true;
    this.n = true;
    this.o = false;
    this.r = -1;
    this.s = AccountParams.Page.LOG_IN;
    this.t = AccountParams.Type.PHOENIX;
    this.b = paramString;
    this.g = false;
    this.c = -1;
  }

  public AccountParams(String paramString, byte paramByte)
  {
    this.i = true;
    this.j = true;
    this.k = true;
    this.l = true;
    this.m = true;
    this.n = true;
    this.o = false;
    this.r = -1;
    this.s = AccountParams.Page.LOG_IN;
    this.t = AccountParams.Type.PHOENIX;
    this.b = paramString;
    this.c = -1;
  }

  public final PendingIntent a()
  {
    return this.p;
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
  }

  public final void a(AccountParams.Page paramPage)
  {
    this.s = paramPage;
  }

  public final void a(String paramString)
  {
    this.d = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public final AccountErrorResponse b()
  {
    return this.q;
  }

  public final void b(String paramString)
  {
    this.a = paramString;
  }

  public final void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public final String c()
  {
    return this.e;
  }

  public final void c(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public final String d()
  {
    return this.d;
  }

  public int describeContents()
  {
    return 0;
  }

  public final String e()
  {
    return this.f;
  }

  public final int f()
  {
    return this.c;
  }

  public final boolean g()
  {
    return this.g;
  }

  public final boolean h()
  {
    return this.h;
  }

  public final boolean i()
  {
    return this.i;
  }

  public final boolean j()
  {
    return this.j;
  }

  public final boolean k()
  {
    return this.l;
  }

  public final boolean l()
  {
    return this.m;
  }

  public final String m()
  {
    return this.b;
  }

  public final void n()
  {
    this.g = false;
  }

  public final int o()
  {
    return this.r;
  }

  public final AccountParams.Page p()
  {
    return this.s;
  }

  public final AccountParams.Type q()
  {
    return this.t;
  }

  public final boolean r()
  {
    return this.n;
  }

  public final boolean s()
  {
    return this.o;
  }

  public final void t()
  {
    this.n = true;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = 1;
    String str1;
    String str2;
    label30: String str3;
    label55: String str4;
    label72: String str5;
    label89: int i2;
    label105: int i3;
    label122: int i4;
    label139: int i5;
    label156: int i6;
    label173: int i7;
    label190: int i8;
    label207: int i9;
    if (this.a == null)
    {
      str1 = "";
      paramParcel.writeString(str1);
      if (this.b != null)
        break label296;
      str2 = "unknown";
      paramParcel.writeString(str2);
      paramParcel.writeInt(this.c);
      if (this.d != null)
        break label305;
      str3 = "";
      paramParcel.writeString(str3);
      if (this.e != null)
        break label314;
      str4 = "";
      paramParcel.writeString(str4);
      if (this.f != null)
        break label323;
      str5 = "";
      paramParcel.writeString(str5);
      if (!this.g)
        break label332;
      i2 = i1;
      paramParcel.writeByte((byte)i2);
      if (!this.h)
        break label338;
      i3 = i1;
      paramParcel.writeByte((byte)i3);
      if (!this.i)
        break label344;
      i4 = i1;
      paramParcel.writeByte((byte)i4);
      if (!this.j)
        break label350;
      i5 = i1;
      paramParcel.writeByte((byte)i5);
      if (!this.k)
        break label356;
      i6 = i1;
      paramParcel.writeByte((byte)i6);
      if (!this.l)
        break label362;
      i7 = i1;
      paramParcel.writeByte((byte)i7);
      if (!this.m)
        break label368;
      i8 = i1;
      paramParcel.writeByte((byte)i8);
      if (!this.n)
        break label374;
      i9 = i1;
      label224: paramParcel.writeByte((byte)i9);
      if (!this.o)
        break label380;
    }
    while (true)
    {
      paramParcel.writeByte((byte)i1);
      paramParcel.writeParcelable(this.p, paramInt);
      paramParcel.writeParcelable(this.q, paramInt);
      paramParcel.writeInt(this.r);
      paramParcel.writeSerializable(this.s);
      paramParcel.writeSerializable(this.t);
      return;
      str1 = this.a;
      break;
      label296: str2 = this.b;
      break label30;
      label305: str3 = this.d;
      break label55;
      label314: str4 = this.e;
      break label72;
      label323: str5 = this.f;
      break label89;
      label332: i2 = 0;
      break label105;
      label338: i3 = 0;
      break label122;
      label344: i4 = 0;
      break label139;
      label350: i5 = 0;
      break label156;
      label356: i6 = 0;
      break label173;
      label362: i7 = 0;
      break label190;
      label368: i8 = 0;
      break label207;
      label374: i9 = 0;
      break label224;
      label380: i1 = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.AccountParams
 * JD-Core Version:    0.6.0
 */