package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.support.v4.app.b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.wandoujia.game_launcher.a.a;
import com.wandoujia.game_launcher.lib.R.drawable;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.game_launcher.models.ParagraphContent;
import com.wandoujia.game_launcher.models.RecommendModel;
import com.wandoujia.game_launcher.models.StoryParagraph;
import com.wandoujia.game_launcher.models.StoryParagraph.ParagraphType;
import com.wandoujia.launcher.launcher.models.ImageModel;
import com.wandoujia.launcher.launcher.views.TopCropAsyncImageView;
import java.util.Iterator;
import java.util.List;

public class GameStoryView extends FrameLayout
{
  private View a;
  private GameFooterView b;
  private LoadingView c;
  private GameStoryAppInfoCardView d;
  private GameStoryAppInfoCardView e;
  private RelativeLayout f;
  private TopCropAsyncImageView g;
  private FrameLayout h;
  private RecyclerView i;
  private LinearLayoutManager j;
  private ImageView k;
  private GameDailyTextView l;
  private k m;
  private j n;
  private a o;
  private RecommendModel p;
  private AnimatorSet q;
  private AnimatorSet r;
  private boolean s = false;
  private boolean t = false;

  public GameStoryView(Context paramContext)
  {
    super(paramContext);
  }

  public GameStoryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GameStoryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private String getStoryHeadImage()
  {
    if (!TextUtils.isEmpty(this.p.getHeadImage()))
      return this.p.getHeadImage();
    if (this.p.getStory() != null)
    {
      Iterator localIterator = this.p.getStory().iterator();
      while (localIterator.hasNext())
      {
        StoryParagraph localStoryParagraph = (StoryParagraph)localIterator.next();
        if (localStoryParagraph.getType() != StoryParagraph.ParagraphType.IMAGE)
          continue;
        ParagraphContent localParagraphContent = localStoryParagraph.getItem();
        if ((localParagraphContent.getImages() == null) || (localParagraphContent.getImages().size() <= 0))
          continue;
        ImageModel localImageModel = (ImageModel)localParagraphContent.getImages().get(0);
        if (!TextUtils.isEmpty(localImageModel.getUrl()))
          return localImageModel.getUrl();
      }
    }
    return "";
  }

  public final void a()
  {
    if (!this.s)
    {
      if (this.q == null)
      {
        this.q = new AnimatorSet();
        ObjectAnimator localObjectAnimator = b.a(this.f, 0.0F, 1.0F).setDuration(600L);
        localObjectAnimator.addListener(new e(this));
        this.q.playSequentially(new Animator[] { localObjectAnimator });
      }
      this.q.start();
      this.s = true;
    }
  }

  public final void b()
  {
    if (this.s)
    {
      if (this.r == null)
      {
        this.r = new AnimatorSet();
        ObjectAnimator localObjectAnimator1 = b.a(this.f, 1.0F, 0.0F).setDuration(600L);
        localObjectAnimator1.addListener(new f(this));
        ObjectAnimator localObjectAnimator2 = b.a(this.c, 0.0F, 1.0F).setDuration(600L);
        this.r.playSequentially(new Animator[] { localObjectAnimator1, localObjectAnimator2 });
      }
      this.r.start();
      this.s = false;
    }
  }

  public final void c()
  {
    if (this.p != null)
    {
      this.d.setAppInfo(this.p);
      this.e.setAppInfo(this.p);
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (!this.s)
    {
      this.c.a();
      this.c.setVisibility(0);
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((LoadingView)findViewById(R.id.loading));
    this.f = ((RelativeLayout)findViewById(R.id.story_container));
    this.g = ((TopCropAsyncImageView)findViewById(R.id.story_title_image));
    this.h = ((FrameLayout)findViewById(R.id.story_image_container));
    this.i = ((RecyclerView)findViewById(R.id.story_content));
    this.k = ((ImageView)findViewById(R.id.story_more_arrow));
    getContext();
    this.j = new LinearLayoutManager(1);
    this.i.setLayoutManager(this.j);
    this.m = new k(this);
    this.i.setOnScrollListener(this.m);
    this.k.setOnClickListener(new g(this));
    this.a = LayoutInflater.from(getContext()).inflate(R.layout.game_launcher_header_view, this.f, false);
    this.d = ((GameStoryAppInfoCardView)this.a.findViewById(R.id.app_info_card));
    this.b = GameFooterView.a(this.f);
    this.b.getLeftPanel().setOnClickListener(new h(this));
    this.b.getRightPanel().setOnClickListener(new i(this));
    this.e = ((GameStoryAppInfoCardView)this.b.findViewById(R.id.app_info_card));
  }

  public void setData(RecommendModel paramRecommendModel)
  {
    if ((paramRecommendModel == null) || (paramRecommendModel.getApp() == null) || (this.p == paramRecommendModel))
      return;
    this.p = paramRecommendModel;
    this.t = false;
    if (this.o == null)
    {
      this.o = new a(getContext(), paramRecommendModel.getApp(), paramRecommendModel.getStory());
      this.o.b(this.a);
      this.o.c(this.b);
      this.i.setAdapter(this.o);
      this.d.a("game_review", 1);
      this.d.setAppInfo(paramRecommendModel);
      this.e.a("game_review", 2);
      this.e.setAppInfo(paramRecommendModel);
      String str = getStoryHeadImage();
      if (TextUtils.isEmpty(str))
        break label188;
      this.g.a(str, R.drawable.ic_delete_normal);
    }
    while (true)
    {
      this.b.a(paramRecommendModel.getDate());
      return;
      this.o.a(paramRecommendModel.getStory());
      this.i.a(0);
      break;
      label188: this.g.setImageResource(R.drawable.ic_delete_normal);
    }
  }

  public void setGameDailyTextView(GameDailyTextView paramGameDailyTextView)
  {
    this.l = paramGameDailyTextView;
  }

  public void setReviewClickedListener(j paramj)
  {
    this.n = paramj;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.GameStoryView
 * JD-Core Version:    0.6.0
 */