package com.wandoujia.p4.pay.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wandoujia.p4.pay.model.RecordItemInfo;
import java.util.ArrayList;
import java.util.List;

public class PaymentRecordsAdapter extends BaseAdapter
{
  private Context context;
  private List<RecordItemInfo> mRecordInfoList = new ArrayList();
  private int type;

  public PaymentRecordsAdapter(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    this.type = paramInt;
  }

  private void updateRecordItem(PaymentRecordsAdapter.RecordItemViewHolder paramRecordItemViewHolder, RecordItemInfo paramRecordItemInfo)
  {
    String str1 = paramRecordItemInfo.price;
    String str2;
    TextView localTextView2;
    StringBuilder localStringBuilder2;
    if (TextUtils.isEmpty(str1))
    {
      str2 = "0";
      TextView localTextView1 = paramRecordItemViewHolder.mRecordInfoView;
      Context localContext1 = this.context;
      Object[] arrayOfObject1 = new Object[6];
      arrayOfObject1[0] = paramRecordItemInfo.gameName;
      arrayOfObject1[1] = paramRecordItemInfo.itemName;
      arrayOfObject1[2] = str2;
      arrayOfObject1[3] = paramRecordItemInfo.status;
      arrayOfObject1[4] = paramRecordItemInfo.channel;
      arrayOfObject1[5] = paramRecordItemInfo.dateString;
      localTextView1.setText(localContext1.getString(2131625749, arrayOfObject1));
      localTextView2 = paramRecordItemViewHolder.mRecordNoView;
      StringBuilder localStringBuilder1 = new StringBuilder();
      Context localContext2 = this.context;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = paramRecordItemInfo.wandouOrder;
      localStringBuilder2 = localStringBuilder1.append(localContext2.getString(2131625750, arrayOfObject2));
      if (this.type != 0)
        break label190;
    }
    label190: Context localContext3;
    Object[] arrayOfObject3;
    for (String str3 = ""; ; str3 = localContext3.getString(2131625736, arrayOfObject3))
    {
      localTextView2.setText(str3);
      return;
      str2 = String.valueOf(Long.parseLong(str1) / 100.0D);
      break;
      localContext3 = this.context;
      arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramRecordItemInfo.orderInGame;
    }
  }

  public int getCount()
  {
    return this.mRecordInfoList.size();
  }

  public RecordItemInfo getItem(int paramInt)
  {
    return (RecordItemInfo)this.mRecordInfoList.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = newRecordItemView();
    updateRecordItem((PaymentRecordsAdapter.RecordItemViewHolder)paramView.getTag(), getItem(paramInt));
    return paramView;
  }

  View newRecordItemView()
  {
    View localView = LayoutInflater.from(this.context).inflate(2130903609, null);
    localView.setTag(new PaymentRecordsAdapter.RecordItemViewHolder(localView));
    return localView;
  }

  public int update(List<RecordItemInfo> paramList, boolean paramBoolean)
  {
    if (paramBoolean)
      this.mRecordInfoList.clear();
    if ((paramList != null) && (paramList.size() > 0))
      this.mRecordInfoList.addAll(paramList);
    notifyDataSetChanged();
    return this.mRecordInfoList.size();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.adapter.PaymentRecordsAdapter
 * JD-Core Version:    0.6.0
 */