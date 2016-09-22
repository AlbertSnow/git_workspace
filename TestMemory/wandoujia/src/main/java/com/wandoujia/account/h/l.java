package com.wandoujia.account.h;

import java.util.regex.Pattern;

public final class l
{
  private static final boolean[] a;

  static
  {
    Pattern.compile("[\\+]?[0-9.-]+");
    new String[] { "US", "CA", "AS", "AI", "AG", "BS", "BB", "BM", "VG", "KY", "DM", "DO", "GD", "GU", "JM", "PR", "MS", "MP", "KN", "LC", "VC", "TT", "TC", "VI" };
    a = new boolean[] { 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0 };
  }

  public static String a(String paramString)
  {
    String str;
    if (paramString == null)
      str = null;
    label96: label104: label113: label377: label383: 
    do
    {
      return str;
      int i = paramString.length();
      int j = 0;
      int k = 0;
      int m = 0;
      m localm = null;
      char c;
      if (j < i)
      {
        c = paramString.charAt(j);
        localm = null;
      }
      int n;
      StringBuilder localStringBuilder;
      switch (m)
      {
      default:
        if (localm != null)
          break;
        n = 0;
        localStringBuilder = new StringBuilder();
        if (n >= paramString.length())
          break label501;
        int i1 = paramString.charAt(n);
        if ((i1 < 48) || (i1 > 57));
      case 0:
      case 2:
      case 4:
      case 1:
      case 3:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      for (int i2 = 1; ; i2 = 0)
      {
        if (i2 != 0)
          localStringBuilder.append(paramString.charAt(n));
        n++;
        break label113;
        if (c == '+')
          m = 1;
        do
          while (true)
          {
            j++;
            break;
            if (c == '0')
            {
              m = 2;
              continue;
            }
            localm = null;
            if (c == '1')
              break label96;
            if (!a(c))
              continue;
            localm = null;
            break label96;
            if (c == '0')
            {
              m = 3;
              continue;
            }
            if (c == '1')
            {
              m = 4;
              continue;
            }
            if (!a(c))
              continue;
            localm = null;
            break label96;
            if (c == '1')
            {
              m = 5;
              continue;
            }
            if (!a(c))
              continue;
            localm = null;
            break label96;
            int i3;
            if (('0' <= c) && (c <= '9'))
            {
              i3 = c - '0';
              if (i3 <= 0)
                break label414;
              k = i3 + k * 10;
              if (k < 100)
                if ((k <= 0) || (k >= 100) || (a[k] == 0))
                  break label377;
            }
            for (int i4 = 1; ; i4 = 0)
            {
              if (i4 == 0)
                break label383;
              localm = new m(j + 1);
              break;
              i3 = -1;
              break label311;
            }
            if ((m == 1) || (m == 3) || (m == 5))
            {
              m = 6;
              continue;
            }
            m++;
            continue;
            boolean bool = a(c);
            localm = null;
            if (bool)
              break label96;
            continue;
            if (c != '6')
              break label446;
            m = 9;
          }
        while (!a(c));
        localm = null;
        break label96;
        localm = null;
        if (c != '6')
          break label96;
        localm = new m(j + 1);
        break label96;
        n = localm.a;
        break label104;
      }
      str = localStringBuilder.toString();
    }
    while (str.length() <= 11);
    label311: label446: label501: return str.substring(-11 + str.length());
  }

  private static boolean a(char paramChar)
  {
    return ((paramChar >= '0') && (paramChar <= '9')) || (paramChar == '*') || (paramChar == '#') || (paramChar == '+') || (paramChar == 'N');
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.h.l
 * JD-Core Version:    0.6.0
 */