package pl.coderslab.charity.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid = UUID.randomUUID().toString();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof BaseEntity
                && Objects.equals(uuid, ((BaseEntity) o).uuid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
