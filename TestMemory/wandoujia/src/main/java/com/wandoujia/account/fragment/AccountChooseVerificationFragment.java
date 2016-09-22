package com.wandoujia.account.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.LayoutParams;
import com.wandoujia.account.R.color;
import com.wandoujia.account.R.dimen;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountVerification;
import com.wandoujia.account.dto.AccountVerificationGroup;
import com.wandoujia.account.dto.WandouResponse;

public class AccountChooseVerificationFragment extends AccountBaseFragment
{
  private String q;
  private AccountVerificationGroup r;
  private RadioGroup s;
  private Button t;

  final void a(WandouResponse paramWandouResponse)
  {
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
  }

  protected final void c()
  {
    super.c();
    this.s = ((RadioGroup)this.a.findViewById(R.id.account_verification_methods_radiogroup));
    this.t = ((Button)this.a.findViewById(R.id.account_verification_next));
    a(this.q);
    if ((this.r != null) && (this.r.size() > 0))
    {
      AccountVerification[] arrayOfAccountVerification = this.r.getVerifications();
      int i = 0;
      if (i < arrayOfAccountVerification.length)
      {
        AccountVerification localAccountVerification = arrayOfAccountVerification[i];
        String str = "";
        int j = t.a[localAccountVerification.getMethod().ordinal()];
        Object localObject = null;
        switch (j)
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          if (localObject != null)
          {
            RadioGroup.LayoutParams localLayoutParams = new RadioGroup.LayoutParams(-2, -1);
            if (isAdded())
            {
              localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.account_sdk_xsmall_margin);
              localLayoutParams.height = getResources().getDimensionPixelOffset(R.dimen.account_sdk_textview_height);
              ((RadioButton)localObject).setLayoutParams(localLayoutParams);
            }
            ((RadioButton)localObject).setSingleLine();
            SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str);
            localSpannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.account_sdk_darker_grey)), 0, localSpannableStringBuilder.length(), 34);
            localSpannableStringBuilder.append(localAccountVerification.getArg());
            localSpannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.account_sdk_normal_text_color_black)), str.length(), localSpannableStringBuilder.length(), 34);
            if (i == 0)
              ((RadioButton)localObject).setChecked(true);
            ((RadioButton)localObject).setId(i);
            ((RadioButton)localObject).setText(localSpannableStringBuilder);
            ((RadioButton)localObject).setEllipsize(TextUtils.TruncateAt.END);
            ((RadioButton)localObject).setFocusable(true);
            this.s.addView((View)localObject);
          }
          i++;
          break;
          localObject = new RadioButton(getActivity());
          str = getString(R.string.account_sdk_verification_email_send_hint);
          continue;
          localObject = new RadioButton(getActivity());
          str = getString(R.string.account_sdk_verification_tel_send_hint);
        }
      }
    }
    this.t.setOnClickListener(new s(this));
  }

  protected final void d(String paramString)
  {
  }

  protected final void f()
  {
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    setHasOptionsMenu(false);
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_choose_verification, paramViewGroup, false);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.q = localBundle.getString("account.intent.extra.ACCOUNT_VERIFICATION_TITLE");
      this.r = ((AccountVerificationGroup)localBundle.getSerializable("account.intent.extra.ACCOUNT_VERIFICATION_GROUP"));
    }
    c();
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountChooseVerificationFragment
 * JD-Core Version:    0.6.0
 */