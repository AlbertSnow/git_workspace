package com.wandoujia.jupiter.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

final class a
  implements DialogInterface.OnClickListener
{
  a(DetailAppHistoryFragment paramDetailAppHistoryFragment, ApkDetail paramApkDetail)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DetailAppHistoryFragment.a(this.b, this.a);
    ((AppManager)i.k().a("app")).b(DetailAppHistoryFragment.a(this.b).F().package_name, false);
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.a
 * JD-Core Version:    0.6.0
 */