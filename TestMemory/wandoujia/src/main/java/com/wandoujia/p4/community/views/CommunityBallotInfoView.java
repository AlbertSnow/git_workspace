package com.wandoujia.p4.community.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

public class CommunityBallotInfoView extends RelativeLayout
{
  private TextView a;
  private StatefulButton b;
  private AsyncImageView c;
  private TextView d;
  private AsyncImageView e;
  private GridView f;
  private com.wandoujia.p4.community.c.a g;
  private int h;
  private CommunityTopicLikedUsersInfo i;

  public CommunityBallotInfoView(Context paramContext)
  {
    super(paramContext);
  }

  public CommunityBallotInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CommunityBallotInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(CommunityGroupModel paramCommunityGroupModel)
  {
    if (paramCommunityGroupModel == null);
    do
    {
      do
      {
        return;
        if (paramCommunityGroupModel.getAuthor() != null)
          this.e.a(paramCommunityGroupModel.getAuthor().getAvatar(), 2130837513);
        if (paramCommunityGroupModel.getIcon() != null)
          this.c.a(paramCommunityGroupModel.getIcon().url, 2131361864);
        this.a.setText(paramCommunityGroupModel.getTitle());
        TextView localTextView = this.d;
        Context localContext = com.wandoujia.p4.a.a();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramCommunityGroupModel.getBallotCount());
        localTextView.setText(localContext.getString(2131624435, arrayOfObject));
      }
      while (this.b.getVisibility() != 0);
      this.b.setState(new com.wandoujia.p4.button.a.a(2131624431, new b(this, paramCommunityGroupModel), true));
    }
    while (!paramCommunityGroupModel.isCurUserBalloted());
    this.b.setState(new com.wandoujia.p4.button.a.a(2131624432, null, false));
    this.b.setBackgroundResource(2130838379);
  }

  public final void a(CommunityTopicLikedUsersInfo paramCommunityTopicLikedUsersInfo)
  {
    if ((paramCommunityTopicLikedUsersInfo == null) || (CollectionUtils.isEmpty(paramCommunityTopicLikedUsersInfo.items)))
      return;
    this.i = paramCommunityTopicLikedUsersInfo;
    if (this.g == null)
    {
      this.g = new com.wandoujia.p4.community.c.a(this.h, paramCommunityTopicLikedUsersInfo);
      this.f.setAdapter(this.g);
      return;
    }
    this.g.a(this.i);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131493469));
    this.b = ((StatefulButton)findViewById(2131493483));
    this.c = ((AsyncImageView)findViewById(2131493475));
    this.d = ((TextView)findViewById(2131493476));
    this.e = ((AsyncImageView)findViewById(2131493479));
    this.f = ((GridView)findViewById(2131493482));
    int j = (int)com.wandoujia.p4.a.a().getResources().getDimension(2131427874);
    this.f.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, j));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityBallotInfoView
 * JD-Core Version:    0.6.0
 */