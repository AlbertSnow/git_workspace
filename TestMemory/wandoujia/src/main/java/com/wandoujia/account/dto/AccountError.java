package com.wandoujia.account.dto;

public enum AccountError
{
  private final int error;
  private final String message;

  static
  {
    NEED_SECCODE = new AccountError("NEED_SECCODE", 1, 10001, "seccode.need");
    SECCODE_NOT_MATCH = new AccountError("SECCODE_NOT_MATCH", 2, 10004, "seccode.reject");
    USERNAME_DUPLICATED = new AccountError("USERNAME_DUPLICATED", 3, 1001, "username.duplicated");
    USERNAME_INVALID = new AccountError("USERNAME_INVALID", 4, 1006, "username.invalid");
    PASSWORD_INVALID = new AccountError("PASSWORD_INVALID", 5, 1007, "password.invalid");
    USER_NOT_EXIST = new AccountError("USER_NOT_EXIST", 6, 1008, "username.not.exist");
    NICK_INVALID = new AccountError("NICK_INVALID", 7, 1009, "nick.invalid");
    USERNAME_PASSWORD_WRONG = new AccountError("USERNAME_PASSWORD_WRONG", 8, 1010, "wrong.username.password");
    USER_NOT_ENABLED = new AccountError("USER_NOT_ENABLED", 9, 1011, "user.has.disabled");
    USER_REQUIRED = new AccountError("USER_REQUIRED", 10, 1012, "permission.denied");
    PERMISSION_DENIED = new AccountError("PERMISSION_DENIED", 11, 1013, "permission.denied");
    PARAMETER_ERROR = new AccountError("PARAMETER_ERROR", 12, 1014, "parameter.error");
    CALLBACK_PARAMETER_MISSING = new AccountError("CALLBACK_PARAMETER_MISSING", 13, 1015, "parameter.missing");
    PASSWORD_DIFFERENT = new AccountError("PASSWORD_DIFFERENT", 14, 1016, "password.differ");
    USER_NOT_FOUND = new AccountError("USER_NOT_FOUND", 15, 1017, "account.doesnot.exist");
    USER_ALREADY_EXIST = new AccountError("USER_ALREADY_EXIST", 16, 1018, "user.already.exist");
    PASSWORD_WRONG = new AccountError("PASSWORD_WRONG", 17, 1019, "wrong.password");
    PASSWORD_NEED_RESET = new AccountError("PASSWORD_NEED_RESET", 18, 1020, "password.expired");
    NICK_TOO_LONG = new AccountError("NICK_TOO_LONG", 19, 1021, "nick.too.long");
    TELEPHONE_INVALID = new AccountError("TELEPHONE_INVALID", 20, 1022, "telephone.invalid");
    AVATAR_ERROR = new AccountError("AVATAR_ERROR", 21, 20001, "avatar.error");
    SOCIAL_ACTIVE_NOTFOUND_ERROR = new AccountError("SOCIAL_ACTIVE_NOTFOUND_ERROR", 22, 30001, "parameter.missing");
    SINA_BIND_ERROR = new AccountError("SINA_BIND_ERROR", 23, 30003, "sina.bind.failure");
    QQ_BIND_ERROR = new AccountError("QQ_BIND_ERROR", 24, 30004, "qq.bind.failure");
    RENREN_BIND_ERROR = new AccountError("RENREN_BIND_ERROR", 25, 30005, "renren.bind.failure");
    SOCIAL_ALREADY_BIND = new AccountError("SOCIAL_ALREADY_BIND", 26, 30006, "social.already.bind");
    SOCIAL_UNBIND_REJECTED = new AccountError("SOCIAL_UNBIND_REJECTED", 27, 30007, "social.unbind.rejected");
    SINA_ALREADY_BIND = new AccountError("SINA_ALREADY_BIND", 28, 30008, "sina.already.bind");
    QQ_ALREADY_BIND = new AccountError("QQ_ALREADY_BIND", 29, 30009, "qq.already.bind");
    RENREN_ALREADY_BIND = new AccountError("RENREN_ALREADY_BIND", 30, 30010, "renren.already.bind");
    UID_SHOULD_BE_NULL = new AccountError("UID_SHOULD_BE_NULL", 31, 10015, "error");
    UID_SHOULD_NOTBE_NULL = new AccountError("UID_SHOULD_NOTBE_NULL", 32, 10016, "parameter.missing");
    CODE_NOT_FOUND = new AccountError("CODE_NOT_FOUND", 33, 20016, "code.not.found");
    EMAIL_DUPLICATED = new AccountError("EMAIL_DUPLICATED", 34, 20017, "email.duplicated");
    TELEPHONE_DUPLICATED = new AccountError("TELEPHONE_DUPLICATED", 35, 20018, "telephone.duplicated");
    EMAIL_BIND_DUPLICATED = new AccountError("EMAIL_BIND_DUPLICATED", 36, 20019, "email.bind.duplicated");
    TELEPHONE_BIND_DUPLICATED = new AccountError("TELEPHONE_BIND_DUPLICATED", 37, 20020, "telephone.bind.duplicated");
    ERROR_REACH_LIMIT = new AccountError("ERROR_REACH_LIMIT", 38, 20021, "error.reach.limit");
    VERIFICATION_NOT_FINISHED = new AccountError("VERIFICATION_NOT_FINISHED", 39, 20022, "verification.not.finished");
    VERIFICATION_TOKEN_EXPIRED = new AccountError("VERIFICATION_TOKEN_EXPIRED", 40, 20023, "verification.token.expired");
    COMMON_ERROR = new AccountError("COMMON_ERROR", 41, 99999, "error");
    NEED_UPDATE_CLIENT_ERROR = new AccountError("NEED_UPDATE_CLIENT_ERROR", 42, 40001, "need.update.client.error");
    NEED_VERIFY_ACCOUNT = new AccountError("NEED_VERIFY_ACCOUNT", 43, 99998, "account.verify.need");
    AccountError[] arrayOfAccountError = new AccountError[44];
    arrayOfAccountError[0] = SUCCESS;
    arrayOfAccountError[1] = NEED_SECCODE;
    arrayOfAccountError[2] = SECCODE_NOT_MATCH;
    arrayOfAccountError[3] = USERNAME_DUPLICATED;
    arrayOfAccountError[4] = USERNAME_INVALID;
    arrayOfAccountError[5] = PASSWORD_INVALID;
    arrayOfAccountError[6] = USER_NOT_EXIST;
    arrayOfAccountError[7] = NICK_INVALID;
    arrayOfAccountError[8] = USERNAME_PASSWORD_WRONG;
    arrayOfAccountError[9] = USER_NOT_ENABLED;
    arrayOfAccountError[10] = USER_REQUIRED;
    arrayOfAccountError[11] = PERMISSION_DENIED;
    arrayOfAccountError[12] = PARAMETER_ERROR;
    arrayOfAccountError[13] = CALLBACK_PARAMETER_MISSING;
    arrayOfAccountError[14] = PASSWORD_DIFFERENT;
    arrayOfAccountError[15] = USER_NOT_FOUND;
    arrayOfAccountError[16] = USER_ALREADY_EXIST;
    arrayOfAccountError[17] = PASSWORD_WRONG;
    arrayOfAccountError[18] = PASSWORD_NEED_RESET;
    arrayOfAccountError[19] = NICK_TOO_LONG;
    arrayOfAccountError[20] = TELEPHONE_INVALID;
    arrayOfAccountError[21] = AVATAR_ERROR;
    arrayOfAccountError[22] = SOCIAL_ACTIVE_NOTFOUND_ERROR;
    arrayOfAccountError[23] = SINA_BIND_ERROR;
    arrayOfAccountError[24] = QQ_BIND_ERROR;
    arrayOfAccountError[25] = RENREN_BIND_ERROR;
    arrayOfAccountError[26] = SOCIAL_ALREADY_BIND;
    arrayOfAccountError[27] = SOCIAL_UNBIND_REJECTED;
    arrayOfAccountError[28] = SINA_ALREADY_BIND;
    arrayOfAccountError[29] = QQ_ALREADY_BIND;
    arrayOfAccountError[30] = RENREN_ALREADY_BIND;
    arrayOfAccountError[31] = UID_SHOULD_BE_NULL;
    arrayOfAccountError[32] = UID_SHOULD_NOTBE_NULL;
    arrayOfAccountError[33] = CODE_NOT_FOUND;
    arrayOfAccountError[34] = EMAIL_DUPLICATED;
    arrayOfAccountError[35] = TELEPHONE_DUPLICATED;
    arrayOfAccountError[36] = EMAIL_BIND_DUPLICATED;
    arrayOfAccountError[37] = TELEPHONE_BIND_DUPLICATED;
    arrayOfAccountError[38] = ERROR_REACH_LIMIT;
    arrayOfAccountError[39] = VERIFICATION_NOT_FINISHED;
    arrayOfAccountError[40] = VERIFICATION_TOKEN_EXPIRED;
    arrayOfAccountError[41] = COMMON_ERROR;
    arrayOfAccountError[42] = NEED_UPDATE_CLIENT_ERROR;
    arrayOfAccountError[43] = NEED_VERIFY_ACCOUNT;
    $VALUES = arrayOfAccountError;
  }

  private AccountError(int paramInt, String paramString)
  {
    this.error = paramInt;
    this.message = paramString;
  }

  public static AccountError byError(int paramInt)
  {
    for (AccountError localAccountError : values())
      if (localAccountError.error == paramInt)
        return localAccountError;
    return COMMON_ERROR;
  }

  @com.fasterxml.jackson.annotation.JsonCreator
  @org.codehaus.jackson.annotate.JsonCreator
  public static AccountError forValue(String paramString)
  {
    if (paramString != null)
      for (AccountError localAccountError : values())
        if (paramString.equalsIgnoreCase(localAccountError.name()))
          return localAccountError;
    return COMMON_ERROR;
  }

  public final int getError()
  {
    return this.error;
  }

  public final String getMessage()
  {
    return this.message;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.AccountError
 * JD-Core Version:    0.6.0
 */