package com.unipay.c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class e
{
  private Bundle a = new Bundle();
  private List<String> b = new ArrayList();

  public final int a()
  {
    return this.b.size();
  }

  public final String a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.b.size()))
      return (String)this.b.get(paramInt);
    return "";
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.b.contains(paramString1))
    {
      this.a.putString(paramString1, paramString2);
      return;
    }
    this.b.add(paramString1);
    this.a.putString(paramString1, paramString2);
  }

  public final String b(int paramInt)
  {
    String str = (String)this.b.get(paramInt);
    return this.a.getString(str);
  }

  public final void b()
  {
    this.b.clear();
    this.a.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.c.e
 * JD-Core Version:    0.6.0
 */