package com.wandoujia.jupiter.topic;

import android.os.Bundle;

public final class a
{
  private com.wandoujia.jupiter.topic.b.a a;
  private com.wandoujia.jupiter.topic.b.a b;
  private final String c;
  private final String d;

  public a(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }

  private static com.wandoujia.jupiter.topic.b.a a(Bundle paramBundle, String paramString, b paramb)
  {
    return new com.wandoujia.jupiter.topic.b.a(String.format(paramString, new Object[] { paramBundle.getString("alias_argument") }), new c(paramb), new d());
  }

  public final void a()
  {
    if (this.a != null)
      this.a.f();
    if (this.b != null)
      this.b.f();
  }

  public final void a(Bundle paramBundle, b paramb)
  {
    this.a = a(paramBundle, this.c, paramb);
    this.a.u();
  }

  public final void b(Bundle paramBundle, b paramb)
  {
    this.b = a(paramBundle, this.d, paramb);
    this.b.u();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.a
 * JD-Core Version:    0.6.0
 */