package com.nomaditas.cv.view

import android.graphics.*
import com.squareup.picasso.Transformation

class CircleTransform: Transformation {
    override fun key(): String {
        return "CircleTransform"
    }

    override fun transform(source: Bitmap): Bitmap {
        val size = Math.min(source.width, source.height)
        val x = (source.width - size) / 2
        val y = (source.height - size) / 2

        val squareBitmap = Bitmap.createBitmap(source, x, y, size, size)
        if (squareBitmap !== source) {
            source.recycle()
        }

        val bitmap = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val paint = Paint()
        paint.shader = BitmapShader(squareBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
        paint.isAntiAlias = true

        val radius = size / 2f
        canvas.drawCircle(radius, radius, radius, paint)
        squareBitmap.recycle()
        return bitmap
    }
}