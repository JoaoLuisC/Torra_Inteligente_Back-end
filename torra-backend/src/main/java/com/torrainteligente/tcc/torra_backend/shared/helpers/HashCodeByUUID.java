package com.torrainteligente.tcc.torra_backend.shared.helpers;

import com.torrainteligente.tcc.torra_backend.shared.interfaces.UUIDTorraEntity;

public class HashCodeByUUID {
    public static int hashCode(UUIDTorraEntity entity) {
        return entity.getId() != null ? entity.getId().hashCode() : 0;
    }
}