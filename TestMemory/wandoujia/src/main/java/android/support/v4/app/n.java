package android.support.v4.app;

import android.view.View;
import android.view.Window;

final class n
  implements p
{
  n(FragmentActivity paramFragmentActivity)
  {
  }

  public final View a(int paramInt)
  {
    return this.a.findViewById(paramInt);
  }

  public final boolean a()
  {
    Window localWindow = this.a.getWindow();
    return (localWindow != null) && (localWindow.peekDecorView() != null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.n
 * JD-Core Version:    0.6.0
 */