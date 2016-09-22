package com.wandoujia.p4.pay.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.wandoujia.account.a;
import com.wandoujia.entities.app.RequestInfo;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.adapter.PaymentRecordsAdapter;
import com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner;
import com.wandoujia.p4.pay.feedback.ZendeskHelper;
import com.wandoujia.p4.pay.loader.Fetcher;
import com.wandoujia.p4.pay.loader.Fetcher.FetchCallback;
import com.wandoujia.p4.pay.model.RecordItemInfo;
import com.wandoujia.p4.pay.model.User;
import com.wandoujia.p4.pay.model.ZendeskModels.Ticket;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketCategoryItem;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketComment;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketCustomFieldOptionItem;
import com.wandoujia.p4.pay.model.ZendeskModels.TicketRequester;
import com.wandoujia.p4.pay.model.ZendeskModels.TicktetRequest;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;
import com.wandoujia.p4.pay.widget.ListViewSpinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedbackFragment extends Fragment
  implements View.OnClickListener
{
  private static final String BACK_STACK_TAG = "SHOW_FEEDBACK";
  private static final String CHANGE_LINE = "\n";
  private static final String FEEDBACK_KEY_COMMENTS = "feedback_comments";
  private static final String FEEDBACK_KEY_EMAIL = "feedback_email";
  private static final String FEEDBACK_MAP_KEY = "feedback_map";
  private static final int MARGIN = 5;
  private static final String TAG = FeedbackFragment.class.getSimpleName();
  private static final String ZENDESK_DEFAULT_EMAIL = "noreply@wandoujia.com";
  private static final String ZENDESK_ID_GAME = "21636784";
  private static final int ZENDESK_ID_MAIN_CATEGORY = 21330019;
  private static final String ZENDESK_ID_MOBILE = "21199120";
  private static final String ZENDESK_ID_PAYMETHOD = "21636804";
  private static final int ZENDESK_ID_SUB_CATEGORY = 21373865;
  private static final String ZENDESK_ID_WDJ_ACCOUNT = "21636774";
  private String category;
  private List<ZendeskModels.TicketCategoryItem> categoryChildrenItems;
  private List<ZendeskModels.TicketCategoryItem> categoryItems;
  String currentFeedbackBasicInfo;
  String currentFeedbackGame;
  String currentFeedbackOrderChannel;
  String currentFeedbackOrderId;
  String currentFeeddbackContent = "";
  String currentMainCategoryValue;
  private List<RecordItemInfo> currentRecordList;
  private List<List<String>> details;
  private TextView feedbackTitle;
  private Fetcher fetcher;
  private boolean isOthers;
  private int lastTryFetch;
  private LocalStorage localStorage;
  Fetcher.FetchCallback mFetchCallback = new FeedbackFragment.3(this);
  AdapterView.OnItemClickListener mOnItemClickListener = new FeedbackFragment.2(this);
  private EditText otherFeedbackDescription;
  private PaymentRecordsAdapter paymentRecordsAdapter;
  private EditText phoneInput;
  private EditText qqInput;
  private ListViewSpinner questionedOrderSelector;
  private EditText roleInput;
  private View rootView;
  private FeedbackCategorySpinner spinner;
  private EditText zoneInput;

  private ZendeskModels.TicktetRequest buildAndSendTicktetRequest(Map<String, String> paramMap)
  {
    if ((paramMap == null) || (paramMap.isEmpty()))
      return null;
    ZendeskModels.Ticket localTicket = new ZendeskModels.Ticket();
    Set localSet = paramMap.entrySet();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localSet.iterator();
    while (true)
    {
      Map.Entry localEntry;
      String str1;
      String str2;
      if (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        str1 = (String)localEntry.getKey();
        str2 = (String)localEntry.getValue();
        if (TextUtils.isEmpty(str2))
          continue;
        if ("feedback_comments".equals(localEntry.getKey()))
        {
          ZendeskModels.TicketComment localTicketComment = new ZendeskModels.TicketComment();
          localTicketComment.setBody(str2);
          localTicket.setComment(localTicketComment);
        }
      }
      while (true)
      {
        SLog.d(TAG, (String)localEntry.getKey() + "--->" + (String)localEntry.getValue());
        break;
        if ("feedback_email".equals(str1))
        {
          ZendeskModels.TicketRequester localTicketRequester = new ZendeskModels.TicketRequester();
          localTicketRequester.setName(str2);
          localTicketRequester.setEmail(str2);
          localTicket.setRequester(localTicketRequester);
          continue;
        }
        try
        {
          int i = Integer.parseInt(str1);
          localArrayList.add(new ZendeskModels.TicketCustomFieldOptionItem(i, str2));
          continue;
          localArrayList.add(new ZendeskModels.TicketCustomFieldOptionItem(21330019, this.currentMainCategoryValue));
          localArrayList.add(new ZendeskModels.TicketCustomFieldOptionItem(21373865, this.category));
          localTicket.setCustom_fields(localArrayList);
          localTicket.setSubject(getString(2131625743));
          ZendeskModels.TicktetRequest localTicktetRequest = new ZendeskModels.TicktetRequest();
          localTicktetRequest.setTicket(localTicket);
          ZendeskHelper.getInstance().submitTicket(localTicktetRequest, RequestInfo.PAYMENT_ZENDESK_CREATE_TICKET.getURL(), false);
          getActivity().onBackPressed();
          return localTicktetRequest;
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
      }
    }
  }

  private String getAdditionalAccountInfo(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("\n豌豆荚账号: ");
    if ("noreply@wandoujia.com".equals(paramString))
    {
      str = getCurrentUserName();
      if (!TextUtils.isEmpty(str));
    }
    for (String str = "未知"; ; str = paramString)
      return str;
  }

  private String getCurrentUserName()
  {
    User localUser = this.localStorage.getUser();
    String str = null;
    if (localUser != null)
      str = this.localStorage.getUser().getUsername();
    return str;
  }

  private String getEmailAsUserName()
  {
    String str = getCurrentUserName();
    if (!FeedbackFragment.EmailValidator.getInstance().validate(str))
      str = "noreply@wandoujia.com";
    return str;
  }

  private String getGameName()
  {
    if ((this.isOthers) || (TextUtils.isEmpty(this.currentFeedbackGame)))
    {
      PackageManager localPackageManager = getActivity().getPackageManager();
      try
      {
        str = (String)localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo(getActivity().getApplicationInfo().packageName, 0));
        if (TextUtils.isEmpty(str))
          str = "通过豌豆荚手机客户端";
        return str;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
          String str = null;
      }
    }
    return this.currentFeedbackGame;
  }

  private void initServiceContactInfoViews()
  {
    TextView localTextView = (TextView)this.rootView.findViewById(2131494075);
    localTextView.setText(Html.fromHtml("电话：<font color=\"blue\"><u>400-0980-888</u></font>"));
    localTextView.setOnClickListener(this);
    ((TextView)this.rootView.findViewById(2131494076)).setText("SDK版本 " + this.localStorage.getSdkVersion());
  }

  private void loadCategoies()
  {
    this.categoryItems = ZendeskHelper.getInstance().getCategoies(getActivity(), 21330019);
    this.categoryChildrenItems = ZendeskHelper.getInstance().getCategoies(getActivity(), 21373865);
    ArrayList localArrayList1 = new ArrayList();
    this.details = new ArrayList();
    Iterator localIterator1 = this.categoryItems.iterator();
    while (localIterator1.hasNext())
    {
      ZendeskModels.TicketCategoryItem localTicketCategoryItem1 = (ZendeskModels.TicketCategoryItem)localIterator1.next();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator2 = this.categoryChildrenItems.iterator();
      while (localIterator2.hasNext())
      {
        ZendeskModels.TicketCategoryItem localTicketCategoryItem2 = (ZendeskModels.TicketCategoryItem)localIterator2.next();
        if (!localTicketCategoryItem2.getValue().startsWith(localTicketCategoryItem1.getValue()))
          continue;
        localArrayList2.add(localTicketCategoryItem2.getName());
      }
      this.details.add(localArrayList2);
      localArrayList1.add(localTicketCategoryItem1.getName());
    }
    this.spinner.setData(localArrayList1, this.details, null);
  }

  private void preLoadOrders()
  {
    ListView localListView = this.questionedOrderSelector.getListView();
    View localView = LayoutInflater.from(getActivity()).inflate(2130903601, null);
    localListView.addFooterView(localView);
    localView.setOnClickListener(this);
    this.paymentRecordsAdapter = new PaymentRecordsAdapter(getActivity(), 2);
    this.questionedOrderSelector.setAdapter(this.paymentRecordsAdapter);
    this.fetcher = new Fetcher(this.mFetchCallback);
    localListView.setOnScrollListener(new FeedbackFragment.1(this));
    localListView.setOnItemClickListener(this.mOnItemClickListener);
    this.fetcher.fetch();
  }

  public static void showFeedback(FragmentActivity paramFragmentActivity)
  {
    paramFragmentActivity.getSupportFragmentManager().a().b(2131493404, new FeedbackFragment()).a("SHOW_FEEDBACK").a();
  }

  private void showToast(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    p.a(getActivity(), paramString, p.b).a();
  }

  String getOrderFeedbackContent(RecordItemInfo paramRecordItemInfo)
  {
    String str1 = paramRecordItemInfo.price;
    if (TextUtils.isEmpty(str1));
    for (String str2 = "0"; ; str2 = String.valueOf(Long.parseLong(str1) / 100.0D))
    {
      this.currentFeedbackOrderId = paramRecordItemInfo.wandouOrder;
      this.currentFeedbackGame = paramRecordItemInfo.gameName;
      this.currentFeedbackOrderChannel = paramRecordItemInfo.channel;
      Object[] arrayOfObject1 = new Object[6];
      arrayOfObject1[0] = paramRecordItemInfo.gameName;
      arrayOfObject1[1] = paramRecordItemInfo.itemName;
      arrayOfObject1[2] = str2;
      arrayOfObject1[3] = paramRecordItemInfo.status;
      arrayOfObject1[4] = paramRecordItemInfo.channel;
      arrayOfObject1[5] = paramRecordItemInfo.dateString;
      this.currentFeedbackBasicInfo = getString(2131625749, arrayOfObject1);
      StringBuilder localStringBuilder1 = new StringBuilder(this.currentFeedbackBasicInfo).append("\n");
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = paramRecordItemInfo.wandouOrder;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(getString(2131625750, arrayOfObject2));
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramRecordItemInfo.orderInGame;
      return getString(2131625736, arrayOfObject3);
    }
  }

  String loadRecords(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    String str1 = this.localStorage.getAppId();
    boolean bool = a.z();
    Object localObject1 = null;
    JSONObject localJSONObject;
    if (bool)
      localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appkey", this.localStorage.getAppId());
      localJSONObject.put("uid", this.localStorage.getUser().getUid());
      localJSONObject.put("wdj_auth", this.localStorage.getAuth());
      localJSONObject.put("tradestatus", "SERVERFINISH");
      localJSONObject.put("max", paramInt3);
      localJSONObject.put("startnum", paramInt2);
      String str3 = PayImpl.ORDER_QUERY_ALL_URL;
      if (paramInt1 == 0)
        str3 = PayImpl.RECHARGE_RECORDS_QUERY_ALL_URL;
      PayImpl.getInstance(paramContext, str1);
      String str4 = PayImpl.post(str3, localJSONObject.toString(), this.localStorage.getSecretKey());
      localObject1 = str4;
      String str2 = TAG;
      if (localObject1 != null);
      for (Object localObject2 = localObject1; ; localObject2 = "No records found.")
      {
        SLog.i(str2, (String)localObject2);
        return localObject1;
      }
    }
    catch (Exception localException)
    {
      while (true)
        localObject1 = null;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localObject1 = null;
    }
  }

  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (2131494075 == i)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("android.intent.action.DIAL");
      localIntent.setData(Uri.parse("tel:4000980888"));
      getActivity().startActivity(localIntent);
    }
    do
    {
      return;
      if (2131494077 != i)
        continue;
      ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      if (this.isOthers);
      String str3;
      String str4;
      String str5;
      for (String str2 = ""; ; str2 = this.currentFeeddbackContent)
      {
        str3 = str2 + "\n" + this.otherFeedbackDescription.getText().toString();
        str4 = this.phoneInput.getText().toString();
        str5 = this.qqInput.getText().toString();
        if ((!TextUtils.isEmpty(str3)) && (str3.length() >= 3))
          break;
        showToast("请填写完整的问题信息");
        return;
      }
      if ((TextUtils.isEmpty(str4)) || (str4.trim().length() != 11))
      {
        showToast("请填写正确的手机号");
        return;
      }
      if ((TextUtils.isEmpty(str5)) || (str5.length() < 3))
      {
        showToast("请填写正确的QQ号");
        return;
      }
      String str6 = getGameName();
      String str7 = getEmailAsUserName();
      StringBuilder localStringBuilder = new StringBuilder("您好,\n您运营的游戏「");
      localStringBuilder.append(str6).append("」收到玩家投诉，投诉信息如下:\n反馈内容:\n").append(str3).append(getAdditionalAccountInfo(str7)).append("\n用户 QQ: ").append(str5).append("\n游戏角色: ").append(this.roleInput.getText().toString()).append("\n所在分区: ").append(this.zoneInput.getText().toString()).append("\n为保障用户权益，请立即处理，豌豆荚真诚地感谢您的支持。");
      HashMap localHashMap = new HashMap();
      if (this.isOthers);
      for (String str8 = "unknown"; ; str8 = this.currentFeedbackOrderChannel)
      {
        localHashMap.put("21636804", str8);
        localHashMap.put("21199120", this.phoneInput.getText().toString());
        localHashMap.put("21636774", str7);
        localHashMap.put("21636784", str6);
        localHashMap.put("feedback_email", str7);
        localHashMap.put("feedback_comments", localStringBuilder.toString());
        buildAndSendTicktetRequest(localHashMap);
        return;
      }
    }
    while (2131494046 != i);
    this.currentFeedbackOrderId = "0";
    String str1 = getText(2131624776).toString();
    this.currentFeedbackBasicInfo = str1;
    this.currentFeeddbackContent = str1;
    this.questionedOrderSelector.setText(this.currentFeedbackBasicInfo);
    this.questionedOrderSelector.disMiss();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.localStorage = LocalStorage.getCurrentConfig();
    this.rootView = paramLayoutInflater.inflate(2130903603, null);
    this.spinner = ((FeedbackCategorySpinner)this.rootView.findViewById(2131494063));
    this.spinner.setOnChildClickListener(new FeedbackFragment.CategorySpinnerSelectedListener(this));
    this.feedbackTitle = ((TextView)this.rootView.findViewById(2131494064));
    this.questionedOrderSelector = ((ListViewSpinner)this.rootView.findViewById(2131494066));
    this.questionedOrderSelector.setText(2131624777);
    this.otherFeedbackDescription = ((EditText)this.rootView.findViewById(2131494067));
    updateFeedbackDescriptionUI();
    initServiceContactInfoViews();
    this.phoneInput = ((EditText)this.rootView.findViewById(2131494069));
    this.qqInput = ((EditText)this.rootView.findViewById(2131494070));
    this.roleInput = ((EditText)this.rootView.findViewById(2131494072));
    this.zoneInput = ((EditText)this.rootView.findViewById(2131494073));
    this.rootView.findViewById(2131494077).setOnClickListener(this);
    loadCategoies();
    preLoadOrders();
    return this.rootView;
  }

  public void updateFeedbackDescriptionUI()
  {
    TextView localTextView = this.feedbackTitle;
    int i;
    ListViewSpinner localListViewSpinner;
    if (this.isOthers)
    {
      i = 2131625235;
      localTextView.setText(i);
      localListViewSpinner = this.questionedOrderSelector;
      if (!this.isOthers)
        break label51;
    }
    label51: for (int j = 8; ; j = 0)
    {
      localListViewSpinner.setVisibility(j);
      return;
      i = 2131625303;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.FeedbackFragment
 * JD-Core Version:    0.6.0
 */