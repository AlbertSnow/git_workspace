package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@TargetApi(19)
@zzhb
public class zzgt extends zzgs
{
  private Object zzGv = new Object();
  private PopupWindow zzGw;
  private boolean zzGx = false;

  zzgt(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }

  protected void zzgi()
  {
    Window localWindow = null;
    if ((this.mContext instanceof Activity))
      localWindow = ((Activity)this.mContext).getWindow();
    if ((localWindow == null) || (localWindow.getDecorView() == null))
      return;
    if (((Activity)this.mContext).isDestroyed())
      return;
    FrameLayout localFrameLayout = new FrameLayout(this.mContext);
    localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localFrameLayout.addView(this.zzpD.getView(), -1, -1);
    synchronized (this.zzGv)
    {
      if (this.zzGx)
        return;
      this.zzGw = new PopupWindow(localFrameLayout, 1, 1, false);
      this.zzGw.setOutsideTouchable(true);
      this.zzGw.setClippingEnabled(false);
      zzin.zzaI("Displaying the 1x1 popup off the screen.");
      try
      {
        this.zzGw.showAtLocation(localWindow.getDecorView(), 0, -1, -1);
      }
      catch (Exception localException)
      {
        this.zzGw = null;
      }
    }
  }

  public void cancel()
  {
    zzgj();
    super.cancel();
  }

  protected void zzC(int paramInt)
  {
    zzgj();
    super.zzC(paramInt);
  }

  private void zzgj()
  {
    synchronized (this.zzGv)
    {
      this.zzGx = true;
      if (((this.mContext instanceof Activity)) && (((Activity)this.mContext).isDestroyed()))
        this.zzGw = null;
      if (this.zzGw != null)
      {
        if (this.zzGw.isShowing())
          this.zzGw.dismiss();
        this.zzGw = null;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgt
 * JD-Core Version:    0.6.0
 */