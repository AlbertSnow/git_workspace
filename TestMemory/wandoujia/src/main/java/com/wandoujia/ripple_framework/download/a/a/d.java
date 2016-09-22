package com.wandoujia.ripple_framework.download.a.a;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

final class d extends CursorWrapper
  implements CrossProcessCursor
{
  private final CrossProcessCursor a;

  public d(Cursor paramCursor)
  {
    super(paramCursor);
    this.a = ((CrossProcessCursor)paramCursor);
  }

  public final void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    this.a.fillWindow(paramInt, paramCursorWindow);
  }

  public final CursorWindow getWindow()
  {
    return this.a.getWindow();
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    return this.a.onMove(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.a.d
 * JD-Core Version:    0.6.0
 */