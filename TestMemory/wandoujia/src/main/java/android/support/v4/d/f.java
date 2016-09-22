package android.support.v4.d;

import java.util.Locale;

public final class f
{
  private static Locale a = new Locale("", "");
  private static String b = "Arab";
  private static String c = "Hebr";

  public static int a(Locale paramLocale)
  {
    int i = 1;
    if ((paramLocale != null) && (!paramLocale.equals(a)))
    {
      String str = a.a(a.b(paramLocale.toString()));
      if (str == null)
        switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
        {
        default:
          i = 0;
        case 1:
        case 2:
        }
      do
        return i;
      while ((str.equalsIgnoreCase(b)) || (str.equalsIgnoreCase(c)));
    }
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.d.f
 * JD-Core Version:    0.6.0
 */