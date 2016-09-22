package com.wandoujia.jupiter.d;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.ApkDetail.Builder;
import com.wandoujia.api.proto.AppAward;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.CommentSummary;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Detail.Builder;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.Image.Builder;
import com.wandoujia.api.proto.ParagraphContent;
import com.wandoujia.api.proto.ReviewBean;
import com.wandoujia.api.proto.ReviewBean.Builder;
import com.wandoujia.api.proto.ScreenShotSet;
import com.wandoujia.api.proto.StoryParagraph;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.api.proto.TrailerBean;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.entities.game.GameDetailInfoType.CrashWithoutGsf;
import com.wandoujia.entities.game.ParagraphContent.TextStyle;
import com.wandoujia.entities.game.StoryParagraph.ParagraphType;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.imageviewer.activity.ImageViewerActivity;
import com.wandoujia.jupiter.util.b;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.p4.campaign.CampaignActivity;
import com.wandoujia.p4.game.acitvity.GameVideoPlayActivity;
import com.wandoujia.ripple_framework.model.Model;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
  implements e<Model>
{
  private static float a;
  private static float b;
  private static float c;
  private static float d;
  private AppDetail e;

  private static Model a(AppDetail paramAppDetail, boolean paramBoolean)
  {
    Model localModel = new Model(new Entity.Builder().description(paramAppDetail.editor_comment).template_type(TemplateTypeEnum.TemplateType.SINGLE_TEXT).build());
    localModel.a(2131492909, Boolean.valueOf(paramBoolean));
    return localModel;
  }

  private static Model a(StoryParagraph paramStoryParagraph, List<String> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = paramStoryParagraph.item.image.iterator();
    if (localIterator.hasNext())
    {
      Image localImage = (Image)localIterator.next();
      b();
      Image.Builder localBuilder = new Image.Builder().url(localImage.url).width(Integer.valueOf((int)b));
      if ((localImage.height == null) || (localImage.width == null) || (localImage.width.intValue() == 0))
        localBuilder.height(Integer.valueOf((int)d));
      while (true)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(localBuilder.build());
        localArrayList1.add(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.SINGLE_IMAGE).cover(localArrayList2).action_positive(new Action.Builder().intent(ImageViewerActivity.a(paramList, paramList.indexOf(localImage.url))).build()).build());
        break;
        localBuilder.height(Integer.valueOf((int)(localImage.height.intValue() * b / localImage.width.intValue())));
      }
    }
    return new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.GRID).cover(paramStoryParagraph.item.image).sub_entity(localArrayList1).build());
  }

  private static Model a(TemplateTypeEnum.TemplateType paramTemplateType)
  {
    return new Model(new Entity.Builder().template_type(paramTemplateType).build());
  }

  private static List<Model> a(ReviewBean paramReviewBean)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator1 = paramReviewBean.story.iterator();
    while (localIterator1.hasNext())
    {
      StoryParagraph localStoryParagraph2 = (StoryParagraph)localIterator1.next();
      if ((localStoryParagraph2 == null) || (!StoryParagraph.ParagraphType.IMAGE.name().equalsIgnoreCase(localStoryParagraph2.type)) || (CollectionUtils.isEmpty(localStoryParagraph2.item.image)))
        continue;
      Iterator localIterator3 = localStoryParagraph2.item.image.iterator();
      while (localIterator3.hasNext())
      {
        Image localImage2 = (Image)localIterator3.next();
        if (TextUtils.isEmpty(localImage2.url))
          continue;
        localArrayList2.add(localImage2.url);
      }
    }
    Iterator localIterator2 = paramReviewBean.story.iterator();
    while (localIterator2.hasNext())
    {
      StoryParagraph localStoryParagraph1 = (StoryParagraph)localIterator2.next();
      if (localStoryParagraph1 == null)
        continue;
      if (StoryParagraph.ParagraphType.IMAGE.name().equalsIgnoreCase(localStoryParagraph1.type))
      {
        if (localStoryParagraph1.item.image.size() == 1)
        {
          b();
          Image localImage1 = (Image)localStoryParagraph1.item.image.get(0);
          Image.Builder localBuilder = new Image.Builder().url(localImage1.url).width(Integer.valueOf((int)a));
          if ((localImage1.height == null) || (localImage1.width == null) || (localImage1.width.intValue() == 0))
            localBuilder.height(Integer.valueOf((int)c));
          while (true)
          {
            ArrayList localArrayList4 = new ArrayList();
            localArrayList4.add(localBuilder.build());
            localArrayList1.add(new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.SINGLE_IMAGE).cover(localArrayList4).action_positive(new Action.Builder().intent(ImageViewerActivity.a(localArrayList2, localArrayList2.indexOf(localImage1.url))).build()).build()));
            break;
            localBuilder.height(Integer.valueOf((int)(localImage1.height.intValue() * a / localImage1.width.intValue())));
          }
        }
        localArrayList1.add(a(localStoryParagraph1, localArrayList2));
        continue;
      }
      if ((!StoryParagraph.ParagraphType.TEXT.name().equalsIgnoreCase(localStoryParagraph1.type)) || (localStoryParagraph1.item == null) || (ParagraphContent.TextStyle.TITLE.name().equalsIgnoreCase(localStoryParagraph1.item.text_style)))
        continue;
      ArrayList localArrayList3 = new ArrayList();
      localArrayList3.add(localStoryParagraph1);
      localArrayList1.add(new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_STORY_TEXT).detail(new Detail.Builder().app_detail(new AppDetail.Builder().review(new ReviewBean.Builder().story(localArrayList3).build()).build()).build()).build()));
    }
    if (!CollectionUtils.isEmpty(localArrayList1))
      localArrayList1.add(new Model(new Entity.Builder().template_type(TemplateTypeEnum.TemplateType.COPYRIGHT_DIVIDER).build()));
    return localArrayList1;
  }

  private static List<Model> a(Model paramModel)
  {
    AppDetail localAppDetail1 = paramModel.F();
    if (CollectionUtils.isEmpty(localAppDetail1.apk))
    {
      ArrayList localArrayList1 = new ArrayList();
      AppDetail localAppDetail2 = paramModel.F();
      LocalAppInfo localLocalAppInfo1 = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).f(localAppDetail2.package_name);
      if (localLocalAppInfo1 != null)
      {
        String str1 = String.valueOf(TextUtil.formatSizeInfo(localLocalAppInfo1.getSize()));
        String str2 = "v" + localLocalAppInfo1.getVersionName() + " · " + str1;
        ApkDetail localApkDetail = new ApkDetail.Builder().bytes_(Integer.valueOf((int)localLocalAppInfo1.getSize())).version_name(localLocalAppInfo1.getVersionName()).version_code(Integer.valueOf(localLocalAppInfo1.getVersionCode())).md5(localLocalAppInfo1.getMD5()).build();
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(localApkDetail);
        AppDetail localAppDetail3 = new AppDetail.Builder().apk(localArrayList2).package_name(localLocalAppInfo1.getPackageName()).build();
        Detail localDetail = new Detail.Builder().app_detail(localAppDetail3).build();
        Model localModel1 = new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_HEADER).title(localLocalAppInfo1.getTitle()).sub_title(str2).closed_guess(Boolean.TRUE).detail(localDetail).build());
        localModel1.a(2131492906, Boolean.FALSE);
        localArrayList1.add(localModel1);
        localArrayList1.add(a(TemplateTypeEnum.TemplateType.RIPPLE_DIVIDER));
      }
      if (!TextUtils.isEmpty(localAppDetail2.editor_comment))
        localArrayList1.add(a(localAppDetail2, false));
      return localArrayList1;
    }
    ArrayList localArrayList3 = new ArrayList();
    String str3 = paramModel.b().tag_line;
    String str5;
    long l;
    String str6;
    label581: String str7;
    label701: LocalAppInfo localLocalAppInfo2;
    int j;
    label875: int k;
    label945: int m;
    label1131: boolean bool;
    if (TextUtils.isEmpty(str3))
    {
      ArrayList localArrayList4 = new ArrayList();
      localArrayList4.add(paramModel.F().installed_count_str + JupiterApplication.e().getString(2131624277));
      String str4 = b.a(paramModel.F());
      if ((!TextUtils.isEmpty(str4)) && (!TextUtils.equals(str4, JupiterApplication.e().getString(2131624196))))
        localArrayList4.add(JupiterApplication.e().getString(2131624197) + " " + str4);
      if ((!CollectionUtils.isEmpty(paramModel.F().apk)) && (((ApkDetail)paramModel.F().apk.get(0)).bytes_ != null))
      {
        str5 = String.valueOf(TextUtil.formatSizeInfo(((ApkDetail)paramModel.F().apk.get(0)).bytes_.intValue()));
        if (!TextUtils.isEmpty(str5))
          localArrayList4.add(str5);
        l = b.c(paramModel.F());
        if (l > 0L)
          break label1647;
        str6 = "";
        if (!TextUtils.isEmpty(str6))
          localArrayList4.add(str6 + JupiterApplication.e().getString(2131625544));
        str3 = TextUtils.join(" · ", localArrayList4);
      }
    }
    else
    {
      Entity.Builder localBuilder1 = new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_HEADER).title(paramModel.n()).icon(paramModel.i()).attachment(paramModel.b().attachment);
      if (TextUtils.isEmpty(paramModel.F().tagline))
        break label1718;
      str7 = paramModel.F().tagline;
      localArrayList3.add(new Model(localBuilder1.sub_title(str7).summary(str3).detail(new Detail.Builder().app_detail(paramModel.F()).build()).badge(paramModel.R()).build()));
      localLocalAppInfo2 = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).f(localAppDetail1.package_name);
      if ((localLocalAppInfo2 == null) || (!localLocalAppInfo2.isUpgradable()) || (localLocalAppInfo2.isUpgradeIgnored()))
        break label1751;
      LocalAppInfo localLocalAppInfo3 = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).f(localAppDetail1.package_name);
      Model localModel3 = new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_UPGRADE_INFO).build());
      localModel3.a(2131492915, localLocalAppInfo3);
      localArrayList3.add(localModel3);
      j = 0;
      if ((localLocalAppInfo2 == null) && (a(localAppDetail1)))
        localArrayList3.add(b(paramModel));
      if ((localAppDetail1.award == null) || (localAppDetail1.award.issue == null) || (localAppDetail1.award.issue.intValue() <= 0) || (TextUtils.isEmpty(localAppDetail1.award.cover)))
        break label1757;
      k = 1;
      if (k == 0)
        break label1763;
      AppAward localAppAward = localAppDetail1.award;
      Image localImage2 = new Image.Builder().url(localAppAward.cover).build();
      ArrayList localArrayList6 = new ArrayList();
      localArrayList6.add(localImage2);
      Entity.Builder localBuilder2 = new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_AWARD).title(localAppAward.description);
      Context localContext = JupiterApplication.e();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localAppAward.issue;
      localArrayList3.add(new Model(localBuilder2.sub_title(localContext.getString(2131624237, arrayOfObject)).cover(localArrayList6).action(new Action.Builder().url(localAppAward.blog_link).intent(CampaignActivity.a(b.a(localAppDetail1.package_name, localAppAward.issue.intValue()), "")).build()).build()));
      m = j;
      if (CollectionUtils.isEmpty(paramModel.A()))
        localArrayList3.add(a(TemplateTypeEnum.TemplateType.RIPPLE_DIVIDER));
      if (!TextUtils.isEmpty(localAppDetail1.editor_comment))
      {
        if (CollectionUtils.isEmpty(paramModel.A()))
          break label1772;
        bool = true;
        label1178: localArrayList3.add(a(localAppDetail1, bool));
      }
      if (!CollectionUtils.isEmpty(localAppDetail1.tag))
        localArrayList3.add(new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_TAG).tag(localAppDetail1.tag).build()));
      if ((localAppDetail1.trailer != null) && (!TextUtils.isEmpty(localAppDetail1.trailer.trailer_url)))
      {
        Image localImage1 = new Image.Builder().url(localAppDetail1.trailer.cover_url).build();
        ArrayList localArrayList5 = new ArrayList();
        localArrayList5.add(localImage1);
        localArrayList3.add(new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.SINGLE_VIDEO).cover(localArrayList5).action_positive(new Action.Builder().url(localAppDetail1.trailer.trailer_url).intent(GameVideoPlayActivity.a(localAppDetail1.trailer.trailer_url, localAppDetail1.title, localAppDetail1.package_name)).build()).build()));
      }
      if ((localAppDetail1.review == null) || (CollectionUtils.isEmpty(localAppDetail1.review.story)))
        break label1778;
      localArrayList3.addAll(a(localAppDetail1.review));
    }
    while (true)
    {
      if (((Model)localArrayList3.get(-1 + localArrayList3.size())).g() != TemplateTypeEnum.TemplateType.RIPPLE_DIVIDER)
        localArrayList3.add(a(TemplateTypeEnum.TemplateType.RIPPLE_DIVIDER));
      if ((localLocalAppInfo2 != null) && (a(localAppDetail1)))
        localArrayList3.add(b(paramModel));
      localArrayList3.add(new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_APP_INFO).detail(new Detail.Builder().app_detail(paramModel.F()).build()).badge(paramModel.R()).build()));
      if (CollectionUtils.isEmpty(paramModel.A()))
        break label1813;
      Iterator localIterator = paramModel.A().iterator();
      while (localIterator.hasNext())
      {
        Model localModel2 = (Model)localIterator.next();
        try
        {
          localArrayList3.add(Integer.valueOf(localModel2.b().symbol).intValue() - m, localModel2);
        }
        catch (Exception localException)
        {
        }
      }
      str5 = b.b(paramModel.F());
      break;
      label1647: int i = -DateUtil.distanceToToday(l);
      if ((i > 30) || (i < 0))
      {
        str6 = "";
        break label581;
      }
      if (i <= 7)
      {
        str6 = DateUtil.distanceToTodayString(l);
        break label581;
      }
      str6 = DateUtil.timeStamp2Date(l, new SimpleDateFormat(JupiterApplication.e().getString(2131625347)));
      break label581;
      label1718: if (!b.a(paramModel.F().title_en))
      {
        str7 = paramModel.F().title_en;
        break label701;
      }
      str7 = "";
      break label701;
      label1751: j = 1;
      break label875;
      label1757: k = 0;
      break label945;
      label1763: m = j + 1;
      break label1131;
      label1772: bool = false;
      break label1178;
      label1778: if ((localAppDetail1.screenshots == null) || (CollectionUtils.isEmpty(localAppDetail1.screenshots.small)))
        continue;
      localArrayList3.add(b(localAppDetail1));
    }
    label1813: return localArrayList3;
  }

  private static boolean a(AppDetail paramAppDetail)
  {
    return (!TextUtils.isEmpty(paramAppDetail.user_notice)) || ((paramAppDetail.crash_without_gsf != null) && (paramAppDetail.crash_without_gsf.intValue() == GameDetailInfoType.CrashWithoutGsf.CRASH.getCode()));
  }

  private static Model b(AppDetail paramAppDetail)
  {
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = paramAppDetail.screenshots.small.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Point localPoint = b.a(str, JupiterApplication.e());
      Image localImage = new Image.Builder().url(str).height(Integer.valueOf(localPoint.y)).width(Integer.valueOf(localPoint.x)).build();
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.add(localImage);
      localArrayList1.add(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.SCREENSHOT).cover(localArrayList2).action_positive(new Action.Builder().intent(ImageViewerActivity.a(paramAppDetail.screenshots.normal, paramAppDetail.screenshots.small.indexOf(str))).build()).build());
    }
    return new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.LIST_LANDSCAPE).sub_entity(localArrayList1).build());
  }

  private static Model b(Model paramModel)
  {
    return new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.APP).template_type(TemplateTypeEnum.TemplateType.DETAIL_APP_USER_NOTICE).detail(new Detail.Builder().app_detail(paramModel.F()).build()).badge(paramModel.R()).build());
  }

  private static void b()
  {
    if (a == 0.0F)
    {
      float f1 = android.support.v4.app.i.b(JupiterApplication.e());
      int i = android.support.v4.app.i.a(24.0F, JupiterApplication.e());
      int j = android.support.v4.app.i.a(4.0F, JupiterApplication.e());
      float f2 = f1 - i * 2;
      a = f2;
      b = (f2 - j) / 2.0F;
      c = a / 1.618F;
      d = 1.618F * b;
    }
  }

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if ((localModel.f() == ContentTypeEnum.ContentType.APP) && (localModel.g() == TemplateTypeEnum.TemplateType.DETAIL_HEADER))
      {
        localArrayList.addAll(a(localModel));
        this.e = localModel.F();
        continue;
      }
      if (localModel.f() == ContentTypeEnum.ContentType.APP_COMMENT)
      {
        AppDetail localAppDetail = this.e;
        Entity.Builder localBuilder = new Entity.Builder().content_type(localModel.f()).template_type(localModel.g());
        Detail.Builder localBuilder1 = new Detail.Builder().app_detail(localAppDetail);
        if (localModel.b().detail != null);
        for (CommentSummary localCommentSummary = localModel.b().detail.app_comment; ; localCommentSummary = null)
        {
          localArrayList.add(new Model(localBuilder.detail(localBuilder1.app_comment(localCommentSummary).build()).build()));
          break;
        }
      }
      if (localModel.g() == TemplateTypeEnum.TemplateType.SINGLE_GRAND)
      {
        if ((localModel.F() != null) && ("com.wandoujia.game_launcher".equals(localModel.F().package_name)) && (AppManager.a().h("com.wandoujia.game_launcher")));
        for (int i = 0; ; i = 1)
        {
          if (i == 0)
            break label274;
          localArrayList.add(localModel);
          break;
        }
        label274: continue;
      }
      localArrayList.add(localModel);
    }
    return localArrayList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.i
 * JD-Core Version:    0.6.0
 */