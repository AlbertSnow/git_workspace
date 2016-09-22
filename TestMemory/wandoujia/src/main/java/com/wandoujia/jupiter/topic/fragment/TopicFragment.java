package com.wandoujia.jupiter.topic.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.cc;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.a.c;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.topic.e;
import com.wandoujia.jupiter.topic.view.TopicHeaderView;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import java.util.List;

public class TopicFragment extends ListFragment
{
  private TopicHeaderView b;
  private AsyncImageView c;
  private View m;
  private TextView n;
  private boolean o = false;
  private String p;
  private String q;
  private e r;
  private com.wandoujia.jupiter.topic.a s;
  private ViewGroup t;
  private com.wandoujia.nirvana.framework.ui.a u;

  public static TopicFragment a(String paramString1, String paramString2, String paramString3)
  {
    TopicFragment localTopicFragment = new TopicFragment();
    Bundle localBundle = BaseListFragment.a(paramString1, null, null);
    localBundle.putString("alias_argument", paramString2);
    localBundle.putString("type_argument", paramString3);
    localTopicFragment.setArguments(localBundle);
    return localTopicFragment;
  }

  public static TopicFragment a(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    TopicFragment localTopicFragment = new TopicFragment();
    Bundle localBundle = BaseListFragment.a(paramString1, null, null);
    localBundle.putString("alias_argument", paramString2);
    localBundle.putString("type_argument", paramString3);
    localBundle.putAll(paramBundle);
    localTopicFragment.setArguments(localBundle);
    return localTopicFragment;
  }

  private static boolean b(Model paramModel)
  {
    return (!CollectionUtils.isEmpty(paramModel.w())) && (paramModel.w().get(0) != null) && (!TextUtils.isEmpty(((Image)paramModel.w().get(0)).url));
  }

  protected final int a()
  {
    return 2130903410;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    if ("FOLLOW".equals(this.q.toUpperCase()));
    for (String str = "http://apis.wandoujia.com/five/v1/follow/topics/%s"; ; str = "http://apis.wandoujia.com/apps/v1/topics/%s/list?format=proto")
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.p;
      this.j = new p(String.format(str, arrayOfObject));
      return this.j;
    }
  }

  protected final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.p = getArguments().getString("alias_argument");
    this.q = getArguments().getString("type_argument");
    if (!TextUtils.isEmpty(this.q));
    try
    {
      if ("APPS".equals(this.q.toUpperCase()))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.p;
        this.s = new com.wandoujia.jupiter.topic.a("http://apis.wandoujia.com/games/v1/topics/%s?format=proto", String.format("http://apis.wandoujia.com/apps/v1/recommended/topics?currentAlias=%s", arrayOfObject2));
      }
      while (true)
      {
        label94: if (this.s == null)
          getActivity().finish();
        this.toolbar.setBackgroundColor(getResources().getColor(2131362159));
        this.toolbarDeco.setBackgroundColor(getResources().getColor(2131362159));
        this.toolbarMargin.setBackgroundColor(getResources().getColor(2131362159));
        this.toolbar.setTitleTextColor(getResources().getColor(2131362232));
        this.toolbar.setTitle("");
        this.toolbar.setNavigationIcon(getResources().getDrawable(2130838841));
        this.toolbar.getMenu().getItem(0).setIcon(getResources().getDrawable(2130838210));
        this.toolbar.getMenu().getItem(1).setIcon(getResources().getDrawable(2130838204));
        this.c = ((AsyncImageView)paramView.findViewById(2131492889));
        this.m = paramView.findViewById(2131493760);
        this.n = ((TextView)paramView.findViewById(2131492998));
        this.h.setEnabled(false);
        this.b = ((TopicHeaderView)android.support.v4.app.b.b(getActivity(), 2130903409));
        a locala = new a(this);
        if (this.s != null)
        {
          locala.a(new Model(new Entity.Builder().build()));
          this.l.a(locala);
          this.r = new e(this.b, this.toolbar, this.toolbarMargin, this.n, this.m);
          this.g.a(this.r);
          this.s.a(getArguments(), new d(this, locala));
        }
        return;
        if ("GAMES".equals(this.q.toUpperCase()))
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.p;
          this.s = new com.wandoujia.jupiter.topic.a("http://apis.wandoujia.com/games/v1/topics/%s?format=proto", String.format("http://apis.wandoujia.com/games/v1/recommended/topics?currentAlias=%s", arrayOfObject1));
          continue;
        }
        if (!"FOLLOW".equals(this.q.toUpperCase()))
          continue;
        this.s = new com.wandoujia.jupiter.topic.a("http://apis.wandoujia.com/five/v1/follow/topics/%s/summary", "http://apis.wandoujia.com/five/v1/follow/topics/%s/recommended");
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label94;
    }
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    super.a(paramOp, paramg);
    if ((!this.j.b()) && (!this.o))
    {
      this.o = true;
      if (this.s != null);
    }
    else
    {
      return;
    }
    this.s.b(getArguments(), new b(this));
  }

  protected final cc b()
  {
    return new c(this.a, true);
  }

  public final int c()
  {
    return 0;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (this.s != null)
      this.s.a();
    if (this.u != null)
      this.u.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.fragment.TopicFragment
 * JD-Core Version:    0.6.0
 */