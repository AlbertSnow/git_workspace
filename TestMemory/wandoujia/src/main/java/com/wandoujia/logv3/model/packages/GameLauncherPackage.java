package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class GameLauncherPackage extends Message
{
  public static final Integer DEFAULT_GAME_COUNT = Integer.valueOf(0);

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer game_count;

  private GameLauncherPackage(GameLauncherPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.game_count = paramBuilder.game_count;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof GameLauncherPackage))
      return false;
    return equals(this.game_count, ((GameLauncherPackage)paramObject).game_count);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.game_count != null);
    for (int j = this.game_count.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.GameLauncherPackage
 * JD-Core Version:    0.6.0
 */