package com.wandoujia.p4.account.fragment;

import android.content.Intent;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.wandoujia.account.a;
import com.wandoujia.p4.account.activity.AccountModifyProfileActivity;

final class d
  implements View.OnClickListener
{
  d(AccountProfileFragment paramAccountProfileFragment)
  {
  }

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131493087:
    case 2131493099:
    case 2131493101:
    case 2131493102:
    case 2131493117:
    case 2131493111:
    case 2131493113:
    case 2131493107:
    case 2131493115:
    case 2131493109:
    case 2131493119:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                  Intent localIntent = new Intent(this.a.getActivity(), AccountModifyProfileActivity.class);
                  this.a.startActivityForResult(localIntent, 10);
                  return;
                }
                while (a.p());
                AccountProfileFragment.a(this.a, "tel", AccountProfileFragment.a(this.a).getText().toString());
                return;
              }
              while (a.n());
              AccountProfileFragment.a(this.a, "email", AccountProfileFragment.b(this.a).getText().toString());
              return;
            }
            while (TextUtils.isEmpty(a.r()));
            if (!a.p())
            {
              AccountProfileFragment.a(this.a, "tel", AccountProfileFragment.a(this.a).getText().toString());
              return;
            }
            AccountProfileFragment.c(this.a);
            return;
          }
          while (TextUtils.isEmpty(a.q()));
          if (!a.n())
          {
            AccountProfileFragment.a(this.a, "email", AccountProfileFragment.b(this.a).getText().toString());
            return;
          }
          AccountProfileFragment.d(this.a);
          return;
          if ((TextUtils.isEmpty(AccountProfileFragment.a(this.a).getText().toString())) || (!AccountProfileFragment.a(this.a).getText().toString().equals(this.a.getString(2131625529))))
            continue;
          if (a.C())
          {
            AccountProfileFragment.c(this.a);
            return;
          }
          AccountProfileFragment.e(this.a);
          return;
        }
        while (TextUtils.isEmpty(a.r()));
        AccountProfileFragment.c(this.a);
        return;
        if ((TextUtils.isEmpty(AccountProfileFragment.b(this.a).getText().toString())) || (!AccountProfileFragment.b(this.a).getText().toString().equals(this.a.getString(2131625529))))
          continue;
        if (a.C())
        {
          AccountProfileFragment.d(this.a);
          return;
        }
        AccountProfileFragment.e(this.a);
        return;
      }
      while (TextUtils.isEmpty(a.q()));
      AccountProfileFragment.d(this.a);
      return;
    }
    while ((b.B()) && (!a.o()));
    AccountProfileFragment.f(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.d
 * JD-Core Version:    0.6.0
 */