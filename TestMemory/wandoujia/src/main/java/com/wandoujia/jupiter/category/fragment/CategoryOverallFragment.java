package com.wandoujia.jupiter.category.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.category.view.CategoryScrollView;
import com.wandoujia.jupiter.category.view.SubCategoryView;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.homepage.splashwindow.k;
import com.wandoujia.jupiter.p;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class CategoryOverallFragment extends BaseFragment
  implements com.wandoujia.jupiter.homepage.a.a, DataLoadListener<Model>
{
  private int a = 0;
  private com.wandoujia.nirvana.framework.network.page.a<Model> b;
  private TextView c;
  private TextView d;
  private SubCategoryView e;
  private SubCategoryView f;
  private CategoryScrollView g;
  private View h;
  private com.wandoujia.jupiter.category.a.a i = new com.wandoujia.jupiter.category.a.a();
  private com.wandoujia.jupiter.category.a.a j = new com.wandoujia.jupiter.category.a.a();
  private com.wandoujia.jupiter.homepage.b k;
  private boolean l = false;

  public CategoryOverallFragment()
  {
    setArguments(ListFragment.b("wdj://categories", "http://apis.wandoujia.com/five/v2/tabs/categories"));
  }

  public final void a(int paramInt)
  {
    this.g.smoothScrollBy(0, paramInt);
  }

  public final void a(com.wandoujia.jupiter.homepage.b paramb)
  {
    this.k = paramb;
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, g paramg)
  {
    if ((this.b.c() != null) && (this.b.c().size() >= 2))
    {
      this.c.setText(((Model)this.b.a(0)).n());
      this.c.setVisibility(0);
      this.d.setText(((Model)this.b.a(1)).n());
      this.d.setVisibility(0);
      this.i.a(((Model)this.b.a(0)).B());
      this.j.a(((Model)this.b.a(1)).B());
      this.i.notifyDataSetChanged();
      this.j.notifyDataSetChanged();
    }
    this.g.post(new e(this));
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }

  public final void a_()
  {
    this.k = null;
  }

  public final int b_()
  {
    return this.a;
  }

  public final View c_()
  {
    return this.g;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    BaseActivity localBaseActivity;
    com.wandoujia.nirvana.framework.network.page.a locala1;
    if (!this.l)
    {
      this.l = true;
      localBaseActivity = (BaseActivity)getActivity();
      if (localBaseActivity != null)
      {
        boolean bool = TextUtils.isEmpty("http://apis.wandoujia.com/five/v2/tabs/categories");
        locala1 = null;
        if (!bool)
          locala1 = ((BaseActivity)getActivity()).findList("http://apis.wandoujia.com/five/v2/tabs/categories");
        if (locala1 != null)
          break label126;
      }
    }
    label126: for (com.wandoujia.nirvana.framework.network.page.a locala2 = localBaseActivity.addList(new p("http://apis.wandoujia.com/five/v2/tabs/categories", new com.wandoujia.jupiter.category.b.b())); ; locala2 = locala1)
    {
      locala2.b(this);
      this.b = locala2;
      locala2.a(this);
      if (CollectionUtils.isEmpty(locala2.c()))
      {
        this.b.i();
        return;
      }
      locala2.f();
      return;
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = android.support.v4.app.b.a(paramViewGroup, 2130903268);
    this.e = ((SubCategoryView)localView.findViewById(2131493608));
    this.f = ((SubCategoryView)localView.findViewById(2131493609));
    this.c = ((TextView)localView.findViewById(2131493606));
    this.d = ((TextView)localView.findViewById(2131493607));
    this.g = ((CategoryScrollView)localView.findViewById(2131493290));
    this.h = localView.findViewById(2131493574);
    if (k.j())
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.h.getLayoutParams();
      localLayoutParams.height = (int)this.h.getResources().getDimension(2131427692);
      this.h.setLayoutParams(localLayoutParams);
    }
    return localView;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    this.b.b(this);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.g.setHomeOnScrollChangeListener(new d(this));
    this.a = 0;
    this.e.setAdapter(this.i);
    this.f.setAdapter(this.j);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.CategoryOverallFragment
 * JD-Core Version:    0.6.0
 */