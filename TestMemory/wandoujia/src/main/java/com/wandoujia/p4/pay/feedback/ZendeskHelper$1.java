package com.wandoujia.p4.pay.feedback;

import android.content.Context;
import com.wandoujia.p4.pay.httpapi.PayHttp;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketFieldResponse;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ExternUtil;

class ZendeskHelper$1
  implements Runnable
{
  public void run()
  {
    System.currentTimeMillis();
    try
    {
      ZendeskModels.TicketFieldResponse localTicketFieldResponse = PayHttp.getTicketFieldResponse(this.val$context);
      if ((localTicketFieldResponse != null) && (localTicketFieldResponse.getTicket_field() != null))
      {
        if ((this.val$categoryId == 23722053) || (this.val$categoryId == 21330019))
        {
          this.val$localStorage.setFeedbackCategoryList(ExternUtil.toJson(localTicketFieldResponse.getTicket_field()));
          return;
        }
        if ((this.val$categoryId == 23722073) || (this.val$categoryId == 21373865))
        {
          this.val$localStorage.setFeedbackChildrenCategoryList(ExternUtil.toJson(localTicketFieldResponse.getTicket_field()));
          return;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.ZendeskHelper.1
 * JD-Core Version:    0.6.0
 */