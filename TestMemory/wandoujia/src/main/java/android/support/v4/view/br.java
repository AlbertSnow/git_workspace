package android.support.v4.view;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class br
  implements View.OnApplyWindowInsetsListener
{
  br(as paramas)
  {
  }

  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    dl localdl = new dl(paramWindowInsets);
    return ((dl)this.a.a(paramView, localdl)).e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.br
 * JD-Core Version:    0.6.0
 */