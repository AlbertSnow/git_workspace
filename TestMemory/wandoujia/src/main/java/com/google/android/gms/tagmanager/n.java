package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;
import java.util.Set;

abstract class n
{
  private final Set<String> a;

  public abstract a a(Map<String, a> paramMap);

  public final Set<String> a()
  {
    return this.a;
  }

  final boolean a(Set<String> paramSet)
  {
    return paramSet.containsAll(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.n
 * JD-Core Version:    0.6.0
 */