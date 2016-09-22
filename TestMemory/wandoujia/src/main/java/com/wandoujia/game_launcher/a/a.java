package com.wandoujia.game_launcher.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.entities.game.GameLiteInfo;
import com.wandoujia.game_launcher.lib.R.dimen;
import com.wandoujia.game_launcher.models.ParagraphContent;
import com.wandoujia.game_launcher.models.StoryParagraph;
import com.wandoujia.game_launcher.models.StoryParagraph.ParagraphType;
import com.wandoujia.launcher.launcher.models.ImageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends com.wandoujia.launcher.a.a<c>
{
  private static int a;
  private Context b;
  private List<StoryParagraph> c;
  private ArrayList<String> d;
  private GameLiteInfo e;
  private int f;

  public a(Context paramContext, GameLiteInfo paramGameLiteInfo, List<StoryParagraph> paramList)
  {
    this.c = paramList;
    this.b = paramContext;
    this.e = paramGameLiteInfo;
    this.f = 0;
    if (CollectionUtils.isEmpty(paramList))
      return;
    if ((paramContext instanceof Activity))
      a = SystemUtil.getScreenWidth(((Activity)paramContext).getWindowManager()) - 2 * paramContext.getResources().getDimensionPixelOffset(R.dimen.game_launcher_story_item_view_padding) - 2 * paramContext.getResources().getDimensionPixelOffset(R.dimen.padding_large);
    f();
  }

  private void f()
  {
    label7: Iterator localIterator1;
    if (this.c == null)
    {
      return;
    }
    else
    {
      this.d = new ArrayList();
      localIterator1 = this.c.iterator();
    }
    while (true)
    {
      if (!localIterator1.hasNext())
        break label7;
      StoryParagraph localStoryParagraph = (StoryParagraph)localIterator1.next();
      if ((localStoryParagraph == null) || (localStoryParagraph.getItem() == null) || (localStoryParagraph.getType() != StoryParagraph.ParagraphType.IMAGE))
        break;
      List localList = localStoryParagraph.getItem().getImages();
      if (CollectionUtils.isEmpty(localList))
        break;
      Iterator localIterator2 = localList.iterator();
      while (localIterator2.hasNext())
      {
        ImageModel localImageModel = (ImageModel)localIterator2.next();
        if (localImageModel == null)
          continue;
        this.d.add(localImageModel.getUrl());
      }
    }
  }

  public final void a(List<StoryParagraph> paramList)
  {
    this.c = paramList;
    if (CollectionUtils.isEmpty(paramList))
      return;
    f();
    b();
  }

  protected final int c()
  {
    if (this.c != null)
      return this.c.size();
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.a.a
 * JD-Core Version:    0.6.0
 */