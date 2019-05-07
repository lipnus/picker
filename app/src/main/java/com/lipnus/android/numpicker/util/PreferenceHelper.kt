package com.lipnus.android.numpicker.util

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager


/**
 * 프레퍼런스 조작에 사용
 */
object PreferenceHelper {

    fun defaultPrefs(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    fun customPrefs(context: Context, name: String): SharedPreferences {
        return context.getSharedPreferences(name, Context.MODE_PRIVATE) //MODE_PRIVATE : app 내에서 사용할때
    }

    inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = this.edit()
        operation(editor)
        editor.apply()
    }
}
