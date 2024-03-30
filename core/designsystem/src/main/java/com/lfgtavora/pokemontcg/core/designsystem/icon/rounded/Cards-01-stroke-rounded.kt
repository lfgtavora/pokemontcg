package com.lfgtavora.pokemontcg.core.designsystem.icon.rounded

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Icons.Rounded.Cards_stroke_rounded: ImageVector
    get() {
        if (`_cards-01-stroke-rounded` != null) {
            return `_cards-01-stroke-rounded`!!
        }
        `_cards-01-stroke-rounded` = Builder(
            name = "Cards-01-stroke-rounded", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 11.0f)
                curveTo(3.0f, 8.1716f, 3.0f, 6.7574f, 3.8787f, 5.8787f)
                curveTo(4.7574f, 5.0f, 6.1716f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(11.0f)
                curveTo(13.8284f, 5.0f, 15.2426f, 5.0f, 16.1213f, 5.8787f)
                curveTo(17.0f, 6.7574f, 17.0f, 8.1716f, 17.0f, 11.0f)
                verticalLineTo(16.0f)
                curveTo(17.0f, 18.8284f, 17.0f, 20.2426f, 16.1213f, 21.1213f)
                curveTo(15.2426f, 22.0f, 13.8284f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 22.0f, 4.7574f, 22.0f, 3.8787f, 21.1213f)
                curveTo(3.0f, 20.2426f, 3.0f, 18.8284f, 3.0f, 16.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0443f, 11.762f)
                lineTo(8.4274f, 11.3048f)
                curveTo(9.1562f, 10.4349f, 9.5206f, 10.0f, 10.0f, 10.0f)
                curveTo(10.4794f, 10.0f, 10.8438f, 10.4349f, 11.5726f, 11.3048f)
                lineTo(11.9556f, 11.762f)
                curveTo(12.6519f, 12.593f, 13.0f, 13.0086f, 13.0f, 13.5f)
                curveTo(13.0f, 13.9914f, 12.6519f, 14.407f, 11.9556f, 15.238f)
                lineTo(11.5726f, 15.6952f)
                curveTo(10.8438f, 16.5651f, 10.4794f, 17.0f, 10.0f, 17.0f)
                curveTo(9.5206f, 17.0f, 9.1562f, 16.5651f, 8.4274f, 15.6952f)
                lineTo(8.0443f, 15.238f)
                curveTo(7.3481f, 14.407f, 7.0f, 13.9914f, 7.0f, 13.5f)
                curveTo(7.0f, 13.0086f, 7.3481f, 12.593f, 8.0443f, 11.762f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.9244f, 19.0f)
                curveTo(18.0202f, 18.3874f, 18.3929f, 17.0406f, 19.1383f, 14.3469f)
                lineTo(20.1925f, 10.5375f)
                curveTo(20.938f, 7.8438f, 21.3107f, 6.4969f, 20.678f, 5.4359f)
                curveTo(20.0453f, 4.3748f, 18.6543f, 4.014f, 15.8724f, 3.2922f)
                lineTo(13.9052f, 2.7818f)
                curveTo(11.1232f, 2.0601f, 9.7323f, 1.6992f, 8.6364f, 2.3118f)
                curveTo(7.8562f, 2.7479f, 7.4426f, 3.5563f, 7.0f, 4.9579f)
            }
        }
            .build()
        return `_cards-01-stroke-rounded`!!
    }

private var `_cards-01-stroke-rounded`: ImageVector? = null
