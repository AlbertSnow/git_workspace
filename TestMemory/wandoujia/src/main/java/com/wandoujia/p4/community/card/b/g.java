package com.wandoujia.p4.community.card.b;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.a;
import com.wandoujia.p4.community.b.an;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.p4.community.http.model.CommunityNotificationModel;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

public final class g
  implements BaseModel
{
  private CommunityNotificationModel a;

  public g(CommunityNotificationModel paramCommunityNotificationModel)
  {
    this.a = paramCommunityNotificationModel;
  }

  public final Action a(View paramView)
  {
    return new an(this.a, (Activity)paramView.getContext());
  }

  public final String a()
  {
    CommunityReplyModel localCommunityReplyModel = this.a.getComment();
    if ((localCommunityReplyModel != null) && (localCommunityReplyModel.getAuthor() != null))
      return localCommunityReplyModel.getAuthor().getAvatar();
    return "";
  }

  public final CharSequence b()
  {
    CommunityReplyModel localCommunityReplyModel = this.a.getComment();
    if ((localCommunityReplyModel != null) && (localCommunityReplyModel.getAuthor() != null))
      return localCommunityReplyModel.getAuthor().getNick();
    return "";
  }

  public final CharSequence c()
  {
    if (this.a.getCommentType().equals("VOTE"))
      return a.a().getString(2131624404);
    if (this.a.getCommentType().equals("REPLY"))
      return a.a().getString(2131624403);
    return null;
  }

  public final CharSequence d()
  {
    return b.a(this.a.getCreatedTime());
  }

  public final CharSequence e()
  {
    CommunityReplyModel localCommunityReplyModel = this.a.getComment();
    if (localCommunityReplyModel != null)
      return localCommunityReplyModel.getMessage();
    return "";
  }

  public final String f()
  {
    CommunityReplyModel localCommunityReplyModel = this.a.getComment();
    if ((localCommunityReplyModel != null) && (localCommunityReplyModel.getPicture() != null))
      return localCommunityReplyModel.getPicture().url;
    return "";
  }

  public final CharSequence g()
  {
    return this.a.getParentCommentContent();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.g
 * JD-Core Version:    0.6.0
 */