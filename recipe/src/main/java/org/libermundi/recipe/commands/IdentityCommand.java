package org.libermundi.recipe.commands;

import lombok.*;

import javax.persistence.Transient;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public abstract class IdentityCommand {
    private Long id;

    @Transient
    private final String uuid = UUID.randomUUID().toString();

    private Date created;

    private Date updated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityCommand identity = (IdentityCommand) o;

        return id != null ? id.equals(identity.id) : uuid.equals(identity.uuid);
    }

    @Override
    public int hashCode() {
        return (id != null ? id.hashCode() : uuid.hashCode());
    }
}
