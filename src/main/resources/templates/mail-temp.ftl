<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/static/js/bootstrap-filestyle.min.js"></script>
    <script type="text/javascript" src="/static/js/bootstrap.js"></script>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.js"></script>
    <#import "spring.ftl" as spring />
</head>
<body style="background-color:#cccccc">
<div>
    <table class="es-wrapper" width="100%" cellspacing="0" cellpadding="0"
           style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;">
        <tr style="border-collapse:collapse;">
            <td valign="top" style="padding:0;Margin:0;">
                <table class="es-content es-visible-simple-html-only" cellspacing="0" cellpadding="0" align="center"
                       style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;">
                    <tr style="border-collapse:collapse;">
                        <td align="center" style="padding:0;Margin:0;">
                            <table class="es-content-body"
                                   style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;"
                                   width="600" cellspacing="0" cellpadding="0" bgcolor="#ffffff" align="center">
                                <tr style="border-collapse:collapse;">
                                    <td align="left"
                                        style="Margin:0;padding-top:20px;padding-bottom:20px;padding-left:40px;padding-right:40px;">
                                        <table width="100%" cellspacing="0" cellpadding="0"
                                               style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;">
                                            <tr style="border-collapse:collapse;">
                                                <td width="520" valign="top" align="center"
                                                    style="padding:0;Margin:0;">
                                                    <table width="100%" cellspacing="0" cellpadding="0"
                                                           role="presentation"
                                                           style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;">
                                                        <tr style="border-collapse:collapse;">
                                                            <td align="left" style="padding:0;Margin:0;"><h1
                                                                        style="Margin:0;line-height:36px;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:30px;font-style:normal;font-weight:normal;color:#4A7EB0;">
                                                                    Your email added</h1></td>
                                                        </tr>
                                                        <tr style="border-collapse:collapse;">
                                                            <td align="left"
                                                                style="padding:0;Margin:0;padding-top:5px;padding-bottom:20px;font-size:0;">
                                                                <table width="5%" height="100%" cellspacing="0"
                                                                       cellpadding="0" border="0"
                                                                       role="presentation"
                                                                       style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;">
                                                                    <tr style="border-collapse:collapse;">
                                                                        <td style="padding:0;Margin:0px;border-bottom:2px solid #999999;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;"></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                        <tr style="border-collapse:collapse;">
                                                            <td align="left"
                                                                style="padding:0;Margin:0;padding-bottom:10px;"><p
                                                                        style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;line-height:21px;color:#666666;">
                                                                    <span style="font-size:16px;line-height:24px;">Hi, ${username},</span>
                                                                </p></td>
                                                        </tr>
                                                        <tr class="es-visible-simple-html-only"
                                                            style="border-collapse:collapse;">
                                                            <td align="left" style="padding:0;Margin:0;"><p
                                                                        style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;line-height:21px;color:#666666;">
                                                                    We've added your email to your account, as you
                                                                    asked. Your email will be used if you forgot
                                                                    your password and for important account message.
                                                                    Your email must be verified.</p></td>
                                                        </tr>
                                                        <tr style="border-collapse:collapse;">
                                                            <td align="left"
                                                                style="padding:0;Margin:0;padding-top:20px;padding-bottom:20px;">
                                                                    <span class="es-button-border"
                                                                          style="border-style:solid;border-color:#4A7EB0;background:#2CB543;border-width:0px;display:inline-block;border-radius:0px;width:auto;"><a
                                                                                href="${link}"
                                                                                class="es-button" target="_blank"
                                                                                style="mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;font-size:18px;color:#4A7EB0;border-style:solid;border-color:#EFEFEF;border-width:10px 25px;display:inline-block;background:#EFEFEF;border-radius:0px;font-weight:normal;font-style:normal;line-height:22px;width:auto;text-align:center;">Verify email</a></span>
                                                            </td>
                                                        </tr>
                                                        <tr style="border-collapse:collapse;">
                                                            <td align="left" style="padding:0;Margin:0;"><p
                                                                        style="Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;line-height:21px;color:#666666;">
                                                                    If you need help visit the <a target="_blank"
                                                                                                  href="https://localhost//signUp"
                                                                                                  style="-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:14px;text-decoration:underline;color:#4A7EB0;">Help</a>
                                                                    page or <a target="_blank"
                                                                               href="https://viewstripo.email/"
                                                                               style="-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:14px;text-decoration:underline;color:#4A7EB0;">contact
                                                                        us</a>.</p></td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr style="border-collapse:collapse;">
                                    <td align="left"
                                        style="Margin:0;padding-top:20px;padding-bottom:20px;padding-left:40px;padding-right:40px;">
                                        <table width="100%" cellspacing="0" cellpadding="0"
                                               style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;">
                                            <tr style="border-collapse:collapse;">
                                                <td width="520" valign="top" align="center"
                                                    style="padding:0;Margin:0;">
                                                    <table width="100%" cellspacing="0" cellpadding="0"
                                                           role="presentation"
                                                           style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;">
                                                        <tr style="border-collapse:collapse;">
                                                            <td align="center"
                                                                style="padding:0;Margin:0;padding-right:5px;padding-top:20px;padding-bottom:20px;font-size:0;">
                                                                <table width="100%" height="100%" cellspacing="0"
                                                                       cellpadding="0" border="0"
                                                                       role="presentation"
                                                                       style="mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;">
                                                                    <tr style="border-collapse:collapse;">
                                                                        <td style="padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;"></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</div>
</body>
