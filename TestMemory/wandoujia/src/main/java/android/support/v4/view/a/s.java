package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

final class s extends AccessibilityNodeProvider
{
  s(t paramt)
  {
  }

  public final AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    o.b();
    return null;
  }

  public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    o.d();
    ArrayList localArrayList = new ArrayList();
    int i = null.size();
    for (int j = 0; j < i; j++)
      localArrayList.add(((f)null.get(j)).a());
    return localArrayList;
  }

  public final boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return o.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.s
 * JD-Core Version:    0.6.0
 */