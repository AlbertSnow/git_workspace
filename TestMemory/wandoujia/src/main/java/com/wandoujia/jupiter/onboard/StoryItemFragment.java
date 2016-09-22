package com.wandoujia.jupiter.onboard;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.b.b.b;
import com.wandoujia.jupiter.fragment.ListFragment;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import com.wandoujia.ripple_framework.view.e;
import de.greenrobot.event.c;
import java.util.Iterator;
import java.util.List;

public class StoryItemFragment extends ListFragment
{
  private AsyncImageView b;
  private TextView c;
  private Model m;
  private int n;
  private int o;
  private boolean p;

  protected final int a()
  {
    return 2130903346;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    if ((this.m.t() == null) || (TextUtils.isEmpty(this.m.t().url)))
      finish();
    p localp = new p(this.m.t().url);
    if (this.p);
    for (int i = 16; ; i = 6)
    {
      localp.a(com.wandoujia.ripple_framework.d.a.a(com.wandoujia.jupiter.d.a.a(i), com.wandoujia.jupiter.d.a.e()));
      localp.a(false);
      return localp;
    }
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    if (this.n <= this.o)
      e();
  }

  public final void e()
  {
    if (this.j == null);
    while (true)
    {
      return;
      List localList = this.j.c();
      if (localList == null)
        continue;
      s locals = new s();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        if (!aa.a(localModel, locals, false))
          continue;
        ((c)i.k().a("event_bus")).d(new b(localModel, true));
      }
    }
  }

  protected final LinearLayoutManager e_()
  {
    getActivity();
    if (this.p);
    for (int i = 4; ; i = 3)
      return new GridLayoutManager(i);
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new t();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.n = getArguments().getInt("POSITION_ARGUMENT");
    this.o = getArguments().getInt("PAGER_POSITION_ARGUMENT", 0);
    this.m = ((Model)getArguments().getParcelable("MODEL_ARGUMENT"));
    this.p = getArguments().getBoolean("IS_TABLET_ARGUMENT");
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.h.setEnabled(false);
    this.b = ((AsyncImageView)paramView.findViewById(2131493729));
    this.c = ((TextView)paramView.findViewById(2131493730));
    this.c.setText(this.m.n());
    if (!TextUtils.isEmpty(this.m.i()))
    {
      new e();
      e.a(this.b, this.m.i());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.StoryItemFragment
 * JD-Core Version:    0.6.0
 */