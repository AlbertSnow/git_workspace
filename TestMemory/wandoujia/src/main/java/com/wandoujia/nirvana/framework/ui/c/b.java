package com.wandoujia.nirvana.framework.ui.c;

import android.view.View;
import com.wandoujia.nirvana.framework.ui.R.id;

public final class b
{
  private static final int a = R.id.tag_view_holder;
  private static final int b = R.id.tag_view_presenter;
  private static final int c = R.id.tag_layout_id;
  private static final int d = R.id.tag_recycle_helper;
  private static final int e = R.id.tag_template;

  public static com.wandoujia.nirvana.framework.ui.a a(View paramView)
  {
    return (com.wandoujia.nirvana.framework.ui.a)paramView.getTag(b);
  }

  public static void a(View paramView, int paramInt)
  {
    paramView.setTag(c, Integer.valueOf(paramInt));
  }

  public static void a(View paramView, com.wandoujia.nirvana.framework.ui.a parama)
  {
    paramView.setTag(b, parama);
  }

  public static void a(View paramView, com.wandoujia.nirvana.framework.ui.b.b paramb)
  {
    paramView.setTag(a, paramb);
  }

  public static <T> void a(View paramView, a<T> parama)
  {
    paramView.setTag(d, parama);
  }

  public static com.wandoujia.nirvana.framework.ui.b.b b(View paramView)
  {
    return (com.wandoujia.nirvana.framework.ui.b.b)paramView.getTag(a);
  }

  public static void b(View paramView, int paramInt)
  {
    paramView.setTag(e, Integer.valueOf(paramInt));
  }

  public static int c(View paramView)
  {
    Integer localInteger = (Integer)paramView.getTag(e);
    if (localInteger == null)
      return 0;
    return localInteger.intValue();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.c.b
 * JD-Core Version:    0.6.0
 */