package com.wandoujia.p4.community.views;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.jupiter.imageviewer.activity.ImageViewerActivity;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.ripple_framework.download.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class i
  implements View.OnClickListener
{
  i(h paramh, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.b().iterator();
    while (localIterator.hasNext())
    {
      CommunityImageInfo localCommunityImageInfo = (CommunityImageInfo)localIterator.next();
      if (TextUtils.isEmpty(localCommunityImageInfo.url))
        continue;
      localArrayList.add(localCommunityImageInfo.url);
    }
    ImageViewerActivity.a(this.b.b.getContext(), localArrayList, this.a, b.a(ContentTypeEnum.ContentType.IMAGE));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.i
 * JD-Core Version:    0.6.0
 */