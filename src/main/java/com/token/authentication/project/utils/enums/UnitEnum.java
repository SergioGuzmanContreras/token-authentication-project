package com.token.authentication.project.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitEnum {

    MI("mi", "MILE"),
    KM("km", "KILÓMETRO"),
    M("m", "METRO"),
    YD("yd", "YARD"),
    FT("ft", "FOOT"),
    IN("in", "INCH"),
    CM("cm", "CENTIMETER"),
    MM("mm", "MILLIMETER"),
    T("t", "TON"),
    KG("kg", "KILOGRAM"),
    LB("lb", "POUND"),
    OZ("oz", "OUNCE"),
    G("g", "GRAM"),
    MG("mg", "MILLIGRAM"),
    L("L", "LITER"),
    ML("mL", "MILLILITER"),
    PZ("PZ", "PARTS");

    private String CODE;
    private String UNIT;

}
