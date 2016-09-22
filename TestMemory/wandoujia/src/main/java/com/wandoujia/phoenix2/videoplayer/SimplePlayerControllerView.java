package com.wandoujia.phoenix2.videoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.wandoujia.base.utils.TextUtil;
import java.util.concurrent.atomic.AtomicBoolean;

public class SimplePlayerControllerView extends RelativeLayout
  implements x
{
  private boolean a;
  private RelativeLayout b;
  private RelativeLayout c;
  private ImageView d;
  private TextView e;
  private ImageView f;
  private TextView g;
  private TextView h;
  private SeekBar i;
  private boolean j = true;
  private boolean k = false;
  private Animation l;
  private Animation m;
  private Animation n;
  private Animation o;
  private Animation p;
  private Animation q;
  private final AtomicBoolean r = new AtomicBoolean(false);
  private final Animation.AnimationListener s = new r(this);

  public SimplePlayerControllerView(Context paramContext)
  {
    super(paramContext);
    g();
  }

  public SimplePlayerControllerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    g();
  }

  public SimplePlayerControllerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    g();
  }

  private void g()
  {
    View.inflate(getContext(), getLayoutResourceId(), this);
    a();
    this.m = AnimationUtils.loadAnimation(getContext(), 2130968615);
    this.l = AnimationUtils.loadAnimation(getContext(), 2130968614);
    this.n = AnimationUtils.loadAnimation(getContext(), 2130968613);
    this.o = AnimationUtils.loadAnimation(getContext(), 2130968612);
    this.o.setAnimationListener(this.s);
    this.q = AnimationUtils.loadAnimation(getContext(), 2130968593);
    this.p = AnimationUtils.loadAnimation(getContext(), 2130968592);
  }

  protected void a()
  {
    this.b = ((RelativeLayout)findViewById(2131493416));
    this.c = ((RelativeLayout)findViewById(2131493419));
    this.d = ((ImageView)findViewById(2131493417));
    this.e = ((TextView)findViewById(2131492998));
    this.f = ((ImageView)findViewById(2131493418));
    this.g = ((TextView)findViewById(2131493420));
    this.h = ((TextView)findViewById(2131493421));
    this.i = ((SeekBar)findViewById(2131493422));
    this.b.setOnTouchListener(new t());
    this.c.setOnTouchListener(new u());
    this.i.setMax(100);
  }

  public final boolean b()
  {
    return this.j;
  }

  public final void c()
  {
    if ((this.r.get()) || (this.j))
      return;
    this.b.startAnimation(this.l);
    this.c.startAnimation(this.n);
    if (this.k)
      this.f.startAnimation(this.p);
    this.j = true;
    setVisibility(0);
  }

  public final void d()
  {
    if (this.j)
    {
      this.b.startAnimation(this.m);
      this.r.set(true);
      this.c.startAnimation(this.o);
      if (this.k)
        this.f.startAnimation(this.q);
      this.j = false;
    }
  }

  public final void e()
  {
    this.f.setBackgroundResource(2130838640);
  }

  public final void f()
  {
    this.f.setBackgroundResource(2130838643);
  }

  protected int getLayoutResourceId()
  {
    return 2130903576;
  }

  public View getView()
  {
    return this;
  }

  public void setBufferPercent(int paramInt)
  {
    this.i.setSecondaryProgress(paramInt);
  }

  public void setCanDragSeekBar(boolean paramBoolean)
  {
    this.i.setEnabled(paramBoolean);
  }

  public void setCanPlay(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.f.setVisibility(0);
      this.k = true;
      return;
    }
    this.f.setVisibility(4);
    this.k = false;
  }

  public void setCurrentPlayPercent(int paramInt)
  {
    this.i.setProgress(paramInt);
  }

  public void setCurrentTime(int paramInt)
  {
    if (this.a)
    {
      this.g.setText(TextUtil.stringForTime(paramInt));
      return;
    }
    this.g.setText(TextUtil.stringForTimeInMinutes(paramInt));
  }

  public void setMediaPlayerController(q paramq)
  {
    this.f.setOnClickListener(new w(paramq));
  }

  public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener)
  {
    this.i.setOnSeekBarChangeListener(paramOnSeekBarChangeListener);
  }

  public void setPlayerExitListener(m paramm)
  {
    this.d.setOnClickListener(new v(paramm));
  }

  public void setTitle(String paramString)
  {
    this.e.setText(paramString);
  }

  public void setTotalTime(int paramInt)
  {
    int i1 = paramInt / 3600000;
    if (i1 == 0)
    {
      this.a = false;
      this.h.setText(TextUtil.stringForTimeInMinutes(paramInt));
      return;
    }
    if ((i1 < 10) && (i1 > 0))
    {
      this.a = true;
      this.h.setText(TextUtil.stringForTime(paramInt));
      return;
    }
    this.a = true;
    this.h.setText(TextUtil.stringForTime(0L));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.SimplePlayerControllerView
 * JD-Core Version:    0.6.0
 */