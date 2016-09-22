package com.wandoujia.jupiter.onboard;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.b.b.b;
import com.wandoujia.jupiter.view.PageDotIndicator;
import com.wandoujia.ripple_framework.fragment.AsyncLoadFragment;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomViewPager;
import com.wandoujia.ripple_framework.view.StatefulButton;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StoryFragment extends AsyncLoadFragment
{
  private CustomViewPager a;
  private TextView b;
  private StatefulButton c;
  private View e;
  private PageDotIndicator f;
  private Set<Model> g;
  private int h;
  private int i;
  private List<Model> j = new ArrayList();
  private u k;

  private void c()
  {
    int m;
    if (CollectionUtils.isEmpty(this.g))
    {
      m = 2131624722;
      StatefulButton localStatefulButton = this.c;
      if (this.h != -1 + this.j.size())
        break label126;
      label36: localStatefulButton.setText(m);
      this.c.setOnClickListener(new r(this));
      if (this.h != -1 + this.j.size())
        break label132;
    }
    label132: for (int n = 1; ; n = 0)
    {
      if (!CollectionUtils.isEmpty(this.g))
        break label137;
      String str2 = getString(2131625359);
      this.b.setText(str2);
      this.b.setTextColor(getResources().getColor(2131361930));
      return;
      m = 2131624973;
      break;
      label126: m = 2131625180;
      break label36;
    }
    label137: boolean bool = NetworkUtil.isWifiConnected(getActivity());
    StringBuilder localStringBuilder = new StringBuilder();
    int i1;
    if (n != 0)
      if (bool)
        i1 = 2131624339;
    while (true)
    {
      String str1 = getString(i1) + d();
      this.b.setText(str1);
      this.b.setTextColor(getResources().getColor(2131361954));
      return;
      i1 = 2131624340;
      continue;
      i1 = 2131624342;
    }
  }

  private String d()
  {
    Iterator localIterator = this.g.iterator();
    int m = 0;
    int n = 0;
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if ((localModel.C() == null) || (localModel.C().app_detail == null))
        break label195;
      if ("APP".equalsIgnoreCase(localModel.C().app_detail.app_type))
      {
        n++;
        continue;
      }
      if (!"GAME".equalsIgnoreCase(localModel.C().app_detail.app_type))
        break label195;
    }
    label195: for (int i1 = m + 1; ; i1 = m)
    {
      m = i1;
      break;
      if (n == 0)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(m);
        return getString(2131625221, arrayOfObject3);
      }
      if (m == 0)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(n);
        return getString(2131625220, arrayOfObject2);
      }
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(n);
      arrayOfObject1[1] = Integer.valueOf(m);
      return getString(2131624198, arrayOfObject1);
    }
  }

  protected final int a()
  {
    return 2130903345;
  }

  protected final void d_()
  {
  }

  public View getPageView()
  {
    if ((this.k == null) || (this.a == null))
      return null;
    Fragment localFragment = this.k.e(this.a.getCurrentItem());
    if ((localFragment instanceof BaseFragment))
      return ((BaseFragment)localFragment).getPageView();
    return null;
  }

  public void onDestroy()
  {
    super.onDestroy();
    ((c)i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(b paramb)
  {
    if (this.g == null)
      this.g = new HashSet();
    if (paramb.a)
      this.g.add(paramb.b);
    while (true)
    {
      c();
      return;
      this.g.remove(paramb.b);
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h = 0;
    this.a = ((CustomViewPager)paramView.findViewById(2131493142));
    this.b = ((TextView)paramView.findViewById(2131493409));
    this.c = ((StatefulButton)paramView.findViewById(2131492866));
    this.f = ((PageDotIndicator)paramView.findViewById(2131493525));
    this.e = paramView.findViewById(2131493727);
    ArrayList localArrayList = getArguments().getParcelableArrayList("model_keys");
    if (CollectionUtils.isEmpty(localArrayList))
      return;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      Parcelable localParcelable = (Parcelable)localIterator.next();
      this.j.add((Model)localParcelable);
    }
    if (this.k == null)
    {
      this.k = new u(getFragmentManager());
      this.a.setAdapter(this.k);
    }
    this.f.setPageCount(this.j.size());
    this.f.setCurrentPage(0);
    this.k.a(this.a);
    this.k.a(this.j);
    if (!CollectionUtils.isEmpty(((Model)this.j.get(0)).w()))
    {
      this.i = ((Image)((Model)this.j.get(0)).w().get(0)).rgbs.intValue();
      this.e.setBackgroundColor(this.i);
    }
    c();
    this.a.setOnPageChangeListener(new p(this));
    ((c)i.k().a("event_bus")).a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.StoryFragment
 * JD-Core Version:    0.6.0
 */