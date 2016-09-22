package com.wandoujia.jupiter.onboard;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.nineoldandroids.view.ViewPropertyAnimator;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EssentialGameFragment extends ListFragment
{
  private CustomFontTextView b;
  private CustomFontTextView c;
  private CustomFontTextView m;
  private CustomFontTextView n;
  private View o;

  public EssentialGameFragment()
  {
    setArguments(BaseListFragment.a("wdj://welcome/games", "http://apis.wandoujia.com/five/v1/nux/essentials/games?max=50", null));
  }

  public static int a(List<Model> paramList)
  {
    if (paramList == null)
      return 0;
    Iterator localIterator = paramList.iterator();
    int i = 0;
    if (localIterator.hasNext())
      if (!aa.a((Model)localIterator.next(), null, true))
        break label52;
    label52: for (int j = i + 1; ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public static void a(List<Model> paramList, BaseFragment paramBaseFragment)
  {
    if (paramList == null);
    AppTaskManager localAppTaskManager;
    ArrayList localArrayList;
    do
    {
      return;
      localAppTaskManager = (AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task");
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        if (!aa.a(localModel, null, true))
          continue;
        localArrayList.add(localModel);
      }
    }
    while (CollectionUtils.isEmpty(localArrayList));
    localAppTaskManager.a(localArrayList, paramBaseFragment.getCurrentPagePackage());
  }

  private String e()
  {
    int i = a(((OnboardActivity)getActivity()).a);
    int j = a(this.j.c());
    String str2;
    if ((i == 0) && (j == 0))
      if (NetworkUtil.isWifiConnected(getActivity()))
        str2 = getString(2131624713);
    while (true)
    {
      return str2;
      return "";
      if (i == 0)
      {
        String str4 = getString(2131624717);
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(j);
        str2 = String.format(str4, arrayOfObject3);
      }
      while (NetworkUtil.isWifiConnected(getActivity()))
      {
        return getString(2131624714) + str2;
        if (j == 0)
        {
          String str3 = getString(2131624709);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i);
          str2 = String.format(str3, arrayOfObject2);
          continue;
        }
        String str1 = getString(2131624712);
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(i);
        arrayOfObject1[1] = Integer.valueOf(j);
        str2 = String.format(str1, arrayOfObject1);
      }
    }
  }

  protected final int a()
  {
    return 2130903344;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    com.wandoujia.jupiter.p localp = new com.wandoujia.jupiter.p(this.k);
    localp.a(com.wandoujia.ripple_framework.d.a.a(com.wandoujia.jupiter.d.a.a(6), com.wandoujia.jupiter.d.a.e()));
    localp.a(false);
    return localp;
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    super.a(paramOp, paramg);
    this.m.setVisibility(0);
    this.m.setText(e());
    ViewPropertyAnimator.animate(this.b).setDuration(0L).alpha(1.0F);
    ViewPropertyAnimator.animate(this.c).setDuration(0L).alpha(1.0F);
    ViewPropertyAnimator.animate(this.m).setDuration(0L).alpha(1.0F);
    ViewPropertyAnimator.animate(this.n).setDuration(0L).alpha(1.0F);
    ViewPropertyAnimator.animate(this.o).setDuration(0L).alpha(1.0F);
    Animation localAnimation = AnimationUtils.loadAnimation(getActivity(), 2130968603);
    this.b.startAnimation(localAnimation);
    this.c.startAnimation(localAnimation);
    this.m.startAnimation(localAnimation);
    this.n.startAnimation(localAnimation);
    this.g.startAnimation(localAnimation);
    this.o.startAnimation(localAnimation);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    super.a(paramOp, paramException);
    com.wandoujia.jupiter.view.p.a(getActivity(), this.j, paramException).a();
  }

  protected final LinearLayoutManager e_()
  {
    getActivity();
    return new GridLayoutManager(3);
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new g();
  }

  public void onDestroy()
  {
    super.onDestroy();
    ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(com.wandoujia.jupiter.b.b.a parama)
  {
    String str = e();
    if (TextUtils.isEmpty(str))
      this.m.setVisibility(4);
    while ((a(((OnboardActivity)getActivity()).a) == 0) && (a(this.j.c()) == 0))
    {
      this.n.setText(2131624716);
      return;
      this.m.setVisibility(0);
      this.m.setText(str);
    }
    this.n.setText(2131624715);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEnabled(false);
    this.b = ((CustomFontTextView)paramView.findViewById(2131492998));
    this.c = ((CustomFontTextView)paramView.findViewById(2131493721));
    this.n = ((CustomFontTextView)paramView.findViewById(2131493465));
    this.m = ((CustomFontTextView)paramView.findViewById(2131493413));
    this.o = paramView.findViewById(2131493726);
    this.b.setText(2131624719);
    this.c.setText(2131624718);
    this.n.setText(2131624715);
    this.n.setOnClickListener(new h(this));
    this.o.setOnClickListener(new i(this));
    ((c)com.wandoujia.ripple_framework.i.k().a("event_bus")).a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.EssentialGameFragment
 * JD-Core Version:    0.6.0
 */