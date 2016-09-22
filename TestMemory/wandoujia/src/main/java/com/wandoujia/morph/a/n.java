package com.wandoujia.morph.a;

import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.widget.TextView;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.i;

public final class n
  implements t<TextView>
{
  public n()
  {
  }

  public n(d paramd)
  {
    paramd.a(MoWidgetType.View);
  }

  public static void a(TextView paramTextView, i parami)
  {
    a locala1 = parami.a(MoStyleable.TextView_style);
    if (locala1 != null)
    {
      int k = locala1.a();
      int m = 0;
      if (m < k)
      {
        switch (o.a[locala1.a(m).ordinal()])
        {
        default:
        case 1:
        }
        while (true)
        {
          m++;
          break;
          paramTextView.setTextAppearance(paramTextView.getContext(), locala1.d(m));
        }
      }
    }
    p.a(paramTextView, parami);
    a locala2 = parami.a(MoStyleable.TextView);
    if (locala2 != null)
    {
      int i = locala2.a();
      int j = 0;
      if (j < i)
      {
        switch (o.a[locala2.a(j).ordinal()])
        {
        default:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        }
        while (true)
        {
          j++;
          break;
          paramTextView.setText(locala2.f(j));
          continue;
          Object localObject = locala2.b(j);
          if (!(localObject instanceof TextUtils.TruncateAt))
            continue;
          paramTextView.setEllipsize((TextUtils.TruncateAt)localObject);
          continue;
          paramTextView.setHorizontalFadingEdgeEnabled(locala2.c(j));
          continue;
          paramTextView.setHorizontallyScrolling(locala2.c(j));
          continue;
          paramTextView.setTextColor(locala2.d(j));
          continue;
          paramTextView.setTextSize(0, locala2.d(j));
          continue;
          paramTextView.setTypeface((Typeface)locala2.b(j));
          continue;
          paramTextView.setGravity(locala2.d(j));
          continue;
          paramTextView.setSingleLine(locala2.c(j));
          continue;
          float f = locala2.e(j).floatValue();
          paramTextView.setLineSpacing(f, f);
        }
      }
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.TextView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.n
 * JD-Core Version:    0.6.0
 */