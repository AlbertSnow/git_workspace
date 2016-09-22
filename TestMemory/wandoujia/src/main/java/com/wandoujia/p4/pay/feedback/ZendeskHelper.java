package com.wandoujia.p4.pay.feedback;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketCategoryItem;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketChildrenField;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketField;
import com.wandoujia.p4.pay.model.ZendeskModels.TicktetRequest;
import com.wandoujia.p4.pay.model.ZendeskModels.TicktetRequestBuidler;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.ExternUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ZendeskHelper
{
  public static final String CATEGORY_CHILDREN = "second";
  public static final int CATEGORY_CHILDREN_FIELD_ID = 23722073;
  public static final String CATEGORY_CUSTOM = "first";
  public static final int CATEGORY_CUSTOM_FIELD_ID = 23722053;
  public static final int MODEL_CUSTOM_FIELD_ID = 22320083;
  public static final int PAYMENT_CATEGORY_CHILDREN_FIELD_ID = 21373865;
  public static final int PAYMENT_CATEGORY_CUSTOM_FIELD_ID = 21330019;
  public static final int SDK_CUSTOM_FIELD_ID = 22332467;
  public static final int UDID_CUSTOM_FIELD_ID = 22314242;
  public static final int VERSION_CODE_CUSTOM_FIELD_ID = 22320093;
  private static ZendeskHelper instance;
  private static Handler mainThreadHandler = new Handler(Looper.getMainLooper());
  private final List<WeakReference<ZendeskHelper.OnFeedbackCommentSizeChangeListener>> sizeListeners = new ArrayList();
  private int unreadedTicketSize = 0;

  private String genSignature(long paramLong)
  {
    String str = b.I("we're#1" + paramLong);
    if (str.length() > 8)
      str = str.substring(0, 8);
    return str;
  }

  private String genSignituredUrl(String paramString, long paramLong)
  {
    String str = genSignature(paramLong);
    return paramString + "?signiture=" + str + "&timestamp=" + paramLong;
  }

  public static ZendeskHelper getInstance()
  {
    monitorenter;
    try
    {
      if (instance == null)
        instance = new ZendeskHelper();
      ZendeskHelper localZendeskHelper = instance;
      return localZendeskHelper;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void submitTicket(ZendeskModels.TicktetRequest paramTicktetRequest)
  {
    submitTicket(paramTicktetRequest, RequestInfo.ZENDESK_CREATE_TICKET.getURL(), true);
  }

  public void addFeedbackCommentSizeChangeListener(ZendeskHelper.OnFeedbackCommentSizeChangeListener paramOnFeedbackCommentSizeChangeListener)
  {
    if (paramOnFeedbackCommentSizeChangeListener == null)
      return;
    synchronized (this.sizeListeners)
    {
      Iterator localIterator = this.sizeListeners.iterator();
      while (localIterator.hasNext())
        if (paramOnFeedbackCommentSizeChangeListener.equals((ZendeskHelper.OnFeedbackCommentSizeChangeListener)((WeakReference)localIterator.next()).get()))
          return;
    }
    this.sizeListeners.add(new WeakReference(paramOnFeedbackCommentSizeChangeListener));
    monitorexit;
  }

  public void decreaseUnreadedTickedSize()
  {
    this.unreadedTicketSize = (-1 + this.unreadedTicketSize);
  }

  public List<ZendeskModels.TicketCategoryItem> getCategoies(Context paramContext, int paramInt)
  {
    LocalStorage localLocalStorage = LocalStorage.getCurrentConfig();
    if ((TextUtils.isEmpty(localLocalStorage.getFeedbackChildrenCategoryList())) && (!TextUtils.isEmpty(localLocalStorage.getFeedbackCategoryList())))
      localLocalStorage.setFeedbackCategoryList(null);
    ThreadPool.execute(new ZendeskHelper.1(this, paramContext, paramInt, localLocalStorage));
    String[] arrayOfString1;
    String[] arrayOfString2;
    if ((paramInt == 23722053) || (paramInt == 21330019))
    {
      ZendeskModels.TicketField localTicketField = (ZendeskModels.TicketField)ExternUtil.fromJson(localLocalStorage.getFeedbackCategoryList(), ZendeskModels.TicketField.class);
      if (localTicketField != null)
        return localTicketField.getCustom_field_options();
      arrayOfString1 = paramContext.getResources().getStringArray(2131230754);
      arrayOfString2 = paramContext.getResources().getStringArray(2131230755);
    }
    while (true)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (true)
        if (i < arrayOfString1.length)
        {
          ZendeskModels.TicketCategoryItem localTicketCategoryItem = new ZendeskModels.TicketCategoryItem();
          localTicketCategoryItem.setName(arrayOfString1[i]);
          localTicketCategoryItem.setValue(arrayOfString2[i]);
          localArrayList.add(localTicketCategoryItem);
          i++;
          continue;
          if ((paramInt != 23722073) && (paramInt != 21373865))
            break label232;
          ZendeskModels.TicketChildrenField localTicketChildrenField = (ZendeskModels.TicketChildrenField)ExternUtil.fromJson(localLocalStorage.getFeedbackChildrenCategoryList(), ZendeskModels.TicketChildrenField.class);
          if (localTicketChildrenField != null)
            return localTicketChildrenField.getCustom_field_options();
          arrayOfString1 = paramContext.getResources().getStringArray(2131230756);
          arrayOfString2 = paramContext.getResources().getStringArray(2131230757);
          break;
        }
      return localArrayList;
      label232: arrayOfString2 = null;
      arrayOfString1 = null;
    }
  }

  public int getUnreadedTicketSize()
  {
    return this.unreadedTicketSize;
  }

  public void sendTicket(Context paramContext, String paramString1, String paramString2, String paramString3, HashMap<String, String> paramHashMap)
  {
    submitTicket(ZendeskModels.TicktetRequestBuidler.build(paramContext, paramString1, paramString2, paramString3, paramHashMap));
  }

  public void submitTicket(ZendeskModels.TicktetRequest paramTicktetRequest, String paramString, boolean paramBoolean)
  {
    ThreadPool.execute(new ZendeskHelper.2(this, paramString, paramTicktetRequest));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.ZendeskHelper
 * JD-Core Version:    0.6.0
 */