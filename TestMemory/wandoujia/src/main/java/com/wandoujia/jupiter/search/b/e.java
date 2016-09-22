package com.wandoujia.jupiter.search.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager;
import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import com.wandoujia.jupiter.view.p;

final class e
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    JupiterApplication.d().f().b(SearchConst.SearchType.ALL);
    p.a(JupiterApplication.e(), 2131625244, p.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.e
 * JD-Core Version:    0.6.0
 */