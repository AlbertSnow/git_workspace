package com.wandoujia.p4.community.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;
import com.wandoujia.p4.community.http.model.CommunityUserModel;
import com.wandoujia.p4.community.views.CommunityAttachedReloadCircleImageView;
import com.wandoujia.p4.views.CircleAsyncImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a extends BaseAdapter
{
  private boolean a = true;
  private int b;
  private List<CommunityUserModel> c;
  private CommunityTopicLikedUsersInfo d;
  private List<c> e = new ArrayList();

  public a(int paramInt, CommunityTopicLikedUsersInfo paramCommunityTopicLikedUsersInfo)
  {
    this.b = paramInt;
    this.c = paramCommunityTopicLikedUsersInfo.items;
    this.d = paramCommunityTopicLikedUsersInfo;
    a();
  }

  private void a()
  {
    int i = 1;
    this.a = i;
    this.e.clear();
    int j;
    if (this.c.size() > this.b)
      j = i;
    for (int k = 0; ; k++)
    {
      List localList;
      if (k < this.c.size())
      {
        if (k != -1 + this.b)
          break label114;
        localList = this.e;
        if (j == 0)
          break label109;
      }
      while (true)
      {
        localList.add(new c(i, (CommunityUserModel)this.c.get(k), 0));
        notifyDataSetChanged();
        return;
        j = 0;
        break;
        label109: i = 0;
      }
      label114: this.e.add(new c(0, (CommunityUserModel)this.c.get(k), 0));
    }
  }

  private c b(int paramInt)
  {
    return (c)this.e.get(paramInt);
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
    notifyDataSetChanged();
    a();
  }

  public final void a(CommunityTopicLikedUsersInfo paramCommunityTopicLikedUsersInfo)
  {
    this.d = paramCommunityTopicLikedUsersInfo;
    if (paramCommunityTopicLikedUsersInfo != null)
      this.c = paramCommunityTopicLikedUsersInfo.items;
    notifyDataSetChanged();
    a();
  }

  public final int getCount()
  {
    return this.e.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    return b(paramInt).a;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    d locald1;
    if (paramView == null)
    {
      paramView = com.wandoujia.p4.utils.c.a(paramViewGroup, 2130903192);
      CommunityAttachedReloadCircleImageView localCommunityAttachedReloadCircleImageView = (CommunityAttachedReloadCircleImageView)paramView.findViewById(2131493463);
      localCommunityAttachedReloadCircleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      TextView localTextView = (TextView)paramView.findViewById(2131493464);
      d locald2 = new d(0);
      locald2.b = localTextView;
      locald2.a = localCommunityAttachedReloadCircleImageView;
      paramView.setTag(locald2);
      locald1 = locald2;
      switch (i)
      {
      default:
      case 0:
      case 1:
      }
    }
    while (true)
    {
      paramView.setOnClickListener(new b(this));
      return paramView;
      locald1 = (d)paramView.getTag();
      break;
      locald1.a.a(b(paramInt).b.getAvatar(), 2130837993);
      locald1.b.setVisibility(8);
      continue;
      locald1.b.setText("+" + this.d.totalCount);
      locald1.b.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      localHashSet.add(Integer.valueOf(((c)localIterator.next()).a));
    return localHashSet.size();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.c.a
 * JD-Core Version:    0.6.0
 */