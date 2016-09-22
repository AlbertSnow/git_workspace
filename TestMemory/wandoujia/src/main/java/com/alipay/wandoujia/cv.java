package com.alipay.wandoujia;

import I;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.IBinder;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.squareup.picasso.Picasso;
import java.io.File;
import java.lang.reflect.Array;
import java.util.HashMap;
import org.json.JSONObject;

public final class cv
{
  private static final HashMap a = new HashMap();
  private static final HashMap b = new HashMap();
  private static int c = -1;

  static
  {
    a.put("xx-small", Float.valueOf(11.0F));
    a.put("x-small", Float.valueOf(12.0F));
    a.put("small", Float.valueOf(13.0F));
    a.put("medium", Float.valueOf(15.0F));
    a.put("large", Float.valueOf(16.0F));
    a.put("x-large", Float.valueOf(19.0F));
    a.put("xx-large", Float.valueOf(20.0F));
    b.put("white_content", Integer.valueOf(d.e("mini_bg_white")));
    b.put("gray_content", Integer.valueOf(d.e("mini_bg_gray")));
    b.put("detail", Integer.valueOf(d.e("mini_icon_info")));
    b.put("tip", Integer.valueOf(d.e("mini_icon_info")));
    b.put("header_line", Integer.valueOf(d.e("mini_header_line")));
    b.put("title", Integer.valueOf(d.e("mini_logo")));
    b.put("footer_line", Integer.valueOf(d.e("mini_footer_line")));
    b.put("sure", Integer.valueOf(d.e("mini_icon_sure")));
    b.put("page_title", Integer.valueOf(d.e("mini_card_title_bg")));
    b.put("middle_line", Integer.valueOf(d.e("mini_dash_line_bg")));
    b.put("result_ok", Integer.valueOf(d.e("mini_icon_ok")));
    b.put("normal", Integer.valueOf(d.e("mini_btn_confirm_bg")));
    b.put("hover", Integer.valueOf(d.e("mini_btn_comfirm_hover")));
    b.put("disable", Integer.valueOf(d.e("mini_btn_disable")));
    b.put("login_disable", Integer.valueOf(d.e("mini_btn_confirm_bg")));
  }

  public static int a(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.widthPixels;
  }

  public static int a(String paramString)
  {
    if (b.c(paramString))
      return com.wandoujia.image.c.a.a().b().getResources().getColor(d.c("msp_text_color_gray"));
    if (paramString.contains("rgb"))
    {
      int[] arrayOfInt = new int[3];
      String[] arrayOfString = paramString.substring(1 + paramString.indexOf("("), paramString.indexOf(")")).split(",");
      for (int i = 0; ; i++)
      {
        if (i >= arrayOfString.length)
          return Color.rgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
        arrayOfInt[i] = Integer.parseInt(arrayOfString[i].trim());
      }
    }
    return Color.parseColor(paramString);
  }

  public static int a(String paramString, Activity paramActivity)
  {
    if (TextUtils.isEmpty(paramString))
      return 0;
    if (paramString.contains("%"))
      return Math.round(paramActivity.getResources().getDimensionPixelSize(d.d("mini_win_default_height")) * g(paramString));
    return Math.round(Integer.parseInt(paramString) / 1.5F * b(paramActivity));
  }

