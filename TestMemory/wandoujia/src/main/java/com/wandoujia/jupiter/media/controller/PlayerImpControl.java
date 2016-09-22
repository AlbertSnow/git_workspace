package com.wandoujia.jupiter.media.controller;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import com.wandoujia.base.utils.FileUtil;
import java.io.File;
import java.io.IOException;

public final class PlayerImpControl
  implements u
{
  private static s a = new s();
  private String b;
  private MediaPlayer c;
  private PlayerImpControl.State d = PlayerImpControl.State.IDLE;
  private PlayerImpControl.State e = PlayerImpControl.State.IDLE;
  private int f;
  private int g;
  private int h;
  private int i;
  private boolean j = true;
  private View k;
  private aa l;
  private MediaPlayer.OnPreparedListener m = new v(this);
  private MediaPlayer.OnVideoSizeChangedListener n = new w(this);
  private MediaPlayer.OnCompletionListener o = new x(this);
  private MediaPlayer.OnErrorListener p = new y(this);
  private MediaPlayer.OnBufferingUpdateListener q = new z(this);

  public static t a(String paramString)
  {
    return a.a(paramString);
  }

  private void o()
  {
    if (this.c != null)
    {
      this.i = 0;
      this.c.reset();
      this.f = 0;
      this.g = 0;
      this.d = PlayerImpControl.State.IDLE;
      this.e = PlayerImpControl.State.IDLE;
      this.h = 0;
    }
  }

  private void p()
  {
    if (this.c == null)
    {
      this.c = new MediaPlayer();
      this.c.setAudioStreamType(3);
      this.c.setOnPreparedListener(this.m);
      this.c.setOnVideoSizeChangedListener(this.n);
      this.c.setOnCompletionListener(this.o);
      this.c.setOnErrorListener(this.p);
      this.c.setOnBufferingUpdateListener(this.q);
      this.c.setLooping(false);
      this.c.setScreenOnWhilePlaying(true);
      a(this.j);
    }
  }

  public final void a()
  {
    if (n())
    {
      this.c.start();
      this.d = PlayerImpControl.State.PLAYING;
    }
    this.e = PlayerImpControl.State.PLAYING;
  }

  public final void a(int paramInt)
  {
    if (n())
    {
      this.c.seekTo(paramInt);
      this.h = 0;
      return;
    }
    this.h = paramInt;
  }

  public final void a(Context paramContext, String paramString)
  {
    if (!b(paramString))
    {
      this.b = paramString;
      o();
      p();
      try
      {
        File localFile = new File(FileUtil.getVideoFilePath(this.b));
        if (localFile.exists())
          this.c.setDataSource(paramContext, Uri.parse(localFile.getAbsolutePath()));
        while (true)
        {
          this.c.prepareAsync();
          this.d = PlayerImpControl.State.PREPARING;
          return;
          this.c.setDataSource(this.b);
        }
      }
      catch (IOException localIOException)
      {
        this.d = PlayerImpControl.State.ERROR;
        this.e = PlayerImpControl.State.ERROR;
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        this.d = PlayerImpControl.State.ERROR;
        this.e = PlayerImpControl.State.ERROR;
      }
    }
  }

  @TargetApi(14)
  public final void a(Surface paramSurface, View paramView)
  {
    p();
    this.c.setSurface(paramSurface);
    this.k = paramView;
  }

  public final void a(SurfaceHolder paramSurfaceHolder, View paramView)
  {
    p();
    this.c.setDisplay(paramSurfaceHolder);
    this.k = paramView;
  }

  public final void a(aa paramaa)
  {
    this.l = paramaa;
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      if (this.c != null)
        this.c.setVolume(0.0F, 0.0F);
    while (true)
    {
      this.j = paramBoolean;
      return;
      if (this.c == null)
        continue;
      this.c.setVolume(1.0F, 1.0F);
    }
  }

  public final void b()
  {
    if ((n()) && (this.c.isPlaying()))
    {
      this.c.pause();
      this.d = PlayerImpControl.State.PAUSED;
    }
    this.e = PlayerImpControl.State.PAUSED;
  }

  public final boolean b(String paramString)
  {
    if ((this.c != null) && (this.d != PlayerImpControl.State.ERROR) && (this.d != PlayerImpControl.State.IDLE));
    for (int i1 = 1; (i1 != 0) && (paramString != null) && (paramString.equals(this.b)); i1 = 0)
      return true;
    return false;
  }

  public final int c()
  {
    if (n())
      return this.c.getDuration();
    return -1;
  }

  public final boolean c(String paramString)
  {
    return (n()) && (paramString != null) && (paramString.equals(this.b));
  }

  public final int d()
  {
    if (n())
      return this.c.getCurrentPosition();
    return 0;
  }

  public final boolean e()
  {
    return (n()) && (this.c.isPlaying());
  }

  public final int f()
  {
    if (this.c != null)
      return this.i;
    return 0;
  }

  public final boolean g()
  {
    return this.j;
  }

  public final void h()
  {
    if (this.c != null)
      this.c.setDisplay(null);
    this.k = null;
  }

  public final View i()
  {
    return this.k;
  }

  public final void j()
  {
    if (n())
    {
      s locals2 = a;
      String str2 = this.b;
      boolean bool2 = this.c.isPlaying();
      d();
      locals2.a(str2, new t(bool2));
      return;
    }
    s locals1 = a;
    String str1 = this.b;
    if (PlayerImpControl.State.PLAYING == this.e);
    for (boolean bool1 = true; ; bool1 = false)
    {
      locals1.a(str1, new t(bool1));
      return;
    }
  }

  public final int k()
  {
    return this.f;
  }

  public final int l()
  {
    return this.g;
  }

  public final void m()
  {
    h();
    if (this.c != null)
    {
      o();
      this.c.release();
      this.c = null;
      this.d = PlayerImpControl.State.IDLE;
      this.e = PlayerImpControl.State.IDLE;
    }
  }

  public final boolean n()
  {
    return (this.c != null) && (this.d != PlayerImpControl.State.ERROR) && (this.d != PlayerImpControl.State.IDLE) && (this.d != PlayerImpControl.State.PREPARING);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.PlayerImpControl
 * JD-Core Version:    0.6.0
 */