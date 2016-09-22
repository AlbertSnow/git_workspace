package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@a
@TargetApi(14)
public final class t extends am
  implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map b;
  al a;
  private final bm c;
  private final boolean d;
  private int e = 0;
  private int f = 0;
  private MediaPlayer g;
  private Uri h;
  private int i;
  private int j;
  private int k;
  private int l;
  private float m = 1.0F;
  private boolean n;
  private boolean o;
  private bl p;
  private boolean q;
  private int r;

  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
    b.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
    b.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
    b.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
    b.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    b.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    b.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    b.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    b.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    b.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    b.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    b.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    b.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    b.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    b.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
    b.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
  }

  public t(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, bm parambm)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.c = parambm;
    this.q = paramBoolean1;
    this.d = paramBoolean2;
    this.c.a(this);
  }

  private final void a()
  {
    c.a("AdMediaPlayerView init MediaPlayer");
    SurfaceTexture localSurfaceTexture1 = getSurfaceTexture();
    if ((this.h == null) || (localSurfaceTexture1 == null))
      return;
    a(false);
    try
    {
      this.g = new MediaPlayer();
      this.g.setOnBufferingUpdateListener(this);
      this.g.setOnCompletionListener(this);
      this.g.setOnErrorListener(this);
      this.g.setOnInfoListener(this);
      this.g.setOnPreparedListener(this);
      this.g.setOnVideoSizeChangedListener(this);
      if (this.q)
      {
        this.p = new bl(getContext());
        this.p.a(localSurfaceTexture1, getWidth(), getHeight());
        this.p.start();
        localSurfaceTexture2 = this.p.c();
        if (localSurfaceTexture2 != null)
        {
          this.g.setDataSource(getContext(), this.h);
          Surface localSurface = new Surface(localSurfaceTexture2);
          this.g.setSurface(localSurface);
          this.g.setAudioStreamType(3);
          this.g.setScreenOnWhilePlaying(true);
          this.g.prepareAsync();
          b(1);
          return;
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        String str = String.valueOf(this.h);
        c.c(36 + String.valueOf(str).length() + "Failed to initialize MediaPlayer at " + str, localIOException);
        onError(this.g, 1, 0);
        return;
        this.p.b();
        this.p = null;
        SurfaceTexture localSurfaceTexture2 = localSurfaceTexture1;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label224;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      label224: break label224;
    }
  }

  private final void a(boolean paramBoolean)
  {
    c.a("AdMediaPlayerView release");
    if (this.p != null)
    {
      this.p.b();
      this.p = null;
    }
    if (this.g != null)
    {
      this.g.reset();
      this.g.release();
      this.g = null;
      b(0);
      if (paramBoolean)
      {
        this.f = 0;
        this.f = 0;
      }
      c();
    }
  }

  private final void b()
  {
    if (!this.d);
    do
      return;
    while ((!n()) || (this.g.getCurrentPosition() <= 0) || (this.f == 3));
    c.a("AdMediaPlayerView nudging MediaPlayer");
    b(0.0F);
    this.g.start();
    int i1 = this.g.getCurrentPosition();
    long l1 = bc.a().i.a();
    while ((n()) && (this.g.getCurrentPosition() == i1) && (bc.a().i.a() - l1 <= 250L));
    this.g.pause();
    p();
  }

  private final void b(float paramFloat)
  {
    if (this.g != null);
    try
    {
      this.g.setVolume(paramFloat, paramFloat);
      return;
      c.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
  }

  private final void b(int paramInt)
  {
    if (paramInt == 3)
      this.c.c();
    while (true)
    {
      this.e = paramInt;
      return;
      if (this.e != 3)
        continue;
      this.c.a = false;
    }
  }

  private final void c()
  {
    c.a("AdMediaPlayerView abandon audio focus");
    AudioManager localAudioManager = q();
    if ((localAudioManager != null) && (this.o))
    {
      if (localAudioManager.abandonAudioFocus(this) == 1)
        this.o = false;
    }
    else
      return;
    c.e("AdMediaPlayerView abandon audio focus failed");
  }

  private final boolean n()
  {
    return (this.g != null) && (this.e != -1) && (this.e != 0) && (this.e != 1);
  }

  private final void o()
  {
    c.a("AdMediaPlayerView audio focus gained");
    this.o = true;
    p();
  }

  private final void p()
  {
    if ((!this.n) && (this.o))
    {
      b(this.m);
      return;
    }
    b(0.0F);
  }

  private final AudioManager q()
  {
    return (AudioManager)getContext().getSystemService("audio");
  }

  public final void a(float paramFloat)
  {
    this.m = paramFloat;
    p();
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    if (this.p != null)
      this.p.a(paramFloat1, paramFloat2);
  }

  public final void a(int paramInt)
  {
    c.a(34 + "AdMediaPlayerView seek " + paramInt);
    if (n())
    {
      this.g.seekTo(paramInt);
      this.r = 0;
      return;
    }
    this.r = paramInt;
  }

  public final void a(al paramal)
  {
    this.a = paramal;
  }

  public final void a(String paramString)
  {
  }

  public final void b(String paramString)
  {
    this.h = Uri.parse(paramString);
    this.r = 0;
    a();
    requestLayout();
    invalidate();
  }

  public final String d()
  {
    if (this.q);
    for (String str1 = " spherical"; ; str1 = "")
    {
      String str2 = String.valueOf(str1);
      if (str2.length() == 0)
        break;
      return "MediaPlayer".concat(str2);
    }
    return new String("MediaPlayer");
  }

  public final void e()
  {
    c.a("AdMediaPlayerView play");
    if (n())
    {
      this.g.start();
      b(3);
      com.google.android.gms.ads.internal.util.y.a.post(new z(this));
    }
    this.f = 3;
  }

  public final void f()
  {
    c.a("AdMediaPlayerView stop");
    if (this.g != null)
    {
      this.g.stop();
      this.g.release();
      this.g = null;
      b(0);
      this.f = 0;
      c();
    }
    this.c.b();
  }

  public final void g()
  {
    c.a("AdMediaPlayerView pause");
    if ((n()) && (this.g.isPlaying()))
    {
      this.g.pause();
      b(4);
      com.google.android.gms.ads.internal.util.y.a.post(new aa(this));
    }
    this.f = 4;
  }

  public final void h()
  {
    this.n = true;
    p();
  }

  public final void i()
  {
    this.n = false;
    p();
  }

  public final int j()
  {
    if (n())
      return this.g.getCurrentPosition();
    return 0;
  }

  public final int k()
  {
    if (n())
      return this.g.getDuration();
    return -1;
  }

  public final int l()
  {
    if (this.g != null)
      return this.g.getVideoWidth();
    return 0;
  }

  public final int m()
  {
    if (this.g != null)
      return this.g.getVideoHeight();
    return 0;
  }

  public final void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0)
      o();
    do
      return;
    while (paramInt >= 0);
    c.a("AdMediaPlayerView audio focus lost");
    this.o = false;
    p();
  }

  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    c.a("AdMediaPlayerView completion");
    b(5);
    this.f = 5;
    com.google.android.gms.ads.internal.util.y.a.post(new v(this));
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    String str1 = (String)b.get(Integer.valueOf(paramInt1));
    String str2 = (String)b.get(Integer.valueOf(paramInt2));
    c.e(38 + String.valueOf(str1).length() + String.valueOf(str2).length() + "AdMediaPlayerView MediaPlayer error: " + str1 + ":" + str2);
    b(-1);
    this.f = -1;
    com.google.android.gms.ads.internal.util.y.a.post(new w(this, str1, str2));
    return true;
  }

  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    String str1 = (String)b.get(Integer.valueOf(paramInt1));
    String str2 = (String)b.get(Integer.valueOf(paramInt2));
    c.a(37 + String.valueOf(str1).length() + String.valueOf(str2).length() + "AdMediaPlayerView MediaPlayer info: " + str1 + ":" + str2);
    return true;
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getDefaultSize(this.i, paramInt1);
    int i2 = getDefaultSize(this.j, paramInt2);
    int i3;
    int i4;
    int i5;
    if ((this.i > 0) && (this.j > 0) && (this.p == null))
    {
      i3 = View.MeasureSpec.getMode(paramInt1);
      i4 = View.MeasureSpec.getSize(paramInt1);
      i5 = View.MeasureSpec.getMode(paramInt2);
      i2 = View.MeasureSpec.getSize(paramInt2);
      if ((i3 != 1073741824) || (i5 != 1073741824))
        break label226;
      if (i2 * this.i >= i4 * this.j)
        break label189;
      i1 = i2 * this.i / this.j;
    }
    while (true)
    {
      setMeasuredDimension(i1, i2);
      if (this.p != null)
        this.p.a(i1, i2);
      if (Build.VERSION.SDK_INT == 16)
      {
        if (((this.k > 0) && (this.k != i1)) || ((this.l > 0) && (this.l != i2)))
          b();
        this.k = i1;
        this.l = i2;
      }
      return;
      label189: if (i2 * this.i > i4 * this.j)
      {
        i2 = i4 * this.j / this.i;
        i1 = i4;
        continue;
        label226: int i8;
        if (i3 == 1073741824)
        {
          i8 = i4 * this.j / this.i;
          if ((i5 == -2147483648) && (i8 > i2))
          {
            i1 = i4;
            continue;
          }
        }
        else
        {
          if (i5 == 1073741824)
          {
            i1 = i2 * this.i / this.j;
            if ((i3 != -2147483648) || (i1 <= i4))
              continue;
            i1 = i4;
            continue;
          }
          int i6 = this.i;
          int i7 = this.j;
          if ((i5 == -2147483648) && (i7 > i2));
          for (i1 = i2 * this.i / this.j; ; i1 = i6)
          {
            if ((i3 != -2147483648) || (i1 <= i4))
              break label392;
            i2 = i4 * this.j / this.i;
            i1 = i4;
            break;
            i2 = i7;
          }
          continue;
        }
        i2 = i8;
        i1 = i4;
        continue;
      }
      label392: i1 = i4;
    }
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    c.a("AdMediaPlayerView prepared");
    b(2);
    this.c.a();
    com.google.android.gms.ads.internal.util.y.a.post(new u(this));
    this.i = paramMediaPlayer.getVideoWidth();
    this.j = paramMediaPlayer.getVideoHeight();
    if (this.r != 0)
      a(this.r);
    b();
    int i1 = this.i;
    int i2 = this.j;
    c.d(62 + "AdMediaPlayerView stream dimensions: " + i1 + " x " + i2);
    if (this.f == 3)
      e();
    AudioManager localAudioManager = q();
    if ((localAudioManager != null) && (!this.o))
    {
      if (localAudioManager.requestAudioFocus(this, 3, 2) != 1)
        break label166;
      o();
    }
    while (true)
    {
      p();
      return;
      label166: c.e("AdMediaPlayerView audio focus request failed");
    }
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    c.a("AdMediaPlayerView surface created");
    a();
    com.google.android.gms.ads.internal.util.y.a.post(new x(this));
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    c.a("AdMediaPlayerView surface destroyed");
    if ((this.g != null) && (this.r == 0))
      this.r = this.g.getCurrentPosition();
    if (this.p != null)
      this.p.b();
    com.google.android.gms.ads.internal.util.y.a.post(new y(this));
    a(true);
    return true;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    c.a("AdMediaPlayerView surface changed");
    int i2;
    if (this.f == 3)
    {
      i2 = i1;
      if ((this.i != paramInt1) || (this.j != paramInt2))
        break label96;
    }
    while (true)
    {
      if ((this.g != null) && (i2 != 0) && (i1 != 0))
      {
        if (this.r != 0)
          a(this.r);
        e();
      }
      if (this.p != null)
        this.p.a(paramInt1, paramInt2);
      return;
      i2 = 0;
      break;
      label96: i1 = 0;
    }
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.c.b(this);
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    c.a(57 + "AdMediaPlayerView size changed: " + paramInt1 + " x " + paramInt2);
    this.i = paramMediaPlayer.getVideoWidth();
    this.j = paramMediaPlayer.getVideoHeight();
    if ((this.i != 0) && (this.j != 0))
      requestLayout();
  }

  public final String toString()
  {
    String str1 = String.valueOf(getClass().getName());
    String str2 = String.valueOf(Integer.toHexString(hashCode()));
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "@" + str2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.t
 * JD-Core Version:    0.6.0
 */