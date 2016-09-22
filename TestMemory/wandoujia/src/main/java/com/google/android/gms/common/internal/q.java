package com.google.android.gms.common.internal;

import android.support.v4.app.d;
import java.util.ArrayList;
import java.util.List;

public final class q
{
  private final List<String> a;
  private final Object b;

  private q(Object paramObject)
  {
    this.b = d.a(paramObject);
    this.a = new ArrayList();
  }

  public final q a(String paramString, Object paramObject)
  {
    this.a.add((String)d.a(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j >= i - 1)
        continue;
      localStringBuilder.append(", ");
    }
    return '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.q
 * JD-Core Version:    0.6.0
 */