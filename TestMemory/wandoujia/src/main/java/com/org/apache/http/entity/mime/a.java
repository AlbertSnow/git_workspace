package com.org.apache.http.entity.mime;

public final class a
{
  private final String a;
  private final b b;
  private final com.org.apache.http.entity.mime.a.a c;

  public a(String paramString, com.org.apache.http.entity.mime.a.a parama)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Name may not be null");
    if (parama == null)
      throw new IllegalArgumentException("Body may not be null");
    this.a = paramString;
    this.c = parama;
    this.b = new b();
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("form-data; name=\"");
    localStringBuilder1.append(this.a);
    localStringBuilder1.append("\"");
    if (parama.e() != null)
    {
      localStringBuilder1.append("; filename=\"");
      localStringBuilder1.append(parama.e());
      localStringBuilder1.append("\"");
    }
    a("Content-Disposition", localStringBuilder1.toString());
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(parama.a());
    if (parama.b() != null)
    {
      localStringBuilder2.append("; charset=");
      localStringBuilder2.append(parama.b());
    }
    a("Content-Type", localStringBuilder2.toString());
    a("Content-Transfer-Encoding", parama.c());
  }

  private void a(String paramString1, String paramString2)
  {
    this.b.a(new f(paramString1, paramString2));
  }

  public final com.org.apache.http.entity.mime.a.a a()
  {
    return this.c;
  }

  public final b b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.a
 * JD-Core Version:    0.6.0
 */