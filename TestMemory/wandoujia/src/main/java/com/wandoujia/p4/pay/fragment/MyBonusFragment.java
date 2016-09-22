package com.wandoujia.p4.pay.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.wandoujia.p4.fragment.NetworkAsyncLoadFragment;
import com.wandoujia.p4.pay.utils.PaymentUtil;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBonusFragment extends NetworkAsyncLoadFragment
{
  private ListView bonusList;
  private View mRootView;

  private List<Map<String, Object>> getData(List<Map<String, Object>> paramList)
  {
    return paramList;
  }

  private Map<String, Object> getMap(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("game", paramString1);
    localHashMap.put("game_subtitle", paramString2);
    localHashMap.put("note", paramString3);
    localHashMap.put("img", Integer.valueOf(2130838068));
    localHashMap.put("url", paramString4);
    return localHashMap;
  }

  private void loadData()
  {
    PaymentUtil.getBonus(new MyBonusFragment.1(this));
  }

  private String toBigDecimal(Long paramLong)
  {
    return new BigDecimal(String.valueOf(paramLong)).divide(new BigDecimal("100")).toPlainString();
  }

  protected int getLayoutResId()
  {
    return 2130903599;
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    this.mRootView = paramView;
    this.bonusList = ((ListView)this.mRootView.findViewById(2131494040));
  }

  protected void onPrepareLoading()
  {
  }

  protected void onStartLoading()
  {
    loadData();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131625119));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.MyBonusFragment
 * JD-Core Version:    0.6.0
 */