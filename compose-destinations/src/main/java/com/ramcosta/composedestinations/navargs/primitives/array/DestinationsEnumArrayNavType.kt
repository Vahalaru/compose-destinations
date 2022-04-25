package com.ramcosta.composedestinations.navargs.primitives.array

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavBackStackEntry
import com.ramcosta.composedestinations.navargs.DestinationsNavType
import com.ramcosta.composedestinations.navargs.primitives.DECODED_NULL
import com.ramcosta.composedestinations.navargs.primitives.ENCODED_NULL

@Suppress("UNCHECKED_CAST")
class DestinationsEnumArrayNavType<E : Enum<*>>(
    private val converter: (List<String>) -> Array<E>
) : DestinationsNavType<Array<E>?>() {

    override fun put(bundle: Bundle, key: String, value: Array<E>?) {
        bundle.putSerializable(key, value)
    }

    override fun get(bundle: Bundle, key: String): Array<E>? {
        return bundle.getSerializable(key) as Array<E>?
    }

    override fun parseValue(value: String): Array<E>? {
        if (value == DECODED_NULL) return null

        return converter(value.split(","))
    }

    override fun serializeValue(value: Array<E>?): String {
        if (value == null) return ENCODED_NULL
        return value.joinToString(",") { it.name }
    }

    override fun get(navBackStackEntry: NavBackStackEntry, key: String): Array<E>? {
        return navBackStackEntry.arguments?.getSerializable(key) as Array<E>?
    }

    override fun get(savedStateHandle: SavedStateHandle, key: String): Array<E>? {
        return savedStateHandle.get<Array<E>?>(key)
    }

}