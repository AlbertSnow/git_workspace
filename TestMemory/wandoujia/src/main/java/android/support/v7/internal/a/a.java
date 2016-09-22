package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class a
{
  private static Class<?>[] a = { Context.class, AttributeSet.class };
  private static final Map<String, Constructor<? extends View>> b = new android.support.v4.e.a();
  private final Object[] c = new Object[2];

  private View a(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    if (paramString.equals("view"))
      paramString = paramAttributeSet.getAttributeValue(null, "class");
    try
    {
      this.c[0] = paramContext;
      this.c[1] = paramAttributeSet;
      if (-1 == paramString.indexOf('.'))
      {
        View localView2 = a(paramContext, paramString, "android.widget.");
        return localView2;
      }
      View localView1 = a(paramContext, paramString, null);
      return localView1;
    }
    catch (Exception localException)
    {
      return null;
    }
    finally
    {
      this.c[0] = null;
      this.c[1] = null;
    }
    throw localObject;
  }

  private View a(Context paramContext, String paramString1, String paramString2)
  {
    Constructor localConstructor = (Constructor)b.get(paramString1);
    if (localConstructor == null);
    try
    {
      ClassLoader localClassLoader = paramContext.getClassLoader();
      if (paramString2 != null);
      for (String str = paramString2 + paramString1; ; str = paramString1)
      {
        localConstructor = localClassLoader.loadClass(str).asSubclass(View.class).getConstructor(a);
        b.put(paramString1, localConstructor);
        localConstructor.setAccessible(true);
        View localView = (View)localConstructor.newInstance(this.c);
        return localView;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramView != null));
    for (Object localObject = paramView.getContext(); ; localObject = paramContext)
    {
      TypedArray localTypedArray = ((Context)localObject).obtainStyledAttributes(paramAttributeSet, R.styleable.View, 0, 0);
      if (paramBoolean2);
      for (int i = localTypedArray.getResourceId(R.styleable.View_android_theme, 0); ; i = 0)
      {
        if (i == 0);
        for (int j = localTypedArray.getResourceId(R.styleable.View_theme, 0); ; j = i)
        {
          localTypedArray.recycle();
          if ((j != 0) && ((!(localObject instanceof android.support.v7.internal.view.a)) || (((android.support.v7.internal.view.a)localObject).a() != j)))
            localObject = new android.support.v7.internal.view.a((Context)localObject, j);
          int k = -1;
          switch (paramString.hashCode())
          {
          default:
          case 1666676343:
          case -339785223:
          case 1601505219:
          case 776382189:
          case -1455429095:
          case 1413872058:
          case -1346021293:
          case -1946472170:
          case 2001146706:
          case -938935918:
          }
          while (true)
            switch (k)
            {
            default:
              if (paramContext != localObject)
              {
                return a((Context)localObject, paramString, paramAttributeSet);
                if (!paramString.equals("EditText"))
                  continue;
                k = 0;
                continue;
                if (!paramString.equals("Spinner"))
                  continue;
                k = 1;
                continue;
                if (!paramString.equals("CheckBox"))
                  continue;
                k = 2;
                continue;
                if (!paramString.equals("RadioButton"))
                  continue;
                k = 3;
                continue;
                if (!paramString.equals("CheckedTextView"))
                  continue;
                k = 4;
                continue;
                if (!paramString.equals("AutoCompleteTextView"))
                  continue;
                k = 5;
                continue;
                if (!paramString.equals("MultiAutoCompleteTextView"))
                  continue;
                k = 6;
                continue;
                if (!paramString.equals("RatingBar"))
                  continue;
                k = 7;
                continue;
                if (!paramString.equals("Button"))
                  continue;
                k = 8;
                continue;
                if (!paramString.equals("TextView"))
                  continue;
                k = 9;
              }
              break;
            case 0:
              return new AppCompatEditText((Context)localObject, paramAttributeSet);
            case 1:
              return new AppCompatSpinner((Context)localObject, paramAttributeSet);
            case 2:
              return new AppCompatCheckBox((Context)localObject, paramAttributeSet);
            case 3:
              return new AppCompatRadioButton((Context)localObject, paramAttributeSet);
            case 4:
              return new AppCompatCheckedTextView((Context)localObject, paramAttributeSet);
            case 5:
              return new AppCompatAutoCompleteTextView((Context)localObject, paramAttributeSet);
            case 6:
              return new AppCompatMultiAutoCompleteTextView((Context)localObject, paramAttributeSet);
            case 7:
              return new AppCompatRatingBar((Context)localObject, paramAttributeSet);
            case 8:
              return new AppCompatButton((Context)localObject, paramAttributeSet);
            case 9:
              return new AppCompatTextView((Context)localObject, paramAttributeSet);
            }
          return null;
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.a.a
 * JD-Core Version:    0.6.0
 */