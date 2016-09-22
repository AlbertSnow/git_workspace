package com.wandoujia.gamepacket;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.wandoujia.api.proto.ExtensionPack;
import java.util.List;

public final class w extends BaseAdapter
{
  private final List<ExtensionPack> a;
  private int b = 0;

  public w(List<ExtensionPack> paramList)
  {
    Object localObject;
    this.a = localObject;
  }

  private ExtensionPack a(int paramInt)
  {
    if ((this.a != null) && (paramInt >= 0) && (paramInt < this.a.size()))
      return (ExtensionPack)this.a.get(paramInt);
    return null;
  }

  public final ExtensionPack a()
  {
    return a(this.b);
  }

  public final int getCount()
  {
    if (this.a == null)
      return 0;
    return this.a.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    RadioButton localRadioButton;
    if (paramView != null)
    {
      localRadioButton = (RadioButton)paramView.findViewById(R.id.extension_radioButton);
      TextView localTextView = (TextView)paramView.findViewById(R.id.extension_textview);
      String str = ((ExtensionPack)this.a.get(paramInt)).description;
      if ((!TextUtils.isEmpty(str)) && (str.contains("\n")))
      {
        String[] arrayOfString = str.split("\n");
        localRadioButton.setText(arrayOfString[0]);
        localTextView.setText(arrayOfString[1]);
      }
      localRadioButton.setClickable(false);
      if (paramInt != this.b)
        break label151;
    }
    label151: for (boolean bool = true; ; bool = false)
    {
      localRadioButton.setChecked(bool);
      paramView.setOnClickListener(new x(this, paramInt));
      return paramView;
      paramView = LayoutInflater.from(s.c(this.c)).inflate(R.layout.game_packet_gpu_select_item_view, null);
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.w
 * JD-Core Version:    0.6.0
 */