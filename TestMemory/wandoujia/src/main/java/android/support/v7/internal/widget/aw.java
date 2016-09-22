package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.drawable;
import android.support.v7.appcompat.R.string;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import com.tencent.mm.sdk.channel.a;

public final class aw
  implements aa
{
  private Toolbar a;
  private int b;
  private View c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private boolean g;
  private CharSequence h;
  private CharSequence i;
  private CharSequence j;
  private Window.Callback k;
  private boolean l;
  private ActionMenuPresenter m;
  private final au n;
  private int o = 0;
  private Drawable p;

  public aw(Toolbar paramToolbar)
  {
    this(paramToolbar, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_mtrl_am_alpha);
  }

  private aw(Toolbar paramToolbar, int paramInt1, int paramInt2)
  {
    this.a = paramToolbar;
    this.h = paramToolbar.getTitle();
    this.i = paramToolbar.getSubtitle();
    boolean bool;
    int i8;
    if (this.h != null)
    {
      bool = true;
      this.g = bool;
      this.f = paramToolbar.getNavigationIcon();
      a locala = a.a(paramToolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle);
      CharSequence localCharSequence1 = locala.c(R.styleable.ActionBar_title);
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        this.g = true;
        b(localCharSequence1);
      }
      CharSequence localCharSequence2 = locala.c(R.styleable.ActionBar_subtitle);
      if (!TextUtils.isEmpty(localCharSequence2))
      {
        this.i = localCharSequence2;
        if ((0x8 & this.b) != 0)
          this.a.setSubtitle(localCharSequence2);
      }
      Drawable localDrawable1 = locala.a(R.styleable.ActionBar_logo);
      if (localDrawable1 != null)
        b(localDrawable1);
      Drawable localDrawable2 = locala.a(R.styleable.ActionBar_icon);
      if ((this.f == null) && (localDrawable2 != null))
        a(localDrawable2);
      Drawable localDrawable3 = locala.a(R.styleable.ActionBar_homeAsUpIndicator);
      if (localDrawable3 != null)
      {
        this.f = localDrawable3;
        q();
      }
      c(locala.a(R.styleable.ActionBar_displayOptions, 0));
      int i1 = locala.f(R.styleable.ActionBar_customNavigationLayout, 0);
      if (i1 != 0)
      {
        View localView = LayoutInflater.from(this.a.getContext()).inflate(i1, this.a, false);
        if ((this.c != null) && ((0x10 & this.b) != 0))
          this.a.removeView(this.c);
        this.c = localView;
        if ((localView != null) && ((0x10 & this.b) != 0))
          this.a.addView(this.c);
        c(0x10 | this.b);
      }
      int i2 = locala.e(R.styleable.ActionBar_height, 0);
      if (i2 > 0)
      {
        ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
        localLayoutParams.height = i2;
        this.a.setLayoutParams(localLayoutParams);
      }
      int i3 = locala.c(R.styleable.ActionBar_contentInsetStart, -1);
      int i4 = locala.c(R.styleable.ActionBar_contentInsetEnd, -1);
      if ((i3 >= 0) || (i4 >= 0))
        this.a.setContentInsetsRelative(Math.max(i3, 0), Math.max(i4, 0));
      int i5 = locala.f(R.styleable.ActionBar_titleTextStyle, 0);
      if (i5 != 0)
        this.a.setTitleTextAppearance(this.a.getContext(), i5);
      int i6 = locala.f(R.styleable.ActionBar_subtitleTextStyle, 0);
      if (i6 != 0)
        this.a.setSubtitleTextAppearance(this.a.getContext(), i6);
      int i7 = locala.f(R.styleable.ActionBar_popupTheme, 0);
      if (i7 != 0)
        this.a.setPopupTheme(i7);
      locala.b();
      this.n = locala.c();
      if (paramInt1 != this.o)
      {
        this.o = paramInt1;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription()))
        {
          i8 = this.o;
          if (i8 != 0)
            break label645;
        }
      }
    }
    label645: for (String str = null; ; str = this.a.getContext().getString(i8))
    {
      this.j = str;
      p();
      this.j = this.a.getNavigationContentDescription();
      Drawable localDrawable4 = this.n.a(paramInt2);
      if (this.p != localDrawable4)
      {
        this.p = localDrawable4;
        q();
      }
      this.a.setNavigationOnClickListener(new ax(this));
      return;
      bool = false;
      break;
    }
  }

  private void b(Drawable paramDrawable)
  {
    this.e = paramDrawable;
    o();
  }

  private void b(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    if ((0x8 & this.b) != 0)
      this.a.setTitle(paramCharSequence);
  }

  private void o()
  {
    int i1 = 0x2 & this.b;
    Drawable localDrawable = null;
    if (i1 != 0)
    {
      if ((0x1 & this.b) == 0)
        break label51;
      if (this.e == null)
        break label43;
      localDrawable = this.e;
    }
    while (true)
    {
      this.a.setLogo(localDrawable);
      return;
      label43: localDrawable = this.d;
      continue;
      label51: localDrawable = this.d;
    }
  }

  private void p()
  {
    if ((0x4 & this.b) != 0)
    {
      if (TextUtils.isEmpty(this.j))
        this.a.setNavigationContentDescription(this.o);
    }
    else
      return;
    this.a.setNavigationContentDescription(this.j);
  }

  private void q()
  {
    Toolbar localToolbar;
    if ((0x4 & this.b) != 0)
    {
      localToolbar = this.a;
      if (this.f == null)
        break label32;
    }
    label32: for (Drawable localDrawable = this.f; ; localDrawable = this.p)
    {
      localToolbar.setNavigationIcon(localDrawable);
      return;
    }
  }

  public final ViewGroup a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = this.n.a(paramInt); ; localDrawable = null)
    {
      a(localDrawable);
      return;
    }
  }

  public final void a(Drawable paramDrawable)
  {
    this.d = paramDrawable;
    o();
  }

  public final void a(Menu paramMenu, y paramy)
  {
    if (this.m == null)
      this.m = new ActionMenuPresenter(this.a.getContext());
    this.m.a(paramy);
    this.a.setMenu((i)paramMenu, this.m);
  }

  public final void a(Window.Callback paramCallback)
  {
    this.k = paramCallback;
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (!this.g)
      b(paramCharSequence);
  }

  public final Context b()
  {
    return this.a.getContext();
  }

  public final void b(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = this.n.a(paramInt); ; localDrawable = null)
    {
      b(localDrawable);
      return;
    }
  }

  public final void c(int paramInt)
  {
    int i1 = paramInt ^ this.b;
    this.b = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0)
          break label115;
        q();
        p();
      }
      if ((i1 & 0x3) != 0)
        o();
      if ((i1 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label126;
        this.a.setTitle(this.h);
        this.a.setSubtitle(this.i);
      }
    }
    while (true)
    {
      if (((i1 & 0x10) != 0) && (this.c != null))
      {
        if ((paramInt & 0x10) == 0)
          break label145;
        this.a.addView(this.c);
      }
      return;
      label115: this.a.setNavigationIcon(null);
      break;
      label126: this.a.setTitle(null);
      this.a.setSubtitle(null);
    }
    label145: this.a.removeView(this.c);
  }

  public final boolean c()
  {
    return this.a.hasExpandedActionView();
  }

  public final void d()
  {
    this.a.collapseActionView();
  }

  public final void d(int paramInt)
  {
    if (paramInt == 8)
      bg.q(this.a).a(0.0F).a(new ay(this));
    do
      return;
    while (paramInt != 0);
    bg.q(this.a).a(1.0F).a(new az(this));
  }

  public final CharSequence e()
  {
    return this.a.getTitle();
  }

  public final boolean f()
  {
    return this.a.canShowOverflowMenu();
  }

  public final boolean g()
  {
    return this.a.isOverflowMenuShowing();
  }

  public final boolean h()
  {
    return this.a.isOverflowMenuShowPending();
  }

  public final boolean i()
  {
    return this.a.showOverflowMenu();
  }

  public final boolean j()
  {
    return this.a.hideOverflowMenu();
  }

  public final void k()
  {
    this.l = true;
  }

  public final void l()
  {
    this.a.dismissPopupMenus();
  }

  public final int m()
  {
    return this.b;
  }

  public final void n()
  {
    this.a.setCollapsible(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.aw
 * JD-Core Version:    0.6.0
 */