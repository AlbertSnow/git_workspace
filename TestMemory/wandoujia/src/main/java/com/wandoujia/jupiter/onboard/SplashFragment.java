package com.wandoujia.jupiter.onboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.view.ViewPropertyAnimator;
import com.wandoujia.jupiter.multidex.MultiDex;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public class SplashFragment extends BaseFragment
{
  private View a;
  private View b;
  private View c;
  private View d;
  private View e;
  private o f;
  private l g;
  private boolean h = false;

  public SplashFragment()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("page_intent_uri", "wdj://welcome/hello");
    setArguments(localBundle);
  }

  private void a()
  {
    if (!isAdded());
    do
      return;
    while (this.f == null);
    if (isResumed())
    {
      this.f.c();
      this.g.a();
      return;
    }
    this.h = true;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      this.f = ((o)paramActivity);
      this.g = ((l)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException(paramActivity.toString() + " must implement OnFragmentInteractionListener");
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130903399, paramViewGroup, false);
  }

  public void onDetach()
  {
    super.onDetach();
    this.f = null;
  }

  public void onResume()
  {
    super.onResume();
    if ((this.h) && (this.f != null))
    {
      this.f.c();
      this.g.a();
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.a = paramView.findViewById(2131493744);
    this.b = paramView.findViewById(2131493745);
    this.c = paramView.findViewById(2131493722);
    this.d = paramView.findViewById(2131492998);
    this.e = paramView.findViewById(2131493721);
    if (MultiDex.IS_VM_MULTIDEX_CAPABLE);
    int j;
    for (int i = 1500; ; j = 0)
    {
      ViewPropertyAnimator.animate(this.a).setDuration(1000L).alpha(1.0F).scaleX(1.0F).scaleY(1.0F);
      ViewPropertyAnimator.animate(this.b).setDuration(1000L).alpha(1.0F).scaleX(1.0F).scaleY(1.0F);
      ViewPropertyAnimator.animate(this.c).setDuration(i).alpha(1.0F).scaleX(1.0F).scaleY(1.0F);
      ViewPropertyAnimator.animate(this.d).setDuration(600L).alpha(1.0F).setStartDelay(750L);
      ViewPropertyAnimator.animate(this.e).setDuration(600L).alpha(1.0F).setStartDelay(750L).setListener(new m(this));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.SplashFragment
 * JD-Core Version:    0.6.0
 */