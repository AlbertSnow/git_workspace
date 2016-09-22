package com.tencent.open.qzone;

public enum Albums$AlbumSecurity
{
  private final String a;

  static
  {
    privateOnly = new AlbumSecurity("privateOnly", 1, "2");
    friendsOnly = new AlbumSecurity("friendsOnly", 2, "4");
    needQuestion = new AlbumSecurity("needQuestion", 3, "5");
    AlbumSecurity[] arrayOfAlbumSecurity = new AlbumSecurity[4];
    arrayOfAlbumSecurity[0] = publicToAll;
    arrayOfAlbumSecurity[1] = privateOnly;
    arrayOfAlbumSecurity[2] = friendsOnly;
    arrayOfAlbumSecurity[3] = needQuestion;
    b = arrayOfAlbumSecurity;
  }

  private Albums$AlbumSecurity(String paramString)
  {
    this.a = paramString;
  }

  public final String getSecurity()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.qzone.Albums.AlbumSecurity
 * JD-Core Version:    0.6.0
 */