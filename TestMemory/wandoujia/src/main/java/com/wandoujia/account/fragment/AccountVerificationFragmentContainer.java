package com.wandoujia.account.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountVerification;
import com.wandoujia.account.dto.AccountVerificationGroup;
import com.wandoujia.account.exceptions.UnsupportedAccountSdkVersion;
import java.util.LinkedList;
import java.util.Queue;

public class AccountVerificationFragmentContainer extends Fragment
  implements e
{
  public static com.wandoujia.account.d.a a;
  private Queue<AccountVerificationGroup> b;
  private String c;
  private String d;

  private void a(String paramString, AccountVerification paramAccountVerification, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("account.intent.extra.ACCOUNT_VERIFICATION_TITLE", this.c);
    localBundle.putSerializable("account.intent.extra.ACCOUNT_VERIFICATION", paramAccountVerification);
    localBundle.putString("account.intent.extra.ACCOUNT_VERIFICATION_TOKEN", paramString);
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", this.d);
    AccountCheckVerificationFragment localAccountCheckVerificationFragment = new AccountCheckVerificationFragment();
    localAccountCheckVerificationFragment.setArguments(localBundle);
    if (paramBoolean)
    {
      getChildFragmentManager().a().b(R.id.account_fragment_container_layout, localAccountCheckVerificationFragment).b();
      return;
    }
    getChildFragmentManager().a().a(R.id.account_fragment_container_layout, localAccountCheckVerificationFragment).b();
  }

  private void a(boolean paramBoolean)
  {
    AccountVerificationGroup localAccountVerificationGroup;
    AccountVerification[] arrayOfAccountVerification;
    AccountChooseVerificationFragment localAccountChooseVerificationFragment;
    if (c())
    {
      localAccountVerificationGroup = (AccountVerificationGroup)this.b.peek();
      if (localAccountVerificationGroup != null)
      {
        arrayOfAccountVerification = localAccountVerificationGroup.getVerifications();
        if (arrayOfAccountVerification != null)
        {
          if (arrayOfAccountVerification.length <= 1)
            break label138;
          Bundle localBundle = new Bundle();
          localBundle.putString("account.intent.extra.ACCOUNT_VERIFICATION_TITLE", this.c);
          localBundle.putSerializable("account.intent.extra.ACCOUNT_VERIFICATION_GROUP", localAccountVerificationGroup);
          localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", this.d);
          localAccountChooseVerificationFragment = new AccountChooseVerificationFragment();
          localAccountChooseVerificationFragment.setArguments(localBundle);
          if (!paramBoolean)
            break label118;
          getChildFragmentManager().a().b(R.id.account_fragment_container_layout, localAccountChooseVerificationFragment).a();
        }
      }
    }
    label118: 
    do
    {
      return;
      getChildFragmentManager().a().a(R.id.account_fragment_container_layout, localAccountChooseVerificationFragment).a();
      return;
    }
    while (arrayOfAccountVerification.length != 1);
    label138: AccountVerification localAccountVerification = arrayOfAccountVerification[0];
    a(localAccountVerificationGroup.getToken(), localAccountVerification, paramBoolean);
  }

  private boolean c()
  {
    return (this.b != null) && (!this.b.isEmpty());
  }

  private void d()
  {
    FragmentActivity localFragmentActivity = getActivity();
    if (localFragmentActivity != null)
    {
      if ((localFragmentActivity instanceof d))
        ((d)localFragmentActivity).a();
    }
    else
      return;
    localFragmentActivity.setResult(-1);
    localFragmentActivity.finish();
  }

  public final void a()
  {
    d();
    if (a != null)
      a.a();
  }

  public final void a(String paramString, AccountVerification paramAccountVerification)
  {
    a(paramString, paramAccountVerification, false);
  }

  public final void b(String paramString, AccountVerification paramAccountVerification)
  {
    if ((this.b != null) && (paramString != null))
    {
      AccountVerificationGroup localAccountVerificationGroup = (AccountVerificationGroup)this.b.peek();
      if ((localAccountVerificationGroup != null) && (localAccountVerificationGroup.size() > 0) && (paramString.equals(localAccountVerificationGroup.getToken())))
        this.b.poll();
    }
    if (c())
      a(true);
    do
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("account.intent.extra.ACCOUNT_VERIFICATION_TOKEN", paramString);
      localIntent.putExtra("account.intent.extra.ACCOUNT_VERIFICATION", paramAccountVerification);
      d();
    }
    while (a == null);
    a.a(paramString, paramAccountVerification);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    Object[] arrayOfObject1;
    if (getArguments() != null)
    {
      Bundle localBundle = getArguments();
      this.c = localBundle.getString("account.intent.extra.ACCOUNT_VERIFICATION_TITLE");
      this.b = null;
      this.d = localBundle.getString("account.intent.extra.ACCOUNT_MANAGER_KEY");
      arrayOfObject1 = (Object[])localBundle.getSerializable("account.intent.extra.ACCOUNT_VERIFICATION_GROUPS");
    }
    try
    {
      Object[] arrayOfObject2 = (Object[])arrayOfObject1;
      localLinkedList = new LinkedList();
      if ((arrayOfObject2 != null) && (arrayOfObject2.length > 0))
      {
        int i = arrayOfObject2.length;
        j = 0;
        if (j >= i)
          break label234;
        localAccountVerificationGroup = (AccountVerificationGroup)arrayOfObject2[j];
        if ((localAccountVerificationGroup.getToken() != null) && (localAccountVerificationGroup.size() > 0))
        {
          AccountVerification[] arrayOfAccountVerification = localAccountVerificationGroup.getVerifications();
          int k = arrayOfAccountVerification.length;
          m = 0;
          label134: if (m >= k)
            break label210;
          if (arrayOfAccountVerification[m].getMethod() == null)
            throw new UnsupportedAccountSdkVersion();
        }
      }
    }
    catch (UnsupportedAccountSdkVersion localUnsupportedAccountSdkVersion)
    {
      LinkedList localLinkedList;
      int j;
      AccountVerificationGroup localAccountVerificationGroup;
      int m;
      com.wandoujia.account.h.a.a(getActivity(), getString(R.string.account_sdk_need_update_client_error), this.c, new cs()).show();
      label210: label234: 
      do
      {
        return;
        m++;
        break label134;
        throw new IllegalArgumentException(localAccountVerificationGroup.toString());
        localLinkedList.add(localAccountVerificationGroup);
        j++;
        break;
        throw new IllegalArgumentException();
        this.b = localLinkedList;
      }
      while ((this.b == null) || (this.b.isEmpty()));
      a(false);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(R.layout.account_sdk_verification_container, paramViewGroup, false);
  }

  public void onDetach()
  {
    a = null;
    super.onDetach();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountVerificationFragmentContainer
 * JD-Core Version:    0.6.0
 */