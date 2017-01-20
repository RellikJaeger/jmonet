package com.defano.jmonet.model;

/**
 * An enumeration of paint tools.
 */
public enum PaintToolType {
    ARROW,
    PENCIL,
    RECTANGLE,
    ROUND_RECTANGLE,
    OVAL,
    PAINTBRUSH,
    ERASER,
    LINE,
    POLYGON,
    SHAPE,
    SELECTION,
    LASSO,
    TEXT,
    FILL,
    AIRBRUSH,
    CURVE,
    SLANT,
    ROTATE,
    MAGNIFIER;

    public boolean isShapeTool() {
        return  this == RECTANGLE       ||
                this == ROUND_RECTANGLE ||
                this == OVAL            ||
                this == POLYGON         ||
                this == SHAPE;
    }
}
