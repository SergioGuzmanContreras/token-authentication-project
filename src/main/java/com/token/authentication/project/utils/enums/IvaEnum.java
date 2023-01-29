package com.token.authentication.project.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IvaEnum {

    IVA_16(16),
    IVA_8(8),
    IVA_0(0);

    private Integer iva;
}
