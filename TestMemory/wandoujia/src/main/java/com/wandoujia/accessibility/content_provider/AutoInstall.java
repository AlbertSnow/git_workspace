package com.wandoujia.accessibility.content_provider;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.wandoujia.accessibility.AccessibilityManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AutoInstall
{
  private static Set<String> createSetFormString(String paramString)
  {
    return new HashSet(Arrays.asList(paramString.split(",")));
  }

  public static String createStringFromSet(Set<String> paramSet)
  {
    return TextUtils.join(",", paramSet);
  }

  public static Cursor forceTurnOff(Uri paramUri)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "_id";
    arrayOfString[1] = AutoInstall.ColName.FORCE_OFF.name();
    MatrixCursor localMatrixCursor = new MatrixCursor(arrayOfString);
    if ((!com.wandoujia.accessibility.a.a.e()) && (com.wandoujia.accessibility.a.a.d()) && (!AccessibilityManager.a()));
    for (int i = 1; ; i = 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = "1";
      int j = 0;
      if (i != 0)
        j = 1;
      arrayOfObject[1] = Integer.valueOf(j);
      localMatrixCursor.addRow(arrayOfObject);
      return localMatrixCursor;
    }
  }

  public static Cursor getState(Uri paramUri)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "_id";
    arrayOfString[1] = AutoInstall.ColName.STATE.name();
    MatrixCursor localMatrixCursor = new MatrixCursor(arrayOfString);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "1";
    boolean bool = com.wandoujia.accessibility.a.a.h();
    int i = 0;
    if (bool)
      i = 1;
    arrayOfObject[1] = Integer.valueOf(i);
    localMatrixCursor.addRow(arrayOfObject);
    return localMatrixCursor;
  }

  public static Cursor isBlock(Uri paramUri)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "_id";
    arrayOfString[1] = AutoInstall.ColName.BLOCK.name();
    MatrixCursor localMatrixCursor = new MatrixCursor(arrayOfString);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "1";
    boolean bool = com.wandoujia.accessibility.a.a.c();
    int i = 0;
    if (bool)
      i = 1;
    arrayOfObject[1] = Integer.valueOf(i);
    localMatrixCursor.addRow(arrayOfObject);
    return localMatrixCursor;
  }

  public static int setEnable(Uri paramUri)
  {
    String str = paramUri.getQueryParameter(AutoInstall.ParameterKey.IS_ENABLE.name());
    if (TextUtils.isEmpty(str))
      return 0;
    boolean bool1 = Boolean.valueOf(str).booleanValue();
    com.wandoujia.accessibility.a.a.d(bool1);
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    com.wandoujia.accessibility.a.a.c(bool2);
    return 1;
  }

  public static int updateBlock(Uri paramUri)
  {
    String str = paramUri.getQueryParameter(AutoInstall.ParameterKey.BLOCK.name());
    if (TextUtils.isEmpty(str))
      return 0;
    com.wandoujia.accessibility.a.a.a(Boolean.getBoolean(str));
    return 1;
  }

  public static int updateLabel(Uri paramUri)
  {
    String str = paramUri.getQueryParameter(AutoInstall.ParameterKey.LABEL.name());
    if (TextUtils.isEmpty(str))
      return 0;
    Set localSet = createSetFormString(str);
    com.wandoujia.accessibility.autoinstall.a.a(localSet);
    return localSet.size();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.AutoInstall
 * JD-Core Version:    0.6.0
 */