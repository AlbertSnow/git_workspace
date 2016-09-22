package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.wandoujia.p4.netcheck.controller.NetCheckController;
import com.wandoujia.p4.netcheck.controller.NetCheckController.NetcheckType;

final class e
  implements View.OnClickListener
{
  e(NetCheckEmailFragment paramNetCheckEmailFragment, EditText paramEditText, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    String str = this.a.getText().toString();
    if ((!TextUtils.isEmpty(str)) && (str.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")))
    {
      NetCheckEmailFragment.a(this.c).a(str);
      FragmentActivity localFragmentActivity = this.c.getActivity();
      if (localFragmentActivity != null)
        localFragmentActivity.getSupportFragmentManager().a().a(this.c).a();
      NetCheckEmailFragment.a(this.c).a(NetCheckController.NetcheckType.EMAIL);
      return;
    }
    ((TextView)this.b.findViewById(2131493226)).setVisibility(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.e
 * JD-Core Version:    0.6.0
 */