package com.naomi.controller

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.graphics.Path
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo

class NaomiAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}

    fun scrollDown() {
        val path = Path().apply {
            moveTo(540f, 1500f)
            lineTo(540f, 600f)
        }
        val gesture = GestureDescription.Builder()
            .addStroke(GestureDescription.StrokeDescription(path, 0, 350))
            .build()
        dispatchGesture(gesture, null, null)
    }

    fun scrollUp() {
        val path = Path().apply {
            moveTo(540f, 600f)
            lineTo(540f, 1500f)
        }
        val gesture = GestureDescription.Builder()
            .addStroke(GestureDescription.StrokeDescription(path, 0, 350))
            .build()
        dispatchGesture(gesture, null, null)
    }

    fun clickText(label: String): Boolean {
        val root = rootInActiveWindow ?: return false
        val node = root.findAccessibilityNodeInfosByText(label).firstOrNull()
            ?: return false
        return node.performAction(AccessibilityNodeInfo.ACTION_CLICK)
    }
}
