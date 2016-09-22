package android.support.v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class v
  implements View.OnApplyWindowInsetsListener
{
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    w localw = (w)paramView;
    if (paramWindowInsets.getSystemWindowInsetTop() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localw.a(paramWindowInsets, bool);
      return paramWindowInsets.consumeSystemWindowInsets();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.v
 * JD-Core Version:    0.6.0
 */