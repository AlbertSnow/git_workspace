package com.wandoujia.p4.pay.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import java.util.List;
import java.util.Map;

class MyBonusFragment$BonusAdapter extends BaseAdapter
{
  private List<? extends Map<String, ?>> listData;
  private LayoutInflater mInflater;

  public MyBonusFragment$BonusAdapter(Context paramContext, List<? extends Map<String, ?>> paramList)
  {
    this.listData = paramList;
    this.mInflater = LayoutInflater.from(paramContext);
  }

  public int getCount()
  {
    return this.listData.size();
  }

  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    MyBonusFragment.BonusAdapter.ViewHolder localViewHolder;
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130903600, null);
      localViewHolder = new MyBonusFragment.BonusAdapter.ViewHolder();
      localViewHolder.title = ((TextView)paramView.findViewById(2131494042));
      localViewHolder.info = ((TextView)paramView.findViewById(2131494043));
      localViewHolder.icon = ((AsyncImageView)paramView.findViewById(2131494041));
      localViewHolder.date = ((TextView)paramView.findViewById(2131494045));
      paramView.setTag(localViewHolder);
    }
    while (true)
    {
      localViewHolder.title.setText(((Map)this.listData.get(paramInt)).get("game").toString());
      localViewHolder.info.setText(((Map)this.listData.get(paramInt)).get("game_subtitle").toString());
      localViewHolder.date.setText(((Map)this.listData.get(paramInt)).get("note").toString());
      String str = (String)((Map)this.listData.get(paramInt)).get("url");
      if (!TextUtils.isEmpty(str))
        localViewHolder.icon.a(str, 2130838068);
      return paramView;
      localViewHolder = (MyBonusFragment.BonusAdapter.ViewHolder)paramView.getTag();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.MyBonusFragment.BonusAdapter
 * JD-Core Version:    0.6.0
 */