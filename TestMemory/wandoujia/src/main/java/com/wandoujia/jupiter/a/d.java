package com.wandoujia.jupiter.a;

import android.annotation.TargetApi;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cg;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.morph.MorphLoadingView;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.jupiter.presenter.aj;
import com.wandoujia.jupiter.presenter.ak;
import com.wandoujia.jupiter.presenter.ao;
import com.wandoujia.jupiter.presenter.bi;
import com.wandoujia.jupiter.presenter.bo;
import com.wandoujia.jupiter.presenter.bp;
import com.wandoujia.jupiter.presenter.bq;
import com.wandoujia.jupiter.presenter.bv;
import com.wandoujia.jupiter.presenter.ca;
import com.wandoujia.jupiter.presenter.cf;
import com.wandoujia.jupiter.presenter.ch;
import com.wandoujia.jupiter.presenter.cj;
import com.wandoujia.jupiter.presenter.cn;
import com.wandoujia.jupiter.presenter.dt;
import com.wandoujia.jupiter.presenter.dy;
import com.wandoujia.jupiter.presenter.dz;
import com.wandoujia.jupiter.presenter.ec;
import com.wandoujia.jupiter.presenter.ed;
import com.wandoujia.jupiter.presenter.ef;
import com.wandoujia.jupiter.presenter.em;
import com.wandoujia.jupiter.presenter.en;
import com.wandoujia.jupiter.presenter.eo;
import com.wandoujia.jupiter.presenter.es;
import com.wandoujia.jupiter.presenter.et;
import com.wandoujia.jupiter.presenter.ew;
import com.wandoujia.jupiter.presenter.ex;
import com.wandoujia.jupiter.presenter.ey;
import com.wandoujia.jupiter.presenter.fb;
import com.wandoujia.jupiter.presenter.o;
import com.wandoujia.jupiter.presenter.s;
import com.wandoujia.jupiter.presenter.t;
import com.wandoujia.jupiter.search.b.f;
import com.wandoujia.jupiter.search.b.m;
import com.wandoujia.jupiter.search.view.SearchHotQueryItem;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.c.af;
import com.wandoujia.ripple_framework.c.ah;
import com.wandoujia.ripple_framework.c.ai;
import com.wandoujia.ripple_framework.c.am;
import com.wandoujia.ripple_framework.c.bl;
import com.wandoujia.ripple_framework.c.h;
import com.wandoujia.ripple_framework.ripple.b.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d extends com.wandoujia.ripple_framework.adapter.a
{
  @TargetApi(19)
  public final com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, MorphDetail paramMorphDetail)
  {
    if (paramMorphDetail == null)
      return null;
    String str = paramMorphDetail.xml;
    if (TextUtils.isEmpty(str))
      str = com.wandoujia.jupiter.morph.g.a(paramMorphDetail.url);
    if (!TextUtils.isEmpty(str))
      com.wandoujia.morph.a.a();
    for (ViewGroup localViewGroup1 = a((ViewGroup)com.wandoujia.morph.a.a(paramViewGroup.getContext(), paramMorphDetail.url, str)); ; localViewGroup1 = null)
    {
      if (localViewGroup1 == null)
      {
        localViewGroup1 = (ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903464);
        if ((localViewGroup1 instanceof MorphLoadingView))
          ((MorphLoadingView)localViewGroup1).setMorphDetail(paramMorphDetail);
      }
      ViewGroup localViewGroup2 = localViewGroup1;
      if (localViewGroup2 == null)
        return null;
      com.wandoujia.jupiter.morph.c.a(localViewGroup2, paramMorphDetail);
      Class[] arrayOfClass;
      if (!TextUtils.isEmpty(paramMorphDetail.presenter))
        arrayOfClass = new Class[] { ViewGroup.class, com.wandoujia.ripple_framework.k.class };
      try
      {
        Method localMethod = h.class.getMethod(paramMorphDetail.presenter, arrayOfClass);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localViewGroup2;
        arrayOfObject[1] = g();
        com.wandoujia.nirvana.framework.ui.a locala = (com.wandoujia.nirvana.framework.ui.a)localMethod.invoke(null, arrayOfObject);
        return locala;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        return com.wandoujia.jupiter.morph.c.a(paramMorphDetail, localViewGroup2, g());
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label184;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        label184: break label184;
      }
    }
  }

  protected com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    switch (f.a[paramTemplateType.ordinal()])
    {
    default:
      return super.a(paramViewGroup, paramTemplateType);
    case 24:
      ViewGroup localViewGroup3 = (ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903189);
      localViewGroup3.setTag(2130903189, paramTemplateType);
      return aa.a(localViewGroup3, g()).a(2131492866, new com.wandoujia.jupiter.presenter.a());
    case 25:
      return aa.c((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903188), g());
    case 26:
      return aa.c((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903262), g());
    case 27:
      ViewGroup localViewGroup2 = (ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903303);
      com.wandoujia.ripple_framework.k localk = g();
      return aa.a(localViewGroup2, localk).a(new bi(localk));
    case 28:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903337), g()).a(new dy());
    case 29:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903396), g());
    case 30:
      return aa.b(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903391)), g()).a(2131493742, new com.wandoujia.jupiter.library.presenter.c());
    case 31:
      Config.Q();
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903313), g()).a(2131492889, new ah(0)).a(new cn());
    case 32:
      return aa.n((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903386), g());
    case 33:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903393), g()).a(2131492889, new ah()).a(new es()).a(new com.wandoujia.jupiter.presenter.b());
    case 34:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903363), g()).a(2131492889, new ah()).a(new ed()).a(new com.wandoujia.jupiter.presenter.b());
    case 35:
      ViewGroup localViewGroup1 = (ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903389);
      RecyclerView localRecyclerView = (RecyclerView)localViewGroup1.findViewById(2131492960);
      if ((paramViewGroup instanceof RecyclerView))
        localRecyclerView.setRecycledViewPool(((RecyclerView)paramViewGroup).getRecycledViewPool());
      while (true)
      {
        localRecyclerView.setAdapter(new d());
        return new com.wandoujia.nirvana.framework.ui.a(localViewGroup1, g()).a(2131492960, new dz());
        cg localcg = new cg();
        localcg.a(TemplateTypeEnum.TemplateType.CARD_ICON_TINY.ordinal());
        localcg.a(TemplateTypeEnum.TemplateType.SINGLE_IMAGE.ordinal());
        localRecyclerView.setRecycledViewPool(localcg);
      }
    case 36:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903336), g()).a(2131493174, new bl()).a(new com.wandoujia.ripple_framework.c.e());
    case 37:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903308)).a(new bv());
    case 38:
      return aa.n((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903309), g());
    case 39:
      return h.g((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903383), g()).a(new ca());
    case 40:
      return aa.d(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903291)), g());
    case 41:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903277), g()).b(2131492972, new ai()).a(2131492889, new ah());
    case 42:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903296), g()).a(2131493653, new ak());
    case 43:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903298), g()).a(new com.wandoujia.jupiter.presenter.al());
    case 44:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903398), g()).a(2131492889, new ah()).a(2131492866, new com.wandoujia.jupiter.presenter.b()).a(new et());
    case 45:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903275), g()).a(new o());
    case 46:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903278), g()).a(new t());
    case 47:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903283), g()).a(2131492903, new af()).a(2131493174, new bl()).a(new ao());
    case 48:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903284), g()).a(2131493174, new bl());
    case 49:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903294), g()).b(2131493652, new cj()).b(2131492866, new ch());
    case 50:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903276), g()).a(new s());
    case 51:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903362), g());
    case 52:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903273), g());
    case 53:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903295), g()).a(2131493413, new aj());
    case 54:
      return aa.o(SearchHotQueryItem.a(paramViewGroup), g());
    case 55:
      return aa.o((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903368), g());
    case 56:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903416), g()).a(new com.wandoujia.jupiter.presenter.b());
    case 57:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903271), g()).a(new com.wandoujia.jupiter.search.b.c());
    case 58:
      return aa.e((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903372), g());
    case 59:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903366), g());
    case 60:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903315)).a(2131492998, new af());
    case 61:
      return aa.b(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903391)), g()).b(2131493742, new com.wandoujia.jupiter.library.presenter.a());
    case 62:
      return aa.f(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903364)), g()).b(2131493413, new af());
    case 63:
      return aa.f(a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903364)), g());
    case 64:
      return aa.i((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903378), g());
    case 65:
      return aa.g((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903429), g());
    case 66:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903369), g()).a(new em());
    case 67:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903380), g()).a(new eo(2));
    case 68:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903370), g()).a(new ef());
    case 69:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903371), g());
    case 70:
      if (OemUtil.canShowFeedbackEntry())
        return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903367), g()).a(2131492998, new f());
      return super.a(paramViewGroup, paramTemplateType);
    case 71:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903263), g());
    case 72:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903377), g()).a(2131492998, new af()).a(new m()).a(new com.wandoujia.jupiter.search.b.k());
    case 73:
      return aa.j((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903317), g());
    case 74:
      return aa.k((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903324), g());
    case 75:
      return aa.l((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903325), g());
    case 76:
      return aa.k((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903324), g());
    case 77:
      return aa.p((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903301), g());
    case 78:
      return aa.q((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903384), g());
    case 79:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903329));
    case 80:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903405), g()).a(new ew());
    case 81:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903328));
    case 82:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903274));
    case 83:
      return aa.h((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903429), g());
    case 84:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903335), g()).a(2131492998, new af()).a(2131492972, new af()).a(2131492903, new af()).a(2131492866, new dt()).a(new com.wandoujia.ripple_framework.c.g());
    case 85:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903414), g()).a(new com.wandoujia.ripple_framework.c.g());
    case 86:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903415), g()).a(new com.wandoujia.ripple_framework.c.g());
    case 87:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903408), g()).a(2131492904, new ex()).a(new ey());
    case 88:
      return aa.m((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903285), g());
    case 89:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903306), g());
    case 90:
      return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903515)).a(new com.wandoujia.ripple_framework.ripple.b.c()).a(new com.wandoujia.ripple_framework.c.e()).a(new com.wandoujia.ripple_framework.ripple.b.a());
    case 91:
      return aa.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903266), g());
    case 92:
      return aa.r((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903261), g());
    case 93:
      return h.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903220), g()).a(2131493174, new com.wandoujia.ripple_framework.c.al()).a(2131493290, new am());
    case 94:
    }
    return new com.wandoujia.nirvana.framework.ui.a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903365), g()).a(2131493735, new ak());
  }

  protected final void a(TemplateTypeEnum.TemplateType paramTemplateType, com.wandoujia.nirvana.framework.ui.a parama)
  {
    switch (f.a[paramTemplateType.ordinal()])
    {
    default:
      return;
    case 1:
      parama.a(new en()).b(2131492998, new bq()).b(2131493516, new i()).a(2131493516, new bp());
      return;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
      parama.a(new ec()).b(2131493516, new i());
      return;
    case 11:
      parama.a(2131492903, new com.wandoujia.ripple_framework.c.e());
      return;
    case 12:
      parama.a(new ca()).a(2131492866, new cf()).a(2131492972, new fb());
      return;
    case 13:
      parama.a(new ca()).a(2131492866, new cf()).a(2131493742, new com.wandoujia.jupiter.library.presenter.c());
      return;
    case 14:
      parama.a(new ca()).a(2131492866, new cf());
      return;
    case 15:
      parama.b(2131492972, new e());
    case 16:
      parama.a(2131492866, new cf());
      return;
    case 17:
    case 18:
    case 19:
      parama.a(2131492903);
    case 20:
    case 21:
      parama.a(new ca());
      return;
    case 22:
      parama.a(new bo());
      return;
    case 23:
    }
    parama.a(new bo()).a(new ec()).b(2131493516, new i());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a.d
 * JD-Core Version:    0.6.0
 */