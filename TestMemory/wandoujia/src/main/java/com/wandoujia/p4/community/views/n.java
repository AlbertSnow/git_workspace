package com.wandoujia.p4.community.views;

import android.content.Context;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.a;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.utils.CommunityImageUtils;
import com.wandoujia.p4.community.utils.CommunityImageUtils.ImageType;
import com.wandoujia.p4.utils.c;

final class n extends at
{
  private final CommunityGroupModel a;

  private n(CommunityGroupModel paramCommunityGroupModel)
  {
    this.a = paramCommunityGroupModel;
  }

  public final int a()
  {
    return 2;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = c.a(paramViewGroup, 2130903201);
    CommunityAttachedReloadImageView localCommunityAttachedReloadImageView = (CommunityAttachedReloadImageView)localView.findViewById(2131492903);
    TextView localTextView1 = (TextView)localView.findViewById(2131493487);
    TextView localTextView2 = (TextView)localView.findViewById(2131493488);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      paramViewGroup.addView(localView);
      return localView;
      localCommunityAttachedReloadImageView.a(CommunityImageUtils.a(this.a.getIcon(), CommunityImageUtils.ImageType.MIDDLE), 2131361864);
      localTextView1.setText(this.a.getSlogan());
      String str = a.a().getString(2131624441);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.a.getTotalTopicCount());
      arrayOfObject[1] = Integer.valueOf(this.a.getMembersCount());
      localTextView2.setText(String.format(str, arrayOfObject));
      localCommunityAttachedReloadImageView.setVisibility(0);
      localTextView2.setVisibility(0);
      continue;
      localTextView1.setText(this.a.getDescription());
      localCommunityAttachedReloadImageView.setVisibility(8);
      localTextView2.setVisibility(8);
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.n
 * JD-Core Version:    0.6.0
 */