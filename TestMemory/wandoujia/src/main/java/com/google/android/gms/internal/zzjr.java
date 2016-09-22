package com.google.android.gms.internal;

public enum zzjr
{
  private final String zzQt;

  static
  {
    zzPA = new zzjr("NEEDS_2F", 3, "InvalidSecondFactor");
    zzPB = new zzjr("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
    zzPC = new zzjr("NOT_VERIFIED", 5, "NotVerified");
    zzPD = new zzjr("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
    zzPE = new zzjr("UNKNOWN", 7, "Unknown");
    zzPF = new zzjr("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
    zzPG = new zzjr("ACCOUNT_DELETED", 9, "AccountDeleted");
    zzPH = new zzjr("ACCOUNT_DISABLED", 10, "AccountDisabled");
    zzPI = new zzjr("SERVICE_DISABLED", 11, "ServiceDisabled");
    zzPJ = new zzjr("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
    zzPK = new zzjr("CAPTCHA", 13, "CaptchaRequired");
    zzPL = new zzjr("NETWORK_ERROR", 14, "NetworkError");
    zzPM = new zzjr("USER_CANCEL", 15, "UserCancel");
    zzPN = new zzjr("PERMISSION_DENIED", 16, "PermissionDenied");
    zzPO = new zzjr("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
    zzPP = new zzjr("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
    zzPQ = new zzjr("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
    zzPR = new zzjr("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
    zzPS = new zzjr("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
    zzPT = new zzjr("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
    zzPU = new zzjr("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
    zzPV = new zzjr("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
    zzPW = new zzjr("DM_REQUIRED", 25, "DeviceManagementRequired");
    zzPX = new zzjr("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
    zzPY = new zzjr("NEED_PERMISSION", 27, "NeedPermission");
    zzPZ = new zzjr("BAD_PASSWORD", 28, "WeakPassword");
    zzQa = new zzjr("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
    zzQb = new zzjr("BAD_REQUEST", 30, "BadRequest");
    zzQc = new zzjr("BAD_USERNAME", 31, "BadUsername");
    zzQd = new zzjr("LOGIN_FAIL", 32, "LoginFail");
    zzQe = new zzjr("NOT_LOGGED_IN", 33, "NotLoggedIn");
    zzQf = new zzjr("NO_GMAIL", 34, "NoGmail");
    zzQg = new zzjr("REQUEST_DENIED", 35, "RequestDenied");
    zzQh = new zzjr("SERVER_ERROR", 36, "ServerError");
    zzQi = new zzjr("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
    zzQj = new zzjr("DELETED_GMAIL", 38, "DeletedGmail");
    zzQk = new zzjr("SOCKET_TIMEOUT", 39, "SocketTimeout");
    zzQl = new zzjr("EXISTING_USERNAME", 40, "ExistingUsername");
    zzQm = new zzjr("NEEDS_BROWSER", 41, "NeedsBrowser");
    zzQn = new zzjr("GPLUS_OTHER", 42, "GPlusOther");
    zzQo = new zzjr("GPLUS_NICKNAME", 43, "GPlusNickname");
    zzQp = new zzjr("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
    zzQq = new zzjr("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
    zzQr = new zzjr("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
    zzQs = new zzjr("INVALID_SCOPE", 47, "INVALID_SCOPE");
    zzjr[] arrayOfzzjr = new zzjr[48];
    arrayOfzzjr[0] = zzPx;
    arrayOfzzjr[1] = zzPy;
    arrayOfzzjr[2] = zzPz;
    arrayOfzzjr[3] = zzPA;
    arrayOfzzjr[4] = zzPB;
    arrayOfzzjr[5] = zzPC;
    arrayOfzzjr[6] = zzPD;
    arrayOfzzjr[7] = zzPE;
    arrayOfzzjr[8] = zzPF;
    arrayOfzzjr[9] = zzPG;
    arrayOfzzjr[10] = zzPH;
    arrayOfzzjr[11] = zzPI;
    arrayOfzzjr[12] = zzPJ;
    arrayOfzzjr[13] = zzPK;
    arrayOfzzjr[14] = zzPL;
    arrayOfzzjr[15] = zzPM;
    arrayOfzzjr[16] = zzPN;
    arrayOfzzjr[17] = zzPO;
    arrayOfzzjr[18] = zzPP;
    arrayOfzzjr[19] = zzPQ;
    arrayOfzzjr[20] = zzPR;
    arrayOfzzjr[21] = zzPS;
    arrayOfzzjr[22] = zzPT;
    arrayOfzzjr[23] = zzPU;
    arrayOfzzjr[24] = zzPV;
    arrayOfzzjr[25] = zzPW;
    arrayOfzzjr[26] = zzPX;
    arrayOfzzjr[27] = zzPY;
    arrayOfzzjr[28] = zzPZ;
    arrayOfzzjr[29] = zzQa;
    arrayOfzzjr[30] = zzQb;
    arrayOfzzjr[31] = zzQc;
    arrayOfzzjr[32] = zzQd;
    arrayOfzzjr[33] = zzQe;
    arrayOfzzjr[34] = zzQf;
    arrayOfzzjr[35] = zzQg;
    arrayOfzzjr[36] = zzQh;
    arrayOfzzjr[37] = zzQi;
    arrayOfzzjr[38] = zzQj;
    arrayOfzzjr[39] = zzQk;
    arrayOfzzjr[40] = zzQl;
    arrayOfzzjr[41] = zzQm;
    arrayOfzzjr[42] = zzQn;
    arrayOfzzjr[43] = zzQo;
    arrayOfzzjr[44] = zzQp;
    arrayOfzzjr[45] = zzQq;
    arrayOfzzjr[46] = zzQr;
    arrayOfzzjr[47] = zzQs;
    zzQu = arrayOfzzjr;
  }

  private zzjr(String paramString)
  {
    this.zzQt = paramString;
  }

  public final String zzld()
  {
    return this.zzQt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzjr
 * JD-Core Version:    0.6.0
 */