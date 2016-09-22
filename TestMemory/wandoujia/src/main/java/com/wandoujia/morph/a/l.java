package com.wandoujia.morph.a;

import android.widget.ScrollView;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.i;

public final class l
  implements t<ScrollView>
{
  public l(com.wandoujia.morph.engine.d paramd)
  {
    paramd.a(MoWidgetType.FrameLayout);
  }

  private static void a(ScrollView paramScrollView, i parami)
  {
    d.a(paramScrollView, parami);
    a locala = parami.a(MoStyleable.ScrollView);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (m.a[locala.a(j).ordinal()])
        {
        default:
        case 1:
        }
        while (true)
        {
          j++;
          break;
          paramScrollView.setFillViewport(locala.c(j));
        }
      }
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.ScrollView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.l
 * JD-Core Version:    0.6.0
 */