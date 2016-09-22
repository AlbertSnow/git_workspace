package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class cr
{
  public void a(ViewParent paramViewParent, View paramView)
  {
    if ((paramViewParent instanceof ar))
      ((ar)paramViewParent).onStopNestedScroll(paramView);
  }

  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramViewParent instanceof ar))
      ((ar)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramViewParent instanceof ar))
      ((ar)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
  }

  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    if ((paramViewParent instanceof ar))
      return ((ar)paramViewParent).onNestedPreFling(paramView, paramFloat1, paramFloat2);
    return false;
  }

  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((paramViewParent instanceof ar))
      return ((ar)paramViewParent).onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    return false;
  }

  public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if ((paramViewParent instanceof ar))
      return ((ar)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt);
    return false;
  }

  public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if ((paramViewParent instanceof ar))
      ((ar)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.cr
 * JD-Core Version:    0.6.0
 */