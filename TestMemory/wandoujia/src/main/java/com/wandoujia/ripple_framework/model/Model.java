package com.wandoujia.ripple_framework.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.Builder;
import com.wandoujia.api.proto.ArticleDetail;
import com.wandoujia.api.proto.ArticleDetail.Builder;
import com.wandoujia.api.proto.Author;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.FavoriteSummary.Builder;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.api.proto.GiftDetail.Builder;
import com.wandoujia.api.proto.IconSet;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.MediaPressDetail.Builder;
import com.wandoujia.api.proto.MusicDetail.Builder;
import com.wandoujia.api.proto.PublisherBundleDetail;
import com.wandoujia.api.proto.PublisherBundleDetail.Builder;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.api.proto.PublisherDetail.Builder;
import com.wandoujia.api.proto.PublisherTimeDetail;
import com.wandoujia.api.proto.PublisherTimeDetail.Builder;
import com.wandoujia.api.proto.ShareSummary.Builder;
import com.wandoujia.api.proto.Tag;
import com.wandoujia.api.proto.Tag.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.api.proto.TodayDetail.Builder;
import com.wandoujia.api.proto.Video;
import com.wandoujia.api.proto.VideoDetail;
import com.wandoujia.api.proto.VideoDetail.Builder;
import com.wandoujia.base.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Model
  implements Parcelable
{
  public static final Parcelable.Creator<Model> CREATOR;
  private static final AppDetail a = new AppDetail.Builder().build();
  private static final GiftDetail b = new GiftDetail.Builder().build();
  private static final ArticleDetail c;
  private static final VideoDetail d;
  private static final PublisherDetail e;
  private static final PublisherTimeDetail f;
  private static final PublisherBundleDetail g;
  private final Entity.Builder h;
  private Entity i;
  private Model j;
  private int k;
  private final SparseArray l = new SparseArray();
  private boolean m;
  private Model n;
  private List<Model> o;
  private List<Model> p;
  private List<Model> q;
  private List<Model> r;
  private List<Image> s;
  private ContentTypeEnum.ContentType t;
  private TemplateTypeEnum.TemplateType u;
  private TemplateTypeEnum.TemplateType v;
  private d w;
  private CharSequence x;
  private LocalSceneInfo y;

  static
  {
    new MediaPressDetail.Builder().build();
    c = new ArticleDetail.Builder().build();
    new MusicDetail.Builder().build();
    d = new VideoDetail.Builder().build();
    new TodayDetail.Builder().build();
    e = new PublisherDetail.Builder().build();
    f = new PublisherTimeDetail.Builder().build();
    g = new PublisherBundleDetail.Builder().build();
    CREATOR = new f();
  }

  public Model(Entity paramEntity)
  {
    this.h = new Entity.Builder(paramEntity);
    if ((this.h.datePublished == null) && (!CollectionUtils.isEmpty(paramEntity.sub_entity)))
      this.h.datePublished(((Entity)paramEntity.sub_entity.get(0)).datePublished);
    if (this.h.datePublished == null)
      this.h.datePublished = Long.valueOf(0L);
    if (this.h.share_summary == null)
      this.h.share_summary = new ShareSummary.Builder().total_count(Long.valueOf(0L)).build();
    if (this.h.favorite_summary == null)
      this.h.favorite_summary = new FavoriteSummary.Builder().total_count(Integer.valueOf(0)).build();
    if (paramEntity.action != null)
      this.h.action(new Action.Builder(paramEntity.action).intent(j.a(paramEntity.action.intent)).build());
    if (paramEntity.action_positive != null)
      this.h.action_positive(new Action.Builder(paramEntity.action_positive).intent(j.a(paramEntity.action_positive.intent)).build());
    if ((paramEntity.tag != null) && (!paramEntity.tag.isEmpty()))
    {
      ArrayList localArrayList = new ArrayList(paramEntity.tag.size());
      Iterator localIterator5 = paramEntity.tag.iterator();
      while (localIterator5.hasNext())
      {
        Tag localTag = (Tag)localIterator5.next();
        if ((localTag.action == null) || (localTag.action.intent == null))
        {
          localArrayList.add(localTag);
          continue;
        }
        localArrayList.add(new Tag.Builder(localTag).action(new Action.Builder(localTag.action).intent(j.a(localTag.action.intent)).build()).build());
      }
      this.h.tag(localArrayList);
    }
    if ((paramEntity.type == null) && (paramEntity.content_type == null))
    {
      this.t = ContentTypeEnum.ContentType.APP;
      if ((paramEntity.template != null) || (paramEntity.template_type != null))
        break label703;
      this.u = TemplateTypeEnum.TemplateType.NOT_SUPPORT;
      label453: this.v = this.u;
      this.s = new ArrayList();
      this.s.addAll(paramEntity.image);
      this.s.addAll(paramEntity.cover);
      if (paramEntity.provider != null)
        this.n = new Model(paramEntity.provider);
      if (!CollectionUtils.isEmpty(paramEntity.attachment))
        break label792;
      this.o = Collections.EMPTY_LIST;
      this.p = Collections.EMPTY_LIST;
      label546: if (!CollectionUtils.isEmpty(paramEntity.channel))
        break label937;
      this.r = Collections.EMPTY_LIST;
      label563: this.m = false;
      this.w = new d();
      this.i = this.h.build();
      if (!CollectionUtils.isEmpty(paramEntity.sub_entity))
        break label1018;
      this.q = Collections.EMPTY_LIST;
    }
    while (true)
    {
      this.q = Collections.unmodifiableList(this.q);
      return;
      if (paramEntity.content_type != null)
      {
        this.t = paramEntity.content_type;
        break;
      }
      ContentTypeEnum.ContentType[] arrayOfContentType = ContentTypeEnum.ContentType.values();
      int i1 = arrayOfContentType.length;
      for (int i2 = 0; ; i2++)
      {
        if (i2 < i1)
        {
          ContentTypeEnum.ContentType localContentType = arrayOfContentType[i2];
          if (paramEntity.type.intValue() != localContentType.getValue())
            continue;
          this.t = localContentType;
        }
        if (this.t != null)
          break;
        this.t = ContentTypeEnum.ContentType.NOT_SUPPORT;
        break;
      }
      label703: if (paramEntity.template_type != null)
      {
        this.u = paramEntity.template_type;
        break label453;
      }
      TemplateTypeEnum.TemplateType[] arrayOfTemplateType = TemplateTypeEnum.TemplateType.values();
      int i3 = arrayOfTemplateType.length;
      for (int i4 = 0; ; i4++)
      {
        if (i4 < i3)
        {
          TemplateTypeEnum.TemplateType localTemplateType = arrayOfTemplateType[i4];
          if (localTemplateType.getValue() != paramEntity.template.intValue())
            continue;
          this.u = localTemplateType;
        }
        if (this.u != null)
          break;
        this.u = TemplateTypeEnum.TemplateType.NOT_SUPPORT;
        break;
      }
      label792: this.o = new ArrayList(paramEntity.attachment.size());
      this.p = new ArrayList();
      Iterator localIterator1 = paramEntity.attachment.iterator();
      while (localIterator1.hasNext())
      {
        Entity localEntity = (Entity)localIterator1.next();
        this.o.add(new Model(localEntity));
      }
      Iterator localIterator2 = this.o.iterator();
      while (localIterator2.hasNext())
      {
        Model localModel1 = (Model)localIterator2.next();
        if (localModel1.t != ContentTypeEnum.ContentType.APP)
          continue;
        this.p.add(localModel1);
      }
      break label546;
      label937: this.r = new ArrayList(paramEntity.channel.size());
      Iterator localIterator3 = paramEntity.channel.iterator();
      while (localIterator3.hasNext())
      {
        Model localModel2 = new Model((Entity)localIterator3.next());
        localModel2.j = this;
        this.r.add(localModel2);
      }
      break label563;
      label1018: this.q = new ArrayList(paramEntity.sub_entity.size());
      Iterator localIterator4 = paramEntity.sub_entity.iterator();
      while (localIterator4.hasNext())
      {
        Model localModel3 = new Model((Entity)localIterator4.next());
        localModel3.j = this;
        if ((localModel3.n == null) && (localModel3.t == ContentTypeEnum.ContentType.FEED) && (this.t == ContentTypeEnum.ContentType.APP))
        {
          localModel3.h.provider(this.i);
          localModel3.n = this;
          localModel3.i = localModel3.h.build();
        }
        this.q.add(localModel3);
      }
    }
  }

  public final List<Model> A()
  {
    return this.o;
  }

  public final List<Model> B()
  {
    return this.q;
  }

  public final Detail C()
  {
    return this.h.detail;
  }

  public final boolean D()
  {
    return (this.h.detail != null) && (this.h.detail.app_detail != null) && (this.h.detail.app_detail.package_name != null);
  }

  public final GiftDetail E()
  {
    if ((this.h.detail == null) || (this.h.detail.gift_detail == null))
      return b;
    return this.h.detail.gift_detail;
  }

  public final AppDetail F()
  {
    if ((this.h.detail == null) || (this.h.detail.app_detail == null))
      return a;
    return this.h.detail.app_detail;
  }

  public final VideoDetail G()
  {
    if ((this.h.detail == null) || (this.h.detail.video_detail == null))
      return d;
    return this.h.detail.video_detail;
  }

  public final String H()
  {
    return this.h.detail_url;
  }

  public final PublisherDetail I()
  {
    if ((this.h.detail == null) || (this.h.detail.publisher_detail == null))
      return e;
    return this.h.detail.publisher_detail;
  }

  public final PublisherTimeDetail J()
  {
    if ((this.h.detail == null) || (this.h.detail.publisher_time_detail == null))
      return f;
    return this.h.detail.publisher_time_detail;
  }

  public final ArticleDetail K()
  {
    if ((this.h.detail == null) || (this.h.detail.article_detail == null))
      return c;
    return this.h.detail.article_detail;
  }

  public final PublisherBundleDetail L()
  {
    if ((this.h.detail == null) || (this.h.detail.publisher_bundle_detail == null))
      return g;
    return this.h.detail.publisher_bundle_detail;
  }

  public final String M()
  {
    return this.h.strategy_name;
  }

  public final boolean N()
  {
    return this.m;
  }

  public final void O()
  {
    this.m = true;
  }

  public final boolean P()
  {
    if (this.h.closed_guess == null)
      return false;
    return this.h.closed_guess.booleanValue();
  }

  public final d Q()
  {
    return this.w;
  }

  public final Integer R()
  {
    return this.h.badge;
  }

  public final CharSequence S()
  {
    return this.x;
  }

  public final boolean T()
  {
    if (this.h.need_filter == null)
      return false;
    return this.h.need_filter.booleanValue();
  }

  public final int U()
  {
    if (this.h.section_auto_grid_rows != null)
      return this.h.section_auto_grid_rows.intValue();
    return 1;
  }

  public final Object a(int paramInt)
  {
    return this.l.get(paramInt);
  }

  public final String a()
  {
    if (TextUtils.isEmpty(this.h.id_string))
      return String.valueOf(this.h.id);
    return this.h.id_string;
  }

  public final void a(int paramInt, Object paramObject)
  {
    this.l.append(paramInt, paramObject);
  }

  public final void a(TemplateTypeEnum.TemplateType paramTemplateType)
  {
    this.v = paramTemplateType;
  }

  public final void a(Model paramModel)
  {
    this.j = paramModel;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.x = paramCharSequence;
  }

  public final void a(String paramString)
  {
    this.h.title(paramString);
    this.i = this.h.build();
  }

  public final void a(List<Model> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      ((Model)localIterator.next()).j = this;
    this.q = paramList;
  }

  public final Entity b()
  {
    return this.i;
  }

  public final void b(int paramInt)
  {
    this.l.remove(paramInt);
  }

  public final void b(List<Image> paramList)
  {
    this.h.image(paramList);
    this.i = this.h.build();
  }

  public final Model c()
  {
    return this.j;
  }

  public final void c(int paramInt)
  {
    this.k = paramInt;
  }

  public final void c(List<Video> paramList)
  {
    this.h.video = paramList;
    this.i = this.h.build();
  }

  public final int d()
  {
    return this.k;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final long e()
  {
    if (this.h.id == null)
      return 0L;
    return this.h.id.longValue();
  }

  public final ContentTypeEnum.ContentType f()
  {
    return this.t;
  }

  public final TemplateTypeEnum.TemplateType g()
  {
    return this.u;
  }

  public final TemplateTypeEnum.TemplateType h()
  {
    return this.v;
  }

  public final String i()
  {
    if (this.h.icon_image != null)
      return this.h.icon_image.url;
    return this.h.icon;
  }

  public final String j()
  {
    String str = "";
    if (this.h.icon_image != null)
      str = this.h.icon_image.url;
    if ((TextUtils.isEmpty(str)) && (this.h.detail != null) && (this.h.detail.app_detail != null) && (this.h.detail.app_detail.icons != null))
      str = this.h.detail.app_detail.icons.px256;
    if (TextUtils.isEmpty(str))
      str = this.h.icon;
    return str;
  }

  public final Image k()
  {
    return this.h.icon_image;
  }

  public final String l()
  {
    return this.h.recommend_reason;
  }

  public final Model m()
  {
    return this.n;
  }

  public final String n()
  {
    return this.h.title;
  }

  public final String o()
  {
    return this.h.sub_title;
  }

  public final String p()
  {
    return this.h.summary;
  }

  public final String q()
  {
    return this.h.description;
  }

  public final String r()
  {
    return this.h.snippet;
  }

  public final Author s()
  {
    return this.h.author;
  }

  public final Action t()
  {
    return this.h.action;
  }

  public final String toString()
  {
    return "id=" + e() + " title=" + this.h.title + " template=" + this.v.toString();
  }

  public final Long u()
  {
    return this.h.datePublished;
  }

  public final List<Image> v()
  {
    if (this.h.image == null)
      return Collections.EMPTY_LIST;
    return this.h.image;
  }

  public final List<Image> w()
  {
    if (this.h.cover == null)
      return Collections.EMPTY_LIST;
    return this.h.cover;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(this.h.build().toByteArray());
    paramParcel.writeParcelable(this.y, paramInt);
  }

  public final List<Image> x()
  {
    if (w().isEmpty())
      return v();
    return w();
  }

  public final List<Video> y()
  {
    if (this.h.video == null)
      return Collections.EMPTY_LIST;
    return this.h.video;
  }

  public final List<Model> z()
  {
    return this.p;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.Model
 * JD-Core Version:    0.6.0
 */