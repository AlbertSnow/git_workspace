package com.wandoujia.p4.imagepicker.activity;

import com.wandoujia.p4.fragment.TabHostFragment;
import com.wandoujia.p4.fragment.k;
import com.wandoujia.p4.imagepicker.fragment.CameraImageFragment;
import com.wandoujia.p4.imagepicker.fragment.ImageFolderFragment;
import java.util.ArrayList;
import java.util.List;

public class ImageChooserActivity$ImageManagerTabHostFragment extends TabHostFragment
{
  private int a;

  public final String b()
  {
    return a(this.a);
  }

  public final List<k> c()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new k(CameraImageFragment.d(), CameraImageFragment.class, getArguments()));
    localArrayList.add(new k(ImageFolderFragment.d(), ImageFolderFragment.class, getArguments()));
    return localArrayList;
  }

  public final void c(int paramInt)
  {
    this.a = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.activity.ImageChooserActivity.ImageManagerTabHostFragment
 * JD-Core Version:    0.6.0
 */