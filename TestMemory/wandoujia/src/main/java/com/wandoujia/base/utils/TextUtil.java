package com.wandoujia.base.utils;

import android.content.Context;
import android.support.v4.app.q;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.wandoujia.base.R.string;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public final class TextUtil
{
  private static final l DECIMAL_FORMAT = new l(0);
  private static final long DEFAULT_STORAGE_SIZE_BASE = 1024L;
  private static final String MAGIC_SPLITTER = "#splitter#";
  private static final int MILLIS_OF_SECOND = 1000;
  private static final int SECONDS_OF_HOUR = 3600;
  private static final int SECONDS_OF_MINUTE = 60;
  private static final long WAN = 10000L;

  public static boolean checkEmail(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    return paramString.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
  }

  public static boolean checkEmailOrPhone(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return false;
    while ((!paramString.matches("(\\+86)?1[0-9]{10}")) && (!paramString.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")));
    return true;
  }

  public static boolean checkGlVersion(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    return paramString.matches("[0-9].[0-9]");
  }

  public static String convert2Pinyin(Context paramContext, String paramString)
  {
    return q.a(paramContext, paramString);
  }

  public static String convert2PinyinFirstLetters(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    String str1;
    do
    {
      return null;
      str1 = paramString.trim();
    }
    while (TextUtils.isEmpty(str1));
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = str1.toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (j < i)
    {
      char c = arrayOfChar[j];
      if (isChinese(c))
      {
        String str2 = q.a(paramContext, c);
        if (!TextUtils.isEmpty(str2))
          localStringBuilder.append(str2.substring(0, 1));
      }
      while (true)
      {
        j++;
        break;
        localStringBuilder.append(c);
        continue;
        localStringBuilder.append(c);
      }
    }
    return localStringBuilder.toString().toUpperCase();
  }

  public static String formatDateInfoToDay(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd").format(new Date(paramLong));
  }

  public static String formatDateInfoToMonthDay(long paramLong)
  {
    return new SimpleDateFormat("MM-dd").format(new Date(paramLong));
  }

  public static String formatDateInfoToSecond(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(paramLong));
  }

  public static String formatNumString(long paramLong, Context paramContext)
  {
    if (paramLong > 1000000000000L)
      return ((DecimalFormat)DECIMAL_FORMAT.get()).format((float)paramLong / 1.0E+012F) + paramContext.getString(R.string.num_split_level_base_three);
    if (paramLong > 100000000L)
      return ((DecimalFormat)DECIMAL_FORMAT.get()).format((float)paramLong / 1.0E+008F) + paramContext.getString(R.string.num_split_level_base_two);
    if (paramLong > 10000L)
      return ((DecimalFormat)DECIMAL_FORMAT.get()).format((float)paramLong / 10000.0F) + paramContext.getString(R.string.num_split_level_base_one);
    return String.valueOf(paramLong);
  }

  public static String formatNumString(String paramString, Context paramContext)
  {
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      return paramString;
    }
    int i = Integer.valueOf(paramContext.getString(R.string.num_split_level_base)).intValue();
    int j = paramString.length();
    int k = j % i;
    int m;
    if (j <= 1)
    {
      m = j / i;
      if (k != 0)
        break label254;
    }
    while (true)
    {
      String str2;
      String str1;
      if (m != 0)
      {
        str2 = String.valueOf(paramString.charAt(i));
        if ("0".equals(str2))
          str1 = "";
      }
      while (true)
        switch (m)
        {
        case 0:
        default:
          return paramString;
        case 1:
          return paramString.substring(0, i) + str1 + paramContext.getString(R.string.num_split_level_base_one);
          j--;
          break;
          str1 = "." + str2;
          break;
        case 2:
          return paramString.substring(0, i) + str1 + paramContext.getString(R.string.num_split_level_base_two);
        case 3:
          return paramString.substring(0, i) + str1 + paramContext.getString(R.string.num_split_level_base_three);
          str1 = "";
        }
      label254: i = k;
    }
  }

  public static String formatSizeInfo(double paramDouble)
  {
    return formatSizeInfo(paramDouble, (DecimalFormat)DECIMAL_FORMAT.get());
  }

  public static String formatSizeInfo(double paramDouble, DecimalFormat paramDecimalFormat)
  {
    return formatSizeInfo(paramDouble, paramDecimalFormat, 1024L);
  }

  public static String formatSizeInfo(double paramDouble, DecimalFormat paramDecimalFormat, long paramLong)
  {
    if (paramLong == 0L)
      paramLong = 1024L;
    long l1 = paramLong * paramLong;
    long l2 = paramLong * (paramLong * paramLong);
    if (paramDecimalFormat == null);
    StringBuilder localStringBuilder;
    for (DecimalFormat localDecimalFormat = (DecimalFormat)DECIMAL_FORMAT.get(); ; localDecimalFormat = paramDecimalFormat)
    {
      localStringBuilder = new StringBuilder();
      if (paramDouble > 0.0D)
        break;
      localStringBuilder.append("0KB");
      return localStringBuilder.toString();
    }
    if (paramDouble > l2)
    {
      localStringBuilder.append(localDecimalFormat.format(paramDouble / l2)).append("GB");
      return localStringBuilder.toString();
    }
    if (paramDouble > l1)
    {
      localStringBuilder.append(localDecimalFormat.format(paramDouble / l1)).append("MB");
      return localStringBuilder.toString();
    }
    if (paramDouble > paramLong)
      localStringBuilder.append(localDecimalFormat.format(paramDouble / paramLong)).append("KB");
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append((int)paramDouble).append("B");
    }
  }

  public static String formatTimeInfo(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramLong >= 3600000L)
    {
      long l3 = paramLong / 3600000L;
      if (l3 < 10L)
        localStringBuilder.append('0');
      localStringBuilder.append(l3).append(':');
    }
    if (paramLong >= 60000L)
    {
      long l2 = paramLong % 3600000L / 60000L;
      if (l2 < 10L)
        localStringBuilder.append('0');
      localStringBuilder.append(l2).append(':');
    }
    while (true)
    {
      if (paramLong >= 0L)
      {
        long l1 = paramLong % 3600000L % 60000L / 1000L;
        if (l1 < 10L)
          localStringBuilder.append('0');
        localStringBuilder.append(l1);
      }
      return localStringBuilder.toString();
      localStringBuilder.append("00:");
    }
  }

  public static String formatTimeInfoWithHour(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    long l1 = paramLong / 3600000L;
    if (l1 < 10L)
      localStringBuilder.append('0');
    localStringBuilder.append(l1).append(':');
    long l2 = paramLong % 3600000L / 60000L;
    if (l2 < 10L)
      localStringBuilder.append('0');
    localStringBuilder.append(l2).append(':');
    long l3 = paramLong % 3600000L % 60000L / 1000L;
    if (l3 < 10L)
      localStringBuilder.append('0');
    localStringBuilder.append(l3);
    return localStringBuilder.toString();
  }

  public static CharSequence fromHtml(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return "";
    return Html.fromHtml(paramString);
  }

  public static List<Spanned> fromHtml(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        localArrayList.add(Html.fromHtml((String)localIterator.next()));
    }
    return localArrayList;
  }

  public static String generateArrayInfo(Context paramContext, List<String> paramList, int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > paramList.size()))
      paramInt = paramList.size();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if (i < paramInt)
    {
      localStringBuilder.append((String)paramList.get(i));
      if (i != paramInt - 1)
        localStringBuilder.append(paramContext.getString(R.string.seperator_mark));
      while (true)
      {
        i++;
        break;
        if (paramInt >= paramList.size())
          continue;
        localStringBuilder.append(paramContext.getString(R.string.and_so_on));
      }
    }
    return localStringBuilder.toString();
  }

  public static String getAppNameFromAppNamePair(String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString)));
    String[] arrayOfString;
    do
    {
      return null;
      arrayOfString = paramString.split("#splitter#");
    }
    while ((arrayOfString == null) || (arrayOfString.length < 2));
    return arrayOfString[1];
  }

  public static String getPakageNameFromAppNamePair(String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString)));
    int i;
    do
    {
      return null;
      i = paramString.indexOf("#splitter#");
    }
    while (i <= 0);
    return paramString.substring(0, i);
  }

  public static String getRandomNumber()
  {
    return String.valueOf(new Random().nextInt());
  }

  public static boolean isChinese(char paramChar)
  {
    Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(paramChar);
    return (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || (localUnicodeBlock == Character.UnicodeBlock.GENERAL_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
  }

  public static String makeAppNamePair(String paramString1, String paramString2)
  {
    return paramString1 + "#splitter#" + paramString2;
  }

  public static void removeUnderlines(Spannable paramSpannable)
  {
    if (paramSpannable == null);
    while (true)
    {
      return;
      for (URLSpan localURLSpan : (URLSpan[])paramSpannable.getSpans(0, paramSpannable.length(), URLSpan.class))
      {
        int k = paramSpannable.getSpanStart(localURLSpan);
        int m = paramSpannable.getSpanEnd(localURLSpan);
        paramSpannable.removeSpan(localURLSpan);
        paramSpannable.setSpan(new TextUtil.URLSpanNoUnderline(localURLSpan.getURL()), k, m, 0);
      }
    }
  }

  public static String stringForTime(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Formatter localFormatter = new Formatter(localStringBuilder, Locale.getDefault());
    long l1 = paramLong / 1000L;
    long l2 = l1 % 60L;
    long l3 = l1 / 60L % 60L;
    long l4 = l1 / 3600L;
    localStringBuilder.setLength(0);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(l4);
    arrayOfObject[1] = Long.valueOf(l3);
    arrayOfObject[2] = Long.valueOf(l2);
    return localFormatter.format("%d:%02d:%02d", arrayOfObject).toString();
  }

  public static String stringForTimeInMinutes(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Formatter localFormatter = new Formatter(localStringBuilder, Locale.getDefault());
    long l1 = paramLong / 1000L;
    long l2 = l1 % 60L;
    long l3 = l1 / 60L % 60L;
    localStringBuilder.setLength(0);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(l3);
    arrayOfObject[1] = Long.valueOf(l2);
    return localFormatter.format("%02d:%02d", arrayOfObject).toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.TextUtil
 * JD-Core Version:    0.6.0
 */