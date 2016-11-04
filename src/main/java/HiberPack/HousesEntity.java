package HiberPack;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Andre on 03.11.2016.
 */
@Entity
@Table(name = "houses", schema = "public", catalog = "Billing")
public class HousesEntity {
    private int id;
    private String address;
    private Integer floors;
    private Date buildYear;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "floors")
    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    @Basic
    @Column(name = "buildYear")
    public Date getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(Date buildYear) {
        this.buildYear = buildYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HousesEntity that = (HousesEntity) o;

        if (id != that.id) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (floors != null ? !floors.equals(that.floors) : that.floors != null) return false;
        if (buildYear != null ? !buildYear.equals(that.buildYear) : that.buildYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (floors != null ? floors.hashCode() : 0);
        result = 31 * result + (buildYear != null ? buildYear.hashCode() : 0);
        return result;
    }
}
