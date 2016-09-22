package com.org.apache.http.entity.mime;

public final class f
{
  private final String a;
  private final String b;

  f(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(": ");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.f
 * JD-Core Version:    0.6.0
 */