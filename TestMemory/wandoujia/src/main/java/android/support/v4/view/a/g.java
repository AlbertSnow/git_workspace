package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

class g extends l
{
  public final Object a(int paramInt1, int paramInt2)
  {
    return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false, 0);
  }

  public final Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.g
 * JD-Core Version:    0.6.0
 */