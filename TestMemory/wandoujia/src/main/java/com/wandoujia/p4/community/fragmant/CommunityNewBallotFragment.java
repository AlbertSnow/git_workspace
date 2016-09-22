package com.wandoujia.p4.community.fragmant;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.account.a;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.p4.views.CircleAsyncImageView;
import com.wandoujia.p4.views.NirvanaListPopupWindow;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;

public class CommunityNewBallotFragment extends BaseFragment
{
  private Button a;
  private Button b;
  private EditText c;
  private EditText d;
  private TextView e;
  private ImageView f;
  private CircleAsyncImageView g;
  private NirvanaListPopupWindow h;
  private String i;
  private String j;

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 == -1) && (paramInt1 == 1) && (paramIntent != null) && (isAdded()))
    {
      ArrayList localArrayList = paramIntent.getStringArrayListExtra("path_list");
      if ((localArrayList != null) && (localArrayList.size() == 1) && (!TextUtils.isEmpty((CharSequence)localArrayList.get(0))))
      {
        this.i = ((String)localArrayList.get(0));
        ImageView localImageView = this.f;
        String str = this.i;
        int k = this.f.getWidth();
        int m = this.f.getHeight();
        Bitmap.Config[] arrayOfConfig = new Bitmap.Config[1];
        arrayOfConfig[0] = Bitmap.Config.RGB_565;
        localImageView.setImageBitmap(ImageUtil.decodeBitmap(str, k, m, arrayOfConfig));
      }
    }
    else
    {
      return;
    }
    com.wandoujia.jupiter.view.p.a(getActivity(), getString(2131624459), com.wandoujia.jupiter.view.p.a).a();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903194, null);
    this.a = ((Button)localView.findViewById(2131493468));
    this.b = ((Button)localView.findViewById(2131493178));
    this.d = ((EditText)localView.findViewById(2131493469));
    this.c = ((EditText)localView.findViewById(2131493471));
    this.f = ((ImageView)localView.findViewById(2131493470));
    this.e = ((TextView)localView.findViewById(2131493102));
    this.g = ((CircleAsyncImageView)localView.findViewById(2131493466));
    localView.setOnClickListener(new o(this));
    if (a.z())
    {
      this.e.setText(a.l());
      this.g.a(a.k(), 2130837513);
    }
    if (this.h == null)
      this.h = new NirvanaListPopupWindow(getActivity());
    String[] arrayOfString = getResources().getStringArray(2131230728);
    this.h.a(new ArrayAdapter(getActivity(), 2130903494, arrayOfString));
    this.h.a(this.a);
    this.h.a(new r(this, arrayOfString));
    this.a.setOnClickListener(new s(this));
    this.f.setOnClickListener(new p(this));
    this.b.setOnClickListener(new q(this));
    return localView;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131624405));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityNewBallotFragment
 * JD-Core Version:    0.6.0
 */