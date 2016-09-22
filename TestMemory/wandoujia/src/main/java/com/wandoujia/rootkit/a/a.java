package com.wandoujia.rootkit.a;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class a
{
  private File a;
  private File b;
  private String c;
  private Set<String> d;

  public a(File paramFile1, File paramFile2, String paramString1, String paramString2)
  {
    this.a = paramFile1;
    this.b = paramFile2;
    this.c = paramString1;
    this.d = new HashSet(Arrays.asList(paramString2.split(",")));
  }

  public final File a()
  {
    return this.a;
  }

  public final File b()
  {
    return this.b;
  }

  public final Set<String> c()
  {
    return this.d;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    return String.format("%s on %s type %s %s", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.a.a
 * JD-Core Version:    0.6.0
 */