package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.CircleAsyncImageView;

public class CommunityNotificationCardView extends ContentCardView
{
  private CircleAsyncImageView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private AsyncImageView n;
  private TextView o;

  public CommunityNotificationCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CommunityNotificationCardView a(ViewGroup paramViewGroup)
  {
    return (CommunityNotificationCardView)c.a(paramViewGroup, 2130903205);
  }

  public TextView getActionName()
  {
    return this.k;
  }

  public CircleAsyncImageView getAvatar()
  {
    return this.i;
  }

  public TextView getMessage()
  {
    return this.m;
  }

  public TextView getNickName()
  {
    return this.j;
  }

  public TextView getReference()
  {
    return this.o;
  }

  public AsyncImageView getReplyPic()
  {
    return this.n;
  }

  public TextView getTime()
  {
    return this.l;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((CircleAsyncImageView)findViewById(2131492903));
    this.j = ((TextView)findViewById(2131493494));
    this.k = ((TextView)findViewById(2131493495));
    this.l = ((TextView)findViewById(2131493428));
    this.m = ((TextView)findViewById(2131493429));
    this.n = ((AsyncImageView)findViewById(2131493496));
    this.o = ((TextView)findViewById(2131493497));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.CommunityNotificationCardView
 * JD-Core Version:    0.6.0
 */