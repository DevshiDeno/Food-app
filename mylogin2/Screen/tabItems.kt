package com.example.mylogin2.Screen

import androidx.compose.runtime.Composable
import com.example.mylogin2.R

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Music : TabItem(R.drawable.ic_music, "clubbing", { MusicScreen() })
    object Movies : TabItem(R.drawable.ic_drinks, "Drinks", { MoviesScreen() })
    object Books : TabItem(R.drawable.ic_hotel, "Motel", { BooksScreen() })
}

