package com.tencent.mm.sdk.channel;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.internal.widget.au;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.b;

public final class a
{
  private final Context a;
  private final TypedArray b;
  private au c;

  private a(Context paramContext, TypedArray paramTypedArray)
  {
    this.a = paramContext;
    this.b = paramTypedArray;
  }

  public static a a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new a(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }

  public static a a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt)
  {
    return new a(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt, 0));
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      b.a("MicroMsg.SDK.MMessageAct");
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramString1, paramString2);
    localIntent.putExtras(paramBundle);
    String str = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 553779201);
    localIntent.putExtra("_mmessage_appPackage", str);
    localIntent.putExtra("_mmessage_content", paramString3);
    localIntent.putExtra("_mmessage_checksum", MMessage.a(paramString3, str));
    localIntent.addFlags(268435456).addFlags(134217728);
    try
    {
      paramContext.startActivity(localIntent);
      new StringBuilder("send mm message, intent=").append(localIntent);
      b.c("MicroMsg.SDK.MMessageAct");
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      b.a("MicroMsg.SDK.MMessageAct");
    }
    return false;
  }

  public final int a()
  {
    return this.b.length();
  }

  public final int a(int paramInt1, int paramInt2)
  {
    return this.b.getInt(paramInt1, paramInt2);
  }

  public final Drawable a(int paramInt)
  {
    if (this.b.hasValue(paramInt))
    {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return c().a(i);
    }
    return this.b.getDrawable(paramInt);
  }

  public final boolean a(int paramInt, boolean paramBoolean)
  {
    return this.b.getBoolean(paramInt, paramBoolean);
  }

  public final int b(int paramInt1, int paramInt2)
  {
    return this.b.getInteger(paramInt1, paramInt2);
  }

  public final Drawable b(int paramInt)
  {
    if (this.b.hasValue(paramInt))
    {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return c().a(i, true);
    }
    return null;
  }

  public final void b()
  {
    this.b.recycle();
  }

  public final int c(int paramInt1, int paramInt2)
  {
    return this.b.getDimensionPixelOffset(paramInt1, paramInt2);
  }

  public final au c()
  {
    if (this.c == null)
      this.c = au.a(this.a);
    return this.c;
  }

  public final CharSequence c(int paramInt)
  {
    return this.b.getText(paramInt);
  }

  public final int d(int paramInt1, int paramInt2)
  {
    return this.b.getDimensionPixelSize(paramInt1, paramInt2);
  }

  public final String d(int paramInt)
  {
    return this.b.getString(paramInt);
  }

  public final float e(int paramInt)
  {
    return this.b.getFloat(paramInt, -1.0F);
  }

  public final int e(int paramInt1, int paramInt2)
  {
    return this.b.getLayoutDimension(paramInt1, paramInt2);
  }

  public final int f(int paramInt1, int paramInt2)
  {
    return this.b.getResourceId(paramInt1, paramInt2);
  }

  public final boolean f(int paramInt)
  {
    return this.b.hasValue(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.channel.a
 * JD-Core Version:    0.6.0
 */