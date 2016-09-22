package com.wandoujia.p4.imagepicker.fragment;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import com.wandoujia.p4.imagepicker.a.c;

final class a
  implements c
{
  a(BaseImageTabFragment paramBaseImageTabFragment)
  {
  }

  public final void a()
  {
    BaseImageTabFragment.a(this.a).setEnabled(true);
  }

  public final void a(int paramInt)
  {
    if (this.a.getActivity() != null)
    {
      Button localButton = BaseImageTabFragment.a(this.a);
      Resources localResources = this.a.getActivity().getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localButton.setText(localResources.getString(2131624945, arrayOfObject));
    }
  }

  public final void b()
  {
    BaseImageTabFragment.a(this.a).setEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.fragment.a
 * JD-Core Version:    0.6.0
 */