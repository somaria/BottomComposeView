package com.example.bottomcomposeview

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import com.example.bottomcomposeview.NavigationItem.Home.label


sealed class NavigationItem(val route: String, val label: String, val icons: ImageVector) {
    object Home: NavigationItem(route = "home", label = "Home", Icons.Default.Home)
    object Notifications: NavigationItem(route = "notification", label = "Notification", Icons.Default.Notifications)
    object Settings: NavigationItem(route = "settings", label = "Settings", Icons.Default.Settings)

    //object accounts


}
