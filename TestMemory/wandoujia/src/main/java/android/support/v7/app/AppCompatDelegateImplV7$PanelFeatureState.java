package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.i;
import android.view.View;
import android.view.ViewGroup;

final class AppCompatDelegateImplV7$PanelFeatureState
{
  int a;
  int b;
  int c;
  int d;
  ViewGroup e;
  View f;
  View g;
  i h;
  g i;
  Context j;
  boolean k;
  boolean l;
  boolean m;
  public boolean n;
  boolean o;
  boolean p;
  Bundle q;

  AppCompatDelegateImplV7$PanelFeatureState(int paramInt)
  {
    this.a = paramInt;
    this.o = false;
  }

  final void a(i parami)
  {
    if (parami == this.h);
    do
    {
      return;
      if (this.h != null)
        this.h.b(this.i);
      this.h = parami;
    }
    while ((parami == null) || (this.i == null));
    parami.a(this.i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState
 * JD-Core Version:    0.6.0
 */