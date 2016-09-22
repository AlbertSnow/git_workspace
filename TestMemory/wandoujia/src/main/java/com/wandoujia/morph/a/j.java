package com.wandoujia.morph.a;

import android.annotation.TargetApi;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.i;

public class j
  implements t<RelativeLayout>
{
  public j()
  {
  }

  public j(d paramd)
  {
    paramd.a(MoWidgetType.ViewGroup);
  }

  @TargetApi(17)
  public static RelativeLayout.LayoutParams a(i parami)
  {
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    r.a(parami, localLayoutParams1);
    a locala = parami.a(MoStyleable.RelativeLayout_Layout);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        int m;
        int k;
        RelativeLayout.LayoutParams localLayoutParams2;
        switch (k.a[locala.a(j).ordinal()])
        {
        default:
        case 3:
          while (true)
          {
            j++;
            break;
            localLayoutParams1.alignWithParent = locala.c(j);
          }
        case 4:
          m = locala.d(j);
          k = 0;
          localLayoutParams2 = localLayoutParams1;
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        }
        while (true)
        {
          localLayoutParams2.addRule(k, m);
          break;
          k = 1;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 2;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 3;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 4;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 5;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 6;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 7;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 8;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          if (locala.c(j));
          for (int i7 = -1; ; i7 = 0)
          {
            localLayoutParams1.addRule(9, i7);
            break;
          }
          if (locala.c(j));
          for (int i6 = -1; ; i6 = 0)
          {
            localLayoutParams1.addRule(10, i6);
            break;
          }
          if (locala.c(j));
          for (int i5 = -1; ; i5 = 0)
          {
            localLayoutParams1.addRule(11, i5);
            break;
          }
          if (locala.c(j));
          for (int i4 = -1; ; i4 = 0)
          {
            localLayoutParams1.addRule(12, i4);
            break;
          }
          if (locala.c(j));
          for (int i3 = -1; ; i3 = 0)
          {
            localLayoutParams1.addRule(13, i3);
            break;
          }
          if (locala.c(j));
          for (int i2 = -1; ; i2 = 0)
          {
            localLayoutParams1.addRule(14, i2);
            break;
          }
          if (locala.c(j));
          for (int i1 = -1; ; i1 = 0)
          {
            localLayoutParams1.addRule(15, i1);
            break;
          }
          k = 16;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 17;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 18;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          k = 19;
          m = locala.d(j);
          localLayoutParams2 = localLayoutParams1;
          continue;
          if (locala.c(j));
          for (int n = -1; ; n = 0)
          {
            localLayoutParams1.addRule(20, n);
            break;
          }
          if (locala.c(j))
          {
            k = 21;
            localLayoutParams2 = localLayoutParams1;
            m = -1;
            continue;
          }
          k = 21;
          localLayoutParams2 = localLayoutParams1;
          m = 0;
        }
      }
    }
    return localLayoutParams1;
  }

  private static void a(RelativeLayout paramRelativeLayout, i parami)
  {
    r.a(paramRelativeLayout, parami);
    a locala = parami.a(MoStyleable.RelativeLayout);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (k.a[locala.a(j).ordinal()])
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          j++;
          break;
          paramRelativeLayout.setGravity(locala.d(j));
          continue;
          paramRelativeLayout.setIgnoreGravity(locala.d(j));
        }
      }
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.RelativeLayout;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.j
 * JD-Core Version:    0.6.0
 */