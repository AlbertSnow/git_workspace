package com.wandoujia.jupiter.subscribe;

import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.p4.subscribe.core.h;

final class i
  implements h
{
  i(PublisherButtonPresenter paramPublisherButtonPresenter)
  {
  }

  public final void a(b paramb)
  {
    if ((PublisherButtonPresenter.a(this.a) != null) && (paramb.getId() != null) && (paramb.getId().equals(PublisherButtonPresenter.a(this.a).getId())))
      PublisherButtonPresenter.a(this.a, PublisherButtonPresenter.SubscribableState.SUBSCRIBED);
  }

  public final void b(b paramb)
  {
    if ((PublisherButtonPresenter.a(this.a) != null) && (paramb.getId() != null) && (paramb.getId().equals(PublisherButtonPresenter.a(this.a).getId())))
      PublisherButtonPresenter.a(this.a, PublisherButtonPresenter.SubscribableState.NOT_SUBSCRIBED);
  }

  public final void c(b paramb)
  {
    if ((PublisherButtonPresenter.a(this.a) != null) && (paramb.getId() != null) && (paramb.getId().equals(PublisherButtonPresenter.a(this.a).getId())))
      PublisherButtonPresenter.a(this.a, PublisherButtonPresenter.SubscribableState.NOT_SUBSCRIBED);
  }

  public final void d(b paramb)
  {
    if ((PublisherButtonPresenter.a(this.a) != null) && (paramb.getId() != null) && (paramb.getId().equals(PublisherButtonPresenter.a(this.a).getId())))
      PublisherButtonPresenter.a(this.a, PublisherButtonPresenter.SubscribableState.SUBSCRIBED);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.i
 * JD-Core Version:    0.6.0
 */