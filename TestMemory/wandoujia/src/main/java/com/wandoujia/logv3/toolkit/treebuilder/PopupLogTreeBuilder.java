package com.wandoujia.logv3.toolkit.treebuilder;

import android.view.View;
import android.view.ViewParent;
import com.wandoujia.logv3.toolkit.DropDownListView;
import com.wandoujia.logv3.toolkit.ab;

public final class PopupLogTreeBuilder
  implements b
{
  public static DropDownListView b(View paramView)
  {
    if ((paramView instanceof DropDownListView))
      return (DropDownListView)paramView;
    for (ViewParent localViewParent = paramView.getParent(); localViewParent != null; localViewParent = localViewParent.getParent())
      if ((localViewParent instanceof DropDownListView))
        return (DropDownListView)localViewParent;
    return null;
  }

  public final ab a(View paramView)
  {
    if (b(paramView) == null)
      throw new IllegalStateException("The specified view must be child of DropDownListView.");
    b(paramView);
    throw new IllegalStateException("The anchor view of the popup window must be specified.");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.treebuilder.PopupLogTreeBuilder
 * JD-Core Version:    0.6.0
 */