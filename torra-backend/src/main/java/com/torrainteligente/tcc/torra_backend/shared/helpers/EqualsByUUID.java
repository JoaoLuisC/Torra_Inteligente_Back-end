package com.torrainteligente.tcc.torra_backend.shared.helpers;

import com.torrainteligente.tcc.torra_backend.shared.interfaces.UUIDTorraEntity;

public class EqualsByUUID {
    public static boolean equals(UUIDTorraEntity entity, Object o) {
        if (entity == o) return true;
        if (o == null || entity.getClass() != o.getClass()) return false;
        UUIDTorraEntity that = (UUIDTorraEntity) o;
        return entity.getId() != null && entity.getId().equals(that.getId());
    }
}