package com.wandoujia.jupiter.onboard;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.cc;
import android.view.View;
import com.nineoldandroids.view.ViewPropertyAnimator;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import java.util.List;

public class EssentialAppFragment extends ListFragment
{
  private l b;
  private View c;
  private View m;
  private View n;
  private CustomFontTextView o;
  private CustomFontTextView p;
  private View q;

  public EssentialAppFragment()
  {
    setArguments(BaseListFragment.a("wdj://welcome/apps", "http://apis.wandoujia.com/five/v1/nux/essentials/apps?max=50", null));
  }

  private boolean e()
  {
    return (this.b == null) || (isDetached());
  }

  private void r()
  {
    if (e())
      return;
    this.o.setVisibility(0);
    CustomFontTextView localCustomFontTextView = this.o;
    int i = EssentialGameFragment.a(this.j.c());
    String str2;
    if (i == 0)
      if (NetworkUtil.isWifiConnected(getActivity()))
        str2 = getString(2131624713);
    while (true)
    {
      localCustomFontTextView.setText(str2);
      if (!this.b.b())
        break;
      if (EssentialGameFragment.a(this.j.c()) == 0)
      {
        this.p.setText(2131624716);
        return;
        str2 = "";
        continue;
        String str1 = getString(2131624709);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        str2 = String.format(str1, arrayOfObject);
        if (!NetworkUtil.isWifiConnected(getActivity()))
          continue;
        str2 = getString(2131624714) + str2;
        continue;
      }
      this.p.setText(2131624715);
      return;
    }
    this.p.setText(2131624708);
  }

  protected final int a()
  {
    return 2130903344;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    b localb = new b(this.k);
    localb.a(com.wandoujia.ripple_framework.d.a.a(com.wandoujia.ripple_framework.d.a.a(com.wandoujia.jupiter.d.a.a(9), new c(this)), com.wandoujia.jupiter.d.a.e()));
    localb.a(false);
    return localb;
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    r();
    if (this.j.c().size() < 6)
      getActivity().finish();
    do
    {
      do
        return;
      while (e());
      ViewPropertyAnimator.animate(this.c).setDuration(600L).alpha(1.0F);
      ViewPropertyAnimator.animate(this.m).setDuration(600L).alpha(1.0F);
      ViewPropertyAnimator.animate(this.o).setDuration(600L).alpha(1.0F).setStartDelay(2000L);
      ViewPropertyAnimator.animate(this.p).setDuration(600L).alpha(1.0F).setStartDelay(2000L);
      ViewPropertyAnimator.animate(this.q).setDuration(600L).alpha(1.0F).setStartDelay(2000L);
    }
    while (!this.b.b());
    ViewPropertyAnimator.animate(this.o).setDuration(600L).alpha(1.0F).setStartDelay(2000L);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    super.a(paramOp, paramException);
    p.a(getActivity(), this.j, paramException).a();
  }

  protected final cc b()
  {
    return super.b();
  }

  protected final LinearLayoutManager e_()
  {
    getActivity();
    return new GridLayoutManager(3);
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new a();
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      this.b = ((l)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException(paramActivity.toString() + " must implement OnFragmentInteractionListener");
  }

  public void onDestroy()
  {
    super.onDestroy();
    ((de.greenrobot.event.c)i.k().a("event_bus")).c(this);
  }

  public void onDetach()
  {
    super.onDetach();
    this.b = null;
  }

  public void onEventMainThread(com.wandoujia.jupiter.b.b.a parama)
  {
    r();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEnabled(false);
    this.c = paramView.findViewById(2131492998);
    this.m = paramView.findViewById(2131493721);
    this.p = ((CustomFontTextView)paramView.findViewById(2131493465));
    this.q = paramView.findViewById(2131493726);
    this.o = ((CustomFontTextView)paramView.findViewById(2131493413));
    this.n = paramView.findViewById(2131493519);
    this.p.setOnClickListener(new d(this));
    this.q.setOnClickListener(new e(this));
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.EssentialAppFragment
 * JD-Core Version:    0.6.0
 */