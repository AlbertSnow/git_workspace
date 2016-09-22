package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.b.ac;
import com.wandoujia.p4.community.b.ao;
import com.wandoujia.p4.community.b.ap;
import com.wandoujia.p4.community.b.s;
import com.wandoujia.p4.community.b.w;
import com.wandoujia.p4.community.b.x;
import com.wandoujia.p4.community.card.b.j;
import com.wandoujia.p4.community.card.view.LoadPreHeaderView;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.http.b.g;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityNotificationModel;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.views.CommunityTopicDetailBannerView;
import com.wandoujia.p4.views.ContentListView;
import com.wandoujia.p4.views.FetchMoreFooterView;
import java.util.List;

public class CommunityTopicDetailFragment extends CommunityNetworkListAsyncloadFragment<j>
{
  private View c;
  private StatefulButton d;
  private StatefulButton e;
  private LoadPreHeaderView f;
  private CommunityTopicDetailBannerView g;
  private al h;
  private com.wandoujia.p4.community.card.a.h i;
  private com.wandoujia.p4.community.http.b.h j;
  private g k;
  private CommunityTopicModel l;
  private CommunityNotificationModel m;
  private String n;
  private String o = null;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;
  private final w s = new af(this);

  private void a(boolean paramBoolean)
  {
    String str1 = com.wandoujia.p4.a.a().getString(2131624472);
    String str2 = com.wandoujia.p4.a.a().getString(2131624473);
    StringBuilder localStringBuilder = new StringBuilder("  ");
    SpannableString localSpannableString;
    Context localContext;
    if (paramBoolean)
    {
      localSpannableString = new SpannableString(str2);
      localContext = com.wandoujia.p4.a.a();
      if (!paramBoolean)
        break label102;
    }
    label102: for (int i1 = 2130838134; ; i1 = 2130838133)
    {
      localSpannableString.setSpan(new ImageSpan(localContext, i1, 1), 0, 1, 33);
      this.d.setText(localSpannableString);
      return;
      str2 = str1;
      break;
    }
  }

  private void r()
  {
    if (this.l == null);
    do
    {
      return;
      this.g.setTopicModel(this.l);
      this.d.setState(new com.wandoujia.p4.button.a.a(2130772011, 2131624472, new ai(this)));
      this.e.setState(new com.wandoujia.p4.button.a.a(2130772011, 2131624782, new aj(this)));
      a(this.l.isCurUserLiked());
    }
    while ((this.l == null) || (!com.wandoujia.account.a.z()) || (getView() == null));
    Toolbar localToolbar = (Toolbar)getView().findViewById(2131493121).findViewById(2131492999);
    if (localToolbar.getMenu() != null)
      localToolbar.getMenu().clear();
    localToolbar.inflateMenu(2131755010);
    Menu localMenu = localToolbar.getMenu();
    localMenu.findItem(2131494109).setVisible(this.l.currentUserCanDelete());
    localMenu.findItem(2131494112).setVisible(this.l.currentUserCanAddBlackUser());
    MenuItem localMenuItem1 = localMenu.findItem(2131494111).setVisible(this.l.currentUserCanFeature());
    int i1;
    MenuItem localMenuItem2;
    if (this.l.isFeatured())
    {
      i1 = 2131624449;
      localMenuItem1.setTitle(i1);
      localMenuItem2 = localMenu.findItem(2131494110).setVisible(this.l.currentUserCanStick());
      if (!this.l.isSticky())
        break label304;
    }
    label304: for (int i2 = 2131624546; ; i2 = 2131624542)
    {
      localMenuItem2.setTitle(i2);
      localToolbar.setOnMenuItemClickListener$486aeec7(new ah(this));
      return;
      i1 = 2131624448;
      break;
    }
  }

  protected final com.wandoujia.p4.c.a<j> a()
  {
    if (this.p)
    {
      if (this.k == null)
      {
        this.k = new g(this.n);
        this.k.a(this.m.getComment().getId());
      }
      return new o(this.k, new com.wandoujia.p4.community.card.b.a.b());
    }
    if (this.j == null)
      this.j = new com.wandoujia.p4.community.http.b.h(this.n);
    return new o(this.j, new com.wandoujia.p4.community.card.b.a.b());
  }

  protected final void a(int paramInt1, int paramInt2, k<j> paramk)
  {
    super.a(paramInt1, paramInt2, paramk);
    if ((this.p) && (this.h.getCount() != 0))
    {
      if (paramInt1 == 0)
        m().setSelection(1);
      j localj1 = (j)this.h.b().get(-1 + this.h.getCount());
      if (localj1 != null)
        this.k.a(localj1.b().getId());
      j localj2 = (j)this.h.b().get(0);
      if ((this.f != null) && (localj2 != null) && (localj2.b() != null) && (localj2.b().getSequence() == 1))
        this.f.a();
    }
  }

