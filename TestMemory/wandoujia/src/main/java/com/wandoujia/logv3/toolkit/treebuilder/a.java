package com.wandoujia.logv3.toolkit.treebuilder;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.wandoujia.logv3.model.packages.UrlPackage.Vertical;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage;
import com.wandoujia.logv3.toolkit.ab;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.al;
import com.wandoujia.logv3.toolkit.v;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
  implements b
{
  private static void a(View paramView, List<View> paramList)
  {
    ViewGroup localViewGroup;
    if ((paramView instanceof ViewGroup))
    {
      localViewGroup = (ViewGroup)paramView;
      if (!(localViewGroup instanceof ViewPager))
        break label43;
      View localView2 = android.support.v4.app.b.a((ViewPager)localViewGroup);
      if (localView2 != null)
        paramList.add(localView2);
    }
    while (true)
    {
      return;
      label43: if (((localViewGroup instanceof FrameLayout)) && (localViewGroup.getId() == 16908290))
      {
        if (localViewGroup.getChildCount() <= 0)
          continue;
        paramList.add(localViewGroup.getChildAt(-1 + localViewGroup.getChildCount()));
        return;
      }
      for (int i = 0; i < localViewGroup.getChildCount(); i++)
      {
        View localView1 = localViewGroup.getChildAt(i);
        if (v.s(localView1))
          continue;
        paramList.add(localView1);
      }
    }
  }

  private static void a(View paramView, Map<View, ab> paramMap, ab paramab)
  {
    View localView1 = paramView.getRootView();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(localView1);
    View localView2;
    String str1;
    UrlPackage.Vertical localVertical;
    ak localak;
    String str2;
    ab localab1;
    while (!localLinkedList.isEmpty())
    {
      localView2 = (View)localLinkedList.remove(0);
      a(localView2, localLinkedList);
      str1 = v.k(localView2);
      localVertical = v.g(localView2);
      localak = v.h(localView2);
      str2 = v.i(localView2);
      if ((str1 == null) && (localak == null) && (str2 == null) && (localView2 != paramView))
        continue;
      localab1 = b(localView2, paramMap, paramab);
      if (str1 == null)
        break label302;
    }
    label302: for (ab localab2 = new ab(str1, localab1); ; localab2 = null)
    {
      if (localVertical != null)
      {
        if (localab2 == null)
          localab2 = new ab(null, localab1);
        localab2.a(localVertical);
      }
      if ((localak != null) || (str2 != null))
      {
        if (localab2 == null)
          localab2 = new ab(null, localab1);
        localab2.a(localak);
        localab2.a(str2);
        localab2.a(v.j(localView2));
      }
      if (localView2 == paramView)
      {
        al localal = v.l(localView2);
        ViewLogPackage.IndexPackage localIndexPackage = v.m(localView2);
        if (localab2 == null)
          localab2 = new ab(null, localab1);
        if (localal != null)
          localab2.a(localal);
        if (localIndexPackage != null)
          localab2.a(localIndexPackage);
      }
      localab2.a(v.n(localView2));
      localab1.a(localab2);
      paramMap.put(localView2, localab2);
      break;
      return;
    }
  }

  private static ab b(View paramView, Map<View, ab> paramMap, ab paramab)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent instanceof View); localViewParent = localViewParent.getParent())
    {
      ab localab = (ab)paramMap.get(localViewParent);
      if (localab != null)
        return localab;
    }
    return paramab;
  }

  public final ab a(View paramView)
  {
    ab localab = new ab();
    a(paramView, new HashMap(), localab);
    return localab;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.treebuilder.a
 * JD-Core Version:    0.6.0
 */