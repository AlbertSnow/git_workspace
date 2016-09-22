package com.wandoujia.account.h;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;

public final class a
{
  private static CountDownTimer a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private boolean g;

  public static com.wandoujia.account.widget.a a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    com.wandoujia.account.widget.d locald = new com.wandoujia.account.widget.d(paramContext);
    View localView = LayoutInflater.from(paramContext).inflate(R.layout.account_sdk_captcha_dialog, null);
    ImageView localImageView = (ImageView)localView.findViewById(R.id.account_captcha);
    new com.wandoujia.account.a.a(localImageView).execute(new Void[0]);
    localImageView.setOnClickListener(new e(localImageView));
    locald.a(localView);
    locald.a(R.string.account_sdk_confirm, paramOnClickListener1);
    locald.b(R.string.account_sdk_cancel, paramOnClickListener2);
    locald.a(R.string.account_sdk_captcha_title);
    return locald.a();
  }

  public static com.wandoujia.account.widget.a a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    com.wandoujia.account.widget.d locald = new com.wandoujia.account.widget.d(paramContext);
    locald.b(paramString1).a(paramString2).a(paramContext.getString(R.string.account_sdk_confirm), paramOnClickListener).a(false);
    return locald.a();
  }

  public static com.wandoujia.account.widget.a a(Context paramContext, String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    com.wandoujia.account.widget.d locald = new com.wandoujia.account.widget.d(paramContext);
    locald.b(paramString1).a(paramString2).b(R.string.account_sdk_cancel, paramOnClickListener2).a(paramString3, paramOnClickListener1).a(false);
    return locald.a();
  }

  public static com.wandoujia.account.widget.a a(Context paramContext, String paramString1, String paramString2, String paramString3, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    if (TextUtils.isEmpty(paramString2));
    for (String str1 = com.wandoujia.account.a.j(); ; str1 = paramString2)
    {
      if (a != null)
        a.cancel();
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      com.wandoujia.account.widget.d locald = new com.wandoujia.account.widget.d(paramContext);
      locald.a(localLinearLayout);
      View localView = LayoutInflater.from(paramContext).inflate(R.layout.account_sdk_verify_dialog, localLinearLayout);
      TextView localTextView1 = (TextView)localView.findViewById(R.id.account_verify_hint);
      TextView localTextView2 = (TextView)localView.findViewById(R.id.account_verify_confirm_hint);
      EditText localEditText = (EditText)localView.findViewById(R.id.account_captcha_edit);
      String str2 = paramContext.getString(R.string.account_sdk_confirm);
      boolean bool;
      String str3;
      Button localButton3;
      if (str1.contains("@"))
      {
        localTextView1.setVisibility(8);
        localTextView2.setText(paramContext.getString(R.string.account_sdk_email_show, new Object[] { str1 }));
        localEditText.setVisibility(8);
        String str4 = paramContext.getString(R.string.account_sdk_verify_complete);
        bool = true;
        str3 = str4;
        ((LinearLayout)localView.findViewById(R.id.account_verify_button_area)).setVisibility(0);
        Button localButton1 = (Button)localView.findViewById(R.id.account_verify_cancel);
        Button localButton2 = (Button)localView.findViewById(R.id.account_verify_confirm);
        localButton3 = (Button)localView.findViewById(R.id.account_verify_repeated);
        localButton2.setText(str3);
        localButton1.setOnClickListener(paramOnClickListener2);
        localButton2.setOnClickListener(paramOnClickListener1);
        localButton3.setOnClickListener(new b(paramContext, bool, localButton3, paramString1, str1));
        locald.a(localView);
        locald.a(false);
        if (!TextUtils.isEmpty(paramString3))
          break label346;
        locald.a(R.string.account_sdk_active_title);
      }
      while (true)
      {
        b(paramContext, bool, localButton3);
        return locald.a();
        localTextView2.setText(paramContext.getString(R.string.account_sdk_tel_show, new Object[] { str1 }));
        str3 = str2;
        bool = false;
        break;
        label346: locald.a(paramString3);
      }
    }
  }

  private static void b(Context paramContext, boolean paramBoolean, Button paramButton)
  {
    if (a != null)
      a.cancel();
    if (paramButton == null)
      return;
    if (paramBoolean)
    {
      int j = R.string.account_sdk_verify_email_again;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(30);
      paramButton.setText(paramContext.getString(j, arrayOfObject2));
    }
    while (true)
    {
      paramButton.setEnabled(false);
      d locald = new d(paramBoolean, paramButton, paramContext);
      a = locald;
      locald.start();
      return;
      int i = R.string.account_sdk_verify_captcha_again;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(30);
      paramButton.setText(paramContext.getString(i, arrayOfObject1));
    }
  }

  public final String a()
  {
    return this.f;
  }

  public final void a(String paramString)
  {
    this.f = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public final String b()
  {
    return this.e;
  }

  public final void b(String paramString)
  {
    this.e = paramString;
  }

  public final void c(String paramString)
  {
    this.b = paramString;
  }

  public final boolean c()
  {
    return this.g;
  }

  public final String d()
  {
    return this.b;
  }

  public final void d(String paramString)
  {
    this.c = paramString;
  }

  public final String e()
  {
    return this.c;
  }

  public final void e(String paramString)
  {
    this.d = paramString;
  }

  public final String f()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.h.a
 * JD-Core Version:    0.6.0
 */