package com.google.android.gms.ads.internal.appcontent;

public final class p
{
  final long a;
  final String b;
  final int c;

  p(long paramLong, String paramString, int paramInt)
  {
    this.a = paramLong;
    this.b = paramString;
    this.c = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof p)))
      return false;
    return (((p)paramObject).a == this.a) && (((p)paramObject).c == this.c);
  }

  public final int hashCode()
  {
    return (int)this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.p
 * JD-Core Version:    0.6.0
 */