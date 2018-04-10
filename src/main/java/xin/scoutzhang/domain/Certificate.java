package xin.scoutzhang.domain;

import java.util.Date;

/**
 * Created by DEAN on 2018/4/10.
 */
public class Certificate {
    private String certificateId;
    private String fingerprint;
    private String contractId;
    private String userId;
    private Date date;
    private String treeId;
    private int treePos;

    public Certificate() {
    }

    public Certificate(String certificateId, String fingerprint, String contractId, String userId, Date date,
                       String treeId, int treePos) {
        this.certificateId = certificateId;
        this.fingerprint = fingerprint;
        this.contractId = contractId;
        this.userId = userId;
        this.date = date;
        this.treeId = treeId;
        this.treePos = treePos;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    public int getTreePos() {
        return treePos;
    }

    public void setTreePos(int treePos) {
        this.treePos = treePos;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateId='" + certificateId + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", contractId='" + contractId + '\'' +
                ", userId='" + userId + '\'' +
                ", date=" + date +
                ", treeId='" + treeId + '\'' +
                ", treePos=" + treePos +
                '}';
    }
}
