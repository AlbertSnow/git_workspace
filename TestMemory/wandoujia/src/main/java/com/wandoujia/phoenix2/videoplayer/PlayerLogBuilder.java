package com.wandoujia.phoenix2.videoplayer;

import java.util.HashMap;
import java.util.Map;

public final class PlayerLogBuilder
{
  private Map<String, String> a = new HashMap();

  public PlayerLogBuilder()
  {
    this.a.put("scene", "player");
  }

  public final PlayerLogBuilder a(int paramInt)
  {
    this.a.put("currentProgress", String.valueOf(paramInt));
    return this;
  }

  public final PlayerLogBuilder a(long paramLong)
  {
    this.a.put("initTimeDuration", String.valueOf(paramLong));
    return this;
  }

  public final PlayerLogBuilder a(PlayerLogBuilder.Action paramAction)
  {
    this.a.put("action", paramAction.name().toLowerCase());
    return this;
  }

  public final PlayerLogBuilder a(String paramString)
  {
    this.a.put("message", paramString);
    return this;
  }

  public final PlayerLogBuilder b(long paramLong)
  {
    this.a.put("currentSnippetDuration", String.valueOf(paramLong));
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.PlayerLogBuilder
 * JD-Core Version:    0.6.0
 */