package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class aq<T extends ap> extends t
{
  private ar<T> a;

  public aq(w paramw, ar<T> paramar)
  {
    super(paramw);
    this.a = paramar;
  }

  private T a(XmlResourceParser paramXmlResourceParser)
  {
    try
    {
      paramXmlResourceParser.next();
      int i = paramXmlResourceParser.getEventType();
      if (i != 1)
      {
        if (paramXmlResourceParser.getEventType() == 2)
        {
          str1 = paramXmlResourceParser.getName().toLowerCase();
          if (!str1.equals("screenname"))
            break label99;
          String str8 = paramXmlResourceParser.getAttributeValue(null, "name");
          String str9 = paramXmlResourceParser.nextText().trim();
          if (!TextUtils.isEmpty(str8))
            TextUtils.isEmpty(str9);
        }
        while (true)
        {
          i = paramXmlResourceParser.next();
          break;
          label99: if (!str1.equals("string"))
            break label174;
          String str6 = paramXmlResourceParser.getAttributeValue(null, "name");
          String str7 = paramXmlResourceParser.nextText().trim();
          if ((TextUtils.isEmpty(str6)) || (str7 == null))
            continue;
          this.a.a(str6, str7);
        }
      }
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      while (true)
      {
        e("Error parsing tracker configuration file", localXmlPullParserException);
        return this.a.a();
        if (!str1.equals("bool"))
          break;
        String str4 = paramXmlResourceParser.getAttributeValue(null, "name");
        String str5 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str4))
          continue;
        boolean bool2 = TextUtils.isEmpty(str5);
        if (bool2)
          continue;
        try
        {
          boolean bool3 = Boolean.parseBoolean(str5);
          this.a.a(str4, bool3);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          c("Error parsing bool configuration value", str5, localNumberFormatException2);
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        String str1;
        label174: e("Error parsing tracker configuration file", localIOException);
        continue;
        if (!str1.equals("integer"))
          continue;
        String str2 = paramXmlResourceParser.getAttributeValue(null, "name");
        String str3 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str2))
          continue;
        boolean bool1 = TextUtils.isEmpty(str3);
        if (bool1)
          continue;
        try
        {
          int j = Integer.parseInt(str3);
          this.a.a(str2, j);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          c("Error parsing int configuration value", str3, localNumberFormatException1);
        }
      }
    }
  }

  public final T a(int paramInt)
  {
    try
    {
      ap localap = a(i().b().getResources().getXml(paramInt));
      return localap;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      d("inflate() called with unknown resourceId", localNotFoundException);
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.aq
 * JD-Core Version:    0.6.0
 */