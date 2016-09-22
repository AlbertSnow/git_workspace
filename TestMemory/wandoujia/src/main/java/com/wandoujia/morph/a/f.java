package com.wandoujia.morph.a;

import android.annotation.TargetApi;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.i;

public final class f
  implements t<ImageView>
{
  public f()
  {
  }

  public f(d paramd)
  {
    paramd.a(MoWidgetType.View);
  }

  @TargetApi(16)
  private static void a(ImageView paramImageView, i parami)
  {
    p.a(paramImageView, parami);
    a locala = parami.a(MoStyleable.ImageView);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (g.a[locala.a(j).ordinal()])
        {
        case 8:
        case 9:
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 10:
        case 11:
        }
        while (true)
        {
          j++;
          break;
          paramImageView.setImageDrawable(locala.a(paramImageView.getContext(), j));
          continue;
          paramImageView.setBaselineAlignBottom(locala.c(j));
          continue;
          paramImageView.setBaseline(locala.d(j));
          continue;
          paramImageView.setAdjustViewBounds(locala.c(j));
          continue;
          paramImageView.setMaxWidth(locala.d(j));
          continue;
          paramImageView.setMaxHeight(locala.d(j));
          continue;
          paramImageView.setScaleType((ImageView.ScaleType)locala.b(j));
          continue;
          paramImageView.setImageAlpha(locala.d(j));
          continue;
          paramImageView.setCropToPadding(locala.c(j));
        }
      }
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.ImageView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.f
 * JD-Core Version:    0.6.0
 */