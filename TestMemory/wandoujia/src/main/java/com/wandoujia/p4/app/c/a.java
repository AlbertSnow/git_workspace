package com.wandoujia.p4.app.c;

import android.content.Context;
import com.android.volley.n;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.entities.app.IAppLiteInfo;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.entities.app.IAppLiteInfo.ITag;
import com.wandoujia.log.toolkit.LaunchLogger;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.app.view.model.CardViewModelAppImpl.AppType;
import com.wandoujia.p4.card.models.CardViewModel.TagType;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;

public final class a
{
  public long a;
  public String b;
  private String c;
  private long d;
  private long e;
  private long f;
  private Map<String, String> g;

  private a()
  {
  }

  public a(String paramString, LaunchLogger paramLaunchLogger)
  {
    this.b = paramString;
    this.a = paramLaunchLogger.a.length;
    this.c = paramLaunchLogger.b;
    this.d = paramLaunchLogger.c;
    this.e = paramLaunchLogger.d;
    this.f = paramLaunchLogger.e;
    this.g = paramLaunchLogger.f;
  }

  public static final Action a()
  {
    switch (b.b[null.ordinal()])
    {
    case 1:
    case 2:
    default:
      return null;
    case 3:
    }
    a(null, null);
    return new com.wandoujia.p4.app.a.a();
  }

  public static a a(InputStream paramInputStream)
  {
    a locala = new a();
    ObjectInputStream localObjectInputStream = new ObjectInputStream(paramInputStream);
    if (localObjectInputStream.readByte() != 2)
      throw new IOException();
    locala.b = localObjectInputStream.readUTF();
    locala.c = localObjectInputStream.readUTF();
    if (locala.c.equals(""))
      locala.c = null;
    locala.d = localObjectInputStream.readLong();
    locala.e = localObjectInputStream.readLong();
    locala.f = localObjectInputStream.readLong();
    locala.g = a(localObjectInputStream);
    return locala;
  }

  public static final String a(IAppLiteInfo paramIAppLiteInfo, CardViewModel.TagType paramTagType)
  {
    switch (b.b[null.ordinal()])
    {
    case 1:
    default:
    case 2:
    case 3:
    }
    do
    {
      return null;
      if (IAppLiteInfo.AppType.GAME.getAppType().equals(null.getAppType()))
        return com.wandoujia.p4.a.a().getString(2131625595);
      return com.wandoujia.p4.a.a().getString(2131625593);
    }
    while ((null.getTags() == null) || (null.getTags().isEmpty()));
    return ((IAppLiteInfo.ITag)null.getTags().get(0)).getTag();
  }

  private static Map<String, String> a(ObjectInputStream paramObjectInputStream)
  {
    int i = paramObjectInputStream.readInt();
    if (i == 0);
    for (Object localObject = Collections.emptyMap(); ; localObject = new HashMap(i))
      for (int j = 0; j < i; j++)
        ((Map)localObject).put(paramObjectInputStream.readUTF().intern(), paramObjectInputStream.readUTF().intern());
    return (Map<String, String>)localObject;
  }

  private static void a(Map<String, String> paramMap, ObjectOutputStream paramObjectOutputStream)
  {
    if (paramMap != null)
    {
      paramObjectOutputStream.writeInt(paramMap.size());
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramObjectOutputStream.writeUTF((String)localEntry.getKey());
        paramObjectOutputStream.writeUTF((String)localEntry.getValue());
      }
    }
    paramObjectOutputStream.writeInt(0);
  }

  public static final CharSequence b()
  {
    StringBuilder localStringBuilder;
    switch (b.a[null.ordinal()])
    {
    default:
      localStringBuilder = new StringBuilder();
      if ((CardViewModelAppImpl.AppType.SEARCH == null) && (null.getAppLiteLikesRate() > 0))
      {
        String str4 = String.valueOf(null.getAppLiteLikesRate()) + "%";
        localStringBuilder.append(String.format(com.wandoujia.p4.a.a().getString(2131624294), new Object[] { str4 })).append("  ");
      }
      if (CardViewModelAppImpl.AppType.RANKING != null)
        break;
      String str3 = com.wandoujia.p4.a.a().getString(2131624637);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = null.getAppLiteWeeklyDownloadCountStr();
      localStringBuilder.append(String.format(str3, arrayOfObject3));
    case 1:
    }
    while (true)
    {
      localStringBuilder.append("  ");
      localStringBuilder.append(TextUtil.formatSizeInfo(null.getAppLiteSize()));
      if ((null.getExtensionPacks() != null) && (!null.getExtensionPacks().isEmpty()))
        localStringBuilder.append("+").append(com.wandoujia.p4.a.a().getString(2131624588));
      return localStringBuilder.toString();
      String str1 = com.wandoujia.p4.a.a().getString(2131624802);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = TextUtil.formatSizeInfo(null.getAppLiteSize());
      return String.format(str1, arrayOfObject1);
      String str2 = com.wandoujia.p4.a.a().getString(2131624636);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = null.getAppLiteDownloadCountStr();
      localStringBuilder.append(String.format(str2, arrayOfObject2));
    }
  }

  public final LaunchLogger a(byte[] paramArrayOfByte)
  {
    LaunchLogger localLaunchLogger = new LaunchLogger();
    localLaunchLogger.a = paramArrayOfByte;
    localLaunchLogger.b = this.c;
    localLaunchLogger.c = this.d;
    localLaunchLogger.d = this.e;
    localLaunchLogger.e = this.f;
    localLaunchLogger.f = this.g;
    return localLaunchLogger;
  }

  public final boolean a(OutputStream paramOutputStream)
  {
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(paramOutputStream);
      localObjectOutputStream.writeByte(2);
      localObjectOutputStream.writeUTF(this.b);
      if (this.c == null);
      for (String str = ""; ; str = this.c)
      {
        localObjectOutputStream.writeUTF(str);
        localObjectOutputStream.writeLong(this.d);
        localObjectOutputStream.writeLong(this.e);
        localObjectOutputStream.writeLong(this.f);
        a(this.g, localObjectOutputStream);
        localObjectOutputStream.flush();
        return true;
      }
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIOException.toString();
      n.b("%s", arrayOfObject);
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.c.a
 * JD-Core Version:    0.6.0
 */