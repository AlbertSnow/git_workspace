package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.launcher_base.launcher.c.a;

public final class d extends a
{
  private e a;

  public static int a(long paramLong1, long paramLong2)
  {
    float f = 100.0F * (float)paramLong1 / (float)paramLong2;
    long l = b(paramLong1);
    com.wandoujia.online_config.c.a();
    if ((f < (float)com.wandoujia.online_config.c.n()) || (l < com.wandoujia.online_config.c.o()))
      return 3;
    if ((f < (float)com.wandoujia.online_config.c.p()) || (l < com.wandoujia.online_config.c.q()))
      return 2;
    return 1;
  }

  private static long b(long paramLong)
  {
    return paramLong / 1024L / 1024L;
  }

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = com.wandoujia.p4.utils.c.a(paramViewGroup, 2130903158);
      paramView.setTag(2131493023, new e(paramView));
    }
    Object localObject = paramView.getTag(2131493023);
    if (localObject != null)
    {
      this.a = ((e)localObject);
      this.a.a();
    }
    return paramView;
  }

  public final void j()
  {
    if (this.a != null)
      this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.d
 * JD-Core Version:    0.6.0
 */