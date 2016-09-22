package com.wandoujia.p4.app;

import android.content.Context;
import android.util.SparseIntArray;
import com.wandoujia.appmanager.LocalAppChangedListener.Error;
import com.wandoujia.jupiter.view.p;

public final class b
{
  private static final SparseIntArray a;

  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    a = localSparseIntArray;
    localSparseIntArray.put(LocalAppChangedListener.Error.STORAGE_ERROR.ordinal(), 2131625333);
    a.put(LocalAppChangedListener.Error.INCONSISTENT_CERTIFICATES.ordinal(), 2131625332);
    a.put(LocalAppChangedListener.Error.INSUFFICIENT_STORAGE.ordinal(), 2131625334);
  }

  public static void a(Context paramContext)
  {
    if (paramContext == null)
      return;
    p.a(paramContext, paramContext.getString(2131625400), p.b).a();
  }

  public static void b(Context paramContext)
  {
    if (paramContext == null)
      return;
    p.a(paramContext, paramContext.getString(2131624968), p.b).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.b
 * JD-Core Version:    0.6.0
 */