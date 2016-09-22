package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

final class u
{
  private static final int[] a = { 16843828 };

  public static int a(Object paramObject)
  {
    if (paramObject != null)
      return ((WindowInsets)paramObject).getSystemWindowInsetTop();
    return 0;
  }

  public static Drawable a(Context paramContext)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(a);
    try
    {
      Drawable localDrawable = localTypedArray.getDrawable(0);
      return localDrawable;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  public static void a(View paramView)
  {
    if ((paramView instanceof w))
    {
      paramView.setOnApplyWindowInsetsListener(new v());
      paramView.setSystemUiVisibility(1280);
    }
  }

  public static void a(View paramView, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3)
      localWindowInsets = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    while (true)
    {
      paramView.dispatchApplyWindowInsets(localWindowInsets);
      return;
      if (paramInt != 5)
        continue;
      localWindowInsets = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
    }
  }

  public static void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3)
      localWindowInsets = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    while (true)
    {
      paramMarginLayoutParams.leftMargin = localWindowInsets.getSystemWindowInsetLeft();
      paramMarginLayoutParams.topMargin = localWindowInsets.getSystemWindowInsetTop();
      paramMarginLayoutParams.rightMargin = localWindowInsets.getSystemWindowInsetRight();
      paramMarginLayoutParams.bottomMargin = localWindowInsets.getSystemWindowInsetBottom();
      return;
      if (paramInt != 5)
        continue;
      localWindowInsets = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.u
 * JD-Core Version:    0.6.0
 */