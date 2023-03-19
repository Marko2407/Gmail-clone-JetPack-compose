package com.mvukosav.gmailclone

import com.mvukosav.gmailclone.models.Account
import com.mvukosav.gmailclone.models.MailData

val mailMockList = listOf(
    MailData(
        mailId = 1,
        userName = "Marko",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 2,
        userName = "Ivan",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 3,
        userName = "Krampus",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 4,
        userName = "Spuzva bob",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 5,
        userName = "Patrik",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 6,
        userName = "Karamarko",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 7,
        userName = "Kljestic",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 8,
        userName = "Roko",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 9,
        userName = "Luna",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
    MailData(
        mailId = 10,
        userName = "Lea",
        subject = "Marko kralj",
        body = "Marko je najveci kralj",
        timeStamp = "00:00"
    ),
)

val accountMockList = listOf(
    Account(icon = R.drawable.restaurant, userName = "Marko legenda", email = "Marko@Legenda.com", unReadMails = 99),
        Account(userName = "Ivan legenda", email = "Ivan@Legenda.com", unReadMails = 939),
Account(userName = "Bob legenda", email = "Bob@Legenda.com", unReadMails = 9)
)