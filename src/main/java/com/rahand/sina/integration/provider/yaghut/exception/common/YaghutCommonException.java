package com.rahand.sina.integration.provider.yaghut.exception.common;


import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;

import java.util.Arrays;

public enum YaghutCommonException {

    // General Exception :
    INVALID_SESSION_WS_EXCEPTION("نا معتبر بودن (session)", "InvalidSessionWSException", ""),
    VALIDATOR_WS_EXCEPTION(CommonErrorMessage.INVALID_INPUT, "ValidatorWSException", "ValidatorWSException"),
    WEBSERVICE_RUNTIME_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "WebserviceRuntimeException", "خطای کلی در حال اجرا"),
    NON_UNIQUE_USER_WS_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "NonUniqueUserWSException", "کاربر واحد نیست"),
    BLOCK_USER_WS_EXCEPTION("نام کاربری شما به دلیل بیشتر از حد مجاز اشتباه وارد کردن رمز عبور موقتا مسدود شده است. لطفا با پشتیبانی تماس بگیرید", "BlockUserWSException", "زمانیکه کاربر در خواست سرویس لاگین داده باشد و رمزش را بیشتر از حداکثر مجاز اشتباه وارد کرده باشد و مدت زمان بلاک بودن را سپری نکرده باشد این خطا رخ می دهد"),
    CLIENT_ADDRESS_WS_EXCEPTION("", "ClientAddressWSException", "آدرس کلاینت نا معتبر است (در سرویس های کارتی)"),
    DESTINATION_DEPOSIT_NUMBER_WS_EXCEPTION("شماره سپرده مقصد در لیست محدودیت های انجام عملیات بانکی قرار دارد", "DestinationDepositNumberWSException", "حساب مقصد در لیست سفید تعریف نشده باشد-شماره حساب در پارامترهای constraint انتقال وجه تعریف شده باشد اما مشخص نشده باشد که شماره حساب سفید است یا سیاه"),
    OTP_WS_EXCEPTION("خطایی در صدور رمز یکبار مصرف رخ داده است", "OTPWSException", "وقتی که در تولید رمز یکبار مصرف اشکال ایجاد شود"),
    SECOND_PASSWORD_WS_EXCEPTION("رمز دوم اشتباه وارد شده است", "SecondPasswordWSException", "این خطا زمانی اتفاق می افتد که کاربر سرویسی که رمز دوم داشته باشد را فراخوانی کرده باشد و رمز دوم سرویس را خالی یا اشتباه وارد کرده باشد یا اینکه سرویس اصلا رمز دوم نداشته باشد"),
    SERVICE_CALL_WS_EXCEPTION("محدودیت در تعداد فراخوانی سرویس مورد نظر رخ داده است لطفا لحظاتی بعد دوباره تلاش نمایید", "ServiceCallWSException", "خطای محدودیت تعداد اجرای سرویس؛ اگر برای سرویسی محدودیت تعداد اجرا در یک زمان مشخص تنظیم شده باشد و آن سرویس در آن زمان مشخص بیشتر از آن تعداد اجرا شود این خطا رخ می دهد."),
    SOURCE_DEPOSIT_NUMBER_WS_EXCEPTION("شماره سپرده مبدا در لیست محدودیت های انجام عملیات بانکی قرار دارد", "SourceDepositNumberWSException", "حساب مبدا در لیست سفید تعریف نشده باشد-شماره حساب در پارامترهای constraint انتقال وجه تعریف شده باشد اما مشخص نشده باشد که شماره حساب سفید است یا سیاه."),
    TRANSFER_MAX_AMOUNT_WS_EXCEPTION("مبلغ انتفال وجه بیشتر از سقف انتقال وجه می باشد", "TransferMaxAmountWSException", "زمانیکه constraint سقف انتقال وجه برای کاربر تعریف شده باشد اما حداکثر مبلغ انتقال وجه مشخص نشده باشد-مبلغی که کاربر می خواهد انتقال وجه بدهد بیشتر از سقف انتقال وجه تعیین شده باشد."),
    TRANSFER_MAX_DAILY_AMOUNT_WS_EXCEPTION("مبلغ انتفال وجه بیشتر از سقف انتقال وجه روزانه می باشد", "TransferMaxDailyAmountWSException", "زمانیکه constraint سقف انتقال وجه روزانه برای کاربر تعریف شده باشد اما حداکثر مبلغ انتقال وجه مشخص نشده باشد.-مبلغی که کاربر می خواهد انتقال وجه بدهد بیشتر از سقف انتقال وجه روزانه تعیین شده باشد."),
    TRANSFER_MAX_MONTHLY_AMOUNT_WS_EXCEPTION("مبلغ انتفال وجه بیشتر از سقف انتقال وجه ماهانه می باشد", "TransferMaxMonthlyAmountWSException", "زمانیکه constraint سقف انتقال وجه ماهانه برای کاربر تعریف شده باشد اما حداکثر مبلغ انتقال وجه مشخص نشده باشد.-مبلغی که کاربر می خواهد انتقال وجه بدهد بیشتر از سقف انتقال وجه ماهانه تعیین شده باشد."),
    TRANSFER_MIN_AMOUNT_WS_EXCEPTION("مبلغ انتفال وجه کمتر از کف انتقال وجه می باشد", "TransferMinAmountWSException", "مبلغی که کاربر می خواهد انتقال وجه بدهد کمتر از کف انتقال وجه ماهانه تعیین شده باشد."),
    TICKET_WS_EXCEPTION("تیکت خالی یا اشتباه وارد شده است", "TicketWSException", "تیکت خالی یا اشتباه وارد شده باشد"),
    REQUEST_TRACKER_DUPLICATION_WS_EXCEPTION("خطایی در سیستم داخلی رخ داده است لطفا دوباره تلاش نمایید", "RequestTrackerDuplicationWSException", "اگر tracker_id وارد شود و مقدار آن برای کاربر جاری تکراری باشد این خطا رخ می دهد. "),
    CLIENT_ADDRESS_NOT_EXIST_WS_EXCEPTION(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE, "ClientAddressNotExistWSException", "در صورتی که (براساس تنظیمات) پرکردن CLIENT_ADDRESS در context اجباری شده باشد و کاربر این فیلد (key) را پر نکند این خطا رخ می دهد "),
    CARD_ISSUER_RESPONSIBILITY_WS_EXCEPTION("پاسخی از بانک دریافت نشد لطفا لحظاتی بعد دوباره تلاش نمایید", "CardIssuerResponsibilityWSException", "اگر صادر کننده کارت پاسخگو نباشد (مثلا در حال انجام تسويه يک دوره مالي باشد). در اين حالت تراکنش بايد در زمان ديگر ارسال شود."),
    CARD_ISSUER_WS_EXCEPTION("خطای در سرویس داخلی صادر کننده کارت رخ داده است", "CardIssuerWSException", "خطای داخلی صادر کننده کارت"),
    CERTIFICATE_INVALID_WS_EXCEPTION(" سیستم قادر به اعمال محدوديت امضاي ديجيتال نيست.", "CertificateInvalidWSException", "زمانی که سیستم قادر به اعمال محدوديت امضاي ديجيتال نيست."),
    DUPLICATE_ENTITY_WS_RUNTIME_EXCEPTION("درخواست تکراری است", "DuplicateEntityWSRuntimeException", "زمانی که موجودیت مورد نظر تکراری باشد."),
    FIRST_REQUEST_NOT_ALLOWED_WS_EXCEPTION("امکان ثبت درخواست دسته چک برای سپرده های (گروه) جاری برای اولین بار از طریق کانال بانکداری مدرن وجود ندارد", "FirstRequestNotAllowedWSException", "عدم امکان ثبت درخواست دسته چک برای سپرده های (گروه)جاری برای اولین بار به دلیل ثبت اولیه درخواست از کانال مدرن "),
    ILLEGAL_BILL_ID_WS_EXCEPTION("اگر شناسه قبض نامعتبر است", "IllegalBillIdWSException", "اگر شناسه قبض نامعتبر باشد این خطا رخ می دهد."),
    ILLEGAL_DESTINATION_DEPOSIT_STATE_WS_EXCEPTION("وضعیت سپرده مقصد جهت واریز مناسب نیست", "IllegalDestinationDepositStateWSException", "وضعیت سپرده مقصد جهت واریز مناسب نیست."),
    ILLEGAL_DOSSIER_STATE_WS_EXCEPTION("وضعیت پرونده اعتباری معتبر نیست", "IllegalDossierStateWSException", "اگر وضعیت پرونده اعتباری معتبر نباشد."),
    ILLEGAL_PAY_ID_WS_EXCEPTION("شناسه پرداخت نامتعبر است", "IllegalPayIdWSException", "اگر شناسه پرداخت نامعتبر باشد این خطا رخ می دهد."),
    ILLEGAL_SOURCE_DEPOSIT_STATE_WS_EXCEPTION("نوع سپرده برای انجام تراکنش مالی معتبر نیست", "IllegalSourceDepositStateWSException", "زمانیکه تراکنش مالی روی سپرده ای که نوع آن معتبر نیست انجام شود این خطا رخ می دهد. "),
    INVALID_CARD_ISSUER_WS_EXCEPTION(" صادرکننده کارت اشتباه است", "InvalidCardIssuerWSException", "اگر صادرکننده کارت اشتباه باشد."),
    INVALID_DEPOSIT_TYPE_WS_EXCEPTION("سپرده مورد نظر وجود ندارد یا در دسترس نیست", "InvalidDepositTypeWSException", "اگر کاربر نرخ سود سپرده ای را بخواهد که موجود نیست این خطا رخ می دهد."),
    INVALID_DEPOSIT_WS_EXCEPTION("شماره سپرده معتبر نیست", "InvalidDepositWSException", "شماره سپرده معتبر نیست و یا سپرده مورد نظر به شماره مشتری مورد نظر تعلق ندارد. "),
    INVALID_DIGITAL_SIGNATURE_WS_EXCEPTION("امضای دیجیتال نامعتبر است", "InvalidDigitalSignatureWSException", "زمانی که امضای دیجیتال نامعتبر باشد."),
    INVALID_OTP_SYNCHRONIZATION_WS_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "InvalidOTPSynchronizationWSException", "در صورت عدم همزمانی دستگاه رمزساز با سرور تصدیق هویت این خطا رخ می دهد."),
    INVALID_PARAMETER_VALUE_WS_EXCEPTION("خطایی در ارتیاط با سرویس پرداخت رخ داده است لطفا با پشتیبانی تماس بگیرید", "InvalidParameterValueWSException", "اگر مقادیر پارامترهای ورودی پرداخت مورد نظر معتبر نباشند، این خطا رخ می دهد."),
    INVALID_PAYMENT_PARAMETER_ID_WS_EXCEPTION("خطایی در ارتیاط با سرویس پرداخت رخ داده است لطفا با پشتیبانی تماس بگیرید", "InvalidPaymentParameterIdWSException", "اگر پارامتر های ورودی پرداخت مورد نظر معتبر نباشند، این خطا رخ می دهد."),
    INVALID_REFERENCE_WS_RUNTIME_EXCEPTION("شماره پیگیری نامتعبر است", "InvalidReferenceWSRuntimeException", "در صورتی که شماره پیگیری معتبر نباشد."),
    NO_USER_BY_CERTIFICATE_WS_EXCEPTION("براي گواهينامه ديجيتال وارد شده هيچ کاربري یافت نشد", "NoUserByCertificateWSException", "زمانی که براي گواهينامه ديجيتال ورودي هيچ کاربري پيدا نشود"),
    PAYMENT_REVERSE_WS_EXCEPTION("تراکنش مورد نظر قابل برگشت نیست", "PaymentReverseWSException", "اگر تراکنش مورد نظر قابل برگشت نباشد."),
    PERMISSION_DENIED_WS_EXCEPTION("امکان دسنرسی به سرویس یا عملیات مورد نظر وجود ندارد", "PermissionDeniedWSException", "این خطا زمانی رخ می دهد که کاربر سرویسی را درخواست کرده باشد که اجازه یا شرایط اجرای سرویس را نداشته باشد. "),
    POLICY_VIOLATED_WS_EXCEPTION("محدودیت و سیاست های انتقال وجه پایا برای انجام این تراکنش رعایت نشده است", "PolicyViolatedWsException", "زمانی رخ می دهد که یکی از سیاست های انتقال وجه پایا رعایت نشده باشد."),
    RTGS_POLICY_VIOLATED_WS_EXCEPTION("محدودیت و سیاست های انتقال وجه ساتنا برای انجام این تراکنش رعایت نشده است", "RtgsPolicyViolatedWSException", "اگر محدودیت های ساتنا رعایت نشده باشد این خطا رخ می دهد."),
    SECURITY_WS_EXCEPTION("اطلاعات وارد شده نامتعبر و غیر مجاز است", "SecurityWsException", "این خطا زمانی رخ می دهد که در ورودی از کاراکتر های غیر مجاز استفاده گردد."),
    SERVICE_WS_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "ServiceWSException", " این خطا زمانی رخ می دهد که سیستم قادر به سرویس دهی به درخواست کاربر نباشد."),
    UNAVAILABLE_SERVICE_WS_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "UnavailableServiceWSException", "زمانی که یک سرویس ناموجود فراخوانی شود"),
    AMOUNT_CONSTRAINT_VIOLATION_WS_RUNTIME_EXCEPTION("مبلغ تراکنش بیشتر از حد مجاز است", "AmountConstraintViolationWSRuntimeException", "زمانی که مبلغ عملیات بیشتر از حد تعیین شده باشد."),
    TEMPLATE_ID_WS_EXCEPTION("", "TemplateIdWSException", "زمانی که شناسه الگو در لیست سیاه باشد و یا در لیست سفید نباشد"),
    PAYMENT_ID_IS_REQUIRED_WS_RUNTIME_EXCEPTION("خطایی در ارتیاط با سرویس پرداخت رخ داده است لطفا با پشتیبانی تماس بگیرید", "PaymentIdIsRequiredWSRuntimeException", "اگر شناسه پرداخت اجباری بوده ولی مقدار نداشته باشد"),
    INVALID_AMOUNT_WS_RUNTIME_EXCEPTION("مبلغ نامعتبر است", "InvalidAmountWSRuntimeException", "مبلغ نامعتبر است"),
    INVALID_CARD_STATUS_WS_EXCEPTION("کارت مسدود یا منقضی شده است","InvalidCardStatusWSException","کارت منقضی شده است یا کارت موقتا مسدود شده است"),
    SERVICE_TIMEOUT_WS_EXCEPTION("در حال حاضر سیستم قادر به سرویس دهی نیست لطفا دوباره تلاش نمایید", "ServiceTimeoutWSException", " این خطا زمانی رخ می دهد که سیستم به خاطر مشکل تایم اوت قادر به ارائه سرویس نمی باشد. "),
    INVALID_CUSTOMER_WS_EXCEPTION("مشتری با این کد ملی در بانک یافت نشد", "InvalidCustomerWSException", ""),
    UNKNOWN_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "UNKNOWN_EXCEPTION", "-");

    private String clientErrorMessage;
    private String fault;
    private String yaghutErrorDescription;

    YaghutCommonException(String clientErrorMessage, String fault, String yaghutErrorDescription) {
        this.fault = fault;
        this.yaghutErrorDescription = yaghutErrorDescription;
        this.clientErrorMessage = clientErrorMessage;
    }


    public String getClientErrorMessage() {
        return clientErrorMessage;
    }

    public void setClientErrorMessage(String clientErrorMessage) {
        this.clientErrorMessage = clientErrorMessage;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public String getYaghutErrorDescription() {
        return yaghutErrorDescription;
    }

    public void setYaghutErrorDescription(String yaghutErrorDescription) {
        this.yaghutErrorDescription = yaghutErrorDescription;
    }

    public static boolean checkInvalidSessionException(String exception) {
        //todo ... refactor
        boolean sessionExpired = exception.equals("InvalidSessionWSException");

        if (sessionExpired) {

        }
        return sessionExpired;
    }

    public static boolean checkException(Exception e, String fault) {

        return e.toString().equals(fault.trim()) || e.toString().contains(fault.trim());
    }

    public static boolean yaghutValidatorException(Exception e) {
        return e.toString().equals("ValidatorWSException".trim()) || e.toString().contains("ValidatorWSException".trim());
    }

    public static YaghutExceptionResponse handelCommonException(Exception e) {

        String yaghutError = e.toString();

        YaghutExceptionResponse yaghutExceptionResponse = new YaghutExceptionResponse();

        YaghutCommonException yaghutCommonException = Arrays.stream(YaghutCommonException.values())
                .filter(exception -> yaghutError.equals(exception.fault.trim()) || yaghutError.startsWith(exception.fault.trim())
                        || yaghutError.contains(exception.fault.trim()))
                .findFirst().orElse(YaghutCommonException.UNKNOWN_EXCEPTION);

        yaghutExceptionResponse.setError(true);
        yaghutExceptionResponse.setErrorMessage(yaghutCommonException.getClientErrorMessage());
        yaghutExceptionResponse.setExtraErrorData(yaghutError);

        return yaghutExceptionResponse;
    }

}
