package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

class l extends k
{
  public Object a(int paramInt1, int paramInt2)
  {
    return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false);
  }

  public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    ((AccessibilityNodeInfo)paramObject1).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject2);
  }

  public final void b(Object paramObject1, Object paramObject2)
  {
    ((AccessibilityNodeInfo)paramObject1).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.l
 * JD-Core Version:    0.6.0
 */