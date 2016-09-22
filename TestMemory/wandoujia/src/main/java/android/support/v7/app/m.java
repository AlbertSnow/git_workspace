package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.b.a;
import android.support.v7.internal.view.e;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class m extends l
{
  final Context a;
  final Window b;
  final Window.Callback c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  private ActionBar i;
  private MenuInflater j;
  private CharSequence k;
  private boolean l;

  m(Context paramContext, Window paramWindow)
  {
    this.a = paramContext;
    this.b = paramWindow;
    this.c = this.b.getCallback();
    if ((this.c instanceof n))
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    this.b.setCallback(a(this.c));
  }

  public final ActionBar a()
  {
    if (this.d)
      if (this.i == null)
        this.i = k();
    while (true)
    {
      return this.i;
      if (!(this.i instanceof android.support.v7.internal.a.b))
        continue;
      this.i = null;
    }
  }

  abstract a a(android.support.v7.b.b paramb);

  Window.Callback a(Window.Callback paramCallback)
  {
    return new n(this, paramCallback);
  }

  public void a(Bundle paramBundle)
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(R.styleable.Theme);
    if (!localTypedArray.hasValue(R.styleable.Theme_windowActionBar))
    {
      localTypedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    if (localTypedArray.getBoolean(R.styleable.Theme_windowActionBar, false))
      this.d = true;
    if (localTypedArray.getBoolean(R.styleable.Theme_windowActionBarOverlay, false))
      this.e = true;
    if (localTypedArray.getBoolean(R.styleable.Theme_windowActionModeOverlay, false))
      this.f = true;
    this.g = localTypedArray.getBoolean(R.styleable.Theme_android_windowIsFloating, false);
    this.h = localTypedArray.getBoolean(R.styleable.Theme_windowNoTitle, false);
    localTypedArray.recycle();
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
    b(paramCharSequence);
  }

  abstract boolean a(KeyEvent paramKeyEvent);

  public final MenuInflater b()
  {
    if (this.j == null)
      this.j = new e(m());
    return this.j;
  }

  abstract void b(CharSequence paramCharSequence);

  abstract boolean b(int paramInt);

  abstract boolean b(KeyEvent paramKeyEvent);

  abstract boolean c(int paramInt);

  public final void h()
  {
    this.l = true;
  }

  abstract ActionBar k();

  final ActionBar l()
  {
    return this.i;
  }

  final Context m()
  {
    ActionBar localActionBar = a();
    Context localContext = null;
    if (localActionBar != null)
      localContext = localActionBar.b();
    if (localContext == null)
      localContext = this.a;
    return localContext;
  }

  final boolean n()
  {
    return this.l;
  }

  final CharSequence o()
  {
    if ((this.c instanceof Activity))
      return ((Activity)this.c).getTitle();
    return this.k;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.m
 * JD-Core Version:    0.6.0
 */