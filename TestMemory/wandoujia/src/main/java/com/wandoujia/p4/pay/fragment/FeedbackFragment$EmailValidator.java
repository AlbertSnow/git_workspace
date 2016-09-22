package com.wandoujia.p4.pay.fragment;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FeedbackFragment$EmailValidator
{
  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
  private static EmailValidator sInstance = new EmailValidator();
  private Matcher matcher;
  private Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

  public static EmailValidator getInstance()
  {
    return sInstance;
  }

  public boolean validate(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    this.matcher = this.pattern.matcher(paramString);
    return this.matcher.matches();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.FeedbackFragment.EmailValidator
 * JD-Core Version:    0.6.0
 */