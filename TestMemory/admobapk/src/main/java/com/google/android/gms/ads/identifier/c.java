package com.google.android.gms.ads.identifier;

public final class c
{
  public final String a;
  public final boolean b;

  public c(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public final String toString()
  {
    String str = this.a;
    boolean bool = this.b;
    return 7 + String.valueOf(str).length() + "{" + str + "}" + bool;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.c
 * JD-Core Version:    0.6.0
 */