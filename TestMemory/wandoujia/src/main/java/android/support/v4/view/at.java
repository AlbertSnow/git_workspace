package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class at
{
  private DataSetObservable a = new DataSetObservable();

  public abstract int a();

  public int a(Object paramObject)
  {
    return -1;
  }

  public CharSequence a(int paramInt)
  {
    return null;
  }

  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }

  public final void a(DataSetObserver paramDataSetObserver)
  {
    this.a.registerObserver(paramDataSetObserver);
  }

  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }

  public abstract boolean a(View paramView, Object paramObject);

  public void b()
  {
  }

  public final void b(DataSetObserver paramDataSetObserver)
  {
    this.a.unregisterObserver(paramDataSetObserver);
  }

  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
  }

  public Parcelable c()
  {
    return null;
  }

  public final void d()
  {
    this.a.notifyChanged();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.at
 * JD-Core Version:    0.6.0
 */