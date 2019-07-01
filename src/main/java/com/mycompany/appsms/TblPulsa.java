/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appsms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author khalila
 */
@Entity
@Table(name = "tbl_pulsa", catalog = "pulsa", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblPulsa.findAll", query = "SELECT t FROM TblPulsa t"),
    @NamedQuery(name = "TblPulsa.findByIdPulsa", query = "SELECT t FROM TblPulsa t WHERE t.idPulsa = :idPulsa"),
    @NamedQuery(name = "TblPulsa.findByNamaProduk", query = "SELECT t FROM TblPulsa t WHERE t.namaProduk = :namaProduk"),
    @NamedQuery(name = "TblPulsa.findByBesaran", query = "SELECT t FROM TblPulsa t WHERE t.besaran = :besaran"),
    @NamedQuery(name = "TblPulsa.findByHarga", query = "SELECT t FROM TblPulsa t WHERE t.harga = :harga"),
    @NamedQuery(name = "TblPulsa.findByStok", query = "SELECT t FROM TblPulsa t WHERE t.stok = :stok")})
public class TblPulsa implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pulsa")
    private Integer idPulsa;
    @Basic(optional = false)
    @Column(name = "nama_produk")
    private String namaProduk;
    @Basic(optional = false)
    @Column(name = "besaran")
    private String besaran;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public TblPulsa() {
    }

    public TblPulsa(Integer idPulsa) {
        this.idPulsa = idPulsa;
    }

    public TblPulsa(Integer idPulsa, String namaProduk, String besaran, int harga, int stok) {
        this.idPulsa = idPulsa;
        this.namaProduk = namaProduk;
        this.besaran = besaran;
        this.harga = harga;
        this.stok = stok;
    }

    public Integer getIdPulsa() {
        return idPulsa;
    }

    public void setIdPulsa(Integer idPulsa) {
        Integer oldIdPulsa = this.idPulsa;
        this.idPulsa = idPulsa;
        changeSupport.firePropertyChange("idPulsa", oldIdPulsa, idPulsa);
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        String oldNamaProduk = this.namaProduk;
        this.namaProduk = namaProduk;
        changeSupport.firePropertyChange("namaProduk", oldNamaProduk, namaProduk);
    }

    public String getBesaran() {
        return besaran;
    }

    public void setBesaran(String besaran) {
        String oldBesaran = this.besaran;
        this.besaran = besaran;
        changeSupport.firePropertyChange("besaran", oldBesaran, besaran);
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        int oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPulsa != null ? idPulsa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPulsa)) {
            return false;
        }
        TblPulsa other = (TblPulsa) object;
        if ((this.idPulsa == null && other.idPulsa != null) || (this.idPulsa != null && !this.idPulsa.equals(other.idPulsa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.appsms.TblPulsa[ idPulsa=" + idPulsa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
