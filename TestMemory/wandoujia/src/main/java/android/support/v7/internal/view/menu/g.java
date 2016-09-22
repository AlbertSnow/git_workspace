package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.appcompat.R.layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public final class g
  implements x, AdapterView.OnItemClickListener
{
  LayoutInflater a;
  i b;
  int c;
  private Context d;
  private ExpandedMenuView e;
  private y f;
  private h g;

  private g(int paramInt)
  {
    this.c = paramInt;
  }

  public g(Context paramContext, int paramInt)
  {
    this(paramInt);
    this.d = paramContext;
    this.a = LayoutInflater.from(this.d);
  }

  public final z a(ViewGroup paramViewGroup)
  {
    if (this.e == null)
    {
      this.e = ((ExpandedMenuView)this.a.inflate(R.layout.abc_expanded_menu_layout, paramViewGroup, false));
      if (this.g == null)
        this.g = new h(this);
      this.e.setAdapter(this.g);
      this.e.setOnItemClickListener(this);
    }
    return this.e;
  }

  public final ListAdapter a()
  {
    if (this.g == null)
      this.g = new h(this);
    return this.g;
  }

  public final void a(Context paramContext, i parami)
  {
    if (this.d != null)
    {
      this.d = paramContext;
      if (this.a == null)
        this.a = LayoutInflater.from(this.d);
    }
    this.b = parami;
    if (this.g != null)
      this.g.notifyDataSetChanged();
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if (this.f != null)
      this.f.a(parami, paramBoolean);
  }

  public final void a(y paramy)
  {
    this.f = paramy;
  }

  public final boolean a(ac paramac)
  {
    if (!paramac.hasVisibleItems())
      return false;
    new l(paramac).a();
    if (this.f != null)
      this.f.a(paramac);
    return true;
  }

  public final void b(boolean paramBoolean)
  {
    if (this.g != null)
      this.g.notifyDataSetChanged();
  }

  public final boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    return false;
  }

  public final boolean c(m paramm)
  {
    return false;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.a(this.g.a(paramInt), this, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.g
 * JD-Core Version:    0.6.0
 */