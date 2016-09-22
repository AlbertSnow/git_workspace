package com.wandoujia.base.utils;

import android.telephony.ServiceState;

public class TelephonySignalStrengthUtil
{
  public static final int SIGNAL_STRENGTH_GOOD = 3;
  public static final int SIGNAL_STRENGTH_GREAT = 4;
  public static final int SIGNAL_STRENGTH_MODERATE = 2;
  public static final int SIGNAL_STRENGTH_NONE = 0;
  public static final int SIGNAL_STRENGTH_POOR = 1;
  public static final int SIGNAL_STRENGTH_UNKNOWN = -1;

  public static int getCdmaAsuLevel(int paramInt1, int paramInt2)
  {
    int i = 4;
    int j;
    if (paramInt1 >= -75)
    {
      j = 16;
      if (paramInt2 < -90)
        break label78;
      i = 16;
    }
    while (true)
    {
      if (j >= i)
        break label126;
      return j;
      if (paramInt1 >= -82)
      {
        j = 8;
        break;
      }
      if (paramInt1 >= -90)
      {
        j = i;
        break;
      }
      if (paramInt1 >= -95)
      {
        j = 2;
        break;
      }
      if (paramInt1 >= -100)
      {
        j = 1;
        break;
      }
      j = 99;
      break;
      label78: if (paramInt2 >= -100)
      {
        i = 8;
        continue;
      }
      if (paramInt2 >= -115)
        continue;
      if (paramInt2 >= -130)
      {
        i = 2;
        continue;
      }
      if (paramInt2 >= -150)
      {
        i = 1;
        continue;
      }
      i = 99;
    }
    label126: return i;
  }

  public static int getCdmaLevel(int paramInt1, int paramInt2)
  {
    int i = 4;
    int j;
    if (paramInt1 >= -75)
    {
      j = i;
      if (paramInt2 < -90)
        break label61;
    }
    while (true)
    {
      if (j >= i)
        break label101;
      return j;
      if (paramInt1 >= -85)
      {
        j = 3;
        break;
      }
      if (paramInt1 >= -95)
      {
        j = 2;
        break;
      }
      if (paramInt1 >= -100)
      {
        j = 1;
        break;
      }
      j = 0;
      break;
      label61: if (paramInt2 >= -110)
      {
        i = 3;
        continue;
      }
      if (paramInt2 >= -130)
      {
        i = 2;
        continue;
      }
      if (paramInt2 >= -150)
      {
        i = 1;
        continue;
      }
      i = 0;
    }
    label101: return i;
  }

  public static int getEvdoAsuLevel(int paramInt1, int paramInt2)
  {
    int i = 16;
    int j;
    if (paramInt1 >= -65)
    {
      j = i;
      if (paramInt2 < 7)
        break label75;
    }
    while (true)
    {
      if (j >= i)
        break label122;
      return j;
      if (paramInt1 >= -75)
      {
        j = 8;
        break;
      }
      if (paramInt1 >= -85)
      {
        j = 4;
        break;
      }
      if (paramInt1 >= -95)
      {
        j = 2;
        break;
      }
      if (paramInt1 >= -105)
      {
        j = 1;
        break;
      }
      j = 99;
      break;
      label75: if (paramInt2 >= 6)
      {
        i = 8;
        continue;
      }
      if (paramInt2 >= 5)
      {
        i = 4;
        continue;
      }
      if (paramInt2 >= 3)
      {
        i = 2;
        continue;
      }
      if (paramInt2 > 0)
      {
        i = 1;
        continue;
      }
      i = 99;
    }
    label122: return i;
  }

  public static int getEvdoLevel(int paramInt1, int paramInt2)
  {
    int i = 4;
    int j;
    if (paramInt1 >= -65)
    {
      j = i;
      if (paramInt2 < 7)
        break label61;
    }
    while (true)
    {
      if (j >= i)
        break label95;
      return j;
      if (paramInt1 >= -75)
      {
        j = 3;
        break;
      }
      if (paramInt1 >= -90)
      {
        j = 2;
        break;
      }
      if (paramInt1 >= -105)
      {
        j = 1;
        break;
      }
      j = 0;
      break;
      label61: if (paramInt2 >= 5)
      {
        i = 3;
        continue;
      }
      if (paramInt2 >= 3)
      {
        i = 2;
        continue;
      }
      if (paramInt2 > 0)
      {
        i = 1;
        continue;
      }
      i = 0;
    }
    label95: return i;
  }

  public static int getGsmDbm(int paramInt)
  {
    int i = -1;
    if (paramInt == 99);
    for (int j = i; ; j = paramInt)
    {
      if (j != i)
        i = -113 + paramInt * 2;
      return i;
    }
  }

  public static int getGsmLevel(int paramInt)
  {
    int i = 2;
    if (paramInt == 99)
      i = -1;
    do
    {
      return i;
      if (paramInt <= i)
        return 0;
      if (paramInt >= 12)
        return 4;
      if (paramInt >= 8)
        return 3;
    }
    while (paramInt >= 5);
    return 1;
  }

  public static boolean hasService(ServiceState paramServiceState)
  {
    int i = 0;
    if (paramServiceState != null)
    {
      int j = paramServiceState.getState();
      i = 0;
      switch (j)
      {
      default:
        i = 1;
      case 1:
      case 2:
      case 3:
      }
    }
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.TelephonySignalStrengthUtil
 * JD-Core Version:    0.6.0
 */