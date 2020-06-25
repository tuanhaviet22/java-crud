/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IT NEVA PC
 */
@Entity
@Table(name = "t_san_pham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPham.findAll", query = "SELECT s FROM SanPham s")
    , @NamedQuery(name = "SanPham.findById", query = "SELECT s FROM SanPham s WHERE s.id = :id")
    , @NamedQuery(name = "SanPham.findByName", query = "SELECT s FROM SanPham s WHERE s.name = :name")
    , @NamedQuery(name = "SanPham.findBySummary", query = "SELECT s FROM SanPham s WHERE s.summary = :summary")
    , @NamedQuery(name = "SanPham.findByPrice", query = "SELECT s FROM SanPham s WHERE s.price = :price")})
public class SanPham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "summary")
    private String summary;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;
    @JoinColumn(name = "danh_muc_id", referencedColumnName = "id")
    @ManyToOne
    private DanhMuc danhMucId;

    public SanPham() {
    }

    public SanPham(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public DanhMuc getDanhMucId() {
        return danhMucId;
    }

    public void setDanhMucId(DanhMuc danhMucId) {
        this.danhMucId = danhMucId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SanPham)) {
            return false;
        }
        SanPham other = (SanPham) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SanPham[ id=" + id + " ]";
    }
    
}
