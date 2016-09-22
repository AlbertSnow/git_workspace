package com.wandoujia.ripple_framework.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.app.b;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.reflect.JavaCalls;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.R.styleable;
import com.wandoujia.ripple_framework.TypefaceManager;
import com.wandoujia.ripple_framework.TypefaceManager.FONT;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.theme.c;

public class CustomFontTextView extends TextView
  implements c
{
  private static final String a = CustomFontTextView.class.getSimpleName();
  private static final int b = TypefaceManager.FONT.NORMAL.ordinal();
  private int c = 0;

  public CustomFontTextView(Context paramContext)
  {
    super(paramContext);
  }

  public CustomFontTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public CustomFontTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  @TargetApi(21)
  public CustomFontTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CustomFontTextView, 0, 0);
    int i = localTypedArray1.getInteger(R.styleable.CustomFontTextView_fontName, b);
    localTypedArray1.recycle();
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842904 }, 0, 0);
    this.c = localTypedArray2.getResourceId(0, 0);
    localTypedArray2.recycle();
    a();
    if (("com.wandoujia.phoenix2".equals(paramContext.getPackageName())) && (getTypeface() != null) && (getTypeface().getStyle() != 0));
    Typeface localTypeface;
    do
    {
      TypefaceManager localTypefaceManager;
      do
      {
        return;
        localTypefaceManager = (TypefaceManager)i.k().a("type_face");
      }
      while (localTypefaceManager == null);
      localTypeface = localTypefaceManager.a(TypefaceManager.FONT.getFont(i));
    }
    while (localTypeface == null);
    setTypeface(localTypeface);
  }

  public final void a()
  {
    if (this.c != 0)
    {
      Resources localResources = i.k().g().getResources();
      int i = b.n(this.c);
      if (i != 0)
        setTextColor(localResources.getColorStateList(i));
    }
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    return false;
  }

  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence;
    if ((paramInt1 == -1) || (paramInt2 == -1))
    {
      localCharSequence = getText();
      if (!(localCharSequence instanceof Spannable));
    }
    try
    {
      Selection.setSelection((Spannable)localCharSequence, 0, 0);
      return;
      try
      {
        super.onSelectionChanged(paramInt1, paramInt2);
        return;
      }
      catch (Throwable localThrowable2)
      {
        return;
      }
    }
    catch (Throwable localThrowable1)
    {
    }
  }

  public boolean performLongClick()
  {
    try
    {
      if ((SystemUtil.aboveApiLevel(11)) && (isTextSelectable()))
      {
        Object localObject = JavaCalls.getField(this, "mEditor");
        if (localObject != null)
        {
          boolean bool = ((Boolean)JavaCalls.callMethod(localObject, "selectCurrentWord", new Object[0])).booleanValue();
          String str = a;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(bool);
          Log.d(str, "select current word %b", arrayOfObject);
        }
      }
      label71: return super.performLongClick();
    }
    catch (Throwable localThrowable)
    {
      break label71;
    }
  }

  public void setFont(TypefaceManager.FONT paramFONT)
  {
    TypefaceManager localTypefaceManager = (TypefaceManager)i.k().a("type_face");
    if (localTypefaceManager != null)
    {
      Typeface localTypeface = localTypefaceManager.a(paramFONT);
      if (localTypeface != null)
        setTypeface(localTypeface);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.CustomFontTextView
 * JD-Core Version:    0.6.0
 */