package ruoque.crm.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by liangyu on 9/23/15.
 */
@Entity
@Table(name="crm_house")
public class House {
    @Id
    @GeneratedValue
    private int id;

    private String building;

    private String unit;

    private String room;

    private BigDecimal area;

    private BigDecimal afterExtenArea;

    private String household;

    private Date created_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public BigDecimal getAfterExtenArea() {
        return afterExtenArea;
    }

    public void setAfterExtenArea(BigDecimal afterExtenArea) {
        this.afterExtenArea = afterExtenArea;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
