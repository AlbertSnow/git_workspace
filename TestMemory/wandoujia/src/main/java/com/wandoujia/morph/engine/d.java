package com.wandoujia.morph.engine;

import android.content.Context;
import android.view.View;
import com.wandoujia.morph.a.a;
import com.wandoujia.morph.a.f;
import com.wandoujia.morph.a.h;
import com.wandoujia.morph.a.j;
import com.wandoujia.morph.a.l;
import com.wandoujia.morph.a.n;
import com.wandoujia.morph.a.p;
import com.wandoujia.morph.a.r;
import com.wandoujia.morph.a.t;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  private Map<MoWidgetType, t> a = new HashMap();

  private void a(t paramt)
  {
    this.a.put(paramt.p(), paramt);
  }

  public final View a(Context paramContext, MoWidgetType paramMoWidgetType, i parami)
  {
    t localt = (t)this.a.get(paramMoWidgetType);
    if (localt != null)
      return (View)localt.a(paramContext, parami);
    return null;
  }

  public final t a(MoWidgetType paramMoWidgetType)
  {
    return (t)this.a.get(paramMoWidgetType);
  }

  public final void a()
  {
    a(new p());
    a(new n(this));
    a(new android.support.v4.app.d(this));
    a(new f(this));
    a(new a(this));
    a(new r(this));
    a(new com.wandoujia.morph.a.d(this));
    a(new j(this));
    a(new h(this));
    a(new l(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.d
 * JD-Core Version:    0.6.0
 */