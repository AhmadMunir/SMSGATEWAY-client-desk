/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appsms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author khalila
 */
@Entity
@Table(name = "tbl_transaksi", catalog = "pulsa", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblTransaksi.findAll", query = "SELECT t FROM TblTransaksi t"),
    @NamedQuery(name = "TblTransaksi.findByIdTransaksi", query = "SELECT t FROM TblTransaksi t WHERE t.idTransaksi = :idTransaksi"),
    @NamedQuery(name = "TblTransaksi.findByNamaProduk", query = "SELECT t FROM TblTransaksi t WHERE t.namaProduk = :namaProduk"),
    @NamedQuery(name = "TblTransaksi.findByJenisProduk", query = "SELECT t FROM TblTransaksi t WHERE t.jenisProduk = :jenisProduk"),
    @NamedQuery(name = "TblTransaksi.findByNominal", query = "SELECT t FROM TblTransaksi t WHERE t.nominal = :nominal"),
    @NamedQuery(name = "TblTransaksi.findByNomor", query = "SELECT t FROM TblTransaksi t WHERE t.nomor = :nomor"),
    @NamedQuery(name = "TblTransaksi.findByWaktu", query = "SELECT t FROM TblTransaksi t WHERE t.waktu = :waktu"),
    @NamedQuery(name = "TblTransaksi.findByStatus", query = "SELECT t FROM TblTransaksi t WHERE t.status = :status"),
    @NamedQuery(name = "TblTransaksi.findByKeterangan", query = "SELECT t FROM TblTransaksi t WHERE t.keterangan = :keterangan")})
public class TblTransaksi implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transaksi")
    private Integer idTransaksi;
    @Basic(optional = false)
    @Column(name = "nama_produk")
    private String namaProduk;
    @Basic(optional = false)
    @Column(name = "jenis_produk")
    private String jenisProduk;
    @Basic(optional = false)
    @Column(name = "Nominal")
    private String nominal;
    @Basic(optional = false)
    @Column(name = "nomor")
    private String nomor;
    @Basic(optional = false)
    @Column(name = "waktu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktu;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Column(name = "keterangan")
    private String keterangan;

    public TblTransaksi() {
    }

    public TblTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public TblTransaksi(Integer idTransaksi, String namaProduk, String jenisProduk, String nominal, String nomor, Date waktu, String status) {
        this.idTransaksi = idTransaksi;
        this.namaProduk = namaProduk;
        this.jenisProduk = jenisProduk;
        this.nominal = nominal;
        this.nomor = nomor;
        this.waktu = waktu;
        this.status = status;
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        Integer oldIdTransaksi = this.idTransaksi;
        this.idTransaksi = idTransaksi;
        changeSupport.firePropertyChange("idTransaksi", oldIdTransaksi, idTransaksi);
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        String oldNamaProduk = this.namaProduk;
        this.namaProduk = namaProduk;
        changeSupport.firePropertyChange("namaProduk", oldNamaProduk, namaProduk);
    }

    public String getJenisProduk() {
        return jenisProduk;
    }

    public void setJenisProduk(String jenisProduk) {
        String oldJenisProduk = this.jenisProduk;
        this.jenisProduk = jenisProduk;
        changeSupport.firePropertyChange("jenisProduk", oldJenisProduk, jenisProduk);
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        String oldNominal = this.nominal;
        this.nominal = nominal;
        changeSupport.firePropertyChange("nominal", oldNominal, nominal);
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        String oldNomor = this.nomor;
        this.nomor = nomor;
        changeSupport.firePropertyChange("nomor", oldNomor, nomor);
    }

    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        Date oldWaktu = this.waktu;
        this.waktu = waktu;
        changeSupport.firePropertyChange("waktu", oldWaktu, waktu);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaksi != null ? idTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTransaksi)) {
            return false;
        }
        TblTransaksi other = (TblTransaksi) object;
        if ((this.idTransaksi == null && other.idTransaksi != null) || (this.idTransaksi != null && !this.idTransaksi.equals(other.idTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.appsms.TblTransaksi[ idTransaksi=" + idTransaksi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
