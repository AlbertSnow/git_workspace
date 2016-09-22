package com.wandoujia.accessibility.content_provider;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.wandoujia.accessibility.a.a;
import com.wandoujia.accessibility.hibernation.HibernationManager;
import com.wandoujia.accessibility.hibernation.activity.BoosterHomeActivity;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hibernation
{
  public static Cursor checkBlock(Uri paramUri)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "_id";
    arrayOfString[1] = Hibernation.ColName.BLOCK.name();
    MatrixCursor localMatrixCursor = new MatrixCursor(arrayOfString);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "1";
    boolean bool = a.c();
    int i = 0;
    if (bool)
      i = 1;
    arrayOfObject[1] = Integer.valueOf(i);
    localMatrixCursor.addRow(arrayOfObject);
    return localMatrixCursor;
  }

  private static Set<String> createSetFormString(String paramString)
  {
    return new HashSet(Arrays.asList(paramString.split(",")));
  }

  public static String createStringFromSet(Set<String> paramSet)
  {
    return TextUtils.join(",", paramSet);
  }

  public static int startOnBoard(Uri paramUri)
  {
    if (HibernationManager.a().f())
      return 0;
    Intent localIntent = new Intent(GlobalConfig.getAppContext(), BoosterHomeActivity.class);
    localIntent.setFlags(268435456);
    localIntent.addFlags(32768);
    GlobalConfig.getAppContext().startActivity(localIntent);
    return 1;
  }

  public static int updateWhiteList(Uri paramUri)
  {
    String str1 = paramUri.getQueryParameter(Hibernation.ParameterKey.USER_LIST.name());
    String str2 = paramUri.getQueryParameter(Hibernation.ParameterKey.SYSTEM_LIST.name());
    Object localObject1 = new HashSet();
    if (!TextUtils.isEmpty(str1))
      localObject1 = createSetFormString(str1);
    a.d((Set)localObject1);
    Object localObject2 = new HashSet();
    if (!TextUtils.isEmpty(str2))
      localObject2 = createSetFormString(str2);
    a.c((Set)localObject2);
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.Hibernation
 * JD-Core Version:    0.6.0
 */