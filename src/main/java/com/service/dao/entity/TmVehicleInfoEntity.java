package com.service.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/1/5.
 */
@Entity
@Table(name = "tm_vehicle_info", schema = "rmpsdb_che", catalog = "")
public class TmVehicleInfoEntity {
    private int id;
    private String org;
    private String appNo;
    private String vehicleCompany;
    private String vehicleBrand;
    private String vehicleModel;
    private BigDecimal vehicleUsage;
    private String plateNbr;
    private String transferTimes;
    private String vinNo;
    private String engineNo;
    private String firstBuyTime;
    private String vehiclePicInd;
    private String vehicleCompanyCode;
    private String vehicleBrandCode;
    private String vehicleModelCode;
    private Integer gpsCount;
    private BigDecimal gpsPrice;
    private String vehicleOtherBrand;
    private String vehicleOldMaster;
    private String vehicleType;
    private String vehicleLevel;
    private String mortgageCity;
    private String displacement;
    private String mortgageCityName;
    private String vehicleName;
    private String carNbr;
    private String productYear;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Basic
    @Column(name = "APP_NO")
    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    @Basic
    @Column(name = "VEHICLE_COMPANY")
    public String getVehicleCompany() {
        return vehicleCompany;
    }

    public void setVehicleCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
    }

    @Basic
    @Column(name = "VEHICLE_BRAND")
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    @Basic
    @Column(name = "VEHICLE_MODEL")
    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Basic
    @Column(name = "VEHICLE_USAGE")
    public BigDecimal getVehicleUsage() {
        return vehicleUsage;
    }

    public void setVehicleUsage(BigDecimal vehicleUsage) {
        this.vehicleUsage = vehicleUsage;
    }

    @Basic
    @Column(name = "PLATE_NBR")
    public String getPlateNbr() {
        return plateNbr;
    }

    public void setPlateNbr(String plateNbr) {
        this.plateNbr = plateNbr;
    }

    @Basic
    @Column(name = "TRANSFER_TIMES")
    public String getTransferTimes() {
        return transferTimes;
    }

    public void setTransferTimes(String transferTimes) {
        this.transferTimes = transferTimes;
    }

    @Basic
    @Column(name = "VIN_NO")
    public String getVinNo() {
        return vinNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }

    @Basic
    @Column(name = "ENGINE_NO")
    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    @Basic
    @Column(name = "FIRST_BUY_TIME")
    public String getFirstBuyTime() {
        return firstBuyTime;
    }

    public void setFirstBuyTime(String firstBuyTime) {
        this.firstBuyTime = firstBuyTime;
    }

    @Basic
    @Column(name = "VEHICLE_PIC_IND")
    public String getVehiclePicInd() {
        return vehiclePicInd;
    }

    public void setVehiclePicInd(String vehiclePicInd) {
        this.vehiclePicInd = vehiclePicInd;
    }

    @Basic
    @Column(name = "VEHICLE_COMPANY_CODE")
    public String getVehicleCompanyCode() {
        return vehicleCompanyCode;
    }

    public void setVehicleCompanyCode(String vehicleCompanyCode) {
        this.vehicleCompanyCode = vehicleCompanyCode;
    }

    @Basic
    @Column(name = "VEHICLE_BRAND_CODE")
    public String getVehicleBrandCode() {
        return vehicleBrandCode;
    }

    public void setVehicleBrandCode(String vehicleBrandCode) {
        this.vehicleBrandCode = vehicleBrandCode;
    }

    @Basic
    @Column(name = "VEHICLE_MODEL_CODE")
    public String getVehicleModelCode() {
        return vehicleModelCode;
    }

    public void setVehicleModelCode(String vehicleModelCode) {
        this.vehicleModelCode = vehicleModelCode;
    }

    @Basic
    @Column(name = "GPS_COUNT")
    public Integer getGpsCount() {
        return gpsCount;
    }

    public void setGpsCount(Integer gpsCount) {
        this.gpsCount = gpsCount;
    }

    @Basic
    @Column(name = "GPS_PRICE")
    public BigDecimal getGpsPrice() {
        return gpsPrice;
    }

    public void setGpsPrice(BigDecimal gpsPrice) {
        this.gpsPrice = gpsPrice;
    }

    @Basic
    @Column(name = "VEHICLE_OTHER_BRAND")
    public String getVehicleOtherBrand() {
        return vehicleOtherBrand;
    }

    public void setVehicleOtherBrand(String vehicleOtherBrand) {
        this.vehicleOtherBrand = vehicleOtherBrand;
    }

    @Basic
    @Column(name = "VEHICLE_OLD_MASTER")
    public String getVehicleOldMaster() {
        return vehicleOldMaster;
    }

    public void setVehicleOldMaster(String vehicleOldMaster) {
        this.vehicleOldMaster = vehicleOldMaster;
    }

    @Basic
    @Column(name = "VEHICLE_TYPE")
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Basic
    @Column(name = "VEHICLE_LEVEL")
    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    @Basic
    @Column(name = "MORTGAGE_CITY")
    public String getMortgageCity() {
        return mortgageCity;
    }

    public void setMortgageCity(String mortgageCity) {
        this.mortgageCity = mortgageCity;
    }

    @Basic
    @Column(name = "DISPLACEMENT")
    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    @Basic
    @Column(name = "MORTGAGE_CITY_NAME")
    public String getMortgageCityName() {
        return mortgageCityName;
    }

    public void setMortgageCityName(String mortgageCityName) {
        this.mortgageCityName = mortgageCityName;
    }

    @Basic
    @Column(name = "VEHICLE_NAME")
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Basic
    @Column(name = "CAR_NBR")
    public String getCarNbr() {
        return carNbr;
    }

    public void setCarNbr(String carNbr) {
        this.carNbr = carNbr;
    }

    @Basic
    @Column(name = "PRODUCT_YEAR")
    public String getProductYear() {
        return productYear;
    }

    public void setProductYear(String productYear) {
        this.productYear = productYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmVehicleInfoEntity that = (TmVehicleInfoEntity) o;

        if (id != that.id) return false;
        if (org != null ? !org.equals(that.org) : that.org != null) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (vehicleCompany != null ? !vehicleCompany.equals(that.vehicleCompany) : that.vehicleCompany != null)
            return false;
        if (vehicleBrand != null ? !vehicleBrand.equals(that.vehicleBrand) : that.vehicleBrand != null) return false;
        if (vehicleModel != null ? !vehicleModel.equals(that.vehicleModel) : that.vehicleModel != null) return false;
        if (vehicleUsage != null ? !vehicleUsage.equals(that.vehicleUsage) : that.vehicleUsage != null) return false;
        if (plateNbr != null ? !plateNbr.equals(that.plateNbr) : that.plateNbr != null) return false;
        if (transferTimes != null ? !transferTimes.equals(that.transferTimes) : that.transferTimes != null)
            return false;
        if (vinNo != null ? !vinNo.equals(that.vinNo) : that.vinNo != null) return false;
        if (engineNo != null ? !engineNo.equals(that.engineNo) : that.engineNo != null) return false;
        if (firstBuyTime != null ? !firstBuyTime.equals(that.firstBuyTime) : that.firstBuyTime != null) return false;
        if (vehiclePicInd != null ? !vehiclePicInd.equals(that.vehiclePicInd) : that.vehiclePicInd != null)
            return false;
        if (vehicleCompanyCode != null ? !vehicleCompanyCode.equals(that.vehicleCompanyCode) : that.vehicleCompanyCode != null)
            return false;
        if (vehicleBrandCode != null ? !vehicleBrandCode.equals(that.vehicleBrandCode) : that.vehicleBrandCode != null)
            return false;
        if (vehicleModelCode != null ? !vehicleModelCode.equals(that.vehicleModelCode) : that.vehicleModelCode != null)
            return false;
        if (gpsCount != null ? !gpsCount.equals(that.gpsCount) : that.gpsCount != null) return false;
        if (gpsPrice != null ? !gpsPrice.equals(that.gpsPrice) : that.gpsPrice != null) return false;
        if (vehicleOtherBrand != null ? !vehicleOtherBrand.equals(that.vehicleOtherBrand) : that.vehicleOtherBrand != null)
            return false;
        if (vehicleOldMaster != null ? !vehicleOldMaster.equals(that.vehicleOldMaster) : that.vehicleOldMaster != null)
            return false;
        if (vehicleType != null ? !vehicleType.equals(that.vehicleType) : that.vehicleType != null) return false;
        if (vehicleLevel != null ? !vehicleLevel.equals(that.vehicleLevel) : that.vehicleLevel != null) return false;
        if (mortgageCity != null ? !mortgageCity.equals(that.mortgageCity) : that.mortgageCity != null) return false;
        if (displacement != null ? !displacement.equals(that.displacement) : that.displacement != null) return false;
        if (mortgageCityName != null ? !mortgageCityName.equals(that.mortgageCityName) : that.mortgageCityName != null)
            return false;
        if (vehicleName != null ? !vehicleName.equals(that.vehicleName) : that.vehicleName != null) return false;
        if (carNbr != null ? !carNbr.equals(that.carNbr) : that.carNbr != null) return false;
        if (productYear != null ? !productYear.equals(that.productYear) : that.productYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (org != null ? org.hashCode() : 0);
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (vehicleCompany != null ? vehicleCompany.hashCode() : 0);
        result = 31 * result + (vehicleBrand != null ? vehicleBrand.hashCode() : 0);
        result = 31 * result + (vehicleModel != null ? vehicleModel.hashCode() : 0);
        result = 31 * result + (vehicleUsage != null ? vehicleUsage.hashCode() : 0);
        result = 31 * result + (plateNbr != null ? plateNbr.hashCode() : 0);
        result = 31 * result + (transferTimes != null ? transferTimes.hashCode() : 0);
        result = 31 * result + (vinNo != null ? vinNo.hashCode() : 0);
        result = 31 * result + (engineNo != null ? engineNo.hashCode() : 0);
        result = 31 * result + (firstBuyTime != null ? firstBuyTime.hashCode() : 0);
        result = 31 * result + (vehiclePicInd != null ? vehiclePicInd.hashCode() : 0);
        result = 31 * result + (vehicleCompanyCode != null ? vehicleCompanyCode.hashCode() : 0);
        result = 31 * result + (vehicleBrandCode != null ? vehicleBrandCode.hashCode() : 0);
        result = 31 * result + (vehicleModelCode != null ? vehicleModelCode.hashCode() : 0);
        result = 31 * result + (gpsCount != null ? gpsCount.hashCode() : 0);
        result = 31 * result + (gpsPrice != null ? gpsPrice.hashCode() : 0);
        result = 31 * result + (vehicleOtherBrand != null ? vehicleOtherBrand.hashCode() : 0);
        result = 31 * result + (vehicleOldMaster != null ? vehicleOldMaster.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (vehicleLevel != null ? vehicleLevel.hashCode() : 0);
        result = 31 * result + (mortgageCity != null ? mortgageCity.hashCode() : 0);
        result = 31 * result + (displacement != null ? displacement.hashCode() : 0);
        result = 31 * result + (mortgageCityName != null ? mortgageCityName.hashCode() : 0);
        result = 31 * result + (vehicleName != null ? vehicleName.hashCode() : 0);
        result = 31 * result + (carNbr != null ? carNbr.hashCode() : 0);
        result = 31 * result + (productYear != null ? productYear.hashCode() : 0);
        return result;
    }
}
