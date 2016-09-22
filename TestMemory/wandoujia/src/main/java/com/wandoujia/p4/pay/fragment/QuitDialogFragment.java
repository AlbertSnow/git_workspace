package com.wandoujia.p4.pay.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.pay.utils.LogEvent;

public class QuitDialogFragment extends DialogFragment
  implements View.OnClickListener
{
  private static final String ARG_KEY_MESSAGE = "quit_message";
  private static final String ARG_KEY_TITLE = "quit_title";
  private String message;
  private QuitDialogFragment.OnQuitCallback quitCallback;
  private View rootView;
  private String title;

  private static QuitDialogFragment newInstance(String paramString1, String paramString2, QuitDialogFragment.OnQuitCallback paramOnQuitCallback)
  {
    QuitDialogFragment localQuitDialogFragment = new QuitDialogFragment();
    localQuitDialogFragment.quitCallback = paramOnQuitCallback;
    Bundle localBundle = new Bundle();
    localBundle.putString("quit_message", paramString2);
    localBundle.putString("quit_title", paramString1);
    localQuitDialogFragment.setArguments(localBundle);
    return localQuitDialogFragment;
  }

  public static void showQuitDialog(FragmentActivity paramFragmentActivity, String paramString1, String paramString2, QuitDialogFragment.OnQuitCallback paramOnQuitCallback)
  {
    newInstance(paramString1, paramString2, paramOnQuitCallback).show(paramFragmentActivity.getSupportFragmentManager(), "paysdk_quit_dialog");
  }

  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (2131494082 == i)
      if (this.quitCallback != null)
      {
        LogEvent.click("cancel_pay", "yes");
        this.quitCallback.onConfirmed();
      }
    do
      return;
    while ((2131494081 != i) || ((this.quitCallback != null) && (this.quitCallback.onCancelled())));
    LogEvent.click("cancel_pay", "no");
    dismiss();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
    {
      this.title = getArguments().getString("quit_title");
      this.message = getArguments().getString("quit_message");
    }
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    Dialog localDialog = super.onCreateDialog(paramBundle);
    localDialog.requestWindowFeature(1);
    return localDialog;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.rootView = paramLayoutInflater.inflate(2130903604, paramViewGroup, false);
    ((TextView)this.rootView.findViewById(2131494078)).setText(this.title);
    ((TextView)this.rootView.findViewById(2131494079)).setText(this.message);
    this.rootView.findViewById(2131494081).setOnClickListener(this);
    this.rootView.findViewById(2131494082).setOnClickListener(this);
    return this.rootView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.QuitDialogFragment
 * JD-Core Version:    0.6.0
 */