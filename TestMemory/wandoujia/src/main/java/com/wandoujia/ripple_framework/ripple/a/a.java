package com.wandoujia.ripple_framework.ripple.a;

import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.api.proto.Image.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.ripple.fragment.FeedDetailFragment;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class a extends com.wandoujia.nirvana.framework.network.page.a<Model>
{
  protected boolean a;
  private Model b;
  private boolean c;
  private List<Model> d;

  public a(Model paramModel)
  {
    super(null);
    this.b = paramModel;
    this.a = false;
    this.c = false;
  }

  private static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = "";
    try
    {
      String str = URLEncoder.encode(paramString1, "utf-8");
      localObject = str;
      label14: return String.format("wdj://play/game/video?url=%1$s&title=%2$s&pn=%3$s", new Object[] { localObject, paramString2, paramString3 });
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label14;
    }
  }

  protected static List<Model> b(Model paramModel)
  {
    ArrayList localArrayList = new ArrayList();
    if (CollectionUtils.isEmpty(paramModel.A()))
      return localArrayList;
    Iterator localIterator = paramModel.A().iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if (localModel.g() == TemplateTypeEnum.TemplateType.APP_ATTACH)
        localModel = new Model(new Entity.Builder(localModel.b()).template_type(TemplateTypeEnum.TemplateType.ARTICLE_APP_ATTACH).build());
      if (localModel.g() == TemplateTypeEnum.TemplateType.VIDEO_ATTACH)
        localModel = new Model(new Entity.Builder(localModel.b()).template_type(TemplateTypeEnum.TemplateType.ARTICLE_VIDEO_ATTACH).build());
      localModel.a(paramModel);
      localArrayList.add(localModel);
    }
    return localArrayList;
  }

  private void p()
  {
    if (this.a)
      return;
    this.a = true;
    a(DataLoadListener.Op.REFRESH);
    HashMap localHashMap = new HashMap();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b.F().package_name;
    arrayOfObject[1] = this.b.a();
    com.wandoujia.ripple_framework.a.b localb = new com.wandoujia.ripple_framework.a.b(String.format("http://apis.wandoujia.com/five/v2/ripple/%s/%s", arrayOfObject), localHashMap, HttpResponse.class, new b(this), new c(this), 0);
    localb.a(false);
    localb.u();
  }

  protected final Model a(com.wandoujia.ripple_framework.html.d paramd)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramd.b() != null)
      localArrayList.add(new Image.Builder().url(paramd.b()).build());
    String str1;
    if (paramd.a() == null)
    {
      str1 = "";
      if (this.b.n() != null)
        break label144;
    }
    label144: for (String str2 = ""; ; str2 = this.b.n())
    {
      String str3 = a(str1, str2, "");
      Action localAction = new Action.Builder().url(paramd.a()).intent(str3).build();
      return new Model(new Entity.Builder().content_type(ContentTypeEnum.ContentType.FEED).template_type(TemplateTypeEnum.TemplateType.SINGLE_VIDEO).cover(localArrayList).action_positive(localAction).build());
      str1 = paramd.a();
      break;
    }
  }

  public final String a()
  {
    if (this.b != null)
      return "ripple://detail/feed/" + this.b.e();
    return "ripple://detail/feed/" + hashCode();
  }

  public final void a(Model paramModel)
  {
    this.a = false;
    if (paramModel == null)
    {
      a(DataLoadListener.Op.REFRESH, new IllegalStateException("model is null."));
      return;
    }
    this.b = paramModel;
    d locald = new d(this, 0);
    Model[] arrayOfModel = new Model[1];
    arrayOfModel[0] = this.b;
    locald.execute(arrayOfModel);
  }

  public final boolean b()
  {
    return !this.c;
  }

  public final List<Model> c()
  {
    return this.d;
  }

  protected final void d()
  {
    if (this.c)
      return;
    if (this.b == null)
    {
      a(DataLoadListener.Op.REFRESH, new IllegalArgumentException("model is null"));
      return;
    }
    p();
  }

  protected final void e()
  {
    p();
  }

  public final Model n()
  {
    return this.b;
  }

  protected final Model o()
  {
    Model localModel1 = this.b;
    int i = FeedDetailFragment.a;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new Image.Builder().height(Integer.valueOf(i)).width(Integer.valueOf(-1)).build());
    Model localModel2 = new Model(new Entity.Builder().template_type(TemplateTypeEnum.TemplateType.ARTICLE_BLANK).content_type(ContentTypeEnum.ContentType.FEED).image(localArrayList).build());
    localModel2.a(localModel1);
    return localModel2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.a.a
 * JD-Core Version:    0.6.0
 */