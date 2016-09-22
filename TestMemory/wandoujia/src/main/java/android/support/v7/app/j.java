package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class j
{
  private final d a;
  private int b;

  public j(Context paramContext)
  {
    this(paramContext, i.a(paramContext, 0));
  }

  public j(Context paramContext, int paramInt)
  {
    this.a = new d(new ContextThemeWrapper(paramContext, i.a(paramContext, paramInt)));
    this.b = paramInt;
  }

  public final Context a()
  {
    return this.a.a;
  }

  public final j a(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.f = this.a.a.getText(2131624552);
    this.a.g = paramOnClickListener;
    return this;
  }

  public final j a(DialogInterface.OnKeyListener paramOnKeyListener)
  {
    this.a.k = paramOnKeyListener;
    return this;
  }

  public final j a(Drawable paramDrawable)
  {
    this.a.c = paramDrawable;
    return this;
  }

  public final j a(View paramView)
  {
    this.a.e = paramView;
    return this;
  }

  public final j a(ListAdapter paramListAdapter, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.m = paramListAdapter;
    this.a.n = paramOnClickListener;
    return this;
  }

  public final j a(CharSequence paramCharSequence)
  {
    this.a.d = paramCharSequence;
    return this;
  }

  public final j a(CharSequence[] paramArrayOfCharSequence, int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.l = paramArrayOfCharSequence;
    this.a.n = paramOnClickListener;
    this.a.q = paramInt;
    this.a.p = true;
    return this;
  }

  public final i b()
  {
    i locali = new i(this.a.a, this.b);
    d locald = this.a;
    b localb = i.a(locali);
    ListView localListView;
    int i;
    if (locald.e != null)
    {
      localb.a(locald.e);
      if (locald.f != null)
        localb.a(-1, locald.f, locald.g, null);
      if (locald.h != null)
        localb.a(-2, locald.h, locald.i, null);
      if ((locald.l != null) || (locald.m != null))
      {
        localListView = (ListView)locald.b.inflate(b.i(localb), null);
        if (!locald.p)
          break label308;
        i = b.j(localb);
        label131: if (locald.m == null)
          break label317;
      }
    }
    label308: label317: for (Object localObject = locald.m; ; localObject = new h(locald.a, i, locald.l))
    {
      b.a(localb, (ListAdapter)localObject);
      b.a(localb, locald.q);
      if (locald.n != null)
        localListView.setOnItemClickListener(new e(locald, localb));
      if (locald.p)
        localListView.setChoiceMode(1);
      b.a(localb, localListView);
      if (locald.o != null)
        localb.b(locald.o);
      locali.setCancelable(this.a.j);
      if (this.a.j)
        locali.setCanceledOnTouchOutside(true);
      locali.setOnCancelListener(null);
      locali.setOnDismissListener(null);
      if (this.a.k != null)
        locali.setOnKeyListener(this.a.k);
      return locali;
      if (locald.d != null)
        localb.a(locald.d);
      if (locald.c == null)
        break;
      localb.a(locald.c);
      break;
      i = b.k(localb);
      break label131;
    }
  }

  public final j b(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.h = this.a.a.getText(2131624330);
    this.a.i = paramOnClickListener;
    return this;
  }

  public final j b(View paramView)
  {
    this.a.o = paramView;
    return this;
  }

  public final i c()
  {
    i locali = b();
    locali.show();
    return locali;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.j
 * JD-Core Version:    0.6.0
 */