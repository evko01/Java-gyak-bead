package com.gyak_bead;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "uzenetek", schema = "gyakbead", catalog = "")
public class UzenetekEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @NotNull
    private long id;
    @Basic
    @Column(name = "tartalom")
    @NotNull
    private String tartalom;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    //@Override
    //public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;

        //UzenetekEntity that = (UzenetekEntity) o;

       // if (id != that.id) return false;
       // if (tartalom != null ? !tartalom.equals(that.tartalom) : that.tartalom != null) return false;

        //return true;


   // @Override
    //public int hashCode() {
       // int result = id;
        //result = 31 * result + (tartalom != null ? tartalom.hashCode() : 0);
        //return result;
   // }
}
