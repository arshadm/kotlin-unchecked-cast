/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.arshadm.unchecked_cast

@Suppress("UNCHECKED_CAST")
fun <T, U : T> uncheckedCast(obj: T) = obj as U

val <T : Any> Class<T>.kotlinObjectInstance: T?
    get() {
        val field = try {
            getDeclaredField("INSTANCE")
        } catch (_: NoSuchFieldException) {
            null
        }
        return field?.let {
            if (it.type == this) {
                it.isAccessible = true

                uncheckedCast(it.get(null))
            } else {
                null
            }
        }
    }

class Library {
}
