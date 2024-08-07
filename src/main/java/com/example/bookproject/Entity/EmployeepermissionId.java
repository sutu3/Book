package com.example.bookproject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EmployeepermissionId implements Serializable {
    private static final long serialVersionUID = 1457702838858800680L;
    @NotNull
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @NotNull
    @Column(name = "permission_id", nullable = false)
    private Integer permissionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeepermissionId entity = (EmployeepermissionId) o;
        return Objects.equals(this.permissionId, entity.permissionId) &&
                Objects.equals(this.employeeId, entity.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, employeeId);
    }

}