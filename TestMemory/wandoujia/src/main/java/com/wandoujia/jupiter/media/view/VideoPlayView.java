package com.wandoujia.jupiter.media.view;

import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.jupiter.media.controller.PlayerImpControl;
import com.wandoujia.jupiter.media.controller.aa;
import com.wandoujia.jupiter.media.controller.r;
import com.wandoujia.jupiter.media.controller.t;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.n;
import com.wandoujia.ripple_framework.video.ViewFocusManager;
import com.wandoujia.ripple_framework.video.b;
import com.wandoujia.ripple_framework.view.e;

public abstract class VideoPlayView extends FrameLayout
  implements n, b
{
  protected r a;
  private PlayerImpControl b;
  private View c;
  private TextView d;
  private ImageView e;
  private ImageView f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private int k;
  private int l;
  private int m;
  private String n;
  private String o;
  private aa p;
  private ViewFocusManager q;

  public VideoPlayView(Context paramContext)
  {
    super(paramContext);
  }

  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0) || (this.c == null) || (getWidth() == 0) || (getHeight() == 0) || (this.h))
      return;
    this.h = true;
    int i1 = getWidth();
    int i2 = getHeight();
    float f1 = paramInt1 / paramInt2;
    float f2 = i1 / i2;
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.c.getLayoutParams();
    if (f1 > f2)
    {
      localLayoutParams.width = i1;
      localLayoutParams.height = (int)(i1 / f1);
      return;
    }
    if (f2 > f1)
    {
      localLayoutParams.height = i2;
      localLayoutParams.width = (int)(f1 * i2);
      return;
    }
    localLayoutParams.width = i1;
    localLayoutParams.height = i2;
  }

  private void n()
  {
    if ((this.b == null) || (this.a == null))
      return;
    if (this.c != null)
      a(this.b.k(), this.b.l());
    if ((this.b.c(this.o)) && (this.b.e()))
    {
      if (this.b.e())
      {
        this.a.d();
        return;
      }
      this.a.c();
      return;
    }
    this.a.e();
  }

  public final void a()
  {
    this.j = false;
    if (this.b != null)
    {
      this.b.h();
      this.b = null;
    }
    this.h = false;
    this.m = 0;
    this.l = 0;
  }

  public final void a(int paramInt)
  {
    if (this.b != null)
      this.b.a(paramInt);
  }

  public final void a(NetworkInfo paramNetworkInfo)
  {
    if ((!NetworkUtil.isWifiConnected(getContext())) && (j()))
    {
      Toast.makeText(getContext(), 2131625634, 0).show();
      i();
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.a != null)
      this.a.a(paramBoolean);
  }

  public final void b()
  {
    this.l = 4;
    this.m = 3;
  }

  public final void c()
  {
    setCover(this.n);
  }

  public final void d()
  {
    if (this.b != null)
    {
      this.b.j();
      this.b.a(null);
    }
    i();
  }

  public final void e()
  {
    t localt = PlayerImpControl.a(this.o);
    if ((localt != null) && (localt.a))
      h();
  }

  protected final void f()
  {
    this.g = false;
    if ((this.b != null) && (this.b.i() == this))
    {
      d();
      this.b.h();
    }
    if (this.q != null)
      this.q.a(this);
  }

  protected final void g()
  {
    this.g = true;
    if ((this.b != null) && (this.j))
      h();
  }

  public String getUrl()
  {
    return this.o;
  }

  public View getView()
  {
    return this;
  }

  public final void h()
  {
    if (this.o == null)
      Toast.makeText(getContext(), 2131625633, 0).show();
    do
    {
      return;
      if (NetworkUtil.isNetworkConnected(getContext()))
        continue;
      Toast.makeText(getContext(), 2131625631, 0).show();
      return;
    }
    while (this.a == null);
    if (this.b == null)
    {
      this.b = new PlayerImpControl();
      this.b.a(getContext(), this.o);
    }
    if (this.p == null)
      this.p = new c(this);
    n();
    this.a.a(this.b);
    this.b.a(this.p);
    if (!this.b.b(this.o))
      this.b.a(getContext(), this.o);
    if (this.c == null)
    {
      this.c = m();
      this.j = true;
      this.a.c();
    }
    while (true)
    {
      if (this.d != null)
        this.d.setVisibility(8);
      if (this.e == null)
        break;
      this.e.setVisibility(0);
      return;
      if (!this.g)
      {
        this.j = true;
        this.a.c();
        this.c.setVisibility(0);
        continue;
      }
      if (!this.b.n())
      {
        this.j = true;
        this.a.c();
        this.f.setVisibility(4);
        continue;
      }
      if (this.b.i() != this)
        setDisplay(this.b);
      this.f.setVisibility(4);
      this.c.setVisibility(0);
      this.b.a();
      this.a.d();
      if (!NetworkUtil.isMobileNetworkConnected(getContext()))
        continue;
      Toast.makeText(getContext(), 2131625654, 0).show();
    }
  }

  public final void i()
  {
    this.j = false;
    if (this.b != null)
      this.b.b();
    if (this.a != null)
      this.a.e();
    if ((this.d != null) && (this.k > 0))
      this.d.setVisibility(0);
    if (this.e != null)
      this.e.setVisibility(8);
  }

  public final boolean j()
  {
    return (this.b != null) && ((this.b.e()) || (this.j)) && (this.o != null) && (this.b.b(this.o));
  }

  public final void k()
  {
    if (this.a != null)
      this.a.b();
  }

  public final boolean l()
  {
    return this.i;
  }

  protected abstract View m();

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    n();
    this.i = true;
  }

  protected void onDetachedFromWindow()
  {
    this.i = false;
    super.onDetachedFromWindow();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = ((TextView)findViewById(2131494018));
    this.f = ((ImageView)findViewById(2131492889));
    this.e = ((ImageView)findViewById(2131493999));
    this.f.setVisibility(0);
    ReceiverMonitor.a().a(this);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)getLayoutParams();
    int i1 = View.MeasureSpec.getSize(paramInt1);
    if ((this.l > 0) && (this.m > 0))
    {
      localLayoutParams.height = (i1 * this.m / this.l);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setCover(String paramString)
  {
    this.n = paramString;
    new e();
    e.a(this.f, paramString, 2131361863);
    if (this.c != null)
      this.c.setVisibility(4);
  }

  protected abstract void setDisplay(PlayerImpControl paramPlayerImpControl);

  public void setDuration(int paramInt)
  {
    this.k = paramInt;
    if ((paramInt > 0) && (this.d != null))
      this.d.setText(TextUtil.stringForTimeInMinutes(paramInt));
    do
      return;
    while ((paramInt > 0) || (this.d == null));
    this.d.setVisibility(8);
  }

  public void setFocusManager(ViewFocusManager paramViewFocusManager)
  {
    this.q = paramViewFocusManager;
  }

  public void setMediaController(r paramr)
  {
    this.a = paramr;
  }

  public void setUrl(String paramString)
  {
    this.o = paramString;
  }

  public String toString()
  {
    return Integer.toHexString(System.identityHashCode(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.VideoPlayView
 * JD-Core Version:    0.6.0
 */