  public static ColorStateList a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      int[] arrayOfInt1 = { 4, 4 };
      int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt1);
      int[] arrayOfInt2 = new int[4];
      int i = 0;
      int j = 1;
      if (i >= paramArrayOfString.length)
      {
        if (j == 0)
          return new ColorStateList(arrayOfInt, arrayOfInt2);
      }
      else
      {
        String str = paramArrayOfString[i];
        if (!TextUtils.isEmpty(str))
          if (str.startsWith("rgb"))
            switch (i)
            {
            default:
            case 0:
            case 1:
            case 2:
            }
        while (true)
        {
          j = 0;
          while (true)
          {
            i++;
            break;
            arrayOfInt[0] = { 16842910, -16842919, -16842908 };
            arrayOfInt2[0] = a(str);
            j = 0;
            continue;
            arrayOfInt[1] = { 16842910, 16842919 };
            arrayOfInt2[1] = a(str);
            arrayOfInt[2] = { 16842910, 16842908 };
            arrayOfInt2[2] = a(str);
            j = 0;
          }
          arrayOfInt[3] = { -16842910 };
          arrayOfInt2[3] = a(str);
        }
      }
    }
    return null;
  }

  private static Drawable a(Context paramContext, String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    Drawable localDrawable = null;
    if (!bool1)
    {
      if (!paramString.contains("local"))
        break label39;
      int i = f(paramString);
      localDrawable = paramContext.getResources().getDrawable(i);
    }
    label39: boolean bool2;
    do
    {
      return localDrawable;
      bool2 = paramString.startsWith("#");
      localDrawable = null;
    }
    while (!bool2);
    return new ColorDrawable(Color.parseColor(paramString));
  }

  public static StateListDrawable a(Context paramContext, String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      int i = paramArrayOfString.length;
      int j = 0;
      int k = 1;
      if (j >= i)
      {
        if (k != 0)
          return null;
      }
      else
      {
        String str = paramArrayOfString[j];
        if (!TextUtils.isEmpty(str))
        {
          if (!str.contains("normal"))
            break label103;
          localStateListDrawable.addState(new int[] { 16842910, -16842919, -16842908 }, a(paramContext, str));
          k = 0;
        }
        while (true)
        {
          j++;
          break;
          label103: if (str.contains("hover"))
          {
            localStateListDrawable.addState(new int[] { 16842910, 16842919 }, a(paramContext, str));
            localStateListDrawable.addState(new int[] { 16842910, 16842908 }, a(paramContext, str));
            k = 0;
            continue;
          }
          if (str.contains("disable"))
            localStateListDrawable.addState(new int[] { -16842910 }, a(paramContext, str));
          k = 0;
        }
      }
      return localStateListDrawable;
    }
    return null;
  }

  public static void a(Context paramContext)
  {
    Dialog localDialog = new Dialog(paramContext, d.h("mini_safty_dialog"));
    View localView = LayoutInflater.from(paramContext).inflate(d.f("mini_safty_code_info_layout"), null);
    localView.findViewById(d.a("mini_safty_code_close")).setOnClickListener(new cw(localDialog));
    localDialog.setContentView(localView);
    localDialog.show();
  }

  public static void a(Context paramContext, int paramInt, DialogInterface.OnClickListener paramOnClickListener, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    String str = paramContext.getString(d.g("msp_mini_choose_identitify"));
    if (paramInt == 0)
    {
      str = paramContext.getString(d.g("msp_mini_read_protocal_title"));
      paramOnClickListener = new cx(paramContext, paramArrayOfString1, paramArrayOfString2);
    }
    localBuilder.setTitle(str);
    localBuilder.setItems(paramArrayOfString2, paramOnClickListener);
    localBuilder.create().show();
  }

  public static void a(Context paramContext, String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    com.alipay.android.mini.widget.j localj = new com.alipay.android.mini.widget.j(paramContext);
    localj.b(paramContext.getString(d.g("msp_error_title_default")));
    if (TextUtils.isEmpty(paramString))
      paramString = "确定退出支付？";
    localj.a(paramString);
    localj.a("是", paramOnClickListener);
    localj.b("否", new cz());
    localj.a();
  }

  public static void a(Context paramContext, String[] paramArrayOfString1, String[] paramArrayOfString2, Button paramButton)
  {
    StateListDrawable localStateListDrawable = a(paramContext, paramArrayOfString1);
    if (localStateListDrawable != null)
      paramButton.setBackgroundDrawable(localStateListDrawable);
    ColorStateList localColorStateList = a(paramArrayOfString2);
    if (localColorStateList != null)
      paramButton.setTextColor(localColorStateList);
  }

  public static void a(IBinder paramIBinder, Context paramContext)
  {
    ((InputMethodManager)paramContext.getSystemService("input_method")).hideSoftInputFromWindow(paramIBinder, 2);
  }

  public static void a(EditText paramEditText)
  {
    paramEditText.postDelayed(new cy(paramEditText), 300L);
  }

  public static void a(TextView paramTextView, int paramInt)
  {
    paramTextView.setShadowLayer(2.0F, 0.0F, 2.0F, paramInt);
  }

  public static void a(String paramString, ad paramad)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    Context localContext = com.wandoujia.image.c.a.a().b();
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("local:")));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label61;
      int j = f(paramString);
      if (j == 0)
        break;
      paramad.a(j);
      return;
    }
    label61: if ((paramString.startsWith("http://")) || (paramString.startsWith("https://")))
    {
      Picasso.a(localContext).a(paramString).a(paramad);
      return;
    }
    Picasso.a(localContext).a(new File(paramString)).a(paramad);
  }

  public static void a(String[] paramArrayOfString1, String[] paramArrayOfString2, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("normal");
    if (localJSONObject1 != null)
    {
      paramArrayOfString1[0] = localJSONObject1.optString("image");
      paramArrayOfString2[0] = localJSONObject1.optString("color");
    }
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("hover");
    if (localJSONObject2 != null)
    {
      paramArrayOfString1[1] = localJSONObject2.optString("image");
      paramArrayOfString2[1] = localJSONObject2.optString("color");
    }
    JSONObject localJSONObject3 = paramJSONObject.optJSONObject("disable");
    if (localJSONObject3 != null)
    {
      paramArrayOfString1[2] = localJSONObject3.optString("image");
      paramArrayOfString2[2] = localJSONObject3.optString("color");
    }
  }

  public static float b(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.density;
  }

  public static int b(String paramString)
  {
    if (paramString.equals("center"))
      return 17;
    if (paramString.equals("left"))
      return 3;
    if (paramString.equals("right"))
      return 5;
    return 0;
  }

  public static int b(String paramString, Activity paramActivity)
  {
    if (TextUtils.isEmpty(paramString))
      return 0;
    if (paramString.contains("%"))
      return Math.round(c(paramActivity) * g(paramString));
    return Math.round(Integer.parseInt(paramString) / 1.5F * b(paramActivity));
  }

  public static void b(EditText paramEditText)
  {
    a(paramEditText.getWindowToken(), paramEditText.getContext());
  }

  public static float c(String paramString)
  {
    if (a.containsKey(paramString))
      return ((Float)a.get(paramString)).floatValue();
    try
    {
      float f = Float.parseFloat(paramString);
      return f / 1.5F;
    }
    catch (Exception localException)
    {
    }
    return ((Float)a.get("medium")).floatValue();
  }

  public static int c(Activity paramActivity)
  {
    float f;
    if (c == -1)
    {
      f = a(paramActivity);
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (f / localDisplayMetrics.heightPixels - 0.6F < 0.0F)
        break label63;
      c = (int)(f * 0.875F);
    }
    while (true)
    {
      return c;
      label63: c = (int)(10 + (int)(f - 480.0F) / 5 + 280.0F * b(paramActivity));
    }
  }

  public static int[] d(String paramString)
  {
    int i = 0;
    int[] arrayOfInt = new int[4];
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return arrayOfInt;
      try
      {
        Context localContext = com.wandoujia.image.c.a.a().b();
        if (b.a(paramString))
        {
          int k = com.alipay.android.app.util.a.a(localContext, (int)(Integer.valueOf(paramString).intValue() / 1.5F));
          while (i < 4)
          {
            arrayOfInt[i] = k;
            i++;
          }
        }
        String[] arrayOfString = paramString.split(" ");
        if (arrayOfString == null)
          continue;
        int j = Math.min(arrayOfString.length, 4);
        while (i < j)
        {
          arrayOfInt[i] = com.alipay.android.app.util.a.a(localContext, (int)(Integer.valueOf(arrayOfString[i]).intValue() / 1.5F));
          i++;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.b(localNumberFormatException);
      }
    }
    return arrayOfInt;
  }

  public static int[] e(String paramString)
  {
    int i = 0;
    int[] arrayOfInt = new int[4];
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return arrayOfInt;
      try
      {
        Context localContext = com.wandoujia.image.c.a.a().b();
        if (b.a(paramString))
        {
          int m = com.alipay.android.app.util.a.a(localContext, (int)(Integer.valueOf(paramString).intValue() / 1.5F));
          while (i < 4)
          {
            arrayOfInt[i] = m;
            i++;
          }
        }
        String[] arrayOfString = paramString.split(" ");
        if (arrayOfString == null)
          continue;
        int j = Math.min(arrayOfString.length, 4);
        int k = 0;
        if (k >= j)
          continue;
        float f = (int)(Integer.valueOf(arrayOfString[k]).intValue() / 1.5F);
        if (localContext != null);
        Resources localResources;
        for (Object localObject = localContext.getResources(); ; localObject = localResources)
        {
          arrayOfInt[k] = (int)(f * ((Resources)localObject).getDisplayMetrics().density);
          k++;
          break;
          localResources = Resources.getSystem();
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.b(localNumberFormatException);
      }
    }
    return (I)arrayOfInt;
  }

  public static int f(String paramString)
  {
    if (b.c(paramString))
      return 0;
    String str = paramString.substring(1 + paramString.lastIndexOf(":"));
    if (b.containsKey(str))
      return ((Integer)b.get(str)).intValue();
    try
    {
      int i = Integer.valueOf(str, 0).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  private static float g(String paramString)
  {
    String str = paramString.replace("%", "");
    if (TextUtils.isEmpty(str))
      return 0.0F;
    return Integer.valueOf(str).intValue() / 100.0F;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cv
 * JD-Core Version:    0.6.0
 */