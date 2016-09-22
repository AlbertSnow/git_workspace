package com.wandoujia.launcher_base.launcher.view;

import android.app.WallpaperManager;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;

final class c extends AsyncTask<Void, Void, Void>
{
  c(WallpaperView paramWallpaperView)
  {
  }

  private Void a()
  {
    try
    {
      Drawable localDrawable = WallpaperManager.getInstance(this.a.getContext()).getDrawable();
      WallpaperView.a(this.a).post(new d(this, localDrawable));
      label34: return null;
    }
    catch (Exception localException)
    {
      break label34;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.view.c
 * JD-Core Version:    0.6.0
 */