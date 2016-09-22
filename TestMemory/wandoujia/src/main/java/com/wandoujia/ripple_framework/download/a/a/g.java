package com.wandoujia.ripple_framework.download.a.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class g
{
  public StringBuilder a = new StringBuilder();
  public List<String> b = new ArrayList();

  public final <T> void a(String paramString, T[] paramArrayOfT)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return;
      if (this.a.length() != 0)
        this.a.append(" AND ");
      this.a.append("(");
      this.a.append(paramString);
      this.a.append(")");
      if (paramArrayOfT == null)
        continue;
      int i = paramArrayOfT.length;
      for (int j = 0; j < i; j++)
      {
        T ? = paramArrayOfT[j];
        this.b.add(?.toString());
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.a.g
 * JD-Core Version:    0.6.0
 */