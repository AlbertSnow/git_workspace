package com.wandoujia.rootkit.b;

public final class b extends a
{
  private StringBuilder c = new StringBuilder();

  public b(String[] paramArrayOfString)
  {
    super(0, paramArrayOfString);
  }

  public final void a(int paramInt, String paramString)
  {
    this.c.append(paramString).append('\n');
    new StringBuilder("ID: ").append(paramInt).append(", ").append(paramString);
  }

  public final String toString()
  {
    return this.c.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.b.b
 * JD-Core Version:    0.6.0
 */