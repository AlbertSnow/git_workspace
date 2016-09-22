package com.google.android.gms.internal;

import android.support.v4.app.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e extends x<e>
{
  private final Map<String, Object> a = new HashMap();

  public final Map<String, Object> a()
  {
    return Collections.unmodifiableMap(this.a);
  }

  public final void a(String paramString1, String paramString2)
  {
    d.i(paramString1);
    if ((paramString1 != null) && (paramString1.startsWith("&")))
      paramString1 = paramString1.substring(1);
    d.a(paramString1, "Name can not be empty or \"&\"");
    this.a.put(paramString1, paramString2);
  }

  public final String toString()
  {
    return a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.e
 * JD-Core Version:    0.6.0
 */