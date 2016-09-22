package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class GameLauncherPackage$Builder extends Message.Builder<GameLauncherPackage>
{
  public Integer game_count;

  public GameLauncherPackage$Builder()
  {
  }

  public GameLauncherPackage$Builder(GameLauncherPackage paramGameLauncherPackage)
  {
    super(paramGameLauncherPackage);
    if (paramGameLauncherPackage == null)
      return;
    this.game_count = paramGameLauncherPackage.game_count;
  }

  public final GameLauncherPackage build()
  {
    return new GameLauncherPackage(this, null);
  }

  public final Builder game_count(Integer paramInteger)
  {
    this.game_count = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.GameLauncherPackage.Builder
 * JD-Core Version:    0.6.0
 */