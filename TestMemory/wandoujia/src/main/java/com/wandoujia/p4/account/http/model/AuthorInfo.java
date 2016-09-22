package com.wandoujia.p4.account.http.model;

import java.io.Serializable;

public class AuthorInfo
  implements Serializable
{
  private String avatar;
  private long id;
  private String name;
  private String phoneicon;
  private String phonename;
  private boolean verified;

  public String getAvatar()
  {
    return this.avatar;
  }

  public long getId()
  {
    return this.id;
  }

  public String getName()
  {
    return this.name;
  }

  public String getPhoneicon()
  {
    return this.phoneicon;
  }

  public String getPhonename()
  {
    return this.phonename;
  }

  public boolean isVerified()
  {
    return this.verified;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.http.model.AuthorInfo
 * JD-Core Version:    0.6.0
 */