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
@Table(name = "tbl_paket", catalog = "pulsa", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblPaket.findAll", query = "SELECT t FROM TblPaket t"),
    @NamedQuery(name = "TblPaket.findByIdPaket", query = "SELECT t FROM TblPaket t WHERE t.idPaket = :idPaket"),
    @NamedQuery(name = "TblPaket.findByNamaProduk", query = "SELECT t FROM TblPaket t WHERE t.namaProduk = :namaProduk"),
    @NamedQuery(name = "TblPaket.findByBesaran", query = "SELECT t FROM TblPaket t WHERE t.besaran = :besaran"),
    @NamedQuery(name = "TblPaket.findByHarga", query = "SELECT t FROM TblPaket t WHERE t.harga = :harga"),
    @NamedQuery(name = "TblPaket.findByStok", query = "SELECT t FROM TblPaket t WHERE t.stok = :stok")})
public class TblPaket implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paket")
    private Integer idPaket;
    @Basic(optional = false)
    @Column(name = "nama_produk")
    private String namaProduk;
    @Basic(optional = false)
    @Column(name = "besaran")
    private String besaran;
    @Basic(optional = false)
    @Column(name = "harga")
    private String harga;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public TblPaket() {
    }

    public TblPaket(Integer idPaket) {
        this.idPaket = idPaket;
    }

    public TblPaket(Integer idPaket, String namaProduk, String besaran, String harga, int stok) {
        this.idPaket = idPaket;
        this.namaProduk = namaProduk;
        this.besaran = besaran;
        this.harga = harga;
        this.stok = stok;
    }

    public Integer getIdPaket() {
        return idPaket;
    }

    public void setIdPaket(Integer idPaket) {
        Integer oldIdPaket = this.idPaket;
        this.idPaket = idPaket;
        changeSupport.firePropertyChange("idPaket", oldIdPaket, idPaket);
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

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        String oldHarga = this.harga;
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
        hash += (idPaket != null ? idPaket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPaket)) {
            return false;
        }
        TblPaket other = (TblPaket) object;
        if ((this.idPaket == null && other.idPaket != null) || (this.idPaket != null && !this.idPaket.equals(other.idPaket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.appsms.TblPaket[ idPaket=" + idPaket + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
