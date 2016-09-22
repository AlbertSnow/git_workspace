package com.wandoujia.account.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.h.k;
import com.wandoujia.base.storage.StorageManager;

public class AccountModifyProfileFragment extends AccountBaseFragment
{
  private String q;
  private Platform r;
  private final bf s = new bf(this);
  private final com.wandoujia.account.listener.a t = new b(this);
  private String u;
  private ImageView v;
  private EditText w;
  private k x = new be(this);

  private void a(String paramString, WandouResponse paramWandouResponse)
  {
    if (paramWandouResponse != null);
    try
    {
      String str = paramWandouResponse.getMsg();
      if (TextUtils.isEmpty(str))
        str = getString(R.string.account_sdk_netop_network_error);
      com.wandoujia.account.h.a.a(getActivity(), str, paramString, new aw()).show();
      return;
      com.wandoujia.account.h.a.a(getActivity(), getString(R.string.account_sdk_netop_network_error), paramString, new ax()).show();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static AccountModifyProfileFragment b(com.wandoujia.account.f.b paramb)
  {
    AccountModifyProfileFragment localAccountModifyProfileFragment = new AccountModifyProfileFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", paramb.f());
    AccountBaseFragment.a(paramb);
    localAccountModifyProfileFragment.setArguments(localBundle);
    return localAccountModifyProfileFragment;
  }

  private void h()
  {
    new bg(com.wandoujia.account.a.t(), this).execute(new Void[0]);
  }

  final void a(WandouResponse paramWandouResponse)
  {
  }

  protected final String b()
  {
    return "wdj://account/modify/profile";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    a(getString(R.string.account_sdk_complete_failure), paramWandouResponse);
  }

  public final void c()
  {
    super.c();
    this.v = ((ImageView)this.a.findViewById(R.id.avatar));
    this.w = ((EditText)this.a.findViewById(R.id.account_nick));
    Button localButton = (Button)this.a.findViewById(R.id.account_confirm);
    this.a.findViewById(R.id.modify_nick).setOnClickListener(new ay(this));
    this.v.setOnClickListener(new az(this));
    localButton.setOnClickListener(new ba(this));
    String str1 = com.wandoujia.account.a.l();
    String str2;
    int j;
    if (!TextUtils.isEmpty(str1))
    {
      str2 = str1.trim();
      int i = str2.length();
      j = 0;
      if (i != 11)
        if (j == 0)
        {
          this.w.setText(str1);
          Editable localEditable = this.w.getText();
          int m = str1.length();
          if (m < 50)
            Selection.setSelection(localEditable, m);
          this.w.clearFocus();
        }
    }
    while (true)
    {
      this.q = ("file://" + android.support.v4.app.b.w(StorageManager.getInstance().getExternalStorageDirectory()) + "/temp_avatar.jpg");
      return;
      int k = 0;
      if (k < str2.length())
      {
        if ((k < 3) || (k > 6))
        {
          boolean bool = Character.isDigit(str2.charAt(k));
          j = 0;
          if (!bool)
            break;
        }
        do
        {
          k++;
          break;
        }
        while (str2.charAt(k) == '*');
        j = 0;
        break;
      }
      j = 1;
      break;
      this.w.clearFocus();
    }
  }

  protected final void d(String paramString)
  {
    if (getActivity() != null)
    {
      Intent localIntent = new Intent("account.intent.action.MODIFY_SUCCESS");
      getActivity().sendBroadcast(localIntent);
    }
    if (getActivity() != null)
      getActivity().finish();
  }

  protected final void f()
  {
    Toast.makeText(getActivity(), R.string.account_sdk_netop_network_error, 0).show();
  }

  // ERROR //
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: iload_2
    //   1: iconst_m1
    //   2: if_icmpne +30 -> 32
    //   5: iload_1
    //   6: tableswitch	default:+26 -> 32, 2:+101->107, 3:+57->63, 4:+158->164
    //   33: getfield 419	com/wandoujia/account/fragment/AccountModifyProfileFragment:f	Lcom/wandoujia/account/f/b;
    //   36: ifnull +26 -> 62
    //   39: aload_0
    //   40: getfield 419	com/wandoujia/account/fragment/AccountModifyProfileFragment:f	Lcom/wandoujia/account/f/b;
    //   43: invokevirtual 422	com/wandoujia/account/f/b:c	()Lcom/sina/weibo/sdk/auth/sso/SsoHandler;
    //   46: ifnull +16 -> 62
    //   49: aload_0
    //   50: getfield 419	com/wandoujia/account/fragment/AccountModifyProfileFragment:f	Lcom/wandoujia/account/f/b;
    //   53: invokevirtual 422	com/wandoujia/account/f/b:c	()Lcom/sina/weibo/sdk/auth/sso/SsoHandler;
    //   56: iload_1
    //   57: iload_2
    //   58: aload_3
    //   59: invokevirtual 426	com/sina/weibo/sdk/auth/sso/SsoHandler:a	(IILandroid/content/Intent;)V
    //   62: return
    //   63: aload_0
    //   64: getfield 247	com/wandoujia/account/fragment/AccountModifyProfileFragment:u	Ljava/lang/String;
    //   67: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   70: ifne -38 -> 32
    //   73: new 211	java/io/File
    //   76: dup
    //   77: aload_0
    //   78: getfield 247	com/wandoujia/account/fragment/AccountModifyProfileFragment:u	Ljava/lang/String;
    //   81: invokespecial 226	java/io/File:<init>	(Ljava/lang/String;)V
    //   84: invokestatic 238	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   87: invokestatic 428	com/wandoujia/account/h/f:a	(Landroid/net/Uri;)Landroid/content/Intent;
    //   90: astore 25
    //   92: aload_0
    //   93: aload 25
    //   95: iconst_2
    //   96: invokevirtual 251	com/wandoujia/account/fragment/AccountModifyProfileFragment:startActivityForResult	(Landroid/content/Intent;I)V
    //   99: goto -67 -> 32
    //   102: astore 26
    //   104: goto -72 -> 32
    //   107: aload_3
    //   108: ifnull -46 -> 62
    //   111: aload_3
    //   112: invokevirtual 432	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   115: astore 23
    //   117: aload 23
    //   119: ifnull -87 -> 32
    //   122: aload 23
    //   124: ldc_w 434
    //   127: invokevirtual 438	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   130: checkcast 440	android/graphics/Bitmap
    //   133: astore 24
    //   135: aload 24
    //   137: ifnull -105 -> 32
    //   140: aload_0
    //   141: aload_0
    //   142: getstatic 123	com/wandoujia/account/R$string:account_sdk_change_avatar	I
    //   145: invokevirtual 127	com/wandoujia/account/fragment/AccountModifyProfileFragment:getString	(I)Ljava/lang/String;
    //   148: invokevirtual 131	com/wandoujia/account/fragment/AccountModifyProfileFragment:b	(Ljava/lang/String;)V
    //   151: aload 24
    //   153: aconst_null
    //   154: aload_0
    //   155: getfield 42	com/wandoujia/account/fragment/AccountModifyProfileFragment:x	Lcom/wandoujia/account/h/k;
    //   158: invokestatic 136	com/wandoujia/account/h/f:a	(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/wandoujia/account/h/k;)V
    //   161: goto -129 -> 32
    //   164: aload_3
    //   165: ifnull -103 -> 62
    //   168: getstatic 445	android/os/Build$VERSION:SDK_INT	I
    //   171: bipush 19
    //   173: if_icmplt +75 -> 248
    //   176: aload_3
    //   177: invokevirtual 449	android/content/Intent:getData	()Landroid/net/Uri;
    //   180: astore 22
    //   182: aload 22
    //   184: astore 5
    //   186: aload 5
    //   188: ifnull +371 -> 559
    //   191: new 211	java/io/File
    //   194: dup
    //   195: new 451	java/net/URI
    //   198: dup
    //   199: new 381	java/lang/StringBuilder
    //   202: dup
    //   203: ldc_w 383
    //   206: invokespecial 384	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: aload 5
    //   211: invokevirtual 452	android/net/Uri:getPath	()Ljava/lang/String;
    //   214: invokevirtual 388	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: invokevirtual 393	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: invokespecial 453	java/net/URI:<init>	(Ljava/lang/String;)V
    //   223: invokespecial 456	java/io/File:<init>	(Ljava/net/URI;)V
    //   226: astore 6
    //   228: aload 5
    //   230: ifnonnull +145 -> 375
    //   233: aload_0
    //   234: invokevirtual 50	com/wandoujia/account/fragment/AccountModifyProfileFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   237: getstatic 266	com/wandoujia/account/R$string:account_sdk_avatar_upload_failed	I
    //   240: iconst_0
    //   241: invokestatic 272	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   244: invokevirtual 273	android/widget/Toast:show	()V
    //   247: return
    //   248: aload_0
    //   249: getfield 256	com/wandoujia/account/fragment/AccountModifyProfileFragment:q	Ljava/lang/String;
    //   252: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   255: ifne +295 -> 550
    //   258: aload_0
    //   259: getfield 256	com/wandoujia/account/fragment/AccountModifyProfileFragment:q	Ljava/lang/String;
    //   262: invokestatic 260	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   265: astore 16
    //   267: aload 16
    //   269: astore 5
    //   271: new 211	java/io/File
    //   274: dup
    //   275: new 451	java/net/URI
    //   278: dup
    //   279: aload 5
    //   281: invokevirtual 457	android/net/Uri:toString	()Ljava/lang/String;
    //   284: invokespecial 453	java/net/URI:<init>	(Ljava/lang/String;)V
    //   287: invokespecial 456	java/io/File:<init>	(Ljava/net/URI;)V
    //   290: astore 6
    //   292: aload 6
    //   294: invokevirtual 460	java/io/File:exists	()Z
    //   297: ifne +238 -> 535
    //   300: aload_3
    //   301: invokevirtual 449	android/content/Intent:getData	()Landroid/net/Uri;
    //   304: astore 19
    //   306: aload_0
    //   307: invokevirtual 50	com/wandoujia/account/fragment/AccountModifyProfileFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   310: ifnull +214 -> 524
    //   313: aload 19
    //   315: ifnull +209 -> 524
    //   318: ldc_w 462
    //   321: aload 19
    //   323: invokevirtual 465	android/net/Uri:getScheme	()Ljava/lang/String;
    //   326: invokevirtual 469	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   329: ifeq +195 -> 524
    //   332: new 211	java/io/File
    //   335: dup
    //   336: aload 19
    //   338: aload_0
    //   339: invokevirtual 50	com/wandoujia/account/fragment/AccountModifyProfileFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   342: invokevirtual 473	android/support/v4/app/FragmentActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   345: invokestatic 476	android/support/v4/app/b:a	(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/String;
    //   348: invokestatic 478	com/wandoujia/account/h/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   351: invokespecial 226	java/io/File:<init>	(Ljava/lang/String;)V
    //   354: astore 13
    //   356: aload 19
    //   358: astore 14
    //   360: aload 13
    //   362: astore 15
    //   364: aload 14
    //   366: astore 5
    //   368: aload 15
    //   370: astore 6
    //   372: goto -144 -> 228
    //   375: aload_0
    //   376: invokevirtual 50	com/wandoujia/account/fragment/AccountModifyProfileFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   379: ifnull +139 -> 518
    //   382: aload_0
    //   383: invokevirtual 50	com/wandoujia/account/fragment/AccountModifyProfileFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   386: invokevirtual 473	android/support/v4/app/FragmentActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   389: ifnull +129 -> 518
    //   392: aload_0
    //   393: invokevirtual 50	com/wandoujia/account/fragment/AccountModifyProfileFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   396: invokevirtual 473	android/support/v4/app/FragmentActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   399: aload 5
    //   401: invokevirtual 484	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   404: invokestatic 490	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   407: astore 10
    //   409: aload 10
    //   411: astore 8
    //   413: aload 8
    //   415: invokestatic 493	com/wandoujia/account/h/f:a	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   418: astore 12
    //   420: aload 12
    //   422: astore 8
    //   424: aload 6
    //   426: ifnull +17 -> 443
    //   429: aload 6
    //   431: invokevirtual 460	java/io/File:exists	()Z
    //   434: ifeq +9 -> 443
    //   437: aload 6
    //   439: invokevirtual 496	java/io/File:delete	()Z
    //   442: pop
    //   443: aload 8
    //   445: ifnull -413 -> 32
    //   448: aload_0
    //   449: aload_0
    //   450: getstatic 123	com/wandoujia/account/R$string:account_sdk_change_avatar	I
    //   453: invokevirtual 127	com/wandoujia/account/fragment/AccountModifyProfileFragment:getString	(I)Ljava/lang/String;
    //   456: invokevirtual 131	com/wandoujia/account/fragment/AccountModifyProfileFragment:b	(Ljava/lang/String;)V
    //   459: aload 8
    //   461: aconst_null
    //   462: aload_0
    //   463: getfield 42	com/wandoujia/account/fragment/AccountModifyProfileFragment:x	Lcom/wandoujia/account/h/k;
    //   466: invokestatic 136	com/wandoujia/account/h/f:a	(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/wandoujia/account/h/k;)V
    //   469: goto -437 -> 32
    //   472: astore 7
    //   474: aconst_null
    //   475: astore 8
    //   477: goto -53 -> 424
    //   480: astore 11
    //   482: goto -58 -> 424
    //   485: astore 4
    //   487: aconst_null
    //   488: astore 5
    //   490: aconst_null
    //   491: astore 6
    //   493: goto -265 -> 228
    //   496: astore 21
    //   498: aconst_null
    //   499: astore 6
    //   501: goto -273 -> 228
    //   504: astore 17
    //   506: goto -278 -> 228
    //   509: astore 20
    //   511: aload 19
    //   513: astore 5
    //   515: goto -287 -> 228
    //   518: aconst_null
    //   519: astore 8
    //   521: goto -97 -> 424
    //   524: aload 6
    //   526: astore 13
    //   528: aload 19
    //   530: astore 14
    //   532: goto -172 -> 360
    //   535: aload 6
    //   537: astore 18
    //   539: aload 5
    //   541: astore 14
    //   543: aload 18
    //   545: astore 13
    //   547: goto -187 -> 360
    //   550: aconst_null
    //   551: astore 13
    //   553: aconst_null
    //   554: astore 14
    //   556: goto -196 -> 360
    //   559: aload 5
    //   561: astore 14
    //   563: aconst_null
    //   564: astore 13
    //   566: goto -206 -> 360
    //
    // Exception table:
    //   from	to	target	type
    //   92	99	102	android/content/ActivityNotFoundException
    //   375	409	472	java/lang/Exception
    //   413	420	480	java/lang/Exception
    //   168	182	485	java/net/URISyntaxException
    //   248	267	485	java/net/URISyntaxException
    //   191	228	496	java/net/URISyntaxException
    //   271	292	496	java/net/URISyntaxException
    //   292	306	504	java/net/URISyntaxException
    //   306	313	509	java/net/URISyntaxException
    //   318	356	509	java/net/URISyntaxException
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_modify_profile, paramViewGroup, false);
    c();
    h();
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountModifyProfileFragment
 * JD-Core Version:    0.6.0
 */