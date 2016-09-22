package com.wandoujia.p4.feedback.zendesk;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.entities.app.RequestInfo;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.http.b.aa;
import com.wandoujia.p4.http.b.q;
import com.wandoujia.p4.http.request.a.c;
import com.wandoujia.p4.http.request.a.g;
import com.wandoujia.p4.http.request.a.h;
import com.wandoujia.udid.UDIDUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class a
{
  private static a a;
  private int b = 0;
  private final List<WeakReference<k>> c = new ArrayList();

  public static a a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new a();
      a locala = a;
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static List<ZendeskModels.TicketCategoryItem> a(Context paramContext, String paramString)
  {
    aa localaa = new aa();
    ((g)localaa.getRequestBuilder()).a(paramString);
    try
    {
      ZendeskModels.TicketFieldResponse localTicketFieldResponse = (ZendeskModels.TicketFieldResponse)com.wandoujia.p4.a.b().execute(localaa);
      if (localTicketFieldResponse != null)
      {
        ZendeskModels.TicketField localTicketField = localTicketFieldResponse.getTicket_field();
        if (localTicketField != null)
        {
          List localList = localTicketField.getCustom_field_options();
          return localList;
        }
      }
    }
    catch (ExecutionException localExecutionException)
    {
    }
    String[] arrayOfString2;
    String[] arrayOfString1;
    if ("first".equals(paramString))
    {
      arrayOfString2 = paramContext.getResources().getStringArray(2131230737);
      arrayOfString1 = paramContext.getResources().getStringArray(2131230738);
    }
    while (true)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (true)
        if (i < arrayOfString2.length)
        {
          ZendeskModels.TicketCategoryItem localTicketCategoryItem = new ZendeskModels.TicketCategoryItem();
          localTicketCategoryItem.setName(arrayOfString2[i]);
          localTicketCategoryItem.setValue(arrayOfString1[i]);
          localArrayList.add(localTicketCategoryItem);
          i++;
          continue;
          if (!"second".equals(paramString))
            break label194;
          arrayOfString2 = paramContext.getResources().getStringArray(2131230739);
          arrayOfString1 = paramContext.getResources().getStringArray(2131230740);
          break;
        }
      return localArrayList;
      label194: arrayOfString1 = null;
      arrayOfString2 = null;
    }
  }

  private static String b(long paramLong)
  {
    String str = android.support.v4.app.b.I("we're#1" + paramLong);
    if (str.length() > 8)
      str = str.substring(0, 8);
    return str;
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, HashMap<String, String> paramHashMap)
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
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(23722073, paramString1));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22314242, UDIDUtil.a(paramContext)));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22332467, SystemUtil.getSdkReleaseVersion()));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22320093, SystemUtil.getVersionName(paramContext.getApplicationContext()) + "." + SystemUtil.getVersionCode(paramContext.getApplicationContext())));
      localArrayList1.add(new ZendeskModels.TicketCustomFieldOptionItem(22320083, Build.MODEL));
      localTicket.setCustom_fields(localArrayList1);
      if (paramHashMap != null)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(paramHashMap.get("PARAM_DATA_ID"));
        localArrayList2.add(paramHashMap.get("PARAM_DATA_NAME"));
        localArrayList2.add(paramHashMap.get("PARAM_DATA_TYPE"));
        localTicket.setTags(localArrayList2);
      }
      ZendeskModels.TicketRequest localTicketRequest = new ZendeskModels.TicketRequest();
      localTicketRequest.setTicket(localTicket);
      ThreadPool.execute(new e(this, RequestInfo.ZENDESK_CREATE_TICKET.getURL(), localTicketRequest));
      return;
    }
  }

  public final void a(k paramk)
  {
    if (paramk == null)
      return;
    synchronized (this.c)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
        if (paramk.equals((k)((WeakReference)localIterator.next()).get()))
          return;
    }
    this.c.add(new WeakReference(paramk));
    monitorexit;
  }

  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    ThreadPool.execute(new b(paramLong1, paramLong2, paramString));
  }

  public final int b()
  {
    return this.b;
  }

  public final void c()
  {
    this.b = (-1 + this.b);
  }

  public final List<ZendeskModels.AuditsBundle> d()
  {
    this.b = 0;
    ArrayList localArrayList1 = new ArrayList();
    List localList1 = Config.n();
    ZendeskModels.AuditsBundle[] arrayOfAuditsBundle = new ZendeskModels.AuditsBundle[localList1.size()];
    for (int i = 0; i < localList1.size(); i++)
    {
      long l2 = ((Long)localList1.get(i)).longValue();
      long l3 = System.currentTimeMillis();
      q localq = new q();
      ((c)localq.getRequestBuilder()).a(l2).a(b(l3)).a(Long.valueOf(l3));
      localArrayList1.add(com.wandoujia.p4.a.b().executeAsync(localq, null));
    }
    int j = 0;
    int k = 0;
    if (k < localArrayList1.size());
    while (true)
    {
      int i7;
      try
      {
        ZendeskModels.AuditsBundle localAuditsBundle = (ZendeskModels.AuditsBundle)((Future)localArrayList1.get(k)).get();
        if ((localAuditsBundle == null) || (localAuditsBundle.getAudits() == null))
          break label521;
        long l1 = ((ZendeskModels.Audits)localAuditsBundle.getAudits().get(0)).getTicket_id();
        List localList2 = localAuditsBundle.getAudits();
        i1 = 0;
        if (i1 >= localList2.size())
          continue;
        List localList3 = ((ZendeskModels.Audits)localList2.get(i1)).getEvents();
        int i5 = 1;
        i6 = 1;
        i7 = 0;
        if (i7 >= localList3.size())
          break label514;
        if (((ZendeskModels.Event)localList3.get(i7)).isPublic_())
          continue;
        localList2.remove(i1);
        i8 = i1 - 1;
        i5 = 0;
        if ((i6 == 0) || (i5 == 0))
          break label535;
        localList2.remove(i8);
        i8--;
        break label535;
        if (TextUtils.isEmpty(((ZendeskModels.Event)localList3.get(i7)).getBody()))
          break label507;
        i9 = 0;
        break label544;
        localAuditsBundle.setAudits(localList2);
        int i2 = 0;
        if (i2 >= localList1.size())
          continue;
        if (l1 != ((Long)localList1.get(i2)).longValue())
          continue;
        arrayOfAuditsBundle[i2] = localAuditsBundle;
        int i3 = Config.d(l1);
        int i4 = localAuditsBundle.getAudits().size();
        if (i3 >= i4)
          continue;
        j++;
        n = j;
        break label525;
        i2++;
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
        n = j;
      }
      catch (ExecutionException localExecutionException)
      {
        n = j;
      }
      ArrayList localArrayList2 = new ArrayList();
      for (int m = -1 + arrayOfAuditsBundle.length; m >= 0; m--)
      {
        if (arrayOfAuditsBundle[m] == null)
          continue;
        localArrayList2.add(arrayOfAuditsBundle[m]);
      }
      this.b = j;
      return localArrayList2;
      label507: int i9 = i6;
      break label544;
      label514: int i8 = i1;
      continue;
      label521: int n = j;
      label525: k++;
      j = n;
      break;
      label535: int i1 = i8 + 1;
      continue;
      label544: i7++;
      int i6 = i9;
    }
  }

  public final void e()
  {
    ThreadPool.execute(new j(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.a
 * JD-Core Version:    0.6.0
 */