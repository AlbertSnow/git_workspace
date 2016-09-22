package com.android.volley.toolbox;

import com.android.volley.VolleyError;

final class u
  implements q
{
  u(NetworkImageView paramNetworkImageView)
  {
  }

  public final void a(p paramp, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a))
      this.b.post(new v(this, paramp));
    do
    {
      return;
      if (paramp.b() == null)
        continue;
      this.b.setImageBitmap(paramp.b());
      return;
    }
    while (NetworkImageView.b(this.b) == 0);
    this.b.setImageResource(NetworkImageView.b(this.b));
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    if (NetworkImageView.a(this.b) != 0)
      this.b.setImageResource(NetworkImageView.a(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.u
 * JD-Core Version:    0.6.0
 */