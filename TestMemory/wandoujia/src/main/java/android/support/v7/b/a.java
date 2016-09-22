package android.support.v7.b;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public abstract class a
{
  private Object a;
  private boolean b;

  public abstract MenuInflater a();

  public abstract void a(int paramInt);

  public abstract void a(View paramView);

  public abstract void a(CharSequence paramCharSequence);

  public final void a(Object paramObject)
  {
    this.a = paramObject;
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public abstract Menu b();

  public abstract void b(int paramInt);

  public abstract void b(CharSequence paramCharSequence);

  public abstract void c();

  public abstract void d();

  public abstract CharSequence f();

  public abstract CharSequence g();

  public boolean h()
  {
    return false;
  }

  public abstract View i();

  public final Object j()
  {
    return this.a;
  }

  public final boolean k()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.b.a
 * JD-Core Version:    0.6.0
 */