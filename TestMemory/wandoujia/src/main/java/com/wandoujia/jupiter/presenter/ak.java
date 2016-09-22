package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.api.proto.Color;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.Tag;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.a;
import com.wandoujia.p4.game.view.FlowLayout;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ak extends c
{
  private static e a = new e();

  private static View a(Tag paramTag, ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getResources().getDimensionPixelOffset(2131427580);
    View localView = d.a(paramViewGroup, 2130903297);
    TextView localTextView = (TextView)localView.findViewById(2131493655);
    localTextView.setText(paramTag.tag_name);
    AsyncImageView localAsyncImageView = (AsyncImageView)localView.findViewById(2131493654);
    if ((paramTag.icon == null) || (TextUtils.isEmpty(paramTag.icon.url)))
    {
      localAsyncImageView.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localTextView.getLayoutParams();
      localLayoutParams.leftMargin = a.a().getResources().getDimensionPixelOffset(2131427717);
      localTextView.setLayoutParams(localLayoutParams);
    }
    while (true)
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      GradientDrawable localGradientDrawable1 = new GradientDrawable();
      localGradientDrawable1.setCornerRadius(i);
      try
      {
        if (paramTag.color != null)
        {
          localGradientDrawable1.setColor(0xFF000000 | paramTag.color.normal.intValue());
          label158: localGradientDrawable2 = new GradientDrawable();
          localGradientDrawable2.setCornerRadius(i);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (paramTag.color != null)
            localGradientDrawable2.setColor(0xFF000000 | paramTag.color.pressed.intValue());
          while (true)
          {
            localStateListDrawable.addState(new int[] { 16842919 }, localGradientDrawable2);
            localStateListDrawable.addState(new int[] { -16842919 }, localGradientDrawable1);
            d.a(localView, localStateListDrawable);
            b.a(localView, paramTag.action);
            localView.setTag(2131492933, paramTag);
            return localView;
            e.a(localAsyncImageView, paramTag.icon.url);
            break;
            localGradientDrawable1.setColor(paramViewGroup.getContext().getResources().getColor(2131361917));
            break label158;
            localException1 = localException1;
            localGradientDrawable1.setColor(paramViewGroup.getContext().getResources().getColor(2131361917));
            break label158;
            localGradientDrawable2.setColor(paramViewGroup.getContext().getResources().getColor(2131361918));
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            GradientDrawable localGradientDrawable2;
            localGradientDrawable2.setColor(paramViewGroup.getContext().getResources().getColor(2131361918));
          }
        }
      }
    }
  }

  protected final void a(Model paramModel)
  {
    FlowLayout localFlowLayout = (FlowLayout)e();
    ArrayList localArrayList = new ArrayList(paramModel.b().tag);
    int i = -1 + localFlowLayout.getChildCount();
    if (i >= 0)
    {
      Tag localTag = (Tag)localFlowLayout.getChildAt(i).getTag(2131492933);
      if ((localTag != null) && (paramModel.b().tag.contains(localTag)))
        localArrayList.remove(localTag);
      while (true)
      {
        i--;
        break;
        localFlowLayout.removeViewAt(i);
      }
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
      localFlowLayout.addView(a((Tag)localIterator.next(), localFlowLayout));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ak
 * JD-Core Version:    0.6.0
 */