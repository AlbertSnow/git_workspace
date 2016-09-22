package com.wandoujia.ripple_framework.navigation;

import android.os.Bundle;
import android.util.SparseArray;

public final class b
{
  private SparseArray<Object> a = new SparseArray();
  private int b;

  public final int a(Object paramObject)
  {
    this.a.append(this.b, paramObject);
    int i = this.b;
    this.b = (i + 1);
    return i;
  }

  public final int a(Object paramObject, String paramString, Bundle paramBundle)
  {
    int i = a(paramObject);
    paramBundle.putInt(paramString, i);
    return i;
  }

  public final Object a(int paramInt)
  {
    Object localObject = this.a.get(paramInt);
    this.a.remove(paramInt);
    return localObject;
  }

  public final Object a(String paramString, Bundle paramBundle)
  {
    return a(paramBundle.getInt(paramString, -1));
  }

  public final void a(int paramInt, Object paramObject)
  {
    if (paramInt < 0)
      return;
    this.a.append(paramInt, paramObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.navigation.b
 * JD-Core Version:    0.6.0
 */