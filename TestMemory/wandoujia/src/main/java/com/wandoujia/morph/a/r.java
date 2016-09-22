package com.wandoujia.morph.a;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import com.wandoujia.morph.engine.MoStyleable;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.a;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.i;

public final class r
  implements t<ViewGroup>
{
  public r()
  {
  }

  public r(d paramd)
  {
    paramd.a(MoWidgetType.View);
  }

  public static ViewGroup.LayoutParams a(MoWidgetType paramMoWidgetType, i parami)
  {
    int i = 0;
    Object localObject;
    switch (s.b[paramMoWidgetType.ordinal()])
    {
    default:
      localObject = a(parami, null);
    case 1:
    case 2:
      a locala;
      int j;
      do
      {
        do
        {
          return localObject;
          localObject = new FrameLayout.LayoutParams(-2, -2);
          ((FrameLayout.LayoutParams)localObject).gravity = 0;
          a(parami, (ViewGroup.MarginLayoutParams)localObject);
          locala = parami.a(MoStyleable.FrameLayout_Layout);
        }
        while (locala == null);
        j = locala.a();
      }
      while (i >= j);
      switch (e.a[locala.a(i).ordinal()])
      {
      default:
      case 2:
      }
      while (true)
      {
        i++;
        break;
        ((FrameLayout.LayoutParams)localObject).gravity |= locala.d(i);
      }
    case 3:
      return h.a(parami);
    case 4:
    }
    return (ViewGroup.LayoutParams)j.a(parami);
  }

  private static ViewGroup.LayoutParams a(i parami, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
      paramLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    a locala = parami.a(MoStyleable.ViewGroup_Layout);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (s.a[locala.a(j).ordinal()])
        {
        default:
        case 14:
        case 15:
        }
        while (true)
        {
          j++;
          break;
          paramLayoutParams.width = locala.d(j);
          continue;
          paramLayoutParams.height = locala.d(j);
        }
      }
    }
    return paramLayoutParams;
  }

  @TargetApi(17)
  public static ViewGroup.MarginLayoutParams a(i parami, ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    a(parami, paramMarginLayoutParams);
    a locala = parami.a(MoStyleable.ViewGroup_MarginLayout);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (s.a[locala.a(j).ordinal()])
        {
        default:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        }
        while (true)
        {
          j++;
          break;
          int k = locala.d(j);
          if (k < 0)
            continue;
          paramMarginLayoutParams.bottomMargin = k;
          paramMarginLayoutParams.leftMargin = k;
          paramMarginLayoutParams.rightMargin = k;
          paramMarginLayoutParams.topMargin = k;
          continue;
          paramMarginLayoutParams.leftMargin = locala.d(j);
          continue;
          paramMarginLayoutParams.rightMargin = locala.d(j);
          continue;
          paramMarginLayoutParams.topMargin = locala.d(j);
          continue;
          paramMarginLayoutParams.bottomMargin = locala.d(j);
          continue;
          paramMarginLayoutParams.setMarginEnd(locala.d(j));
          continue;
          paramMarginLayoutParams.setMarginStart(locala.d(j));
        }
      }
    }
    return paramMarginLayoutParams;
  }

  @TargetApi(21)
  public static void a(ViewGroup paramViewGroup, i parami)
  {
    p.a(paramViewGroup, parami);
    a locala = parami.a(MoStyleable.ViewGroup);
    if (locala != null)
    {
      int i = locala.a();
      int j = 0;
      if (j < i)
      {
        switch (s.a[locala.a(j).ordinal()])
        {
        default:
        case 1:
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
        case 12:
        case 13:
        }
        while (true)
        {
          j++;
          break;
          paramViewGroup.setClipChildren(locala.c(j));
          continue;
          paramViewGroup.setClipToPadding(locala.c(j));
          continue;
          paramViewGroup.setAnimationCacheEnabled(locala.c(j));
          continue;
          paramViewGroup.setPersistentDrawingCache(locala.d(j));
          continue;
          paramViewGroup.setAddStatesFromChildren(locala.c(j));
          continue;
          paramViewGroup.setAlwaysDrawnWithCacheEnabled(locala.c(j));
          continue;
          int k = locala.d(j);
          if (k <= 0)
            continue;
          paramViewGroup.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(paramViewGroup.getContext(), k));
          continue;
          paramViewGroup.setDescendantFocusability(locala.d(j));
          continue;
          paramViewGroup.setMotionEventSplittingEnabled(locala.c(j));
          continue;
          if (!locala.c(j))
            continue;
          paramViewGroup.setLayoutTransition(new LayoutTransition());
          continue;
          paramViewGroup.setLayoutMode(locala.d(j));
          continue;
          paramViewGroup.setTransitionGroup(locala.c(j));
          continue;
          paramViewGroup.setTouchscreenBlocksFocus(locala.c(j));
        }
      }
    }
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.ViewGroup;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.r
 * JD-Core Version:    0.6.0
 */