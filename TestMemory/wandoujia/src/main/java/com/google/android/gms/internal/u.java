package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class u
  implements af
{
  private static final Uri a;
  private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    a = localBuilder.build();
  }

  public final Uri a()
  {
    return a;
  }

  public final void a(w paramw)
  {
    ArrayList localArrayList = new ArrayList(paramw.b());
    Collections.sort(localArrayList, new v());
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = ((x)localIterator.next()).toString();
      if (TextUtils.isEmpty(str))
        continue;
      if (localStringBuilder.length() != 0)
        localStringBuilder.append(", ");
      localStringBuilder.append(str);
    }
    this.b.println(localStringBuilder.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.u
 * JD-Core Version:    0.6.0
 */