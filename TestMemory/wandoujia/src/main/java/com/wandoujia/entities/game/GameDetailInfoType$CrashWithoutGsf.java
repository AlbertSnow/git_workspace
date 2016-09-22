package com.wandoujia.entities.game;

public enum GameDetailInfoType$CrashWithoutGsf
{
  private int code;

  static
  {
    CrashWithoutGsf[] arrayOfCrashWithoutGsf = new CrashWithoutGsf[3];
    arrayOfCrashWithoutGsf[0] = CRASH;
    arrayOfCrashWithoutGsf[1] = NOT_CRASH;
    arrayOfCrashWithoutGsf[2] = UNKNOWN;
    $VALUES = arrayOfCrashWithoutGsf;
  }

  private GameDetailInfoType$CrashWithoutGsf(int paramInt)
  {
    this.code = paramInt;
  }

  public final int getCode()
  {
    return this.code;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameDetailInfoType.CrashWithoutGsf
 * JD-Core Version:    0.6.0
 */