package com.wandoujia.p4.search.utils;

import android.content.Context;
import com.wandoujia.p4.a;

public enum SearchConst$MusicContentType
{
  private final String title;
  private final String typeName;

  static
  {
    ALBUM = new MusicContentType("ALBUM", 1, "album", a.a().getString(2131624182));
    SINGER = new MusicContentType("SINGER", 2, "singer", a.a().getString(2131625424));
    PLAYLIST = new MusicContentType("PLAYLIST", 3, "playlist", a.a().getString(2131625277));
    MIX = new MusicContentType("MIX", 4, "mix", a.a().getString(2131625597));
    MusicContentType[] arrayOfMusicContentType = new MusicContentType[5];
    arrayOfMusicContentType[0] = SONG;
    arrayOfMusicContentType[1] = ALBUM;
    arrayOfMusicContentType[2] = SINGER;
    arrayOfMusicContentType[3] = PLAYLIST;
    arrayOfMusicContentType[4] = MIX;
    $VALUES = arrayOfMusicContentType;
  }

  private SearchConst$MusicContentType(String paramString1, String paramString2)
  {
    this.typeName = paramString1;
    this.title = paramString2;
  }

  public static MusicContentType parseFrom(String paramString)
  {
    for (MusicContentType localMusicContentType : values())
      if (localMusicContentType.getTypeName().equalsIgnoreCase(paramString))
        return localMusicContentType;
    return null;
  }

  public final String getTitle()
  {
    return this.title;
  }

  public final String getTypeName()
  {
    return this.typeName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.search.utils.SearchConst.MusicContentType
 * JD-Core Version:    0.6.0
 */