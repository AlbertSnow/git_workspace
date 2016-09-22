package com.wandoujia.p4.app.detail.model;

import android.text.TextUtils;
import com.wandoujia.mvc.BaseModel;

public final class a
  implements BaseModel
{
  a(CommentJson paramCommentJson)
  {
  }

  public final String a()
  {
    return this.a.getAvatar();
  }

  public final String b()
  {
    return this.a.getAuthorName();
  }

  public final String c()
  {
    return this.a.getDate();
  }

  public final String d()
  {
    String str = this.a.getContent();
    if (!TextUtils.isEmpty(str))
      str = str.replaceAll("<br />", " ");
    return str;
  }

  public final Boolean e()
  {
    return this.a.getEnjoy();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.model.a
 * JD-Core Version:    0.6.0
 */