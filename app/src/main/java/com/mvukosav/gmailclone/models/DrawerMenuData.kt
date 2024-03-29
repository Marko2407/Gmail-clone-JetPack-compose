package com.mvukosav.gmailclone.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AllInbox
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.outlined.Contacts
import androidx.compose.material.icons.outlined.Drafts
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.Label
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Outbox
import androidx.compose.material.icons.outlined.People
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Snooze
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material.icons.outlined.Tag
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {
    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All inbox"
    )
    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    object Social: DrawerMenuData(
        icon = Icons.Outlined.People,
        title = "Social"
    )
    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.Tag,
        title = "Promotions"
    )
    object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )
    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )
    object Important: DrawerMenuData(
        icon = Icons.Outlined.Label,
        title = "Important"
    )
    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )
    object Schedule: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Schedule"
    )
    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )
    object Drafts: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )
    object AllMail: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All mail"
    )
    object Calendar: DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )
    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    object Settings: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & feedback"
    )

    object Divider: DrawerMenuData(
        isDivider = true
    )

    object HeaderOne: DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )

    object HeaderTwo: DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )

}
