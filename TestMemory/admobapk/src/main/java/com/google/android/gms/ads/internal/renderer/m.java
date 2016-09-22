package com.google.android.gms.ads.internal.renderer;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;

@a
@TargetApi(19)
public final class m extends l
{
  private Object e = new Object();
  private PopupWindow f;
  private boolean g = false;

  m(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.webview.b paramb1, k paramk)
  {
    super(paramContext, paramb, paramb1, paramk);
  }

  private final void f()
  {
    synchronized (this.e)
    {
      this.g = true;
      if (((this.a instanceof Activity)) && (((Activity)this.a).isDestroyed()))
        this.f = null;
      if (this.f != null)
      {
        if (this.f.isShowing())
          this.f.dismiss();
        this.f = null;
      }
      return;
    }
  }

  protected final void a(int paramInt)
  {
    f();
    super.a(paramInt);
  }

  public final void c()
  {
    f();
    super.c();
  }

  protected final void e()
  {
    if ((this.a instanceof Activity));
    for (Window localWindow = ((Activity)this.a).getWindow(); ; localWindow = null)
    {
      if ((localWindow == null) || (localWindow.getDecorView() == null));
      do
        return;
      while (((Activity)this.a).isDestroyed());
      FrameLayout localFrameLayout = new FrameLayout(this.a);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localFrameLayout.addView(this.b.b(), -1, -1);
      synchronized (this.e)
      {
        if (this.g)
          return;
      }
      this.f = new PopupWindow(localFrameLayout, 1, 1, false);
      this.f.setOutsideTouchable(true);
      this.f.setClippingEnabled(false);
      c.b("Displaying the 1x1 popup off the screen.");
      try
      {
        this.f.showAtLocation(localWindow.getDecorView(), 0, -1, -1);
        monitorexit;
        return;
      }
      catch (Exception localException)
      {
        while (true)
          this.f = null;
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.m
 * JD-Core Version:    0.6.0
 */