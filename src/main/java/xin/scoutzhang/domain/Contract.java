package xin.scoutzhang.domain;

import java.util.Date;

/**
 * Created by DEAN on 2018/4/10.
 */
public class Contract {
    private String contractId;
    private String contractName;
    private String contractA;
    private String contractB;
    private String contractUrl;
    private Date date;

    public Contract() {
    }

    public Contract(String contractId, String contractName, String contractA, String contractB,
                    String contractUrl, Date date) {
        this.contractId = contractId;
        this.contractName = contractName;
        this.contractA = contractA;
        this.contractB = contractB;
        this.contractUrl = contractUrl;
        this.date = date;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractA() {
        return contractA;
    }

    public void setContractA(String contractA) {
        this.contractA = contractA;
    }

    public String getContractB() {
        return contractB;
    }

    public void setContractB(String contractB) {
        this.contractB = contractB;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", contractName='" + contractName + '\'' +
                ", contractA='" + contractA + '\'' +
                ", contractB='" + contractB + '\'' +
                ", contractUrl='" + contractUrl + '\'' +
                ", date=" + date +
                '}';
    }
}
