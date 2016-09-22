package com.wandoujia.p4.community.views;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask.Status;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.CircleAsyncImageView;
import java.util.List;

public class CommunityTopicDetailBannerView extends RelativeLayout
{
  private CircleAsyncImageView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private ImageView e;
  private GridView f;
  private GridView g;
  private h h;
  private com.wandoujia.p4.community.c.a i;
  private View j;
  private TextView k;
  private View l;
  private CommunityTopicModel m;
  private volatile boolean n = false;

  public CommunityTopicDetailBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityTopicDetailBannerView a(Context paramContext)
  {
    return (CommunityTopicDetailBannerView)c.a(paramContext, 2130903176);
  }

  private void a()
  {
    if (this.m == null);
    do
    {
      return;
      CommunityUserModel localCommunityUserModel = this.m.getAuthor();
      if ((localCommunityUserModel != null) && (this.a.getStatus() != AsyncTask.Status.FINISHED))
        this.a.a(localCommunityUserModel.getAvatar(), 2130837513);
      List localList = this.m.getPictures();
      if ((localList == null) || (localList.isEmpty()))
      {
        this.f.setVisibility(8);
        return;
      }
      if (this.h == null)
      {
        this.h = new h(this, 0);
        this.h.a(localList);
        this.f.setAdapter(this.h);
      }
      if (this.n)
        continue;
      this.h.notifyDataSetChanged();
      this.n = true;
    }
    while (this.i == null);
    this.i.notifyDataSetChanged();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.h = null;
    a();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((CircleAsyncImageView)findViewById(2131492903));
    this.b = ((TextView)findViewById(2131492873));
    this.c = ((TextView)findViewById(2131493428));
    this.d = ((TextView)findViewById(2131493429));
    this.f = ((GridView)findViewById(2131493430));
    this.e = ((ImageView)findViewById(2131493433));
    this.g = ((GridView)findViewById(2131493434));
    this.j = findViewById(2131493431);
    this.k = ((TextView)findViewById(2131493427));
    this.l = findViewById(2131493425);
  }

  public void setLikedUser(CommunityTopicLikedUsersInfo paramCommunityTopicLikedUsersInfo)
  {
    if ((paramCommunityTopicLikedUsersInfo == null) || (paramCommunityTopicLikedUsersInfo.items.isEmpty()))
    {
      this.j.setVisibility(8);
      return;
    }
    this.e.setVisibility(0);
    this.j.setVisibility(0);
    if (SystemUtil.getMetricsSize(((Activity)getContext()).getWindowManager()) <= 240)
    {
      this.i = new com.wandoujia.p4.community.c.a(8, paramCommunityTopicLikedUsersInfo);
      this.g.setNumColumns(8);
    }
    while (true)
    {
      this.g.setAdapter(this.i);
      return;
      this.i = new com.wandoujia.p4.community.c.a(9, paramCommunityTopicLikedUsersInfo);
      this.g.setNumColumns(9);
    }
  }

  public void setTopicModel(CommunityTopicModel paramCommunityTopicModel)
  {
    this.m = paramCommunityTopicModel;
    CommunityUserModel localCommunityUserModel = this.m.getAuthor();
    if (localCommunityUserModel != null)
    {
      this.b.setText(localCommunityUserModel.getNick());
      if (!localCommunityUserModel.isAdmin())
        break label172;
      this.k.setVisibility(0);
      this.k.setText(2131624529);
    }
    while (true)
    {
      if (this.m.getGroup() != null)
      {
        TextView localTextView = (TextView)this.l.findViewById(2131493426);
        Context localContext = com.wandoujia.p4.a.a();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.m.getGroup().getTitle();
        localTextView.setText(localContext.getString(2131624538, arrayOfObject));
        this.l.setVisibility(0);
        this.l.setOnClickListener(new g(this));
      }
      this.c.setText(b.a(this.m.getCreatedTime()));
      this.d.setText(this.m.getMessage());
      a();
      return;
      label172: if (localCommunityUserModel.isOwner())
      {
        this.k.setVisibility(0);
        this.k.setText(2131624530);
        continue;
      }
      this.k.setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityTopicDetailBannerView
 * JD-Core Version:    0.6.0
 */