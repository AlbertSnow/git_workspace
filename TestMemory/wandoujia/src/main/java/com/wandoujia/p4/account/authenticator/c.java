package com.wandoujia.p4.account.authenticator;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

final class c extends AbstractThreadedSyncAdapter
{
  public c(Context paramContext)
  {
    super(paramContext, true);
  }

  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.authenticator.c
 * JD-Core Version:    0.6.0
 */