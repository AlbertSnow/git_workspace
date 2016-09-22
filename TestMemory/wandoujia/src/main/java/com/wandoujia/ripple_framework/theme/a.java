package com.wandoujia.ripple_framework.theme;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.base.log.Log;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends com.wandoujia.ripple_framework.c.c
{
  private List<d> a = new ArrayList();

  private void a(View paramView)
  {
    if (paramView == null);
    while (true)
    {
      return;
      if ((paramView instanceof ImageView))
      {
        int j = paramView.getId();
        if ((j != R.id.cover) && (j != R.id.image) && (j != R.id.icon))
          continue;
        if ("Night".equals(i.k().e()))
        {
          paramView.setAlpha(0.7F);
          return;
        }
        paramView.setAlpha(1.0F);
        return;
      }
      if (!(paramView instanceof ViewGroup))
        continue;
      for (int i = 0; i < ((ViewGroup)paramView).getChildCount(); i++)
        a(((ViewGroup)paramView).getChildAt(i));
    }
  }

  private void b()
  {
    a(e());
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (locald.a == 0);
      for (View localView = e(); ; localView = e().findViewById(locald.a))
      {
        if (localView == null)
          Log.e("ColorThemePresenter", "apply theme view %s is null. plz check.", new Object[] { i.k().g().getResources().getResourceName(locald.a) });
        switch (b.a[locald.b.ordinal()])
        {
        default:
          break;
        case 1:
          b.c(localView, locald.c);
          break;
        case 2:
        case 3:
        }
      }
      b.a((TextView)localView, locald.c);
      continue;
      locald.d.a();
    }
  }

  public final a a(int paramInt1, ThemeType paramThemeType, int paramInt2)
  {
    this.a.add(new d(paramInt1, paramThemeType, paramInt2));
    return this;
  }

  public final a a(ThemeType paramThemeType, int paramInt)
  {
    this.a.add(new d(0, paramThemeType, paramInt));
    return this;
  }

  public final a a(e parame)
  {
    this.a.add(new d(parame));
    return this;
  }

  public final void a()
  {
    super.a();
    ((de.greenrobot.event.c)i.k().a("event_bus")).c(this);
  }

  public final void a(Model paramModel)
  {
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
    if (e() != null)
      b();
  }

  public final void onEventMainThread(j paramj)
  {
    if (paramj.a != EventBusManager.Type.COLOR_THEME_CHANGED);
    do
      return;
    while (e() == null);
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.theme.a
 * JD-Core Version:    0.6.0
 */