  protected final com.wandoujia.p4.adapter.h<j> b()
  {
    this.h = new al(this, 0);
    return this.h;
  }

  protected final void c()
  {
    n().setVisibility(8);
    this.c = com.wandoujia.p4.utils.c.a(JupiterApplication.e(), 2130903204);
    ((TextView)this.c.findViewById(2131492997)).setText(2131624437);
    l().a(this.c);
  }

  public final void g()
  {
    android.support.v4.app.b.a(new an(this, 0), new Void[0]);
    if ((l() != null) && (this.c != null))
      l().c(this.c);
    if (this.p)
    {
      if (this.f != null)
        this.f.a();
      this.p = false;
      j();
    }
    super.g();
  }

  protected int getLayoutResId()
  {
    return 2130903177;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    android.support.v4.app.b.O().a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.l = ((CommunityTopicModel)localBundle.getSerializable("topic_model"));
      this.m = ((CommunityNotificationModel)localBundle.getSerializable("notification_model"));
      this.r = localBundle.getBoolean("need_back_to_group");
      if (this.l == null)
        break label126;
      this.n = this.l.getId();
    }
    while (true)
    {
      if ((this.l == null) && (TextUtils.isEmpty(this.n)) && (getActivity() != null))
        getActivity().finish();
      new s(this.n, this.s).execute();
      setHasOptionsMenu(true);
      return;
      label126: if (this.m != null)
      {
        this.p = true;
        this.n = this.m.getTopicId();
        continue;
      }
      this.n = localBundle.getString("topic_model_id");
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.j != null)
      this.j.d();
    if (this.k != null)
      this.k.d();
  }

  public void onDetach()
  {
    super.onDetach();
    android.support.v4.app.b.O().c(this);
    if ((this.r) && (this.l != null) && (this.l.getGroup() != null) && (getActivity() != null))
      new ao(this.l.getGroup().getId(), getActivity()).execute();
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if (!isAdded());
    label196: 
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              switch (ak.a[paramCommunityEvent.a.ordinal()])
              {
              default:
                return;
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              }
            }
            while (!paramCommunityEvent.b);
            if (this.i != null)
              this.i.a("GROUP_MEMBER");
            if ((this.l == null) || (this.l.getGroup() == null))
              continue;
            this.l.getGroup().setCurUserRole("GROUP_MEMBER");
          }
          while (!"reply".equals(this.o));
          new ap(getActivity(), this.l).execute();
          return;
        }
        while (!paramCommunityEvent.b);
        g();
        return;
      }
      while (!paramCommunityEvent.b);
      getActivity().finish();
      return;
      boolean bool = ((Boolean)paramCommunityEvent.c).booleanValue();
      int i1;
      CommunityTopicModel localCommunityTopicModel;
      int i2;
      if (paramCommunityEvent.b)
      {
        i1 = 2131624518;
        if (paramCommunityEvent.b)
        {
          this.l.setCurUserLiked(bool);
          localCommunityTopicModel = this.l;
          i2 = this.l.getLikesCount();
          if (!bool)
            break label290;
        }
      }
      for (int i3 = 1; ; i3 = -1)
      {
        localCommunityTopicModel.setLikesCount(i3 + i2);
        new s(this.n, this.s).execute();
        a(bool);
        if (!bool)
          break;
        Toast.makeText(getActivity(), i1, 1).show();
        return;
        i1 = 2131624517;
        break label196;
      }
      if (!"like".equals(this.o))
        continue;
      new ac(getActivity(), this.l).execute();
      return;
    }
    while ((!"reply".equals(this.o)) || (this.l == null));
    label290: new x(this.l.getGroup().getId(), getActivity()).execute();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    this.d = ((StatefulButton)paramView.findViewById(2131493436));
    this.e = ((StatefulButton)paramView.findViewById(2131493437));
    this.g = CommunityTopicDetailBannerView.a(getActivity());
    l().a(this.g);
    if (this.p)
    {
      this.f = LoadPreHeaderView.a(getActivity());
      this.f.setOnClickListener(new ag(this));
      l().a(this.f);
    }
  }

  protected void onPrepareLoading()
  {
    super.onPrepareLoading();
    if (this.l != null)
    {
      r();
      return;
    }
    android.support.v4.app.b.a(new an(this, 0), new Void[0]);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131624539));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityTopicDetailFragment
 * JD-Core Version:    0.6.0
 */