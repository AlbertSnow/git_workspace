package com.wandoujia.jupiter.fragment;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.base.utils.ReflectionUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.morph.c;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.jupiter.toolbar.JupiterToolbar;
import com.wandoujia.jupiter.toolbar.i;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import java.util.HashMap;
import java.util.List;

public class ReviewTopicFragment extends ListFragment
{
  private View b;
  private TextView c;
  private TextView m;
  private AsyncImageView n;
  private int o;
  private int p;
  private boolean q = false;
  private boolean r = false;
  private String s;
  private JupiterToolbar t;
  private Model u;

  public static ReviewTopicFragment a(String paramString1, String paramString2)
  {
    ReviewTopicFragment localReviewTopicFragment = new ReviewTopicFragment();
    localReviewTopicFragment.setArguments(BaseListFragment.a(paramString1, paramString2, null));
    return localReviewTopicFragment;
  }

  private void a(int paramInt)
  {
    int i = Color.argb(paramInt, Color.red(this.o), Color.green(this.o), Color.blue(this.o));
    int j = Color.argb(paramInt, Color.red(this.p), Color.green(this.p), Color.blue(this.p));
    if (this.toolbar != null)
      this.toolbar.setBackgroundColor(i);
    if (this.toolbarMargin != null)
      this.toolbarMargin.setBackgroundColor(i);
    if (this.c != null)
      this.c.setTextColor(j);
  }

  protected final int a()
  {
    return 2130903359;
  }

  protected final a<Model> a(String paramString)
  {
    p localp = new p(paramString);
    localp.a(false);
    return localp;
  }

  protected final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.s = "";
    if ((getArguments() != null) && (getArguments().containsKey("page_intent_uri")))
    {
      String str = getArguments().getString("page_intent_uri");
      if (!TextUtils.isEmpty(str))
      {
        Uri localUri = Uri.parse(str);
        if (localUri.getPathSegments().size() > 2)
          this.s = ((String)localUri.getPathSegments().get(2));
      }
    }
    paramView.findViewById(2131493001).setVisibility(8);
    this.h.setSwipeRefreshEnabled(false);
    this.t = ((JupiterToolbar)paramView.findViewById(2131493121));
    this.toolbarDeco = paramView.findViewById(2131493001);
    if (this.toolbar != null)
      this.c = ((TextView)ReflectionUtil.getField(this.toolbar, "mTitleTextView"));
    this.o = getResources().getColor(2131361989);
    this.p = getResources().getColor(2131362219);
    a(0);
    this.h.setEnabled(false);
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    super.a(paramOp, paramg);
    HashMap localHashMap;
    if ((!this.q) && (this.j.c().size() > 0))
    {
      this.q = true;
      this.b = android.support.v4.app.b.b(getActivity(), 2130903360);
      this.m = ((TextView)this.b.findViewById(2131492998));
      this.n = ((AsyncImageView)this.b.findViewById(2131492889));
      bi localbi = new bi(this);
      localbi.a(new Model(new Entity.Builder().build()));
      this.l.a(localbi);
      this.g.a(new bj(this));
      this.u = ((Model)this.j.a(0));
      localHashMap = c.a(this.u);
      if (!localHashMap.containsKey("title"))
        break label376;
    }
    label376: for (String str1 = ((MorphData)localHashMap.get("title")).value; ; str1 = "")
    {
      if (localHashMap.containsKey("cover"));
      for (String str2 = ((MorphData)localHashMap.get("cover")).value; ; str2 = "")
      {
        if (this.m != null)
        {
          this.m.setText(str1);
          setTitle(str1);
        }
        if (this.n != null)
          this.n.a(str2, 0);
        if ((this.t != null) && (this.t.getListener() != null))
        {
          this.t.getListener().a(this.u);
          this.t.getListener().a(ShareUtil.ShareContentType.REVIEW_LIST);
        }
        if ((!this.j.b()) && (!this.r))
        {
          this.r = true;
          bo localbo = new bo(this);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.s;
          new com.wandoujia.ripple_framework.a.b(String.format("http://startpage.wandoujia.com/five/v3/related/reviews/%1$s", arrayOfObject), null, HttpResponse.class, localbo, localbo, 0).u();
        }
        return;
      }
    }
  }

  public final int c()
  {
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ReviewTopicFragment
 * JD-Core Version:    0.6.0
 */