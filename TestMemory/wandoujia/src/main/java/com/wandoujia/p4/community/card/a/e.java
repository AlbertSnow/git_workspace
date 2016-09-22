package com.wandoujia.p4.community.card.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.jupiter.imageviewer.activity.ImageViewerActivity;
import com.wandoujia.p4.community.card.b.g;
import com.wandoujia.p4.community.card.view.CommunityNotificationCardView;
import com.wandoujia.ripple_framework.download.b;
import java.util.ArrayList;

final class e
  implements View.OnClickListener
{
  e(g paramg, CommunityNotificationCardView paramCommunityNotificationCardView)
  {
  }

  public final void onClick(View paramView)
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(this.a.f());
    ImageViewerActivity.a(this.b.getContext(), localArrayList, 0, b.a(ContentTypeEnum.ContentType.IMAGE));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.a.e
 * JD-Core Version:    0.6.0
 */