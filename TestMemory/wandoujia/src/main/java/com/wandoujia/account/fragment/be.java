package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.Toast;
import com.wandoujia.account.R.string;
import com.wandoujia.account.h.k;

final class be
  implements k
{
  be(AccountModifyProfileFragment paramAccountModifyProfileFragment)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    if ((this.a.getActivity() == null) || (!this.a.isAdded()))
      return;
    if (this.a.e != null)
      this.a.e.dismiss();
    Toast.makeText(this.a.getActivity(), R.string.account_sdk_avatar_upload_success, 0).show();
    AccountModifyProfileFragment.g(this.a);
    if (paramBitmap != null)
      AccountModifyProfileFragment.h(this.a).setBackgroundDrawable(new BitmapDrawable(this.a.getResources(), paramBitmap));
    if (this.a.getActivity() != null)
    {
      Intent localIntent = new Intent("account.intent.action.MODIFY_SUCCESS");
      this.a.getActivity().sendBroadcast(localIntent);
    }
    AccountModifyProfileFragment.g();
  }

  public final void a(String paramString)
  {
    if ((this.a.getActivity() == null) || (!this.a.isAdded()))
      return;
    if (this.a.e != null)
      this.a.e.dismiss();
    if (TextUtils.isEmpty(paramString))
      paramString = this.a.getActivity().getString(R.string.account_sdk_avatar_upload_failed);
    Toast.makeText(this.a.getActivity(), paramString, 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.be
 * JD-Core Version:    0.6.0
 */