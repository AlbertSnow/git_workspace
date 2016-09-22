package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.bg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class d
  implements x
{
  protected Context a;
  protected Context b;
  protected i c;
  protected z d;
  private LayoutInflater e;
  private y f;
  private int g;
  private int h;

  public d(Context paramContext, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.e = LayoutInflater.from(paramContext);
    this.g = paramInt1;
    this.h = paramInt2;
  }

  public final y a()
  {
    return this.f;
  }

  public z a(ViewGroup paramViewGroup)
  {
    if (this.d == null)
    {
      this.d = ((z)this.e.inflate(this.g, paramViewGroup, false));
      this.d.a(this.c);
      b(true);
    }
    return this.d;
  }

  public View a(m paramm, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof aa));
    for (aa localaa = (aa)paramView; ; localaa = (aa)this.e.inflate(this.h, paramViewGroup, false))
    {
      a(paramm, localaa);
      return (View)localaa;
    }
  }

  public void a(Context paramContext, i parami)
  {
    this.b = paramContext;
    LayoutInflater.from(this.b);
    this.c = parami;
  }

  public void a(i parami, boolean paramBoolean)
  {
    if (this.f != null)
      this.f.a(parami, paramBoolean);
  }

  public abstract void a(m paramm, aa paramaa);

  public final void a(y paramy)
  {
    this.f = paramy;
  }

  public boolean a(ac paramac)
  {
    if (this.f != null)
      return this.f.a(paramac);
    return false;
  }

  public boolean a(m paramm)
  {
    return true;
  }

  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public void b(boolean paramBoolean)
  {
    ViewGroup localViewGroup1 = (ViewGroup)this.d;
    if (localViewGroup1 == null);
    label217: label226: 
    while (true)
    {
      return;
      int i;
      int m;
      if (this.c != null)
      {
        this.c.l();
        ArrayList localArrayList = this.c.k();
        int j = localArrayList.size();
        int k = 0;
        i = 0;
        if (k < j)
        {
          m localm1 = (m)localArrayList.get(k);
          if (!a(localm1))
            break label217;
          View localView1 = localViewGroup1.getChildAt(i);
          if ((localView1 instanceof aa));
          for (m localm2 = ((aa)localView1).getItemData(); ; localm2 = null)
          {
            View localView2 = a(localm1, localView1, localViewGroup1);
            if (localm1 != localm2)
            {
              localView2.setPressed(false);
              bg.y(localView2);
            }
            if (localView2 != localView1)
            {
              ViewGroup localViewGroup2 = (ViewGroup)localView2.getParent();
              if (localViewGroup2 != null)
                localViewGroup2.removeView(localView2);
              ((ViewGroup)this.d).addView(localView2, i);
            }
            m = i + 1;
            k++;
            i = m;
            break;
          }
        }
      }
      while (true)
      {
        if (i >= localViewGroup1.getChildCount())
          break label226;
        if (a(localViewGroup1, i))
          continue;
        i++;
        continue;
        m = i;
        break;
        i = 0;
      }
    }
  }

  public boolean b()
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.d
 * JD-Core Version:    0.6.0
 */