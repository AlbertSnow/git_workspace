package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class an extends h
{
  private int d;
  private int e;
  private LayoutInflater f;

  public an(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.e = paramInt;
    this.d = paramInt;
    this.f = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }

  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.inflate(this.d, paramViewGroup, false);
  }

  public final View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.inflate(this.e, paramViewGroup, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.an
 * JD-Core Version:    0.6.0
 */