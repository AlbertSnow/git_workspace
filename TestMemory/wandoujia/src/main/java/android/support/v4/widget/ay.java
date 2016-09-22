package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class ay extends ax
{
  private Method a;
  private Field b;

  ay()
  {
    try
    {
      this.a = View.class.getDeclaredMethod("getDisplayList", null);
      try
      {
        label16: this.b = View.class.getDeclaredField("mRecreateDisplayList");
        this.b.setAccessible(true);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        return;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label16;
    }
  }

  public final void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    if ((this.a != null) && (this.b != null));
    try
    {
      this.b.setBoolean(paramView, true);
      this.a.invoke(paramView, null);
      label33: super.a(paramSlidingPaneLayout, paramView);
      return;
      paramView.invalidate();
      return;
    }
    catch (Exception localException)
    {
      break label33;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ay
 * JD-Core Version:    0.6.0
 */