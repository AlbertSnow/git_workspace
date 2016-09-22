package com.wandoujia.account.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.support.v4.app.b;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.wandoujia.account.AccountErrorType;
import com.wandoujia.account.R.attr;
import com.wandoujia.account.R.string;
import java.util.Timer;
import java.util.TimerTask;

public class AccountEditText extends EditText
{
  private AccountEditText.ContentType a;
  private AccountEditText.StatusType b;
  private Timer c;
  private TimerTask d;
  private i e;
  private final TextWatcher f = new f(this);

  public AccountEditText(Context paramContext)
  {
    super(paramContext);
    this.e = new i(Looper.myLooper(), this);
  }

  public AccountEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = R.attr.content_type;
    arrayOfInt[1] = R.attr.status_type;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 0);
    int i = localTypedArray.getInt(0, 0);
    if (i == 0)
      throw new IllegalArgumentException("The input_type attribute is required and must define ");
    int j = localTypedArray.getInt(1, 0);
    if (j == 0)
      throw new IllegalArgumentException("The status_type attribute is required and must define ");
    switch (i)
    {
    default:
      switch (j)
      {
      default:
      case 2:
      case 1:
      }
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (this.a != null)
        break label211;
      throw new IllegalArgumentException("The input_type attribute is invalid ");
      this.a = AccountEditText.ContentType.TELEPHONE;
      break;
      this.a = AccountEditText.ContentType.EMAIL;
      break;
      this.a = AccountEditText.ContentType.PASSWORD;
      break;
      this.b = AccountEditText.StatusType.REGISTER;
      continue;
      this.b = AccountEditText.StatusType.LOGIN;
    }
    label211: if (this.b == null)
      throw new IllegalArgumentException("The input_type attribute is invalid ");
    localTypedArray.recycle();
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(50);
    setFilters(arrayOfInputFilter);
    b();
  }

  private String a(int paramInt)
  {
    return getContext().getString(paramInt);
  }

  private String a(String paramString)
  {
    AccountErrorType localAccountErrorType1 = b.t(paramString);
    switch (h.b[localAccountErrorType1.ordinal()])
    {
    case 3:
    default:
      return null;
    case 1:
      return a(R.string.account_sdk_username_empty);
    case 2:
    }
    AccountErrorType localAccountErrorType2 = b.s(paramString);
    switch (h.b[localAccountErrorType2.ordinal()])
    {
    case 3:
    default:
      return null;
    case 4:
      return a(R.string.account_sdk_username_empty);
    case 5:
    }
    return a(R.string.account_sdk_username_invalid);
  }

  private void b()
  {
    if ((this.a == AccountEditText.ContentType.PASSWORD) && (this.b == AccountEditText.StatusType.REGISTER))
    {
      removeTextChangedListener(this.f);
      addTextChangedListener(this.f);
    }
    this.e = new i(Looper.myLooper(), this);
  }

  public final String a()
  {
    String str2;
    if (this.b == AccountEditText.StatusType.LOGIN)
    {
      str2 = getText().toString();
      switch (h.a[this.a.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    do
    {
      do
      {
        return null;
        return a(str2);
        return a(str2);
      }
      while (!TextUtils.isEmpty(str2));
      return a(R.string.account_sdk_password_empty);
    }
    while (this.b != AccountEditText.StatusType.REGISTER);
    String str1 = getText().toString();
    switch (h.a[this.a.ordinal()])
    {
    default:
      return null;
    case 1:
      AccountErrorType localAccountErrorType3 = b.t(str1);
      switch (h.b[localAccountErrorType3.ordinal()])
      {
      case 3:
      default:
        return null;
      case 1:
        return a(R.string.account_sdk_tel_empty);
      case 2:
      }
      return a(R.string.account_sdk_tel_invalid);
    case 2:
      AccountErrorType localAccountErrorType2 = b.s(str1);
      switch (h.b[localAccountErrorType2.ordinal()])
      {
      case 3:
      default:
        return null;
      case 4:
        return a(R.string.account_sdk_email_empty);
      case 5:
      }
      return a(R.string.account_sdk_email_invalid);
    case 3:
    }
    AccountErrorType localAccountErrorType1;
    if (TextUtils.isEmpty(str1))
      localAccountErrorType1 = AccountErrorType.PASSWORD_EMPTY;
    while (true)
      switch (h.b[localAccountErrorType1.ordinal()])
      {
      case 3:
      case 4:
      case 5:
      default:
        return null;
      case 6:
        return a(R.string.account_sdk_password_empty);
        if (str1.length() < 8)
        {
          localAccountErrorType1 = AccountErrorType.PASSWORD_TOO_SHORT;
          continue;
        }
        if (str1.length() > 50)
        {
          localAccountErrorType1 = AccountErrorType.PASSWORD_TOO_LONG;
          continue;
        }
        if (b.v(str1))
        {
          localAccountErrorType1 = AccountErrorType.PASSWORD_INVALID;
          continue;
        }
        localAccountErrorType1 = AccountErrorType.OK;
      case 7:
      case 8:
      case 9:
      }
    return a(R.string.account_sdk_password_least_length);
    return a(R.string.account_sdk_password_too_long);
    return a(R.string.account_sdk_password_invalid);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
    {
      this.c.cancel();
      this.c = null;
    }
    this.e.a();
    this.e = null;
  }

  public void setContentType(AccountEditText.ContentType paramContentType)
  {
    this.a = paramContentType;
    b();
  }

  public void setPassWordTextChangeListener$16808738(android.support.v7.app.f paramf)
  {
  }

  public void setStatusType(AccountEditText.StatusType paramStatusType)
  {
    this.b = paramStatusType;
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.widget.AccountEditText
 * JD-Core Version:    0.6.0
 */