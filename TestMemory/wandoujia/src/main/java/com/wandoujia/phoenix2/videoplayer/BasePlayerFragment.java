package com.wandoujia.phoenix2.videoplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public abstract class BasePlayerFragment extends BaseFragment
  implements SurfaceHolder.Callback, q
{
  protected l a;
  private BasePlayerFragment.SourceType b;
  private List<String> c = new ArrayList();
  private List<String> d = new ArrayList();
  private int e = 0;
  private MediaPlayer f;
  private x g;
  private p h;
  private Timer i;
  private RelativeLayout j;
  private FrameLayout k;
  private FrameLayout l;
  private SurfaceView m;
  private SurfaceHolder n;
  private Animation o;
  private boolean p = true;
  private boolean q = false;
  private boolean r = true;
  private boolean s = false;
  private boolean t;
  private boolean u;
  private boolean v = false;
  private int w = 0;
  private long x = 0L;
  private long y = 0L;
  private int z = 0;

  private void A()
  {
    this.y = System.currentTimeMillis();
    try
    {
      this.f.prepareAsync();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      b(localIllegalStateException.getMessage());
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.g.setCurrentTime(paramInt1);
    this.g.setTotalTime(paramInt2);
  }

  private void c(String paramString)
  {
    try
    {
      this.f.reset();
      this.f.setDataSource(getActivity(), Uri.parse(paramString));
      this.v = false;
      A();
      this.b = BasePlayerFragment.SourceType.URL;
      Log.d("BasePlayerFragment", " load url " + paramString + " , now playingIndex is " + this.e, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
      b(localException.getMessage());
    }
  }

  private void d(int paramInt)
  {
    if (this.t)
      return;
    x localx = this.g;
    int i1 = i();
    int i2 = j();
    if (i2 != 0);
    for (int i3 = i1 * 100 / i2; ; i3 = 0)
    {
      localx.setCurrentPlayPercent(i3);
      if (paramInt == this.w)
        break;
      a(paramInt, j());
      this.w = paramInt;
      return;
    }
  }

  public static void q()
  {
  }

  private void w()
  {
    this.f = new MediaPlayer();
    this.f.setAudioStreamType(3);
    this.f.setOnPreparedListener(new g(this));
    this.f.setOnSeekCompleteListener(new h(this));
    this.f.setOnBufferingUpdateListener(new i(this));
    this.f.setOnCompletionListener(new j(this));
    this.f.setOnErrorListener(new k(this));
  }

  private void x()
  {
    if (!this.g.b())
      this.g.c();
    if (this.s)
      getActivity().getWindow().getDecorView().setSystemUiVisibility(0);
    this.a.removeMessages(0);
    this.a.removeMessages(1);
  }

  private void y()
  {
    Message localMessage = this.a.obtainMessage(1);
    this.a.removeMessages(1);
    this.a.sendMessageDelayed(localMessage, 5000L);
  }

  private void z()
  {
    FragmentActivity localFragmentActivity = getActivity();
    if ((localFragmentActivity != null) && (!localFragmentActivity.isFinishing()))
      r();
  }

  protected abstract p a(q paramq);

  protected final void a()
  {
    if (!this.q)
    {
      this.g.setCanPlay(false);
      this.j.setVisibility(0);
      this.q = true;
    }
  }

  public final void a(int paramInt)
  {
    Log.d("BasePlayerFragment", " seekTo " + paramInt, new Object[0]);
    if ((this.f == null) || (paramInt < 0))
      return;
    try
    {
      this.f.seekTo(paramInt);
      this.x = System.currentTimeMillis();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
  }

  public void a(long paramLong, int paramInt)
  {
    d(0);
    this.w = 0;
    if ((this.f == null) || (getActivity() == null));
    int i1;
    int i2;
    int i3;
    int i4;
    do
    {
      this.g.setCanPlay(true);
      this.g.setCanDragSeekBar(true);
      y();
      if (this.r)
        this.i.schedule(new n(this, 0), 0L, 250L);
      b();
      this.a.sendEmptyMessage(2);
      this.r = false;
      this.z = 0;
      return;
      i1 = this.f.getVideoHeight();
      i2 = this.f.getVideoWidth();
      i3 = SystemUtil.getScreenHeight(getActivity().getWindowManager());
      i4 = SystemUtil.getScreenWidth(getActivity().getWindowManager());
    }
    while ((i2 == 0) || (i1 == 0) || (i3 == 0) || (i4 == 0));
    int i5 = (int)(i4 * (i1 / i2));
    int i6 = (int)(i3 * (i2 / i1));
    ViewGroup.LayoutParams localLayoutParams = this.m.getLayoutParams();
    if (i1 / i2 > i3 / i4)
    {
      localLayoutParams.width = i6;
      localLayoutParams.height = i3;
    }
    while (true)
    {
      this.m.setLayoutParams(localLayoutParams);
      break;
      localLayoutParams.height = i5;
      localLayoutParams.width = i4;
    }
  }

  public final void a(String paramString)
  {
    if ((!isAdded()) || (TextUtils.isEmpty(paramString)))
      return;
    this.c.add(paramString);
    c(paramString);
  }

  protected final void b()
  {
    if (this.q)
    {
      this.j.setVisibility(4);
      this.g.setCanPlay(true);
      this.q = false;
    }
  }

  public void b(int paramInt)
  {
    this.g.f();
    x();
  }

  public void b(String paramString)
  {
    Log.d("BasePlayerFragment", "onError called " + paramString, new Object[0]);
  }

  protected final void c()
  {
    x();
    if (m())
      y();
  }

  public final void c(int paramInt)
  {
    this.g.setBufferPercent(paramInt);
  }

  protected final void d()
  {
    if ((this.g == null) || (!isAdded()))
      return;
    e();
    if (this.g.b())
      this.g.d();
    this.a.removeMessages(1);
    Message localMessage = this.a.obtainMessage(0);
    this.a.removeMessages(0);
    this.a.sendMessageDelayed(localMessage, 1000L);
  }

  protected final void e()
  {
    if ((this.s) && (getActivity() != null))
      getActivity().getWindow().getDecorView().setSystemUiVisibility(1030);
  }

  public final void f()
  {
    if (getActivity() == null)
      return;
    z();
  }

  protected final void g()
  {
    if (isAdded())
    {
      com.wandoujia.jupiter.view.p.a(getActivity(), 2131625272, com.wandoujia.jupiter.view.p.b).a();
      z();
    }
    this.p = false;
  }

  public final int h()
  {
    if (this.b != null);
    int i1;
    switch (c.a[this.b.ordinal()])
    {
    default:
      i1 = 0;
    case 1:
    case 2:
    }
    while (true)
    {
      int i2 = i1 - 1 - this.e;
      Log.d("BasePlayerFragment", " restSnippetNum = " + i2, new Object[0]);
      int i3 = 0;
      if (i2 >= 0)
        i3 = i2;
      return i3;
      Log.d("BasePlayerFragment", " totalSnippetNum = " + this.c.size(), new Object[0]);
      i1 = this.c.size();
      continue;
      i1 = this.d.size();
    }
  }

  public final int i()
  {
    if ((this.f == null) || (!this.v))
      return 0;
    try
    {
      int i1 = this.f.getCurrentPosition();
      return i1;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
    return 0;
  }

  public final int j()
  {
    if ((this.f == null) || (!this.v))
      return 0;
    try
    {
      int i1 = this.f.getDuration();
      return i1;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
    return 0;
  }

  public final void k()
  {
    if ((this.f != null) && (!m()) && (this.v));
    try
    {
      Log.d("BasePlayerFragment", "start", new Object[0]);
      this.f.start();
      o();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
  }

  public final void l()
  {
    if ((this.f != null) && (m()) && (this.v));
    try
    {
      Log.d("BasePlayerFragment", "pause", new Object[0]);
      this.f.pause();
      b(i());
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
  }

  public final boolean m()
  {
    MediaPlayer localMediaPlayer = this.f;
    int i1 = 0;
    if (localMediaPlayer != null);
    try
    {
      Log.d("BasePlayerFragment", "isPlaying", new Object[0]);
      boolean bool = this.f.isPlaying();
      i1 = bool;
      return i1;
    }
    catch (IllegalStateException localIllegalStateException)
    {
    }
    return false;
  }

  public void n()
  {
    View localView = getView();
    localView.findViewById(2131494013);
    this.j = ((RelativeLayout)localView.findViewById(2131494014));
    this.k = ((FrameLayout)localView.findViewById(2131494015));
    this.j.setVisibility(8);
    this.k.setVisibility(8);
    this.m = ((SurfaceView)localView.findViewById(2131494011));
    this.l = ((FrameLayout)localView.findViewById(2131494012));
    localView.setOnClickListener(new a(this));
    if (this.g.getView().getParent() != null)
      this.l.removeView(this.g.getView());
    this.l.addView(this.g.getView(), new FrameLayout.LayoutParams(-1, -1));
    if (this.s)
      getActivity().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new d(this));
    SurfaceHolder localSurfaceHolder = this.m.getHolder();
    localSurfaceHolder.setType(3);
    localSurfaceHolder.addCallback(this);
    this.u = true;
    this.o = AnimationUtils.loadAnimation(getActivity(), 2130968593);
    this.o.setAnimationListener(new e(this));
    this.o.setFillAfter(true);
    w();
    this.g.setCanPlay(false);
    this.g.setCanDragSeekBar(false);
    this.g.setCurrentPlayPercent(0);
    this.g.setBufferPercent(0);
    this.g.setPlayerExitListener(new m(this));
    this.g.setOnSeekBarChangeListener(new b(this));
    a();
  }

  public void o()
  {
    this.g.e();
    y();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (NetworkUtil.isMobileNetworkConnected(getActivity()))
      com.wandoujia.jupiter.view.p.a(getActivity(), getActivity().getString(2131625192), com.wandoujia.jupiter.view.p.b).a();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.s = SystemUtil.hasSoftKeys(getActivity());
    this.i = new Timer(true);
    this.a = new l(this);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return android.support.v4.app.b.b(getActivity(), 2130903590);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.i.cancel();
    this.u = false;
    this.f.release();
    this.f = null;
  }

  public void onPause()
  {
    super.onPause();
    l();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h = a(this);
    this.g = this.h.b();
    if (this.g == null)
      throw new RuntimeException("VideoPlayerControllerView can't be null");
    n();
    this.h.a();
  }

  public final void p()
  {
    if (m())
    {
      y();
      return;
    }
    x();
  }

  public void r()
  {
    getActivity().finish();
  }

  public final void s()
  {
    this.e = (1 + this.e);
    this.f.setDisplay(null);
    this.f.reset();
    this.f.release();
    this.f = null;
    w();
    this.f.setDisplay(this.n);
    switch (c.a[this.b.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      a();
      return;
      c((String)this.c.get(this.e));
      continue;
      String str1 = (String)this.d.get(this.e);
      if (!new File(str1).exists())
        continue;
      try
      {
        this.f.reset();
        this.f.setDataSource(str1);
        this.v = false;
        A();
        this.b = BasePlayerFragment.SourceType.LOCAL_FILE;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        str2 = localIllegalArgumentException.getMessage();
        b(str2);
      }
      catch (SecurityException localSecurityException)
      {
        while (true)
          str2 = localSecurityException.getMessage();
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
          str2 = localIllegalStateException.getMessage();
      }
      catch (IOException localIOException)
      {
        while (true)
          String str2 = localIOException.getMessage();
      }
    }
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    int i1 = 1;
    this.n = paramSurfaceHolder;
    Surface localSurface = paramSurfaceHolder.getSurface();
    if ((localSurface == null) || (!localSurface.isValid()));
    label78: label81: 
    while (true)
    {
      return;
      int i2;
      if (!SystemUtil.aboveApiLevel(14))
      {
        i2 = i1;
        if (localSurface.isValid())
          break label78;
      }
      while (true)
      {
        if (((i1 != 0) && (i2 == 0)) || (!this.u))
          break label81;
        this.f.setDisplay(this.n);
        return;
        i2 = 0;
        break;
        i1 = 0;
      }
    }
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
  }

  public final void t()
  {
    z();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.BasePlayerFragment
 * JD-Core Version:    0.6.0
 */