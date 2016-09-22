package com.wandoujia.p4.pay.model;

import android.content.Context;
import android.os.Build;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.pay.utils.ExternUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZendeskModels$TicktetRequestBuidler
{
  private static final int SUBJECT_LENGTH = 50;

  public static ZendeskModels.TicktetRequest build(Context paramContext, String paramString1, String paramString2, String paramString3, HashMap<String, String> paramHashMap)
  {
    ZendeskModels.Ticket localTicket = new ZendeskModels.Ticket();
    if ((paramString3 != null) && (paramString3.length() > 50));
    for (String str = paramString3.substring(0, 50); ; str = paramString3)
    {
      localTicket.setSubject(str);
      ZendeskModels.TicketComment localTicketComment = new ZendeskModels.TicketComment();
      localTicketComment.setBody(paramString3);
      localTicket.setComment(localTicketComment);
      ZendeskModels.TicketRequester localTicketRequester = new ZendeskModels.TicketRequester();
      localTicketRequester.setName(paramString2);
      localTicketRequester.setEmail(paramString2);
      localTicket.setRequester(localTicketRequester);
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(23722053, paramString1));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22314242, ExternUtil.getUDID(paramContext)));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22332467, SystemUtil.getSdkReleaseVersion()));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22320093, SystemUtil.getVersionName(paramContext.getApplicationContext()) + "." + SystemUtil.getVersionCode(paramContext.getApplicationContext())));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22320083, Build.MODEL));
      localTicket.setCustom_fields(localArrayList1);
      if (paramHashMap != null)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(paramHashMap.get("PARAM_MEDIA_ID"));
        localArrayList2.add(paramHashMap.get("PARAM_MEDIA_NAME"));
        localTicket.setTags(localArrayList2);
      }
      ZendeskModels.TicktetRequest localTicktetRequest = new ZendeskModels.TicktetRequest();
      localTicktetRequest.setTicket(localTicket);
      return localTicktetRequest;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.ZendeskModels.TicktetRequestBuidler
 * JD-Core Version:    0.6.0
 */