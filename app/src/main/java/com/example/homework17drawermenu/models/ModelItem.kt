package com.example.homework17drawermenu.models

import android.graphics.Color
import com.example.homework17drawermenu.R
import com.example.homework17drawermenu.enums.MenuTypes

data class ModelItem(
    val title: String,
    val icon: Int,
    val menuType: MenuTypes,
    val badgeCount: Int? = null,
    val badgeColor: Int = Color.WHITE,
)
val menuList = listOf(
    ModelItem("Dashboard", R.drawable.dashboard, MenuTypes.DASHBOARD),
    ModelItem("Pensas", R.drawable.mail, MenuTypes.PENSAS, 15, Color.RED),
    ModelItem("Notifikasi", R.drawable.notification, MenuTypes.NOTIFIKASI, 20, Color.GREEN),
    ModelItem("Kalendar", R.drawable.calendar, MenuTypes.KALENDAR),
    ModelItem("Statistikasi", R.drawable.statistic, MenuTypes.STATISKASI),
    ModelItem("Pengaturan", R.drawable.settings, MenuTypes.PENGATURAN),
)