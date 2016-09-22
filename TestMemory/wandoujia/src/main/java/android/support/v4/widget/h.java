package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class h extends BaseAdapter
  implements l, Filterable
{
  protected boolean a = false;
  protected Cursor b = null;
  protected Context c;
  private boolean d = true;
  private int e;
  private i f;
  private DataSetObserver g;
  private k h;

  public h(Context paramContext)
  {
    this.c = paramContext;
    this.e = -1;
    this.f = new i(this);
    this.g = new j(this, 0);
  }

  public final Cursor a()
  {
    return this.b;
  }

  public Cursor a(CharSequence paramCharSequence)
  {
    return this.b;
  }

  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);

  public void a(Cursor paramCursor)
  {
    Cursor localCursor;
    if (paramCursor == this.b)
      localCursor = null;
    while (true)
    {
      if (localCursor != null)
        localCursor.close();
      return;
      localCursor = this.b;
      if (localCursor != null)
      {
        if (this.f != null)
          localCursor.unregisterContentObserver(this.f);
        if (this.g != null)
          localCursor.unregisterDataSetObserver(this.g);
      }
      this.b = paramCursor;
      if (paramCursor != null)
      {
        if (this.f != null)
          paramCursor.registerContentObserver(this.f);
        if (this.g != null)
          paramCursor.registerDataSetObserver(this.g);
        this.e = paramCursor.getColumnIndexOrThrow("_id");
        this.a = true;
        notifyDataSetChanged();
        continue;
      }
      this.e = -1;
      this.a = false;
      notifyDataSetInvalidated();
    }
  }

  public abstract void a(View paramView, Cursor paramCursor);

  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramCursor, paramViewGroup);
  }

  public CharSequence b(Cursor paramCursor)
  {
    if (paramCursor == null)
      return "";
    return paramCursor.toString();
  }

  protected final void b()
  {
    if ((this.d) && (this.b != null) && (!this.b.isClosed()))
      this.a = this.b.requery();
  }

  public int getCount()
  {
    if ((this.a) && (this.b != null))
      return this.b.getCount();
    return 0;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a)
    {
      this.b.moveToPosition(paramInt);
      if (paramView == null)
        paramView = b(this.c, this.b, paramViewGroup);
      a(paramView, this.b);
      return paramView;
    }
    return null;
  }

  public Filter getFilter()
  {
    if (this.h == null)
      this.h = new k(this);
    return this.h;
  }

  public Object getItem(int paramInt)
  {
    if ((this.a) && (this.b != null))
    {
      this.b.moveToPosition(paramInt);
      return this.b;
    }
    return null;
  }

  public long getItemId(int paramInt)
  {
    long l = 0L;
    if ((this.a) && (this.b != null) && (this.b.moveToPosition(paramInt)))
      l = this.b.getLong(this.e);
    return l;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a)
      throw new IllegalStateException("this should only be called when the cursor is valid");
    if (!this.b.moveToPosition(paramInt))
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    if (paramView == null)
      paramView = a(this.c, this.b, paramViewGroup);
    a(paramView, this.b);
    return paramView;
  }

  public boolean hasStableIds()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.0
 */