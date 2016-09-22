package com.wandoujia.p4.tips;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.b;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.wandoujia.p4.views.CoverViewContainer;

public final class a
{
  public final View a;
  private boolean b;
  private FrameLayout.LayoutParams c;

  public a(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, true);
  }

  public a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    this(b.a(new FrameLayout(paramContext), paramInt), paramBoolean);
  }

  public a(View paramView)
  {
    this(paramView, true);
  }

  private a(View paramView, boolean paramBoolean)
  {
    this.b = paramBoolean;
    this.a = paramView;
    this.a.setTag(this);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if ((localLayoutParams instanceof FrameLayout.LayoutParams))
    {
      this.c = ((FrameLayout.LayoutParams)localLayoutParams);
      return;
    }
    this.c = new FrameLayout.LayoutParams(-1, -1);
  }

  private View a(View paramView, ViewGroup paramViewGroup, int paramInt)
  {
    View localView = a(paramViewGroup, paramInt);
    if (localView != null)
    {
      localView.bringToFront();
      return localView;
    }
    this.a.setId(paramInt);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    if (this.b)
      paramView.setVisibility(4);
    if (paramViewGroup.indexOfChild(paramView) == -1)
      paramViewGroup.addView(paramView, localLayoutParams);
    while (true)
    {
      paramViewGroup.addView(this.a, this.c);
      return this.a;
      paramView.setLayoutParams(localLayoutParams);
    }
  }

  public static View a(View paramView, TipsType paramTipsType)
  {
    a locala = paramTipsType.createTips(paramView.getContext());
    if (locala == null)
      return null;
    int i = paramTipsType.ordinal();
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup == null)
      return null;
    if ((localViewGroup instanceof CoverViewContainer))
      return locala.a(paramView, localViewGroup, i);
    CoverViewContainer localCoverViewContainer = new CoverViewContainer(paramView.getContext());
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int j = localViewGroup.indexOfChild(paramView);
    localViewGroup.removeViewAt(j);
    localViewGroup.addView(localCoverViewContainer, j, localLayoutParams);
    Drawable localDrawable = paramView.getBackground();
    if (localDrawable != null)
      b.a(localCoverViewContainer, localDrawable);
    return locala.a(paramView, localCoverViewContainer, i);
  }

  private static View a(ViewGroup paramViewGroup, int paramInt)
  {
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      if (localView.getId() == paramInt)
        return localView;
    }
    return null;
  }

  public static void a(View paramView, TipsType[] paramArrayOfTipsType)
  {
    if ((paramView == null) || (paramArrayOfTipsType.length == 0))
      return;
    int i = paramArrayOfTipsType.length;
    int j = 0;
    label15: ViewGroup localViewGroup1;
    if (j < i)
    {
      int k = paramArrayOfTipsType[j].ordinal();
      localViewGroup1 = (ViewGroup)paramView.getParent();
      if ((localViewGroup1 instanceof CoverViewContainer))
      {
        View localView = a(localViewGroup1, k);
        if (localView != null)
        {
          localViewGroup1.removeView(localView);
          int m = 0;
          int n = 0;
          if (m < localViewGroup1.getChildCount())
          {
            a locala = (a)localViewGroup1.getChildAt(m).getTag();
            if (locala != null)
              if ((n == 0) && (!locala.b))
                break label129;
            label129: for (n = 1; ; n = 0)
            {
              if (n != 0)
                break label135;
              m++;
              break;
            }
          }
          label135: if (n == 0)
            break label225;
        }
      }
    }
    label225: for (int i1 = 4; ; i1 = 0)
    {
      paramView.setVisibility(i1);
      if (localViewGroup1.getChildCount() == 1)
      {
        ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.getParent();
        ViewGroup.LayoutParams localLayoutParams = localViewGroup1.getLayoutParams();
        int i2 = localViewGroup2.indexOfChild(localViewGroup1);
        localViewGroup2.removeViewAt(i2);
        if (paramView.getParent() != null)
          ((ViewGroup)paramView.getParent()).removeView(paramView);
        localViewGroup2.addView(paramView, i2, localLayoutParams);
      }
      j++;
      break label15;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.a
 * JD-Core Version:    0.6.0
 */