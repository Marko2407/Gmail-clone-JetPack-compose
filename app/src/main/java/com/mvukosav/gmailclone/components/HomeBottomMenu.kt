package com.mvukosav.gmailclone.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.mvukosav.gmailclone.models.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val menuItems = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )
    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        menuItems.forEach {
            BottomNavigationItem(
                selected = false,
                alwaysShowLabel = true,
                onClick = { /* TODO() */ },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) })
        }
    }
}
