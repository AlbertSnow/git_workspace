package com.wandoujia.p4.pay.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.wandoujia.p4.pay.PayImpl;
import com.wandoujia.p4.pay.model.PayResults;
import com.wandoujia.p4.pay.storage.LocalStorage;
import com.wandoujia.p4.pay.utils.SLog;

public class ResultFragment extends Fragment
  implements View.OnClickListener
{
  private static final String ARG_KEY_MESSAGE = "result_message";
  private static final String ARG_KEY_TITLE = "result_title";
  private static final String ARG_KEY_TYPE = "result_type";
  private Button backButton;
  private Button contactButton;
  private LocalStorage localStorage;
  private String message;
  private TextView messageView;
  private ResultFragment.OnFinishListener onFinishListener;
  private PayImpl payImpl;
  private View rootView;
  private String title;
  private TextView titleView;
  private PayResults type;

  private static ResultFragment newInstance(int paramInt, String paramString1, String paramString2, ResultFragment.OnFinishListener paramOnFinishListener)
  {
    ResultFragment localResultFragment = new ResultFragment();
    localResultFragment.onFinishListener = paramOnFinishListener;
    Bundle localBundle = new Bundle();
    localBundle.putInt("result_type", paramInt);
    localBundle.putString("result_message", paramString2);
    localBundle.putString("result_title", paramString1);
    localResultFragment.setArguments(localBundle);
    return localResultFragment;
  }

  private void queryResultMessage()
  {
    this.payImpl.queryOrderResult(PayImpl.resultUrl, new ResultFragment.4(this));
  }

  public static void showResult(FragmentActivity paramFragmentActivity, int paramInt, String paramString1, String paramString2, ResultFragment.OnFinishListener paramOnFinishListener)
  {
    if ((paramFragmentActivity == null) || (paramFragmentActivity.getSupportFragmentManager() == null))
      return;
    PayImpl.setFinishStatus(com.wandoujia.p4.pay.callback.CallbackWrapper.Status.values()[(paramInt % 3)]);
    paramFragmentActivity.getSupportFragmentManager().a().b(2131493404, newInstance(paramInt, paramString1, paramString2, paramOnFinishListener)).b();
  }

  private void toast(String paramString)
  {
    new Handler(getActivity().getMainLooper()).post(new ResultFragment.3(this, paramString));
  }

  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if ((2131494090 == i) || (2131494089 == i))
    {
      SLog.i("click", "button");
      this.onFinishListener.onFinish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
    {
      this.type = PayResults.values()[getArguments().getInt("result_type")];
      this.message = getArguments().getString("result_message");
      this.title = getArguments().getString("result_title");
    }
    this.localStorage = LocalStorage.getCurrentConfig();
    this.payImpl = PayImpl.getInstance(getActivity(), this.localStorage.getAppId());
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.rootView = paramLayoutInflater.inflate(2130903606, paramViewGroup, false);
    this.titleView = ((TextView)this.rootView.findViewById(2131494086));
    this.messageView = ((TextView)this.rootView.findViewById(2131494087));
    this.contactButton = ((Button)this.rootView.findViewById(2131494089));
    this.backButton = ((Button)this.rootView.findViewById(2131494090));
    int i;
    if (!this.localStorage.getNeedPassword())
    {
      this.titleView.setText(this.title);
      this.titleView.setCompoundDrawablesWithIntrinsicBounds(this.type.iconId(), 0, 0, 0);
      this.messageView.setText(this.message);
      Button localButton = this.contactButton;
      if (this.type.withContact())
      {
        i = 0;
        localButton.setVisibility(i);
        this.contactButton.setOnClickListener(new ResultFragment.1(this));
        this.backButton.setOnClickListener(this);
      }
    }
    while (true)
    {
      return this.rootView;
      i = 8;
      break;
      this.titleView.setVisibility(8);
      this.messageView.setVisibility(8);
      this.rootView.findViewById(2131494088).setVisibility(8);
      this.rootView.findViewById(2131494091).setVisibility(0);
      this.rootView.findViewById(2131494094).setOnClickListener(new ResultFragment.2(this));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.ResultFragment
 * JD-Core Version:    0.6.0
 */