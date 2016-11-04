package HiberPack;

import javax.persistence.*;

/**
 * Created by Andre on 03.11.2016.
 */
@Entity
@Table(name = "apartments", schema = "public", catalog = "Billing")
public class ApartmentsEntity {
    private int id;
    private Integer houseId;
    private Integer number;
    private Double square;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "houseID")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "square")
    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApartmentsEntity that = (ApartmentsEntity) o;

        if (id != that.id) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (square != null ? !square.equals(that.square) : that.square != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (square != null ? square.hashCode() : 0);
        return result;
    }
}
