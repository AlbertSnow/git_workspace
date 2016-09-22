package com.wandoujia.accessibility.hibernation.fragment;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.wandoujia.accessibility.AccessibilityDispatcher;
import com.wandoujia.accessibility.hibernation.view.FlowLayout;
import com.wandoujia.accessibility.j;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.layout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoosterHomeFragment extends Fragment
{
  private FlowLayout a;
  private FlowLayout b;
  private LinearLayout c;
  private LinearLayout d;
  private ImageView e;
  private Button f;
  private List<String> g;
  private List<String> h;
  private Map<String, Long> i = new HashMap();
  private View j;
  private com.wandoujia.accessibility.hibernation.activity.b k;
  private int l = 0;
  private int m = 0;
  private int n = 0;
  private final j o = new a(this);

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    if ((paramActivity instanceof com.wandoujia.accessibility.hibernation.activity.b))
      this.k = ((com.wandoujia.accessibility.hibernation.activity.b)paramActivity);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.j = android.support.v4.app.b.a(getActivity(), R.layout.hibernation_home_layout);
    return this.j;
  }

  public void onDetach()
  {
    super.onDetach();
    this.k = null;
    AccessibilityDispatcher.b(this.o);
  }

  public void onResume()
  {
    super.onResume();
    AccessibilityDispatcher.b(this.o);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.a = ((FlowLayout)this.j.findViewById(R.id.white_list_icon));
    this.b = ((FlowLayout)this.j.findViewById(R.id.black_list_icon));
    this.c = ((LinearLayout)this.j.findViewById(R.id.white_list_detail));
    this.d = ((LinearLayout)this.j.findViewById(R.id.black_list_detail));
    this.e = ((ImageView)this.j.findViewById(R.id.info));
    this.f = ((Button)this.j.findViewById(R.id.button_start));
    this.f.setOnClickListener(new d(this));
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramView.findViewById(R.id.status_container).setVisibility(0);
      paramView.findViewById(R.id.load_status_container).setVisibility(0);
    }
    while (true)
    {
      this.e.setOnClickListener(new b(this));
      new c(this).execute(new Void[0]);
      v.b().a(getView(), new ak("apps/app_launcher/superboost/main")).a(getView());
      return;
      paramView.findViewById(R.id.status_container).setVisibility(8);
      paramView.findViewById(R.id.load_status_container).setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.BoosterHomeFragment
 * JD-Core Version:    0.6.0
 */