package com.wandoujia.jupiter.library.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import com.nineoldandroids.animation.ArgbEvaluator;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.p4.app.upgrade.a;
import com.wandoujia.p4.app.upgrade.k;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.i;
import java.util.List;

public final class f extends com.wandoujia.ripple_framework.view.slidingtab.e
  implements TransitionTab, e
{
  private k b;
  private View c;
  private TextView d;
  private TextView e;
  private int f;
  private int g;
  private int h;
  private int i;

  public f(String paramString)
  {
    super(paramString);
  }

  private void a(int paramInt)
  {
    if (this.d == null)
      return;
    TextView localTextView = this.d;
    if (paramInt <= 0);
    for (String str = ""; ; str = String.valueOf(paramInt))
    {
      localTextView.setText(str);
      return;
    }
  }

  public final View a(Context paramContext, int paramInt, ViewPager paramViewPager, android.support.v7.app.f paramf)
  {
    if (this.c == null)
    {
      this.c = c.a(paramContext, 2130903404);
      this.d = ((TextView)this.c.findViewById(2131493750));
      this.e = ((TextView)this.c.findViewById(2131492998));
    }
    this.c.setOnClickListener(new g(paramViewPager, paramInt));
    List localList = ((AppManager)i.k().a("app")).i();
    localList.removeAll(((AppManager)i.k().a("app")).k());
    a(localList.size());
    return this.c;
  }

  public final void a()
  {
    if (this.b != null)
      return;
    this.b = new h(this);
    a.a(this.b);
  }

  public final void a(TransitionTab.State paramState)
  {
    if (this.c == null)
      return;
    this.f = this.d.getCurrentTextColor();
    this.g = this.e.getCurrentTextColor();
    int j;
    if (this.c.isSelected())
    {
      j = paramState.getNumColorList().getColorForState(new int[] { 16842913 }, this.f);
      this.h = j;
      if (!this.c.isSelected())
        break label112;
    }
    label112: for (int k = paramState.getTitleColorList().getColorForState(new int[] { 16842913 }, this.g); ; k = paramState.getTitleColorList().getDefaultColor())
    {
      this.i = k;
      return;
      j = paramState.getNumColorList().getDefaultColor();
      break;
    }
  }

  public final void a(TransitionTab.State paramState, float paramFloat)
  {
    if (this.c == null)
      return;
    this.d.setTextColor(((Integer)a.evaluate(paramFloat, Integer.valueOf(this.f), Integer.valueOf(this.h))).intValue());
    this.e.setTextColor(((Integer)a.evaluate(paramFloat, Integer.valueOf(this.g), Integer.valueOf(this.i))).intValue());
  }

  public final void b()
  {
    this.b = null;
  }

  public final void b(TransitionTab.State paramState)
  {
    if (this.c == null)
      return;
    this.e.setTextColor(paramState.getTitleColorList());
    this.d.setTextColor(paramState.getNumColorList());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.f
 * JD-Core Version:    0.6.0
 */